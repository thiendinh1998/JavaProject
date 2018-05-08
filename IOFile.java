package Controller;

import Model.ChuDe;
import Model.DuLieu;
import Model.TuVung;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * class : quản lí đọc đầu vào
 * author Dinh Tran
 */
public class IOFile {

    /**
     * lấy tên chủ đề nạp vào dữ liệu
     */
    public final static String path = "Data\\";
    public static void inputChuDe(DuLieu data) {
        File file = new File(path + "listTopic.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                ChuDe temp = new ChuDe();
                temp.setTenChuDe(sc.nextLine());
                temp.setLinkFile(path + sc.nextLine());
                data.addChuDe(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("có lỗi");
        }
    }

    /**
     * lấy từ vựng nạp vào chủ đề , rồi nạp vào dữ liệu
     *
     * @param data
     */
    public static void inputTuVung(DuLieu data) {
        for (int i = 0; i < data.getSoLuongChuDe(); i++) {
            File file = new File(data.getDanhSachChuDe().get(i).getLinkFile());
            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNext()) {
                    TuVung temp = new TuVung();
                    temp.setTenTu(sc.nextLine());
                    temp.setPhienAm(sc.nextLine());
                    temp.setTuLoai(sc.nextLine());
                    temp.setNghia(sc.nextLine());
                    temp.setLinkImage(path + "image\\" + sc.nextLine());
                    data.getDanhSachChuDe().get(i).addTu(temp);
                }
            } catch (FileNotFoundException e) {
            }
        }
    }

}

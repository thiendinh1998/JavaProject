package Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * author 
 */
public class DuLieu {

    private ArrayList<ChuDe> danhSachChuDe = new ArrayList(); // danh sách các chủ đề
    private int soLuongChuDe; // số lượng chủ đề

    public DuLieu() {
    }

    /**
     * lấy số lượng chủ đề
     *
     * @param soLuongChuDe
     */
    public DuLieu(int soLuongChuDe) {
        this.soLuongChuDe = soLuongChuDe;
    }

    /**
     * lấy danh sách chủ đề
     *
     * @return danh sách chủ đề
     */
    public ArrayList<ChuDe> getDanhSachChuDe() {
        return danhSachChuDe;
    }

    /**
     * thiết lập danh sách chủ đề
     *
     * @param danhSachChuDe
     */
    public void setDanhSachChuDe(ArrayList<ChuDe> danhSachChuDe) {
        this.danhSachChuDe = danhSachChuDe;
    }

    /**
     * lấy số lượng chủ đề
     *
     * @return số lượng chủ đề
     */
    public int getSoLuongChuDe() {
        return soLuongChuDe;
    }

    /**
     * thiết lập số lượng chủ đề
     *
     * @param soLuongChuDe
     */
    public void setSoLuongChuDe(int soLuongChuDe) {
        this.soLuongChuDe = soLuongChuDe;
    }

    /**
     * thêm 1 chủ đề vào dữ liệu
     *
     * @param ChuDeMoi
     */
    public void addChuDe(ChuDe ChuDeMoi) {
        danhSachChuDe.add(ChuDeMoi);
        soLuongChuDe++;
    }

    /**
     * nhập txt
     *
     * @param path
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void inputFileExcel(String path) throws FileNotFoundException, IOException {
        // đưa dữ liệu từ 1 file excel vào dữ liệu trong java
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        for (int i = 0; i <= workbook.getNumberOfSheets(); i++) {
            String tenChuDe = workbook.getSheetName(i);
            String linkFile = workbook.getSheetName(i) + ".txt";
            File listTopic = new File("listTopic.txt");
            ChuDe temp = new ChuDe();
            temp.setTenChuDe(tenChuDe);
            temp.setLinkFile(linkFile);

            FileWriter fwTopic = new FileWriter(listTopic.getAbsoluteFile(), true);
            BufferedWriter bwTopic = new BufferedWriter(fwTopic);
            bwTopic.newLine();
            bwTopic.write(tenChuDe);
            bwTopic.newLine();
            bwTopic.write(linkFile);
            bwTopic.close();
            fwTopic.close();
            // tạo 1 file chủ đề mới và mở nó ra
            File f = new File(workbook.getSheetName(i) + ".txt");
            f.createNewFile();
            FileWriter fwWord = new FileWriter(f.getAbsoluteFile(), true);
            BufferedWriter bwWord = new BufferedWriter(fwWord);
            // biến dùng để fix lỗi
            int first = 1;
            for (Row row : workbook.getSheetAt(i)) {
                // ghi dữ liệu vào file chủ đề mới được tạo từ sheet name
                String tenTu = row.getCell(0).getStringCellValue();
                String phienAm = row.getCell(1).getStringCellValue();
                String tuLoai = row.getCell(2).getStringCellValue();
                String nghia = row.getCell(3).getStringCellValue();
                String linkImage = row.getCell(4).getStringCellValue();

                if (first == 2) {
                    bwWord.newLine();
                }
                bwWord.write(tenTu);
                bwWord.newLine();
                bwWord.write(phienAm);
                bwWord.newLine();
                bwWord.write(tuLoai);
                bwWord.newLine();
                bwWord.write(nghia);
                bwWord.newLine();
                bwWord.write(linkImage);

                first = 2;
                // nạp dữ liệu mới cho java đang chạy
                TuVung tmp = new TuVung(row.getCell(0).getStringCellValue(),
                        row.getCell(1).getStringCellValue(),
                        row.getCell(2).getStringCellValue(),
                        row.getCell(3).getStringCellValue(),
                        row.getCell(4).getStringCellValue());

                temp.addTu(tmp);
            }
            bwWord.close();
            fwWord.close();
            BienToanCuc.duLieu1.addChuDe(temp);
        }
    }
}

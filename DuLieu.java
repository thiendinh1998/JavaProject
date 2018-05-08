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
 * author Dinh Tran
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
}

package Model;

import java.util.ArrayList;

/**
 * class : quản lí các chủ đề 
 * author Dinh Tran
 */
public class ChuDe {

    private ArrayList<TuVung> danhSachTu = new ArrayList(); // tạo 1 danh sách từ
    private String tenChuDe; // tạo tên chủ đề
    private int soLuongTu; // tổng số từ trong chủ đề
    private String linkFile; // link tìm đến file chủ đề

    public ChuDe() {
    }

    /**
     * hàm khởi tạo 1 chủ đề
     *
     * @param tenChuDe
     * @param linkFile
     * @param soLuongTu
     */
    public ChuDe(String tenChuDe, String linkFile, int soLuongTu) {
        this.tenChuDe = tenChuDe;
        this.soLuongTu = soLuongTu;
        this.linkFile = linkFile;
    }

    /**
     * lấy danh sách từ
     *
     * @return danh sách từ
     */
    public ArrayList<TuVung> getDanhSachTu() {
        return danhSachTu;
    }

    /**
     * thiết lập danh sách từ
     *
     * @param danhSachTu
     */
    public void setDanhSachTu(ArrayList<TuVung> danhSachTu) {
        this.danhSachTu = danhSachTu;
    }

    /**
     * lấy tên chủ đề
     *
     * @return tên chủ đề
     */
    public String getTenChuDe() {
        return tenChuDe;
    }

    /**
     * thiết lập tên chủ đề
     *
     * @param tenChuDe
     */
    public void setTenChuDe(String tenChuDe) {
        this.tenChuDe = tenChuDe;
    }

    /**
     * lấy số lượng từ
     *
     * @return số lượng từ
     */
    public int getSoLuongTu() {
        return soLuongTu;
    }

    /**
     * thiết lập số lượng từ
     *
     * @param soLuongTu
     */
    public void setSoLuongTu(int soLuongTu) {
        this.soLuongTu = soLuongTu;
    }

    /**
     * lấy đường dẫn file
     *
     * @return đường dẫn file
     */
    public String getLinkFile() {
        return linkFile;
    }

    /**
     * thiết lập đường dẫn file
     *
     * @param linkFile
     */
    public void setLinkFile(String linkFile) {
        this.linkFile = linkFile;
    }

    /**
     * thêm 1 từ vào chủ đề
     *
     * @param tuMoi
     */
    public void addTu(TuVung tuMoi) {
        danhSachTu.add(tuMoi);
        soLuongTu++;
    }

}

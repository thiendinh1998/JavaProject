package Model;

/**
 * class : đại diện quản lí từ vựng 
 * author Dinh Tran
 */
public class TuVung {

    private String tenTu;       // tên từ
    private String nghia;       // nghĩa
    private String tuLoai;      // loại từ
    private String phienAm;     // phiên âm
    private String linkImage;   // link ảnh
    private String timeLearn;   // thời gian học

    public TuVung() {
    }

    /**
     * hàm tạo 1 từ vựng mới
     *
     * @param tenTu
     * @param nghia
     * @param tuLoai
     * @param phienAm
     * @param linkImage
     */
    public TuVung(String tenTu, String nghia, String tuLoai, String phienAm, String linkImage) {
        this.tenTu = tenTu;
        this.nghia = nghia;
        this.tuLoai = tuLoai;
        this.phienAm = phienAm;
        this.linkImage = linkImage;
    }

    /**
     * lấy tên từ
     *
     * @return từ
     */
    public String getTenTu() {
        return tenTu;
    }

    /**
     * thiết lâp tên từ
     *
     * @param tenTu
     */
    public void setTenTu(String tenTu) {
        this.tenTu = tenTu;
    }

    /**
     * lấy nghĩa của từ
     *
     * @return nghĩa của từ
     */
    public String getNghia() {
        return nghia;
    }

    /**
     * thiết lập nghĩa cho từ
     *
     * @param nghia
     */
    public void setNghia(String nghia) {
        this.nghia = nghia;
    }

    /**
     * lấy loại từ
     *
     * @return (n),(v) ...
     */
    public String getTuLoai() {
        return tuLoai;
    }

    /**
     * thiết lập loại từ
     *
     * @param tuLoai
     */
    public void setTuLoai(String tuLoai) {
        this.tuLoai = tuLoai;
    }

    /**
     * lấy phiên âm
     *
     * @return phiên âm của từ
     */
    public String getPhienAm() {
        return phienAm;
    }

    /**
     * thiết lập phiên âm cho từ
     *
     * @param phienAm
     */
    public void setPhienAm(String phienAm) {
        this.phienAm = phienAm;
    }

    /**
     * lấy ảnh
     *
     * @return link ảnh
     */
    public String getLinkImage() {
        return linkImage;
    }

    /**
     * thiết lập link ảnh
     *
     * @param linkImage
     */
    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    /**
     * lấy thời gian học từ
     *
     * @return thời gian
     */
    public String getTimeLearn() {
        return timeLearn;
    }

    /**
     * thiết lập thời gian học từ
     *
     * @param timeLearn
     */
    public void setTimeLearn(String timeLearn) {
        this.timeLearn = timeLearn;
    }

}

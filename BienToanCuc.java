package Model;

import Controller.IOFile;
import java.io.IOException;

/**
 * class : quản lí dữ liệu cơ bản 
 * author Dinh Tran
 */
public class BienToanCuc {

    // khởi tạo dữ liệu cơ bản
    public static DuLieu duLieu1 = new DuLieu();

    public static void main(String[] args) throws IOException {
        IOFile.inputChuDe(duLieu1);
        IOFile.inputTuVung(duLieu1);
    }
}

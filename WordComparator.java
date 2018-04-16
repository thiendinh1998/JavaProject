package View;

import Model.TuVung;
import java.util.Comparator;

/**
 * class: hàm sắp xếp các từ trong 1 ArrayList
 */
class WordComparator implements Comparator<TuVung> {  
    /**
     * sắp xếp 2 từ vựng theo tên
     * @param s1
     * @param s2
     * @return 2 từ đã sắp xếp
     */
    @Override
    public int compare(TuVung s1,TuVung s2) {  
        return s1.getTenTu().compareTo(s2.getTenTu());  
        } 
}

package method;

import entity.Student;
import java.util.Comparator;

class sortbypoint implements Comparator {
    sortbypoint(Distribution var1) {
    }

    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        float temp1 = s1.getComposite();
        float temp2 = s2.getComposite();
        if (temp1 < temp2) {
            return 1;
        } else {
            return temp1 == temp2 ? 0 : -1;
        }
    }
}

package College;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Section {
    Student studclass;
    String section;
   LinkedList<Student> sectionobj=new LinkedList<>();

    public Student getStudclass() {
        return studclass;
    }

    public void setStudclass(Student studclass) {
        this.studclass = studclass;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}

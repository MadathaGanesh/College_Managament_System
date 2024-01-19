package College;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Branch {
    String branchname;
    Section sessionclass;
    LinkedList<Section> branchobj=new LinkedList<>();

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public Section getSessionclass() {
        return sessionclass;
    }

    public void setSessionclass(Section sessionclass) {
        this.sessionclass = sessionclass;
    }


}

import java.util.*;

public class StringLister {
    String[] names = {"Sam", "Ada", "Tom", "Dick"};

    public StringLister(String[] moreNames) {
        //Vector<String> list = new Vector<String>();
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0;i<names.length;i++) {
            list.add(names[i]);
        }

        for(int i = 0; i < moreNames.length; i++) {
            list.add(moreNames[i]);
        }

        Collections.sort(list);

        for(String name: list) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        StringLister lister = new StringLister(args);
    }
}

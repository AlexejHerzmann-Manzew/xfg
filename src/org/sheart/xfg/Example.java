
package org.sheart.xfg;

import java.io.File;
import java.io.FileNotFoundException;

public class Example{
    public static void main(String[] args) throws FileNotFoundException {
        XFG xfg = new XFG(new File("old.xfg"));
        System.out.println(xfg.get("integerParameter").getInteger());
        System.out.println(xfg.get("smartParameter").get("subparameter").getString());
        xfg.get("smartParameter").set("newParameter", 10.5f);
        File file = new File("new.xfg");
        if(file.exists()){
            file.delete();
        }
        xfg.writeToFile(file);
    }
}

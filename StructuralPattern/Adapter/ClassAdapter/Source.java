package Adapter.ClassAdapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//待适配的类
public class Source {
    private final static Log logger = LogFactory.getLog(Source.class);

    public void editTextFile() {
        logger.info("a test file editing");
        System.out.println("a test file editing");
    }
}

package Proxy;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements Company {

    private HR hr;

    public Proxy() {
        super();
        this.hr = new HR();
    }

    private String getWorker(String title) {
        Map<String, String> workerList = new HashMap<String, String>() {
            {
                put("Java", "zhangsan");
                put("Python", "lisi");
                put("PHP", "wangwu");
            }
        };
        return workerList.get(title);
    }

    @Override
    public void findWorker(String title) {
        hr.findWorker(title);
        String worker = getWorker(title);
        System.out.println("Get worker:" + worker);
    }
}

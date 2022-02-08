package Template;

public abstract class AbstractTemplate {

    //模版方法
    public void templateMethod() {
        checkNumber();
        queueUp();
        handleBusiness();
        serviceEvaluation();
    }

    public void checkNumber() { // 1. 抽号
        System.out.println("checkNumber....");
    }

    public void queueUp() { // 2. 排队
        System.out.println("queue up...");
    }

    //3. 业务办理
    public abstract void handleBusiness();

    public void serviceEvaluation() { // 4. 服务评价
        System.out.println("busniess finished,service evaluation...");
    }
}

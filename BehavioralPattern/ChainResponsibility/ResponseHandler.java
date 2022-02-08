package ChainResponsibility;

public class ResponseHandler extends AbstractHandler implements Handler {

    private String name;

    public ResponseHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("response handler");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}

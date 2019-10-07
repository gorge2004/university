package Model;

public class ClassRoom extends Room {




    @Override
    public void open() {
        String message = this.isOpen() ? "Welcome" : "SsssHHH!!. we are taking class.!";
        System.out.println(message);
    }
}

import java.awt.*;

public class Main {

    public static void main(String[] args){
        Frame f = new Frame("Testing");
        Button btn = new Button("Click");
        f.setLayout(new FlowLayout());
        f.setSize(500,500);
        f.setVisible(true);
    }
}
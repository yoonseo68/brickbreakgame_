import javax.swing.*;
import java.awt.*;

public class AnimationManager {
    public static void main(String[] args) {    // main()
        int box_width = 480;
        int box_height = 720;

        Box box = new Box(box_width, box_height);
        Pedal Pd = new Pedal(150, 170, 20);
        Ball MB = new Ball(0, 0, 10, box, Pd);

        BoxWriter BoW = new BoxWriter(box);
        PedalWriter PeW = new PedalWriter(Pd, box);
        BallWriter BaW = new BallWriter(MB, Color.white);
        BrickWriter BrW = new BrickWriter();

        AnimationWriter AW = new AnimationWriter(BoW, BaW, PeW, BrW, box_width, box_height);

        BounceController BC = new BounceController(MB, AW, Pd);

        // Difficulty
        DifficultyFrame DF = new DifficultyFrame(AW, MB, box);

        // Main
        MainFrame MF = new MainFrame(DF, box);

        BC.runAnimation();


    }
}
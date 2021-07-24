import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import javafx.stage.Stage;

public class ShapeDrafter extends Application{
    public int Couleur;

    public ShapeDrafter(){}
    
    public ShapeDrafter(int couleur){
        Couleur = couleur;
    }
    public Color setColor(){
        Color m_color = Color.BLACK;
        switch(Couleur){
            case 1: m_color = Color.GREEN;
            break;
            case 2: m_color = Color.BLUE;
            break;
            case 3: m_color = Color.RED;
            break;
            default: m_color = Color.YELLOW;
            break;
        }
        return m_color;
    }
    public void start(Stage primaryStage)throws Exception{
        

        primaryStage.setTitle("Rectangle Example");
        Group group = new Group(); //creating Group
        Rectangle rect = new Rectangle(); //instantiating Rectangle
        rect.setX(20); //setting the X coordinate of upper left //corner of rectangle
        rect.setY(20); //setting the Y coordinate of upper left //corner of rectangle
        rect.setWidth(100); //setting the width of rectangle
        rect.setHeight(100); // setting the height of rectangle
        rect.setFill(setColor());
        group.getChildren().addAll(rect); //adding rectangle to the //group
        Scene scene = new Scene(group,200,300,Color.GRAY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void DrawRectangle(){
        System.out.println("Printing a Rectangle. (DEBUGGING)");
    }

    public void DrawCircle(){

    }

    public static void main(String[] args) {  
        launch(args);  
    }  
}

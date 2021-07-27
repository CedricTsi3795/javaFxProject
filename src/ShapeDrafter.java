import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapeDrafter extends Application{
    public static String m_Couleur;
    public static Color m_color = Color.BLACK;
    public static String m_shape;
    public Rectangle rectangle = new Rectangle();
    public Circle circle = new Circle();
    
    public ShapeDrafter(){
        
    }

    public void setColor(String couleur){
        m_Couleur = couleur;
        switch(m_Couleur){
            case "Vert": m_color = Color.GREEN;
            break;
            case "Bleu": m_color = Color.BLUE;
            break;
            case "Rouge": m_color = Color.RED;
            break;
            default: m_color = Color.YELLOW;
            break;
        }
    }

    public static Color getColor(){
        return m_color;
    }

    public void start(Stage primaryStage)throws Exception{
        primaryStage.setTitle("Rectangle Example");
        Group group = new Group(); //creating Group

        drawRectangle();
        drawCircle();

        group.getChildren().addAll(rectangle,circle); //adding rectangle and the circle to the group
        Scene scene = new Scene(group,500,400,Color.DARKGRAY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void drawRectangle(){
        rectangle.setX(20); //setting the X coordinate of upper left corner of rectangle
        rectangle.setY(20); //setting the Y coordinate of upper left corner of rectangle
        rectangle.setWidth(100); //setting the width of rectangle
        rectangle.setHeight(100); // setting the height of rectangle
        rectangle.setFill(getColor());
    }
    public void drawCircle(){
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(100);
        circle.setFill(getColor());
    }

    public void changeColor(){

    }

    public static void mainLaunch(String[] args) {  
        launch(args);  
    }  
}

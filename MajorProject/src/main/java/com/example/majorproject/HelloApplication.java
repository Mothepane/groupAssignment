package com.example.majorproject;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane root = new BorderPane();

        Text logo = new Text("TAGTEAM");
        logo.setFont(Font.font("Algerian", FontWeight.BOLD, FontPosture.REGULAR, 24));
        logo.setY(50);
        logo.setX(40);
        logo.setFill(Color.DARKORANGE);
        root.getChildren().add(logo);

        WebView webView = new WebView();

        Text text1 = new Text("TV COMEDIES");
        text1.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 18));
        text1.setY(110);
        text1.setX(40);
        text1.setFill(Color.WHITE);
        ImageView image = new ImageView("com.jpg");
        image.setY(130);
        image.setX(40);
        image.setFitHeight(150);
        image.setFitWidth(200);

        Text label = new Text("VACATION");
        label.setX(40);
        label.setY(300);
        label.setFill(Color.DARKORANGE);
        label.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(label);

        ImageView image1 = new ImageView("come.jpg");
        image1.setY(130);
        image1.setX(246);
        image1.setFitHeight(150);
        image1.setFitWidth(200);

        Text label1 = new Text("DEATH AT A FUNERAL");
        label1.setX(246);
        label1.setY(300);
        label1.setFill(Color.DARKORANGE);
        label1.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(label1);

        ImageView image2 = new ImageView("come1.jpg");
        image2.setY(130);
        image2.setX(452);
        image2.setFitHeight(150);
        image2.setFitWidth(220);

        Text label2 = new Text("VACATION FRIENDS");
        label2.setX(452);
        label2.setY(300);
        label2.setFill(Color.DARKORANGE);
        label2.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(label2);

        ImageView image3 = new ImageView("come2.jpg");
        image3.setY(130);
        image3.setX(678);
        image3.setFitHeight(150);
        image3.setFitWidth(200);

        Text label3 = new Text("NIGHT SCHOOL");
        label3.setX(678);
        label3.setY(300);
        label3.setFill(Color.DARKORANGE);
        label3.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(label3);

        ImageView image4 = new ImageView("come3.jpg");
        image4.setY(130);
        image4.setX(883);
        image4.setFitHeight(150);
        image4.setFitWidth(200);

        Text label4 = new Text("IDENTITY THEFT");
        label4.setX(883);
        label4.setY(300);
        label4.setFill(Color.DARKORANGE);
        label4.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(label4);

        ImageView image5 = new ImageView("come4.jpg");
        image5.setY(130);
        image5.setX(1089);
        image5.setFitHeight(150);
        image5.setFitWidth(200);

        Text label5 = new Text("COUPLES RETREATE");
        label5.setX(1089);
        label5.setY(300);
        label5.setFill(Color.DARKORANGE);
        label5.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(label5);

        ImageView image6 = new ImageView("come5.jpg");
        image6.setY(130);
        image6.setX(1295);
        image6.setFitHeight(150);
        image6.setFitWidth(220);

        Text label6 = new Text("MADEA'S FAMILY FUNERAL");
        label6.setX(1295);
        label6.setY(300);
        label6.setFill(Color.DARKORANGE);
        label6.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(label6);

        ImageView image7 = new ImageView("come6.jpg");
        image7.setY(130);
        image7.setX(1329);
        image7.setFitHeight(150);
        image7.setFitWidth(220);

        Text label7 = new Text("GAME NIGHT");
        label7.setX(1329);
        label7.setY(300);
        label7.setFill(Color.DARKORANGE);
        label7.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(label7);
        root.getChildren().addAll(text1, image, image1, image2, image3, image4, image5, image6, image7 );


        Text text2 = new Text("ACTION");
        text2.setFont(Font.font("Haetten" ,FontWeight.BOLD, FontPosture.REGULAR, 18));
        text2.setY(380);
        text2.setX(40);
        text2.setFill(Color.WHITE);

        ImageView view = new ImageView("act.jpg");
        view.setY(400);
        view.setX(40);
        view.setFitHeight(150);
        view.setFitWidth(200);

        Text accy = new Text("13 HOURS IN BENGHAZI");
        accy.setX(40);
        accy.setY(550);
        accy.setFill(Color.DARKORANGE);
        accy.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(accy);

        ImageView view1 = new ImageView("act1.jpg");
        view1.setY(400);
        view1.setX(246);
        view1.setFitHeight(150);
        view1.setFitWidth(200);

        Text accy1 = new Text("AQUAMAN");
        accy1.setX(246);
        accy1.setY(550);
        accy1.setFill(Color.DARKORANGE);
        accy1.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(accy1);

        ImageView view2 = new ImageView("act2.jpg");
        view2.setY(400);
        view2.setX(452);
        view2.setFitHeight(150);
        view2.setFitWidth(200);

        Text accy2 = new Text("ABDUCTION");
        accy2.setX(452);
        accy2.setY(550);
        accy2.setFill(Color.DARKORANGE);
        accy2.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(accy2);

        ImageView view3 = new ImageView("act3.jpg");
        view3.setY(400);
        view3.setX(678);
        view3.setFitHeight(150);
        view3.setFitWidth(200);

        Text accy3 = new Text("JOHN WICK");
        accy3.setX(678);
        accy3.setY(550);
        accy3.setFill(Color.DARKORANGE);
        accy3.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(accy3);

        ImageView view4 = new ImageView("act4.jpg");
        view4.setY(400);
        view4.setX(883);
        view4.setFitHeight(150);
        view4.setFitWidth(200);

        Text accy4 = new Text("ANGEL HAS FALLEN");
        accy4.setX(883);
        accy4.setY(550);
        accy4.setFill(Color.DARKORANGE);
        accy4.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(accy4);

        ImageView view5 = new ImageView("act5.jpg");
        view5.setY(400);
        view5.setX(1089);
        view5.setFitHeight(150);
        view5.setFitWidth(200);

        Text accy5 = new Text("ACCIDENT MAN");
        accy5.setX(1089);
        accy5.setY(550);
        accy5.setFill(Color.DARKORANGE);
        accy5.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(accy5);

        ImageView view6 = new ImageView("act6.jpg");
        view6.setY(400);
        view6.setX(1295);
        view6.setFitHeight(150);
        view6.setFitWidth(200);

        Text accy6 = new Text("MAD MAX");
        accy6.setX(1295);
        accy6.setY(550);
        accy6.setFill(Color.DARKORANGE);
        accy6.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(accy6);

        ImageView view7 = new ImageView("act7.jpg");
        view7.setY(400);
        view7.setX(1529);
        view7.setFitHeight(150);
        view7.setFitWidth(200);

        Text accy7 = new Text("LONDON HAS FALLEN");
        accy7.setX(1529);
        accy7.setY(550);
        accy7.setFill(Color.DARKORANGE);
        accy7.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(accy7);
        root.getChildren().addAll(text2, view, view1, view2, view3, view4, view5, view6, view7 );

        Text text3 = new Text("ROMANCE");
        text3.setFont(Font.font("Haetten" ,FontWeight.BOLD, FontPosture.REGULAR, 18));
        text3.setY(625);
        text3.setX(40);
        text3.setFill(Color.WHITE);
        ImageView romane = new ImageView("rom5.jpg");
        romane.setY(640);
        romane.setX(40);
        romane.setFitHeight(150);
        romane.setFitWidth(200);

        Text rom = new Text("COFFEE SHOP");
        rom.setX(40);
        rom.setY(650);
        rom.setFill(Color.DARKORANGE);
        rom.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(rom);

        ImageView romane1 = new ImageView("rom.jpg");
        romane1.setY(640);
        romane1.setX(246);
        romane1.setFitWidth(200);
        romane1.setFitHeight(150);

        Text rom1 = new Text("LONDON HAS FALLEN");
        rom1.setX(1529);
        rom1.setY(650);
        rom1.setFill(Color.DARKORANGE);
        rom1.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(rom1);

        ImageView romane2 = new ImageView("rom1.jpg");
        romane2.setY(640);
        romane2.setX(320);
        romane2.setFitHeight(150);
        romane2.setFitWidth(200);

        Text rom2 = new Text("LONDON HAS FALLEN");
        rom2.setX(1529);
        rom2.setY(650);
        rom2.setFill(Color.DARKORANGE);
        rom2.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(rom2);

        ImageView romane3 = new ImageView("rom2.jpg");
        romane3.setY(640);
        romane3.setX(460);
        romane3.setFitHeight(150);
        romane3.setFitWidth(200);
        Text rom3 = new Text("LONDON HAS FALLEN");
        rom3.setX(1529);
        rom3.setY(650);
        rom3.setFill(Color.DARKORANGE);
        rom3.setFont(Font.font("Haetten" , FontWeight.BOLD, FontPosture.REGULAR, 12));
        root.getChildren().add(rom3);

        ImageView romane4 = new ImageView("rom3.jpg");
        romane4.setY(640);
        romane4.setX(600);
        romane4.setFitHeight(150);
        romane4.setFitWidth(200);

        ImageView romane5 = new ImageView("rom4.jpg");
        romane5.setY(640);
        romane5.setX(740);
        romane5.setFitHeight(150);
        romane5.setFitWidth(200);

        ImageView romane6 = new ImageView("rom6.jpg");
        romane6.setY(640);
        romane6.setX(880);
        romane6.setFitHeight(150);
        romane6.setFitWidth(200);

        ImageView romane7 = new ImageView("rom7.jpg");
        romane7.setY(640);
        romane7.setX(1020);
        romane7.setFitHeight(150);
        romane7.setFitWidth(200);

        root.getChildren().addAll(text3, romane, romane1, romane2, romane3, romane4, romane5, romane6, romane7);

        root.setStyle("-fx-background-color: black;");
        Scene scene = new Scene(root, 700, 500);
        scene.getStylesheets().add("style.css");



        image.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/kleG7XCqOb4");
            root.setCenter(webView);

           Circle circle = new Circle();

            circle.setCenterX(600.0f);
            circle.setCenterY(300.0f);
            circle.setRadius(5.0f);

            circle.setFill(Color.DARKORANGE);
            circle.setStrokeWidth(20);
            ScaleTransition scaleTransition= new ScaleTransition();
            scaleTransition.setDuration(Duration.millis(1000));
            scaleTransition.setNode(circle);

            scaleTransition.setByY(1.2);
            scaleTransition.setByX(1.2);
            scaleTransition.setCycleCount(5);
            scaleTransition.setAutoReverse(false);
            scaleTransition.play();

            Circle circle1 = new Circle();

            circle1.setCenterX(640.0f);
            circle1.setCenterY(300.0f);
            circle1.setRadius(5.0f);

            circle1.setFill(Color.DARKORANGE);
            circle1.setStrokeWidth(20);
            ScaleTransition scaleTransition1= new ScaleTransition();
            scaleTransition1.setDuration(Duration.millis(1000));
            scaleTransition1.setNode(circle1);

            scaleTransition1.setByY(1.2);
            scaleTransition1.setByX(1.2);
            scaleTransition1.setCycleCount(5);
            scaleTransition1.setAutoReverse(false);
            scaleTransition1.play();

            Circle circle2 = new Circle();

            circle2.setCenterX(680.0f);
            circle2.setCenterY(300.0f);
            circle2.setRadius(5.0f);

            circle2.setFill(Color.DARKORANGE);
            circle2.setStrokeWidth(20);
            ScaleTransition scaleTransition2= new ScaleTransition();
            scaleTransition2.setDuration(Duration.millis(1000));
            scaleTransition2.setNode(circle2);

            scaleTransition2.setByY(1.2);
            scaleTransition2.setByX(1.2);
            scaleTransition2.setCycleCount(5);
            scaleTransition2.setAutoReverse(false);
            scaleTransition2.play();

            Circle circle3 = new Circle();

            circle3.setCenterX(720.0f);
            circle3.setCenterY(300.0f);
            circle3.setRadius(5.0f);

            circle3.setFill(Color.DARKORANGE);
            circle3.setStrokeWidth(20);
            ScaleTransition scaleTransition3= new ScaleTransition();
            scaleTransition3.setDuration(Duration.millis(1000));
            scaleTransition3.setNode(circle3);

            scaleTransition3.setByY(1.2);
            scaleTransition3.setByX(1.2);
            scaleTransition3.setCycleCount(5);
            scaleTransition3.setAutoReverse(false);
            scaleTransition3.play();

            root.getChildren().addAll(circle, circle1, circle2, circle3);
            ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
            GaussianBlur blur = new GaussianBlur(45);
            adj.setInput(blur);
            text1.setEffect(adj);
            image.setEffect(adj);
            image1.setEffect(adj);
            image2.setEffect(adj);
            image3.setEffect(adj);
            image4.setEffect(adj);
            image5.setEffect(adj);
            image6.setEffect(adj);
            image7.setEffect(adj);

            text2.setEffect(adj);
            view.setEffect(adj);
            view1.setEffect(adj);
            view2.setEffect(adj);
            view3.setEffect(adj);
            view4.setEffect(adj);
            view5.setEffect(adj);
            view6.setEffect(adj);
            view7.setEffect(adj);

            text3.setEffect(adj);
            romane.setEffect(adj);
            romane1.setEffect(adj);
            romane2.setEffect(adj);
            romane3.setEffect(adj);
            romane4.setEffect(adj);
            romane5.setEffect(adj);
            romane6.setEffect(adj);
            romane7.setEffect(adj);
        });
                image1.setOnMouseClicked((event) -> {

                    Circle circle = new Circle();

                    circle.setCenterX(600.0f);
                    circle.setCenterY(300.0f);
                    circle.setRadius(5.0f);

                    circle.setFill(Color.DARKORANGE);
                    circle.setStrokeWidth(20);
                    ScaleTransition scaleTransition= new ScaleTransition();
                    scaleTransition.setDuration(Duration.millis(1000));
                    scaleTransition.setNode(circle);

                    scaleTransition.setByY(1.2);
                    scaleTransition.setByX(1.2);
                    scaleTransition.setCycleCount(5);
                    scaleTransition.setAutoReverse(false);
                    scaleTransition.play();

                    Circle circle1 = new Circle();

                    circle1.setCenterX(640.0f);
                    circle1.setCenterY(300.0f);
                    circle1.setRadius(5.0f);

                    circle1.setFill(Color.DARKORANGE);
                    circle1.setStrokeWidth(20);
                    ScaleTransition scaleTransition1= new ScaleTransition();
                    scaleTransition1.setDuration(Duration.millis(1000));
                    scaleTransition1.setNode(circle1);

                    scaleTransition1.setByY(1.2);
                    scaleTransition1.setByX(1.2);
                    scaleTransition1.setCycleCount(5);
                    scaleTransition1.setAutoReverse(false);
                    scaleTransition1.play();

                    Circle circle2 = new Circle();

                    circle2.setCenterX(680.0f);
                    circle2.setCenterY(300.0f);
                    circle2.setRadius(5.0f);

                    circle2.setFill(Color.DARKORANGE);
                    circle2.setStrokeWidth(20);
                    ScaleTransition scaleTransition2= new ScaleTransition();
                    scaleTransition2.setDuration(Duration.millis(1000));
                    scaleTransition2.setNode(circle2);

                    scaleTransition2.setByY(1.2);
                    scaleTransition2.setByX(1.2);
                    scaleTransition2.setCycleCount(5);
                    scaleTransition2.setAutoReverse(false);
                    scaleTransition2.play();

                    Circle circle3 = new Circle();

                    circle3.setCenterX(720.0f);
                    circle3.setCenterY(300.0f);
                    circle3.setRadius(5.0f);

                    circle3.setFill(Color.DARKORANGE);
                    circle3.setStrokeWidth(20);
                    ScaleTransition scaleTransition3= new ScaleTransition();
                    scaleTransition3.setDuration(Duration.millis(1000));
                    scaleTransition3.setNode(circle3);

                    scaleTransition3.setByY(1.2);
                    scaleTransition3.setByX(1.2);
                    scaleTransition3.setCycleCount(5);
                    scaleTransition3.setAutoReverse(false);
                    scaleTransition3.play();

                    root.getChildren().addAll(circle, circle1, circle2, circle3);
                    ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
                    GaussianBlur blur = new GaussianBlur(45);
                    adj.setInput(blur);
                    text1.setEffect(adj);
                    image.setEffect(adj);
                    image1.setEffect(adj);
                    image2.setEffect(adj);
                    image3.setEffect(adj);
                    image4.setEffect(adj);
                    image5.setEffect(adj);
                    image6.setEffect(adj);
                    image7.setEffect(adj);

                    text2.setEffect(adj);
                    view.setEffect(adj);
                    view1.setEffect(adj);
                    view2.setEffect(adj);
                    view3.setEffect(adj);
                    view4.setEffect(adj);
                    view5.setEffect(adj);
                    view6.setEffect(adj);
                    view7.setEffect(adj);

                    text3.setEffect(adj);
                    romane.setEffect(adj);
                    romane1.setEffect(adj);
                    romane2.setEffect(adj);
                    romane3.setEffect(adj);
                    romane4.setEffect(adj);
                    romane5.setEffect(adj);
                    romane6.setEffect(adj);
                    romane7.setEffect(adj);
                    webView.getEngine().load("https://youtu.be/LkbR3nQqcrk");
                    root.setCenter(webView);


                });
                        image2.setOnMouseClicked((event) -> {
                            Circle circle = new Circle();

                            circle.setCenterX(600.0f);
                            circle.setCenterY(300.0f);
                            circle.setRadius(5.0f);

                            circle.setFill(Color.DARKORANGE);
                            circle.setStrokeWidth(20);
                            ScaleTransition scaleTransition= new ScaleTransition();
                            scaleTransition.setDuration(Duration.millis(1000));
                            scaleTransition.setNode(circle);

                            scaleTransition.setByY(1.2);
                            scaleTransition.setByX(1.2);
                            scaleTransition.setCycleCount(5);
                            scaleTransition.setAutoReverse(false);
                            scaleTransition.play();

                            Circle circle1 = new Circle();

                            circle1.setCenterX(640.0f);
                            circle1.setCenterY(300.0f);
                            circle1.setRadius(5.0f);

                            circle1.setFill(Color.DARKORANGE);
                            circle1.setStrokeWidth(20);
                            ScaleTransition scaleTransition1= new ScaleTransition();
                            scaleTransition1.setDuration(Duration.millis(1000));
                            scaleTransition1.setNode(circle1);

                            scaleTransition1.setByY(1.2);
                            scaleTransition1.setByX(1.2);
                            scaleTransition1.setCycleCount(5);
                            scaleTransition1.setAutoReverse(false);
                            scaleTransition1.play();

                            Circle circle2 = new Circle();

                            circle2.setCenterX(680.0f);
                            circle2.setCenterY(300.0f);
                            circle2.setRadius(5.0f);

                            circle2.setFill(Color.DARKORANGE);
                            circle2.setStrokeWidth(20);
                            ScaleTransition scaleTransition2= new ScaleTransition();
                            scaleTransition2.setDuration(Duration.millis(1000));
                            scaleTransition2.setNode(circle2);

                            scaleTransition2.setByY(1.2);
                            scaleTransition2.setByX(1.2);
                            scaleTransition2.setCycleCount(5);
                            scaleTransition2.setAutoReverse(false);
                            scaleTransition2.play();

                            Circle circle3 = new Circle();

                            circle3.setCenterX(720.0f);
                            circle3.setCenterY(300.0f);
                            circle3.setRadius(5.0f);

                            circle3.setFill(Color.DARKORANGE);
                            circle3.setStrokeWidth(20);
                            ScaleTransition scaleTransition3= new ScaleTransition();
                            scaleTransition3.setDuration(Duration.millis(1000));
                            scaleTransition3.setNode(circle3);

                            scaleTransition3.setByY(1.2);
                            scaleTransition3.setByX(1.2);
                            scaleTransition3.setCycleCount(5);
                            scaleTransition3.setAutoReverse(false);
                            scaleTransition3.play();

                            root.getChildren().addAll(circle, circle1, circle2, circle3);
                            ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
                            GaussianBlur blur = new GaussianBlur(45);
                            adj.setInput(blur);
                            text1.setEffect(adj);
                            image.setEffect(adj);
                            image1.setEffect(adj);
                            image2.setEffect(adj);
                            image3.setEffect(adj);
                            image4.setEffect(adj);
                            image5.setEffect(adj);
                            image6.setEffect(adj);
                            image7.setEffect(adj);

                            text2.setEffect(adj);
                            view.setEffect(adj);
                            view1.setEffect(adj);
                            view2.setEffect(adj);
                            view3.setEffect(adj);
                            view4.setEffect(adj);
                            view5.setEffect(adj);
                            view6.setEffect(adj);
                            view7.setEffect(adj);

                            text3.setEffect(adj);
                            romane.setEffect(adj);
                            romane1.setEffect(adj);
                            romane2.setEffect(adj);
                            romane3.setEffect(adj);
                            romane4.setEffect(adj);
                            romane5.setEffect(adj);
                            romane6.setEffect(adj);
                            romane7.setEffect(adj);

                            webView.getEngine().load("https://youtu.be/Uuk21YmfpsE");
                            root.setCenter(webView);

                        });
        image3.setOnMouseClicked((event) -> {
            Circle circle = new Circle();

            circle.setCenterX(600.0f);
            circle.setCenterY(300.0f);
            circle.setRadius(5.0f);

            circle.setFill(Color.DARKORANGE);
            circle.setStrokeWidth(20);
            ScaleTransition scaleTransition= new ScaleTransition();
            scaleTransition.setDuration(Duration.millis(1000));
            scaleTransition.setNode(circle);

            scaleTransition.setByY(1.2);
            scaleTransition.setByX(1.2);
            scaleTransition.setCycleCount(5);
            scaleTransition.setAutoReverse(false);
            scaleTransition.play();

            Circle circle1 = new Circle();

            circle1.setCenterX(640.0f);
            circle1.setCenterY(300.0f);
            circle1.setRadius(5.0f);

            circle1.setFill(Color.DARKORANGE);
            circle1.setStrokeWidth(20);
            ScaleTransition scaleTransition1= new ScaleTransition();
            scaleTransition1.setDuration(Duration.millis(1000));
            scaleTransition1.setNode(circle1);

            scaleTransition1.setByY(1.2);
            scaleTransition1.setByX(1.2);
            scaleTransition1.setCycleCount(5);
            scaleTransition1.setAutoReverse(false);
            scaleTransition1.play();

            Circle circle2 = new Circle();

            circle2.setCenterX(680.0f);
            circle2.setCenterY(300.0f);
            circle2.setRadius(5.0f);

            circle2.setFill(Color.DARKORANGE);
            circle2.setStrokeWidth(20);
            ScaleTransition scaleTransition2= new ScaleTransition();
            scaleTransition2.setDuration(Duration.millis(1000));
            scaleTransition2.setNode(circle2);

            scaleTransition2.setByY(1.2);
            scaleTransition2.setByX(1.2);
            scaleTransition2.setCycleCount(5);
            scaleTransition2.setAutoReverse(false);
            scaleTransition2.play();

            Circle circle3 = new Circle();

            circle3.setCenterX(720.0f);
            circle3.setCenterY(300.0f);
            circle3.setRadius(5.0f);

            circle3.setFill(Color.DARKORANGE);
            circle3.setStrokeWidth(20);
            ScaleTransition scaleTransition3= new ScaleTransition();
            scaleTransition3.setDuration(Duration.millis(1000));
            scaleTransition3.setNode(circle3);

            scaleTransition3.setByY(1.2);
            scaleTransition3.setByX(1.2);
            scaleTransition3.setCycleCount(5);
            scaleTransition3.setAutoReverse(false);
            scaleTransition3.play();

            root.getChildren().addAll(circle, circle1, circle2, circle3);
            ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
            GaussianBlur blur = new GaussianBlur(45);
            adj.setInput(blur);
            text1.setEffect(adj);
            image.setEffect(adj);
            image1.setEffect(adj);
            image2.setEffect(adj);
            image3.setEffect(adj);
            image4.setEffect(adj);
            image5.setEffect(adj);
            image6.setEffect(adj);
            image7.setEffect(adj);

            text2.setEffect(adj);
            view.setEffect(adj);
            view1.setEffect(adj);
            view2.setEffect(adj);
            view3.setEffect(adj);
            view4.setEffect(adj);
            view5.setEffect(adj);
            view6.setEffect(adj);
            view7.setEffect(adj);

            text3.setEffect(adj);
            romane.setEffect(adj);
            romane1.setEffect(adj);
            romane2.setEffect(adj);
            romane3.setEffect(adj);
            romane4.setEffect(adj);
            romane5.setEffect(adj);
            romane6.setEffect(adj);
            romane7.setEffect(adj);

                    webView.getEngine().load("https://youtu.be/t9QtXGirWf0");
                    root.setCenter(webView);

                });
        image4.setOnMouseClicked((event) -> {

            Circle circle = new Circle();

            circle.setCenterX(600.0f);
            circle.setCenterY(300.0f);
            circle.setRadius(5.0f);

            circle.setFill(Color.DARKORANGE);
            circle.setStrokeWidth(20);
            ScaleTransition scaleTransition= new ScaleTransition();
            scaleTransition.setDuration(Duration.millis(1000));
            scaleTransition.setNode(circle);

            scaleTransition.setByY(1.2);
            scaleTransition.setByX(1.2);
            scaleTransition.setCycleCount(5);
            scaleTransition.setAutoReverse(false);
            scaleTransition.play();

            Circle circle1 = new Circle();

            circle1.setCenterX(640.0f);
            circle1.setCenterY(300.0f);
            circle1.setRadius(5.0f);

            circle1.setFill(Color.DARKORANGE);
            circle1.setStrokeWidth(20);
            ScaleTransition scaleTransition1= new ScaleTransition();
            scaleTransition1.setDuration(Duration.millis(1000));
            scaleTransition1.setNode(circle1);

            scaleTransition1.setByY(1.2);
            scaleTransition1.setByX(1.2);
            scaleTransition1.setCycleCount(5);
            scaleTransition1.setAutoReverse(false);
            scaleTransition1.play();

            Circle circle2 = new Circle();

            circle2.setCenterX(680.0f);
            circle2.setCenterY(300.0f);
            circle2.setRadius(5.0f);

            circle2.setFill(Color.DARKORANGE);
            circle2.setStrokeWidth(20);
            ScaleTransition scaleTransition2= new ScaleTransition();
            scaleTransition2.setDuration(Duration.millis(1000));
            scaleTransition2.setNode(circle2);

            scaleTransition2.setByY(1.2);
            scaleTransition2.setByX(1.2);
            scaleTransition2.setCycleCount(5);
            scaleTransition2.setAutoReverse(false);
            scaleTransition2.play();

            Circle circle3 = new Circle();

            circle3.setCenterX(720.0f);
            circle3.setCenterY(300.0f);
            circle3.setRadius(5.0f);

            circle3.setFill(Color.DARKORANGE);
            circle3.setStrokeWidth(20);
            ScaleTransition scaleTransition3= new ScaleTransition();
            scaleTransition3.setDuration(Duration.millis(1000));
            scaleTransition3.setNode(circle3);

            scaleTransition3.setByY(1.2);
            scaleTransition3.setByX(1.2);
            scaleTransition3.setCycleCount(5);
            scaleTransition3.setAutoReverse(false);
            scaleTransition3.play();

            root.getChildren().addAll(circle, circle1, circle2, circle3);
            ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
            GaussianBlur blur = new GaussianBlur(45);
            adj.setInput(blur);
            text1.setEffect(adj);
            image.setEffect(adj);
            image1.setEffect(adj);
            image2.setEffect(adj);
            image3.setEffect(adj);
            image4.setEffect(adj);
            image5.setEffect(adj);
            image6.setEffect(adj);
            image7.setEffect(adj);

            text2.setEffect(adj);
            view.setEffect(adj);
            view1.setEffect(adj);
            view2.setEffect(adj);
            view3.setEffect(adj);
            view4.setEffect(adj);
            view5.setEffect(adj);
            view6.setEffect(adj);
            view7.setEffect(adj);

            text3.setEffect(adj);
            romane.setEffect(adj);
            romane1.setEffect(adj);
            romane2.setEffect(adj);
            romane3.setEffect(adj);
            romane4.setEffect(adj);
            romane5.setEffect(adj);
            romane6.setEffect(adj);
            romane7.setEffect(adj);

                webView.getEngine().load("https://youtu.be/x8ZI0H3_tdU");
                root.setCenter(webView);
        });

        image5.setOnMouseClicked((event) -> {

            Circle circle = new Circle();

            circle.setCenterX(600.0f);
            circle.setCenterY(300.0f);
            circle.setRadius(5.0f);

            circle.setFill(Color.DARKORANGE);
            circle.setStrokeWidth(20);
            ScaleTransition scaleTransition= new ScaleTransition();
            scaleTransition.setDuration(Duration.millis(1000));
            scaleTransition.setNode(circle);

            scaleTransition.setByY(1.2);
            scaleTransition.setByX(1.2);
            scaleTransition.setCycleCount(5);
            scaleTransition.setAutoReverse(false);
            scaleTransition.play();

            Circle circle1 = new Circle();

            circle1.setCenterX(640.0f);
            circle1.setCenterY(300.0f);
            circle1.setRadius(5.0f);

            circle1.setFill(Color.DARKORANGE);
            circle1.setStrokeWidth(20);
            ScaleTransition scaleTransition1= new ScaleTransition();
            scaleTransition1.setDuration(Duration.millis(1000));
            scaleTransition1.setNode(circle1);

            scaleTransition1.setByY(1.2);
            scaleTransition1.setByX(1.2);
            scaleTransition1.setCycleCount(5);
            scaleTransition1.setAutoReverse(false);
            scaleTransition1.play();

            Circle circle2 = new Circle();

            circle2.setCenterX(680.0f);
            circle2.setCenterY(300.0f);
            circle2.setRadius(5.0f);

            circle2.setFill(Color.DARKORANGE);
            circle2.setStrokeWidth(20);
            ScaleTransition scaleTransition2= new ScaleTransition();
            scaleTransition2.setDuration(Duration.millis(1000));
            scaleTransition2.setNode(circle2);

            scaleTransition2.setByY(1.2);
            scaleTransition2.setByX(1.2);
            scaleTransition2.setCycleCount(5);
            scaleTransition2.setAutoReverse(false);
            scaleTransition2.play();

            Circle circle3 = new Circle();

            circle3.setCenterX(720.0f);
            circle3.setCenterY(300.0f);
            circle3.setRadius(5.0f);

            circle3.setFill(Color.DARKORANGE);
            circle3.setStrokeWidth(20);
            ScaleTransition scaleTransition3= new ScaleTransition();
            scaleTransition3.setDuration(Duration.millis(1000));
            scaleTransition3.setNode(circle3);

            scaleTransition3.setByY(1.2);
            scaleTransition3.setByX(1.2);
            scaleTransition3.setCycleCount(5);
            scaleTransition3.setAutoReverse(false);
            scaleTransition3.play();

            root.getChildren().addAll(circle, circle1, circle2, circle3);
            ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
            GaussianBlur blur = new GaussianBlur(45);
            adj.setInput(blur);
            text1.setEffect(adj);
            image.setEffect(adj);
            image1.setEffect(adj);
            image2.setEffect(adj);
            image3.setEffect(adj);
            image4.setEffect(adj);
            image5.setEffect(adj);
            image6.setEffect(adj);
            image7.setEffect(adj);

            text2.setEffect(adj);
            view.setEffect(adj);
            view1.setEffect(adj);
            view2.setEffect(adj);
            view3.setEffect(adj);
            view4.setEffect(adj);
            view5.setEffect(adj);
            view6.setEffect(adj);
            view7.setEffect(adj);

            text3.setEffect(adj);
            romane.setEffect(adj);
            romane1.setEffect(adj);
            romane2.setEffect(adj);
            romane3.setEffect(adj);
            romane4.setEffect(adj);
            romane5.setEffect(adj);
            romane6.setEffect(adj);
            romane7.setEffect(adj);

                    webView.getEngine().load("https://youtu.be/X4j_NTFos9c");
                    root.setCenter(webView);
        });

        image6.setOnMouseClicked((event) -> {

            Circle circle = new Circle();

            circle.setCenterX(600.0f);
            circle.setCenterY(300.0f);
            circle.setRadius(5.0f);

            circle.setFill(Color.DARKORANGE);
            circle.setStrokeWidth(20);
            ScaleTransition scaleTransition= new ScaleTransition();
            scaleTransition.setDuration(Duration.millis(1000));
            scaleTransition.setNode(circle);

            scaleTransition.setByY(1.2);
            scaleTransition.setByX(1.2);
            scaleTransition.setCycleCount(5);
            scaleTransition.setAutoReverse(false);
            scaleTransition.play();

            Circle circle1 = new Circle();

            circle1.setCenterX(640.0f);
            circle1.setCenterY(300.0f);
            circle1.setRadius(5.0f);

            circle1.setFill(Color.DARKORANGE);
            circle1.setStrokeWidth(20);
            ScaleTransition scaleTransition1= new ScaleTransition();
            scaleTransition1.setDuration(Duration.millis(1000));
            scaleTransition1.setNode(circle1);

            scaleTransition1.setByY(1.2);
            scaleTransition1.setByX(1.2);
            scaleTransition1.setCycleCount(5);
            scaleTransition1.setAutoReverse(false);
            scaleTransition1.play();

            Circle circle2 = new Circle();

            circle2.setCenterX(680.0f);
            circle2.setCenterY(300.0f);
            circle2.setRadius(5.0f);

            circle2.setFill(Color.DARKORANGE);
            circle2.setStrokeWidth(20);
            ScaleTransition scaleTransition2= new ScaleTransition();
            scaleTransition2.setDuration(Duration.millis(1000));
            scaleTransition2.setNode(circle2);

            scaleTransition2.setByY(1.2);
            scaleTransition2.setByX(1.2);
            scaleTransition2.setCycleCount(5);
            scaleTransition2.setAutoReverse(false);
            scaleTransition2.play();

            Circle circle3 = new Circle();

            circle3.setCenterX(720.0f);
            circle3.setCenterY(300.0f);
            circle3.setRadius(5.0f);

            circle3.setFill(Color.DARKORANGE);
            circle3.setStrokeWidth(20);
            ScaleTransition scaleTransition3= new ScaleTransition();
            scaleTransition3.setDuration(Duration.millis(1000));
            scaleTransition3.setNode(circle3);

            scaleTransition3.setByY(1.2);
            scaleTransition3.setByX(1.2);
            scaleTransition3.setCycleCount(5);
            scaleTransition3.setAutoReverse(false);
            scaleTransition3.play();

            root.getChildren().addAll(circle, circle1, circle2, circle3);
            ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
            GaussianBlur blur = new GaussianBlur(45);
            adj.setInput(blur);
            text1.setEffect(adj);
            image.setEffect(adj);
            image1.setEffect(adj);
            image2.setEffect(adj);
            image3.setEffect(adj);
            image4.setEffect(adj);
            image5.setEffect(adj);
            image6.setEffect(adj);
            image7.setEffect(adj);

            text2.setEffect(adj);
            view.setEffect(adj);
            view1.setEffect(adj);
            view2.setEffect(adj);
            view3.setEffect(adj);
            view4.setEffect(adj);
            view5.setEffect(adj);
            view6.setEffect(adj);
            view7.setEffect(adj);

            text3.setEffect(adj);
            romane.setEffect(adj);
            romane1.setEffect(adj);
            romane2.setEffect(adj);
            romane3.setEffect(adj);
            romane4.setEffect(adj);
            romane5.setEffect(adj);
            romane6.setEffect(adj);
            romane7.setEffect(adj);

                        webView.getEngine().load("https://youtu.be/id61hcbdMZA");
                        root.setCenter(webView);
        });


        image7.setOnMouseClicked((event) -> {

            Circle circle = new Circle();

            circle.setCenterX(600.0f);
            circle.setCenterY(300.0f);
            circle.setRadius(5.0f);

            circle.setFill(Color.DARKORANGE);
            circle.setStrokeWidth(20);
            ScaleTransition scaleTransition= new ScaleTransition();
            scaleTransition.setDuration(Duration.millis(1000));
            scaleTransition.setNode(circle);

            scaleTransition.setByY(1.2);
            scaleTransition.setByX(1.2);
            scaleTransition.setCycleCount(5);
            scaleTransition.setAutoReverse(false);
            scaleTransition.play();

            Circle circle1 = new Circle();

            circle1.setCenterX(640.0f);
            circle1.setCenterY(300.0f);
            circle1.setRadius(5.0f);

            circle1.setFill(Color.DARKORANGE);
            circle1.setStrokeWidth(20);
            ScaleTransition scaleTransition1= new ScaleTransition();
            scaleTransition1.setDuration(Duration.millis(1000));
            scaleTransition1.setNode(circle1);

            scaleTransition1.setByY(1.2);
            scaleTransition1.setByX(1.2);
            scaleTransition1.setCycleCount(5);
            scaleTransition1.setAutoReverse(false);
            scaleTransition1.play();

            Circle circle2 = new Circle();

            circle2.setCenterX(680.0f);
            circle2.setCenterY(300.0f);
            circle2.setRadius(5.0f);

            circle2.setFill(Color.DARKORANGE);
            circle2.setStrokeWidth(20);
            ScaleTransition scaleTransition2= new ScaleTransition();
            scaleTransition2.setDuration(Duration.millis(1000));
            scaleTransition2.setNode(circle2);

            scaleTransition2.setByY(1.2);
            scaleTransition2.setByX(1.2);
            scaleTransition2.setCycleCount(5);
            scaleTransition2.setAutoReverse(false);
            scaleTransition2.play();

            Circle circle3 = new Circle();

            circle3.setCenterX(720.0f);
            circle3.setCenterY(300.0f);
            circle3.setRadius(5.0f);

            circle3.setFill(Color.DARKORANGE);
            circle3.setStrokeWidth(20);
            ScaleTransition scaleTransition3= new ScaleTransition();
            scaleTransition3.setDuration(Duration.millis(1000));
            scaleTransition3.setNode(circle3);

            scaleTransition3.setByY(1.2);
            scaleTransition3.setByX(1.2);
            scaleTransition3.setCycleCount(5);
            scaleTransition3.setAutoReverse(false);
            scaleTransition3.play();

            root.getChildren().addAll(circle, circle1, circle2, circle3);
            ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
            GaussianBlur blur = new GaussianBlur(45);
            adj.setInput(blur);
            text1.setEffect(adj);
            image.setEffect(adj);
            image1.setEffect(adj);
            image2.setEffect(adj);
            image3.setEffect(adj);
            image4.setEffect(adj);
            image5.setEffect(adj);
            image6.setEffect(adj);
            image7.setEffect(adj);

            text2.setEffect(adj);
            view.setEffect(adj);
            view1.setEffect(adj);
            view2.setEffect(adj);
            view3.setEffect(adj);
            view4.setEffect(adj);
            view5.setEffect(adj);
            view6.setEffect(adj);
            view7.setEffect(adj);

            text3.setEffect(adj);
            romane.setEffect(adj);
            romane1.setEffect(adj);
            romane2.setEffect(adj);
            romane3.setEffect(adj);
            romane4.setEffect(adj);
            romane5.setEffect(adj);
            romane6.setEffect(adj);
            romane7.setEffect(adj);

                            webView.getEngine().load("https://youtu.be/qmxMAdV6s4U");
                            root.setCenter(webView);

                        });
        view.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/4CJBuUwd0Os");
            root.setCenter(webView);
        });

        view1.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/WDkg3h8PCVU");
            root.setCenter(webView);
        });

        view2.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/CEVkp5Je7m0");
            root.setCenter(webView);
        });


        view3.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/2AUmvWm5ZDQ");
            root.setCenter(webView);

        });
        view4.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/XF8h3hOGBJM");
            root.setCenter(webView);
        });

        view5.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/ODmJXjcRzG0");
            root.setCenter(webView);
        });

        view6.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/hEJnMQG9ev8");
            root.setCenter(webView);
        });


        view7.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/3AsOdX7NcJs");
            root.setCenter(webView);

        });
        romane.setOnMouseClicked((event) -> {
            Circle circle = new Circle();

            circle.setCenterX(600.0f);
            circle.setCenterY(300.0f);
            circle.setRadius(5.0f);

            circle.setFill(Color.RED);
            circle.setStrokeWidth(20);
            ScaleTransition scaleTransition= new ScaleTransition();
            scaleTransition.setDuration(Duration.millis(1000));
            scaleTransition.setNode(circle);

            scaleTransition.setByY(1.2);
            scaleTransition.setByX(1.2);
            scaleTransition.setCycleCount(5);
            scaleTransition.setAutoReverse(false);
            scaleTransition.play();

            Circle circle1 = new Circle();

            circle1.setCenterX(640.0f);
            circle1.setCenterY(300.0f);
            circle1.setRadius(5.0f);

            circle1.setFill(Color.RED);
            circle1.setStrokeWidth(20);
            ScaleTransition scaleTransition1= new ScaleTransition();
            scaleTransition1.setDuration(Duration.millis(1000));
            scaleTransition1.setNode(circle1);

            scaleTransition1.setByY(1.2);
            scaleTransition1.setByX(1.2);
            scaleTransition1.setCycleCount(5);
            scaleTransition1.setAutoReverse(false);
            scaleTransition1.play();

            Circle circle2 = new Circle();

            circle2.setCenterX(680.0f);
            circle2.setCenterY(300.0f);
            circle2.setRadius(5.0f);

            circle2.setFill(Color.RED);
            circle2.setStrokeWidth(20);
            ScaleTransition scaleTransition2= new ScaleTransition();
            scaleTransition2.setDuration(Duration.millis(1000));
            scaleTransition2.setNode(circle2);

            scaleTransition2.setByY(1.2);
            scaleTransition2.setByX(1.2);
            scaleTransition2.setCycleCount(5);
            scaleTransition2.setAutoReverse(false);
            scaleTransition2.play();

            Circle circle3 = new Circle();

            circle3.setCenterX(720.0f);
            circle3.setCenterY(300.0f);
            circle3.setRadius(5.0f);

            circle3.setFill(Color.RED);
            circle3.setStrokeWidth(20);
            ScaleTransition scaleTransition3= new ScaleTransition();
            scaleTransition3.setDuration(Duration.millis(1000));
            scaleTransition3.setNode(circle3);

            scaleTransition3.setByY(1.2);
            scaleTransition3.setByX(1.2);
            scaleTransition3.setCycleCount(5);
            scaleTransition3.setAutoReverse(false);
            scaleTransition3.play();

            root.getChildren().addAll(circle, circle1, circle2, circle3);
            ColorAdjust adj = new ColorAdjust(0, -0.1, -0.5, 0);
            GaussianBlur blur = new GaussianBlur(45);
            adj.setInput(blur);
            text1.setEffect(adj);
            image.setEffect(adj);
            image1.setEffect(adj);
            image2.setEffect(adj);
            image3.setEffect(adj);
            image4.setEffect(adj);
            image5.setEffect(adj);
            image6.setEffect(adj);
            image7.setEffect(adj);

            text2.setEffect(adj);
            view.setEffect(adj);
            view1.setEffect(adj);
            view2.setEffect(adj);
            view3.setEffect(adj);
            view4.setEffect(adj);
            view5.setEffect(adj);
            view6.setEffect(adj);
            view7.setEffect(adj);
            text3.setEffect(adj);
            romane.setEffect(adj);
            romane1.setEffect(adj);
            romane2.setEffect(adj);
            romane3.setEffect(adj);
            romane4.setEffect(adj);
            romane5.setEffect(adj);
            romane6.setEffect(adj);
            romane7.setEffect(adj);


            webView.getEngine().load("https://youtu.be/VVCicgwmJjA");
            root.setCenter(webView);
        });


        romane1.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/YzPq8uVgLe8");
            root.setCenter(webView);
        });

        romane2.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/rPTf0Gw5-Bg");
            root.setCenter(webView);
        });


        romane3.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/NYdNN6C9hfI");
            root.setCenter(webView);

        });
        romane4.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/2SvwX3ux_-8");
            root.setCenter(webView);
        });

        romane5.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/IEUrGBAteQY");
            root.setCenter(webView);
        });

        romane6.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/slB34ZQKBWs");
            root.setCenter(webView);
        });


        view7.setOnMouseClicked((event) -> {
            webView.getEngine().load("https://youtu.be/9ItBvH5J6ss");
            root.setCenter(webView);

        });

                            stage.setTitle("Interactive Multimedia Assignment 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
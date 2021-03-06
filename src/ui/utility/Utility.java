package ui.utility;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.MalformedURLException;

public class Utility {
    // Using id
    public static final Button setIconButton(Button button, String url, Double width, Double height){
        ImageView icon = createIcon(url, width, height);
        button.setGraphic(icon);
        icon = null;
        return button;
    }
    // Using selector
    public static final void setIconButton(Parent root, String selector, String sourceIcon, Double width, Double height){
        ImageView icon = Utility.createIcon(sourceIcon, width, height);
        Button rankBtn = (Button) root.lookup(selector);
        rankBtn.setGraphic(icon);
        icon  = null;
    }
    // Using icon from List icon
    public static final Button setIconButton( Button button, ImageView icon){
        button.setGraphic(icon);
        return button;
    }

    public static final ImageView createIcon( String url, Double width, Double height){
        ImageView icon = new ImageView((Image) null);
        setImage(icon, url, width, height);
        return icon;
    }

    public static final ImageView createImageView( String url, String selector, Parent parent, Double width, Double height){

        ImageView imageView = (ImageView)parent.lookup(selector);
        setImage(imageView, url, width, height);
        return imageView;
    }
    public static final ImageView setImage( ImageView imageView, String url, Double width, Double height){
        Image image = loadImage(url);
        if((width != null) && (height != null)){
            imageView.setFitHeight(height);
            imageView.setFitWidth(width);
        }
        imageView.setImage(image);
        return imageView;
    }

    public static final Image loadImage( String url){
        File file = new File(url);
        Image image = null;
        try {
            String localUrl = file.toURI().toURL().toString();
            image = new Image(localUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return image;
    }

}

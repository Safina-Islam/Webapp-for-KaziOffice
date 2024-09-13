/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

import javafx.scene.image.Image;

/**
 *
 * @author WIN 10
 */
public class ImageView {
    Image im;

    public ImageView(Image im) {
        this.im=im;
    }

    public Image getIm() {
        return im;
    }

    public void setIm(Image im) {
        this.im = im;
    }
    
    
    
}

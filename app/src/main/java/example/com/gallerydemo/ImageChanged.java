package example.com.gallerydemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by eheuristic on 12-12-2016.
 */
public class ImageChanged extends Activity {
    public Integer[] Images = {
            R.drawable.iphone,
            R.drawable.android,
            R.drawable.windows,
            R.drawable.linux,
            R.drawable.yes,
            R.drawable.tick,
            R.drawable.gh,
    };
    private int currImage = 0;
    Button rotatebuttonl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagechanged);
        setInitialImage();
        setImageRotateListener();


    }

    private void setImageRotateListener() {
        rotatebuttonl = (Button) findViewById(R.id.btnRotateImage);
        rotatebuttonl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                currImage++;
                if (currImage == 6) {
                    currImage = 0;
                }
                setCurrentImage();
            }
        });
    }
    private void setInitialImage() {
        setCurrentImage();
    }
    private void setCurrentImage() {

        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
        imageView.setImageResource(Images[currImage]);

    }

}

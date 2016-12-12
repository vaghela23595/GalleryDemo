package example.com.gallerydemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button imagechanged;

    Gallery gl;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagechanged=(Button)findViewById(R.id.imaged_changed);
        gl=(Gallery)findViewById(R.id.galery);
        im=(ImageView)findViewById(R.id.SelectedImahe);
        gl.setSpacing(2);



        imagechanged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t=new Intent(getApplicationContext(),ImageChanged.class);
                startActivity(t);

            }
        });

        final GalleryImageAdapter galleryImageAdapter= new GalleryImageAdapter(this);
        gl.setAdapter(galleryImageAdapter);

        gl.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                im.setImageResource(galleryImageAdapter.ImageId[position]);

                if(l==0)
                {
                    Toast.makeText(getApplicationContext(),"SelectedImage IS:-IPHONE",Toast.LENGTH_SHORT).show();
                }
                else if(l==1)
                {
                    Toast.makeText(getApplicationContext(),"SelectedImage IS:-ANDROID",Toast.LENGTH_SHORT).show();
                }
                else if(l==2)
                {
                    Toast.makeText(getApplicationContext(),"SelectedImage IS:-WINDOWS",Toast.LENGTH_SHORT).show();
                }
                else if(l==3)
                {
                    Toast.makeText(getApplicationContext(),"SelectedImage IS:-LiNUX",Toast.LENGTH_SHORT).show();
                }
                else if(l==4)
                {
                    Toast.makeText(getApplicationContext(),"SelectedImage IS:-YES",Toast.LENGTH_SHORT).show();
                }  else if(l==6)
                {
                    Toast.makeText(getApplicationContext(),"SelectedImage IS:-NO",Toast.LENGTH_SHORT).show();
                }
                else

                {
                    Toast.makeText(getApplicationContext(),"SelectedImage IS:-TICKMARK",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}

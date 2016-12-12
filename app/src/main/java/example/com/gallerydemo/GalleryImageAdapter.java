package example.com.gallerydemo;

import android.content.ContentValues;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by eheuristic on 12-12-2016.
 */
public class GalleryImageAdapter extends BaseAdapter {
    private Context mContext;

    public GalleryImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return ImageId.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView I = new ImageView(mContext);

        I.setImageResource(ImageId[i]);
        I.setLayoutParams(new Gallery.LayoutParams(200, 200));

        I.setScaleType(ImageView.ScaleType.FIT_XY);

        return I;


       }
    public Integer[] ImageId = {
            R.drawable.iphone,
            R.drawable.android,
            R.drawable.windows,
            R.drawable.linux,
            R.drawable.yes,
            R.drawable.tick,
            R.drawable.gh,
    };
}

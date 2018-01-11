package nyc.c4q.androidtest_unit4final;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by D on 1/10/18.
 */

public class ColorHolder extends RecyclerView.ViewHolder {

    private TextView color_name;

    public ColorHolder(View itemView) {
        super(itemView);

        color_name=(TextView)itemView.findViewById(R.id.color_name);

    }

    public void onBind(ColorModel colorModel){
        color_name.setText(colorModel.getColor());
    }
}

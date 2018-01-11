package nyc.c4q.androidtest_unit4final;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by justiceo on 1/9/18.
 */

public class InfoFragment extends Fragment {

    View rootView;
    TextView textView;
    Button button;
    TextView textView2;



    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.info_fragment, container, false);
        textView = (TextView)rootView.findViewById(R.id.textview1);
        button = (Button)rootView.findViewById(R.id.more);
        return rootView;


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                rootView=inflater.inflate(R.layout.info_fragment,container,false);
//                textView2 = (TextView) rootView.findViewById(R.id.);
//                button.setVisibility(View.VISIBLE);
//            }
//        });


    }

}

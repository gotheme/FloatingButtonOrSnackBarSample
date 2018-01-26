package com.gothems.floatingactionbutton;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.fab_button)
    public FloatingActionButton fabActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.fab_button)
    public void fabClick(FloatingActionButton floatingActionButton)
    {
        snackBarInit();
    }

    /*
    *
    * init snack bar
    * */
    private void snackBarInit()
    {

        Snackbar snackbar= Snackbar.make(fabActionButton,"Hello", Snackbar.LENGTH_SHORT);
        snackbar.setAction("UNDO", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(fabActionButton,"Thank You",Snackbar.LENGTH_LONG).show();
            }
        }).show();

    }


    /*
    *This method is calling to create custom snackbar
    *
    *
    * */

    private void customSnackBar()
    {
        Snackbar snackbar=Snackbar.make(fabActionButton,"Hello", Snackbar.LENGTH_SHORT);
        View view=snackbar.getView();
        view.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        snackbar.show();
        /*
        *
        *
        * TextView textView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
textView.setVisibility(View.INVISIBLE);
// Inflate our custom view
  View snackView = mInflater.inflate(R.layout.my_snackbar, null);

// Configure the view
 ImageView imageView = (ImageView) snackView.findViewById(R.id.image);
 imageView.setImageBitmap(image);
 TextView textViewTop = (TextView) snackView.findViewById(R.id.text);
  textViewTop.setText("Hello its nice demo....");
  textViewTop.setTextColor(Color.WHITE);
*/
    }


}

package jy.rectanglecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText hEdit = (EditText) findViewById(R.id.getHeight);
        EditText wEdit = (EditText) findViewById(R.id.getWidth);
        TextView area = (TextView) findViewById(R.id.areaResult);
        TextView perimeter = (TextView) findViewById(R.id.perimeterResult);
    }

    private void calArea(String height, String width) {
        TextView area = (TextView) findViewById(R.id.area);
        int area1 = Integer.parseInt(height) * Integer.parseInt(width);
        area.setText(String.valueOf(area1));
    }

    private void calPerimeter(String height, String width) {
        TextView perimeter = (TextView) findViewById(R.id.perimeter);
        int perimeter1 = (Integer.parseInt(height) * 2) + (Integer.parseInt(width) * 2);
        perimeter.setText(String.valueOf(perimeter1));
    }
}
//    The formulas for calculating area and perimeter are:  area = width * height   , perimeter = 2 * width + 2 * height
//    The app should accept decimal entries like 10.5 and 20.65.
//    The app should display two decimal places for the area and perimeter.

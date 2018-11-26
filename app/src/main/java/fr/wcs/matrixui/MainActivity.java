package fr.wcs.matrixui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Parent Layout
        LinearLayout lMainLayout = (LinearLayout)this.findViewById(R.id.mainLinearLayout);


                                  // WELCOME TEXTVIEW

        TextView _TVwelcome = new TextView(this);
        // Modify View

        _TVwelcome.setText(R.string.welcome);
        _TVwelcome.setTextColor(Color.parseColor("#6e1b37"));
        _TVwelcome.setBackgroundColor(Color.parseColor("#ff4081"));
        _TVwelcome.setTextSize(20);
        _TVwelcome.setPadding(10, 5, 10, 5);

        // WELCOME Layout
        LinearLayout.LayoutParams welcomeLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
        welcomeLayout.setMargins(0,10,0,10);

        _TVwelcome.setLayoutParams(welcomeLayout);

        // Add View to Parent
        lMainLayout.addView(_TVwelcome);


                                               // Create CheckBox
//
//            <CheckBox
//        android:id="@+id/checkbox"
//        android:layout_width="wrap_content"
//        android:layout_height="wrap_content"
//        android:layout_gravity="center_horizontal"
//        android:text="Yes, I want to be a Wilder" />



        CheckBox _CBYesIWant = new CheckBox(this);
        _CBYesIWant.setText(R.string.cbtext);

        LinearLayout.LayoutParams yesiwantLayout =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        yesiwantLayout.gravity=Gravity.CENTER_HORIZONTAL;
        _CBYesIWant.setGravity(Gravity.START | Gravity.CENTER_HORIZONTAL);

        //SETLAYOUT
        _CBYesIWant.setLayoutParams(yesiwantLayout);

        // Add View to Parent
        lMainLayout.addView(_CBYesIWant);


                                         //FIRSTNAME


        //LINEAR LAYOUT

        //         <LinearLayout
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:orientation="horizontal"
//        android:weightSum="2" >


        LinearLayout fnLayout = new LinearLayout(this);


        LinearLayout.LayoutParams fnLayoutParameters = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);


        fnLayout.setLayoutParams(fnLayoutParameters);
        fnLayout.setOrientation(LinearLayout.HORIZONTAL);
        fnLayout.setWeightSum(2);

        lMainLayout.addView(fnLayout);


        //TEXTVIEW

//        <EditText
//        android:id="@+id/firstname"
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:ems="10"
//        android:layout_weight="1"
//        android:inputType="textPersonName"
//        android:hint="Firstname" />

        EditText firstnameET = new EditText(this);
        LinearLayout.LayoutParams firstnameETLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        firstnameET.setEms(10);
        firstnameETLayout.weight=1;
        firstnameET.setLayoutParams(firstnameETLayout);

        firstnameET.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        firstnameET.setHint(R.string.fnText);


        fnLayout.addView(firstnameET);

        //SPACE

//         <Space
//        android:layout_width="match_parent"
//        android:layout_height="0dp"
//        android:layout_weight="1"/>

        Space spaceFN = new Space(this);
        LinearLayout.LayoutParams spaceFirstnameLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0);
        spaceFirstnameLayout.weight=1;

        spaceFN.setLayoutParams(spaceFirstnameLayout);

        fnLayout.addView(spaceFN);



        //LASTNAME

//        <LinearLayout
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:orientation="horizontal"
//        android:weightSum="2" >

        LinearLayout lnLayout = new LinearLayout(this);


        LinearLayout.LayoutParams lnLayoutParameters = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);


        fnLayout.setLayoutParams(lnLayoutParameters);
        fnLayout.setOrientation(LinearLayout.HORIZONTAL);
        fnLayout.setWeightSum(2);

        lMainLayout.addView(lnLayout);


//
//            <EditText
//        android:id="@+id/lastname"
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:ems="10"
//        android:layout_weight="1"
//        android:inputType="textPersonName"
//        android:hint="Lastname" />

        EditText lnET = new EditText(this);
        LinearLayout.LayoutParams lnETLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        lnET.setEms(10);
        lnETLayout.weight=1;
        lnET.setLayoutParams(lnETLayout);

        lnET.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        lnET.setHint(R.string.lnText);


        lnLayout.addView(lnET);
//




//            <Space
//        android:layout_width="match_parent"
//        android:layout_height="0dp"
//        android:layout_weight="1"/>
//        </LinearLayout>

        Space spaceLN = new Space(this);
        LinearLayout.LayoutParams spaceLNLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0);
        spaceLNLayout.weight=1;

        spaceLN.setLayoutParams(spaceLNLayout);

        lnLayout.addView(spaceLN);


                           //BUTTON

//        Button
//        android:id="@+id/validate"
//        android:layout_width="wrap_content"
//        android:layout_height="wrap_content"
//        android:text="ACCEPT" />

        Button buttonaccept= new Button(this);
        LinearLayout.LayoutParams acceptBLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        buttonaccept.setLayoutParams(acceptBLayout);

        buttonaccept.setText(R.string.buttontext);

        lMainLayout.addView(buttonaccept);





                                         //LASTNAME

        //LAYOUT

        //TEXTVIEW

    }




}

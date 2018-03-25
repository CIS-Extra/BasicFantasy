package org.lewisandclark.csd.basicfantasy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class RollAttributesActivity extends AppCompatActivity {

    public static final String TAG = "RollAttributesActivity";

    private Button mRollStats;
    private Button mAcceptStats;
    private Button mBackButton;

    private EditText mStrEditText;
    private EditText mIntEditText;
    private EditText mWisEditText;
    private EditText mDexEditText;
    private EditText mConEditText;
    private EditText mChaEditText;

    private TextView mStrModText;
    private TextView mIntModText;
    private TextView mWisModText;
    private TextView mDexModText;
    private TextView mConModText;
    private TextView mChaModText;
    private TextView mRollCounterTextView;

    private AttributeScore[] mStatArray = { new AttributeScore(0),
                                            new AttributeScore(0),
                                            new AttributeScore(0),
                                            new AttributeScore(0),
                                            new AttributeScore(0),
                                            new AttributeScore(0)};

    private HashMap<Attribute, AttributeScore> tempMap = new HashMap<Attribute, AttributeScore>();

    public static Intent newIntent(Context packageContext){
        Intent theIntent = new Intent(packageContext, RollAttributesActivity.class);
        //Intent Extras go here
        return theIntent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_attributes);

        mRollCounterTextView = findViewById(R.id.roll_counter);
        mRollCounterTextView.setText(Integer.toString(HomeActivity.sCharacters.get(HomeActivity.sCurrentCharacterIndex).getStatRollCounter()));

        mStrEditText = findViewById(R.id.str_score);
        mStrEditText.setText(Integer.toString(mStatArray[Attribute.STR.ordinal()].getScore()));
        mStrEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    mStatArray[Attribute.STR.ordinal()].setScore(Integer.parseInt(mStrEditText.getText().toString()));
                    mStrModText.setText("(" + Integer.toString(mStatArray[Attribute.STR.ordinal()].getModifier()) + ")");
                }
                catch (Exception e){
                    mStrModText.setText("(-)");
                }
            }
        });

        mIntEditText = findViewById(R.id.int_score);
        mIntEditText.setText(Integer.toString(mStatArray[1].getScore()));
        mIntEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    mStatArray[Attribute.INT.ordinal()].setScore(Integer.parseInt(mIntEditText.getText().toString()));
                    mIntModText.setText("(" + Integer.toString(mStatArray[Attribute.INT.ordinal()].getModifier()) + ")");
                }
                catch (Exception e){
                    mIntModText.setText("(-)");
                }
            }
        });

        mWisEditText = findViewById(R.id.wis_score);
        mWisEditText.setText(Integer.toString(mStatArray[2].getScore()));
        mWisEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    mStatArray[Attribute.WIS.ordinal()].setScore(Integer.parseInt(mWisEditText.getText().toString()));
                    mWisModText.setText("(" + Integer.toString(mStatArray[Attribute.WIS.ordinal()].getModifier()) + ")");
                }
                catch (Exception e){
                    mWisModText.setText("(-)");
                }
            }
        });

        mDexEditText = findViewById(R.id.dex_score);
        mDexEditText.setText(Integer.toString(mStatArray[3].getScore()));
        mDexEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    mStatArray[Attribute.DEX.ordinal()].setScore(Integer.parseInt(mDexEditText.getText().toString()));
                    mDexModText.setText("(" + Integer.toString(mStatArray[Attribute.DEX.ordinal()].getModifier()) + ")");
                }
                catch (Exception e){
                    mDexModText.setText("(-)");
                }
            }
        });

        mConEditText = findViewById(R.id.con_score);
        mConEditText.setText(Integer.toString(mStatArray[4].getScore()));
        mConEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    mStatArray[Attribute.CON.ordinal()].setScore(Integer.parseInt(mConEditText.getText().toString()));
                    mConModText.setText("(" + Integer.toString(mStatArray[Attribute.CON.ordinal()].getModifier()) + ")");
                }
                catch (Exception e){
                    mConModText.setText("(-)");
                }
            }
        });

        mChaEditText = findViewById(R.id.cha_score);
        mChaEditText.setText(Integer.toString(mStatArray[5].getScore()));
        mChaEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                try {
                    mStatArray[Attribute.CHA.ordinal()].setScore(Integer.parseInt(mChaEditText.getText().toString()));
                    mChaModText.setText("(" + Integer.toString(mStatArray[Attribute.CHA.ordinal()].getModifier()) + ")");
                }
                catch (Exception e){
                    mChaModText.setText("(-)");
                }
            }
        });


        mStrModText = findViewById(R.id.str_mod);
        mIntModText = findViewById(R.id.int_mod);
        mWisModText = findViewById(R.id.wis_mod);
        mDexModText = findViewById(R.id.dex_mod);
        mConModText = findViewById(R.id.con_mod);
        mChaModText = findViewById(R.id.cha_mod);

        //updateMods();

        mRollStats = findViewById(R.id.roll_stats_button);
        mRollStats.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //increment the counter
                HomeActivity.sCharacters.get(HomeActivity.sCurrentCharacterIndex).incrementStatRollCounter();
                mRollCounterTextView.setText(Integer.toString(HomeActivity.sCharacters.get(HomeActivity.sCurrentCharacterIndex).getStatRollCounter()));

                //disable editing
                mStrEditText.setInputType(InputType.TYPE_NULL);
                mIntEditText.setInputType(InputType.TYPE_NULL);
                mWisEditText.setInputType(InputType.TYPE_NULL);
                mDexEditText.setInputType(InputType.TYPE_NULL);
                mConEditText.setInputType(InputType.TYPE_NULL);
                mChaEditText.setInputType(InputType.TYPE_NULL);

                //generate the random stats
                Log.d(TAG, "RollStats clicked.");
                for (int i=0; i<mStatArray.length; i++){
                    mStatArray[i].setScore(DieRoller.statRoll());
                }

                mStrEditText.setText(Integer.toString(mStatArray[Attribute.STR.ordinal()].getScore()));
                mIntEditText.setText(Integer.toString(mStatArray[Attribute.INT.ordinal()].getScore()));
                mWisEditText.setText(Integer.toString(mStatArray[Attribute.WIS.ordinal()].getScore()));
                mDexEditText.setText(Integer.toString(mStatArray[Attribute.DEX.ordinal()].getScore()));
                mConEditText.setText(Integer.toString(mStatArray[Attribute.CON.ordinal()].getScore()));
                mChaEditText.setText(Integer.toString(mStatArray[Attribute.CHA.ordinal()].getScore()));
                updateMods();

            }
        });

        mAcceptStats = findViewById(R.id.accept_stats_button);
        mAcceptStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //put stats into player character record.
                Log.d(TAG, "AcceptStats clicked.");

                if(statsAreValid()) {
                    HomeActivity.sCharacters.get(HomeActivity.sCurrentCharacterIndex).setStatArray(mStatArray);

                    Intent intent = ChooseRaceActivity.newIntent(RollAttributesActivity.this);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(RollAttributesActivity.this, R.string.invalid_atributes, Toast.LENGTH_SHORT).show();
                }
            }
        });


        mBackButton = findViewById(R.id.back_button);
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    private boolean statsAreValid(){
        boolean isValid = true;
        int test;

        try{
            test = Integer.parseInt(mStrEditText.getText().toString());
            if(test > 18 || test <3){isValid = false;}
            test = Integer.parseInt(mIntEditText.getText().toString());
            if(test > 18 || test <3){isValid = false;}
            test = Integer.parseInt(mWisEditText.getText().toString());
            if(test > 18 || test <3){isValid = false;}
            test = Integer.parseInt(mDexEditText.getText().toString());
            if(test > 18 || test <3){isValid = false;}
            test = Integer.parseInt(mConEditText.getText().toString());
            if(test > 18 || test <3){isValid = false;}
            test = Integer.parseInt(mChaEditText.getText().toString());
            if(test > 18 || test <3){isValid = false;}

        }
        catch (Exception e){
            isValid = false;
        }

        return isValid;
    }

    public void updateMods(){


        mStrModText.setText("("+ Integer.toString(mStatArray[Attribute.STR.ordinal()].getModifier())+")");

        mIntModText.setText("("+ Integer.toString(mStatArray[Attribute.INT.ordinal()].getModifier())+")");

        mWisModText.setText("("+ Integer.toString(mStatArray[Attribute.WIS.ordinal()].getModifier())+")");

        mDexModText.setText("("+ Integer.toString(mStatArray[Attribute.DEX.ordinal()].getModifier())+")");

        mConModText.setText("("+ Integer.toString(mStatArray[Attribute.CON.ordinal()].getModifier())+")");

        mChaModText.setText("("+ Integer.toString(mStatArray[Attribute.CHA.ordinal()].getModifier())+")");
    }
}

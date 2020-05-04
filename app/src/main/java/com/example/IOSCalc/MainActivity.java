package com.example.IOSCalc;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import org.mariuszgromada.math.mxparser.Expression;


public class MainActivity extends AppCompatActivity  {

    private static final String TAG = "MainActivity";


    private ImageView acImageView;
    private ImageView factImageView;
    private ImageView percentageImageView;
    private ImageView divideImageView;


    private ImageView mSeven;
    private ImageView mEight;
    private ImageView mNine;
    private ImageView mMulti;


    private ImageView mFour;
    private ImageView mFive;
    private ImageView mSix;
    private ImageView mMinus;


    private ImageView mOne;
    private ImageView mTwo;
    private ImageView mThree;
    private ImageView mPlus;


    private ImageView mZero;
    private ImageView mComma;
    private  ImageView mPower;
    private ImageView mEqual;

    //TextFields

    private TextView mFormula;
    private TextView mResult;


    //computation
    private float mValueOne, mValueTwo;

    private  boolean mAddition, mSubtraction, mMultiplication, mDivision;

    //evaluate

    private GestureDetector myGestDetector;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myGestDetector = new GestureDetector(this, new MyGestureListener());


        mFormula=(TextView) findViewById(R.id.formula);

        mFormula.setOnTouchListener(touchListener);




        acImageView = (ImageView) findViewById(R.id.acimageView);
        acImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                acImageView.startAnimation(animation);
                mFormula.setText("");
                mResult.setText("");
//                String display = mFormula.getText().toString();
//
//                if(!TextUtils.isEmpty(display)) {
//                    display  = display.substring(0, display.length() - 1);
//
//                    mFormula.setText(display);
//                }

            }
        });

        mResult=(TextView)findViewById(R.id.result);



        factImageView = (ImageView) findViewById(R.id.factorial);
        factImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                factImageView.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"!");

            }
        });


        percentageImageView = (ImageView) findViewById(R.id.percentage);
        percentageImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                percentageImageView.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"^");

            }
        });


        divideImageView = (ImageView) findViewById(R.id.divide);
        divideImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                divideImageView.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"/");

            }
        });

        mSeven = (ImageView) findViewById(R.id.number_7);
        mSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mSeven.startAnimation(animation);

                mFormula.setText(mFormula.getText()+"7");






            }
        });

        mEight = (ImageView) findViewById(R.id.number_8);
        mEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mEight.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"8");

            }
        });


        mNine = (ImageView) findViewById(R.id.number_9);
        mNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mNine.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"9");

            }
        });


        mMulti = (ImageView) findViewById(R.id.multi);
        mMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mMulti.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"*");

            }
        });


        mFour = (ImageView) findViewById(R.id.number_4);
        mFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mFour.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"4");

            }
        });


        mFive = (ImageView) findViewById(R.id.number_5);
        mFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mFive.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"5");

            }
        });

        mSix = (ImageView) findViewById(R.id.number_6);
        mSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mSix.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"6");

            }
        });


        mMinus = (ImageView) findViewById(R.id.minus);
        mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mMinus.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"-");

            }
        });


        mOne = (ImageView) findViewById(R.id.number_1);
        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mOne.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"1");
            }
        });

        mThree = (ImageView) findViewById(R.id.number_3);
        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mThree.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"3");

            }
        });


        mTwo = (ImageView) findViewById(R.id.number_2);
        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mTwo.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"2");

            }
        });


        mPlus = (ImageView) findViewById(R.id.plus);
        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mPlus.startAnimation(animation);

              mFormula.setText(mFormula.getText()+"+");

            }
        });



        mZero = (ImageView) findViewById(R.id.zero);
        mZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mZero.startAnimation(animation);
                mFormula.setText(mFormula.getText()+"0");

            }
        });

        mComma = (ImageView) findViewById(R.id.comma);
        mComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mComma.startAnimation(animation);
                mFormula.setText(mFormula.getText()+".");

            }
        });


        mEqual = (ImageView) findViewById(R.id.equal);
        mEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                mEqual.startAnimation(animation);
//                mValueTwo=Float.parseFloat(mFormula.getText()+"");
//
//                if(mAddition==true)
//                {
//                    mResult.setText(mValueOne+mValueTwo+"");
//                    mAddition=false;
//                }

                Expression exp=new Expression(mFormula.getText()+"");
              double answer=exp.calculate();

              String solution=String.valueOf(answer);

              mResult.setText(solution);












  
            }
        });

    }



    View.OnTouchListener touchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            // pass the events to the gesture detector
            // a return value of true means the detector is handling it
            // a return value of false means the detector didn't
            // recognize the event
            return myGestDetector.onTouchEvent(event);

        }
    };

    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onDown(MotionEvent event) {
            Log.d("TAG","onDown: ");

            // don't return false here or else none of the other
            // gestures will work
            return true;
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Log.i("TAG", "onSingleTapConfirmed: ");


            return true;
        }

        @Override
        public void onLongPress(MotionEvent e) {
            Log.i("TAG", "onLongPress: ");
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Log.i("TAG", "onDoubleTap: ");
            return true;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2,
                                float distanceX, float distanceY) {
//            Log.i("TAG", "onScroll: ");
            Toast.makeText(MainActivity.this, "i'm done", Toast.LENGTH_SHORT).show();
            return true;


        }

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2,
                               float velocityX, float velocityY) {
            Log.d("TAG", "onFling: ");
            return true;
        }
    }
}



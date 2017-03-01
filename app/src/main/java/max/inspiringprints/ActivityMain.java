package max.inspiringprints;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class ActivityMain extends Activity {



    ImageButton b,b1,b2,b3,b4,b5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        b = (ImageButton)findViewById(R.id.imageButton);
        b1 = (ImageButton)findViewById(R.id.imageButton2);
        b2 = (ImageButton)findViewById(R.id.imageButton3);
        b3 = (ImageButton)findViewById(R.id.imageButton4);
        b4 = (ImageButton)findViewById(R.id.imageButton5);
        b5 = (ImageButton)findViewById(R.id.imageButton6);

    }

    public void Vizitki(View v){
        Animation animation9 = AnimationUtils.loadAnimation(this, R.anim.but_ani);
        b.startAnimation(animation9);
        Intent intent = new Intent(ActivityMain.this, Business_cards.class);
        startActivity(intent);
    }
    public void Flaeru(View v){
        Animation animation9 = AnimationUtils.loadAnimation(this, R.anim.but_ani);
        b2.startAnimation(animation9);
        Intent intent = new Intent(ActivityMain.this, Flyers.class);
        startActivity(intent);
    }
    public void Plakatu(View v){
        Animation animation9 = AnimationUtils.loadAnimation(this, R.anim.but_ani);
        b4.startAnimation(animation9);
        Intent intent = new Intent(ActivityMain.this, Posters.class);
        startActivity(intent);
    }
    public void Chashki(View v){
        Animation animation9 = AnimationUtils.loadAnimation(this, R.anim.but_ani);
        b1.startAnimation(animation9);
        Intent intent = new Intent(ActivityMain.this, Cups.class);
        startActivity(intent);
    }
    public void Futbolki(View v){
        Animation animation9 = AnimationUtils.loadAnimation(this, R.anim.but_ani);
        b3.startAnimation(animation9);
        Intent intent = new Intent(ActivityMain.this, T_Shirts.class);
        startActivity(intent);
    }
    public void Pazlu(View v){
        Animation animation9 = AnimationUtils.loadAnimation(this, R.anim.but_ani);
        b5.startAnimation(animation9);
        Intent intent = new Intent(ActivityMain.this, Puzzles.class);
        startActivity(intent);
    }

}
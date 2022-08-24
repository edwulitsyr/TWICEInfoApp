package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

/**
 * Activity responsible for displaying informational text
 */
public class MoreInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);

        // Find the textview used for displaying all the text in this activity
        TextView textView = findViewById(R.id.more_info_text);

        // get string to use in this activity's textview
        int origin = 0;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            origin = extras.getInt(MainActivity.ORIGIN_EXTRA_TAG);
        }

        // set textview according to the origin of the more info request
        switch (origin) {
            case Origin.ABOUT:
                this.setTitle(R.string.about_twice);
                textView.setText(R.string.twice_more_info);
                break;
            case Origin.NAYEON:
                this.setTitle(R.string.nayeon);
                textView.setText(R.string.about_nayeon);
                break;
            case Origin.JIHYO:
                this.setTitle(R.string.jihyo);
                textView.setText(R.string.about_jihyo);
                break;
            case Origin.MINA:
                this.setTitle(R.string.mina);
                textView.setText(R.string.about_mina);
                break;
            case Origin.JEONGYEON:
                this.setTitle(R.string.jeongyeon);
                textView.setText(R.string.about_jeongyeon);
                break;
            case Origin.MOMO:
                this.setTitle(R.string.momo);
                textView.setText(R.string.about_momo);
                break;
            case Origin.SANA:
                this.setTitle(R.string.sana);
                textView.setText(R.string.about_sana);
                break;
            case Origin.CHAEYOUNG:
                this.setTitle(R.string.chaeyoung);
                textView.setText(R.string.about_chaeyoung);
                break;
            case Origin.DAHYUN:
                this.setTitle(R.string.dahyun);
                textView.setText(R.string.about_dahyun);
                break;
            case Origin.TZUYU:
                this.setTitle(R.string.tzuyu);
                textView.setText(R.string.about_tzuyu);
                break;
            case Origin.LIKE_OOH_AHH:
                this.setTitle(SongsFragment.SONG_LIKE_OOH_AHH);
                textView.setText(R.string.lyrics_like_ooh_ahh);
                break;
            case Origin.CHEER_UP:
                this.setTitle(SongsFragment.SONG_CHEER_UP);
                textView.setText(R.string.lyrics_cheer_up);
                break;
            case Origin.FEEL_SPECIAL:
                this.setTitle(SongsFragment.SONG_FEEL_SPECIAL);
                textView.setText(R.string.lyrics_feel_special);
                break;
            case Origin.TT:
                this.setTitle(SongsFragment.SONG_TT);
                textView.setText(R.string.lyrics_tt);
                break;
            case Origin.DTNA:
                this.setTitle(SongsFragment.SONG_DTNA);
                textView.setText(R.string.lyrics_dtna);
                break;
            case Origin.YES_OR_YES:
                this.setTitle(SongsFragment.SONG_YES_OR_YES);
                textView.setText(R.string.lyrics_yes_or_yes);
                break;
            case Origin.SAY_YOU_LOVE_ME:
                this.setTitle(SongsFragment.SONG_SAY_YOU_LOVE_ME);
                textView.setText(R.string.lyrics_say_you_love_me);
                break;
            case Origin.HEART_SHAKER:
                this.setTitle(SongsFragment.SONG_HEART_SHAKER);
                textView.setText(R.string.lyrics_heart_shaker);
                break;
            case Origin.ICSM:
                this.setTitle(SongsFragment.SONG_ICSM);
                textView.setText(R.string.lyrics_icsm);
                break;
            case Origin.THE_FEELS:
                this.setTitle(SongsFragment.SONG_THE_FEELS);
                textView.setText(R.string.lyrics_the_feels);
                break;
            case Origin.SCIENTIST:
                this.setTitle(SongsFragment.SONG_SCIENTIST);
                textView.setText(R.string.lyrics_scientist);
                break;
            case Origin.BETTER:
                this.setTitle(SongsFragment.SONG_BETTER);
                textView.setText(R.string.lyrics_better);
                break;
            case Origin.WHAT_IS_LOVE:
                this.setTitle(SongsFragment.SONG_WHAT_IS_LOVE);
                textView.setText(R.string.lyrics_what_is_love);
                break;
            case Origin.SIGNAL:
                this.setTitle(SongsFragment.SONG_SIGNAL);
                textView.setText(R.string.lyrics_signal);
                break;
            case Origin.KURA_KURA:
                this.setTitle(SongsFragment.SONG_KURA_KURA);
                textView.setText(R.string.lyrics_kura_kura);
                break;
        }

        // allow vertical scrolling
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
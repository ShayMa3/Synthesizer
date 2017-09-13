package com.example.shay.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton,
            challenge1Button, challenge2Button, challenge3Button, challenge12Button, challenge13Button;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote,
            haNote, hasNote, hbNote, hcsNote, hdNote, heNote, hdsNote, hfsNote, hfNote, hcNote, hgNote;
    private NumberPicker numberPicker1, numberPicker2;
    private MediaPlayer[] notes;
    private final int WHOLE_NOTE = 1000;
    private MediaPlayer[] eNotes;
    private MediaPlayer[] fireflies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListener();
        createMediaPlayer();
        numberPicker1.setMinValue(0);
        numberPicker1.setMaxValue(10);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(11);
        numberPicker2.setDisplayedValues(new String[]{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"});

        notes = new MediaPlayer[]{aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote};
        eNotes = new MediaPlayer[]{eNote, fsNote, gsNote, haNote, hbNote, hcsNote, hdsNote, heNote};
        fireflies = new MediaPlayer[] {hasNote, hfNote, hfNote, hdsNote, hfNote, hdsNote, hasNote, hcNote, hcNote, hasNote, hcNote, hdsNote, hfNote,
        hgNote, hfNote, hdsNote, hasNote, hasNote, hfNote, hdsNote, hcNote};
    }


    private void createMediaPlayer() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        haNote = MediaPlayer.create(this, R.raw.scalehigha);
        hasNote = MediaPlayer.create(this, R.raw.scalehighbb);
        hbNote = MediaPlayer.create(this, R.raw.scalehighb);
        hcsNote = MediaPlayer.create(this, R.raw.scalehighcs);
        hdNote = MediaPlayer.create(this, R.raw.scalehighd);
        hdsNote = MediaPlayer.create(this, R.raw.scalehighds);
        heNote = MediaPlayer.create(this, R.raw.scalehighe);
        hfsNote = MediaPlayer.create(this, R.raw.scalehighfs);
        hfNote = MediaPlayer.create(this, R.raw.scalehighf);
        hcNote = MediaPlayer.create(this, R.raw.scalehighc);
        hgNote = MediaPlayer.create(this, R.raw.scalehighg);


        // MediaPlayer notes[] = new MediaPlayer[12];
    }

    private void setListener() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        challenge1Button.setOnClickListener(this);
        numberPicker1.setOnClickListener(this);
        numberPicker2.setOnClickListener(this);
        challenge2Button.setOnClickListener(this);
        challenge3Button.setOnClickListener(this);
        challenge12Button.setOnClickListener(this);
        challenge13Button.setOnClickListener(this);


    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        challenge1Button = (Button) findViewById(R.id.challenge_1_button);
        numberPicker1 = (NumberPicker) findViewById(R.id.numberPicker1);
        numberPicker2 = (NumberPicker) findViewById(R.id.numberPicker2);
        challenge2Button = (Button) findViewById(R.id.challenge_2_button);
        challenge3Button = (Button) findViewById(R.id.challenge_3_button);
        challenge12Button = (Button) findViewById(R.id.challenge_12_button);
        challenge13Button = (Button) findViewById(R.id.challenge_13_button);


    }

    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.challenge_1_button:
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                gsNote.seekTo(0);
                gsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                haNote.seekTo(0);
                haNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hbNote.seekTo(0);
                hbNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hcsNote.seekTo(0);
                hcsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hdsNote.seekTo(0);
                hdsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                break;

            case R.id.challenge_2_button:
                int k = numberPicker2.getValue();
                for (int i = 0; i < numberPicker1.getValue(); i++) {
                    notes[k].seekTo(0);
                    notes[k].start();
                    delayPlaying(WHOLE_NOTE / 2);
                }
                break;

            case R.id.challenge_3_button:
                for (int i = 0; i < eNotes.length; i++)
                {eNotes[i].seekTo(0);
                eNotes[i].start();
                delayPlaying(WHOLE_NOTE / 2);}
                break;

            case R.id.challenge_12_button:
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hfsNote.seekTo(0);
                hfsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hfsNote.seekTo(0);
                hfsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                break;

            case R.id.challenge_13_button:
                for (int i = 0; i < fireflies.length; i++)
                {fireflies[i].seekTo(0);
                    fireflies[i].start();
                    delayPlaying(WHOLE_NOTE / 2);}
                break;

            case R.id.button_a:
                aNote.seekTo(0); //restarts note at the beginning
                aNote.start();
                delayPlaying(1000); //milliseconds
                break;
            case R.id.button_as:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            default:
                //the else statement
        }
    }
}

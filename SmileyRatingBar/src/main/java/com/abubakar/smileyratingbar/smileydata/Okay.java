package com.abubakar.smileyratingbar.smileydata;

import android.graphics.Color;

public class Okay extends Smiley {

    public Okay() {
        super(-135, 360);
        createStraightSmile(new Point(CENTER_SMILE, MOUTH_CENTER_Y), (CENTER_SMILE * 0.1f), 350f, (CENTER_SMILE * 0.9f));
        setup(
                getClass().getSimpleName(),
                Color.parseColor("#f2dd68"),
                Color.parseColor("#353431")
        );
    }

}

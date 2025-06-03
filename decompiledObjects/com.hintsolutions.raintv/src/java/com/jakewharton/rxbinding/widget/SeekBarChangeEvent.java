/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public abstract class SeekBarChangeEvent
extends ViewEvent<SeekBar> {
    public SeekBarChangeEvent(@NonNull SeekBar seekBar) {
        super(seekBar);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.widget.SeekBarChangeEvent;

public final class SeekBarStopChangeEvent
extends SeekBarChangeEvent {
    private SeekBarStopChangeEvent(@NonNull SeekBar seekBar) {
        super(seekBar);
    }

    @CheckResult
    @NonNull
    public static SeekBarStopChangeEvent create(@NonNull SeekBar seekBar) {
        return new SeekBarStopChangeEvent(seekBar);
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof SeekBarStopChangeEvent && ((SeekBarStopChangeEvent)object).view() == this.view();
        return bl;
    }

    public int hashCode() {
        return ((SeekBar)this.view()).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("SeekBarStopChangeEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


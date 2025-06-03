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
import com.jakewharton.rxbinding.view.ViewEvent;
import com.jakewharton.rxbinding.widget.SeekBarChangeEvent;

public final class SeekBarProgressChangeEvent
extends SeekBarChangeEvent {
    private final boolean fromUser;
    private final int progress;

    private SeekBarProgressChangeEvent(@NonNull SeekBar seekBar, int n4, boolean bl) {
        super(seekBar);
        this.progress = n4;
        this.fromUser = bl;
    }

    @CheckResult
    @NonNull
    public static SeekBarProgressChangeEvent create(@NonNull SeekBar seekBar, int n4, boolean bl) {
        return new SeekBarProgressChangeEvent(seekBar, n4, bl);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof SeekBarProgressChangeEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (SeekBarProgressChangeEvent)object)).view() != this.view() || ((SeekBarProgressChangeEvent)object).progress != this.progress || ((SeekBarProgressChangeEvent)object).fromUser != this.fromUser) {
            bl = false;
        }
        return bl;
    }

    public boolean fromUser() {
        return this.fromUser;
    }

    public int hashCode() {
        return ((((SeekBar)this.view()).hashCode() + 629) * 37 + this.progress) * 37 + this.fromUser;
    }

    public int progress() {
        return this.progress;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("SeekBarProgressChangeEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append(", progress=");
        stringBuilder.append(this.progress);
        stringBuilder.append(", fromUser=");
        stringBuilder.append(this.fromUser);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


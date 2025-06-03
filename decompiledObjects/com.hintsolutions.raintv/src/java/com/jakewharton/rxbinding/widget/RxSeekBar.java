/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.SeekBarChangeEvent
 *  com.jakewharton.rxbinding.widget.SeekBarChangeEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.SeekBarChangeOnSubscribe
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 */
package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.SeekBarChangeEvent;
import com.jakewharton.rxbinding.widget.SeekBarChangeEventOnSubscribe;
import com.jakewharton.rxbinding.widget.SeekBarChangeOnSubscribe;
import rx.Observable;

public final class RxSeekBar {
    private RxSeekBar() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Observable<SeekBarChangeEvent> changeEvents(@NonNull SeekBar seekBar) {
        Preconditions.checkNotNull(seekBar, "view == null");
        return Observable.create((Observable.OnSubscribe)new SeekBarChangeEventOnSubscribe(seekBar));
    }

    @CheckResult
    @NonNull
    public static Observable<Integer> changes(@NonNull SeekBar seekBar) {
        Preconditions.checkNotNull(seekBar, "view == null");
        return Observable.create((Observable.OnSubscribe)new SeekBarChangeOnSubscribe(seekBar, null));
    }

    @CheckResult
    @NonNull
    public static Observable<Integer> systemChanges(@NonNull SeekBar seekBar) {
        Preconditions.checkNotNull(seekBar, "view == null");
        return Observable.create((Observable.OnSubscribe)new SeekBarChangeOnSubscribe(seekBar, Boolean.FALSE));
    }

    @CheckResult
    @NonNull
    public static Observable<Integer> userChanges(@NonNull SeekBar seekBar) {
        Preconditions.checkNotNull(seekBar, "view == null");
        return Observable.create((Observable.OnSubscribe)new SeekBarChangeOnSubscribe(seekBar, Boolean.TRUE));
    }
}


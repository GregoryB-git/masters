/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.CompoundButtonCheckedChangeOnSubscribe
 *  com.jakewharton.rxbinding.widget.RxCompoundButton$1
 *  com.jakewharton.rxbinding.widget.RxCompoundButton$2
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.CompoundButton;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.CompoundButtonCheckedChangeOnSubscribe;
import com.jakewharton.rxbinding.widget.RxCompoundButton;
import rx.Observable;
import rx.functions.Action1;

public final class RxCompoundButton {
    private RxCompoundButton() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> checked(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return new 1(compoundButton);
    }

    @CheckResult
    @NonNull
    public static Observable<Boolean> checkedChanges(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return Observable.create((Observable.OnSubscribe)new CompoundButtonCheckedChangeOnSubscribe(compoundButton));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Object> toggle(@NonNull CompoundButton compoundButton) {
        Preconditions.checkNotNull(compoundButton, "view == null");
        return new 2(compoundButton);
    }
}


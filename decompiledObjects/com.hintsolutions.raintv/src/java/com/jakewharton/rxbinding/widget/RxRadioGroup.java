/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RadioGroup
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.RadioGroupCheckedChangeOnSubscribe
 *  com.jakewharton.rxbinding.widget.RxRadioGroup$1
 *  java.lang.AssertionError
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.RadioGroup;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.RadioGroupCheckedChangeOnSubscribe;
import com.jakewharton.rxbinding.widget.RxRadioGroup;
import rx.Observable;
import rx.functions.Action1;

public final class RxRadioGroup {
    private RxRadioGroup() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> checked(@NonNull RadioGroup radioGroup) {
        Preconditions.checkNotNull(radioGroup, "view == null");
        return new 1(radioGroup);
    }

    @CheckResult
    @NonNull
    public static Observable<Integer> checkedChanges(@NonNull RadioGroup radioGroup) {
        Preconditions.checkNotNull(radioGroup, "view == null");
        return Observable.create((Observable.OnSubscribe)new RadioGroupCheckedChangeOnSubscribe(radioGroup)).distinctUntilChanged();
    }
}


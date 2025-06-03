/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AutoCompleteTextView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.AdapterViewItemClickEvent
 *  com.jakewharton.rxbinding.widget.AutoCompleteTextViewItemClickEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.RxAutoCompleteTextView$1
 *  com.jakewharton.rxbinding.widget.RxAutoCompleteTextView$2
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.AutoCompleteTextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.AdapterViewItemClickEvent;
import com.jakewharton.rxbinding.widget.AutoCompleteTextViewItemClickEventOnSubscribe;
import com.jakewharton.rxbinding.widget.RxAutoCompleteTextView;
import rx.Observable;
import rx.functions.Action1;

public final class RxAutoCompleteTextView {
    private RxAutoCompleteTextView() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super CharSequence> completionHint(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return new 1(autoCompleteTextView);
    }

    @CheckResult
    @NonNull
    public static Observable<AdapterViewItemClickEvent> itemClickEvents(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return Observable.create((Observable.OnSubscribe)new AutoCompleteTextViewItemClickEventOnSubscribe(autoCompleteTextView));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> threshold(@NonNull AutoCompleteTextView autoCompleteTextView) {
        Preconditions.checkNotNull(autoCompleteTextView, "view == null");
        return new 2(autoCompleteTextView);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CheckedTextView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.RxCheckedTextView$1
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Object
 *  rx.functions.Action1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.CheckedTextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.RxCheckedTextView;
import rx.functions.Action1;

public final class RxCheckedTextView {
    private RxCheckedTextView() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> check(@NonNull CheckedTextView checkedTextView) {
        Preconditions.checkNotNull(checkedTextView, "view == null");
        return new 1(checkedTextView);
    }
}


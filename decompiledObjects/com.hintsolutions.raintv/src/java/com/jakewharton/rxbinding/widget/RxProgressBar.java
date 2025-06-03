/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ProgressBar
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.RxProgressBar$1
 *  com.jakewharton.rxbinding.widget.RxProgressBar$2
 *  com.jakewharton.rxbinding.widget.RxProgressBar$3
 *  com.jakewharton.rxbinding.widget.RxProgressBar$4
 *  com.jakewharton.rxbinding.widget.RxProgressBar$5
 *  com.jakewharton.rxbinding.widget.RxProgressBar$6
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.functions.Action1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.ProgressBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.RxProgressBar;
import rx.functions.Action1;

public final class RxProgressBar {
    private RxProgressBar() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> incrementProgressBy(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new 1(progressBar);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> incrementSecondaryProgressBy(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new 2(progressBar);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> indeterminate(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new 3(progressBar);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> max(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new 4(progressBar);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> progress(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new 5(progressBar);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> secondaryProgress(@NonNull ProgressBar progressBar) {
        Preconditions.checkNotNull(progressBar, "view == null");
        return new 6(progressBar);
    }
}


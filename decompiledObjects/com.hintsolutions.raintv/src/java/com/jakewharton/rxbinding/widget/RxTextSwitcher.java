/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextSwitcher
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.RxTextSwitcher$1
 *  com.jakewharton.rxbinding.widget.RxTextSwitcher$2
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Object
 *  rx.functions.Action1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.TextSwitcher;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.RxTextSwitcher;
import rx.functions.Action1;

public final class RxTextSwitcher {
    private RxTextSwitcher() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super CharSequence> currentText(@NonNull TextSwitcher textSwitcher) {
        Preconditions.checkNotNull(textSwitcher, "view == null");
        return new 2(textSwitcher);
    }

    @CheckResult
    @NonNull
    public static Action1<? super CharSequence> text(@NonNull TextSwitcher textSwitcher) {
        Preconditions.checkNotNull(textSwitcher, "view == null");
        return new 1(textSwitcher);
    }
}


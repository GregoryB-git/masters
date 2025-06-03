/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.AbsListViewScrollEvent
 *  com.jakewharton.rxbinding.widget.AbsListViewScrollEventOnSubscribe
 *  java.lang.AssertionError
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 */
package com.jakewharton.rxbinding.widget;

import android.widget.AbsListView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.AbsListViewScrollEvent;
import com.jakewharton.rxbinding.widget.AbsListViewScrollEventOnSubscribe;
import rx.Observable;

public final class RxAbsListView {
    private RxAbsListView() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Observable<AbsListViewScrollEvent> scrollEvents(@NonNull AbsListView absListView) {
        Preconditions.checkNotNull(absListView, "absListView == null");
        return Observable.create((Observable.OnSubscribe)new AbsListViewScrollEventOnSubscribe(absListView));
    }
}


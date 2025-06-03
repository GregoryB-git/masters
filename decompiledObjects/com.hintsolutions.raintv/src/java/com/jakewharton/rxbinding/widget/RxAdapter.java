/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.Adapter
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.AdapterDataChangeOnSubscribe
 *  java.lang.AssertionError
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 */
package com.jakewharton.rxbinding.widget;

import android.widget.Adapter;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.AdapterDataChangeOnSubscribe;
import rx.Observable;

public final class RxAdapter {
    private RxAdapter() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<T> dataChanges(@NonNull T t) {
        Preconditions.checkNotNull(t, "adapter == null");
        return Observable.create((Observable.OnSubscribe)new AdapterDataChangeOnSubscribe(t));
    }
}


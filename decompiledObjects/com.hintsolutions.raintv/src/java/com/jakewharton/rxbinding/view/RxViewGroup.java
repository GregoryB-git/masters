/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.view.ViewGroupHierarchyChangeEvent
 *  com.jakewharton.rxbinding.view.ViewGroupHierarchyChangeEventOnSubscribe
 *  java.lang.AssertionError
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 */
package com.jakewharton.rxbinding.view;

import android.view.ViewGroup;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.view.ViewGroupHierarchyChangeEvent;
import com.jakewharton.rxbinding.view.ViewGroupHierarchyChangeEventOnSubscribe;
import rx.Observable;

public final class RxViewGroup {
    private RxViewGroup() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Observable<ViewGroupHierarchyChangeEvent> changeEvents(@NonNull ViewGroup viewGroup) {
        Preconditions.checkNotNull(viewGroup, "viewGroup == null");
        return Observable.create((Observable.OnSubscribe)new ViewGroupHierarchyChangeEventOnSubscribe(viewGroup));
    }
}


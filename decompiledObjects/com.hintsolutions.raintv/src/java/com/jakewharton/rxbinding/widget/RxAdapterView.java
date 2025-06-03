/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.Adapter
 *  android.widget.AdapterView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.AdapterViewItemClickEvent
 *  com.jakewharton.rxbinding.widget.AdapterViewItemClickEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.AdapterViewItemClickOnSubscribe
 *  com.jakewharton.rxbinding.widget.AdapterViewItemLongClickEvent
 *  com.jakewharton.rxbinding.widget.AdapterViewItemLongClickEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.AdapterViewItemLongClickOnSubscribe
 *  com.jakewharton.rxbinding.widget.AdapterViewItemSelectionOnSubscribe
 *  com.jakewharton.rxbinding.widget.AdapterViewSelectionEvent
 *  com.jakewharton.rxbinding.widget.AdapterViewSelectionOnSubscribe
 *  com.jakewharton.rxbinding.widget.RxAdapterView$1
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 *  rx.functions.Func0
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Functions;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.AdapterViewItemClickEvent;
import com.jakewharton.rxbinding.widget.AdapterViewItemClickEventOnSubscribe;
import com.jakewharton.rxbinding.widget.AdapterViewItemClickOnSubscribe;
import com.jakewharton.rxbinding.widget.AdapterViewItemLongClickEvent;
import com.jakewharton.rxbinding.widget.AdapterViewItemLongClickEventOnSubscribe;
import com.jakewharton.rxbinding.widget.AdapterViewItemLongClickOnSubscribe;
import com.jakewharton.rxbinding.widget.AdapterViewItemSelectionOnSubscribe;
import com.jakewharton.rxbinding.widget.AdapterViewSelectionEvent;
import com.jakewharton.rxbinding.widget.AdapterViewSelectionOnSubscribe;
import com.jakewharton.rxbinding.widget.RxAdapterView;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;

public final class RxAdapterView {
    private RxAdapterView() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<AdapterViewItemClickEvent> itemClickEvents(@NonNull AdapterView<T> adapterView) {
        Preconditions.checkNotNull(adapterView, "view == null");
        return Observable.create((Observable.OnSubscribe)new AdapterViewItemClickEventOnSubscribe(adapterView));
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<Integer> itemClicks(@NonNull AdapterView<T> adapterView) {
        Preconditions.checkNotNull(adapterView, "view == null");
        return Observable.create((Observable.OnSubscribe)new AdapterViewItemClickOnSubscribe(adapterView));
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<AdapterViewItemLongClickEvent> itemLongClickEvents(@NonNull AdapterView<T> adapterView) {
        Preconditions.checkNotNull(adapterView, "view == null");
        return RxAdapterView.itemLongClickEvents(adapterView, Functions.FUNC1_ALWAYS_TRUE);
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<AdapterViewItemLongClickEvent> itemLongClickEvents(@NonNull AdapterView<T> adapterView, @NonNull Func1<? super AdapterViewItemLongClickEvent, Boolean> func1) {
        Preconditions.checkNotNull(adapterView, "view == null");
        Preconditions.checkNotNull(func1, "handled == null");
        return Observable.create((Observable.OnSubscribe)new AdapterViewItemLongClickEventOnSubscribe(adapterView, func1));
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<Integer> itemLongClicks(@NonNull AdapterView<T> adapterView) {
        Preconditions.checkNotNull(adapterView, "view == null");
        return RxAdapterView.itemLongClicks(adapterView, Functions.FUNC0_ALWAYS_TRUE);
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<Integer> itemLongClicks(@NonNull AdapterView<T> adapterView, @NonNull Func0<Boolean> func0) {
        Preconditions.checkNotNull(adapterView, "view == null");
        Preconditions.checkNotNull(func0, "handled == null");
        return Observable.create((Observable.OnSubscribe)new AdapterViewItemLongClickOnSubscribe(adapterView, func0));
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<Integer> itemSelections(@NonNull AdapterView<T> adapterView) {
        Preconditions.checkNotNull(adapterView, "view == null");
        return Observable.create((Observable.OnSubscribe)new AdapterViewItemSelectionOnSubscribe(adapterView));
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Action1<? super Integer> selection(@NonNull AdapterView<T> adapterView) {
        Preconditions.checkNotNull(adapterView, "view == null");
        return new 1(adapterView);
    }

    @CheckResult
    @NonNull
    public static <T extends Adapter> Observable<AdapterViewSelectionEvent> selectionEvents(@NonNull AdapterView<T> adapterView) {
        Preconditions.checkNotNull(adapterView, "view == null");
        return Observable.create((Observable.OnSubscribe)new AdapterViewSelectionOnSubscribe(adapterView));
    }
}


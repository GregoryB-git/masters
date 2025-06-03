/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SearchView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.RxSearchView$1
 *  com.jakewharton.rxbinding.widget.SearchViewQueryTextChangeEventsOnSubscribe
 *  com.jakewharton.rxbinding.widget.SearchViewQueryTextChangesOnSubscribe
 *  com.jakewharton.rxbinding.widget.SearchViewQueryTextEvent
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.RxSearchView;
import com.jakewharton.rxbinding.widget.SearchViewQueryTextChangeEventsOnSubscribe;
import com.jakewharton.rxbinding.widget.SearchViewQueryTextChangesOnSubscribe;
import com.jakewharton.rxbinding.widget.SearchViewQueryTextEvent;
import rx.Observable;
import rx.functions.Action1;

public final class RxSearchView {
    private RxSearchView() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super CharSequence> query(@NonNull SearchView searchView, boolean bl) {
        Preconditions.checkNotNull(searchView, "view == null");
        return new 1(searchView, bl);
    }

    @CheckResult
    @NonNull
    public static Observable<SearchViewQueryTextEvent> queryTextChangeEvents(@NonNull SearchView searchView) {
        Preconditions.checkNotNull(searchView, "view == null");
        return Observable.create((Observable.OnSubscribe)new SearchViewQueryTextChangeEventsOnSubscribe(searchView));
    }

    @CheckResult
    @NonNull
    public static Observable<CharSequence> queryTextChanges(@NonNull SearchView searchView) {
        Preconditions.checkNotNull(searchView, "view == null");
        return Observable.create((Observable.OnSubscribe)new SearchViewQueryTextChangesOnSubscribe(searchView));
    }
}


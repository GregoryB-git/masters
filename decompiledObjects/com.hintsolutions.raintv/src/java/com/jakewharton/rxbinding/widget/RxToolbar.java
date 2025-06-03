/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.view.MenuItem
 *  android.widget.Toolbar
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.ToolbarItemClickOnSubscribe
 *  com.jakewharton.rxbinding.widget.ToolbarNavigationClickOnSubscribe
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 */
package com.jakewharton.rxbinding.widget;

import android.annotation.TargetApi;
import android.view.MenuItem;
import android.widget.Toolbar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.ToolbarItemClickOnSubscribe;
import com.jakewharton.rxbinding.widget.ToolbarNavigationClickOnSubscribe;
import rx.Observable;

@TargetApi(value=21)
public final class RxToolbar {
    private RxToolbar() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Observable<MenuItem> itemClicks(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return Observable.create((Observable.OnSubscribe)new ToolbarItemClickOnSubscribe(toolbar));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> navigationClicks(@NonNull Toolbar toolbar) {
        Preconditions.checkNotNull(toolbar, "view == null");
        return Observable.create((Observable.OnSubscribe)new ToolbarNavigationClickOnSubscribe(toolbar));
    }
}


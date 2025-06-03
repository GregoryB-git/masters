/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.widget.PopupMenu
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.PopupMenuDismissOnSubscribe
 *  com.jakewharton.rxbinding.widget.PopupMenuItemClickOnSubscribe
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 */
package com.jakewharton.rxbinding.widget;

import android.view.MenuItem;
import android.widget.PopupMenu;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.PopupMenuDismissOnSubscribe;
import com.jakewharton.rxbinding.widget.PopupMenuItemClickOnSubscribe;
import rx.Observable;

public final class RxPopupMenu {
    private RxPopupMenu() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Observable<Void> dismisses(@NonNull PopupMenu popupMenu) {
        Preconditions.checkNotNull(popupMenu, "view == null");
        return Observable.create((Observable.OnSubscribe)new PopupMenuDismissOnSubscribe(popupMenu));
    }

    @CheckResult
    @NonNull
    public static Observable<MenuItem> itemClicks(@NonNull PopupMenu popupMenu) {
        Preconditions.checkNotNull(popupMenu, "view == null");
        return Observable.create((Observable.OnSubscribe)new PopupMenuItemClickOnSubscribe(popupMenu));
    }
}


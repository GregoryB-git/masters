/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.view.MenuItemActionViewEvent
 *  com.jakewharton.rxbinding.view.MenuItemActionViewEventOnSubscribe
 *  com.jakewharton.rxbinding.view.MenuItemClickOnSubscribe
 *  com.jakewharton.rxbinding.view.RxMenuItem$1
 *  com.jakewharton.rxbinding.view.RxMenuItem$2
 *  com.jakewharton.rxbinding.view.RxMenuItem$3
 *  com.jakewharton.rxbinding.view.RxMenuItem$4
 *  com.jakewharton.rxbinding.view.RxMenuItem$5
 *  com.jakewharton.rxbinding.view.RxMenuItem$6
 *  com.jakewharton.rxbinding.view.RxMenuItem$7
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.view;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Functions;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.view.MenuItemActionViewEvent;
import com.jakewharton.rxbinding.view.MenuItemActionViewEventOnSubscribe;
import com.jakewharton.rxbinding.view.MenuItemClickOnSubscribe;
import com.jakewharton.rxbinding.view.RxMenuItem;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

public final class RxMenuItem {
    private RxMenuItem() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Observable<MenuItemActionViewEvent> actionViewEvents(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return Observable.create((Observable.OnSubscribe)new MenuItemActionViewEventOnSubscribe(menuItem, Functions.FUNC1_ALWAYS_TRUE));
    }

    @CheckResult
    @NonNull
    public static Observable<MenuItemActionViewEvent> actionViewEvents(@NonNull MenuItem menuItem, @NonNull Func1<? super MenuItemActionViewEvent, Boolean> func1) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        Preconditions.checkNotNull(func1, "handled == null");
        return Observable.create((Observable.OnSubscribe)new MenuItemActionViewEventOnSubscribe(menuItem, func1));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> checked(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new 1(menuItem);
    }

    @CheckResult
    @NonNull
    public static Observable<Void> clicks(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return Observable.create((Observable.OnSubscribe)new MenuItemClickOnSubscribe(menuItem, Functions.FUNC1_ALWAYS_TRUE));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> clicks(@NonNull MenuItem menuItem, @NonNull Func1<? super MenuItem, Boolean> func1) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        Preconditions.checkNotNull(func1, "handled == null");
        return Observable.create((Observable.OnSubscribe)new MenuItemClickOnSubscribe(menuItem, func1));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> enabled(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new 2(menuItem);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Drawable> icon(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new 3(menuItem);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> iconRes(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new 4(menuItem);
    }

    @CheckResult
    @NonNull
    public static Action1<? super CharSequence> title(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new 5(menuItem);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> titleRes(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new 6(menuItem);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> visible(@NonNull MenuItem menuItem) {
        Preconditions.checkNotNull(menuItem, "menuItem == null");
        return new 7(menuItem);
    }
}


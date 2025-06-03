/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.view.DragEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.view.RxView$1
 *  com.jakewharton.rxbinding.view.RxView$2
 *  com.jakewharton.rxbinding.view.RxView$3
 *  com.jakewharton.rxbinding.view.RxView$4
 *  com.jakewharton.rxbinding.view.RxView$5
 *  com.jakewharton.rxbinding.view.RxView$6
 *  com.jakewharton.rxbinding.view.ViewAttachEvent
 *  com.jakewharton.rxbinding.view.ViewAttachEventOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewAttachesOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewClickOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewDragOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewFocusChangeOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewHoverOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewLayoutChangeEvent
 *  com.jakewharton.rxbinding.view.ViewLayoutChangeEventOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewLayoutChangeOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewLongClickOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewScrollChangeEvent
 *  com.jakewharton.rxbinding.view.ViewScrollChangeEventOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewSystemUiVisibilityChangeOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewTouchOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewTreeObserverDrawOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewTreeObserverGlobalLayoutOnSubscribe
 *  com.jakewharton.rxbinding.view.ViewTreeObserverPreDrawOnSubscribe
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 *  rx.functions.Func0
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.view;

import android.annotation.TargetApi;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Functions;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.view.RxView;
import com.jakewharton.rxbinding.view.ViewAttachEvent;
import com.jakewharton.rxbinding.view.ViewAttachEventOnSubscribe;
import com.jakewharton.rxbinding.view.ViewAttachesOnSubscribe;
import com.jakewharton.rxbinding.view.ViewClickOnSubscribe;
import com.jakewharton.rxbinding.view.ViewDragOnSubscribe;
import com.jakewharton.rxbinding.view.ViewFocusChangeOnSubscribe;
import com.jakewharton.rxbinding.view.ViewHoverOnSubscribe;
import com.jakewharton.rxbinding.view.ViewLayoutChangeEvent;
import com.jakewharton.rxbinding.view.ViewLayoutChangeEventOnSubscribe;
import com.jakewharton.rxbinding.view.ViewLayoutChangeOnSubscribe;
import com.jakewharton.rxbinding.view.ViewLongClickOnSubscribe;
import com.jakewharton.rxbinding.view.ViewScrollChangeEvent;
import com.jakewharton.rxbinding.view.ViewScrollChangeEventOnSubscribe;
import com.jakewharton.rxbinding.view.ViewSystemUiVisibilityChangeOnSubscribe;
import com.jakewharton.rxbinding.view.ViewTouchOnSubscribe;
import com.jakewharton.rxbinding.view.ViewTreeObserverDrawOnSubscribe;
import com.jakewharton.rxbinding.view.ViewTreeObserverGlobalLayoutOnSubscribe;
import com.jakewharton.rxbinding.view.ViewTreeObserverPreDrawOnSubscribe;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;

public final class RxView {
    private RxView() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> activated(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new 1(view);
    }

    @CheckResult
    @NonNull
    public static Observable<ViewAttachEvent> attachEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewAttachEventOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> attaches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewAttachesOnSubscribe(view, true));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> clickable(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new 2(view);
    }

    @CheckResult
    @NonNull
    public static Observable<Void> clicks(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewClickOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> detaches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewAttachesOnSubscribe(view, false));
    }

    @CheckResult
    @NonNull
    public static Observable<DragEvent> drags(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewDragOnSubscribe(view, Functions.FUNC1_ALWAYS_TRUE));
    }

    @CheckResult
    @NonNull
    public static Observable<DragEvent> drags(@NonNull View view, @NonNull Func1<? super DragEvent, Boolean> func1) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(func1, "handled == null");
        return Observable.create((Observable.OnSubscribe)new ViewDragOnSubscribe(view, func1));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> draws(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewTreeObserverDrawOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> enabled(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new 3(view);
    }

    @CheckResult
    @NonNull
    public static Observable<Boolean> focusChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewFocusChangeOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> globalLayouts(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewTreeObserverGlobalLayoutOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Observable<MotionEvent> hovers(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return RxView.hovers(view, Functions.FUNC1_ALWAYS_TRUE);
    }

    @CheckResult
    @NonNull
    public static Observable<MotionEvent> hovers(@NonNull View view, @NonNull Func1<? super MotionEvent, Boolean> func1) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(func1, "handled == null");
        return Observable.create((Observable.OnSubscribe)new ViewHoverOnSubscribe(view, func1));
    }

    @CheckResult
    @NonNull
    public static Observable<ViewLayoutChangeEvent> layoutChangeEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewLayoutChangeEventOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> layoutChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewLayoutChangeOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> longClicks(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewLongClickOnSubscribe(view, Functions.FUNC0_ALWAYS_TRUE));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> longClicks(@NonNull View view, @NonNull Func0<Boolean> func0) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(func0, "handled == null");
        return Observable.create((Observable.OnSubscribe)new ViewLongClickOnSubscribe(view, func0));
    }

    @CheckResult
    @NonNull
    public static Observable<Void> preDraws(@NonNull View view, @NonNull Func0<Boolean> func0) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(func0, "proceedDrawingPass == null");
        return Observable.create((Observable.OnSubscribe)new ViewTreeObserverPreDrawOnSubscribe(view, func0));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> pressed(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new 4(view);
    }

    @TargetApi(value=23)
    @CheckResult
    @NonNull
    public static Observable<ViewScrollChangeEvent> scrollChangeEvents(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewScrollChangeEventOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> selected(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return new 5(view);
    }

    @CheckResult
    @NonNull
    public static Observable<Integer> systemUiVisibilityChanges(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return Observable.create((Observable.OnSubscribe)new ViewSystemUiVisibilityChangeOnSubscribe(view));
    }

    @CheckResult
    @NonNull
    public static Observable<MotionEvent> touches(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return RxView.touches(view, Functions.FUNC1_ALWAYS_TRUE);
    }

    @CheckResult
    @NonNull
    public static Observable<MotionEvent> touches(@NonNull View view, @NonNull Func1<? super MotionEvent, Boolean> func1) {
        Preconditions.checkNotNull(view, "view == null");
        Preconditions.checkNotNull(func1, "handled == null");
        return Observable.create((Observable.OnSubscribe)new ViewTouchOnSubscribe(view, func1));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> visibility(@NonNull View view) {
        Preconditions.checkNotNull(view, "view == null");
        return RxView.visibility(view, 8);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> visibility(@NonNull View view, int n) {
        Preconditions.checkNotNull(view, "view == null");
        boolean bl = true;
        boolean bl2 = n != 0;
        Preconditions.checkArgument(bl2, "Setting visibility to VISIBLE when false would have no effect.");
        bl2 = bl;
        if (n != 4) {
            bl2 = n == 8 ? bl : false;
        }
        Preconditions.checkArgument(bl2, "Must set visibility to INVISIBLE or GONE when false.");
        return new 6(view, n);
    }
}


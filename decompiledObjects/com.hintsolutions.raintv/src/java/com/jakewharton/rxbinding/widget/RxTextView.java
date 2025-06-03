/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.RxTextView$1
 *  com.jakewharton.rxbinding.widget.RxTextView$2
 *  com.jakewharton.rxbinding.widget.RxTextView$3
 *  com.jakewharton.rxbinding.widget.RxTextView$4
 *  com.jakewharton.rxbinding.widget.RxTextView$5
 *  com.jakewharton.rxbinding.widget.RxTextView$6
 *  com.jakewharton.rxbinding.widget.RxTextView$7
 *  com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEvent
 *  com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.TextViewBeforeTextChangeEvent
 *  com.jakewharton.rxbinding.widget.TextViewBeforeTextChangeEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.TextViewEditorActionEvent
 *  com.jakewharton.rxbinding.widget.TextViewEditorActionEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.TextViewEditorActionOnSubscribe
 *  com.jakewharton.rxbinding.widget.TextViewTextChangeEvent
 *  com.jakewharton.rxbinding.widget.TextViewTextChangeEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.TextViewTextOnSubscribe
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Functions;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.RxTextView;
import com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEvent;
import com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEventOnSubscribe;
import com.jakewharton.rxbinding.widget.TextViewBeforeTextChangeEvent;
import com.jakewharton.rxbinding.widget.TextViewBeforeTextChangeEventOnSubscribe;
import com.jakewharton.rxbinding.widget.TextViewEditorActionEvent;
import com.jakewharton.rxbinding.widget.TextViewEditorActionEventOnSubscribe;
import com.jakewharton.rxbinding.widget.TextViewEditorActionOnSubscribe;
import com.jakewharton.rxbinding.widget.TextViewTextChangeEvent;
import com.jakewharton.rxbinding.widget.TextViewTextChangeEventOnSubscribe;
import com.jakewharton.rxbinding.widget.TextViewTextOnSubscribe;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

public final class RxTextView {
    private RxTextView() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Observable<TextViewAfterTextChangeEvent> afterTextChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return Observable.create((Observable.OnSubscribe)new TextViewAfterTextChangeEventOnSubscribe(textView));
    }

    @CheckResult
    @NonNull
    public static Observable<TextViewBeforeTextChangeEvent> beforeTextChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return Observable.create((Observable.OnSubscribe)new TextViewBeforeTextChangeEventOnSubscribe(textView));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> color(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new 7(textView);
    }

    @CheckResult
    @NonNull
    public static Observable<TextViewEditorActionEvent> editorActionEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return RxTextView.editorActionEvents(textView, Functions.FUNC1_ALWAYS_TRUE);
    }

    @CheckResult
    @NonNull
    public static Observable<TextViewEditorActionEvent> editorActionEvents(@NonNull TextView textView, @NonNull Func1<? super TextViewEditorActionEvent, Boolean> func1) {
        Preconditions.checkNotNull(textView, "view == null");
        Preconditions.checkNotNull(func1, "handled == null");
        return Observable.create((Observable.OnSubscribe)new TextViewEditorActionEventOnSubscribe(textView, func1));
    }

    @CheckResult
    @NonNull
    public static Observable<Integer> editorActions(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return RxTextView.editorActions(textView, Functions.FUNC1_ALWAYS_TRUE);
    }

    @CheckResult
    @NonNull
    public static Observable<Integer> editorActions(@NonNull TextView textView, @NonNull Func1<? super Integer, Boolean> func1) {
        Preconditions.checkNotNull(textView, "view == null");
        Preconditions.checkNotNull(func1, "handled == null");
        return Observable.create((Observable.OnSubscribe)new TextViewEditorActionOnSubscribe(textView, func1));
    }

    @CheckResult
    @NonNull
    public static Action1<? super CharSequence> error(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new 3(textView);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> errorRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new 4(textView);
    }

    @CheckResult
    @NonNull
    public static Action1<? super CharSequence> hint(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new 5(textView);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> hintRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new 6(textView);
    }

    @CheckResult
    @NonNull
    public static Action1<? super CharSequence> text(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new 1(textView);
    }

    @CheckResult
    @NonNull
    public static Observable<TextViewTextChangeEvent> textChangeEvents(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return Observable.create((Observable.OnSubscribe)new TextViewTextChangeEventOnSubscribe(textView));
    }

    @CheckResult
    @NonNull
    public static Observable<CharSequence> textChanges(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return Observable.create((Observable.OnSubscribe)new TextViewTextOnSubscribe(textView));
    }

    @CheckResult
    @NonNull
    public static Action1<? super Integer> textRes(@NonNull TextView textView) {
        Preconditions.checkNotNull(textView, "view == null");
        return new 2(textView);
    }
}


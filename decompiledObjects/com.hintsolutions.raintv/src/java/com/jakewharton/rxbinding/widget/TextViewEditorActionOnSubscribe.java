/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func1;

final class TextViewEditorActionOnSubscribe
implements Observable.OnSubscribe<Integer> {
    public final Func1<? super Integer, Boolean> handled;
    public final TextView view;

    public TextViewEditorActionOnSubscribe(TextView textView, Func1<? super Integer, Boolean> func1) {
        this.view = textView;
        this.handled = func1;
    }

    public void call(Subscriber<? super Integer> subscriber) {
        Preconditions.checkUiThread();
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener(this, subscriber){
            public final TextViewEditorActionOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = textViewEditorActionOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onEditorAction(TextView textView, int n4, KeyEvent keyEvent) {
                if (((Boolean)this.this$0.handled.call((Object)n4)).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext((Object)n4);
                    }
                    return true;
                }
                return false;
            }
        };
        this.view.setOnEditorActionListener(onEditorActionListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final TextViewEditorActionOnSubscribe this$0;
            {
                this.this$0 = textViewEditorActionOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnEditorActionListener(null);
            }
        });
    }
}


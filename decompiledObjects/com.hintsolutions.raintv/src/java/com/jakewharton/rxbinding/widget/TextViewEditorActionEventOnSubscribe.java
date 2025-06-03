/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 *  java.lang.Boolean
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
import com.jakewharton.rxbinding.widget.TextViewEditorActionEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func1;

final class TextViewEditorActionEventOnSubscribe
implements Observable.OnSubscribe<TextViewEditorActionEvent> {
    public final Func1<? super TextViewEditorActionEvent, Boolean> handled;
    public final TextView view;

    public TextViewEditorActionEventOnSubscribe(TextView textView, Func1<? super TextViewEditorActionEvent, Boolean> func1) {
        this.view = textView;
        this.handled = func1;
    }

    public void call(Subscriber<? super TextViewEditorActionEvent> subscriber) {
        Preconditions.checkUiThread();
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener(this, subscriber){
            public final TextViewEditorActionEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = textViewEditorActionEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onEditorAction(TextView object, int n4, KeyEvent keyEvent) {
                if (((Boolean)this.this$0.handled.call(object = TextViewEditorActionEvent.create(object, n4, keyEvent))).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext(object);
                    }
                    return true;
                }
                return false;
            }
        };
        this.view.setOnEditorActionListener(onEditorActionListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final TextViewEditorActionEventOnSubscribe this$0;
            {
                this.this$0 = textViewEditorActionEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnEditorActionListener(null);
            }
        });
    }
}


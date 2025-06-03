/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func0
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func0;

final class ViewLongClickOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final Func0<Boolean> handled;
    public final View view;

    public ViewLongClickOnSubscribe(View view, Func0<Boolean> func0) {
        this.view = view;
        this.handled = func0;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener(this, subscriber){
            public final ViewLongClickOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewLongClickOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onLongClick(View view) {
                if (((Boolean)this.this$0.handled.call()).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext(null);
                    }
                    return true;
                }
                return false;
            }
        };
        this.view.setOnLongClickListener(onLongClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewLongClickOnSubscribe this$0;
            {
                this.this$0 = viewLongClickOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnLongClickListener(null);
            }
        });
    }
}


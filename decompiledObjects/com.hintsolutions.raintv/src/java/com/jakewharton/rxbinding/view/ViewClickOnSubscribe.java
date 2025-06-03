/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class ViewClickOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final View view;

    public ViewClickOnSubscribe(View view) {
        this.view = view;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        View.OnClickListener onClickListener = new View.OnClickListener(this, subscriber){
            public final ViewClickOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewClickOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onClick(View view) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                }
            }
        };
        this.view.setOnClickListener(onClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewClickOnSubscribe this$0;
            {
                this.this$0 = viewClickOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnClickListener(null);
            }
        });
    }
}


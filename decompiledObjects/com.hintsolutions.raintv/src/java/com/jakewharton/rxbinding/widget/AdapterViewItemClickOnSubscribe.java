/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class AdapterViewItemClickOnSubscribe
implements Observable.OnSubscribe<Integer> {
    public final AdapterView<?> view;

    public AdapterViewItemClickOnSubscribe(AdapterView<?> adapterView) {
        this.view = adapterView;
    }

    public void call(Subscriber<? super Integer> subscriber) {
        Preconditions.checkUiThread();
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener(this, subscriber){
            public final AdapterViewItemClickOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = adapterViewItemClickOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n4, long l4) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)n4);
                }
            }
        };
        this.view.setOnItemClickListener(onItemClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final AdapterViewItemClickOnSubscribe this$0;
            {
                this.this$0 = adapterViewItemClickOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnItemClickListener(null);
            }
        });
    }
}


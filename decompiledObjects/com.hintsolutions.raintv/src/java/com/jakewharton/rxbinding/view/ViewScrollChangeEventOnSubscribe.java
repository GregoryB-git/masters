/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.view.View
 *  android.view.View$OnScrollChangeListener
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.view;

import android.annotation.TargetApi;
import android.view.View;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.view.ViewScrollChangeEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

@TargetApi(value=23)
final class ViewScrollChangeEventOnSubscribe
implements Observable.OnSubscribe<ViewScrollChangeEvent> {
    public final View view;

    public ViewScrollChangeEventOnSubscribe(View view) {
        this.view = view;
    }

    public void call(Subscriber<? super ViewScrollChangeEvent> subscriber) {
        Preconditions.checkUiThread();
        View.OnScrollChangeListener onScrollChangeListener = new View.OnScrollChangeListener(this, subscriber){
            public final ViewScrollChangeEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewScrollChangeEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onScrollChange(View view, int n4, int n5, int n6, int n7) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)ViewScrollChangeEvent.create(this.this$0.view, n4, n5, n6, n7));
                }
            }
        };
        this.view.setOnScrollChangeListener(onScrollChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewScrollChangeEventOnSubscribe this$0;
            {
                this.this$0 = viewScrollChangeEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnScrollChangeListener(null);
            }
        });
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.view;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

@TargetApi(value=16)
final class ViewTreeObserverDrawOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final View view;

    public ViewTreeObserverDrawOnSubscribe(View view) {
        this.view = view;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener(this, subscriber){
            public final ViewTreeObserverDrawOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewTreeObserverDrawOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onDraw() {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                }
            }
        };
        this.view.getViewTreeObserver().addOnDrawListener(onDrawListener);
        subscriber.add((Subscription)new MainThreadSubscription(this, onDrawListener){
            public final ViewTreeObserverDrawOnSubscribe this$0;
            public final ViewTreeObserver.OnDrawListener val$listener;
            {
                this.this$0 = viewTreeObserverDrawOnSubscribe;
                this.val$listener = onDrawListener;
            }

            public void onUnsubscribe() {
                this.this$0.view.getViewTreeObserver().removeOnDrawListener(this.val$listener);
            }
        });
    }
}


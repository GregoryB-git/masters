/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class ViewTreeObserverGlobalLayoutOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final View view;

    public ViewTreeObserverGlobalLayoutOnSubscribe(View view) {
        this.view = view;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(this, subscriber){
            public final ViewTreeObserverGlobalLayoutOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewTreeObserverGlobalLayoutOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onGlobalLayout() {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                }
            }
        };
        this.view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        subscriber.add((Subscription)new MainThreadSubscription(this, onGlobalLayoutListener){
            public final ViewTreeObserverGlobalLayoutOnSubscribe this$0;
            public final ViewTreeObserver.OnGlobalLayoutListener val$listener;
            {
                this.this$0 = viewTreeObserverGlobalLayoutOnSubscribe;
                this.val$listener = onGlobalLayoutListener;
            }

            public void onUnsubscribe() {
                this.this$0.view.getViewTreeObserver().removeOnGlobalLayoutListener(this.val$listener);
            }
        });
    }
}


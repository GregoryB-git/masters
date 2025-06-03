/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
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

final class ViewLayoutChangeOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final View view;

    public ViewLayoutChangeOnSubscribe(View view) {
        this.view = view;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener(this, subscriber){
            public final ViewLayoutChangeOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewLayoutChangeOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onLayoutChange(View view, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                }
            }
        };
        this.view.addOnLayoutChangeListener(onLayoutChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this, onLayoutChangeListener){
            public final ViewLayoutChangeOnSubscribe this$0;
            public final View.OnLayoutChangeListener val$listener;
            {
                this.this$0 = viewLayoutChangeOnSubscribe;
                this.val$listener = onLayoutChangeListener;
            }

            public void onUnsubscribe() {
                this.this$0.view.removeOnLayoutChangeListener(this.val$listener);
            }
        });
    }
}


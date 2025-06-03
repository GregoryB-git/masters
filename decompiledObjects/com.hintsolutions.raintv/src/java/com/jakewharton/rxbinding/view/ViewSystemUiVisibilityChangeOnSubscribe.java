/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnSystemUiVisibilityChangeListener
 *  java.lang.Integer
 *  java.lang.Object
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

final class ViewSystemUiVisibilityChangeOnSubscribe
implements Observable.OnSubscribe<Integer> {
    public final View view;

    public ViewSystemUiVisibilityChangeOnSubscribe(View view) {
        this.view = view;
    }

    public void call(Subscriber<? super Integer> subscriber) {
        Preconditions.checkUiThread();
        View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener = new View.OnSystemUiVisibilityChangeListener(this, subscriber){
            public final ViewSystemUiVisibilityChangeOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewSystemUiVisibilityChangeOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onSystemUiVisibilityChange(int n4) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)n4);
                }
            }
        };
        this.view.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewSystemUiVisibilityChangeOnSubscribe this$0;
            {
                this.this$0 = viewSystemUiVisibilityChangeOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnSystemUiVisibilityChangeListener(null);
            }
        });
    }
}


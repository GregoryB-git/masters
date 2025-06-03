/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  java.lang.Boolean
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

final class ViewFocusChangeOnSubscribe
implements Observable.OnSubscribe<Boolean> {
    public final View view;

    public ViewFocusChangeOnSubscribe(View view) {
        this.view = view;
    }

    public void call(Subscriber<? super Boolean> subscriber) {
        Preconditions.checkUiThread();
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener(this, subscriber){
            public final ViewFocusChangeOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewFocusChangeOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onFocusChange(View view, boolean bl) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)bl);
                }
            }
        };
        this.view.setOnFocusChangeListener(onFocusChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewFocusChangeOnSubscribe this$0;
            {
                this.this$0 = viewFocusChangeOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnFocusChangeListener(null);
            }
        });
        subscriber.onNext((Object)this.view.hasFocus());
    }
}


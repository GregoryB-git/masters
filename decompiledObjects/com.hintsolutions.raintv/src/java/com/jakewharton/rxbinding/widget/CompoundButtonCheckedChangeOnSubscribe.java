/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  java.lang.Boolean
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.CompoundButton;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class CompoundButtonCheckedChangeOnSubscribe
implements Observable.OnSubscribe<Boolean> {
    public final CompoundButton view;

    public CompoundButtonCheckedChangeOnSubscribe(CompoundButton compoundButton) {
        this.view = compoundButton;
    }

    public void call(Subscriber<? super Boolean> subscriber) {
        Preconditions.checkUiThread();
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener(this, subscriber){
            public final CompoundButtonCheckedChangeOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = compoundButtonCheckedChangeOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)bl);
                }
            }
        };
        this.view.setOnCheckedChangeListener(onCheckedChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final CompoundButtonCheckedChangeOnSubscribe this$0;
            {
                this.this$0 = compoundButtonCheckedChangeOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnCheckedChangeListener(null);
            }
        });
        subscriber.onNext((Object)this.view.isChecked());
    }
}


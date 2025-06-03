/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.RadioGroup;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class RadioGroupCheckedChangeOnSubscribe
implements Observable.OnSubscribe<Integer> {
    public final RadioGroup view;

    public RadioGroupCheckedChangeOnSubscribe(RadioGroup radioGroup) {
        this.view = radioGroup;
    }

    public void call(Subscriber<? super Integer> subscriber) {
        Preconditions.checkUiThread();
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = new RadioGroup.OnCheckedChangeListener(this, subscriber){
            public final RadioGroupCheckedChangeOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = radioGroupCheckedChangeOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onCheckedChanged(RadioGroup radioGroup, int n4) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)n4);
                }
            }
        };
        this.view.setOnCheckedChangeListener(onCheckedChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final RadioGroupCheckedChangeOnSubscribe this$0;
            {
                this.this$0 = radioGroupCheckedChangeOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnCheckedChangeListener(null);
            }
        });
        subscriber.onNext((Object)this.view.getCheckedRadioButtonId());
    }
}


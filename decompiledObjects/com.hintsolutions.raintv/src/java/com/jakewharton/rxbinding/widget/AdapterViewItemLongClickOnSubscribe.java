/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemLongClickListener
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func0
 */
package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func0;

final class AdapterViewItemLongClickOnSubscribe
implements Observable.OnSubscribe<Integer> {
    public final Func0<Boolean> handled;
    public final AdapterView<?> view;

    public AdapterViewItemLongClickOnSubscribe(AdapterView<?> adapterView, Func0<Boolean> func0) {
        this.view = adapterView;
        this.handled = func0;
    }

    public void call(Subscriber<? super Integer> subscriber) {
        Preconditions.checkUiThread();
        AdapterView.OnItemLongClickListener onItemLongClickListener = new AdapterView.OnItemLongClickListener(this, subscriber){
            public final AdapterViewItemLongClickOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = adapterViewItemLongClickOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int n4, long l4) {
                if (((Boolean)this.this$0.handled.call()).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext((Object)n4);
                    }
                    return true;
                }
                return false;
            }
        };
        this.view.setOnItemLongClickListener(onItemLongClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final AdapterViewItemLongClickOnSubscribe this$0;
            {
                this.this$0 = adapterViewItemLongClickOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnItemLongClickListener(null);
            }
        });
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 *  android.widget.Adapter
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class AdapterDataChangeOnSubscribe<T extends Adapter>
implements Observable.OnSubscribe<T> {
    public final T adapter;

    public AdapterDataChangeOnSubscribe(T t4) {
        this.adapter = t4;
    }

    public void call(Subscriber<? super T> subscriber) {
        Preconditions.checkUiThread();
        DataSetObserver dataSetObserver = new DataSetObserver(this, subscriber){
            public final AdapterDataChangeOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = adapterDataChangeOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onChanged() {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(this.this$0.adapter);
                }
            }
        };
        this.adapter.registerDataSetObserver(dataSetObserver);
        subscriber.add((Subscription)new MainThreadSubscription(this, dataSetObserver){
            public final AdapterDataChangeOnSubscribe this$0;
            public final DataSetObserver val$observer;
            {
                this.this$0 = adapterDataChangeOnSubscribe;
                this.val$observer = dataSetObserver;
            }

            public void onUnsubscribe() {
                this.this$0.adapter.unregisterDataSetObserver(this.val$observer);
            }
        });
        subscriber.onNext(this.adapter);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemLongClickListener
 *  java.lang.Boolean
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.AdapterViewItemLongClickEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func1;

final class AdapterViewItemLongClickEventOnSubscribe
implements Observable.OnSubscribe<AdapterViewItemLongClickEvent> {
    public final Func1<? super AdapterViewItemLongClickEvent, Boolean> handled;
    public final AdapterView<?> view;

    public AdapterViewItemLongClickEventOnSubscribe(AdapterView<?> adapterView, Func1<? super AdapterViewItemLongClickEvent, Boolean> func1) {
        this.view = adapterView;
        this.handled = func1;
    }

    public void call(Subscriber<? super AdapterViewItemLongClickEvent> subscriber) {
        Preconditions.checkUiThread();
        AdapterView.OnItemLongClickListener onItemLongClickListener = new AdapterView.OnItemLongClickListener(this, subscriber){
            public final AdapterViewItemLongClickEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = adapterViewItemLongClickEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onItemLongClick(AdapterView<?> object, View view, int n4, long l4) {
                if (((Boolean)this.this$0.handled.call(object = AdapterViewItemLongClickEvent.create(object, view, n4, l4))).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext(object);
                    }
                    return true;
                }
                return false;
            }
        };
        this.view.setOnItemLongClickListener(onItemLongClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final AdapterViewItemLongClickEventOnSubscribe this$0;
            {
                this.this$0 = adapterViewItemLongClickEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnItemLongClickListener(null);
            }
        });
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AutoCompleteTextView
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.AdapterViewItemClickEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class AutoCompleteTextViewItemClickEventOnSubscribe
implements Observable.OnSubscribe<AdapterViewItemClickEvent> {
    public final AutoCompleteTextView view;

    public AutoCompleteTextViewItemClickEventOnSubscribe(AutoCompleteTextView autoCompleteTextView) {
        this.view = autoCompleteTextView;
    }

    public void call(Subscriber<? super AdapterViewItemClickEvent> subscriber) {
        Preconditions.checkUiThread();
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener(this, subscriber){
            public final AutoCompleteTextViewItemClickEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = autoCompleteTextViewItemClickEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int n4, long l4) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)AdapterViewItemClickEvent.create(adapterView, view, n4, l4));
                }
            }
        };
        this.view.setOnItemClickListener(onItemClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final AutoCompleteTextViewItemClickEventOnSubscribe this$0;
            {
                this.this$0 = autoCompleteTextViewItemClickEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnItemClickListener(null);
            }
        });
    }
}


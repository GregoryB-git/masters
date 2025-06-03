/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.AdapterViewItemSelectionEvent;
import com.jakewharton.rxbinding.widget.AdapterViewNothingSelectionEvent;
import com.jakewharton.rxbinding.widget.AdapterViewSelectionEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class AdapterViewSelectionOnSubscribe
implements Observable.OnSubscribe<AdapterViewSelectionEvent> {
    public final AdapterView<?> view;

    public AdapterViewSelectionOnSubscribe(AdapterView<?> adapterView) {
        this.view = adapterView;
    }

    public void call(Subscriber<? super AdapterViewSelectionEvent> subscriber) {
        Preconditions.checkUiThread();
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener(this, subscriber){
            public final AdapterViewSelectionOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = adapterViewSelectionOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int n4, long l4) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)AdapterViewItemSelectionEvent.create(adapterView, view, n4, l4));
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)AdapterViewNothingSelectionEvent.create(adapterView));
                }
            }
        };
        this.view.setOnItemSelectedListener(onItemSelectedListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final AdapterViewSelectionOnSubscribe this$0;
            {
                this.this$0 = adapterViewSelectionOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnItemSelectedListener(null);
            }
        });
        int n4 = this.view.getSelectedItemPosition();
        if (n4 == -1) {
            subscriber.onNext((Object)AdapterViewNothingSelectionEvent.create(this.view));
        } else {
            onItemSelectedListener = this.view.getSelectedView();
            long l4 = this.view.getSelectedItemId();
            subscriber.onNext((Object)AdapterViewItemSelectionEvent.create(this.view, (View)onItemSelectedListener, n4, l4));
        }
    }
}


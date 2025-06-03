/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Toolbar
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.Toolbar;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

@TargetApi(value=21)
final class ToolbarNavigationClickOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final Toolbar view;

    public ToolbarNavigationClickOnSubscribe(Toolbar toolbar) {
        this.view = toolbar;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        View.OnClickListener onClickListener = new View.OnClickListener(this, subscriber){
            public final ToolbarNavigationClickOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = toolbarNavigationClickOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onClick(View view) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                }
            }
        };
        this.view.setNavigationOnClickListener(onClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ToolbarNavigationClickOnSubscribe this$0;
            {
                this.this$0 = toolbarNavigationClickOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setNavigationOnClickListener(null);
            }
        });
    }
}


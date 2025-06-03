/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.view.MenuItem
 *  android.widget.Toolbar
 *  android.widget.Toolbar$OnMenuItemClickListener
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.annotation.TargetApi;
import android.view.MenuItem;
import android.widget.Toolbar;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

@TargetApi(value=21)
final class ToolbarItemClickOnSubscribe
implements Observable.OnSubscribe<MenuItem> {
    public final Toolbar view;

    public ToolbarItemClickOnSubscribe(Toolbar toolbar) {
        this.view = toolbar;
    }

    public void call(Subscriber<? super MenuItem> subscriber) {
        Preconditions.checkUiThread();
        Toolbar.OnMenuItemClickListener onMenuItemClickListener = new Toolbar.OnMenuItemClickListener(this, subscriber){
            public final ToolbarItemClickOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = toolbarItemClickOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onMenuItemClick(MenuItem menuItem) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)menuItem);
                }
                return true;
            }
        };
        this.view.setOnMenuItemClickListener(onMenuItemClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ToolbarItemClickOnSubscribe this$0;
            {
                this.this$0 = toolbarItemClickOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnMenuItemClickListener(null);
            }
        });
    }
}


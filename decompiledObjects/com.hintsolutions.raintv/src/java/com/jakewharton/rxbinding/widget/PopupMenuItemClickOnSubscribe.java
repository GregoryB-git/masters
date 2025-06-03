/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnMenuItemClickListener
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class PopupMenuItemClickOnSubscribe
implements Observable.OnSubscribe<MenuItem> {
    public final PopupMenu view;

    public PopupMenuItemClickOnSubscribe(PopupMenu popupMenu) {
        this.view = popupMenu;
    }

    public void call(Subscriber<? super MenuItem> subscriber) {
        Preconditions.checkUiThread();
        PopupMenu.OnMenuItemClickListener onMenuItemClickListener = new PopupMenu.OnMenuItemClickListener(this, subscriber){
            public final PopupMenuItemClickOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = popupMenuItemClickOnSubscribe;
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
            public final PopupMenuItemClickOnSubscribe this$0;
            {
                this.this$0 = popupMenuItemClickOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnMenuItemClickListener(null);
            }
        });
    }
}


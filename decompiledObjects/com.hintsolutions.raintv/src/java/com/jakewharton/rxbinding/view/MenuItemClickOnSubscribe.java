/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.view;

import android.view.MenuItem;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func1;

final class MenuItemClickOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final Func1<? super MenuItem, Boolean> handled;
    public final MenuItem menuItem;

    public MenuItemClickOnSubscribe(MenuItem menuItem, Func1<? super MenuItem, Boolean> func1) {
        this.menuItem = menuItem;
        this.handled = func1;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = new MenuItem.OnMenuItemClickListener(this, subscriber){
            public final MenuItemClickOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = menuItemClickOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onMenuItemClick(MenuItem object) {
                object = this.this$0;
                if (((Boolean)object.handled.call((Object)object.menuItem)).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext(null);
                    }
                    return true;
                }
                return false;
            }
        };
        this.menuItem.setOnMenuItemClickListener(onMenuItemClickListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final MenuItemClickOnSubscribe this$0;
            {
                this.this$0 = menuItemClickOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.menuItem.setOnMenuItemClickListener(null);
            }
        });
    }
}


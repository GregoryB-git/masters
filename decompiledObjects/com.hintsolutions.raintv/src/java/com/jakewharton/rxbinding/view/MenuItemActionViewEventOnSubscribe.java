/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  java.lang.Boolean
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.view;

import android.view.MenuItem;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.view.MenuItemActionViewEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func1;

final class MenuItemActionViewEventOnSubscribe
implements Observable.OnSubscribe<MenuItemActionViewEvent> {
    public final Func1<? super MenuItemActionViewEvent, Boolean> handled;
    public final MenuItem menuItem;

    public MenuItemActionViewEventOnSubscribe(MenuItem menuItem, Func1<? super MenuItemActionViewEvent, Boolean> func1) {
        this.menuItem = menuItem;
        this.handled = func1;
    }

    public void call(Subscriber<? super MenuItemActionViewEvent> subscriber) {
        Preconditions.checkUiThread();
        MenuItem.OnActionExpandListener onActionExpandListener = new MenuItem.OnActionExpandListener(this, subscriber){
            public final MenuItemActionViewEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = menuItemActionViewEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            private boolean onEvent(MenuItemActionViewEvent menuItemActionViewEvent) {
                if (((Boolean)this.this$0.handled.call((Object)menuItemActionViewEvent)).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext((Object)menuItemActionViewEvent);
                    }
                    return true;
                }
                return false;
            }

            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                return this.onEvent(MenuItemActionViewEvent.create(this.this$0.menuItem, MenuItemActionViewEvent.Kind.COLLAPSE));
            }

            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return this.onEvent(MenuItemActionViewEvent.create(this.this$0.menuItem, MenuItemActionViewEvent.Kind.EXPAND));
            }
        };
        this.menuItem.setOnActionExpandListener(onActionExpandListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final MenuItemActionViewEventOnSubscribe this$0;
            {
                this.this$0 = menuItemActionViewEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.menuItem.setOnActionExpandListener(null);
            }
        });
    }
}


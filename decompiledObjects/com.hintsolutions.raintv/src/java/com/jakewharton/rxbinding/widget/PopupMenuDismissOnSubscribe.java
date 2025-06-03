/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnDismissListener
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.PopupMenu;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class PopupMenuDismissOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final PopupMenu view;

    public PopupMenuDismissOnSubscribe(PopupMenu popupMenu) {
        this.view = popupMenu;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        PopupMenu.OnDismissListener onDismissListener = new PopupMenu.OnDismissListener(this, subscriber){
            public final PopupMenuDismissOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = popupMenuDismissOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onDismiss(PopupMenu popupMenu) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                }
            }
        };
        this.view.setOnDismissListener(onDismissListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final PopupMenuDismissOnSubscribe this$0;
            {
                this.this$0 = popupMenuDismissOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnDismissListener(null);
            }
        });
    }
}


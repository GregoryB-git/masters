/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.DragEvent
 *  android.view.View
 *  android.view.View$OnDragListener
 *  java.lang.Boolean
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.view;

import android.view.DragEvent;
import android.view.View;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func1;

final class ViewDragOnSubscribe
implements Observable.OnSubscribe<DragEvent> {
    public final Func1<? super DragEvent, Boolean> handled;
    public final View view;

    public ViewDragOnSubscribe(View view, Func1<? super DragEvent, Boolean> func1) {
        this.view = view;
        this.handled = func1;
    }

    public void call(Subscriber<? super DragEvent> subscriber) {
        Preconditions.checkUiThread();
        View.OnDragListener onDragListener = new View.OnDragListener(this, subscriber){
            public final ViewDragOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewDragOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onDrag(View view, DragEvent dragEvent) {
                if (((Boolean)this.this$0.handled.call((Object)dragEvent)).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext((Object)dragEvent);
                    }
                    return true;
                }
                return false;
            }
        };
        this.view.setOnDragListener(onDragListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewDragOnSubscribe this$0;
            {
                this.this$0 = viewDragOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnDragListener(null);
            }
        });
    }
}


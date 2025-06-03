/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnHoverListener
 *  androidx.annotation.NonNull
 *  java.lang.Boolean
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.view;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func1;

final class ViewHoverOnSubscribe
implements Observable.OnSubscribe<MotionEvent> {
    public final Func1<? super MotionEvent, Boolean> handled;
    public final View view;

    public ViewHoverOnSubscribe(View view, Func1<? super MotionEvent, Boolean> func1) {
        this.view = view;
        this.handled = func1;
    }

    public void call(Subscriber<? super MotionEvent> subscriber) {
        Preconditions.checkUiThread();
        View.OnHoverListener onHoverListener = new View.OnHoverListener(this, subscriber){
            public final ViewHoverOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewHoverOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onHover(View view, @NonNull MotionEvent motionEvent) {
                if (((Boolean)this.this$0.handled.call((Object)motionEvent)).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext((Object)motionEvent);
                    }
                    return true;
                }
                return false;
            }
        };
        this.view.setOnHoverListener(onHoverListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewHoverOnSubscribe this$0;
            {
                this.this$0 = viewHoverOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnHoverListener(null);
            }
        });
    }
}


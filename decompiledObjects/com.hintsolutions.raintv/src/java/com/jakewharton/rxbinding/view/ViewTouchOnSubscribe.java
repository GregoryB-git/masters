/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
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

final class ViewTouchOnSubscribe
implements Observable.OnSubscribe<MotionEvent> {
    public final Func1<? super MotionEvent, Boolean> handled;
    public final View view;

    public ViewTouchOnSubscribe(View view, Func1<? super MotionEvent, Boolean> func1) {
        this.view = view;
        this.handled = func1;
    }

    public void call(Subscriber<? super MotionEvent> subscriber) {
        Preconditions.checkUiThread();
        View.OnTouchListener onTouchListener = new View.OnTouchListener(this, subscriber){
            public final ViewTouchOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewTouchOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onTouch(View view, @NonNull MotionEvent motionEvent) {
                if (((Boolean)this.this$0.handled.call((Object)motionEvent)).booleanValue()) {
                    if (!this.val$subscriber.isUnsubscribed()) {
                        this.val$subscriber.onNext((Object)motionEvent);
                    }
                    return true;
                }
                return false;
            }
        };
        this.view.setOnTouchListener(onTouchListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewTouchOnSubscribe this$0;
            {
                this.this$0 = viewTouchOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnTouchListener(null);
            }
        });
    }
}


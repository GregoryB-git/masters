/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 *  rx.functions.Func0
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;
import rx.functions.Func0;

final class ViewTreeObserverPreDrawOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final Func0<Boolean> proceedDrawingPass;
    public final View view;

    public ViewTreeObserverPreDrawOnSubscribe(View view, Func0<Boolean> func0) {
        this.view = view;
        this.proceedDrawingPass = func0;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener(this, subscriber){
            public final ViewTreeObserverPreDrawOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewTreeObserverPreDrawOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onPreDraw() {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                    return (Boolean)this.this$0.proceedDrawingPass.call();
                }
                return true;
            }
        };
        this.view.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        subscriber.add((Subscription)new MainThreadSubscription(this, onPreDrawListener){
            public final ViewTreeObserverPreDrawOnSubscribe this$0;
            public final ViewTreeObserver.OnPreDrawListener val$listener;
            {
                this.this$0 = viewTreeObserverPreDrawOnSubscribe;
                this.val$listener = onPreDrawListener;
            }

            public void onUnsubscribe() {
                this.this$0.view.getViewTreeObserver().removeOnPreDrawListener(this.val$listener);
            }
        });
    }
}


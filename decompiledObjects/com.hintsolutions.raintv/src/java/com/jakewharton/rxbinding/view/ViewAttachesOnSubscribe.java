/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Void
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class ViewAttachesOnSubscribe
implements Observable.OnSubscribe<Void> {
    public final boolean callOnAttach;
    public final View view;

    public ViewAttachesOnSubscribe(View view, boolean bl) {
        this.view = view;
        this.callOnAttach = bl;
    }

    public void call(Subscriber<? super Void> subscriber) {
        Preconditions.checkUiThread();
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener(this, subscriber){
            public final ViewAttachesOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewAttachesOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onViewAttachedToWindow(@NonNull View view) {
                if (this.this$0.callOnAttach && !this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                }
            }

            public void onViewDetachedFromWindow(@NonNull View view) {
                if (!this.this$0.callOnAttach && !this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext(null);
                }
            }
        };
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this, onAttachStateChangeListener){
            public final ViewAttachesOnSubscribe this$0;
            public final View.OnAttachStateChangeListener val$listener;
            {
                this.this$0 = viewAttachesOnSubscribe;
                this.val$listener = onAttachStateChangeListener;
            }

            public void onUnsubscribe() {
                this.this$0.view.removeOnAttachStateChangeListener(this.val$listener);
            }
        });
    }
}


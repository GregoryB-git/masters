/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.view.ViewAttachEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class ViewAttachEventOnSubscribe
implements Observable.OnSubscribe<ViewAttachEvent> {
    public final View view;

    public ViewAttachEventOnSubscribe(View view) {
        this.view = view;
    }

    public void call(Subscriber<? super ViewAttachEvent> subscriber) {
        Preconditions.checkUiThread();
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener(this, subscriber){
            public final ViewAttachEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewAttachEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onViewAttachedToWindow(@NonNull View view) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)ViewAttachEvent.create(this.this$0.view, ViewAttachEvent.Kind.ATTACH));
                }
            }

            public void onViewDetachedFromWindow(@NonNull View view) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)ViewAttachEvent.create(this.this$0.view, ViewAttachEvent.Kind.DETACH));
                }
            }
        };
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this, onAttachStateChangeListener){
            public final ViewAttachEventOnSubscribe this$0;
            public final View.OnAttachStateChangeListener val$listener;
            {
                this.this$0 = viewAttachEventOnSubscribe;
                this.val$listener = onAttachStateChangeListener;
            }

            public void onUnsubscribe() {
                this.this$0.view.removeOnAttachStateChangeListener(this.val$listener);
            }
        });
    }
}


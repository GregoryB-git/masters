/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RatingBar
 *  android.widget.RatingBar$OnRatingBarChangeListener
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.RatingBarChangeEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class RatingBarRatingChangeEventOnSubscribe
implements Observable.OnSubscribe<RatingBarChangeEvent> {
    public final RatingBar view;

    public RatingBarRatingChangeEventOnSubscribe(RatingBar ratingBar) {
        this.view = ratingBar;
    }

    public void call(Subscriber<? super RatingBarChangeEvent> subscriber) {
        Preconditions.checkUiThread();
        RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = new RatingBar.OnRatingBarChangeListener(this, subscriber){
            public final RatingBarRatingChangeEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = ratingBarRatingChangeEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onRatingChanged(RatingBar ratingBar, float f, boolean bl) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)RatingBarChangeEvent.create(ratingBar, f, bl));
                }
            }
        };
        this.view.setOnRatingBarChangeListener(onRatingBarChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final RatingBarRatingChangeEventOnSubscribe this$0;
            {
                this.this$0 = ratingBarRatingChangeEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnRatingBarChangeListener(null);
            }
        });
        onRatingBarChangeListener = this.view;
        subscriber.onNext((Object)RatingBarChangeEvent.create((RatingBar)onRatingBarChangeListener, onRatingBarChangeListener.getRating(), false));
    }
}


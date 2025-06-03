/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RatingBar
 *  android.widget.RatingBar$OnRatingBarChangeListener
 *  java.lang.Float
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class RatingBarRatingChangeOnSubscribe
implements Observable.OnSubscribe<Float> {
    public final RatingBar view;

    public RatingBarRatingChangeOnSubscribe(RatingBar ratingBar) {
        this.view = ratingBar;
    }

    public void call(Subscriber<? super Float> subscriber) {
        Preconditions.checkUiThread();
        RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = new RatingBar.OnRatingBarChangeListener(this, subscriber){
            public final RatingBarRatingChangeOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = ratingBarRatingChangeOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onRatingChanged(RatingBar ratingBar, float f, boolean bl) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)Float.valueOf((float)f));
                }
            }
        };
        this.view.setOnRatingBarChangeListener(onRatingBarChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final RatingBarRatingChangeOnSubscribe this$0;
            {
                this.this$0 = ratingBarRatingChangeOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnRatingBarChangeListener(null);
            }
        });
        subscriber.onNext((Object)Float.valueOf((float)this.view.getRating()));
    }
}


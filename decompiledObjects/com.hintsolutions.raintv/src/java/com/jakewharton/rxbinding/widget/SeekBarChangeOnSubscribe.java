/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import androidx.annotation.Nullable;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class SeekBarChangeOnSubscribe
implements Observable.OnSubscribe<Integer> {
    @Nullable
    public final Boolean shouldBeFromUser;
    public final SeekBar view;

    public SeekBarChangeOnSubscribe(SeekBar seekBar, @Nullable Boolean bl) {
        this.view = seekBar;
        this.shouldBeFromUser = bl;
    }

    public void call(Subscriber<? super Integer> subscriber) {
        Preconditions.checkUiThread();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener(this, subscriber){
            public final SeekBarChangeOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = seekBarChangeOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onProgressChanged(SeekBar seekBar, int n4, boolean bl) {
                if (!(this.val$subscriber.isUnsubscribed() || (seekBar = this.this$0.shouldBeFromUser) != null && seekBar.booleanValue() != bl)) {
                    this.val$subscriber.onNext((Object)n4);
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        };
        this.view.setOnSeekBarChangeListener(onSeekBarChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final SeekBarChangeOnSubscribe this$0;
            {
                this.this$0 = seekBarChangeOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnSeekBarChangeListener(null);
            }
        });
        subscriber.onNext((Object)this.view.getProgress());
    }
}


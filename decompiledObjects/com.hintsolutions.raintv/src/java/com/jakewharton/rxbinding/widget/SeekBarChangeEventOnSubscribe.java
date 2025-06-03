/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.SeekBar;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.SeekBarChangeEvent;
import com.jakewharton.rxbinding.widget.SeekBarProgressChangeEvent;
import com.jakewharton.rxbinding.widget.SeekBarStartChangeEvent;
import com.jakewharton.rxbinding.widget.SeekBarStopChangeEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class SeekBarChangeEventOnSubscribe
implements Observable.OnSubscribe<SeekBarChangeEvent> {
    public final SeekBar view;

    public SeekBarChangeEventOnSubscribe(SeekBar seekBar) {
        this.view = seekBar;
    }

    public void call(Subscriber<? super SeekBarChangeEvent> subscriber) {
        Preconditions.checkUiThread();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener(this, subscriber){
            public final SeekBarChangeEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = seekBarChangeEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onProgressChanged(SeekBar seekBar, int n4, boolean bl) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)SeekBarProgressChangeEvent.create(seekBar, n4, bl));
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)SeekBarStartChangeEvent.create(seekBar));
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)SeekBarStopChangeEvent.create(seekBar));
                }
            }
        };
        this.view.setOnSeekBarChangeListener(onSeekBarChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final SeekBarChangeEventOnSubscribe this$0;
            {
                this.this$0 = seekBarChangeEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnSeekBarChangeListener(null);
            }
        });
        onSeekBarChangeListener = this.view;
        subscriber.onNext((Object)SeekBarProgressChangeEvent.create((SeekBar)onSeekBarChangeListener, onSeekBarChangeListener.getProgress(), false));
    }
}


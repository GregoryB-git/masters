/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class TextViewAfterTextChangeEventOnSubscribe
implements Observable.OnSubscribe<TextViewAfterTextChangeEvent> {
    public final TextView view;

    public TextViewAfterTextChangeEventOnSubscribe(TextView textView) {
        this.view = textView;
    }

    public void call(Subscriber<? super TextViewAfterTextChangeEvent> subscriber) {
        Preconditions.checkUiThread();
        TextWatcher textWatcher = new TextWatcher(this, subscriber){
            public final TextViewAfterTextChangeEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = textViewAfterTextChangeEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void afterTextChanged(Editable editable) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)TextViewAfterTextChangeEvent.create(this.this$0.view, editable));
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int n4, int n5, int n6) {
            }

            public void onTextChanged(CharSequence charSequence, int n4, int n5, int n6) {
            }
        };
        this.view.addTextChangedListener(textWatcher);
        subscriber.add((Subscription)new MainThreadSubscription(this, textWatcher){
            public final TextViewAfterTextChangeEventOnSubscribe this$0;
            public final TextWatcher val$watcher;
            {
                this.this$0 = textViewAfterTextChangeEventOnSubscribe;
                this.val$watcher = textWatcher;
            }

            public void onUnsubscribe() {
                this.this$0.view.removeTextChangedListener(this.val$watcher);
            }
        });
        textWatcher = this.view;
        subscriber.onNext((Object)TextViewAfterTextChangeEvent.create((TextView)textWatcher, textWatcher.getEditableText()));
    }
}


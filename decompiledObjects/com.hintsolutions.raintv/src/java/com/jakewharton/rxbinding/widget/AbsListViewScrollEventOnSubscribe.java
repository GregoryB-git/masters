/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.AbsListView;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.AbsListViewScrollEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class AbsListViewScrollEventOnSubscribe
implements Observable.OnSubscribe<AbsListViewScrollEvent> {
    public final AbsListView view;

    public AbsListViewScrollEventOnSubscribe(AbsListView absListView) {
        this.view = absListView;
    }

    public void call(Subscriber<? super AbsListViewScrollEvent> subscriber) {
        Preconditions.checkUiThread();
        AbsListView.OnScrollListener onScrollListener = new AbsListView.OnScrollListener(this, subscriber){
            public int currentScrollState;
            public final AbsListViewScrollEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = absListViewScrollEventOnSubscribe;
                this.val$subscriber = subscriber;
                this.currentScrollState = 0;
            }

            public void onScroll(AbsListView object, int n4, int n5, int n6) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    object = AbsListViewScrollEvent.create(object, this.currentScrollState, n4, n5, n6);
                    this.val$subscriber.onNext(object);
                }
            }

            public void onScrollStateChanged(AbsListView object, int n4) {
                this.currentScrollState = n4;
                if (!this.val$subscriber.isUnsubscribed()) {
                    object = AbsListViewScrollEvent.create(object, n4, object.getFirstVisiblePosition(), object.getChildCount(), object.getCount());
                    this.val$subscriber.onNext(object);
                }
            }
        };
        this.view.setOnScrollListener(onScrollListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final AbsListViewScrollEventOnSubscribe this$0;
            {
                this.this$0 = absListViewScrollEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnScrollListener(null);
            }
        });
    }
}


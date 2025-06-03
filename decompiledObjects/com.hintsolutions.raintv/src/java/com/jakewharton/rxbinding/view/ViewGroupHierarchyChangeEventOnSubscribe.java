/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$OnHierarchyChangeListener
 *  java.lang.Object
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import android.view.ViewGroup;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.view.ViewGroupHierarchyChangeEvent;
import com.jakewharton.rxbinding.view.ViewGroupHierarchyChildViewAddEvent;
import com.jakewharton.rxbinding.view.ViewGroupHierarchyChildViewRemoveEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class ViewGroupHierarchyChangeEventOnSubscribe
implements Observable.OnSubscribe<ViewGroupHierarchyChangeEvent> {
    public final ViewGroup viewGroup;

    public ViewGroupHierarchyChangeEventOnSubscribe(ViewGroup viewGroup) {
        this.viewGroup = viewGroup;
    }

    public void call(Subscriber<? super ViewGroupHierarchyChangeEvent> subscriber) {
        Preconditions.checkUiThread();
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = new ViewGroup.OnHierarchyChangeListener(this, subscriber){
            public final ViewGroupHierarchyChangeEventOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = viewGroupHierarchyChangeEventOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public void onChildViewAdded(View view, View view2) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)ViewGroupHierarchyChildViewAddEvent.create((ViewGroup)view, view2));
                }
            }

            public void onChildViewRemoved(View view, View view2) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)ViewGroupHierarchyChildViewRemoveEvent.create((ViewGroup)view, view2));
                }
            }
        };
        this.viewGroup.setOnHierarchyChangeListener(onHierarchyChangeListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final ViewGroupHierarchyChangeEventOnSubscribe this$0;
            {
                this.this$0 = viewGroupHierarchyChangeEventOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.viewGroup.setOnHierarchyChangeListener(null);
            }
        });
    }
}


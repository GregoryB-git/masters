/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SearchView
 *  android.widget.SearchView$OnQueryTextListener
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  rx.Observable$OnSubscribe
 *  rx.Subscriber
 *  rx.Subscription
 *  rx.android.MainThreadSubscription
 */
package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class SearchViewQueryTextChangesOnSubscribe
implements Observable.OnSubscribe<CharSequence> {
    public final SearchView view;

    public SearchViewQueryTextChangesOnSubscribe(SearchView searchView) {
        this.view = searchView;
    }

    public void call(Subscriber<? super CharSequence> subscriber) {
        Preconditions.checkUiThread();
        SearchView.OnQueryTextListener onQueryTextListener = new SearchView.OnQueryTextListener(this, subscriber){
            public final SearchViewQueryTextChangesOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = searchViewQueryTextChangesOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onQueryTextChange(String string) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)string);
                    return true;
                }
                return false;
            }

            public boolean onQueryTextSubmit(String string) {
                return false;
            }
        };
        this.view.setOnQueryTextListener(onQueryTextListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final SearchViewQueryTextChangesOnSubscribe this$0;
            {
                this.this$0 = searchViewQueryTextChangesOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnQueryTextListener(null);
            }
        });
        subscriber.onNext((Object)this.view.getQuery());
    }
}


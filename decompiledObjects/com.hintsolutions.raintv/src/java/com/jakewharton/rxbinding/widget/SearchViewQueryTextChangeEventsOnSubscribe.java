/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SearchView
 *  android.widget.SearchView$OnQueryTextListener
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
import com.jakewharton.rxbinding.widget.SearchViewQueryTextEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.MainThreadSubscription;

final class SearchViewQueryTextChangeEventsOnSubscribe
implements Observable.OnSubscribe<SearchViewQueryTextEvent> {
    public final SearchView view;

    public SearchViewQueryTextChangeEventsOnSubscribe(SearchView searchView) {
        this.view = searchView;
    }

    public void call(Subscriber<? super SearchViewQueryTextEvent> subscriber) {
        Preconditions.checkUiThread();
        SearchView.OnQueryTextListener onQueryTextListener = new SearchView.OnQueryTextListener(this, subscriber){
            public final SearchViewQueryTextChangeEventsOnSubscribe this$0;
            public final Subscriber val$subscriber;
            {
                this.this$0 = searchViewQueryTextChangeEventsOnSubscribe;
                this.val$subscriber = subscriber;
            }

            public boolean onQueryTextChange(String string) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    this.val$subscriber.onNext((Object)SearchViewQueryTextEvent.create(this.this$0.view, string, false));
                    return true;
                }
                return false;
            }

            public boolean onQueryTextSubmit(String string) {
                if (!this.val$subscriber.isUnsubscribed()) {
                    string = this.val$subscriber;
                    SearchView searchView = this.this$0.view;
                    string.onNext((Object)SearchViewQueryTextEvent.create(searchView, searchView.getQuery(), true));
                    return true;
                }
                return false;
            }
        };
        this.view.setOnQueryTextListener(onQueryTextListener);
        subscriber.add((Subscription)new MainThreadSubscription(this){
            public final SearchViewQueryTextChangeEventsOnSubscribe this$0;
            {
                this.this$0 = searchViewQueryTextChangeEventsOnSubscribe;
            }

            public void onUnsubscribe() {
                this.this$0.view.setOnQueryTextListener(null);
            }
        });
        onQueryTextListener = this.view;
        subscriber.onNext((Object)SearchViewQueryTextEvent.create((SearchView)onQueryTextListener, onQueryTextListener.getQuery(), false));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RatingBar
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  com.jakewharton.rxbinding.widget.RatingBarChangeEvent
 *  com.jakewharton.rxbinding.widget.RatingBarRatingChangeEventOnSubscribe
 *  com.jakewharton.rxbinding.widget.RatingBarRatingChangeOnSubscribe
 *  com.jakewharton.rxbinding.widget.RxRatingBar$1
 *  com.jakewharton.rxbinding.widget.RxRatingBar$2
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Object
 *  rx.Observable
 *  rx.Observable$OnSubscribe
 *  rx.functions.Action1
 */
package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.internal.Preconditions;
import com.jakewharton.rxbinding.widget.RatingBarChangeEvent;
import com.jakewharton.rxbinding.widget.RatingBarRatingChangeEventOnSubscribe;
import com.jakewharton.rxbinding.widget.RatingBarRatingChangeOnSubscribe;
import com.jakewharton.rxbinding.widget.RxRatingBar;
import rx.Observable;
import rx.functions.Action1;

public final class RxRatingBar {
    private RxRatingBar() {
        throw new AssertionError((Object)"No instances.");
    }

    @CheckResult
    @NonNull
    public static Action1<? super Boolean> isIndicator(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new 2(ratingBar);
    }

    @CheckResult
    @NonNull
    public static Action1<? super Float> rating(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return new 1(ratingBar);
    }

    @CheckResult
    @NonNull
    public static Observable<RatingBarChangeEvent> ratingChangeEvents(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return Observable.create((Observable.OnSubscribe)new RatingBarRatingChangeEventOnSubscribe(ratingBar));
    }

    @CheckResult
    @NonNull
    public static Observable<Float> ratingChanges(@NonNull RatingBar ratingBar) {
        Preconditions.checkNotNull(ratingBar, "view == null");
        return Observable.create((Observable.OnSubscribe)new RatingBarRatingChangeOnSubscribe(ratingBar));
    }
}


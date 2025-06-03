/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RatingBar
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class RatingBarChangeEvent
extends ViewEvent<RatingBar> {
    private final boolean fromUser;
    private final float rating;

    private RatingBarChangeEvent(@NonNull RatingBar ratingBar, float f, boolean bl) {
        super(ratingBar);
        this.rating = f;
        this.fromUser = bl;
    }

    @CheckResult
    @NonNull
    public static RatingBarChangeEvent create(@NonNull RatingBar ratingBar, float f, boolean bl) {
        return new RatingBarChangeEvent(ratingBar, f, bl);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof RatingBarChangeEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (RatingBarChangeEvent)object)).view() != this.view() || ((RatingBarChangeEvent)object).rating != this.rating || ((RatingBarChangeEvent)object).fromUser != this.fromUser) {
            bl = false;
        }
        return bl;
    }

    public boolean fromUser() {
        return this.fromUser;
    }

    public int hashCode() {
        int n = ((RatingBar)this.view()).hashCode();
        return (Float.floatToIntBits((float)this.rating) + (n + 629) * 37) * 37 + this.fromUser;
    }

    public float rating() {
        return this.rating;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("RatingBarChangeEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append(", rating=");
        stringBuilder.append(this.rating);
        stringBuilder.append(", fromUser=");
        stringBuilder.append(this.fromUser);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


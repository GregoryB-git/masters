/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class AdapterViewItemClickEvent
extends ViewEvent<AdapterView<?>> {
    private final View clickedView;
    private final long id;
    private final int position;

    private AdapterViewItemClickEvent(@NonNull AdapterView<?> adapterView, @NonNull View view, int n, long l) {
        super(adapterView);
        this.clickedView = view;
        this.position = n;
        this.id = l;
    }

    @CheckResult
    @NonNull
    public static AdapterViewItemClickEvent create(@NonNull AdapterView<?> adapterView, @NonNull View view, int n, long l) {
        return new AdapterViewItemClickEvent(adapterView, view, n, l);
    }

    @NonNull
    public View clickedView() {
        return this.clickedView;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof AdapterViewItemClickEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (AdapterViewItemClickEvent)object)).view() != this.view() || ((AdapterViewItemClickEvent)object).clickedView != this.clickedView || ((AdapterViewItemClickEvent)object).position != this.position || ((AdapterViewItemClickEvent)object).id != this.id) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n = ((AdapterView)this.view()).hashCode();
        int n2 = this.clickedView.hashCode();
        int n3 = this.position;
        long l = this.id;
        return ((n2 + (n + 629) * 37) * 37 + n3) * 37 + (int)(l ^ l >>> 32);
    }

    public long id() {
        return this.id;
    }

    public int position() {
        return this.position;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("AdapterViewItemClickEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append(", clickedView=");
        stringBuilder.append((Object)this.clickedView);
        stringBuilder.append(", position=");
        stringBuilder.append(this.position);
        stringBuilder.append(", id=");
        return a.o(stringBuilder, this.id, '}');
    }
}


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
import com.jakewharton.rxbinding.widget.AdapterViewSelectionEvent;

public final class AdapterViewItemSelectionEvent
extends AdapterViewSelectionEvent {
    private final long id;
    private final int position;
    private final View selectedView;

    private AdapterViewItemSelectionEvent(@NonNull AdapterView<?> adapterView, @NonNull View view, int n4, long l4) {
        super(adapterView);
        this.selectedView = view;
        this.position = n4;
        this.id = l4;
    }

    @CheckResult
    @NonNull
    public static AdapterViewSelectionEvent create(@NonNull AdapterView<?> adapterView, @NonNull View view, int n4, long l4) {
        return new AdapterViewItemSelectionEvent(adapterView, view, n4, l4);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof AdapterViewItemSelectionEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (AdapterViewItemSelectionEvent)object)).view() != this.view() || ((AdapterViewItemSelectionEvent)object).selectedView != this.selectedView || ((AdapterViewItemSelectionEvent)object).position != this.position || ((AdapterViewItemSelectionEvent)object).id != this.id) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n4 = ((AdapterView)this.view()).hashCode();
        int n5 = this.selectedView.hashCode();
        int n6 = this.position;
        long l4 = this.id;
        return ((n5 + (n4 + 629) * 37) * 37 + n6) * 37 + (int)(l4 ^ l4 >>> 32);
    }

    public long id() {
        return this.id;
    }

    public int position() {
        return this.position;
    }

    @NonNull
    public View selectedView() {
        return this.selectedView;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("AdapterViewItemSelectionEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append(", selectedView=");
        stringBuilder.append((Object)this.selectedView);
        stringBuilder.append(", position=");
        stringBuilder.append(this.position);
        stringBuilder.append(", id=");
        return a.o(stringBuilder, this.id, '}');
    }
}


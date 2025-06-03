/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AdapterView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.widget.AdapterView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.widget.AdapterViewSelectionEvent;

public final class AdapterViewNothingSelectionEvent
extends AdapterViewSelectionEvent {
    private AdapterViewNothingSelectionEvent(@NonNull AdapterView<?> adapterView) {
        super(adapterView);
    }

    @CheckResult
    @NonNull
    public static AdapterViewSelectionEvent create(@NonNull AdapterView<?> adapterView) {
        return new AdapterViewNothingSelectionEvent(adapterView);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof AdapterViewNothingSelectionEvent)) {
            return false;
        }
        if (((AdapterViewNothingSelectionEvent)object).view() != this.view()) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return ((AdapterView)this.view()).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("AdapterViewNothingSelectionEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


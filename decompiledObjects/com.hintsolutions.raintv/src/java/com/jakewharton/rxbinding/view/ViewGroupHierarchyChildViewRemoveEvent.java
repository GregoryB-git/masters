/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;
import com.jakewharton.rxbinding.view.ViewGroupHierarchyChangeEvent;

public final class ViewGroupHierarchyChildViewRemoveEvent
extends ViewGroupHierarchyChangeEvent {
    private ViewGroupHierarchyChildViewRemoveEvent(@NonNull ViewGroup viewGroup, View view) {
        super(viewGroup, view);
    }

    @CheckResult
    @NonNull
    public static ViewGroupHierarchyChildViewRemoveEvent create(@NonNull ViewGroup viewGroup, View view) {
        return new ViewGroupHierarchyChildViewRemoveEvent(viewGroup, view);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof ViewGroupHierarchyChildViewRemoveEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (ViewGroupHierarchyChildViewRemoveEvent)object)).view() != this.view() || ((ViewGroupHierarchyChangeEvent)object).child() != this.child()) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n4 = ((ViewGroup)this.view()).hashCode();
        return this.child().hashCode() + (n4 + 629) * 37;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ViewGroupHierarchyChildViewRemoveEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append(", child=");
        stringBuilder.append((Object)this.child());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


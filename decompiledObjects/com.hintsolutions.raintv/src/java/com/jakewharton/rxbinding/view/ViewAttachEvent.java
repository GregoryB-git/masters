/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class ViewAttachEvent
extends ViewEvent<View> {
    private final Kind kind;

    private ViewAttachEvent(@NonNull View view, @NonNull Kind kind) {
        super(view);
        this.kind = kind;
    }

    @CheckResult
    @NonNull
    public static ViewAttachEvent create(@NonNull View view, @NonNull Kind kind) {
        return new ViewAttachEvent(view, kind);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof ViewAttachEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (ViewAttachEvent)object)).view() != this.view() || ((ViewAttachEvent)object).kind() != this.kind()) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n = this.view().hashCode();
        return this.kind().hashCode() + (n + 629) * 37;
    }

    @NonNull
    public Kind kind() {
        return this.kind;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ViewAttachEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append(", kind=");
        stringBuilder.append((Object)this.kind());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}


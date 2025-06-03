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

public final class ViewScrollChangeEvent
extends ViewEvent<View> {
    private final int oldScrollX;
    private final int oldScrollY;
    private final int scrollX;
    private final int scrollY;

    public ViewScrollChangeEvent(@NonNull View view, int n, int n2, int n3, int n4) {
        super(view);
        this.scrollX = n;
        this.scrollY = n2;
        this.oldScrollX = n3;
        this.oldScrollY = n4;
    }

    @CheckResult
    @NonNull
    public static ViewScrollChangeEvent create(@NonNull View view, int n, int n2, int n3, int n4) {
        return new ViewScrollChangeEvent(view, n, n2, n3, n4);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof ViewScrollChangeEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (ViewScrollChangeEvent)object)).view() != this.view() || ((ViewScrollChangeEvent)object).scrollX != this.scrollX || ((ViewScrollChangeEvent)object).scrollY != this.scrollY || ((ViewScrollChangeEvent)object).oldScrollX != this.oldScrollX || ((ViewScrollChangeEvent)object).oldScrollY != this.oldScrollY) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return ((((this.view().hashCode() + 629) * 37 + this.scrollX) * 37 + this.scrollY) * 37 + this.oldScrollX) * 37 + this.oldScrollY;
    }

    public int oldScrollX() {
        return this.oldScrollX;
    }

    public int oldScrollY() {
        return this.oldScrollY;
    }

    public int scrollX() {
        return this.scrollX;
    }

    public int scrollY() {
        return this.scrollY;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ViewScrollChangeEvent{scrollX=");
        stringBuilder.append(this.scrollX);
        stringBuilder.append(", scrollY=");
        stringBuilder.append(this.scrollY);
        stringBuilder.append(", oldScrollX=");
        stringBuilder.append(this.oldScrollX);
        stringBuilder.append(", oldScrollY=");
        return a.n(stringBuilder, this.oldScrollY, '}');
    }
}


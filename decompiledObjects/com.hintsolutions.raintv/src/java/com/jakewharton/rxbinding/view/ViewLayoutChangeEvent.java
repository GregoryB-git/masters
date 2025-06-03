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

public final class ViewLayoutChangeEvent
extends ViewEvent<View> {
    private final int bottom;
    private final int left;
    private final int oldBottom;
    private final int oldLeft;
    private final int oldRight;
    private final int oldTop;
    private final int right;
    private final int top;

    private ViewLayoutChangeEvent(@NonNull View view, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        super(view);
        this.left = n;
        this.top = n2;
        this.right = n3;
        this.bottom = n4;
        this.oldLeft = n5;
        this.oldTop = n6;
        this.oldRight = n7;
        this.oldBottom = n8;
    }

    @CheckResult
    @NonNull
    public static ViewLayoutChangeEvent create(@NonNull View view, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return new ViewLayoutChangeEvent(view, n, n2, n3, n4, n5, n6, n7, n8);
    }

    public int bottom() {
        return this.bottom;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof ViewLayoutChangeEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (ViewLayoutChangeEvent)object)).view() != this.view() || ((ViewLayoutChangeEvent)object).left != this.left || ((ViewLayoutChangeEvent)object).top != this.top || ((ViewLayoutChangeEvent)object).right != this.right || ((ViewLayoutChangeEvent)object).bottom != this.bottom || ((ViewLayoutChangeEvent)object).oldLeft != this.oldLeft || ((ViewLayoutChangeEvent)object).oldTop != this.oldTop || ((ViewLayoutChangeEvent)object).oldRight != this.oldRight || ((ViewLayoutChangeEvent)object).oldBottom != this.oldBottom) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        return ((((((((this.view().hashCode() + 629) * 37 + this.left) * 37 + this.top) * 37 + this.right) * 37 + this.bottom) * 37 + this.oldLeft) * 37 + this.oldTop) * 37 + this.oldRight) * 37 + this.oldBottom;
    }

    public int left() {
        return this.left;
    }

    public int oldBottom() {
        return this.oldBottom;
    }

    public int oldLeft() {
        return this.oldLeft;
    }

    public int oldRight() {
        return this.oldRight;
    }

    public int oldTop() {
        return this.oldTop;
    }

    public int right() {
        return this.right;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("ViewLayoutChangeEvent{left=");
        stringBuilder.append(this.left);
        stringBuilder.append(", top=");
        stringBuilder.append(this.top);
        stringBuilder.append(", right=");
        stringBuilder.append(this.right);
        stringBuilder.append(", bottom=");
        stringBuilder.append(this.bottom);
        stringBuilder.append(", oldLeft=");
        stringBuilder.append(this.oldLeft);
        stringBuilder.append(", oldTop=");
        stringBuilder.append(this.oldTop);
        stringBuilder.append(", oldRight=");
        stringBuilder.append(this.oldRight);
        stringBuilder.append(", oldBottom=");
        return a.n(stringBuilder, this.oldBottom, '}');
    }

    public int top() {
        return this.top;
    }
}


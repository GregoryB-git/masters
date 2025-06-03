/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.window.core;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class Bounds {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public Bounds(int n8, int n9, int n10, int n11) {
        this.left = n8;
        this.top = n9;
        this.right = n10;
        this.bottom = n11;
    }

    public Bounds(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter((Object)rect, "rect");
        this(rect.left, rect.top, rect.right, rect.bottom);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class class_ = object == null ? null : object.getClass();
        if (!Intrinsics.a(Bounds.class, (Object)class_)) {
            return false;
        }
        if (object != null) {
            object = (Bounds)object;
            if (this.left != object.left) {
                return false;
            }
            if (this.top != object.top) {
                return false;
            }
            if (this.right != object.right) {
                return false;
            }
            if (this.bottom != object.bottom) {
                return false;
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return ((this.left * 31 + this.top) * 31 + this.right) * 31 + this.bottom;
    }

    public final boolean isEmpty() {
        if (this.getHeight() != 0 && this.getWidth() != 0) {
            return false;
        }
        return true;
    }

    public final boolean isZero() {
        if (this.getHeight() == 0 && this.getWidth() == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Rect toRect() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)Bounds.class.getSimpleName());
        stringBuilder.append(" { [");
        stringBuilder.append(this.left);
        stringBuilder.append(',');
        stringBuilder.append(this.top);
        stringBuilder.append(',');
        stringBuilder.append(this.right);
        stringBuilder.append(',');
        stringBuilder.append(this.bottom);
        stringBuilder.append("] }");
        return stringBuilder.toString();
    }
}


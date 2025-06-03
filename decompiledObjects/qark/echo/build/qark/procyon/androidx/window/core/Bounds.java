// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import android.graphics.Rect;
import kotlin.Metadata;

@Metadata
public final class Bounds
{
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;
    
    public Bounds(final int left, final int top, final int right, final int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }
    
    public Bounds(@NotNull final Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Object class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        if (!Intrinsics.a(Bounds.class, class1)) {
            return false;
        }
        if (o != null) {
            final Bounds bounds = (Bounds)o;
            return this.left == bounds.left && this.top == bounds.top && this.right == bounds.right && this.bottom == bounds.bottom;
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
    
    @Override
    public int hashCode() {
        return ((this.left * 31 + this.top) * 31 + this.right) * 31 + this.bottom;
    }
    
    public final boolean isEmpty() {
        return this.getHeight() == 0 || this.getWidth() == 0;
    }
    
    public final boolean isZero() {
        return this.getHeight() == 0 && this.getWidth() == 0;
    }
    
    @NotNull
    public final Rect toRect() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)Bounds.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.left);
        sb.append(',');
        sb.append(this.top);
        sb.append(',');
        sb.append(this.right);
        sb.append(',');
        sb.append(this.bottom);
        sb.append("] }");
        return sb.toString();
    }
}

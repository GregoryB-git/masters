// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import kotlin.jvm.internal.Intrinsics;
import android.graphics.Rect;
import org.jetbrains.annotations.NotNull;
import androidx.window.core.Bounds;
import kotlin.Metadata;

@Metadata
public final class WindowMetrics
{
    @NotNull
    private final Bounds _bounds;
    
    public WindowMetrics(@NotNull final Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "bounds");
        this(new Bounds(rect));
    }
    
    public WindowMetrics(@NotNull final Bounds bounds) {
        Intrinsics.checkNotNullParameter(bounds, "_bounds");
        this._bounds = bounds;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && Intrinsics.a(WindowMetrics.class, o.getClass()) && Intrinsics.a(this._bounds, ((WindowMetrics)o)._bounds));
    }
    
    @NotNull
    public final Rect getBounds() {
        return this._bounds.toRect();
    }
    
    @Override
    public int hashCode() {
        return this._bounds.hashCode();
    }
    
    @NotNull
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WindowMetrics { bounds: ");
        sb.append(this.getBounds());
        sb.append(" }");
        return sb.toString();
    }
}

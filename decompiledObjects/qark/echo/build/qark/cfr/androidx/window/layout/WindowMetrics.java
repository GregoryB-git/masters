/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class WindowMetrics {
    @NotNull
    private final Bounds _bounds;

    public WindowMetrics(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter((Object)rect, "bounds");
        this(new Bounds(rect));
    }

    public WindowMetrics(@NotNull Bounds bounds) {
        Intrinsics.checkNotNullParameter(bounds, "_bounds");
        this._bounds = bounds;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && Intrinsics.a(WindowMetrics.class, (Object)object.getClass())) {
            object = (WindowMetrics)object;
            return Intrinsics.a(this._bounds, object._bounds);
        }
        return false;
    }

    @NotNull
    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WindowMetrics { bounds: ");
        stringBuilder.append((Object)this.getBounds());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}


/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package androidx.window.layout;

import W5.m;
import androidx.window.layout.DisplayFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class WindowLayoutInfo {
    @NotNull
    private final List<DisplayFeature> displayFeatures;

    public WindowLayoutInfo(@NotNull List<? extends DisplayFeature> list) {
        Intrinsics.checkNotNullParameter(list, "displayFeatures");
        this.displayFeatures = list;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && Intrinsics.a(WindowLayoutInfo.class, (Object)object.getClass())) {
            object = (WindowLayoutInfo)object;
            return Intrinsics.a(this.displayFeatures, object.displayFeatures);
        }
        return false;
    }

    @NotNull
    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    @NotNull
    public String toString() {
        return m.x((Iterable)this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}


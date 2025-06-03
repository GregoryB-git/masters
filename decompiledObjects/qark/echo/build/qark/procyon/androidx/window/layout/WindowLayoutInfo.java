// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import g6.l;
import W5.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import kotlin.Metadata;

@Metadata
public final class WindowLayoutInfo
{
    @NotNull
    private final List<DisplayFeature> displayFeatures;
    
    public WindowLayoutInfo(@NotNull final List<? extends DisplayFeature> displayFeatures) {
        Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.displayFeatures = (List<DisplayFeature>)displayFeatures;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && Intrinsics.a(WindowLayoutInfo.class, o.getClass()) && Intrinsics.a(this.displayFeatures, ((WindowLayoutInfo)o).displayFeatures));
    }
    
    @NotNull
    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }
    
    @Override
    public int hashCode() {
        return this.displayFeatures.hashCode();
    }
    
    @NotNull
    @Override
    public String toString() {
        return m.x(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}

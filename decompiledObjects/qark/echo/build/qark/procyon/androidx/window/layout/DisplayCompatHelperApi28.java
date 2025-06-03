// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import kotlin.jvm.internal.Intrinsics;
import android.view.DisplayCutout;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class DisplayCompatHelperApi28
{
    @NotNull
    public static final DisplayCompatHelperApi28 INSTANCE;
    
    static {
        INSTANCE = new DisplayCompatHelperApi28();
    }
    
    private DisplayCompatHelperApi28() {
    }
    
    public final int safeInsetBottom(@NotNull final DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return f.a(displayCutout);
    }
    
    public final int safeInsetLeft(@NotNull final DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return g.a(displayCutout);
    }
    
    public final int safeInsetRight(@NotNull final DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return e.a(displayCutout);
    }
    
    public final int safeInsetTop(@NotNull final DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return h.a(displayCutout);
    }
}

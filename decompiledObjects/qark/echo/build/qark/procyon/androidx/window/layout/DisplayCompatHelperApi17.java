// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import kotlin.jvm.internal.Intrinsics;
import android.graphics.Point;
import android.view.Display;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class DisplayCompatHelperApi17
{
    @NotNull
    public static final DisplayCompatHelperApi17 INSTANCE;
    
    static {
        INSTANCE = new DisplayCompatHelperApi17();
    }
    
    private DisplayCompatHelperApi17() {
    }
    
    public final void getRealSize(@NotNull final Display display, @NotNull final Point point) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
    }
}

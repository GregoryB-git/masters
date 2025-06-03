// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import g6.p;
import X5.d;
import s6.b;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class WindowInfoTrackerImpl implements WindowInfoTracker
{
    private static final int BUFFER_CAPACITY = 10;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final WindowBackend windowBackend;
    @NotNull
    private final WindowMetricsCalculator windowMetricsCalculator;
    
    static {
        Companion = new Companion(null);
    }
    
    public WindowInfoTrackerImpl(@NotNull final WindowMetricsCalculator windowMetricsCalculator, @NotNull final WindowBackend windowBackend) {
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }
    
    @NotNull
    @Override
    public b windowLayoutInfo(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return s6.d.e((p)new WindowInfoTrackerImpl$windowLayoutInfo.WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (d)null));
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
    }
}

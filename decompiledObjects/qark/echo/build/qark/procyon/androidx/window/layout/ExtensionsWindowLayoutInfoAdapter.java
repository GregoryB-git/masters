// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.layout;

import java.util.Iterator;
import java.util.ArrayList;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.List;
import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.jvm.internal.Intrinsics;
import androidx.window.extensions.layout.FoldingFeature;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class ExtensionsWindowLayoutInfoAdapter
{
    @NotNull
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE;
    
    static {
        INSTANCE = new ExtensionsWindowLayoutInfoAdapter();
    }
    
    private ExtensionsWindowLayoutInfoAdapter() {
    }
    
    private final boolean validBounds(final Activity activity, final Bounds bounds) {
        final Rect bounds2 = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).getBounds();
        return !bounds.isZero() && (bounds.getWidth() == bounds2.width() || bounds.getHeight() == bounds2.height()) && (bounds.getWidth() >= bounds2.width() || bounds.getHeight() >= bounds2.height()) && (bounds.getWidth() != bounds2.width() || bounds.getHeight() != bounds2.height());
    }
    
    public final androidx.window.layout.FoldingFeature translate$window_release(@NotNull final Activity activity, @NotNull final FoldingFeature foldingFeature) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(foldingFeature, "oemFeature");
        final int type = foldingFeature.getType();
        androidx.window.layout.FoldingFeature foldingFeature2 = null;
        HardwareFoldingFeature.Type type2;
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            type2 = HardwareFoldingFeature.Type.Companion.getHINGE();
        }
        else {
            type2 = HardwareFoldingFeature.Type.Companion.getFOLD();
        }
        final int state = foldingFeature.getState();
        androidx.window.layout.FoldingFeature.State state2;
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            state2 = androidx.window.layout.FoldingFeature.State.HALF_OPENED;
        }
        else {
            state2 = androidx.window.layout.FoldingFeature.State.FLAT;
        }
        final Rect bounds = foldingFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        if (this.validBounds(activity, new Bounds(bounds))) {
            final Rect bounds2 = foldingFeature.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds2, "oemFeature.bounds");
            foldingFeature2 = new HardwareFoldingFeature(new Bounds(bounds2), type2, state2);
        }
        return foldingFeature2;
    }
    
    @NotNull
    public final androidx.window.layout.WindowLayoutInfo translate$window_release(@NotNull final Activity activity, @NotNull final WindowLayoutInfo windowLayoutInfo) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(windowLayoutInfo, "info");
        final List displayFeatures = windowLayoutInfo.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        final List<DisplayFeature> list = (List<DisplayFeature>)displayFeatures;
        final ArrayList<androidx.window.layout.FoldingFeature> list2 = new ArrayList<androidx.window.layout.FoldingFeature>();
        for (final DisplayFeature displayFeature : list) {
            androidx.window.layout.FoldingFeature translate$window_release;
            if (displayFeature instanceof FoldingFeature) {
                final ExtensionsWindowLayoutInfoAdapter instance = ExtensionsWindowLayoutInfoAdapter.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(displayFeature, "feature");
                translate$window_release = instance.translate$window_release(activity, (FoldingFeature)displayFeature);
            }
            else {
                translate$window_release = null;
            }
            if (translate$window_release != null) {
                list2.add(translate$window_release);
            }
        }
        return new androidx.window.layout.WindowLayoutInfo(list2);
    }
}

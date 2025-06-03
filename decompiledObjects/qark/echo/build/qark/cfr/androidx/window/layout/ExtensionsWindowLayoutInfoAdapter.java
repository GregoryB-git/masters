/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Rect
 *  androidx.window.extensions.layout.DisplayFeature
 *  androidx.window.extensions.layout.FoldingFeature
 *  androidx.window.extensions.layout.WindowLayoutInfo
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculatorCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ExtensionsWindowLayoutInfoAdapter {
    @NotNull
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE = new ExtensionsWindowLayoutInfoAdapter();

    private ExtensionsWindowLayoutInfoAdapter() {
    }

    private final boolean validBounds(Activity activity, Bounds bounds) {
        activity = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity).getBounds();
        if (bounds.isZero()) {
            return false;
        }
        if (bounds.getWidth() != activity.width() && bounds.getHeight() != activity.height()) {
            return false;
        }
        if (bounds.getWidth() < activity.width() && bounds.getHeight() < activity.height()) {
            return false;
        }
        if (bounds.getWidth() == activity.width() && bounds.getHeight() == activity.height()) {
            return false;
        }
        return true;
    }

    public final FoldingFeature translate$window_release(@NotNull Activity activity, @NotNull androidx.window.extensions.layout.FoldingFeature foldingFeature) {
        HardwareFoldingFeature.Type type;
        FoldingFeature.State state;
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        Intrinsics.checkNotNullParameter((Object)foldingFeature, "oemFeature");
        int n8 = foldingFeature.getType();
        HardwareFoldingFeature hardwareFoldingFeature = null;
        if (n8 != 1) {
            if (n8 != 2) {
                return null;
            }
            type = HardwareFoldingFeature.Type.Companion.getHINGE();
        } else {
            type = HardwareFoldingFeature.Type.Companion.getFOLD();
        }
        n8 = foldingFeature.getState();
        if (n8 != 1) {
            if (n8 != 2) {
                return null;
            }
            state = FoldingFeature.State.HALF_OPENED;
        } else {
            state = FoldingFeature.State.FLAT;
        }
        Rect rect = foldingFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue((Object)rect, "oemFeature.bounds");
        if (this.validBounds(activity, new Bounds(rect))) {
            activity = foldingFeature.getBounds();
            Intrinsics.checkNotNullExpressionValue((Object)activity, "oemFeature.bounds");
            hardwareFoldingFeature = new HardwareFoldingFeature(new Bounds((Rect)activity), type, state);
        }
        return hardwareFoldingFeature;
    }

    @NotNull
    public final WindowLayoutInfo translate$window_release(@NotNull Activity activity, @NotNull androidx.window.extensions.layout.WindowLayoutInfo object) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        Intrinsics.checkNotNullParameter(object, "info");
        object = object.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(object, "info.displayFeatures");
        object = (Iterable)object;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (androidx.window.extensions.layout.DisplayFeature)iterator.next();
            if (object instanceof androidx.window.extensions.layout.FoldingFeature) {
                ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(object, "feature");
                object = extensionsWindowLayoutInfoAdapter.translate$window_release(activity, (androidx.window.extensions.layout.FoldingFeature)object);
            } else {
                object = null;
            }
            if (object == null) continue;
            arrayList.add(object);
        }
        return new WindowLayoutInfo((List<? extends DisplayFeature>)arrayList);
    }
}


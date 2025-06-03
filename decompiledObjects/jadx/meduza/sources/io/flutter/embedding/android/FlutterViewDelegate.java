package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.util.ViewUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterViewDelegate {
    public List<Rect> getCaptionBarInsets(Context context) {
        WindowInsets windowInsets = getWindowInsets(context);
        return windowInsets == null ? Collections.emptyList() : windowInsets.getBoundingRects(WindowInsets$Type.captionBar());
    }

    public WindowInsets getWindowInsets(Context context) {
        Window window;
        Activity activity = ViewUtils.getActivity(context);
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootWindowInsets();
    }

    public void growViewportMetricsToCaptionBar(Context context, FlutterRenderer.ViewportMetrics viewportMetrics) {
        List<Rect> captionBarInsets = getCaptionBarInsets(context);
        int i10 = viewportMetrics.viewPaddingTop;
        Iterator<Rect> it = captionBarInsets.iterator();
        while (it.hasNext()) {
            i10 = Math.max(i10, it.next().bottom);
        }
        viewportMetrics.viewPaddingTop = i10;
    }
}

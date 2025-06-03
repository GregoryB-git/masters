package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsets.Type;
import io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics;
import io.flutter.util.ViewUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FlutterViewDelegate
{
  public List<Rect> getCaptionBarInsets(Context paramContext)
  {
    paramContext = getWindowInsets(paramContext);
    if (paramContext == null) {
      return Collections.emptyList();
    }
    return paramContext.getBoundingRects(WindowInsets.Type.captionBar());
  }
  
  public WindowInsets getWindowInsets(Context paramContext)
  {
    paramContext = ViewUtils.getActivity(paramContext);
    if (paramContext == null) {
      return null;
    }
    paramContext = paramContext.getWindow();
    if (paramContext == null) {
      return null;
    }
    return paramContext.getDecorView().getRootWindowInsets();
  }
  
  public void growViewportMetricsToCaptionBar(Context paramContext, FlutterRenderer.ViewportMetrics paramViewportMetrics)
  {
    paramContext = getCaptionBarInsets(paramContext);
    int i = viewPaddingTop;
    paramContext = paramContext.iterator();
    while (paramContext.hasNext()) {
      i = Math.max(i, nextbottom);
    }
    viewPaddingTop = i;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterViewDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package io.flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import d;
import e0.e;
import i2.l;
import i2.m;
import i2.n;
import i2.n.a;
import i2.n.a.a;
import i2.o;

public final class ViewUtils
{
  public static void calculateMaximumDisplayMetrics(Context paramContext, DisplayUpdater paramDisplayUpdater)
  {
    Object localObject = getActivity(paramContext);
    if (localObject != null)
    {
      int i = m.a;
      n.a.getClass();
      localObject = ((n)n.a.b.invoke(o.b)).a((Activity)localObject);
      paramDisplayUpdater.updateDisplayMetrics(((l)localObject).a().width(), ((l)localObject).a().height(), getResourcesgetDisplayMetricsdensity);
    }
  }
  
  public static boolean childHasFocus(View paramView)
  {
    return traverseHierarchy(paramView, new e(25));
  }
  
  public static Activity getActivity(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    if ((paramContext instanceof Activity)) {
      return (Activity)paramContext;
    }
    if ((paramContext instanceof ContextWrapper)) {
      return getActivity(((ContextWrapper)paramContext).getBaseContext());
    }
    return null;
  }
  
  public static boolean hasChildViewOfType(View paramView, Class<? extends View>[] paramArrayOfClass)
  {
    return traverseHierarchy(paramView, new d(paramArrayOfClass, 21));
  }
  
  public static boolean traverseHierarchy(View paramView, ViewVisitor paramViewVisitor)
  {
    if (paramView == null) {
      return false;
    }
    if (paramViewVisitor.run(paramView)) {
      return true;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      for (int i = 0; i < paramView.getChildCount(); i++) {
        if (traverseHierarchy(paramView.getChildAt(i), paramViewVisitor)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static abstract interface DisplayUpdater
  {
    public abstract void updateDisplayMetrics(float paramFloat1, float paramFloat2, float paramFloat3);
  }
  
  public static abstract interface ViewVisitor
  {
    public abstract boolean run(View paramView);
  }
}

/* Location:
 * Qualified Name:     io.flutter.util.ViewUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
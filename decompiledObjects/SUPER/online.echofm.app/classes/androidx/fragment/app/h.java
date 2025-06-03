package androidx.fragment.app;

import U.c;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;

public final class h
  extends FrameLayout
{
  public ArrayList o;
  public ArrayList p;
  public boolean q = true;
  
  public h(Context paramContext, AttributeSet paramAttributeSet, n paramn)
  {
    super(paramContext, paramAttributeSet);
    String str = paramAttributeSet.getClassAttribute();
    Object localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, c.h);
    Object localObject2 = str;
    if (str == null) {
      localObject2 = ((TypedArray)localObject1).getString(c.i);
    }
    str = ((TypedArray)localObject1).getString(c.j);
    ((TypedArray)localObject1).recycle();
    int i = getId();
    localObject1 = paramn.g0(i);
    if ((localObject2 != null) && (localObject1 == null))
    {
      if (i <= 0)
      {
        if (str != null)
        {
          paramContext = new StringBuilder();
          paramContext.append(" with tag ");
          paramContext.append(str);
          paramContext = paramContext.toString();
        }
        else
        {
          paramContext = "";
        }
        paramAttributeSet = new StringBuilder();
        paramAttributeSet.append("FragmentContainerView must have an android:id to add Fragment ");
        paramAttributeSet.append((String)localObject2);
        paramAttributeSet.append(paramContext);
        throw new IllegalStateException(paramAttributeSet.toString());
      }
      localObject2 = paramn.p0().a(paramContext.getClassLoader(), (String)localObject2);
      ((Fragment)localObject2).y0(paramContext, paramAttributeSet, null);
      paramn.m().l(true).c(this, (Fragment)localObject2, str).h();
    }
  }
  
  public final void a(View paramView)
  {
    ArrayList localArrayList = p;
    if ((localArrayList != null) && (localArrayList.contains(paramView)))
    {
      if (o == null) {
        o = new ArrayList();
      }
      o.add(paramView);
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (n.y0(paramView) != null)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    paramLayoutParams = new StringBuilder();
    paramLayoutParams.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    paramLayoutParams.append(paramView);
    paramLayoutParams.append(" is not associated with a Fragment.");
    throw new IllegalStateException(paramLayoutParams.toString());
  }
  
  public boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (n.y0(paramView) != null) {
      return super.addViewInLayout(paramView, paramInt, paramLayoutParams, paramBoolean);
    }
    paramLayoutParams = new StringBuilder();
    paramLayoutParams.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    paramLayoutParams.append(paramView);
    paramLayoutParams.append(" is not associated with a Fragment.");
    throw new IllegalStateException(paramLayoutParams.toString());
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    if ((q) && (o != null)) {
      for (int i = 0; i < o.size(); i++) {
        super.drawChild(paramCanvas, (View)o.get(i), getDrawingTime());
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    if (q)
    {
      ArrayList localArrayList = o;
      if ((localArrayList != null) && (localArrayList.size() > 0) && (o.contains(paramView))) {
        return false;
      }
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public void endViewTransition(View paramView)
  {
    ArrayList localArrayList = p;
    if (localArrayList != null)
    {
      localArrayList.remove(paramView);
      localArrayList = o;
      if ((localArrayList != null) && (localArrayList.remove(paramView))) {
        q = true;
      }
    }
    super.endViewTransition(paramView);
  }
  
  public WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    for (int i = 0; i < getChildCount(); i++) {
      getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(paramWindowInsets));
    }
    return paramWindowInsets;
  }
  
  public void removeAllViewsInLayout()
  {
    for (int i = getChildCount() - 1; i >= 0; i--) {
      a(getChildAt(i));
    }
    super.removeAllViewsInLayout();
  }
  
  public void removeDetachedView(View paramView, boolean paramBoolean)
  {
    if (paramBoolean) {
      a(paramView);
    }
    super.removeDetachedView(paramView, paramBoolean);
  }
  
  public void removeView(View paramView)
  {
    a(paramView);
    super.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt)
  {
    a(getChildAt(paramInt));
    super.removeViewAt(paramInt);
  }
  
  public void removeViewInLayout(View paramView)
  {
    a(paramView);
    super.removeViewInLayout(paramView);
  }
  
  public void removeViews(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
      a(getChildAt(i));
    }
    super.removeViews(paramInt1, paramInt2);
  }
  
  public void removeViewsInLayout(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
      a(getChildAt(i));
    }
    super.removeViewsInLayout(paramInt1, paramInt2);
  }
  
  public void setDrawDisappearingViewsLast(boolean paramBoolean)
  {
    q = paramBoolean;
  }
  
  public void setLayoutTransition(LayoutTransition paramLayoutTransition)
  {
    throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
  }
  
  public void startViewTransition(View paramView)
  {
    if (paramView.getParent() == this)
    {
      if (p == null) {
        p = new ArrayList();
      }
      p.add(paramView);
    }
    super.startViewTransition(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
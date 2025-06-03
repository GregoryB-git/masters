package x0;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import e0.d0;
import e0.d0.c;
import e0.s0;
import e0.s0.k;
import g;
import java.util.ArrayList;
import java.util.Iterator;

public final class q
  extends FrameLayout
{
  public final ArrayList a = new ArrayList();
  public final ArrayList b = new ArrayList();
  public View.OnApplyWindowInsetsListener c;
  public boolean d = true;
  
  public q(Context paramContext, AttributeSet paramAttributeSet, y paramy)
  {
    super(paramContext, paramAttributeSet);
    String str = paramAttributeSet.getClassAttribute();
    Object localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, eb.y.e, 0, 0);
    Object localObject2 = str;
    if (str == null) {
      localObject2 = ((TypedArray)localObject1).getString(0);
    }
    str = ((TypedArray)localObject1).getString(1);
    ((TypedArray)localObject1).recycle();
    int i = getId();
    localObject1 = paramy.D(i);
    if ((localObject2 != null) && (localObject1 == null))
    {
      if (i == -1)
      {
        if (str != null) {
          paramContext = g.d(" with tag ", str);
        } else {
          paramContext = "";
        }
        throw new IllegalStateException(g.e("FragmentContainerView must have an android:id to add Fragment ", (String)localObject2, paramContext));
      }
      localObject1 = paramy.I();
      paramContext.getClassLoader();
      localObject2 = i.instantiate(b.w.b, (String)localObject2, null);
      ec.i.d(localObject2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
      mFragmentId = i;
      mContainerId = i;
      mTag = str;
      mFragmentManager = paramy;
      mHost = w;
      ((i)localObject2).onInflate(paramContext, paramAttributeSet, null);
      paramContext = new a(paramy);
      o = true;
      mContainer = this;
      paramContext.e(getId(), (i)localObject2, str);
      if (!g)
      {
        paramAttributeSet = p;
        if ((w != null) && (!J))
        {
          paramAttributeSet.z(true);
          paramContext.a(L, M);
          b = true;
        }
      }
      else
      {
        try
        {
          paramAttributeSet.U(L, M);
          paramAttributeSet.e();
          paramAttributeSet.f0();
          if (K)
          {
            K = false;
            paramAttributeSet.d0();
          }
          c.b();
        }
        finally
        {
          paramAttributeSet.e();
        }
      }
    }
    paramAttributeSet = c.e().iterator();
    while (paramAttributeSet.hasNext())
    {
      paramy = (e0)paramAttributeSet.next();
      localObject2 = c;
      if (mContainerId == getId())
      {
        paramContext = mView;
        if ((paramContext != null) && (paramContext.getParent() == null))
        {
          mContainer = this;
          paramy.b();
        }
      }
    }
  }
  
  public final void a(View paramView)
  {
    if (b.contains(paramView)) {
      a.add(paramView);
    }
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    ec.i.e(paramView, "child");
    Object localObject = paramView.getTag(2131361955);
    if ((localObject instanceof i)) {
      localObject = (i)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    paramLayoutParams = new StringBuilder();
    paramLayoutParams.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    paramLayoutParams.append(paramView);
    paramLayoutParams.append(" is not associated with a Fragment.");
    throw new IllegalStateException(paramLayoutParams.toString().toString());
  }
  
  public final WindowInsets dispatchApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    ec.i.e(paramWindowInsets, "insets");
    Object localObject1 = s0.c(paramWindowInsets, null);
    Object localObject2 = c;
    WindowInsets localWindowInsets;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject2 = ((View.OnApplyWindowInsetsListener)localObject2).onApplyWindowInsets(this, paramWindowInsets);
      ec.i.d(localObject2, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
      localObject2 = s0.c((WindowInsets)localObject2, null);
    }
    else
    {
      localObject2 = d0.a;
      localWindowInsets = ((s0)localObject1).b();
      localObject2 = localObject1;
      if (localWindowInsets != null)
      {
        localObject3 = d0.c.b(this, localWindowInsets);
        localObject2 = localObject1;
        if (!((WindowInsets)localObject3).equals(localWindowInsets)) {
          localObject2 = s0.c((WindowInsets)localObject3, this);
        }
      }
    }
    if (!a.i())
    {
      int i = 0;
      int j = getChildCount();
      while (i < j)
      {
        localObject1 = getChildAt(i);
        localObject3 = d0.a;
        localObject3 = ((s0)localObject2).b();
        if (localObject3 != null)
        {
          localWindowInsets = d0.c.a((View)localObject1, (WindowInsets)localObject3);
          if (!localWindowInsets.equals(localObject3)) {
            s0.c(localWindowInsets, (View)localObject1);
          }
        }
        i++;
      }
    }
    return paramWindowInsets;
  }
  
  public final void dispatchDraw(Canvas paramCanvas)
  {
    ec.i.e(paramCanvas, "canvas");
    if (d)
    {
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext()) {
        super.drawChild(paramCanvas, (View)localIterator.next(), getDrawingTime());
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public final boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    ec.i.e(paramCanvas, "canvas");
    ec.i.e(paramView, "child");
    if ((d) && ((a.isEmpty() ^ true)) && (a.contains(paramView))) {
      return false;
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final void endViewTransition(View paramView)
  {
    ec.i.e(paramView, "view");
    b.remove(paramView);
    if (a.remove(paramView)) {
      d = true;
    }
    super.endViewTransition(paramView);
  }
  
  public final <F extends i> F getFragment()
  {
    Object localObject1 = null;
    Object localObject2 = this;
    while (localObject2 != null)
    {
      localObject3 = ((View)localObject2).getTag(2131361955);
      if ((localObject3 instanceof i)) {
        localObject3 = (i)localObject3;
      } else {
        localObject3 = null;
      }
      if (localObject3 != null) {
        break label67;
      }
      localObject2 = ((View)localObject2).getParent();
      if ((localObject2 instanceof View)) {
        localObject2 = (View)localObject2;
      } else {
        localObject2 = null;
      }
    }
    Object localObject3 = null;
    label67:
    if (localObject3 != null)
    {
      if (((i)localObject3).isAdded())
      {
        localObject2 = ((i)localObject3).getChildFragmentManager();
      }
      else
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("The Fragment ");
        ((StringBuilder)localObject2).append(localObject3);
        ((StringBuilder)localObject2).append(" that owns View ");
        ((StringBuilder)localObject2).append(this);
        ((StringBuilder)localObject2).append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
        throw new IllegalStateException(((StringBuilder)localObject2).toString());
      }
    }
    else
    {
      for (localObject2 = getContext();; localObject2 = ((ContextWrapper)localObject2).getBaseContext())
      {
        localObject3 = localObject1;
        if (!(localObject2 instanceof ContextWrapper)) {
          break;
        }
        if ((localObject2 instanceof m))
        {
          localObject3 = (m)localObject2;
          break;
        }
      }
      if (localObject3 == null) {
        break label200;
      }
      localObject2 = ((m)localObject3).getSupportFragmentManager();
    }
    return ((y)localObject2).D(getId());
    label200:
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("View ");
    ((StringBuilder)localObject2).append(this);
    ((StringBuilder)localObject2).append(" is not within a subclass of FragmentActivity.");
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    ec.i.e(paramWindowInsets, "insets");
    return paramWindowInsets;
  }
  
  public final void removeAllViewsInLayout()
  {
    for (int i = getChildCount() - 1; -1 < i; i--)
    {
      View localView = getChildAt(i);
      ec.i.d(localView, "view");
      a(localView);
    }
    super.removeAllViewsInLayout();
  }
  
  public final void removeView(View paramView)
  {
    ec.i.e(paramView, "view");
    a(paramView);
    super.removeView(paramView);
  }
  
  public final void removeViewAt(int paramInt)
  {
    View localView = getChildAt(paramInt);
    ec.i.d(localView, "view");
    a(localView);
    super.removeViewAt(paramInt);
  }
  
  public final void removeViewInLayout(View paramView)
  {
    ec.i.e(paramView, "view");
    a(paramView);
    super.removeViewInLayout(paramView);
  }
  
  public final void removeViews(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
    {
      View localView = getChildAt(i);
      ec.i.d(localView, "view");
      a(localView);
    }
    super.removeViews(paramInt1, paramInt2);
  }
  
  public final void removeViewsInLayout(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
    {
      View localView = getChildAt(i);
      ec.i.d(localView, "view");
      a(localView);
    }
    super.removeViewsInLayout(paramInt1, paramInt2);
  }
  
  public final void setDrawDisappearingViewsLast(boolean paramBoolean)
  {
    d = paramBoolean;
  }
  
  public void setLayoutTransition(LayoutTransition paramLayoutTransition)
  {
    throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
  }
  
  public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    ec.i.e(paramOnApplyWindowInsetsListener, "listener");
    c = paramOnApplyWindowInsetsListener;
  }
  
  public final void startViewTransition(View paramView)
  {
    ec.i.e(paramView, "view");
    if (paramView.getParent() == this) {
      b.add(paramView);
    }
    super.startViewTransition(paramView);
  }
}

/* Location:
 * Qualified Name:     x0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
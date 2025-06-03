package androidx.appcompat.widget;

import I.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import e.e;
import e.i;
import l.b;

public class ActionBarContainer
  extends FrameLayout
{
  public boolean o;
  public View p;
  public View q;
  public View r;
  public Drawable s;
  public Drawable t;
  public Drawable u;
  public boolean v;
  public boolean w;
  public int x;
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    s.E(this, new b(this));
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.a);
    s = paramContext.getDrawable(i.b);
    t = paramContext.getDrawable(i.d);
    x = paramContext.getDimensionPixelSize(i.i, -1);
    int i = getId();
    int j = e.x;
    boolean bool = true;
    if (i == j)
    {
      v = true;
      u = paramContext.getDrawable(i.c);
    }
    paramContext.recycle();
    if (v)
    {
      if (u == null) {}
    }
    else {
      while ((s != null) || (t != null))
      {
        bool = false;
        break;
      }
    }
    setWillNotDraw(bool);
  }
  
  public final int a(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + topMargin + bottomMargin;
  }
  
  public final boolean b(View paramView)
  {
    boolean bool;
    if ((paramView != null) && (paramView.getVisibility() != 8) && (paramView.getMeasuredHeight() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = s;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      s.setState(getDrawableState());
    }
    localDrawable = t;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      t.setState(getDrawableState());
    }
    localDrawable = u;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      u.setState(getDrawableState());
    }
  }
  
  public View getTabContainer()
  {
    return p;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = s;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = t;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = u;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    q = findViewById(e.a);
    r = findViewById(e.f);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if ((!o) && (!super.onInterceptTouchEvent(paramMotionEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = p;
    paramInt4 = 1;
    if ((localView != null) && (localView.getVisibility() != 8)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    Object localObject;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      paramInt2 = getMeasuredHeight();
      localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i = localView.getMeasuredHeight();
      int j = bottomMargin;
      localView.layout(paramInt1, paramInt2 - i - j, paramInt3, paramInt2 - j);
    }
    if (v)
    {
      localObject = u;
      if (localObject == null) {
        return;
      }
      ((Drawable)localObject).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
    else
    {
      if (s != null)
      {
        Drawable localDrawable;
        if (q.getVisibility() == 0)
        {
          localDrawable = s;
          paramInt1 = q.getLeft();
          paramInt3 = q.getTop();
          paramInt2 = q.getRight();
        }
        for (localObject = q;; localObject = r)
        {
          localDrawable.setBounds(paramInt1, paramInt3, paramInt2, ((View)localObject).getBottom());
          paramInt1 = paramInt4;
          break label293;
          localObject = r;
          if ((localObject == null) || (((View)localObject).getVisibility() != 0)) {
            break;
          }
          localDrawable = s;
          paramInt1 = r.getLeft();
          paramInt3 = r.getTop();
          paramInt2 = r.getRight();
        }
        s.setBounds(0, 0, 0, 0);
        paramInt1 = paramInt4;
      }
      else
      {
        paramInt1 = 0;
      }
      label293:
      w = paramBoolean;
      if (paramBoolean)
      {
        localObject = t;
        if (localObject != null)
        {
          ((Drawable)localObject).setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          break label345;
        }
      }
      if (paramInt1 == 0) {
        return;
      }
    }
    label345:
    invalidate();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (q == null)
    {
      i = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
      {
        int j = x;
        i = paramInt2;
        if (j >= 0) {
          i = View.MeasureSpec.makeMeasureSpec(Math.min(j, View.MeasureSpec.getSize(paramInt2)), Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(paramInt1, i);
    if (q == null) {
      return;
    }
    paramInt2 = View.MeasureSpec.getMode(i);
    View localView = p;
    if ((localView != null) && (localView.getVisibility() != 8) && (paramInt2 != 1073741824))
    {
      if (!b(q)) {}
      for (localView = q;; localView = r)
      {
        paramInt1 = a(localView);
        break label143;
        if (b(r)) {
          break;
        }
      }
      paramInt1 = 0;
      label143:
      if (paramInt2 == Integer.MIN_VALUE) {
        paramInt2 = View.MeasureSpec.getSize(i);
      } else {
        paramInt2 = Integer.MAX_VALUE;
      }
      setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + a(p), paramInt2));
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = s;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(s);
    }
    s = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      paramDrawable = q;
      if (paramDrawable != null) {
        s.setBounds(paramDrawable.getLeft(), q.getTop(), q.getRight(), q.getBottom());
      }
    }
    boolean bool1 = v;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = bool2;
      if (u != null) {}
    }
    else
    {
      do
      {
        bool1 = true;
        break;
        bool1 = bool2;
        if (s != null) {
          break;
        }
        bool1 = bool2;
      } while (t == null);
    }
    setWillNotDraw(bool1);
    invalidate();
    invalidateOutline();
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = u;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(u);
    }
    u = paramDrawable;
    boolean bool1 = false;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (v)
      {
        paramDrawable = u;
        if (paramDrawable != null) {
          paramDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
      }
    }
    boolean bool2;
    if (v)
    {
      bool2 = bool1;
      if (u != null) {}
    }
    else
    {
      do
      {
        bool2 = true;
        break;
        bool2 = bool1;
        if (s != null) {
          break;
        }
        bool2 = bool1;
      } while (t == null);
    }
    setWillNotDraw(bool2);
    invalidate();
    invalidateOutline();
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = t;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(t);
    }
    t = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (w)
      {
        paramDrawable = t;
        if (paramDrawable != null) {
          paramDrawable.setBounds(p.getLeft(), p.getTop(), p.getRight(), p.getBottom());
        }
      }
    }
    boolean bool1 = v;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = bool2;
      if (u != null) {}
    }
    else
    {
      do
      {
        bool1 = true;
        break;
        bool1 = bool2;
        if (s != null) {
          break;
        }
        bool1 = bool2;
      } while (t == null);
    }
    setWillNotDraw(bool1);
    invalidate();
    invalidateOutline();
  }
  
  public void setTabContainer(c paramc)
  {
    View localView = p;
    if (localView != null) {
      removeView(localView);
    }
    p = paramc;
  }
  
  public void setTransitioning(boolean paramBoolean)
  {
    o = paramBoolean;
    int i;
    if (paramBoolean) {
      i = 393216;
    } else {
      i = 262144;
    }
    setDescendantFocusability(i);
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Drawable localDrawable = s;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
    localDrawable = t;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
    localDrawable = u;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
  {
    if (paramInt != 0) {
      return super.startActionModeForChild(paramView, paramCallback, paramInt);
    }
    return null;
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if (((paramDrawable == s) && (!v)) || ((paramDrawable == t) && (w)) || ((paramDrawable == u) && (v)) || (super.verifyDrawable(paramDrawable))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
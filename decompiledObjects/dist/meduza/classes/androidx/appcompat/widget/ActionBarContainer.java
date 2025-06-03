package androidx.appcompat.widget;

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
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import b.a0;
import e0.d0;
import java.util.WeakHashMap;
import l.b;

public class ActionBarContainer
  extends FrameLayout
{
  public boolean a;
  public c b;
  public View c;
  public View d;
  public Drawable e;
  public Drawable f;
  public Drawable o;
  public boolean p;
  public boolean q;
  public int r;
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b localb = new b(this);
    WeakHashMap localWeakHashMap = d0.a;
    setBackground(localb);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a0.f);
    boolean bool1 = false;
    e = paramContext.getDrawable(0);
    f = paramContext.getDrawable(2);
    r = paramContext.getDimensionPixelSize(13, -1);
    if (getId() == 2131362022)
    {
      p = true;
      o = paramContext.getDrawable(1);
    }
    paramContext.recycle();
    boolean bool2;
    if (p)
    {
      bool2 = bool1;
      if (o != null) {}
    }
    else
    {
      do
      {
        bool2 = true;
        break;
        bool2 = bool1;
        if (e != null) {
          break;
        }
        bool2 = bool1;
      } while (f == null);
    }
    setWillNotDraw(bool2);
  }
  
  public static int a(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + topMargin + bottomMargin;
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = e;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      e.setState(getDrawableState());
    }
    localDrawable = f;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      f.setState(getDrawableState());
    }
    localDrawable = o;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      o.setState(getDrawableState());
    }
  }
  
  public View getTabContainer()
  {
    return b;
  }
  
  public final void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = e;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = f;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
    localDrawable = o;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public final void onFinishInflate()
  {
    super.onFinishInflate();
    c = findViewById(2131361832);
    d = findViewById(2131361841);
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool;
    if ((!a) && (!super.onInterceptTouchEvent(paramMotionEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    c localc = b;
    paramInt4 = 1;
    int i = 0;
    paramInt2 = 0;
    if ((localc != null) && (localc.getVisibility() != 8)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    Object localObject;
    if ((localc != null) && (localc.getVisibility() != 8))
    {
      int j = getMeasuredHeight();
      localObject = (FrameLayout.LayoutParams)localc.getLayoutParams();
      int k = localc.getMeasuredHeight();
      int m = bottomMargin;
      localc.layout(paramInt1, j - k - m, paramInt3, j - m);
    }
    if (p)
    {
      localObject = o;
      paramInt1 = paramInt2;
      if (localObject != null)
      {
        ((Drawable)localObject).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        paramInt1 = paramInt4;
        break label355;
      }
    }
    for (;;)
    {
      break;
      paramInt2 = i;
      if (e != null)
      {
        Drawable localDrawable;
        if (c.getVisibility() == 0)
        {
          localDrawable = e;
          paramInt1 = c.getLeft();
          paramInt3 = c.getTop();
          paramInt2 = c.getRight();
          localObject = c;
        }
        else
        {
          localObject = d;
          if ((localObject == null) || (((View)localObject).getVisibility() != 0)) {
            break label290;
          }
          localDrawable = e;
          paramInt1 = d.getLeft();
          paramInt3 = d.getTop();
          paramInt2 = d.getRight();
          localObject = d;
        }
        localDrawable.setBounds(paramInt1, paramInt3, paramInt2, ((View)localObject).getBottom());
        break label301;
        label290:
        e.setBounds(0, 0, 0, 0);
        label301:
        paramInt2 = 1;
      }
      q = paramBoolean;
      paramInt1 = paramInt2;
      if (paramBoolean)
      {
        localObject = f;
        paramInt1 = paramInt2;
        if (localObject != null)
        {
          ((Drawable)localObject).setBounds(localc.getLeft(), localc.getTop(), localc.getRight(), localc.getBottom());
          paramInt1 = paramInt4;
        }
      }
    }
    label355:
    if (paramInt1 != 0) {
      invalidate();
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    int j;
    if (c == null)
    {
      i = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
      {
        j = r;
        i = paramInt2;
        if (j >= 0) {
          i = View.MeasureSpec.makeMeasureSpec(Math.min(j, View.MeasureSpec.getSize(paramInt2)), Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(paramInt1, i);
    if (c == null) {
      return;
    }
    int k = View.MeasureSpec.getMode(i);
    Object localObject = b;
    if ((localObject != null) && (((View)localObject).getVisibility() != 8) && (k != 1073741824))
    {
      localObject = c;
      int m = 1;
      j = 0;
      if ((localObject != null) && (((View)localObject).getVisibility() != 8) && (((View)localObject).getMeasuredHeight() != 0)) {
        paramInt1 = 0;
      } else {
        paramInt1 = 1;
      }
      if (paramInt1 == 0)
      {
        localObject = c;
      }
      else
      {
        localObject = d;
        paramInt2 = m;
        if (localObject != null)
        {
          paramInt2 = m;
          if (((View)localObject).getVisibility() != 8) {
            if (((View)localObject).getMeasuredHeight() == 0) {
              paramInt2 = m;
            } else {
              paramInt2 = 0;
            }
          }
        }
        paramInt1 = j;
        if (paramInt2 != 0) {
          break label216;
        }
        localObject = d;
      }
      paramInt1 = a((View)localObject);
      label216:
      if (k == Integer.MIN_VALUE) {
        paramInt2 = View.MeasureSpec.getSize(i);
      } else {
        paramInt2 = Integer.MAX_VALUE;
      }
      setMeasuredDimension(getMeasuredWidth(), Math.min(a(b) + paramInt1, paramInt2));
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = e;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(e);
    }
    e = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      paramDrawable = c;
      if (paramDrawable != null) {
        e.setBounds(paramDrawable.getLeft(), c.getTop(), c.getRight(), c.getBottom());
      }
    }
    boolean bool1 = p;
    boolean bool2 = true;
    if (bool1 ? o == null : (e != null) || (f != null)) {
      bool2 = false;
    }
    setWillNotDraw(bool2);
    invalidate();
    invalidateOutline();
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(o);
    }
    o = paramDrawable;
    boolean bool1 = false;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (p)
      {
        paramDrawable = o;
        if (paramDrawable != null) {
          paramDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
      }
    }
    boolean bool2;
    if (p)
    {
      bool2 = bool1;
      if (o != null) {}
    }
    else
    {
      do
      {
        bool2 = true;
        break;
        bool2 = bool1;
        if (e != null) {
          break;
        }
        bool2 = bool1;
      } while (f == null);
    }
    setWillNotDraw(bool2);
    invalidate();
    invalidateOutline();
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = f;
    if (localDrawable != null)
    {
      localDrawable.setCallback(null);
      unscheduleDrawable(f);
    }
    f = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (q)
      {
        paramDrawable = f;
        if (paramDrawable != null) {
          paramDrawable.setBounds(b.getLeft(), b.getTop(), b.getRight(), b.getBottom());
        }
      }
    }
    boolean bool1 = p;
    boolean bool2 = true;
    if (bool1 ? o == null : (e != null) || (f != null)) {
      bool2 = false;
    }
    setWillNotDraw(bool2);
    invalidate();
    invalidateOutline();
  }
  
  public void setTabContainer(c paramc)
  {
    Object localObject = b;
    if (localObject != null) {
      removeView((View)localObject);
    }
    b = paramc;
    if (paramc != null)
    {
      addView(paramc);
      localObject = paramc.getLayoutParams();
      width = -1;
      height = -2;
      paramc.setAllowCollapse(false);
    }
  }
  
  public void setTransitioning(boolean paramBoolean)
  {
    a = paramBoolean;
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
    Drawable localDrawable = e;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
    localDrawable = f;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
    localDrawable = o;
    if (localDrawable != null) {
      localDrawable.setVisible(bool, false);
    }
  }
  
  public final ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public final ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
  {
    if (paramInt != 0) {
      return super.startActionModeForChild(paramView, paramCallback, paramInt);
    }
    return null;
  }
  
  public final boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if (((paramDrawable == e) && (!p)) || ((paramDrawable == f) && (q)) || ((paramDrawable == o) && (p)) || (super.verifyDrawable(paramDrawable))) {
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
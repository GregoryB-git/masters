package l;

import L.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import h.c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public abstract class C
  extends ListView
{
  public b A;
  public final Rect o = new Rect();
  public int p = 0;
  public int q = 0;
  public int r = 0;
  public int s = 0;
  public int t;
  public Field u;
  public a v;
  public boolean w;
  public boolean x;
  public boolean y;
  public e z;
  
  public C(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, e.a.n);
    x = paramBoolean;
    setCacheColorHint(0);
    try
    {
      paramContext = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      u = paramContext;
      paramContext.setAccessible(true);
    }
    catch (NoSuchFieldException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public final void a()
  {
    y = false;
    setPressed(false);
    drawableStateChanged();
    View localView = getChildAt(t - getFirstVisiblePosition());
    if (localView != null) {
      localView.setPressed(false);
    }
  }
  
  public final void b(View paramView, int paramInt)
  {
    performItemClick(paramView, paramInt, getItemIdAtPosition(paramInt));
  }
  
  public final void c(Canvas paramCanvas)
  {
    if (!o.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(o);
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  public int d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt2 = getListPaddingTop();
    paramInt3 = getListPaddingBottom();
    int i = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    paramInt3 = paramInt2 + paramInt3;
    if (localListAdapter == null) {
      return paramInt3;
    }
    if ((i <= 0) || (localObject == null)) {
      i = 0;
    }
    int j = localListAdapter.getCount();
    int k = 0;
    int m = k;
    paramInt2 = m;
    localObject = null;
    int n = m;
    m = k;
    while (m < j)
    {
      int i1 = localListAdapter.getItemViewType(m);
      k = n;
      if (i1 != n)
      {
        localObject = null;
        k = i1;
      }
      View localView = localListAdapter.getView(m, (View)localObject, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localObject = localLayoutParams;
      if (localLayoutParams == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      n = height;
      if (n > 0) {
        n = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
      } else {
        n = View.MeasureSpec.makeMeasureSpec(0, 0);
      }
      localView.measure(paramInt1, n);
      localView.forceLayout();
      n = paramInt3;
      if (m > 0) {
        n = paramInt3 + i;
      }
      paramInt3 = n + localView.getMeasuredHeight();
      if (paramInt3 >= paramInt4)
      {
        paramInt1 = paramInt4;
        if (paramInt5 >= 0)
        {
          paramInt1 = paramInt4;
          if (m > paramInt5)
          {
            paramInt1 = paramInt4;
            if (paramInt2 > 0)
            {
              paramInt1 = paramInt4;
              if (paramInt3 != paramInt4) {
                paramInt1 = paramInt2;
              }
            }
          }
        }
        return paramInt1;
      }
      i1 = paramInt2;
      if (paramInt5 >= 0)
      {
        i1 = paramInt2;
        if (m >= paramInt5) {
          i1 = paramInt3;
        }
      }
      m++;
      n = k;
      localObject = localView;
      paramInt2 = i1;
    }
    return paramInt3;
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    c(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  public void drawableStateChanged()
  {
    if (A != null) {
      return;
    }
    super.drawableStateChanged();
    j(true);
    l();
  }
  
  public boolean e(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i != 1) {
      if (i != 2) {
        if (i == 3) {}
      }
    }
    boolean bool1;
    boolean bool2;
    for (;;)
    {
      bool1 = true;
      bool2 = false;
      break;
      label48:
      do
      {
        bool2 = false;
        bool1 = bool2;
        break;
        bool1 = true;
        break label48;
        bool1 = false;
        j = paramMotionEvent.findPointerIndex(paramInt);
      } while (j < 0);
      paramInt = (int)paramMotionEvent.getX(j);
      int k = (int)paramMotionEvent.getY(j);
      int j = pointToPosition(paramInt, k);
      if (j == -1)
      {
        bool2 = true;
        break;
      }
      View localView = getChildAt(j - getFirstVisiblePosition());
      i(localView, j, paramInt, k);
      if (i == 1) {
        b(localView, j);
      }
    }
    if ((!bool1) || (bool2)) {
      a();
    }
    if (bool1)
    {
      if (z == null) {
        z = new e(this);
      }
      z.m(true);
      z.onTouch(this, paramMotionEvent);
    }
    else
    {
      paramMotionEvent = z;
      if (paramMotionEvent != null) {
        paramMotionEvent.m(false);
      }
    }
    return bool1;
  }
  
  public final void f(int paramInt, View paramView)
  {
    Rect localRect = o;
    localRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    left -= p;
    top -= q;
    right += r;
    bottom += s;
    try
    {
      boolean bool = u.getBoolean(this);
      if (paramView.isEnabled() != bool)
      {
        u.set(this, Boolean.valueOf(bool ^ true));
        if (paramInt != -1) {
          refreshDrawableState();
        }
      }
    }
    catch (IllegalAccessException paramView)
    {
      paramView.printStackTrace();
    }
  }
  
  public final void g(int paramInt, View paramView)
  {
    Drawable localDrawable = getSelector();
    boolean bool = true;
    int i;
    if ((localDrawable != null) && (paramInt != -1)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localDrawable.setVisible(false, false);
    }
    f(paramInt, paramView);
    if (i != 0)
    {
      paramView = o;
      float f1 = paramView.exactCenterX();
      float f2 = paramView.exactCenterY();
      if (getVisibility() != 0) {
        bool = false;
      }
      localDrawable.setVisible(bool, false);
      B.a.j(localDrawable, f1, f2);
    }
  }
  
  public final void h(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    g(paramInt, paramView);
    paramView = getSelector();
    if ((paramView != null) && (paramInt != -1)) {
      B.a.j(paramView, paramFloat1, paramFloat2);
    }
  }
  
  public boolean hasFocus()
  {
    boolean bool;
    if ((!x) && (!super.hasFocus())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean hasWindowFocus()
  {
    boolean bool;
    if ((!x) && (!super.hasWindowFocus())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void i(View paramView, int paramInt, float paramFloat1, float paramFloat2)
  {
    y = true;
    drawableHotspotChanged(paramFloat1, paramFloat2);
    if (!isPressed()) {
      setPressed(true);
    }
    layoutChildren();
    int i = t;
    if (i != -1)
    {
      View localView = getChildAt(i - getFirstVisiblePosition());
      if ((localView != null) && (localView != paramView) && (localView.isPressed())) {
        localView.setPressed(false);
      }
    }
    t = paramInt;
    paramView.drawableHotspotChanged(paramFloat1 - paramView.getLeft(), paramFloat2 - paramView.getTop());
    if (!paramView.isPressed()) {
      paramView.setPressed(true);
    }
    h(paramInt, paramView, paramFloat1, paramFloat2);
    j(false);
    refreshDrawableState();
  }
  
  public boolean isFocused()
  {
    boolean bool;
    if ((!x) && (!super.isFocused())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isInTouchMode()
  {
    boolean bool;
    if (((x) && (w)) || (super.isInTouchMode())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void j(boolean paramBoolean)
  {
    a locala = v;
    if (locala != null) {
      locala.c(paramBoolean);
    }
  }
  
  public final boolean k()
  {
    return y;
  }
  
  public final void l()
  {
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (k()) && (isPressed())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  public void onDetachedFromWindow()
  {
    A = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return super.onHoverEvent(paramMotionEvent);
    }
    int i = paramMotionEvent.getActionMasked();
    if ((i == 10) && (A == null))
    {
      b localb = new b();
      A = localb;
      localb.b();
    }
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if ((i != 9) && (i != 7))
    {
      setSelection(-1);
    }
    else
    {
      i = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if ((i != -1) && (i != getSelectedItemPosition()))
      {
        paramMotionEvent = getChildAt(i - getFirstVisiblePosition());
        if (paramMotionEvent.isEnabled()) {
          setSelectionFromTop(i, paramMotionEvent.getTop() - getTop());
        }
        l();
      }
    }
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      t = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
    b localb = A;
    if (localb != null) {
      localb.a();
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setListSelectionHidden(boolean paramBoolean)
  {
    w = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      localObject = new a(paramDrawable);
    } else {
      localObject = null;
    }
    v = ((a)localObject);
    super.setSelector((Drawable)localObject);
    Object localObject = new Rect();
    if (paramDrawable != null) {
      paramDrawable.getPadding((Rect)localObject);
    }
    p = left;
    q = top;
    r = right;
    s = bottom;
  }
  
  public static class a
    extends c
  {
    public boolean p = true;
    
    public a(Drawable paramDrawable)
    {
      super();
    }
    
    public void c(boolean paramBoolean)
    {
      p = paramBoolean;
    }
    
    public void draw(Canvas paramCanvas)
    {
      if (p) {
        super.draw(paramCanvas);
      }
    }
    
    public void setHotspot(float paramFloat1, float paramFloat2)
    {
      if (p) {
        super.setHotspot(paramFloat1, paramFloat2);
      }
    }
    
    public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (p) {
        super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public boolean setState(int[] paramArrayOfInt)
    {
      if (p) {
        return super.setState(paramArrayOfInt);
      }
      return false;
    }
    
    public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (p) {
        return super.setVisible(paramBoolean1, paramBoolean2);
      }
      return false;
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void a()
    {
      C localC = C.this;
      A = null;
      localC.removeCallbacks(this);
    }
    
    public void b()
    {
      post(this);
    }
    
    public void run()
    {
      C localC = C.this;
      A = null;
      localC.drawableStateChanged();
    }
  }
}

/* Location:
 * Qualified Name:     l.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
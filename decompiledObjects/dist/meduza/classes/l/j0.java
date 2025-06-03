package l;

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
import j0.f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y.a.a;

public class j0
  extends ListView
{
  public final Rect a = new Rect();
  public int b = 0;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public int f;
  public d o;
  public boolean p;
  public boolean q;
  public boolean r;
  public f s;
  public f t;
  
  public j0(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, 2130968713);
    q = paramBoolean;
    setCacheColorHint(0);
  }
  
  private void setSelectorEnabled(boolean paramBoolean)
  {
    d locald = o;
    if (locald != null) {
      b = paramBoolean;
    }
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    int k = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    j = i + j;
    if (localListAdapter == null) {
      return j;
    }
    if ((k <= 0) || (localObject == null)) {
      k = 0;
    }
    int m = localListAdapter.getCount();
    i = 0;
    int n = i;
    View localView;
    for (localObject = null; i < m; localObject = localView)
    {
      int i1 = localListAdapter.getItemViewType(i);
      int i2 = n;
      if (i1 != n)
      {
        localObject = null;
        i2 = i1;
      }
      localView = localListAdapter.getView(i, (View)localObject, this);
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
      n = j;
      if (i > 0) {
        n = j + k;
      }
      j = n + localView.getMeasuredHeight();
      if (j >= paramInt2) {
        return paramInt2;
      }
      i++;
      n = i2;
    }
    return j;
  }
  
  public final boolean b(int paramInt, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = 0;
    boolean bool1;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          break label53;
        }
        bool1 = true;
        paramInt = j;
        break label607;
      }
      bool1 = true;
    }
    else
    {
      bool1 = false;
    }
    int k = paramMotionEvent.findPointerIndex(paramInt);
    label53:
    Object localObject1;
    if (k < 0)
    {
      bool1 = false;
      paramInt = j;
    }
    else
    {
      paramInt = (int)paramMotionEvent.getX(k);
      k = (int)paramMotionEvent.getY(k);
      j = pointToPosition(paramInt, k);
      if (j == -1)
      {
        paramInt = 1;
      }
      else
      {
        localObject1 = getChildAt(j - getFirstVisiblePosition());
        float f1 = paramInt;
        float f2 = k;
        r = true;
        a.a(this, f1, f2);
        if (!isPressed()) {
          setPressed(true);
        }
        layoutChildren();
        paramInt = f;
        if (paramInt != -1)
        {
          localObject2 = getChildAt(paramInt - getFirstVisiblePosition());
          if ((localObject2 != null) && (localObject2 != localObject1) && (((View)localObject2).isPressed())) {
            ((View)localObject2).setPressed(false);
          }
        }
        f = j;
        a.a((View)localObject1, f1 - ((View)localObject1).getLeft(), f2 - ((View)localObject1).getTop());
        if (!((View)localObject1).isPressed()) {
          ((View)localObject1).setPressed(true);
        }
        Object localObject2 = getSelector();
        if ((localObject2 != null) && (j != -1)) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        if (paramInt != 0) {
          ((Drawable)localObject2).setVisible(false, false);
        }
        Object localObject3 = a;
        ((Rect)localObject3).set(((View)localObject1).getLeft(), ((View)localObject1).getTop(), ((View)localObject1).getRight(), ((View)localObject1).getBottom());
        left -= b;
        top -= c;
        right += d;
        bottom += e;
        if (a0.a.a())
        {
          bool1 = c.a(this);
        }
        else
        {
          localObject3 = e.a;
          if (localObject3 != null) {
            try
            {
              bool1 = ((Field)localObject3).getBoolean(this);
            }
            catch (IllegalAccessException localIllegalAccessException1)
            {
              localIllegalAccessException1.printStackTrace();
            }
          } else {
            bool1 = false;
          }
        }
        if (((View)localObject1).isEnabled() != bool1)
        {
          bool1 ^= true;
          if (a0.a.a())
          {
            c.b(this, bool1);
          }
          else
          {
            Field localField = e.a;
            if (localField != null) {
              try
              {
                localField.set(this, Boolean.valueOf(bool1));
              }
              catch (IllegalAccessException localIllegalAccessException2)
              {
                localIllegalAccessException2.printStackTrace();
              }
            }
          }
          if (j != -1) {
            refreshDrawableState();
          }
        }
        if (paramInt != 0)
        {
          Rect localRect = a;
          float f3 = localRect.exactCenterX();
          float f4 = localRect.exactCenterY();
          if (getVisibility() == 0) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          ((Drawable)localObject2).setVisible(bool1, false);
          a.a.e((Drawable)localObject2, f3, f4);
        }
        localObject2 = getSelector();
        if ((localObject2 != null) && (j != -1)) {
          a.a.e((Drawable)localObject2, f1, f2);
        }
        setSelectorEnabled(false);
        refreshDrawableState();
        if (i == 1) {
          performItemClick((View)localObject1, j, getItemIdAtPosition(j));
        }
        bool1 = true;
        paramInt = 0;
      }
    }
    label607:
    if ((!bool1) || (paramInt != 0))
    {
      r = false;
      setPressed(false);
      drawableStateChanged();
      localObject1 = getChildAt(f - getFirstVisiblePosition());
      if (localObject1 != null) {
        ((View)localObject1).setPressed(false);
      }
    }
    if (bool1)
    {
      if (s == null) {
        s = new f(this);
      }
      localObject1 = s;
      boolean bool2 = x;
      x = true;
      ((j0.a)localObject1).onTouch(this, paramMotionEvent);
    }
    else
    {
      paramMotionEvent = s;
      if (paramMotionEvent != null)
      {
        if (x) {
          paramMotionEvent.d();
        }
        x = false;
      }
    }
    return bool1;
  }
  
  public final void dispatchDraw(Canvas paramCanvas)
  {
    if (!a.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(a);
        localDrawable.draw(paramCanvas);
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public final void drawableStateChanged()
  {
    if (t != null) {
      return;
    }
    super.drawableStateChanged();
    setSelectorEnabled(true);
    Drawable localDrawable = getSelector();
    if ((localDrawable != null) && (r) && (isPressed())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  public final boolean hasFocus()
  {
    boolean bool;
    if ((!q) && (!super.hasFocus())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean hasWindowFocus()
  {
    boolean bool;
    if ((!q) && (!super.hasWindowFocus())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean isFocused()
  {
    boolean bool;
    if ((!q) && (!super.isFocused())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean isInTouchMode()
  {
    boolean bool;
    if (((q) && (p)) || (super.isInTouchMode())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void onDetachedFromWindow()
  {
    t = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = Build.VERSION.SDK_INT;
    if (i < 26) {
      return super.onHoverEvent(paramMotionEvent);
    }
    int j = paramMotionEvent.getActionMasked();
    if ((j == 10) && (t == null))
    {
      f localf = new f();
      t = localf;
      post(localf);
    }
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if ((j != 9) && (j != 7))
    {
      setSelection(-1);
    }
    else
    {
      j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if ((j != -1) && (j != getSelectedItemPosition()))
      {
        paramMotionEvent = getChildAt(j - getFirstVisiblePosition());
        if (paramMotionEvent.isEnabled())
        {
          requestFocus();
          if ((i >= 30) && (b.d))
          {
            try
            {
              b.a.invoke(this, new Object[] { Integer.valueOf(j), paramMotionEvent, Boolean.FALSE, Integer.valueOf(-1), Integer.valueOf(-1) });
              b.b.invoke(this, new Object[] { Integer.valueOf(j) });
              b.c.invoke(this, new Object[] { Integer.valueOf(j) });
            }
            catch (InvocationTargetException paramMotionEvent) {}catch (IllegalAccessException paramMotionEvent) {}
            paramMotionEvent.printStackTrace();
          }
          else
          {
            setSelectionFromTop(j, paramMotionEvent.getTop() - getTop());
          }
        }
        paramMotionEvent = getSelector();
        if ((paramMotionEvent != null) && (r) && (isPressed())) {
          paramMotionEvent.setState(getDrawableState());
        }
      }
    }
    return bool;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      f = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
    f localf = t;
    if (localf != null)
    {
      j0 localj0 = a;
      t = null;
      localj0.removeCallbacks(localf);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setListSelectionHidden(boolean paramBoolean)
  {
    p = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      localObject = new d(paramDrawable);
    } else {
      localObject = null;
    }
    o = ((d)localObject);
    super.setSelector((Drawable)localObject);
    Object localObject = new Rect();
    if (paramDrawable != null) {
      paramDrawable.getPadding((Rect)localObject);
    }
    b = left;
    c = top;
    d = right;
    e = bottom;
  }
  
  public static final class a
  {
    public static void a(View paramView, float paramFloat1, float paramFloat2)
    {
      paramView.drawableHotspotChanged(paramFloat1, paramFloat2);
    }
  }
  
  public static final class b
  {
    public static Method a;
    public static Method b;
    public static Method c;
    public static boolean d;
    
    static
    {
      try
      {
        Object localObject1 = Integer.TYPE;
        Object localObject2 = Boolean.TYPE;
        Class localClass = Float.TYPE;
        localObject2 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[] { localObject1, View.class, localObject2, localClass, localClass });
        a = (Method)localObject2;
        ((AccessibleObject)localObject2).setAccessible(true);
        localObject2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[] { localObject1 });
        b = (Method)localObject2;
        ((AccessibleObject)localObject2).setAccessible(true);
        localObject1 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[] { localObject1 });
        c = (Method)localObject1;
        ((AccessibleObject)localObject1).setAccessible(true);
        d = true;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localNoSuchMethodException.printStackTrace();
      }
    }
  }
  
  public static final class c
  {
    public static boolean a(AbsListView paramAbsListView)
    {
      return paramAbsListView.isSelectedChildViewEnabled();
    }
    
    public static void b(AbsListView paramAbsListView, boolean paramBoolean)
    {
      paramAbsListView.setSelectedChildViewEnabled(paramBoolean);
    }
  }
  
  public static final class d
    extends c
  {
    public boolean b = true;
    
    public d(Drawable paramDrawable)
    {
      super();
    }
    
    public final void draw(Canvas paramCanvas)
    {
      if (b) {
        super.draw(paramCanvas);
      }
    }
    
    public final void setHotspot(float paramFloat1, float paramFloat2)
    {
      if (b) {
        super.setHotspot(paramFloat1, paramFloat2);
      }
    }
    
    public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (b) {
        super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public final boolean setState(int[] paramArrayOfInt)
    {
      if (b) {
        return super.setState(paramArrayOfInt);
      }
      return false;
    }
    
    public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (b) {
        return super.setVisible(paramBoolean1, paramBoolean2);
      }
      return false;
    }
  }
  
  public static final class e
  {
    public static final Field a;
    
    static
    {
      Object localObject = null;
      try
      {
        Field localField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
        localObject = localField;
        localField.setAccessible(true);
        localObject = localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localNoSuchFieldException.printStackTrace();
      }
      a = (Field)localObject;
    }
  }
  
  public final class f
    implements Runnable
  {
    public f() {}
    
    public final void run()
    {
      j0 localj0 = j0.this;
      t = null;
      localj0.drawableStateChanged();
    }
  }
}

/* Location:
 * Qualified Name:     l.j0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
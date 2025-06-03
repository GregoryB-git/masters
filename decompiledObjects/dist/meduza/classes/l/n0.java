package l;

import a0.e;
import aa.u;
import aa.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import b.a0;
import e0.d0;
import j0.g;
import java.lang.reflect.Method;
import k.f;

public class n0
  implements f
{
  public static Method H;
  public static Method I;
  public static Method J;
  public final e A = new e();
  public final c B = new c();
  public final Handler C;
  public final Rect D = new Rect();
  public Rect E;
  public boolean F;
  public r G;
  public Context a;
  public ListAdapter b;
  public j0 c;
  public int d = -2;
  public int e = -2;
  public int f;
  public int o;
  public int p = 1002;
  public boolean q;
  public boolean r;
  public boolean s;
  public int t = 0;
  public int u = Integer.MAX_VALUE;
  public d v;
  public View w;
  public AdapterView.OnItemClickListener x;
  public final g y = new g();
  public final f z = new f();
  
  static
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      try
      {
        H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      }
      try
      {
        J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      }
    }
    if (Build.VERSION.SDK_INT <= 23) {
      try
      {
        I = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, Integer.TYPE, Boolean.TYPE });
      }
      catch (NoSuchMethodException localNoSuchMethodException3)
      {
        Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
      }
    }
  }
  
  public n0(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    a = paramContext;
    C = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a0.B, paramInt1, paramInt2);
    f = localTypedArray.getDimensionPixelOffset(0, 0);
    int i = localTypedArray.getDimensionPixelOffset(1, 0);
    o = i;
    if (i != 0) {
      q = true;
    }
    localTypedArray.recycle();
    paramContext = new r(paramContext, paramAttributeSet, paramInt1, paramInt2);
    G = paramContext;
    paramContext.setInputMethodMode(1);
  }
  
  public final boolean a()
  {
    return G.isShowing();
  }
  
  public final int b()
  {
    return f;
  }
  
  public final void d(int paramInt)
  {
    f = paramInt;
  }
  
  public final void dismiss()
  {
    G.dismiss();
    G.setContentView(null);
    c = null;
    C.removeCallbacks(y);
  }
  
  public final Drawable g()
  {
    return G.getBackground();
  }
  
  public final j0 h()
  {
    return c;
  }
  
  public final void j(Drawable paramDrawable)
  {
    G.setBackgroundDrawable(paramDrawable);
  }
  
  public final void k(int paramInt)
  {
    o = paramInt;
    q = true;
  }
  
  public final int n()
  {
    if (!q) {
      return 0;
    }
    return o;
  }
  
  public void o(ListAdapter paramListAdapter)
  {
    d locald = v;
    if (locald == null)
    {
      v = new d();
    }
    else
    {
      ListAdapter localListAdapter = b;
      if (localListAdapter != null) {
        localListAdapter.unregisterDataSetObserver(locald);
      }
    }
    b = paramListAdapter;
    if (paramListAdapter != null) {
      paramListAdapter.registerDataSetObserver(v);
    }
    paramListAdapter = c;
    if (paramListAdapter != null) {
      paramListAdapter.setAdapter(b);
    }
  }
  
  public j0 p(Context paramContext, boolean paramBoolean)
  {
    return new j0(paramContext, paramBoolean);
  }
  
  public final void q(int paramInt)
  {
    Object localObject = G.getBackground();
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(D);
      localObject = D;
      e = (left + right + paramInt);
    }
    else
    {
      e = paramInt;
    }
  }
  
  public final void show()
  {
    if (c == null)
    {
      localObject = p(a, F ^ true);
      c = ((j0)localObject);
      ((AbsListView)localObject).setAdapter(b);
      c.setOnItemClickListener(x);
      c.setFocusable(true);
      c.setFocusableInTouchMode(true);
      c.setOnItemSelectedListener(new m0(this));
      c.setOnScrollListener(A);
      localObject = c;
      G.setContentView((View)localObject);
    }
    else
    {
      localObject = (ViewGroup)G.getContentView();
    }
    Object localObject = G.getBackground();
    int i = 0;
    int k;
    int m;
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(D);
      localObject = D;
      j = top;
      k = bottom + j;
      m = k;
      if (!q)
      {
        o = (-j);
        m = k;
      }
    }
    else
    {
      D.setEmpty();
      m = 0;
    }
    boolean bool;
    if (G.getInputMethodMode() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    localObject = w;
    int j = o;
    if (Build.VERSION.SDK_INT <= 23)
    {
      Method localMethod2 = I;
      if (localMethod2 != null) {
        try
        {
          k = ((Integer)localMethod2.invoke(G, new Object[] { localObject, Integer.valueOf(j), Boolean.valueOf(bool) })).intValue();
        }
        catch (Exception localException3)
        {
          Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
        }
      } else {
        k = G.getMaxAvailableHeight((View)localObject, j);
      }
    }
    else
    {
      k = a.a(G, (View)localObject, j, bool);
    }
    int n;
    if (d == -1)
    {
      k += m;
    }
    else
    {
      j = e;
      if (j != -2)
      {
        n = 1073741824;
        if (j == -1)
        {
          j = a.getResources().getDisplayMetrics().widthPixels;
          localObject = D;
          j -= left + right;
        }
      }
      else
      {
        j = a.getResources().getDisplayMetrics().widthPixels;
        localObject = D;
        j -= left + right;
        n = Integer.MIN_VALUE;
      }
      j = View.MeasureSpec.makeMeasureSpec(j, n);
      j = c.a(j, k + 0);
      if (j > 0)
      {
        k = c.getPaddingTop();
        k = c.getPaddingBottom() + k + m + 0;
      }
      else
      {
        k = 0;
      }
      k = j + k;
    }
    if (G.getInputMethodMode() == 2) {
      m = 1;
    } else {
      m = 0;
    }
    g.d(G, p);
    if (G.isShowing())
    {
      View localView = w;
      localObject = d0.a;
      if (!localView.isAttachedToWindow()) {
        return;
      }
      n = e;
      if (n == -1)
      {
        j = -1;
      }
      else
      {
        j = n;
        if (n == -2) {
          j = w.getWidth();
        }
      }
      n = d;
      if (n == -1)
      {
        if (m == 0) {
          k = -1;
        }
        if (m != 0)
        {
          localObject = G;
          if (e == -1) {
            m = -1;
          } else {
            m = 0;
          }
          ((PopupWindow)localObject).setWidth(m);
          G.setHeight(0);
        }
        else
        {
          localObject = G;
          m = i;
          if (e == -1) {
            m = -1;
          }
          ((PopupWindow)localObject).setWidth(m);
          G.setHeight(-1);
        }
      }
      else if (n != -2)
      {
        k = n;
      }
      G.setOutsideTouchable(true);
      localObject = G;
      localView = w;
      n = f;
      m = o;
      if (j < 0) {
        j = -1;
      }
      if (k < 0) {
        k = -1;
      }
      ((r)localObject).update(localView, n, m, j, k);
    }
    else
    {
      m = e;
      if (m == -1)
      {
        j = -1;
      }
      else
      {
        j = m;
        if (m == -2) {
          j = w.getWidth();
        }
      }
      m = d;
      if (m == -1) {
        k = -1;
      } else if (m != -2) {
        k = m;
      }
      G.setWidth(j);
      G.setHeight(k);
      if (Build.VERSION.SDK_INT <= 28)
      {
        localObject = H;
        if (localObject != null) {
          try
          {
            ((Method)localObject).invoke(G, new Object[] { Boolean.TRUE });
          }
          catch (Exception localException1)
          {
            Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
          }
        }
      }
      else
      {
        b.b(G, true);
      }
      G.setOutsideTouchable(true);
      G.setTouchInterceptor(z);
      if (s) {
        g.c(G, r);
      }
      if (Build.VERSION.SDK_INT <= 28)
      {
        Method localMethod1 = J;
        if (localMethod1 != null) {
          try
          {
            localMethod1.invoke(G, new Object[] { E });
          }
          catch (Exception localException2)
          {
            Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", localException2);
          }
        }
      }
      else
      {
        b.a(G, E);
      }
      G.showAsDropDown(w, f, o, t);
      c.setSelection(-1);
      if ((!F) || (c.isInTouchMode()))
      {
        j0 localj0 = c;
        if (localj0 != null)
        {
          localj0.setListSelectionHidden(true);
          localj0.requestLayout();
        }
      }
      if (!F) {
        C.post(B);
      }
    }
  }
  
  public static final class a
  {
    public static int a(PopupWindow paramPopupWindow, View paramView, int paramInt, boolean paramBoolean)
    {
      return e.b(paramPopupWindow, paramView, paramInt, paramBoolean);
    }
  }
  
  public static final class b
  {
    public static void a(PopupWindow paramPopupWindow, Rect paramRect)
    {
      u.q(paramPopupWindow, paramRect);
    }
    
    public static void b(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      v.p(paramPopupWindow, paramBoolean);
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      j0 localj0 = c;
      if (localj0 != null)
      {
        localj0.setListSelectionHidden(true);
        localj0.requestLayout();
      }
    }
  }
  
  public final class d
    extends DataSetObserver
  {
    public d() {}
    
    public final void onChanged()
    {
      if (a()) {
        show();
      }
    }
    
    public final void onInvalidated()
    {
      dismiss();
    }
  }
  
  public final class e
    implements AbsListView.OnScrollListener
  {
    public e() {}
    
    public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      int i = 1;
      if (paramInt == 1)
      {
        if (G.getInputMethodMode() == 2) {
          paramInt = i;
        } else {
          paramInt = 0;
        }
        if ((paramInt == 0) && (G.getContentView() != null))
        {
          paramAbsListView = n0.this;
          C.removeCallbacks(y);
          y.run();
        }
      }
    }
  }
  
  public final class f
    implements View.OnTouchListener
  {
    public f() {}
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if (i == 0)
      {
        paramView = G;
        if ((paramView != null) && (paramView.isShowing()) && (j >= 0) && (j < G.getWidth()) && (k >= 0) && (k < G.getHeight()))
        {
          paramView = n0.this;
          C.postDelayed(y, 250L);
          break label126;
        }
      }
      if (i == 1)
      {
        paramView = n0.this;
        C.removeCallbacks(y);
      }
      label126:
      return false;
    }
  }
  
  public final class g
    implements Runnable
  {
    public g() {}
    
    public final void run()
    {
      j0 localj0 = c;
      if (localj0 != null)
      {
        Object localObject = d0.a;
        if ((localj0.isAttachedToWindow()) && (c.getCount() > c.getChildCount()))
        {
          int i = c.getChildCount();
          localObject = n0.this;
          if (i <= u)
          {
            G.setInputMethodMode(2);
            show();
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
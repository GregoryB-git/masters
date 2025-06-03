package l;

import I.s;
import L.g;
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
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;
import k.c;

public abstract class I
  implements c
{
  public static Method U;
  public static Method V;
  public static Method W;
  public boolean A = false;
  public boolean B = false;
  public int C = Integer.MAX_VALUE;
  public View D;
  public int E = 0;
  public DataSetObserver F;
  public View G;
  public Drawable H;
  public AdapterView.OnItemClickListener I;
  public AdapterView.OnItemSelectedListener J;
  public final g K = new g();
  public final f L = new f();
  public final e M = new e();
  public final c N = new c();
  public Runnable O;
  public final Handler P;
  public final Rect Q = new Rect();
  public Rect R;
  public boolean S;
  public PopupWindow T;
  public Context o;
  public ListAdapter p;
  public C q;
  public int r = -2;
  public int s = -2;
  public int t;
  public int u;
  public int v = 1002;
  public boolean w;
  public boolean x;
  public boolean y;
  public int z = 0;
  
  static
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      try
      {
        U = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      }
      try
      {
        W = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      }
    }
    if (Build.VERSION.SDK_INT <= 23) {
      try
      {
        V = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, Integer.TYPE, Boolean.TYPE });
      }
      catch (NoSuchMethodException localNoSuchMethodException3)
      {
        Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
      }
    }
  }
  
  public I(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    o = paramContext;
    P = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.i.J0, paramInt1, paramInt2);
    t = localTypedArray.getDimensionPixelOffset(e.i.K0, 0);
    int i = localTypedArray.getDimensionPixelOffset(e.i.L0, 0);
    u = i;
    if (i != 0) {
      w = true;
    }
    localTypedArray.recycle();
    paramContext = new i(paramContext, paramAttributeSet, paramInt1, paramInt2);
    T = paramContext;
    paramContext.setInputMethodMode(1);
  }
  
  public void A(boolean paramBoolean)
  {
    y = true;
    x = paramBoolean;
  }
  
  public final void B(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT <= 28)
    {
      Method localMethod = U;
      if (localMethod != null) {
        try
        {
          localMethod.invoke(T, new Object[] { Boolean.valueOf(paramBoolean) });
        }
        catch (Exception localException)
        {
          Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
      }
    }
    else
    {
      H.a(T, paramBoolean);
    }
  }
  
  public void C(int paramInt)
  {
    u = paramInt;
    w = true;
  }
  
  public void D(int paramInt)
  {
    s = paramInt;
  }
  
  public void a()
  {
    int i = e();
    boolean bool1 = m();
    g.b(T, v);
    boolean bool2 = T.isShowing();
    boolean bool3 = true;
    int j;
    int k;
    Object localObject;
    if (bool2)
    {
      if (!s.t(h())) {
        return;
      }
      j = s;
      if (j == -1)
      {
        k = -1;
      }
      else
      {
        k = j;
        if (j == -2) {
          k = h().getWidth();
        }
      }
      j = r;
      if (j == -1)
      {
        if (!bool1) {
          i = -1;
        }
        if (bool1)
        {
          localObject = T;
          if (s == -1) {
            j = -1;
          } else {
            j = 0;
          }
          ((PopupWindow)localObject).setWidth(j);
          T.setHeight(0);
        }
        else
        {
          localObject = T;
          if (s == -1) {
            j = -1;
          } else {
            j = 0;
          }
          ((PopupWindow)localObject).setWidth(j);
          T.setHeight(-1);
        }
      }
      else if (j != -2)
      {
        i = j;
      }
      localObject = T;
      if ((B) || (A)) {
        bool3 = false;
      }
      ((PopupWindow)localObject).setOutsideTouchable(bool3);
      PopupWindow localPopupWindow = T;
      localObject = h();
      int m = t;
      j = u;
      if (k < 0) {
        k = -1;
      }
      if (i < 0) {
        i = -1;
      }
      localPopupWindow.update((View)localObject, m, j, k, i);
    }
    else
    {
      j = s;
      if (j == -1)
      {
        k = -1;
      }
      else
      {
        k = j;
        if (j == -2) {
          k = h().getWidth();
        }
      }
      j = r;
      if (j == -1) {
        i = -1;
      } else if (j != -2) {
        i = j;
      }
      T.setWidth(k);
      T.setHeight(i);
      B(true);
      localObject = T;
      if ((!B) && (!A)) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      ((PopupWindow)localObject).setOutsideTouchable(bool3);
      T.setTouchInterceptor(L);
      if (y) {
        g.a(T, x);
      }
      if (Build.VERSION.SDK_INT <= 28)
      {
        localObject = W;
        if (localObject != null) {
          try
          {
            ((Method)localObject).invoke(T, new Object[] { R });
          }
          catch (Exception localException)
          {
            Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", localException);
          }
        }
      }
      else
      {
        F.a(T, R);
      }
      g.c(T, h(), t, u, z);
      q.setSelection(-1);
      if ((!S) || (q.isInTouchMode())) {
        f();
      }
      if (!S) {
        P.post(N);
      }
    }
  }
  
  public ListView d()
  {
    return q;
  }
  
  public void dismiss()
  {
    T.dismiss();
    o();
    T.setContentView(null);
    q = null;
    P.removeCallbacks(K);
  }
  
  public final int e()
  {
    Object localObject1 = q;
    int i = Integer.MIN_VALUE;
    boolean bool = true;
    Object localObject3;
    int j;
    int k;
    if (localObject1 == null)
    {
      localObject1 = o;
      O = new a();
      Object localObject2 = g((Context)localObject1, S ^ true);
      q = ((C)localObject2);
      localObject3 = H;
      if (localObject3 != null) {
        ((C)localObject2).setSelector((Drawable)localObject3);
      }
      q.setAdapter(p);
      q.setOnItemClickListener(I);
      q.setFocusable(true);
      q.setFocusableInTouchMode(true);
      q.setOnItemSelectedListener(new b());
      q.setOnScrollListener(M);
      localObject3 = J;
      if (localObject3 != null) {
        q.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject3);
      }
      localObject3 = q;
      localObject2 = D;
      if (localObject2 != null)
      {
        localObject1 = new LinearLayout((Context)localObject1);
        ((LinearLayout)localObject1).setOrientation(1);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        j = E;
        if (j != 0)
        {
          if (j != 1)
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Invalid hint position ");
            ((StringBuilder)localObject3).append(E);
            Log.e("ListPopupWindow", ((StringBuilder)localObject3).toString());
          }
          else
          {
            ((ViewGroup)localObject1).addView((View)localObject3, localLayoutParams);
            ((ViewGroup)localObject1).addView((View)localObject2);
          }
        }
        else
        {
          ((ViewGroup)localObject1).addView((View)localObject2);
          ((ViewGroup)localObject1).addView((View)localObject3, localLayoutParams);
        }
        j = s;
        if (j >= 0)
        {
          k = Integer.MIN_VALUE;
        }
        else
        {
          j = 0;
          k = j;
        }
        ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(j, k), 0);
        localObject3 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
        j = ((View)localObject2).getMeasuredHeight() + topMargin + bottomMargin;
      }
      else
      {
        j = 0;
        localObject1 = localObject3;
      }
      T.setContentView((View)localObject1);
    }
    else
    {
      localObject1 = (ViewGroup)T.getContentView();
      localObject3 = D;
      if (localObject3 != null)
      {
        localObject1 = (LinearLayout.LayoutParams)((View)localObject3).getLayoutParams();
        j = ((View)localObject3).getMeasuredHeight() + topMargin + bottomMargin;
      }
      else
      {
        j = 0;
      }
    }
    localObject1 = T.getBackground();
    int m;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).getPadding(Q);
      localObject1 = Q;
      m = top;
      n = bottom + m;
      k = n;
      if (!w)
      {
        u = (-m);
        k = n;
      }
    }
    else
    {
      Q.setEmpty();
      k = 0;
    }
    if (T.getInputMethodMode() != 2) {
      bool = false;
    }
    int n = k(h(), u, bool);
    if ((!A) && (r != -1))
    {
      m = s;
      if (m != -2)
      {
        i = 1073741824;
        if (m == -1) {}
      }
      for (i = View.MeasureSpec.makeMeasureSpec(m, 1073741824);; i = View.MeasureSpec.makeMeasureSpec(m - (left + right), i))
      {
        break;
        m = o.getResources().getDisplayMetrics().widthPixels;
        localObject1 = Q;
      }
      n = q.d(i, 0, -1, n - j, -1);
      i = j;
      if (n > 0) {
        i = j + (k + (q.getPaddingTop() + q.getPaddingBottom()));
      }
      return n + i;
    }
    return n + k;
  }
  
  public void f()
  {
    C localC = q;
    if (localC != null)
    {
      localC.setListSelectionHidden(true);
      localC.requestLayout();
    }
  }
  
  public abstract C g(Context paramContext, boolean paramBoolean);
  
  public View h()
  {
    return G;
  }
  
  public boolean i()
  {
    return T.isShowing();
  }
  
  public int j()
  {
    return t;
  }
  
  public final int k(View paramView, int paramInt, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT <= 23)
    {
      Method localMethod = V;
      if (localMethod != null) {
        try
        {
          int i = ((Integer)localMethod.invoke(T, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
          return i;
        }
        catch (Exception localException)
        {
          Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
        }
      }
      return T.getMaxAvailableHeight(paramView, paramInt);
    }
    return G.a(T, paramView, paramInt, paramBoolean);
  }
  
  public int l()
  {
    if (!w) {
      return 0;
    }
    return u;
  }
  
  public boolean m()
  {
    boolean bool;
    if (T.getInputMethodMode() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean n()
  {
    return S;
  }
  
  public final void o()
  {
    Object localObject = D;
    if (localObject != null)
    {
      localObject = ((View)localObject).getParent();
      if ((localObject instanceof ViewGroup)) {
        ((ViewGroup)localObject).removeView(D);
      }
    }
  }
  
  public void p(ListAdapter paramListAdapter)
  {
    DataSetObserver localDataSetObserver = F;
    if (localDataSetObserver == null)
    {
      F = new d();
    }
    else
    {
      ListAdapter localListAdapter = p;
      if (localListAdapter != null) {
        localListAdapter.unregisterDataSetObserver(localDataSetObserver);
      }
    }
    p = paramListAdapter;
    if (paramListAdapter != null) {
      paramListAdapter.registerDataSetObserver(F);
    }
    paramListAdapter = q;
    if (paramListAdapter != null) {
      paramListAdapter.setAdapter(p);
    }
  }
  
  public void q(View paramView)
  {
    G = paramView;
  }
  
  public void r(int paramInt)
  {
    T.setAnimationStyle(paramInt);
  }
  
  public void s(int paramInt)
  {
    Object localObject = T.getBackground();
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(Q);
      localObject = Q;
      s = (left + right + paramInt);
    }
    else
    {
      D(paramInt);
    }
  }
  
  public void t(int paramInt)
  {
    z = paramInt;
  }
  
  public void u(Rect paramRect)
  {
    if (paramRect != null) {
      paramRect = new Rect(paramRect);
    } else {
      paramRect = null;
    }
    R = paramRect;
  }
  
  public void v(int paramInt)
  {
    t = paramInt;
  }
  
  public void w(int paramInt)
  {
    T.setInputMethodMode(paramInt);
  }
  
  public void x(boolean paramBoolean)
  {
    S = paramBoolean;
    T.setFocusable(paramBoolean);
  }
  
  public void y(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    T.setOnDismissListener(paramOnDismissListener);
  }
  
  public void z(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    I = paramOnItemClickListener;
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      View localView = h();
      if ((localView != null) && (localView.getWindowToken() != null)) {
        a();
      }
    }
  }
  
  public class b
    implements AdapterView.OnItemSelectedListener
  {
    public b() {}
    
    public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      if (paramInt != -1)
      {
        paramAdapterView = q;
        if (paramAdapterView != null) {
          paramAdapterView.setListSelectionHidden(false);
        }
      }
    }
    
    public void onNothingSelected(AdapterView paramAdapterView) {}
  }
  
  public class c
    implements Runnable
  {
    public c() {}
    
    public void run()
    {
      f();
    }
  }
  
  public class d
    extends DataSetObserver
  {
    public d() {}
    
    public void onChanged()
    {
      if (i()) {
        a();
      }
    }
    
    public void onInvalidated()
    {
      dismiss();
    }
  }
  
  public class e
    implements AbsListView.OnScrollListener
  {
    public e() {}
    
    public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      if ((paramInt == 1) && (!m()) && (T.getContentView() != null))
      {
        paramAbsListView = I.this;
        P.removeCallbacks(K);
        K.run();
      }
    }
  }
  
  public class f
    implements View.OnTouchListener
  {
    public f() {}
    
    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if (i == 0)
      {
        paramView = T;
        if ((paramView != null) && (paramView.isShowing()) && (j >= 0) && (j < T.getWidth()) && (k >= 0) && (k < T.getHeight()))
        {
          paramView = I.this;
          P.postDelayed(K, 250L);
          break label126;
        }
      }
      if (i == 1)
      {
        paramView = I.this;
        P.removeCallbacks(K);
      }
      label126:
      return false;
    }
  }
  
  public class g
    implements Runnable
  {
    public g() {}
    
    public void run()
    {
      Object localObject = q;
      if ((localObject != null) && (s.t((View)localObject)) && (q.getCount() > q.getChildCount()))
      {
        int i = q.getChildCount();
        localObject = I.this;
        if (i <= C)
        {
          T.setInputMethodMode(2);
          a();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.I
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
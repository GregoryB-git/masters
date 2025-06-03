package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import f;

public class GridLayoutManager
  extends LinearLayoutManager
{
  public int p = -1;
  public a q;
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    new SparseIntArray();
    new SparseIntArray();
    q = new a();
    new Rect();
    paramInt1 = xb;
    if (paramInt1 != p)
    {
      if (paramInt1 >= 1)
      {
        p = paramInt1;
        q.b();
        I();
      }
    }
    else {
      return;
    }
    throw new IllegalArgumentException(f.h("Span count should be at least 1. Provided ", paramInt1));
  }
  
  public final void R(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      super.R(false);
      return;
    }
    throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
  }
  
  public final int S(int paramInt, RecyclerView.p paramp, RecyclerView.s params)
  {
    if (!d)
    {
      paramp = q;
      i = p;
      paramp.getClass();
      return c.a(paramInt, i);
    }
    int i = paramp.a(paramInt);
    if (i == -1)
    {
      paramp = new StringBuilder();
      paramp.append("Cannot find span size for pre layout position. ");
      paramp.append(paramInt);
      Log.w("GridLayoutManager", paramp.toString());
      return 0;
    }
    paramp = q;
    paramInt = p;
    paramp.getClass();
    return c.a(i, paramInt);
  }
  
  public final boolean d(RecyclerView.k paramk)
  {
    return paramk instanceof b;
  }
  
  public final void g(RecyclerView.s params)
  {
    L(params);
  }
  
  public final int h(RecyclerView.s params)
  {
    return M(params);
  }
  
  public final void j(RecyclerView.s params)
  {
    L(params);
  }
  
  public final int k(RecyclerView.s params)
  {
    return M(params);
  }
  
  public final RecyclerView.k l()
  {
    if (h == 0) {
      return new b(-2, -1);
    }
    return new b(-1, -2);
  }
  
  public final RecyclerView.k m(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new b(paramContext, paramAttributeSet);
  }
  
  public final RecyclerView.k n(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new b((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new b(paramLayoutParams);
  }
  
  public final int q(RecyclerView.p paramp, RecyclerView.s params)
  {
    if (h == 1) {
      return p;
    }
    if (params.a() < 1) {
      return 0;
    }
    return S(params.a() - 1, paramp, params) + 1;
  }
  
  public final int y(RecyclerView.p paramp, RecyclerView.s params)
  {
    if (h == 0) {
      return p;
    }
    if (params.a() < 1) {
      return 0;
    }
    return S(params.a() - 1, paramp, params) + 1;
  }
  
  public static final class a
    extends GridLayoutManager.c
  {}
  
  public static final class b
    extends RecyclerView.k
  {
    public b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  public static abstract class c
  {
    public final SparseIntArray a = new SparseIntArray();
    
    public c()
    {
      new SparseIntArray();
    }
    
    public static int a(int paramInt1, int paramInt2)
    {
      int i = 0;
      int j = i;
      int n;
      for (int k = j; i < paramInt1; k = n)
      {
        int m = j + 1;
        if (m == paramInt2)
        {
          n = k + 1;
          j = 0;
        }
        else
        {
          j = m;
          n = k;
          if (m > paramInt2)
          {
            n = k + 1;
            j = 1;
          }
        }
        i++;
      }
      paramInt1 = k;
      if (j + 1 > paramInt2) {
        paramInt1 = k + 1;
      }
      return paramInt1;
    }
    
    public final void b()
    {
      a.clear();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.GridLayoutManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
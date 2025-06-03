package androidx.recyclerview.widget;

import android.view.View;

public final class p
{
  public final b a;
  public a b;
  
  public p(b paramb)
  {
    a = paramb;
    b = new a();
  }
  
  public final View a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = a.b();
    int j = a.c();
    int k;
    if (paramInt2 > paramInt1) {
      k = 1;
    } else {
      k = -1;
    }
    Object localObject2;
    for (Object localObject1 = null; paramInt1 != paramInt2; localObject1 = localObject2)
    {
      View localView = a.d(paramInt1);
      int m = a.a(localView);
      int n = a.e(localView);
      localObject2 = b;
      b = i;
      c = j;
      d = m;
      e = n;
      if (paramInt3 != 0)
      {
        a = (paramInt3 | 0x0);
        if (((a)localObject2).a()) {
          return localView;
        }
      }
      localObject2 = localObject1;
      if (paramInt4 != 0)
      {
        a locala = b;
        a = (paramInt4 | 0x0);
        localObject2 = localObject1;
        if (locala.a()) {
          localObject2 = localView;
        }
      }
      paramInt1 += k;
    }
    return (View)localObject1;
  }
  
  public static final class a
  {
    public int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    
    public final boolean a()
    {
      int i = a;
      int j = 2;
      int k;
      int m;
      if ((i & 0x7) != 0)
      {
        k = d;
        m = b;
        if (k > m) {
          k = 1;
        } else if (k == m) {
          k = 2;
        } else {
          k = 4;
        }
        if ((k << 0 & i) == 0) {
          return false;
        }
      }
      if ((i & 0x70) != 0)
      {
        k = d;
        m = c;
        if (k > m) {
          k = 1;
        } else if (k == m) {
          k = 2;
        } else {
          k = 4;
        }
        if ((k << 4 & i) == 0) {
          return false;
        }
      }
      if ((i & 0x700) != 0)
      {
        k = e;
        m = b;
        if (k > m) {
          k = 1;
        } else if (k == m) {
          k = 2;
        } else {
          k = 4;
        }
        if ((k << 8 & i) == 0) {
          return false;
        }
      }
      if ((i & 0x7000) != 0)
      {
        k = e;
        m = c;
        if (k > m) {
          k = 1;
        } else if (k == m) {
          k = j;
        } else {
          k = 4;
        }
        if ((i & k << 12) == 0) {
          return false;
        }
      }
      return true;
    }
  }
  
  public static abstract interface b
  {
    public abstract int a(View paramView);
    
    public abstract int b();
    
    public abstract int c();
    
    public abstract View d(int paramInt);
    
    public abstract int e(View paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
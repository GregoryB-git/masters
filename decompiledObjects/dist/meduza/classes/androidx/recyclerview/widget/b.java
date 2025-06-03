package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class b
{
  public final b a;
  public final a b;
  public final ArrayList c;
  
  public b(k paramk)
  {
    a = paramk;
    b = new a();
    c = new ArrayList();
  }
  
  public final View a(int paramInt)
  {
    paramInt = c(paramInt);
    return a).a.getChildAt(paramInt);
  }
  
  public final int b()
  {
    return ((k)a).a() - c.size();
  }
  
  public final int c(int paramInt)
  {
    if (paramInt < 0) {
      return -1;
    }
    int i = ((k)a).a();
    int j = paramInt;
    while (j < i)
    {
      int k = paramInt - (j - b.a(j));
      if (k == 0)
      {
        while (b.c(j)) {
          j++;
        }
        return j;
      }
      j += k;
    }
    return -1;
  }
  
  public final View d(int paramInt)
  {
    return a).a.getChildAt(paramInt);
  }
  
  public final int e()
  {
    return ((k)a).a();
  }
  
  public final void f(View paramView)
  {
    if (c.remove(paramView))
    {
      ((k)a).getClass();
      RecyclerView.p(paramView);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.toString());
    localStringBuilder.append(", hidden list:");
    localStringBuilder.append(c.size());
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public long a = 0L;
    public a b;
    
    public final int a(int paramInt)
    {
      a locala = b;
      if (locala == null) {
        if (paramInt >= 64)
        {
          l = a;
          return Long.bitCount(l);
        }
      }
      while (paramInt < 64) {
        for (;;)
        {
          long l = a & (1L << paramInt) - 1L;
        }
      }
      paramInt = locala.a(paramInt - 64);
      return Long.bitCount(a) + paramInt;
    }
    
    public final void b()
    {
      if (b == null) {
        b = new a();
      }
    }
    
    public final boolean c(int paramInt)
    {
      if (paramInt >= 64)
      {
        b();
        return b.c(paramInt - 64);
      }
      boolean bool;
      if ((a & 1L << paramInt) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean d(int paramInt)
    {
      if (paramInt >= 64)
      {
        b();
        return b.d(paramInt - 64);
      }
      long l1 = 1L << paramInt;
      long l2 = a;
      boolean bool;
      if ((l2 & l1) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      l2 &= l1;
      a = l2;
      l1 -= 1L;
      a = (l2 & l1 | Long.rotateRight(l1 & l2, 1));
      a locala = b;
      if (locala != null)
      {
        if (locala.c(0)) {
          f(63);
        }
        b.d(0);
      }
      return bool;
    }
    
    public final void e()
    {
      a = 0L;
      a locala = b;
      if (locala != null) {
        locala.e();
      }
    }
    
    public final void f(int paramInt)
    {
      if (paramInt >= 64)
      {
        b();
        b.f(paramInt - 64);
      }
      else
      {
        a |= 1L << paramInt;
      }
    }
    
    public final String toString()
    {
      Object localObject;
      if (b == null)
      {
        localObject = Long.toBinaryString(a);
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(b.toString());
        ((StringBuilder)localObject).append("xx");
        ((StringBuilder)localObject).append(Long.toBinaryString(a));
        localObject = ((StringBuilder)localObject).toString();
      }
      return (String)localObject;
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
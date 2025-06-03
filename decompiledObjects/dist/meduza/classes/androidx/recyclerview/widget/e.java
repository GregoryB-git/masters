package androidx.recyclerview.widget;

import a0.n;
import android.os.Trace;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class e
  implements Runnable
{
  public static final ThreadLocal<e> e = new ThreadLocal();
  public static a f = new a();
  public ArrayList<RecyclerView> a = new ArrayList();
  public long b;
  public long c;
  public ArrayList<c> d = new ArrayList();
  
  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramRecyclerView.isAttachedToWindow()) && (b == 0L))
    {
      b = paramRecyclerView.getNanoTime();
      paramRecyclerView.post(this);
    }
    paramRecyclerView = h0;
    a = paramInt1;
    b = paramInt2;
  }
  
  public final void b(long paramLong)
  {
    int i = a.size();
    int j = 0;
    Object localObject1;
    int m;
    Object localObject2;
    for (int k = j; j < i; k = m)
    {
      localObject1 = (RecyclerView)a.get(j);
      m = k;
      if (((View)localObject1).getWindowVisibility() == 0)
      {
        localObject2 = h0;
        c = 0;
        localObject2.getClass();
        m = k + h0.c;
      }
      j++;
    }
    d.ensureCapacity(k);
    for (k = 0; k < i; k++)
    {
      localObject1 = (RecyclerView)a.get(k);
      if (((View)localObject1).getWindowVisibility() == 0)
      {
        localObject1 = h0;
        Math.abs(a);
        Math.abs(b);
        if (c * 2 > 0)
        {
          if (d.size() <= 0)
          {
            localObject2 = new c();
            d.add(localObject2);
          }
          else
          {
            localObject2 = (c)d.get(0);
          }
          localObject1.getClass();
          throw null;
        }
      }
    }
    Collections.sort(d, f);
    if (d.size() > 0)
    {
      localObject2 = (c)d.get(0);
      localObject1 = d;
      if (localObject1 != null)
      {
        if (a) {
          paramLong = Long.MAX_VALUE;
        }
        k = e;
        if (d.e() <= 0)
        {
          localObject2 = a;
          try
          {
            ((RecyclerView)localObject1).r();
            ((RecyclerView.p)localObject2).e(k, paramLong);
            throw null;
          }
          finally
          {
            ((RecyclerView)localObject1).s(false);
          }
        }
        RecyclerView.p(d.d(0));
        throw null;
      }
    }
  }
  
  public final void run()
  {
    try
    {
      i = n.a;
      Trace.beginSection("RV Prefetch");
      boolean bool = a.isEmpty();
      if (bool)
      {
        b = 0L;
        Trace.endSection();
        return;
      }
      int j = a.size();
      i = 0;
      long l2;
      for (long l1 = 0L; i < j; l1 = l2)
      {
        RecyclerView localRecyclerView = (RecyclerView)a.get(i);
        l2 = l1;
        if (localRecyclerView.getWindowVisibility() == 0) {
          l2 = Math.max(localRecyclerView.getDrawingTime(), l1);
        }
        i++;
      }
      if (l1 == 0L)
      {
        b = 0L;
        Trace.endSection();
        return;
      }
      b(TimeUnit.MILLISECONDS.toNanos(l1) + c);
      b = 0L;
      Trace.endSection();
      return;
    }
    finally
    {
      b = 0L;
      int i = n.a;
      Trace.endSection();
    }
  }
  
  public final class a
    implements Comparator<e.c>
  {
    public final int compare(Object paramObject1, Object paramObject2)
    {
      paramObject1 = (e.c)paramObject1;
      e.c localc = (e.c)paramObject2;
      paramObject2 = d;
      int i = 0;
      if (paramObject2 == null) {
        j = 1;
      } else {
        j = 0;
      }
      int k;
      if (d == null) {
        k = 1;
      } else {
        k = 0;
      }
      if (j != k) {
        if (paramObject2 == null)
        {
          j = 1;
          break label136;
        }
      }
      for (;;)
      {
        j = -1;
        break label136;
        boolean bool = a;
        if (bool == a) {
          break label93;
        }
        if (!bool) {
          break;
        }
      }
      label93:
      int j = b - b;
      if (j == 0)
      {
        k = c - c;
        j = i;
        if (k != 0) {
          j = k;
        }
      }
      label136:
      return j;
    }
  }
  
  public static final class b
  {
    public int a;
    public int b;
    public int c;
  }
  
  public static final class c
  {
    public boolean a;
    public int b;
    public int c;
    public RecyclerView d;
    public int e;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
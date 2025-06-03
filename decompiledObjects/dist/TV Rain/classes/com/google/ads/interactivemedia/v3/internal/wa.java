package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class wa
{
  public final int a;
  public final int b;
  public final List<qc> c;
  public final List<pz> d;
  public final List<pz> e;
  private final Object f;
  private final PriorityQueue<Integer> g;
  private int h;
  
  public wa()
  {
    f = new Object();
    g = new PriorityQueue(10, Collections.reverseOrder());
    h = Integer.MIN_VALUE;
  }
  
  public wa(int paramInt1, int paramInt2, List<qc> paramList, List<pz> paramList1, List<pz> paramList2)
  {
    a = paramInt1;
    b = paramInt2;
    c = Collections.unmodifiableList(paramList);
    if (paramList1 == null) {
      paramList = Collections.emptyList();
    } else {
      paramList = Collections.unmodifiableList(paramList1);
    }
    d = paramList;
    if (paramList2 == null) {
      paramList = Collections.emptyList();
    } else {
      paramList = Collections.unmodifiableList(paramList2);
    }
    e = paramList;
  }
  
  public final void a(int paramInt)
  {
    synchronized (f)
    {
      g.remove(Integer.valueOf(0));
      if (g.isEmpty()) {
        paramInt = Integer.MIN_VALUE;
      } else {
        paramInt = ((Integer)wl.a((Integer)g.peek())).intValue();
      }
      h = paramInt;
      f.notifyAll();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
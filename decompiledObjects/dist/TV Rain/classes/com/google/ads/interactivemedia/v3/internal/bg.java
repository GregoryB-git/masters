package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.CopyOnWriteArrayList;

final class bg
  implements Runnable
{
  private final cd a;
  private final CopyOnWriteArrayList<at> b;
  private final te c;
  private final boolean d;
  private final int e;
  private final int f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  private final boolean k;
  private final boolean l;
  private final boolean m;
  
  public bg(cd paramcd1, cd paramcd2, CopyOnWriteArrayList<at> paramCopyOnWriteArrayList, te paramte, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3)
  {
    a = paramcd1;
    b = new CopyOnWriteArrayList(paramCopyOnWriteArrayList);
    c = paramte;
    d = paramBoolean1;
    e = paramInt1;
    f = paramInt2;
    g = paramBoolean2;
    m = paramBoolean3;
    paramInt1 = e;
    paramInt2 = e;
    paramBoolean2 = true;
    if (paramInt1 != paramInt2) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    h = paramBoolean1;
    paramCopyOnWriteArrayList = f;
    paramte = f;
    if ((paramCopyOnWriteArrayList != paramte) && (paramte != null)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    i = paramBoolean1;
    if (a != a) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    j = paramBoolean1;
    if (g != g) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    k = paramBoolean1;
    if (i != i) {
      paramBoolean1 = paramBoolean2;
    } else {
      paramBoolean1 = false;
    }
    l = paramBoolean1;
  }
  
  public final void run()
  {
    if ((j) || (f == 0)) {
      bc.b(b, new bf(this));
    }
    if (d) {
      bc.b(b, new bi(this));
    }
    if (i) {
      bc.b(b, new bh(this));
    }
    if (l)
    {
      c.a(a.i.d);
      bc.b(b, new bk(this));
    }
    if (k) {
      bc.b(b, new bj(this));
    }
    if (h) {
      bc.b(b, new bm(this));
    }
    if (g) {
      bc.b(b, bl.a);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.bg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
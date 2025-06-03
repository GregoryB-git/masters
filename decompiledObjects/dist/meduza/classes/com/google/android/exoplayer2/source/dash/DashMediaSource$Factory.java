package com.google.android.exoplayer2.source.dash;

import a4.c;
import d5.d;
import java.util.List;
import t5.f0.a;
import t5.k.a;
import t5.u;
import v3.o0;
import v3.o0.f;
import y4.b;
import z4.t.a;

public final class DashMediaSource$Factory
  implements t.a
{
  public final a.a a;
  public final k.a b;
  public a4.i c;
  public z4.i d;
  public u e;
  public long f;
  
  public DashMediaSource$Factory(c.a parama, k.a parama1)
  {
    a = parama;
    b = parama1;
    c = new c();
    e = new u();
    f = 30000L;
    d = new z4.i(0);
  }
  
  public DashMediaSource$Factory(k.a parama)
  {
    this(new c.a(parama), parama);
  }
  
  public final DashMediaSource a(o0 paramo0)
  {
    b.getClass();
    Object localObject = new d();
    List localList = b.d;
    if (!localList.isEmpty()) {
      localObject = new b((f0.a)localObject, localList);
    }
    return new DashMediaSource(paramo0, b, (f0.a)localObject, a, d, c.a(paramo0), e, f);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
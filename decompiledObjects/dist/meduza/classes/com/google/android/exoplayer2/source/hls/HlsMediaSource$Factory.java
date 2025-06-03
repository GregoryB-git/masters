package com.google.android.exoplayer2.source.hls;

import e5.d;
import f5.a;
import f5.b;
import java.util.List;
import t5.k.a;
import t5.u;
import v3.o0;
import v3.o0.f;
import w3.v;
import z4.t.a;

public final class HlsMediaSource$Factory
  implements t.a
{
  public final e5.h a;
  public d b;
  public a c;
  public v d;
  public z4.i e;
  public a4.i f;
  public u g;
  public boolean h;
  public int i;
  public long j;
  
  public HlsMediaSource$Factory(k.a parama)
  {
    a = parama;
    f = new a4.c();
    c = new a();
    d = b.w;
    b = e5.i.a;
    g = new u();
    e = new z4.i(0);
    i = 1;
    j = -9223372036854775807L;
    h = true;
  }
  
  public final HlsMediaSource a(o0 paramo0)
  {
    b.getClass();
    Object localObject1 = c;
    Object localObject2 = b.d;
    Object localObject3 = localObject1;
    if (!((List)localObject2).isEmpty()) {
      localObject3 = new f5.c((a)localObject1, (List)localObject2);
    }
    e5.h localh1 = a;
    localObject1 = b;
    localObject2 = e;
    a4.h localh = f.a(paramo0);
    u localu = g;
    v localv = d;
    e5.h localh2 = a;
    localv.getClass();
    return new HlsMediaSource(paramo0, localh1, (d)localObject1, (z4.i)localObject2, localh, localu, new b(localh2, localu, (f5.i)localObject3), j, h, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
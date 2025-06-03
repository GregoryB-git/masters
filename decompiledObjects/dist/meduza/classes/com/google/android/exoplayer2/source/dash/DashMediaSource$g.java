package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import java.io.IOException;
import t5.d0;
import t5.d0.a;
import t5.d0.b;
import t5.d0.d;
import t5.f0;
import t5.j0;
import v5.m;
import z4.n;
import z4.w.a;

public final class DashMediaSource$g
  implements d0.a<f0<Long>>
{
  public DashMediaSource$g(DashMediaSource paramDashMediaSource) {}
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    paramd = (f0)paramd;
    a.z(paramd, paramLong1, paramLong2);
  }
  
  public final void p(d0.d paramd, long paramLong1, long paramLong2)
  {
    paramd = (f0)paramd;
    DashMediaSource localDashMediaSource = a;
    localDashMediaSource.getClass();
    paramLong2 = a;
    Object localObject = d;
    Uri localUri = c;
    localObject = new n(d);
    v.getClass();
    y.g((n)localObject, c);
    T = (((Long)f).longValue() - paramLong1);
    localDashMediaSource.A(true);
  }
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    paramd = (f0)paramd;
    DashMediaSource localDashMediaSource = a;
    w.a locala = y;
    paramLong1 = a;
    j0 localj0 = d;
    Uri localUri = c;
    locala.k(new n(d), c, paramIOException, true);
    v.getClass();
    m.d("DashMediaSource", "Failed to resolve time offset.", paramIOException);
    localDashMediaSource.A(true);
    return d0.e;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
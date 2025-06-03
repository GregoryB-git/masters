package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import c5.b;
import d5.c;
import d5.g;
import f;
import java.io.FileNotFoundException;
import java.io.IOException;
import t5.d0;
import t5.d0.a;
import t5.d0.b;
import t5.d0.d;
import t5.d0.g;
import t5.f0;
import t5.j0;
import t5.l;
import t5.u;
import t5.w;
import v3.a1;
import v5.e0;
import v5.m;
import z4.w.a;

public final class DashMediaSource$e
  implements d0.a<f0<c>>
{
  public DashMediaSource$e(DashMediaSource paramDashMediaSource) {}
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    paramd = (f0)paramd;
    a.z(paramd, paramLong1, paramLong2);
  }
  
  public final void p(d0.d paramd, long paramLong1, long paramLong2)
  {
    Object localObject1 = (f0)paramd;
    DashMediaSource localDashMediaSource = a;
    localDashMediaSource.getClass();
    long l = a;
    paramd = d;
    Object localObject2 = c;
    paramd = new z4.n(d);
    v.getClass();
    y.g(paramd, c);
    localObject2 = (c)f;
    paramd = P;
    int i = 0;
    int j;
    if (paramd == null) {
      j = 0;
    } else {
      j = paramd.c();
    }
    l = b0b;
    for (int k = 0; (k < j) && (P.b(k).b < l); k++) {}
    int m;
    if (d)
    {
      if (j - k > ((c)localObject2).c())
      {
        paramd = "Loaded out of sync manifest";
      }
      else
      {
        l = V;
        if ((l == -9223372036854775807L) || (h * 1000L > l)) {
          break label261;
        }
        paramd = f.l("Loaded stale dynamic manifest: ");
        paramd.append(h);
        paramd.append(", ");
        paramd.append(V);
        paramd = paramd.toString();
      }
      m.f("DashMediaSource", paramd);
      m = 1;
      break label264;
      label261:
      m = 0;
      label264:
      if (m != 0)
      {
        j = U;
        U = (j + 1);
        paramd = v;
        k = c;
        if (j < ((u)paramd).b(k))
        {
          paramLong1 = Math.min((U - 1) * 1000, 5000);
          L.postDelayed(D, paramLong1);
        }
        else
        {
          K = new b();
        }
      }
      else
      {
        U = 0;
      }
    }
    else
    {
      P = ((c)localObject2);
      boolean bool = Q;
      Q = (d & bool);
      R = (paramLong1 - paramLong2);
      S = paramLong1;
      localObject2 = B;
      m = i;
    }
    try
    {
      if (b.a == N) {
        m = 1;
      }
      if (m != 0)
      {
        paramd = P.k;
        if (paramd == null) {
          paramd = d.c;
        }
        N = paramd;
      }
      if (j == 0)
      {
        paramd = P;
        if (d)
        {
          localObject1 = i;
          if (localObject1 != null)
          {
            paramd = (String)b;
            if ((!e0.a(paramd, "urn:mpeg:dash:utc:direct:2014")) && (!e0.a(paramd, "urn:mpeg:dash:utc:direct:2012")))
            {
              if ((!e0.a(paramd, "urn:mpeg:dash:utc:http-iso:2014")) && (!e0.a(paramd, "urn:mpeg:dash:utc:http-iso:2012")))
              {
                if ((!e0.a(paramd, "urn:mpeg:dash:utc:http-xsdate:2014")) && (!e0.a(paramd, "urn:mpeg:dash:utc:http-xsdate:2012")))
                {
                  if ((!e0.a(paramd, "urn:mpeg:dash:utc:ntp:2014")) && (!e0.a(paramd, "urn:mpeg:dash:utc:ntp:2012")))
                  {
                    m.d("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                    localDashMediaSource.A(true);
                    break label818;
                  }
                  localDashMediaSource.y();
                  break label818;
                }
                paramd = new DashMediaSource.h();
              }
              else
              {
                paramd = new DashMediaSource.d();
              }
              localObject1 = new f0(H, Uri.parse((String)c), 5, paramd);
              paramd = new DashMediaSource.g(localDashMediaSource);
              paramLong1 = I.f((d0.d)localObject1, paramd, 1);
              y.m(new z4.n(a, b, paramLong1), c);
              break label818;
            }
            try
            {
              T = (e0.L((String)c) - S);
              localDashMediaSource.A(true);
            }
            catch (a1 paramd)
            {
              m.d("DashMediaSource", "Failed to resolve time offset.", paramd);
              localDashMediaSource.A(true);
            }
          }
          localDashMediaSource.y();
          break label818;
        }
      }
      else
      {
        W += k;
      }
      localDashMediaSource.A(true);
      label818:
      return;
    }
    finally {}
  }
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    f0 localf0 = (f0)paramd;
    DashMediaSource localDashMediaSource = a;
    localDashMediaSource.getClass();
    paramLong1 = a;
    Object localObject = d;
    paramd = c;
    localObject = new z4.n(d);
    ((u)v).getClass();
    if ((!(paramIOException instanceof a1)) && (!(paramIOException instanceof FileNotFoundException)) && (!(paramIOException instanceof w)) && (!(paramIOException instanceof d0.g)))
    {
      int i = l.b;
      for (paramd = paramIOException; paramd != null; paramd = paramd.getCause()) {
        if (((paramd instanceof l)) && (a == 2008))
        {
          i = 1;
          break label144;
        }
      }
      i = 0;
      label144:
      if (i == 0)
      {
        paramLong1 = Math.min((paramInt - 1) * 1000, 5000);
        break label175;
      }
    }
    paramLong1 = -9223372036854775807L;
    label175:
    if (paramLong1 == -9223372036854775807L) {
      paramd = d0.f;
    } else {
      paramd = new d0.b(0, paramLong1);
    }
    boolean bool = true ^ paramd.a();
    y.k((z4.n)localObject, c, paramIOException, bool);
    if (bool) {
      v.getClass();
    }
    return paramd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaSource.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import c4.v;
import c4.v.a;
import d5.c;
import java.util.TreeMap;
import l3.l;
import t5.h;
import v3.a1;
import v3.i0;
import v5.e0;
import v5.u;
import z3.g;
import z4.a0;
import z4.b0;

public final class d
  implements Handler.Callback
{
  public final t5.b a;
  public final b b;
  public final r4.b c;
  public final Handler d;
  public final TreeMap<Long, Long> e;
  public c f;
  public boolean o;
  public boolean p;
  public boolean q;
  
  public d(c paramc, DashMediaSource.c paramc1, t5.b paramb)
  {
    f = paramc;
    b = paramc1;
    a = paramb;
    e = new TreeMap();
    d = e0.l(this);
    c = new r4.b();
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    if (q) {
      return true;
    }
    if (what != 1) {
      return false;
    }
    paramMessage = (a)obj;
    long l1 = a;
    long l2 = b;
    paramMessage = (Long)e.get(Long.valueOf(l2));
    if ((paramMessage == null) || (paramMessage.longValue() > l1)) {
      e.put(Long.valueOf(l2), Long.valueOf(l1));
    }
    return true;
  }
  
  public static final class a
  {
    public final long a;
    public final long b;
    
    public a(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      b = paramLong2;
    }
  }
  
  public static abstract interface b {}
  
  public final class c
    implements v
  {
    public final b0 a;
    public final l b;
    public final p4.d c;
    public long d;
    
    public c(t5.b paramb)
    {
      a = new b0(paramb, null, null);
      b = new l(1);
      c = new p4.d();
      d = -9223372036854775807L;
    }
    
    public final void a(int paramInt, u paramu)
    {
      b0 localb0 = a;
      localb0.getClass();
      localb0.a(paramInt, paramu);
    }
    
    public final void b(int paramInt, u paramu)
    {
      a(paramInt, paramu);
    }
    
    public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
    {
      a.c(paramLong, paramInt1, paramInt2, paramInt3, parama);
      for (;;)
      {
        parama = a;
        paramInt2 = 0;
        if (!parama.q(false)) {
          break;
        }
        c.o();
        if (a.u(b, c, 0, false) == -4)
        {
          c.r();
          parama = c;
        }
        else
        {
          parama = null;
        }
        if (parama != null)
        {
          long l = e;
          parama = c.a(parama);
          if (parama != null)
          {
            r4.a locala = (r4.a)a[0];
            localObject1 = a;
            parama = b;
            paramInt1 = paramInt2;
            if ("urn:mpeg:dash:event:2012".equals(localObject1)) {
              if ((!"1".equals(parama)) && (!"2".equals(parama)))
              {
                paramInt1 = paramInt2;
                if (!"3".equals(parama)) {}
              }
              else
              {
                paramInt1 = 1;
              }
            }
            if (paramInt1 != 0)
            {
              try
              {
                paramLong = e0.L(e0.n(e));
              }
              catch (a1 parama)
              {
                paramLong = -9223372036854775807L;
              }
              if (paramLong != -9223372036854775807L)
              {
                localObject1 = new d.a(l, paramLong);
                parama = d;
                parama.sendMessage(parama.obtainMessage(1, localObject1));
              }
            }
          }
        }
      }
      parama = a;
      Object localObject1 = a;
      try
      {
        paramInt1 = s;
        if (paramInt1 == 0) {
          paramLong = -1L;
        } else {
          paramLong = parama.f(paramInt1);
        }
        ((a0)localObject1).b(paramLong);
        return;
      }
      finally {}
    }
    
    public final void d(i0 parami0)
    {
      a.d(parami0);
    }
    
    public final int e(h paramh, int paramInt, boolean paramBoolean)
    {
      return f(paramh, paramInt, paramBoolean);
    }
    
    public final int f(h paramh, int paramInt, boolean paramBoolean)
    {
      b0 localb0 = a;
      localb0.getClass();
      return localb0.w(paramh, paramInt, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
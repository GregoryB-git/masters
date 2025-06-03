package b4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat.a;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Map;
import v3.e1;
import v3.f1;
import v3.f1.b;
import v3.f1.c;
import v3.r1;
import v5.h;

public final class a$b
  extends MediaSessionCompat.a
  implements f1.c
{
  public int f;
  public int o;
  
  public a$b(a parama) {}
  
  public final void A0(int paramInt)
  {
    if (a.a(p, 2097152L))
    {
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (paramInt != 1)
      {
        bool2 = bool1;
        if (paramInt != 2) {
          bool2 = false;
        }
      }
      p.i.n(bool2);
    }
  }
  
  public final void B0()
  {
    p.getClass();
  }
  
  public final void C0()
  {
    p.getClass();
  }
  
  public final void D0(long paramLong)
  {
    p.getClass();
  }
  
  public final void E(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    p.getClass();
  }
  
  public final void E0()
  {
    if (a.a(p, 1L))
    {
      p.i.stop();
      a locala = p;
      if (k) {
        i.l();
      }
    }
  }
  
  public final void H(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    p.getClass();
  }
  
  public final void M(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
  {
    if (p.i != null)
    {
      int i = 0;
      int k;
      for (int j = 0;; j++)
      {
        k = i;
        if (j >= p.d.size()) {
          break;
        }
        paramBundle = (a.a)p.d.get(j);
        paramString = p.i;
        if (paramBundle.a()) {
          return;
        }
      }
      while (k < p.e.size())
      {
        paramBundle = (a.a)p.e.get(k);
        paramString = p.i;
        if (paramBundle.a()) {
          return;
        }
        k++;
      }
    }
  }
  
  public final void O(String paramString, Bundle paramBundle)
  {
    paramBundle = p;
    if ((i != null) && (g.containsKey(paramString)))
    {
      paramBundle = (a.c)p.g.get(paramString);
      paramString = p.i;
      paramBundle.a();
      p.c();
    }
  }
  
  public final void P()
  {
    if (a.a(p, 64L)) {
      p.i.N();
    }
  }
  
  public final boolean Q(Intent paramIntent)
  {
    p.getClass();
    boolean bool;
    if (super.Q(paramIntent)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void U()
  {
    if (a.a(p, 2L)) {
      p.i.pause();
    }
  }
  
  public final void V()
  {
    if (a.a(p, 4L))
    {
      if (p.i.d() == 1)
      {
        p.getClass();
        p.i.a();
      }
      else if (p.i.d() == 4)
      {
        localf1 = p.i;
        localf1.j(localf1.F(), -9223372036854775807L);
      }
      f1 localf1 = p.i;
      localf1.getClass();
      localf1.b();
    }
  }
  
  public final void e0(f1 paramf1, f1.b paramb)
  {
    boolean bool = a.a.get(11);
    int i = 1;
    int k;
    if (bool)
    {
      if (f != paramf1.F())
      {
        p.getClass();
        j = 1;
      }
      else
      {
        j = 0;
      }
      k = 1;
    }
    else
    {
      j = 0;
      k = j;
    }
    int m = j;
    int j = k;
    if (a.a.get(0))
    {
      j = paramf1.J().o();
      m = paramf1.F();
      p.getClass();
      if ((o != j) || (f != m)) {
        k = 1;
      }
      o = j;
      m = 1;
      j = k;
    }
    f = paramf1.F();
    if (paramb.a(new int[] { 4, 5, 7, 8, 12 })) {
      j = 1;
    }
    if (paramb.a(new int[] { 9 }))
    {
      p.getClass();
      j = i;
    }
    if (j != 0) {
      p.c();
    }
    if (m != 0) {
      p.b();
    }
  }
  
  public final void f0(String paramString, Bundle paramBundle)
  {
    p.getClass();
  }
  
  public final void h0(String paramString, Bundle paramBundle)
  {
    p.getClass();
  }
  
  public final void j0(Uri paramUri, Bundle paramBundle)
  {
    p.getClass();
  }
  
  public final void n0()
  {
    p.getClass();
  }
  
  public final void o0(String paramString, Bundle paramBundle)
  {
    p.getClass();
  }
  
  public final void q0(String paramString, Bundle paramBundle)
  {
    p.getClass();
  }
  
  public final void r0(Uri paramUri, Bundle paramBundle)
  {
    p.getClass();
  }
  
  public final void s0(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    p.getClass();
  }
  
  public final void t0()
  {
    if (a.a(p, 8L)) {
      p.i.O();
    }
  }
  
  public final void u0(long paramLong)
  {
    if (a.a(p, 256L))
    {
      f1 localf1 = p.i;
      localf1.j(localf1.F(), paramLong);
    }
  }
  
  public final void v0(boolean paramBoolean)
  {
    p.getClass();
  }
  
  public final void w0(float paramFloat)
  {
    if ((a.a(p, 4194304L)) && (paramFloat > 0.0F))
    {
      f1 localf1 = p.i;
      localf1.c(new e1(paramFloat, fb));
    }
  }
  
  public final void x0(RatingCompat paramRatingCompat)
  {
    p.getClass();
  }
  
  public final void y0(RatingCompat paramRatingCompat, Bundle paramBundle)
  {
    p.getClass();
  }
  
  public final void z0(int paramInt)
  {
    if (a.a(p, 262144L))
    {
      int i = 2;
      int j;
      if (paramInt != 1)
      {
        j = i;
        if (paramInt != 2)
        {
          j = i;
          if (paramInt != 3) {
            j = 0;
          }
        }
      }
      else
      {
        j = 1;
      }
      p.i.u(j);
    }
  }
}

/* Location:
 * Qualified Name:     b4.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
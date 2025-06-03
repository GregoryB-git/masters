package h5;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.util.List;
import o7.l0;
import v3.d0.b;
import v3.i0;
import v5.e0;
import v5.p;

public final class n
  extends v3.f
  implements Handler.Callback
{
  public boolean A;
  public int B;
  public i0 C;
  public h D;
  public k E;
  public l F;
  public l G;
  public int H;
  public long I;
  public long J;
  public long K;
  public final Handler u;
  public final m v;
  public final j w;
  public final l3.l x;
  public boolean y;
  public boolean z;
  
  public n(d0.b paramb, Looper paramLooper)
  {
    super(3);
    v = paramb;
    if (paramLooper == null)
    {
      paramb = null;
    }
    else
    {
      int i = e0.a;
      paramb = new Handler(paramLooper, this);
    }
    u = paramb;
    w = locala;
    x = new l3.l(1);
    I = -9223372036854775807L;
    J = -9223372036854775807L;
    K = -9223372036854775807L;
  }
  
  public final void B()
  {
    C = null;
    I = -9223372036854775807L;
    J();
    J = -9223372036854775807L;
    K = -9223372036854775807L;
    O();
    h localh = D;
    localh.getClass();
    localh.release();
    D = null;
    B = 0;
  }
  
  public final void D(long paramLong, boolean paramBoolean)
  {
    K = paramLong;
    J();
    y = false;
    z = false;
    I = -9223372036854775807L;
    h localh;
    if (B != 0)
    {
      O();
      localh = D;
      localh.getClass();
      localh.release();
      D = null;
      B = 0;
      N();
    }
    else
    {
      O();
      localh = D;
      localh.getClass();
      localh.flush();
    }
  }
  
  public final void H(i0[] paramArrayOfi0, long paramLong1, long paramLong2)
  {
    J = paramLong2;
    C = paramArrayOfi0[0];
    if (D != null) {
      B = 1;
    } else {
      N();
    }
  }
  
  public final void J()
  {
    Object localObject = l0.e;
    L(K);
    c localc = new c((List)localObject);
    localObject = u;
    if (localObject != null)
    {
      ((Handler)localObject).obtainMessage(0, localc).sendToTarget();
    }
    else
    {
      v.r(a);
      v.j(localc);
    }
  }
  
  public final long K()
  {
    int i = H;
    long l = Long.MAX_VALUE;
    if (i == -1) {
      return Long.MAX_VALUE;
    }
    F.getClass();
    if (H < F.i()) {
      l = F.g(H);
    }
    return l;
  }
  
  public final long L(long paramLong)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramLong != -9223372036854775807L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    x6.b.H(bool2);
    if (J != -9223372036854775807L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    x6.b.H(bool2);
    return paramLong - J;
  }
  
  public final void M(i parami)
  {
    StringBuilder localStringBuilder = f.l("Subtitle decoding failed. streamFormat=");
    localStringBuilder.append(C);
    v5.m.d("TextRenderer", localStringBuilder.toString(), parami);
    J();
    O();
    parami = D;
    parami.getClass();
    parami.release();
    D = null;
    B = 0;
    N();
  }
  
  public final void N()
  {
    A = true;
    Object localObject1 = w;
    Object localObject2 = C;
    localObject2.getClass();
    ((j.a)localObject1).getClass();
    localObject1 = t;
    if (localObject1 != null)
    {
      ((String)localObject1).hashCode();
      int i = -1;
      switch (((String)localObject1).hashCode())
      {
      default: 
        break;
      case 1693976202: 
        if (((String)localObject1).equals("application/ttml+xml")) {
          i = 11;
        }
        break;
      case 1668750253: 
        if (((String)localObject1).equals("application/x-subrip")) {
          i = 10;
        }
        break;
      case 1566016562: 
        if (((String)localObject1).equals("application/cea-708")) {
          i = 9;
        }
        break;
      case 1566015601: 
        if (((String)localObject1).equals("application/cea-608")) {
          i = 8;
        }
        break;
      case 1201784583: 
        if (((String)localObject1).equals("text/x-exoplayer-cues")) {
          i = 7;
        }
        break;
      case 930165504: 
        if (((String)localObject1).equals("application/x-mp4-cea-608")) {
          i = 6;
        }
        break;
      case 822864842: 
        if (((String)localObject1).equals("text/x-ssa")) {
          i = 5;
        }
        break;
      case 691401887: 
        if (((String)localObject1).equals("application/x-quicktime-tx3g")) {
          i = 4;
        }
        break;
      case -1004728940: 
        if (((String)localObject1).equals("text/vtt")) {
          i = 3;
        }
        break;
      case -1026075066: 
        if (((String)localObject1).equals("application/x-mp4-vtt")) {
          i = 2;
        }
        break;
      case -1248334819: 
        if (((String)localObject1).equals("application/pgs")) {
          i = 1;
        }
        break;
      case -1351681404: 
        if (((String)localObject1).equals("application/dvbsubs")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        break;
      case 11: 
        localObject2 = new o5.c();
        break;
      case 10: 
        localObject2 = new n5.a();
        break;
      case 9: 
        localObject2 = new i5.b(L, v);
        break;
      case 7: 
        localObject2 = new d();
        break;
      case 6: 
      case 8: 
        localObject2 = new i5.a((String)localObject1, L);
        break;
      case 5: 
        localObject2 = new m5.a(v);
        break;
      case 4: 
        localObject2 = new p5.a(v);
        break;
      case 3: 
        localObject2 = new q5.g();
        break;
      case 2: 
        localObject2 = new q5.a();
        break;
      case 1: 
        localObject2 = new k5.a();
        break;
      case 0: 
        localObject2 = new j5.a(v);
      }
      D = ((h)localObject2);
      return;
    }
    throw new IllegalArgumentException(g.d("Attempted to create decoder for unsupported MIME type: ", (String)localObject1));
  }
  
  public final void O()
  {
    E = null;
    H = -1;
    l locall = F;
    if (locall != null)
    {
      locall.o();
      F = null;
    }
    locall = G;
    if (locall != null)
    {
      locall.o();
      G = null;
    }
  }
  
  public final int a(i0 parami0)
  {
    ((j.a)w).getClass();
    String str = t;
    int i;
    if ((!"text/vtt".equals(str)) && (!"text/x-ssa".equals(str)) && (!"application/ttml+xml".equals(str)) && (!"application/x-mp4-vtt".equals(str)) && (!"application/x-subrip".equals(str)) && (!"application/x-quicktime-tx3g".equals(str)) && (!"application/cea-608".equals(str)) && (!"application/x-mp4-cea-608".equals(str)) && (!"application/cea-708".equals(str)) && (!"application/dvbsubs".equals(str)) && (!"application/pgs".equals(str)) && (!"text/x-exoplayer-cues".equals(str))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      if (O == 0) {
        i = 4;
      } else {
        i = 2;
      }
      return a0.j.b(i, 0, 0);
    }
    if (p.l(t)) {
      return a0.j.b(1, 0, 0);
    }
    return a0.j.b(0, 0, 0);
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean d()
  {
    return z;
  }
  
  public final String getName()
  {
    return "TextRenderer";
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    if (what == 0)
    {
      paramMessage = (c)obj;
      v.r(a);
      v.j(paramMessage);
      return true;
    }
    throw new IllegalStateException();
  }
  
  public final void p(long paramLong1, long paramLong2)
  {
    K = paramLong1;
    if (s)
    {
      paramLong2 = I;
      if ((paramLong2 != -9223372036854775807L) && (paramLong1 >= paramLong2))
      {
        O();
        z = true;
      }
    }
    if (z) {
      return;
    }
    if (G == null)
    {
      h localh = D;
      localh.getClass();
      localh.a(paramLong1);
      try
      {
        localh = D;
        localh.getClass();
        G = ((l)localh.b());
      }
      catch (i locali1)
      {
        M(locali1);
        return;
      }
    }
    if (f != 2) {
      return;
    }
    if (F != null)
    {
      paramLong2 = K();
      for (i = 0; paramLong2 <= paramLong1; i = 1)
      {
        H += 1;
        paramLong2 = K();
      }
    }
    int i = 0;
    Object localObject1 = G;
    int j = i;
    Object localObject2;
    if (localObject1 != null) {
      if (((z3.a)localObject1).m(4))
      {
        j = i;
        if (i == 0)
        {
          j = i;
          if (K() == Long.MAX_VALUE) {
            if (B == 2)
            {
              O();
              localObject1 = D;
              localObject1.getClass();
              ((z3.d)localObject1).release();
              D = null;
              B = 0;
              N();
              j = i;
            }
            else
            {
              O();
              z = true;
              j = i;
            }
          }
        }
      }
      else
      {
        j = i;
        if (b <= paramLong1)
        {
          localObject2 = F;
          if (localObject2 != null) {
            ((z3.h)localObject2).o();
          }
          H = ((l)localObject1).f(paramLong1);
          F = ((l)localObject1);
          G = null;
          j = 1;
        }
      }
    }
    if (j != 0)
    {
      F.getClass();
      i = F.f(paramLong1);
      if ((i != 0) && (F.i() != 0))
      {
        if (i == -1)
        {
          localObject1 = F;
          paramLong2 = ((l)localObject1).g(((l)localObject1).i() - 1);
        }
        else
        {
          paramLong2 = F.g(i - 1);
        }
      }
      else {
        paramLong2 = F.b;
      }
      L(paramLong2);
      localObject1 = new c(F.h(paramLong1));
      localObject2 = u;
      if (localObject2 != null)
      {
        ((Handler)localObject2).obtainMessage(0, localObject1).sendToTarget();
      }
      else
      {
        v.r(a);
        v.j((c)localObject1);
      }
    }
    if (B == 2) {
      return;
    }
    try
    {
      while (!y)
      {
        localObject2 = E;
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = D;
          localObject1.getClass();
          localObject1 = (k)((z3.d)localObject1).c();
          if (localObject1 == null) {
            return;
          }
          E = ((k)localObject1);
        }
        if (B == 1)
        {
          a = 4;
          localObject2 = D;
          localObject2.getClass();
          ((z3.d)localObject2).d((k)localObject1);
          E = null;
          B = 2;
          return;
        }
        i = I(x, (z3.g)localObject1, 0);
        if (i == -4)
        {
          if (((z3.a)localObject1).m(4))
          {
            y = true;
            A = false;
          }
          else
          {
            localObject2 = (i0)x.b;
            if (localObject2 == null) {
              return;
            }
            q = x;
            ((z3.g)localObject1).r();
            int k = A;
            if (!((z3.a)localObject1).m(1)) {
              i = 1;
            } else {
              i = 0;
            }
            A = (k & i);
          }
          if (!A)
          {
            localObject2 = D;
            localObject2.getClass();
            ((z3.d)localObject2).d((k)localObject1);
            E = null;
          }
        }
        else if (i == -3) {}
      }
    }
    catch (i locali2)
    {
      M(locali2);
    }
  }
}

/* Location:
 * Qualified Name:     h5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
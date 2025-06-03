package u0;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import d0.q;
import d0.x;
import g0.M;
import j0.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k0.Z0;
import k0.n;
import k0.v0;

public final class c
  extends n
  implements Handler.Callback
{
  public final a F;
  public final b G;
  public final Handler H;
  public final O0.b I;
  public final boolean J;
  public O0.a K;
  public boolean L;
  public boolean M;
  public long N;
  public x O;
  public long P;
  
  public c(b paramb, Looper paramLooper)
  {
    this(paramb, paramLooper, a.a);
  }
  
  public c(b paramb, Looper paramLooper, a parama)
  {
    this(paramb, paramLooper, parama, false);
  }
  
  public c(b paramb, Looper paramLooper, a parama, boolean paramBoolean)
  {
    super(5);
    G = ((b)g0.a.e(paramb));
    if (paramLooper == null) {
      paramb = null;
    } else {
      paramb = M.z(paramLooper, this);
    }
    H = paramb;
    F = ((a)g0.a.e(parama));
    J = paramBoolean;
    I = new O0.b();
    P = -9223372036854775807L;
  }
  
  public void T()
  {
    O = null;
    K = null;
    P = -9223372036854775807L;
  }
  
  public void W(long paramLong, boolean paramBoolean)
  {
    O = null;
    L = false;
    M = false;
  }
  
  public int a(q paramq)
  {
    if (F.a(paramq))
    {
      int i;
      if (K == 0) {
        i = 4;
      } else {
        i = 2;
      }
      return Z0.a(i);
    }
    return Z0.a(0);
  }
  
  public boolean c()
  {
    return M;
  }
  
  public void c0(q[] paramArrayOfq, long paramLong1, long paramLong2, x0.x.b paramb)
  {
    K = F.b(paramArrayOfq[0]);
    paramArrayOfq = O;
    if (paramArrayOfq != null) {
      O = paramArrayOfq.c(p + P - paramLong2);
    }
    P = paramLong2;
  }
  
  public String d()
  {
    return "MetadataRenderer";
  }
  
  public boolean e()
  {
    return true;
  }
  
  public void f(long paramLong1, long paramLong2)
  {
    for (boolean bool = true; bool; bool = l0(paramLong1)) {
      m0();
    }
  }
  
  public final void h0(x paramx, List paramList)
  {
    for (int i = 0; i < paramx.e(); i++)
    {
      Object localObject = paramx.d(i).s();
      if ((localObject != null) && (F.a((q)localObject)))
      {
        O0.a locala = F.b((q)localObject);
        localObject = (byte[])g0.a.e(paramx.d(i).M());
        I.m();
        I.z(localObject.length);
        ((ByteBuffer)M.i(I.r)).put((byte[])localObject);
        I.C();
        localObject = locala.a(I);
        if (localObject != null) {
          h0((x)localObject, paramList);
        }
      }
      else
      {
        paramList.add(paramx.d(i));
      }
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (what == 1)
    {
      k0((x)obj);
      return true;
    }
    throw new IllegalStateException();
  }
  
  public final long i0(long paramLong)
  {
    boolean bool1 = false;
    if (paramLong != -9223372036854775807L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    g0.a.f(bool2);
    boolean bool2 = bool1;
    if (P != -9223372036854775807L) {
      bool2 = true;
    }
    g0.a.f(bool2);
    return paramLong - P;
  }
  
  public final void j0(x paramx)
  {
    Handler localHandler = H;
    if (localHandler != null) {
      localHandler.obtainMessage(1, paramx).sendToTarget();
    } else {
      k0(paramx);
    }
  }
  
  public final void k0(x paramx)
  {
    G.x(paramx);
  }
  
  public final boolean l0(long paramLong)
  {
    x localx = O;
    boolean bool;
    if ((localx != null) && ((J) || (p <= i0(paramLong))))
    {
      j0(O);
      O = null;
      bool = true;
    }
    else
    {
      bool = false;
    }
    if ((L) && (O == null)) {
      M = true;
    }
    return bool;
  }
  
  public final void m0()
  {
    if ((!L) && (O == null))
    {
      I.m();
      Object localObject = N();
      int i = e0((v0)localObject, I, 0);
      if (i == -4)
      {
        if (I.p())
        {
          L = true;
        }
        else if (I.t >= P())
        {
          localObject = I;
          x = N;
          ((i)localObject).C();
          localObject = ((O0.a)M.i(K)).a(I);
          if (localObject != null)
          {
            ArrayList localArrayList = new ArrayList(((x)localObject).e());
            h0((x)localObject, localArrayList);
            if (!localArrayList.isEmpty()) {
              O = new x(i0(I.t), localArrayList);
            }
          }
        }
      }
      else if (i == -5) {
        N = eb)).s;
      }
    }
  }
}

/* Location:
 * Qualified Name:     u0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
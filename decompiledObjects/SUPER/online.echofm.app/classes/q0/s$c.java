package q0;

import F0.T;
import F0.T.a;
import Q0.b;
import d0.i;
import d0.q;
import d0.q.b;
import g0.M;
import g0.o;
import g0.z;
import java.io.EOFException;
import java.util.Arrays;

public class s$c
  implements T
{
  public static final q g = new q.b().o0("application/id3").K();
  public static final q h = new q.b().o0("application/x-emsg").K();
  public final b a = new b();
  public final T b;
  public final q c;
  public q d;
  public byte[] e;
  public int f;
  
  public s$c(T paramT, int paramInt)
  {
    b = paramT;
    if (paramInt != 1) {
      if (paramInt != 3) {}
    }
    for (paramT = h;; paramT = g)
    {
      c = paramT;
      break;
      paramT = new StringBuilder();
      paramT.append("Unknown metadataType: ");
      paramT.append(paramInt);
      throw new IllegalArgumentException(paramT.toString());
    }
    e = new byte[0];
    f = 0;
  }
  
  public void a(z paramz, int paramInt1, int paramInt2)
  {
    h(f + paramInt1);
    paramz.l(e, f, paramInt1);
    f += paramInt1;
  }
  
  public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
  {
    g0.a.e(d);
    Object localObject = i(paramInt2, paramInt3);
    if (!M.c(d.n, c.n))
    {
      if ("application/x-emsg".equals(d.n))
      {
        localObject = a.c((z)localObject);
        if (!g((Q0.a)localObject))
        {
          o.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[] { c.n, ((Q0.a)localObject).s() }));
          return;
        }
        localObject = new z((byte[])g0.a.e(((Q0.a)localObject).M()));
      }
    }
    else
    {
      paramInt2 = ((z)localObject).a();
      b.e((z)localObject, paramInt2);
      b.b(paramLong, paramInt1, paramInt2, 0, parama);
      return;
    }
    parama = new StringBuilder();
    parama.append("Ignoring sample for unsupported format: ");
    parama.append(d.n);
    o.h("HlsSampleStreamWrapper", parama.toString());
  }
  
  public int c(i parami, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    h(f + paramInt1);
    paramInt1 = parami.read(e, f, paramInt1);
    if (paramInt1 == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    f += paramInt1;
    return paramInt1;
  }
  
  public void d(q paramq)
  {
    d = paramq;
    b.d(c);
  }
  
  public final boolean g(Q0.a parama)
  {
    parama = parama.s();
    boolean bool;
    if ((parama != null) && (M.c(c.n, n))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void h(int paramInt)
  {
    byte[] arrayOfByte = e;
    if (arrayOfByte.length < paramInt) {
      e = Arrays.copyOf(arrayOfByte, paramInt + paramInt / 2);
    }
  }
  
  public final z i(int paramInt1, int paramInt2)
  {
    int i = f - paramInt2;
    z localz = new z(Arrays.copyOfRange(e, i - paramInt1, i));
    byte[] arrayOfByte = e;
    System.arraycopy(arrayOfByte, i, arrayOfByte, 0, paramInt2);
    f = paramInt2;
    return localz;
  }
}

/* Location:
 * Qualified Name:     q0.s.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
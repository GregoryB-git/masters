package e5;

import c4.v;
import c4.v.a;
import f;
import java.io.EOFException;
import java.util.Arrays;
import r4.a;
import r4.b;
import t5.h;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.m;
import v5.u;

public final class n$b
  implements v
{
  public static final i0 g;
  public static final i0 h;
  public final b a = new b();
  public final v b;
  public final i0 c;
  public i0 d;
  public byte[] e;
  public int f;
  
  static
  {
    i0.a locala = new i0.a();
    k = "application/id3";
    g = locala.a();
    locala = new i0.a();
    k = "application/x-emsg";
    h = locala.a();
  }
  
  public n$b(v paramv, int paramInt)
  {
    b = paramv;
    if (paramInt != 1)
    {
      if (paramInt == 3) {
        paramv = h;
      } else {
        throw new IllegalArgumentException(f.h("Unknown metadataType: ", paramInt));
      }
    }
    else {
      paramv = g;
    }
    c = paramv;
    e = new byte[0];
    f = 0;
  }
  
  public final void a(int paramInt, u paramu)
  {
    int i = f + paramInt;
    byte[] arrayOfByte = e;
    if (arrayOfByte.length < i) {
      e = Arrays.copyOf(arrayOfByte, i / 2 + i);
    }
    paramu.d(e, f, paramInt);
    f += paramInt;
  }
  
  public final void b(int paramInt, u paramu)
  {
    a(paramInt, paramu);
  }
  
  public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama)
  {
    d.getClass();
    int i = f - paramInt3;
    Object localObject1 = new u(Arrays.copyOfRange(e, i - paramInt2, i));
    Object localObject2 = e;
    System.arraycopy(localObject2, i, localObject2, 0, paramInt3);
    f = paramInt3;
    if (!e0.a(d.t, c.t))
    {
      if ("application/x-emsg".equals(d.t))
      {
        a.getClass();
        localObject1 = b.C((u)localObject1);
        localObject2 = ((a)localObject1).n();
        if ((localObject2 != null) && (e0.a(c.t, t))) {
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        }
        if (paramInt2 == 0)
        {
          m.f("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[] { c.t, ((a)localObject1).n() }));
          return;
        }
        localObject1 = ((a)localObject1).B();
        localObject1.getClass();
        localObject1 = new u((byte[])localObject1);
      }
    }
    else
    {
      paramInt2 = c - b;
      b.b(paramInt2, (u)localObject1);
      b.c(paramLong, paramInt1, paramInt2, paramInt3, parama);
      return;
    }
    parama = f.l("Ignoring sample for unsupported format: ");
    parama.append(d.t);
    m.f("HlsSampleStreamWrapper", parama.toString());
  }
  
  public final void d(i0 parami0)
  {
    d = parami0;
    b.d(c);
  }
  
  public final int e(h paramh, int paramInt, boolean paramBoolean)
  {
    return f(paramh, paramInt, paramBoolean);
  }
  
  public final int f(h paramh, int paramInt, boolean paramBoolean)
  {
    int i = f + paramInt;
    byte[] arrayOfByte = e;
    if (arrayOfByte.length < i) {
      e = Arrays.copyOf(arrayOfByte, i / 2 + i);
    }
    paramInt = paramh.read(e, f, paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    f += paramInt;
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     e5.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
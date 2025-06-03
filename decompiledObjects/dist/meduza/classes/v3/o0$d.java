package v3;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;
import o7.l0;
import o7.m0;
import o7.t;
import o7.t.b;
import o7.u;
import v5.e0;
import x6.b;

public final class o0$d
{
  public final UUID a;
  public final Uri b;
  public final u<String, String> c;
  public final boolean d;
  public final boolean e;
  public final boolean f;
  public final t<Integer> g;
  public final byte[] h;
  
  public o0$d(a parama)
  {
    boolean bool;
    if ((f) && (b == null)) {
      bool = false;
    } else {
      bool = true;
    }
    b.H(bool);
    UUID localUUID = a;
    localUUID.getClass();
    a = localUUID;
    b = b;
    c = c;
    d = d;
    f = f;
    e = e;
    g = g;
    parama = h;
    if (parama != null) {
      parama = Arrays.copyOf(parama, parama.length);
    } else {
      parama = null;
    }
    h = parama;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    if ((!a.equals(a)) || (!e0.a(b, b)) || (!e0.a(c, c)) || (d != d) || (f != f) || (e != e) || (!g.equals(g)) || (!Arrays.equals(h, h))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    Uri localUri = b;
    int j;
    if (localUri != null) {
      j = localUri.hashCode();
    } else {
      j = 0;
    }
    int k = c.hashCode();
    int m = d;
    int n = f;
    int i1 = e;
    int i2 = g.hashCode();
    return Arrays.hashCode(h) + (i2 + ((((k + (i * 31 + j) * 31) * 31 + m) * 31 + n) * 31 + i1) * 31) * 31;
  }
  
  public static final class a
  {
    public UUID a;
    public Uri b;
    public u<String, String> c;
    public boolean d;
    public boolean e;
    public boolean f;
    public t<Integer> g;
    public byte[] h;
    
    public a()
    {
      c = m0.o;
      t.b localb = t.b;
      g = l0.e;
    }
    
    public a(o0.d paramd)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
      g = g;
      h = h;
    }
  }
}

/* Location:
 * Qualified Name:     v3.o0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
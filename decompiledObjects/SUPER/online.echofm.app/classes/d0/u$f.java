package d0;

import X2.v;
import X2.w;
import android.net.Uri;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.UUID;

public final class u$f
{
  public static final String l = M.w0(0);
  public static final String m = M.w0(1);
  public static final String n = M.w0(2);
  public static final String o = M.w0(3);
  public static final String p = M.w0(4);
  public static final String q = M.w0(5);
  public static final String r = M.w0(6);
  public static final String s = M.w0(7);
  public final UUID a;
  public final UUID b;
  public final Uri c;
  public final w d;
  public final w e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final v i;
  public final v j;
  public final byte[] k;
  
  public u$f(a parama)
  {
    boolean bool;
    if ((a.g(parama)) && (a.e(parama) == null)) {
      bool = false;
    } else {
      bool = true;
    }
    a.f(bool);
    UUID localUUID = (UUID)a.e(a.f(parama));
    a = localUUID;
    b = localUUID;
    c = a.e(parama);
    d = a.h(parama);
    e = a.h(parama);
    f = a.a(parama);
    h = a.g(parama);
    g = a.b(parama);
    i = a.c(parama);
    j = a.c(parama);
    if (a.d(parama) != null) {
      parama = Arrays.copyOf(a.d(parama), a.d(parama).length);
    } else {
      parama = null;
    }
    k = parama;
  }
  
  public a b()
  {
    return new a(this, null);
  }
  
  public byte[] c()
  {
    byte[] arrayOfByte = k;
    if (arrayOfByte != null) {
      arrayOfByte = Arrays.copyOf(arrayOfByte, arrayOfByte.length);
    } else {
      arrayOfByte = null;
    }
    return arrayOfByte;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f)) {
      return false;
    }
    paramObject = (f)paramObject;
    if ((!a.equals(a)) || (!M.c(c, c)) || (!M.c(e, e)) || (f != f) || (h != h) || (g != g) || (!j.equals(j)) || (!Arrays.equals(k, k))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i1 = a.hashCode();
    Uri localUri = c;
    int i2;
    if (localUri != null) {
      i2 = localUri.hashCode();
    } else {
      i2 = 0;
    }
    return ((((((i1 * 31 + i2) * 31 + e.hashCode()) * 31 + f) * 31 + h) * 31 + g) * 31 + j.hashCode()) * 31 + Arrays.hashCode(k);
  }
  
  public static final class a
  {
    public UUID a;
    public Uri b;
    public w c;
    public boolean d;
    public boolean e;
    public boolean f;
    public v g;
    public byte[] h;
    
    public a()
    {
      c = w.j();
      e = true;
      g = v.Y();
    }
    
    public a(u.f paramf)
    {
      a = a;
      b = c;
      c = e;
      d = f;
      e = g;
      f = h;
      g = j;
      h = u.f.a(paramf);
    }
    
    public u.f i()
    {
      return new u.f(this, null);
    }
  }
}

/* Location:
 * Qualified Name:     d0.u.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
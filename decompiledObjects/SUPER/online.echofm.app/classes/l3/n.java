package l3;

import c3.y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import k3.c;
import k3.o;
import k3.t;
import p3.I;
import p3.u;
import p3.v;
import p3.x;
import r3.a;

public abstract class n
{
  public static final a a;
  public static final k3.k b;
  public static final k3.j c;
  public static final c d;
  public static final k3.b e;
  
  static
  {
    a locala = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
    a = locala;
    b = k3.k.a(new d3.j(), l.class, k3.p.class);
    c = k3.j.a(new d3.k(), locala, k3.p.class);
    d = c.a(new d3.l(), i.class, o.class);
    e = k3.b.a(new m(), locala, o.class);
  }
  
  public static i b(o paramo, y paramy)
  {
    if (paramo.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
      try
      {
        v localv = v.d0(paramo.g(), com.google.crypto.tink.shaded.protobuf.p.b());
        if (localv.b0() == 0)
        {
          l locall = l.a().c(localv.Z().size()).d(localv.a0().Z()).b(e(localv.a0().Y())).e(f(paramo.e())).a();
          return i.c().e(locall).d(r3.b.a(localv.Z().Y(), y.b(paramy))).c(paramo.c()).a();
        }
        paramo = new java/security/GeneralSecurityException;
        paramo.<init>("Only version 0 keys are accepted");
        throw paramo;
      }
      catch (A|IllegalArgumentException paramo)
      {
        throw new GeneralSecurityException("Parsing HmacKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
  }
  
  public static void c()
  {
    d(k3.i.a());
  }
  
  public static void d(k3.i parami)
  {
    parami.h(b);
    parami.g(c);
    parami.f(d);
    parami.e(e);
  }
  
  public static l.c e(u paramu)
  {
    int i = a.a[paramu.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i == 5) {
              return l.c.f;
            }
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Unable to parse HashType: ");
            localStringBuilder.append(paramu.g());
            throw new GeneralSecurityException(localStringBuilder.toString());
          }
          return l.c.e;
        }
        return l.c.d;
      }
      return l.c.c;
    }
    return l.c.b;
  }
  
  public static l.d f(I paramI)
  {
    int i = a.b[paramI.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            return l.d.e;
          }
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unable to parse OutputPrefixType: ");
          localStringBuilder.append(paramI.g());
          throw new GeneralSecurityException(localStringBuilder.toString());
        }
        return l.d.d;
      }
      return l.d.c;
    }
    return l.d.b;
  }
}

/* Location:
 * Qualified Name:     l3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
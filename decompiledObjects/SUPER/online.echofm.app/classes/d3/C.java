package d3;

import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import k3.c;
import k3.i;
import k3.o;
import k3.t;
import p3.I;
import p3.r;
import r3.a;

public abstract class C
{
  public static final a a;
  public static final k3.k b;
  public static final k3.j c;
  public static final c d;
  public static final k3.b e;
  
  static
  {
    a locala = t.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
    a = locala;
    b = k3.k.a(new j(), A.class, k3.p.class);
    c = k3.j.a(new k(), locala, k3.p.class);
    d = c.a(new l(), y.class, o.class);
    e = k3.b.a(new B(), locala, o.class);
  }
  
  public static y b(o paramo, c3.y paramy)
  {
    if (paramo.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
      try
      {
        r localr = r.a0(paramo.g(), com.google.crypto.tink.shaded.protobuf.p.b());
        if (localr.Y() == 0) {
          return y.a(e(paramo.e()), r3.b.a(localr.X().Y(), c3.y.b(paramy)), paramo.c());
        }
        paramo = new java/security/GeneralSecurityException;
        paramo.<init>("Only version 0 keys are accepted");
        throw paramo;
      }
      catch (com.google.crypto.tink.shaded.protobuf.A paramo)
      {
        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
  }
  
  public static void c()
  {
    d(i.a());
  }
  
  public static void d(i parami)
  {
    parami.h(b);
    parami.g(c);
    parami.f(d);
    parami.e(e);
  }
  
  public static A.a e(I paramI)
  {
    int i = a.a[paramI.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return A.a.d;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unable to parse OutputPrefixType: ");
        localStringBuilder.append(paramI.g());
        throw new GeneralSecurityException(localStringBuilder.toString());
      }
      return A.a.c;
    }
    return A.a.b;
  }
}

/* Location:
 * Qualified Name:     d3.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
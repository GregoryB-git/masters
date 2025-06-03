package d3;

import c3.y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import k3.c;
import k3.i;
import k3.o;
import k3.t;
import r3.a;

public abstract class K
{
  public static final a a;
  public static final k3.k b;
  public static final k3.j c;
  public static final c d;
  public static final k3.b e;
  
  static
  {
    a locala = t.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    a = locala;
    b = k3.k.a(new j(), I.class, k3.p.class);
    c = k3.j.a(new k(), locala, k3.p.class);
    d = c.a(new l(), G.class, o.class);
    e = k3.b.a(new J(), locala, o.class);
  }
  
  public static G b(o paramo, y paramy)
  {
    if (paramo.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
      try
      {
        p3.K localK = p3.K.a0(paramo.g(), com.google.crypto.tink.shaded.protobuf.p.b());
        if (localK.Y() == 0) {
          return G.a(e(paramo.e()), r3.b.a(localK.X().Y(), y.b(paramy)), paramo.c());
        }
        paramo = new java/security/GeneralSecurityException;
        paramo.<init>("Only version 0 keys are accepted");
        throw paramo;
      }
      catch (A paramo)
      {
        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
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
  
  public static I.a e(p3.I paramI)
  {
    int i = a.a[paramI.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return I.a.d;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unable to parse OutputPrefixType: ");
        localStringBuilder.append(paramI.g());
        throw new GeneralSecurityException(localStringBuilder.toString());
      }
      return I.a.c;
    }
    return I.a.b;
  }
}

/* Location:
 * Qualified Name:     d3.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
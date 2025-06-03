package d3;

import c3.y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import k3.c;
import k3.o;
import k3.t;
import p3.I;
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
    a locala = t.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
    a = locala;
    b = k3.k.a(new j(), i.class, k3.p.class);
    c = k3.j.a(new k(), locala, k3.p.class);
    d = c.a(new l(), g.class, o.class);
    e = k3.b.a(new m(), locala, o.class);
  }
  
  public static g b(o paramo, y paramy)
  {
    if (paramo.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
      try
      {
        p3.i locali = p3.i.c0(paramo.g(), com.google.crypto.tink.shaded.protobuf.p.b());
        if (locali.a0() == 0)
        {
          i locali1 = i.a().c(locali.Y().size()).b(locali.Z().X()).d(16).e(e(paramo.e())).a();
          return g.a().e(locali1).d(r3.b.a(locali.Y().Y(), y.b(paramy))).c(paramo.c()).a();
        }
        paramo = new java/security/GeneralSecurityException;
        paramo.<init>("Only version 0 keys are accepted");
        throw paramo;
      }
      catch (A paramo)
      {
        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
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
  
  public static i.c e(I paramI)
  {
    int i = a.a[paramI.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return i.c.d;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unable to parse OutputPrefixType: ");
        localStringBuilder.append(paramI.g());
        throw new GeneralSecurityException(localStringBuilder.toString());
      }
      return i.c.c;
    }
    return i.c.b;
  }
}

/* Location:
 * Qualified Name:     d3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
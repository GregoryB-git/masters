package d3;

import c3.y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import k3.c;
import k3.i;
import k3.o;
import p3.I;
import p3.n;
import r3.a;

public abstract class x
{
  public static final a a;
  public static final k3.k b;
  public static final k3.j c;
  public static final c d;
  public static final k3.b e;
  
  static
  {
    a locala = k3.t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
    a = locala;
    b = k3.k.a(new j(), v.class, k3.p.class);
    c = k3.j.a(new k(), locala, k3.p.class);
    d = c.a(new l(), t.class, o.class);
    e = k3.b.a(new w(), locala, o.class);
  }
  
  public static t b(o paramo, y paramy)
  {
    if (paramo.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
      try
      {
        n localn = n.a0(paramo.g(), com.google.crypto.tink.shaded.protobuf.p.b());
        if (localn.Y() == 0)
        {
          v localv = v.a().b(localn.X().size()).c(e(paramo.e())).a();
          return t.a().e(localv).d(r3.b.a(localn.X().Y(), y.b(paramy))).c(paramo.c()).a();
        }
        paramo = new java/security/GeneralSecurityException;
        paramo.<init>("Only version 0 keys are accepted");
        throw paramo;
      }
      catch (A paramo)
      {
        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
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
  
  public static v.c e(I paramI)
  {
    int i = a.a[paramI.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return v.c.d;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unable to parse OutputPrefixType: ");
        localStringBuilder.append(paramI.g());
        throw new GeneralSecurityException(localStringBuilder.toString());
      }
      return v.c.c;
    }
    return v.c.b;
  }
}

/* Location:
 * Qualified Name:     d3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
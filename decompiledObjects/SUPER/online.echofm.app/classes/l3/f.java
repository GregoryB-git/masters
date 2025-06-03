package l3;

import c3.y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import d3.l;
import java.security.GeneralSecurityException;
import k3.i;
import k3.o;
import k3.t;
import p3.I;

public abstract class f
{
  public static final r3.a a;
  public static final k3.k b;
  public static final k3.j c;
  public static final k3.c d;
  public static final k3.b e;
  
  static
  {
    r3.a locala = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
    a = locala;
    b = k3.k.a(new d3.j(), d.class, k3.p.class);
    c = k3.j.a(new d3.k(), locala, k3.p.class);
    d = k3.c.a(new l(), a.class, o.class);
    e = k3.b.a(new e(), locala, o.class);
  }
  
  public static a b(o paramo, y paramy)
  {
    if (paramo.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
      try
      {
        p3.a locala = p3.a.c0(paramo.g(), com.google.crypto.tink.shaded.protobuf.p.b());
        if (locala.a0() == 0)
        {
          d locald = d.a().b(locala.Y().size()).c(locala.Z().X()).d(e(paramo.e())).a();
          return a.c().e(locald).c(r3.b.a(locala.Y().Y(), y.b(paramy))).d(paramo.c()).a();
        }
        paramo = new java/security/GeneralSecurityException;
        paramo.<init>("Only version 0 keys are accepted");
        throw paramo;
      }
      catch (A|IllegalArgumentException paramo)
      {
        throw new GeneralSecurityException("Parsing AesCmacKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
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
  
  public static d.c e(I paramI)
  {
    int i = a.a[paramI.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            return d.c.e;
          }
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unable to parse OutputPrefixType: ");
          localStringBuilder.append(paramI.g());
          throw new GeneralSecurityException(localStringBuilder.toString());
        }
        return d.c.d;
      }
      return d.c.c;
    }
    return d.c.b;
  }
}

/* Location:
 * Qualified Name:     l3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
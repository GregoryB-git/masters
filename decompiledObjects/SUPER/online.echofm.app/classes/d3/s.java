package d3;

import c3.y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import k3.c;
import k3.i;
import k3.t;
import p3.I;
import r3.a;

public abstract class s
{
  public static final a a;
  public static final k3.k b;
  public static final k3.j c;
  public static final c d;
  public static final k3.b e;
  
  static
  {
    a locala = t.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
    a = locala;
    b = k3.k.a(new j(), q.class, k3.p.class);
    c = k3.j.a(new k(), locala, k3.p.class);
    d = c.a(new l(), o.class, k3.o.class);
    e = k3.b.a(new r(), locala, k3.o.class);
  }
  
  public static o b(k3.o paramo, y paramy)
  {
    if (paramo.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
      try
      {
        p3.l locall = p3.l.a0(paramo.g(), com.google.crypto.tink.shaded.protobuf.p.b());
        if (locall.Y() == 0)
        {
          q localq = q.a().c(locall.X().size()).b(12).d(16).e(e(paramo.e())).a();
          return o.a().e(localq).d(r3.b.a(locall.X().Y(), y.b(paramy))).c(paramo.c()).a();
        }
        paramo = new java/security/GeneralSecurityException;
        paramo.<init>("Only version 0 keys are accepted");
        throw paramo;
      }
      catch (A paramo)
      {
        throw new GeneralSecurityException("Parsing AesGcmKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
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
  
  public static q.c e(I paramI)
  {
    int i = a.a[paramI.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return q.c.d;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Unable to parse OutputPrefixType: ");
        localStringBuilder.append(paramI.g());
        throw new GeneralSecurityException(localStringBuilder.toString());
      }
      return q.c.c;
    }
    return q.c.b;
  }
}

/* Location:
 * Qualified Name:     d3.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
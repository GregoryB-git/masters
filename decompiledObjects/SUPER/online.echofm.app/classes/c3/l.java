package c3;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x.a;
import p3.A;
import p3.A.b;
import p3.I;

public final class l
{
  public final A a;
  
  public l(A paramA)
  {
    a = paramA;
  }
  
  public static l a(String paramString, byte[] paramArrayOfByte, b paramb)
  {
    return new l((A)A.c0().z(paramString).A(h.i(paramArrayOfByte)).y(c(paramb)).n());
  }
  
  public static I c(b paramb)
  {
    int i = a.b[paramb.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            return I.t;
          }
          throw new IllegalArgumentException("Unknown output prefix type");
        }
        return I.s;
      }
      return I.r;
    }
    return I.q;
  }
  
  public A b()
  {
    return a;
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("TINK", 0);
      o = localb1;
      b localb2 = new b("LEGACY", 1);
      p = localb2;
      b localb3 = new b("RAW", 2);
      q = localb3;
      b localb4 = new b("CRUNCHY", 3);
      r = localb4;
      s = new b[] { localb1, localb2, localb3, localb4 };
    }
  }
}

/* Location:
 * Qualified Name:     c3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
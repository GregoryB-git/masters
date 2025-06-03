package eb;

import java.nio.charset.Charset;
import java.util.BitSet;
import p7.a;

public final class h0
{
  public static final Charset a = Charset.forName("US-ASCII");
  public static final a b = s0.e;
  
  public static s0.f a(String paramString, a parama)
  {
    boolean bool1 = paramString.isEmpty();
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (!bool1)
    {
      bool3 = bool2;
      if (paramString.charAt(0) == ':') {
        bool3 = true;
      }
    }
    BitSet localBitSet = s0.d.d;
    return new s0.f(paramString, bool3, parama);
  }
  
  public static abstract interface a<T>
    extends s0.g<T>
  {}
}

/* Location:
 * Qualified Name:     eb.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
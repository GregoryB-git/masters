package c5;

import V4.a;
import V4.g;
import Y4.b;
import java.util.Map;

public final class o
  implements g
{
  public final j a = new j();
  
  public b a(String paramString, a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == a.C) {
      return a.a("0".concat(String.valueOf(paramString)), a.v, paramInt1, paramInt2, paramMap);
    }
    throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(parama)));
  }
}

/* Location:
 * Qualified Name:     c5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
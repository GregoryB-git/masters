package b9;

import y8.b;
import y8.c;
import y8.g;

public final class h
  implements g
{
  public boolean a = false;
  public boolean b = false;
  public c c;
  public final e d;
  
  public h(e parame)
  {
    d = parame;
  }
  
  public final g f(String paramString)
  {
    if (!a)
    {
      a = true;
      d.f(c, paramString, b);
      return this;
    }
    throw new b("Cannot encode a second value in the ValueEncoderContext");
  }
  
  public final g g(boolean paramBoolean)
  {
    if (!a)
    {
      a = true;
      d.h(c, paramBoolean, b);
      return this;
    }
    throw new b("Cannot encode a second value in the ValueEncoderContext");
  }
}

/* Location:
 * Qualified Name:     b9.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
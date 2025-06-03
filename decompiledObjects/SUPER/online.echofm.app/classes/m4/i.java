package m4;

import j4.b;
import j4.c;
import j4.g;

public class i
  implements g
{
  public boolean a = false;
  public boolean b = false;
  public c c;
  public final f d;
  
  public i(f paramf)
  {
    d = paramf;
  }
  
  public final void a()
  {
    if (!a)
    {
      a = true;
      return;
    }
    throw new b("Cannot encode a second value in the ValueEncoderContext");
  }
  
  public void b(c paramc, boolean paramBoolean)
  {
    a = false;
    c = paramc;
    b = paramBoolean;
  }
  
  public g d(String paramString)
  {
    a();
    d.i(c, paramString, b);
    return this;
  }
  
  public g e(boolean paramBoolean)
  {
    a();
    d.o(c, paramBoolean, b);
    return this;
  }
}

/* Location:
 * Qualified Name:     m4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
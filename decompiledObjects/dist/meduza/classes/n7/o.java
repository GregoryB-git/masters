package n7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class o
{
  public final c a;
  public final boolean b;
  public final b c;
  public final int d;
  
  public o(b paramb, boolean paramBoolean, c.c paramc, int paramInt)
  {
    c = paramb;
    b = paramBoolean;
    a = paramc;
    d = paramInt;
  }
  
  public static o a(char paramChar)
  {
    return new o(new n(new c.b(paramChar)), false, c.d.b, Integer.MAX_VALUE);
  }
  
  public final List<String> b(CharSequence paramCharSequence)
  {
    paramCharSequence.getClass();
    Object localObject = (n)c;
    localObject.getClass();
    localObject = new m((n)localObject, this, paramCharSequence);
    paramCharSequence = new ArrayList();
    while (((b)localObject).hasNext()) {
      paramCharSequence.add((String)((b)localObject).next());
    }
    return Collections.unmodifiableList(paramCharSequence);
  }
  
  public static abstract class a
    extends b<String>
  {
    public final CharSequence c;
    public final c d;
    public final boolean e;
    public int f = 0;
    public int o;
    
    public a(o paramo, CharSequence paramCharSequence)
    {
      d = a;
      e = b;
      o = d;
      c = paramCharSequence;
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     n7.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
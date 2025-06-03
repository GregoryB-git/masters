package n6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public abstract class f
  extends e
{
  public static b a(Iterator paramIterator)
  {
    Intrinsics.checkNotNullParameter(paramIterator, "<this>");
    return c.b(new a(paramIterator));
  }
  
  public static b b(b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "<this>");
    if (!(paramb instanceof a)) {
      paramb = new a(paramb);
    }
    return paramb;
  }
  
  public static final class a
    implements b
  {
    public a(Iterator paramIterator) {}
    
    public Iterator iterator()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     n6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
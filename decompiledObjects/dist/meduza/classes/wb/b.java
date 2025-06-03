package wb;

import ub.e;
import ub.h;

public final class b
  implements e<Object>
{
  public static final b a = new b();
  
  public final h getContext()
  {
    throw new IllegalStateException("This continuation is already complete".toString());
  }
  
  public final void resumeWith(Object paramObject)
  {
    throw new IllegalStateException("This continuation is already complete".toString());
  }
  
  public final String toString()
  {
    return "This continuation is already complete";
  }
}

/* Location:
 * Qualified Name:     wb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
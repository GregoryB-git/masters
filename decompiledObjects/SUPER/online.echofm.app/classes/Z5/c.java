package Z5;

import X5.d;
import X5.g;

public final class c
  implements d
{
  public static final c o = new c();
  
  public g getContext()
  {
    throw new IllegalStateException("This continuation is already complete".toString());
  }
  
  public void resumeWith(Object paramObject)
  {
    throw new IllegalStateException("This continuation is already complete".toString());
  }
  
  public String toString()
  {
    return "This continuation is already complete";
  }
}

/* Location:
 * Qualified Name:     Z5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
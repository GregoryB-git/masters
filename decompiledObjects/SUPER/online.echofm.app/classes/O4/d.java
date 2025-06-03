package O4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d
{
  public static volatile d b;
  public final Set a = new HashSet();
  
  public static d a()
  {
    d locald1 = b;
    d locald2 = locald1;
    if (locald1 == null)
    {
      try
      {
        locald1 = b;
        locald2 = locald1;
        if (locald1 == null)
        {
          locald2 = new O4/d;
          locald2.<init>();
          b = locald2;
        }
      }
      finally
      {
        break label48;
      }
      return locald3;
      label48:
      throw locald3;
    }
    return locald3;
  }
  
  public Set b()
  {
    synchronized (a)
    {
      Set localSet2 = Collections.unmodifiableSet(a);
      return localSet2;
    }
  }
}

/* Location:
 * Qualified Name:     O4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package l0;

import java.util.Collection;
import java.util.LinkedHashSet;
import sb.y;

public final class a
{
  public static final LinkedHashSet a;
  
  static
  {
    int i = 0;
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(y.H0(2));
    while (i < 2)
    {
      localLinkedHashSet.add(new Integer[] { Integer.valueOf(7), Integer.valueOf(20) }[i]);
      i++;
    }
    a = localLinkedHashSet;
  }
}

/* Location:
 * Qualified Name:     l0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
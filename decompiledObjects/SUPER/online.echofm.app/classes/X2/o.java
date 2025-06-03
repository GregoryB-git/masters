package X2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public final class o
  extends P
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final Comparator[] o;
  
  public o(Comparator paramComparator1, Comparator paramComparator2)
  {
    o = new Comparator[] { paramComparator1, paramComparator2 };
  }
  
  public int compare(Object paramObject1, Object paramObject2)
  {
    for (int i = 0;; i++)
    {
      Comparator[] arrayOfComparator = o;
      if (i >= arrayOfComparator.length) {
        break;
      }
      int j = arrayOfComparator[i].compare(paramObject1, paramObject2);
      if (j != 0) {
        return j;
      }
    }
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof o))
    {
      paramObject = (o)paramObject;
      return Arrays.equals(o, o);
    }
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(o);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ordering.compound(");
    localStringBuilder.append(Arrays.toString(o));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     X2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
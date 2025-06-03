package S3;

import java.util.Comparator;

public class l
  implements Comparator
{
  public static l o = new l();
  
  public static l b(Class paramClass)
  {
    return o;
  }
  
  public int a(Comparable paramComparable1, Comparable paramComparable2)
  {
    return paramComparable1.compareTo(paramComparable2);
  }
}

/* Location:
 * Qualified Name:     S3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
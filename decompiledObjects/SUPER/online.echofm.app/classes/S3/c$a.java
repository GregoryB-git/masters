package S3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public abstract class c$a
{
  public static final a a = new b();
  
  public static c b(List paramList, Map paramMap, a parama, Comparator paramComparator)
  {
    if (paramList.size() < 25) {
      return a.U(paramList, paramMap, parama, paramComparator);
    }
    return k.M(paramList, paramMap, parama, paramComparator);
  }
  
  public static c c(Comparator paramComparator)
  {
    return new a(paramComparator);
  }
  
  public static c d(Map paramMap, Comparator paramComparator)
  {
    if (paramMap.size() < 25) {
      return a.X(paramMap, paramComparator);
    }
    return k.S(paramMap, paramComparator);
  }
  
  public static a e()
  {
    return a;
  }
  
  public static abstract interface a
  {
    public abstract Object a(Object paramObject);
  }
}

/* Location:
 * Qualified Name:     S3.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
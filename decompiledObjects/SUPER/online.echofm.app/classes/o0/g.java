package o0;

import java.util.Collections;
import java.util.List;

public class g
{
  public final String a;
  public final long b;
  public final List c;
  public final List d;
  public final e e;
  
  public g(String paramString, long paramLong, List paramList1, List paramList2)
  {
    this(paramString, paramLong, paramList1, paramList2, null);
  }
  
  public g(String paramString, long paramLong, List paramList1, List paramList2, e parame)
  {
    a = paramString;
    b = paramLong;
    c = Collections.unmodifiableList(paramList1);
    d = Collections.unmodifiableList(paramList2);
    e = parame;
  }
  
  public int a(int paramInt)
  {
    int i = c.size();
    for (int j = 0; j < i; j++) {
      if (c.get(j)).b == paramInt) {
        return j;
      }
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     o0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
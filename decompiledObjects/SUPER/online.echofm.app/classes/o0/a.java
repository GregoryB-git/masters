package o0;

import java.util.Collections;
import java.util.List;

public class a
{
  public final long a;
  public final int b;
  public final List c;
  public final List d;
  public final List e;
  public final List f;
  
  public a(long paramLong, int paramInt, List paramList1, List paramList2, List paramList3, List paramList4)
  {
    a = paramLong;
    b = paramInt;
    c = Collections.unmodifiableList(paramList1);
    d = Collections.unmodifiableList(paramList2);
    e = Collections.unmodifiableList(paramList3);
    f = Collections.unmodifiableList(paramList4);
  }
}

/* Location:
 * Qualified Name:     o0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
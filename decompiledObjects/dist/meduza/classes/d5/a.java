package d5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a
{
  public final int a;
  public final int b;
  public final List<j> c;
  public final List<e> d;
  public final List<e> e;
  public final List<e> f;
  
  public a(int paramInt1, int paramInt2, ArrayList paramArrayList, List paramList1, List paramList2, List paramList3)
  {
    a = paramInt1;
    b = paramInt2;
    c = Collections.unmodifiableList(paramArrayList);
    d = Collections.unmodifiableList(paramList1);
    e = Collections.unmodifiableList(paramList2);
    f = Collections.unmodifiableList(paramList3);
  }
}

/* Location:
 * Qualified Name:     d5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
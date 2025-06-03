package T3;

import java.util.Collections;
import java.util.List;

public class a
{
  public final List a;
  public final List b;
  
  public a(List paramList1, List paramList2)
  {
    if (paramList1.size() == paramList2.size() - 1)
    {
      a = paramList1;
      b = paramList2;
      return;
    }
    throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
  }
  
  public List a()
  {
    return Collections.unmodifiableList(b);
  }
  
  public List b()
  {
    return Collections.unmodifiableList(a);
  }
}

/* Location:
 * Qualified Name:     T3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
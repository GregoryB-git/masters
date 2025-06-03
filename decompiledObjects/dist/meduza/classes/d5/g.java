package d5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g
{
  public final String a;
  public final long b;
  public final List<a> c;
  public final List<f> d;
  
  public g() {}
  
  public g(String paramString, long paramLong, ArrayList paramArrayList, List paramList)
  {
    a = paramString;
    b = paramLong;
    c = Collections.unmodifiableList(paramArrayList);
    d = Collections.unmodifiableList(paramList);
  }
}

/* Location:
 * Qualified Name:     d5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
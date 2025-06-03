package X2;

import W2.s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class J$b
  implements s, Serializable
{
  public final int o;
  
  public J$b(int paramInt)
  {
    o = i.b(paramInt, "expectedValuesPerKey");
  }
  
  public List a()
  {
    return new ArrayList(o);
  }
}

/* Location:
 * Qualified Name:     X2.J.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
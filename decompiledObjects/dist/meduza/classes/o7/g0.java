package o7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import n7.q;
import p2.m0;

public final class g0<V>
  implements q<List<V>>, Serializable
{
  public final int a;
  
  public g0(int paramInt)
  {
    m0.o(paramInt, "expectedValuesPerKey");
    a = paramInt;
  }
  
  public final Object get()
  {
    return new ArrayList(a);
  }
}

/* Location:
 * Qualified Name:     o7.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
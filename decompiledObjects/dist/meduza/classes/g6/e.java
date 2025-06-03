package g6;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class e
  implements Comparator
{
  public final int compare(Object paramObject1, Object paramObject2)
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      paramObject1 = (Scope)paramObject1;
      paramObject2 = (Scope)paramObject2;
      return b.compareTo(b);
    }
    paramObject1 = (Long)paramObject1;
    paramObject2 = (Long)paramObject2;
    return Long.compare(((Long)paramObject1).longValue(), ((Long)paramObject2).longValue());
  }
}

/* Location:
 * Qualified Name:     g6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
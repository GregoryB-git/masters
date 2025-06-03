package sb;

import ec.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import rb.d;
import x6.b;

public class y
  extends b
{
  public static final int H0(int paramInt)
  {
    if (paramInt >= 0) {
      if (paramInt < 3) {
        paramInt++;
      } else if (paramInt < 1073741824) {
        paramInt = (int)(paramInt / 0.75F + 1.0F);
      } else {
        paramInt = Integer.MAX_VALUE;
      }
    }
    return paramInt;
  }
  
  public static final <K, V> Map<K, V> I0(d<? extends K, ? extends V> paramd)
  {
    i.e(paramd, "pair");
    paramd = Collections.singletonMap(a, b);
    i.d(paramd, "singletonMap(...)");
    return paramd;
  }
  
  public static final Map J0(LinkedHashMap paramLinkedHashMap)
  {
    paramLinkedHashMap = (Map.Entry)paramLinkedHashMap.entrySet().iterator().next();
    paramLinkedHashMap = Collections.singletonMap(paramLinkedHashMap.getKey(), paramLinkedHashMap.getValue());
    i.d(paramLinkedHashMap, "with(...)");
    return paramLinkedHashMap;
  }
}

/* Location:
 * Qualified Name:     sb.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
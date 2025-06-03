package i9;

import j9.h;
import j9.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import t8.c;

public final class g
{
  public final int a;
  public final c<i, j9.g> b;
  
  public g(int paramInt, c<i, j9.g> paramc)
  {
    a = paramInt;
    b = paramc;
  }
  
  public static g a(int paramInt, HashMap paramHashMap)
  {
    Object localObject = h.a;
    Iterator localIterator = paramHashMap.entrySet().iterator();
    for (paramHashMap = (HashMap)localObject; localIterator.hasNext(); paramHashMap = paramHashMap.n((i)((Map.Entry)localObject).getKey(), getValuea)) {
      localObject = (Map.Entry)localIterator.next();
    }
    return new g(paramInt, paramHashMap);
  }
}

/* Location:
 * Qualified Name:     i9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
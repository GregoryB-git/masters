package R2;

import java.util.EnumMap;

public final class l
{
  public final EnumMap a;
  
  public l()
  {
    a = new EnumMap(q3.a.class);
  }
  
  public l(EnumMap paramEnumMap)
  {
    EnumMap localEnumMap = new EnumMap(q3.a.class);
    a = localEnumMap;
    localEnumMap.putAll(paramEnumMap);
  }
  
  public static l b(String paramString)
  {
    EnumMap localEnumMap = new EnumMap(q3.a.class);
    if (paramString.length() >= q3.a.values().length)
    {
      int i = 0;
      if (paramString.charAt(0) == '1')
      {
        q3.a[] arrayOfa = q3.a.values();
        int j = arrayOfa.length;
        for (int k = 1; i < j; k++)
        {
          localEnumMap.put(arrayOfa[i], k.e(paramString.charAt(k)));
          i++;
        }
        return new l(localEnumMap);
      }
    }
    return new l();
  }
  
  public final k a(q3.a parama)
  {
    k localk = (k)a.get(parama);
    parama = localk;
    if (localk == null) {
      parama = k.p;
    }
    return parama;
  }
  
  public final void c(q3.a parama, int paramInt)
  {
    k localk = k.p;
    if (paramInt != -20) {
      if (paramInt != -10)
      {
        if (paramInt != 0)
        {
          if (paramInt != 30) {
            break label47;
          }
          localk = k.t;
          break label47;
        }
      }
      else
      {
        localk = k.s;
        break label47;
      }
    }
    localk = k.u;
    label47:
    a.put(parama, localk);
  }
  
  public final void d(q3.a parama, k paramk)
  {
    a.put(parama, paramk);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("1");
    for (Object localObject : q3.a.values())
    {
      k localk = (k)a.get(localObject);
      localObject = localk;
      if (localk == null) {
        localObject = k.p;
      }
      localStringBuilder.append(k.c((k)localObject));
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     R2.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
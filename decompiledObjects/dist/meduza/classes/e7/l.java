package e7;

import java.util.EnumMap;

public final class l
{
  public final EnumMap<e3.a, k> a;
  
  public l()
  {
    a = new EnumMap(e3.a.class);
  }
  
  public l(EnumMap<e3.a, k> paramEnumMap)
  {
    EnumMap localEnumMap = new EnumMap(e3.a.class);
    a = localEnumMap;
    localEnumMap.putAll(paramEnumMap);
  }
  
  public final void a(e3.a parama, int paramInt)
  {
    k localk = k.b;
    if (paramInt != -30)
    {
      if (paramInt != -20) {
        if (paramInt != -10)
        {
          if (paramInt != 0)
          {
            if (paramInt != 30) {
              break label60;
            }
            localk = k.f;
            break label60;
          }
        }
        else
        {
          localk = k.e;
          break label60;
        }
      }
      localk = k.o;
    }
    else
    {
      localk = k.p;
    }
    label60:
    a.put(parama, localk);
  }
  
  public final void b(e3.a parama, k paramk)
  {
    a.put(parama, paramk);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("1");
    for (Object localObject : e3.a.values())
    {
      k localk = (k)a.get(localObject);
      localObject = localk;
      if (localk == null) {
        localObject = k.b;
      }
      localStringBuilder.append(a);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     e7.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
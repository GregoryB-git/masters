package eb;

import java.util.concurrent.ConcurrentHashMap;

public final class m
{
  public static final m b = new m(new l[] { new j.a(), j.b.a });
  public final ConcurrentHashMap a = new ConcurrentHashMap();
  
  public m(l... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      l locall = paramVarArgs[j];
      a.put(locall.a(), locall);
    }
  }
}

/* Location:
 * Qualified Name:     eb.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
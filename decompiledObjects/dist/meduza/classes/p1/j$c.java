package p1;

import android.util.Log;
import ec.i;
import f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import q1.b;

public final class j$c
{
  public final LinkedHashMap a = new LinkedHashMap();
  
  public final void a(b... paramVarArgs)
  {
    i.e(paramVarArgs, "migrations");
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      b localb = paramVarArgs[j];
      int k = a;
      int m = b;
      LinkedHashMap localLinkedHashMap = a;
      Integer localInteger = Integer.valueOf(k);
      Object localObject1 = localLinkedHashMap.get(localInteger);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new TreeMap();
        localLinkedHashMap.put(localInteger, localObject2);
      }
      localObject1 = (TreeMap)localObject2;
      if (((Map)localObject1).containsKey(Integer.valueOf(m)))
      {
        localObject2 = f.l("Overriding migration ");
        ((StringBuilder)localObject2).append(((TreeMap)localObject1).get(Integer.valueOf(m)));
        ((StringBuilder)localObject2).append(" with ");
        ((StringBuilder)localObject2).append(localb);
        Log.w("ROOM", ((StringBuilder)localObject2).toString());
      }
      ((Map)localObject1).put(Integer.valueOf(m), localb);
    }
  }
}

/* Location:
 * Qualified Name:     p1.j.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
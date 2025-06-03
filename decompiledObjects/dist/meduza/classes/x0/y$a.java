package x0;

import android.util.Log;
import d.b;
import g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public final class y$a
  implements b<Map<String, Boolean>>
{
  public y$a(y paramy) {}
  
  public final void a(Object paramObject)
  {
    Object localObject1 = (Map)paramObject;
    paramObject = (String[])((Map)localObject1).keySet().toArray(new String[0]);
    Object localObject2 = new ArrayList(((Map)localObject1).values());
    localObject1 = new int[((ArrayList)localObject2).size()];
    for (int i = 0; i < ((ArrayList)localObject2).size(); i++)
    {
      int j;
      if (((Boolean)((ArrayList)localObject2).get(i)).booleanValue()) {
        j = 0;
      } else {
        j = -1;
      }
      localObject1[i] = j;
    }
    Object localObject3 = (y.k)a.F.pollFirst();
    if (localObject3 == null)
    {
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("No permissions were requested for ");
      ((StringBuilder)paramObject).append(this);
    }
    else
    {
      localObject2 = a;
      i = b;
      localObject3 = a.c.d((String)localObject2);
      if (localObject3 != null) {
        break label188;
      }
      paramObject = g.g("Permission request result delivered for unknown Fragment ", (String)localObject2);
    }
    Log.w("FragmentManager", ((StringBuilder)paramObject).toString());
    return;
    label188:
    ((i)localObject3).onRequestPermissionsResult(i, (String[])paramObject, (int[])localObject1);
  }
}

/* Location:
 * Qualified Name:     x0.y.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
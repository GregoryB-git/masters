package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class n$b
  implements b
{
  public n$b(n paramn) {}
  
  public void b(Map paramMap)
  {
    String[] arrayOfString = (String[])paramMap.keySet().toArray(new String[0]);
    Object localObject1 = new ArrayList(paramMap.values());
    paramMap = new int[((ArrayList)localObject1).size()];
    for (int i = 0; i < ((ArrayList)localObject1).size(); i++)
    {
      int j;
      if (((Boolean)((ArrayList)localObject1).get(i)).booleanValue()) {
        j = 0;
      } else {
        j = -1;
      }
      paramMap[i] = j;
    }
    Object localObject2 = (n.m)a.C.pollFirst();
    if (localObject2 == null)
    {
      paramMap = new StringBuilder();
      paramMap.append("No permissions were requested for ");
      paramMap.append(this);
    }
    for (;;)
    {
      Log.w("FragmentManager", paramMap.toString());
      return;
      localObject1 = o;
      i = p;
      localObject2 = n.c(a).i((String)localObject1);
      if (localObject2 != null) {
        break;
      }
      paramMap = new StringBuilder();
      paramMap.append("Permission request result delivered for unknown Fragment ");
      paramMap.append((String)localObject1);
    }
    ((Fragment)localObject2).G0(i, arrayOfString, paramMap);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
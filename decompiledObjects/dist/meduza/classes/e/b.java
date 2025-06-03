package e;

import android.content.Intent;
import b.j;
import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import rb.d;
import sb.m;
import sb.t;
import sb.y;
import sb.z;

public final class b
  extends a<String[], Map<String, Boolean>>
{
  public final Intent a(j paramj, Object paramObject)
  {
    paramObject = (String[])paramObject;
    i.e(paramj, "context");
    i.e(paramObject, "input");
    paramj = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[])paramObject);
    i.d(paramj, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
    return paramj;
  }
  
  public final a.a b(j paramj, Object paramObject)
  {
    paramObject = (String[])paramObject;
    i.e(paramj, "context");
    i.e(paramObject, "input");
    int i = paramObject.length;
    int j = 1;
    int k = 0;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramj = new a.a(t.a);
    }
    else
    {
      int m = paramObject.length;
      int n;
      for (i = 0;; i++)
      {
        n = j;
        if (i >= m) {
          break;
        }
        if (v.a.checkSelfPermission(paramj, paramObject[i]) == 0) {
          n = 1;
        } else {
          n = 0;
        }
        if (n == 0)
        {
          n = 0;
          break;
        }
      }
      if (n != 0)
      {
        n = y.H0(paramObject.length);
        i = n;
        if (n < 16) {
          i = 16;
        }
        paramj = new LinkedHashMap(i);
        n = paramObject.length;
        for (i = k; i < n; i++) {
          paramj.put(paramObject[i], Boolean.TRUE);
        }
        paramj = new a.a(paramj);
      }
      else
      {
        paramj = null;
      }
    }
    return paramj;
  }
  
  public final Object c(int paramInt, Intent paramIntent)
  {
    if ((paramInt == -1) && (paramIntent != null))
    {
      Object localObject1 = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
      Object localObject2 = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
      if ((localObject2 != null) && (localObject1 != null))
      {
        paramIntent = new ArrayList(localObject2.length);
        int i = localObject2.length;
        int j = 0;
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          boolean bool;
          if (localObject2[paramInt] == 0) {
            bool = true;
          } else {
            bool = false;
          }
          paramIntent.add(Boolean.valueOf(bool));
        }
        localObject2 = new ArrayList();
        i = localObject1.length;
        for (paramInt = j; paramInt < i; paramInt++)
        {
          localObject3 = localObject1[paramInt];
          if (localObject3 != null) {
            ((ArrayList)localObject2).add(localObject3);
          }
        }
        localObject1 = ((ArrayList)localObject2).iterator();
        Object localObject3 = paramIntent.iterator();
        paramIntent = new ArrayList(Math.min(m.j((Iterable)localObject2), m.j(paramIntent)));
        while ((((Iterator)localObject1).hasNext()) && (((Iterator)localObject3).hasNext())) {
          paramIntent.add(new d(((Iterator)localObject1).next(), ((Iterator)localObject3).next()));
        }
        return z.L0(paramIntent);
      }
    }
    paramIntent = t.a;
    return paramIntent;
  }
}

/* Location:
 * Qualified Name:     e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
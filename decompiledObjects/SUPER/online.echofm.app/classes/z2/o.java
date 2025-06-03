package z2;

import V2.j;
import V2.k;
import android.support.v4.media.a;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import y2.b;

public final class o
{
  public final Map a = Collections.synchronizedMap(new WeakHashMap());
  public final Map b = Collections.synchronizedMap(new WeakHashMap());
  
  public final void b(k paramk, boolean paramBoolean)
  {
    b.put(paramk, Boolean.valueOf(paramBoolean));
    paramk.a().b(new n(this, paramk));
  }
  
  public final void c(int paramInt, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("The connection to Google Play services was lost");
    if (paramInt == 1) {}
    for (String str = " due to service disconnection.";; str = " due to dead object exception.")
    {
      localStringBuilder.append(str);
      break;
      if (paramInt != 3) {
        break;
      }
    }
    if (paramString != null)
    {
      localStringBuilder.append(" Last reason for disconnect: ");
      localStringBuilder.append(paramString);
    }
    f(true, new Status(20, localStringBuilder.toString()));
  }
  
  public final void d()
  {
    f(false, e.F);
  }
  
  public final boolean e()
  {
    return (!a.isEmpty()) || (!b.isEmpty());
  }
  
  public final void f(boolean paramBoolean, Status paramStatus)
  {
    synchronized (a)
    {
      Object localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>(a);
      synchronized (b)
      {
        ??? = new java/util/HashMap;
        ((HashMap)???).<init>(b);
        localObject2 = ((Map)localObject2).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ??? = (Map.Entry)((Iterator)localObject2).next();
          if ((paramBoolean) || (((Boolean)((Map.Entry)???).getValue()).booleanValue()))
          {
            a.a(((Map.Entry)???).getKey());
            throw null;
          }
        }
        ??? = ((Map)???).entrySet().iterator();
        while (((Iterator)???).hasNext())
        {
          ??? = (Map.Entry)((Iterator)???).next();
          if ((paramBoolean) || (((Boolean)((Map.Entry)???).getValue()).booleanValue())) {
            ((k)((Map.Entry)???).getKey()).d(new b(paramStatus));
          }
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     z2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package l6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import k6.b;

public final class u
{
  public final Map a = Collections.synchronizedMap(new WeakHashMap());
  public final Map b = Collections.synchronizedMap(new WeakHashMap());
  
  public final void a(Status paramStatus, boolean paramBoolean)
  {
    synchronized (a)
    {
      Object localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>(a);
      synchronized (b)
      {
        ??? = new java/util/HashMap;
        ((HashMap)???).<init>(b);
        ??? = ((HashMap)localObject2).entrySet().iterator();
        while (((Iterator)???).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)???).next();
          if ((paramBoolean) || (((Boolean)((Map.Entry)localObject2).getValue()).booleanValue())) {
            ((BasePendingResult)((Map.Entry)localObject2).getKey()).forceFailureUnlessReady(paramStatus);
          }
        }
        ??? = ((HashMap)???).entrySet().iterator();
        while (((Iterator)???).hasNext())
        {
          ??? = (Map.Entry)((Iterator)???).next();
          if ((paramBoolean) || (((Boolean)((Map.Entry)???).getValue()).booleanValue())) {
            ((TaskCompletionSource)((Map.Entry)???).getKey()).trySetException(new b(paramStatus));
          }
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     l6.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
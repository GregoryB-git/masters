package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class u
  implements t
{
  private final t a;
  
  public u(t paramt)
  {
    a = paramt;
  }
  
  public final JSONObject a(View paramView)
  {
    return aa.a(0, 0, 0, 0);
  }
  
  public final void a(View paramView, JSONObject paramJSONObject, s params, boolean paramBoolean)
  {
    paramView = new ArrayList();
    Object localObject1 = k.a();
    if (localObject1 != null)
    {
      Object localObject2 = ((k)localObject1).c();
      localObject1 = new IdentityHashMap((((Collection)localObject2).size() << 1) + 3);
      localObject2 = ((Collection)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        View localView = ((e)((Iterator)localObject2).next()).g();
        if ((localView != null) && (h.c(localView)))
        {
          localView = localView.getRootView();
          if ((localView != null) && (!((IdentityHashMap)localObject1).containsKey(localView)))
          {
            ((IdentityHashMap)localObject1).put(localView, localView);
            float f = h.a(localView);
            for (i = paramView.size(); (i > 0) && (h.a((View)paramView.get(i - 1)) > f); i--) {}
            paramView.add(i, localView);
          }
        }
      }
    }
    int j = paramView.size();
    int i = 0;
    while (i < j)
    {
      localObject1 = paramView.get(i);
      i++;
      params.a((View)localObject1, a, paramJSONObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

public final class x
  implements t
{
  private final int[] a = new int[2];
  
  public final JSONObject a(View paramView)
  {
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    paramView.getLocationOnScreen(a);
    paramView = a;
    return aa.a(paramView[0], paramView[1], i, j);
  }
  
  public final void a(View paramView, JSONObject paramJSONObject, s params, boolean paramBoolean)
  {
    if (!(paramView instanceof ViewGroup)) {
      return;
    }
    ViewGroup localViewGroup = (ViewGroup)paramView;
    int i = 0;
    if (paramBoolean)
    {
      HashMap localHashMap = new HashMap();
      Object localObject1;
      Object localObject2;
      for (i = 0; i < localViewGroup.getChildCount(); i++)
      {
        localObject1 = localViewGroup.getChildAt(i);
        localObject2 = (ArrayList)localHashMap.get(Float.valueOf(((View)localObject1).getZ()));
        paramView = (View)localObject2;
        if (localObject2 == null)
        {
          paramView = new ArrayList();
          localHashMap.put(Float.valueOf(((View)localObject1).getZ()), paramView);
        }
        paramView.add(localObject1);
      }
      paramView = new ArrayList(localHashMap.keySet());
      Collections.sort(paramView);
      int j = paramView.size();
      i = 0;
      if (i < j)
      {
        localObject2 = paramView.get(i);
        int k = i + 1;
        localObject1 = (ArrayList)localHashMap.get((Float)localObject2);
        int m = ((ArrayList)localObject1).size();
        int n = 0;
        for (;;)
        {
          i = k;
          if (n >= m) {
            break;
          }
          localObject2 = ((ArrayList)localObject1).get(n);
          n++;
          params.a((View)localObject2, this, paramJSONObject);
        }
      }
      return;
    }
    while (i < localViewGroup.getChildCount())
    {
      params.a(localViewGroup.getChildAt(i), this, paramJSONObject);
      i++;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
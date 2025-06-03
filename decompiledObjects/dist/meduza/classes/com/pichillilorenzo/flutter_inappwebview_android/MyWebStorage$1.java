package com.pichillilorenzo.flutter_inappwebview_android;

import android.webkit.ValueCallback;
import android.webkit.WebStorage.Origin;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MyWebStorage$1
  implements ValueCallback<Map>
{
  public void onReceiveValue(Map paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      WebStorage.Origin localOrigin = (WebStorage.Origin)paramMap.get(localIterator.next());
      HashMap localHashMap = new HashMap();
      localHashMap.put("origin", localOrigin.getOrigin());
      localHashMap.put("quota", Long.valueOf(localOrigin.getQuota()));
      localHashMap.put("usage", Long.valueOf(localOrigin.getUsage()));
      localArrayList.add(localHashMap);
    }
    val$result.success(localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
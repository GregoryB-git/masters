package io.flutter.plugins.firebase.dynamiclinks;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import w8.a;

public class Utils
{
  public static Map<String, Object> getExceptionDetails(Exception paramException)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("code", "unknown");
    if (paramException != null) {
      paramException = paramException.getMessage();
    } else {
      paramException = "An unknown error has occurred.";
    }
    localHashMap.put("message", paramException);
    return localHashMap;
  }
  
  public static Map<String, Object> getMapFromPendingDynamicLinkData(v8.c paramc)
  {
    Object localObject1 = null;
    if (paramc == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Object localObject2 = b;
    if (localObject2 != null)
    {
      localObject2 = b;
      if (localObject2 != null)
      {
        localObject2 = Uri.parse((String)localObject2);
        break label47;
      }
    }
    localObject2 = null;
    label47:
    if (localObject2 != null) {
      localObject1 = ((Uri)localObject2).toString();
    }
    localHashMap.put("link", localObject1);
    localObject1 = new HashMap();
    localObject2 = a;
    if (localObject2 == null) {
      localObject2 = new Bundle();
    } else {
      localObject2 = new Bundle((Bundle)c);
    }
    Iterator localIterator = ((BaseBundle)localObject2).keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localObject2 = a;
      if (localObject2 == null) {
        localObject2 = new Bundle();
      } else {
        localObject2 = new Bundle((Bundle)c);
      }
      ((HashMap)localObject1).put(str, ((BaseBundle)localObject2).get(str).toString());
    }
    localHashMap.put("utmParameters", localObject1);
    localObject2 = new HashMap();
    localObject1 = b;
    long l;
    if (localObject1 == null) {
      l = 0L;
    } else {
      l = d;
    }
    ((HashMap)localObject2).put("clickTimestamp", Long.valueOf(l));
    paramc = b;
    int i;
    if (paramc == null) {
      i = 0;
    } else {
      i = c;
    }
    ((HashMap)localObject2).put("minimumVersion", Integer.valueOf(i));
    localHashMap.put("android", localObject2);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.dynamiclinks.Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
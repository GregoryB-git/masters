package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import c2.b;
import c2.b.a;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProxySettings
  implements ISettings<b>
{
  public List<String> bypassRules = new ArrayList();
  public Boolean bypassSimpleHostnames = null;
  public List<String> directs = new ArrayList();
  public List<ProxyRuleExt> proxyRules = new ArrayList();
  public Boolean removeImplicitRules = null;
  public Boolean reverseBypassEnabled = Boolean.FALSE;
  
  public Map<String, Object> getRealSettings(b paramb)
  {
    Map localMap = toMap();
    ArrayList localArrayList = new ArrayList();
    paramb.getClass();
    Iterator localIterator = Collections.unmodifiableList(null).iterator();
    while (localIterator.hasNext())
    {
      b.a locala = (b.a)localIterator.next();
      HashMap localHashMap = new HashMap();
      localHashMap.put("url", b);
      localHashMap.put("schemeFilter", a);
      localArrayList.add(localHashMap);
    }
    paramb.getClass();
    localMap.put("bypassRules", Collections.unmodifiableList(null));
    localMap.put("proxyRules", localArrayList);
    paramb.getClass();
    localMap.put("reverseBypassEnabled", Boolean.valueOf(false));
    return localMap;
  }
  
  public ProxySettings parse(Map<String, Object> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject1 = (Map.Entry)paramMap.next();
      Object localObject2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      if (localObject1 != null)
      {
        localObject2.getClass();
        int i = -1;
        switch (((String)localObject2).hashCode())
        {
        default: 
          break;
        case 1670504874: 
          if (((String)localObject2).equals("directs")) {
            i = 5;
          }
          break;
        case 1021951215: 
          if (((String)localObject2).equals("bypassRules")) {
            i = 4;
          }
          break;
        case -940646418: 
          if (((String)localObject2).equals("removeImplicitRules")) {
            i = 3;
          }
          break;
        case -1033831049: 
          if (((String)localObject2).equals("reverseBypassEnabled")) {
            i = 2;
          }
          break;
        case -1872895191: 
          if (((String)localObject2).equals("proxyRules")) {
            i = 1;
          }
          break;
        case -2059288826: 
          if (((String)localObject2).equals("bypassSimpleHostnames")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 5: 
          directs = ((List)localObject1);
          break;
        case 4: 
          bypassRules = ((List)localObject1);
          break;
        case 3: 
          removeImplicitRules = ((Boolean)localObject1);
          break;
        case 2: 
          reverseBypassEnabled = ((Boolean)localObject1);
          break;
        case 1: 
          proxyRules = new ArrayList();
          localObject2 = ((List)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = ProxyRuleExt.fromMap((Map)((Iterator)localObject2).next());
            if (localObject1 != null) {
              proxyRules.add(localObject1);
            }
          }
        case 0: 
          bypassSimpleHostnames = ((Boolean)localObject1);
        }
      }
    }
    return this;
  }
  
  public Map<String, Object> toMap()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = proxyRules.iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(((ProxyRuleExt)((Iterator)localObject).next()).toMap());
    }
    localObject = new HashMap();
    ((HashMap)localObject).put("bypassRules", bypassRules);
    ((HashMap)localObject).put("directs", directs);
    ((HashMap)localObject).put("proxyRules", localArrayList);
    ((HashMap)localObject).put("bypassSimpleHostnames", bypassSimpleHostnames);
    ((HashMap)localObject).put("removeImplicitRules", removeImplicitRules);
    ((HashMap)localObject).put("reverseBypassEnabled", reverseBypassEnabled);
    return (Map<String, Object>)localObject;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxySettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
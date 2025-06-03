package com.pichillilorenzo.flutter_inappwebview_android.types;

import c2.j;
import f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import x6.b;

public class WebMessageCompatExt
{
  private Object data;
  private List<WebMessagePortCompatExt> ports;
  private int type;
  
  public WebMessageCompatExt(Object paramObject, int paramInt, List<WebMessagePortCompatExt> paramList)
  {
    data = paramObject;
    type = paramInt;
    ports = paramList;
  }
  
  public static WebMessageCompatExt fromMap(Map<String, Object> paramMap)
  {
    ArrayList localArrayList = null;
    if (paramMap == null) {
      return null;
    }
    Object localObject1 = paramMap.get("data");
    Integer localInteger = (Integer)paramMap.get("type");
    Object localObject2 = (List)paramMap.get("ports");
    paramMap = localArrayList;
    if (localObject2 != null)
    {
      paramMap = localArrayList;
      if (!((List)localObject2).isEmpty())
      {
        localArrayList = new ArrayList();
        localObject2 = ((List)localObject2).iterator();
        for (;;)
        {
          paramMap = localArrayList;
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          localArrayList.add(WebMessagePortCompatExt.fromMap((Map)((Iterator)localObject2).next()));
        }
      }
    }
    return new WebMessageCompatExt(localObject1, localInteger.intValue(), paramMap);
  }
  
  public static WebMessageCompatExt fromMapWebMessageCompat(j paramj)
  {
    Object localObject;
    if ((b.c0("WEB_MESSAGE_ARRAY_BUFFER")) && (d == 1))
    {
      paramj.a(1);
      Objects.requireNonNull(c);
      localObject = c;
    }
    else
    {
      paramj.a(0);
      localObject = b;
    }
    return new WebMessageCompatExt(localObject, d, null);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (WebMessageCompatExt)paramObject;
      if (type != type) {
        return false;
      }
      if (!Objects.equals(data, data)) {
        return false;
      }
      return Objects.equals(ports, ports);
    }
    return false;
  }
  
  public Object getData()
  {
    return data;
  }
  
  public List<WebMessagePortCompatExt> getPorts()
  {
    return ports;
  }
  
  public int getType()
  {
    return type;
  }
  
  public int hashCode()
  {
    Object localObject = data;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    int k = type;
    localObject = ports;
    if (localObject != null) {
      i = ((List)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public void setData(Object paramObject)
  {
    data = paramObject;
  }
  
  public void setPorts(List<WebMessagePortCompatExt> paramList)
  {
    ports = paramList;
  }
  
  public void setType(int paramInt)
  {
    type = paramInt;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("data", data);
    localHashMap.put("type", Integer.valueOf(type));
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("WebMessageCompatExt{data=");
    localStringBuilder.append(data);
    localStringBuilder.append(", type=");
    localStringBuilder.append(type);
    localStringBuilder.append(", ports=");
    localStringBuilder.append(ports);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
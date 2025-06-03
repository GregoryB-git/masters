package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebResourceError;
import c2.l;
import d2.c;
import d2.g0;
import d2.h0;
import d2.i0;
import d2.j0.a;
import f;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import x6.b;

public class WebResourceErrorExt
{
  private String description;
  private int type;
  
  public WebResourceErrorExt(int paramInt, String paramString)
  {
    type = paramInt;
    description = paramString;
  }
  
  public static WebResourceErrorExt fromWebResourceError(WebResourceError paramWebResourceError)
  {
    return new WebResourceErrorExt(paramWebResourceError.getErrorCode(), paramWebResourceError.getDescription().toString());
  }
  
  public static WebResourceErrorExt fromWebResourceError(l paraml)
  {
    Object localObject1;
    Object localObject2;
    int i;
    if (b.c0("WEB_RESOURCE_ERROR_GET_CODE"))
    {
      g0 localg0 = (g0)paraml;
      localg0.getClass();
      i0.o.getClass();
      if (a == null)
      {
        localObject1 = j0.a.a;
        localObject2 = Proxy.getInvocationHandler(b);
        a = ((WebResourceError)((WebkitToCompatConverterBoundaryInterface)b).convertWebResourceError((InvocationHandler)localObject2));
      }
      i = c.f(a);
    }
    else
    {
      i = -1;
    }
    if (b.c0("WEB_RESOURCE_ERROR_GET_DESCRIPTION"))
    {
      localObject1 = (g0)paraml;
      localObject1.getClass();
      i0.n.getClass();
      if (a == null)
      {
        localObject2 = j0.a.a;
        paraml = Proxy.getInvocationHandler(b);
        a = ((WebResourceError)((WebkitToCompatConverterBoundaryInterface)b).convertWebResourceError(paraml));
      }
      paraml = c.e(a).toString();
    }
    else
    {
      paraml = "";
    }
    return new WebResourceErrorExt(i, paraml);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (WebResourceErrorExt)paramObject;
      if (type != type) {
        return false;
      }
      return description.equals(description);
    }
    return false;
  }
  
  public String getDescription()
  {
    return description;
  }
  
  public int getType()
  {
    return type;
  }
  
  public int hashCode()
  {
    int i = type;
    return description.hashCode() + i * 31;
  }
  
  public void setDescription(String paramString)
  {
    description = paramString;
  }
  
  public void setType(int paramInt)
  {
    type = paramInt;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("type", Integer.valueOf(getType()));
    localHashMap.put("description", getDescription());
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("WebResourceErrorExt{type=");
    localStringBuilder.append(type);
    localStringBuilder.append(", description='");
    localStringBuilder.append(description);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
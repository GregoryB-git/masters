package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AFc1gSDK<Body>
  implements ResponseNetwork<Body>
{
  @NonNull
  private final Body AFInAppEventParameterName;
  @NonNull
  final Map<String, List<String>> AFInAppEventType;
  final boolean AFKeystoreWrapper;
  final int valueOf;
  @NonNull
  public final AFc1kSDK values;
  
  public AFc1gSDK(@NonNull Body paramBody, int paramInt, boolean paramBoolean, Map<String, List<String>> paramMap, @NonNull AFc1kSDK paramAFc1kSDK)
  {
    AFInAppEventParameterName = paramBody;
    valueOf = paramInt;
    AFKeystoreWrapper = paramBoolean;
    AFInAppEventType = new HashMap(paramMap);
    values = paramAFc1kSDK;
  }
  
  public final String AFInAppEventType(@NonNull String paramString)
  {
    paramString = getHeaderField(paramString);
    if ((paramString != null) && (!paramString.isEmpty()))
    {
      paramString = paramString.iterator();
      StringBuilder localStringBuilder = new StringBuilder((String)paramString.next());
      while (paramString.hasNext())
      {
        localStringBuilder.append(", ");
        localStringBuilder.append((String)paramString.next());
      }
      return localStringBuilder.toString();
    }
    return null;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (AFc1gSDK)paramObject;
      if (valueOf != valueOf) {
        return false;
      }
      if (AFKeystoreWrapper != AFKeystoreWrapper) {
        return false;
      }
      if (!AFInAppEventParameterName.equals(AFInAppEventParameterName)) {
        return false;
      }
      if (!AFInAppEventType.equals(AFInAppEventType)) {
        return false;
      }
      return values.equals(values);
    }
    return false;
  }
  
  @NonNull
  public Body getBody()
  {
    return (Body)AFInAppEventParameterName;
  }
  
  public List<String> getHeaderField(@NonNull String paramString)
  {
    Iterator localIterator = AFInAppEventType.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str != null) && (str.equalsIgnoreCase(paramString))) {
        return (List)AFInAppEventType.get(str);
      }
    }
    return null;
  }
  
  public int getStatusCode()
  {
    return valueOf;
  }
  
  public int hashCode()
  {
    return (((AFInAppEventParameterName.hashCode() * 31 + valueOf) * 31 + AFKeystoreWrapper) * 31 + AFInAppEventType.hashCode()) * 31 + values.hashCode();
  }
  
  public boolean isSuccessful()
  {
    return AFKeystoreWrapper;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1gSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
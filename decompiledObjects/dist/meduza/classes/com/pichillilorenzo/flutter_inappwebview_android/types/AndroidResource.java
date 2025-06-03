package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import android.content.Context;
import android.content.res.Resources;
import f;
import java.util.HashMap;
import java.util.Map;

public class AndroidResource
{
  private String defPackage;
  private String defType;
  private String name;
  
  public AndroidResource(String paramString1, String paramString2, String paramString3)
  {
    name = paramString1;
    defType = paramString2;
    defPackage = paramString3;
  }
  
  public static AndroidResource fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new AndroidResource((String)paramMap.get("name"), (String)paramMap.get("defType"), (String)paramMap.get("defPackage"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject = (AndroidResource)paramObject;
      if (!name.equals(name)) {
        return false;
      }
      paramObject = defType;
      if (paramObject != null ? !((String)paramObject).equals(defType) : defType != null) {
        return false;
      }
      paramObject = defPackage;
      localObject = defPackage;
      if (paramObject != null) {
        bool = ((String)paramObject).equals(localObject);
      } else if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String getDefPackage()
  {
    return defPackage;
  }
  
  public String getDefType()
  {
    return defType;
  }
  
  public int getIdentifier(Context paramContext)
  {
    return paramContext.getResources().getIdentifier(name, defType, defPackage);
  }
  
  public String getName()
  {
    return name;
  }
  
  public int hashCode()
  {
    int i = name.hashCode();
    String str = defType;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = defPackage;
    if (str != null) {
      j = str.hashCode();
    }
    return (i * 31 + k) * 31 + j;
  }
  
  public void setDefPackage(String paramString)
  {
    defPackage = paramString;
  }
  
  public void setDefType(String paramString)
  {
    defType = paramString;
  }
  
  public void setName(String paramString)
  {
    name = paramString;
  }
  
  public Map<String, Object> toMap()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("name", name);
    localHashMap.put("defType", defType);
    localHashMap.put("defPackage", defPackage);
    return localHashMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("AndroidResource{name='");
    j.s(localStringBuilder, name, '\'', ", type='");
    j.s(localStringBuilder, defType, '\'', ", defPackage='");
    localStringBuilder.append(defPackage);
    localStringBuilder.append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
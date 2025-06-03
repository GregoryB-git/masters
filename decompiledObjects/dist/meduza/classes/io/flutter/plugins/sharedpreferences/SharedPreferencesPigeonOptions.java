package io.flutter.plugins.sharedpreferences;

import ec.i;
import f;
import java.util.List;
import va.a;

public final class SharedPreferencesPigeonOptions
{
  public static final Companion Companion = new Companion(null);
  private final String fileKey;
  
  public SharedPreferencesPigeonOptions()
  {
    this(null, 1, null);
  }
  
  public SharedPreferencesPigeonOptions(String paramString)
  {
    fileKey = paramString;
  }
  
  public final String component1()
  {
    return fileKey;
  }
  
  public final SharedPreferencesPigeonOptions copy(String paramString)
  {
    return new SharedPreferencesPigeonOptions(paramString);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SharedPreferencesPigeonOptions)) {
      return false;
    }
    paramObject = (SharedPreferencesPigeonOptions)paramObject;
    return i.a(fileKey, fileKey);
  }
  
  public final String getFileKey()
  {
    return fileKey;
  }
  
  public int hashCode()
  {
    String str = fileKey;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    return i;
  }
  
  public final List<Object> toList()
  {
    return a.f(fileKey);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("SharedPreferencesPigeonOptions(fileKey=");
    localStringBuilder.append(fileKey);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public static final class Companion
  {
    public final SharedPreferencesPigeonOptions fromList(List<? extends Object> paramList)
    {
      i.e(paramList, "list");
      return new SharedPreferencesPigeonOptions((String)paramList.get(0));
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package io.flutter.plugin.common;

import io.flutter.Log;

public class ErrorLogResult
  implements MethodChannel.Result
{
  private int level;
  private String tag;
  
  public ErrorLogResult(String paramString)
  {
    this(paramString, Log.WARN);
  }
  
  public ErrorLogResult(String paramString, int paramInt)
  {
    tag = paramString;
    level = paramInt;
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    if (paramObject != null)
    {
      paramString1 = new StringBuilder();
      paramString1.append(" details: ");
      paramString1.append(paramObject);
      paramString1 = paramString1.toString();
    }
    else
    {
      paramString1 = "";
    }
    int i = level;
    if (i >= Log.WARN)
    {
      paramObject = tag;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString2);
      localStringBuilder.append(paramString1);
      Log.println(i, (String)paramObject, localStringBuilder.toString());
    }
  }
  
  public void notImplemented()
  {
    int i = level;
    if (i >= Log.WARN) {
      Log.println(i, tag, "method not implemented");
    }
  }
  
  public void success(Object paramObject) {}
}

/* Location:
 * Qualified Name:     io.flutter.plugin.common.ErrorLogResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
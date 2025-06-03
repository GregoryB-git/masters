package com.pichillilorenzo.flutter_inappwebview_android;

import java.util.Map;

public abstract interface ISettings<T>
{
  public abstract Map<String, Object> getRealSettings(T paramT);
  
  public abstract ISettings<T> parse(Map<String, Object> paramMap);
  
  public abstract Map<String, Object> toMap();
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.ISettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
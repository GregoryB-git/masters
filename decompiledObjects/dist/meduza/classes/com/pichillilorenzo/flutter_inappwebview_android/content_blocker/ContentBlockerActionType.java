package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import g;

public enum ContentBlockerActionType
{
  private final String value;
  
  private ContentBlockerActionType(String paramString)
  {
    value = paramString;
  }
  
  public static ContentBlockerActionType fromValue(String paramString)
  {
    for (ContentBlockerActionType localContentBlockerActionType : ) {
      if (paramString.equals(value)) {
        return localContentBlockerActionType;
      }
    }
    throw new IllegalArgumentException(g.d("No enum constant: ", paramString));
  }
  
  public boolean equalsValue(String paramString)
  {
    return value.equals(paramString);
  }
  
  public String toString()
  {
    return value;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
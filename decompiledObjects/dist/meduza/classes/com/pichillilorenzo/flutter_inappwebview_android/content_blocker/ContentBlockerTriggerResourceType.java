package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import g;

public enum ContentBlockerTriggerResourceType
{
  private final String value;
  
  static
  {
    SCRIPT = new ContentBlockerTriggerResourceType("SCRIPT", 3, "script");
    FONT = new ContentBlockerTriggerResourceType("FONT", 4, "font");
    SVG_DOCUMENT = new ContentBlockerTriggerResourceType("SVG_DOCUMENT", 5, "svg-document");
    MEDIA = new ContentBlockerTriggerResourceType("MEDIA", 6, "media");
    POPUP = new ContentBlockerTriggerResourceType("POPUP", 7, "popup");
    RAW = new ContentBlockerTriggerResourceType("RAW", 8, "raw");
  }
  
  private ContentBlockerTriggerResourceType(String paramString)
  {
    value = paramString;
  }
  
  public static ContentBlockerTriggerResourceType fromValue(String paramString)
  {
    for (ContentBlockerTriggerResourceType localContentBlockerTriggerResourceType : ) {
      if (paramString.equals(value)) {
        return localContentBlockerTriggerResourceType;
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
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTriggerResourceType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
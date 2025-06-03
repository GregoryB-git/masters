package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class XmlPullParserUtil
{
  @Nullable
  public static String getAttributeValue(XmlPullParser paramXmlPullParser, String paramString)
  {
    int i = paramXmlPullParser.getAttributeCount();
    for (int j = 0; j < i; j++) {
      if (paramXmlPullParser.getAttributeName(j).equals(paramString)) {
        return paramXmlPullParser.getAttributeValue(j);
      }
    }
    return null;
  }
  
  @Nullable
  public static String getAttributeValueIgnorePrefix(XmlPullParser paramXmlPullParser, String paramString)
  {
    int i = paramXmlPullParser.getAttributeCount();
    for (int j = 0; j < i; j++) {
      if (stripPrefix(paramXmlPullParser.getAttributeName(j)).equals(paramString)) {
        return paramXmlPullParser.getAttributeValue(j);
      }
    }
    return null;
  }
  
  public static boolean isEndTag(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException
  {
    boolean bool;
    if (paramXmlPullParser.getEventType() == 3) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isEndTag(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException
  {
    boolean bool;
    if ((isEndTag(paramXmlPullParser)) && (paramXmlPullParser.getName().equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isStartTag(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException
  {
    boolean bool;
    if (paramXmlPullParser.getEventType() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isStartTag(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException
  {
    boolean bool;
    if ((isStartTag(paramXmlPullParser)) && (paramXmlPullParser.getName().equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isStartTagIgnorePrefix(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException
  {
    boolean bool;
    if ((isStartTag(paramXmlPullParser)) && (stripPrefix(paramXmlPullParser.getName()).equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static String stripPrefix(String paramString)
  {
    int i = paramString.indexOf(':');
    if (i != -1) {
      paramString = paramString.substring(i + 1);
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.XmlPullParserUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package g0;

import org.xmlpull.v1.XmlPullParser;

public abstract class N
{
  public static String a(XmlPullParser paramXmlPullParser, String paramString)
  {
    int i = paramXmlPullParser.getAttributeCount();
    for (int j = 0; j < i; j++) {
      if (paramXmlPullParser.getAttributeName(j).equals(paramString)) {
        return paramXmlPullParser.getAttributeValue(j);
      }
    }
    return null;
  }
  
  public static String b(XmlPullParser paramXmlPullParser, String paramString)
  {
    int i = paramXmlPullParser.getAttributeCount();
    for (int j = 0; j < i; j++) {
      if (h(paramXmlPullParser.getAttributeName(j)).equals(paramString)) {
        return paramXmlPullParser.getAttributeValue(j);
      }
    }
    return null;
  }
  
  public static boolean c(XmlPullParser paramXmlPullParser)
  {
    boolean bool;
    if (paramXmlPullParser.getEventType() == 3) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean d(XmlPullParser paramXmlPullParser, String paramString)
  {
    boolean bool;
    if ((c(paramXmlPullParser)) && (paramXmlPullParser.getName().equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean e(XmlPullParser paramXmlPullParser)
  {
    boolean bool;
    if (paramXmlPullParser.getEventType() == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean f(XmlPullParser paramXmlPullParser, String paramString)
  {
    boolean bool;
    if ((e(paramXmlPullParser)) && (paramXmlPullParser.getName().equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean g(XmlPullParser paramXmlPullParser, String paramString)
  {
    boolean bool;
    if ((e(paramXmlPullParser)) && (h(paramXmlPullParser.getName()).equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static String h(String paramString)
  {
    int i = paramString.indexOf(':');
    if (i != -1) {
      paramString = paramString.substring(i + 1);
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     g0.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
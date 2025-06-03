package N0;

import X2.v;
import X2.v.a;
import d0.A;
import g0.N;
import g0.o;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public abstract class f
{
  public static final String[] a = { "Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo" };
  public static final String[] b = { "Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs" };
  public static final String[] c = { "Camera:MicroVideoOffset", "GCamera:MicroVideoOffset" };
  
  public static c a(String paramString)
  {
    try
    {
      paramString = b(paramString);
      return paramString;
    }
    catch (XmlPullParserException|A|NumberFormatException paramString)
    {
      o.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
    }
    return null;
  }
  
  public static c b(String paramString)
  {
    XmlPullParser localXmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
    localXmlPullParser.setInput(new StringReader(paramString));
    localXmlPullParser.next();
    if (N.f(localXmlPullParser, "x:xmpmeta"))
    {
      Object localObject = v.Y();
      long l1 = -9223372036854775807L;
      long l2;
      do
      {
        localXmlPullParser.next();
        if (N.f(localXmlPullParser, "rdf:Description"))
        {
          if (!d(localXmlPullParser)) {
            return null;
          }
          l2 = e(localXmlPullParser);
          paramString = c(localXmlPullParser);
        }
        else
        {
          if (N.f(localXmlPullParser, "Container:Directory")) {
            localObject = "Container";
          }
          for (paramString = "Item";; paramString = "GContainerItem")
          {
            paramString = f(localXmlPullParser, (String)localObject, paramString);
            l2 = l1;
            break;
            paramString = (String)localObject;
            l2 = l1;
            if (!N.f(localXmlPullParser, "GContainer:Directory")) {
              break;
            }
            localObject = "GContainer";
          }
        }
        localObject = paramString;
        l1 = l2;
      } while (!N.d(localXmlPullParser, "x:xmpmeta"));
      if (paramString.isEmpty()) {
        return null;
      }
      return new c(l2, paramString);
    }
    throw A.a("Couldn't find xmp metadata", null);
  }
  
  public static v c(XmlPullParser paramXmlPullParser)
  {
    String[] arrayOfString = c;
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = N.a(paramXmlPullParser, arrayOfString[j]);
      if (str != null)
      {
        long l = Long.parseLong(str);
        return v.a0(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", l, 0L));
      }
    }
    return v.Y();
  }
  
  public static boolean d(XmlPullParser paramXmlPullParser)
  {
    String[] arrayOfString = a;
    int i = arrayOfString.length;
    boolean bool = false;
    for (int j = 0; j < i; j++)
    {
      String str = N.a(paramXmlPullParser, arrayOfString[j]);
      if (str != null)
      {
        if (Integer.parseInt(str) == 1) {
          bool = true;
        }
        return bool;
      }
    }
    return false;
  }
  
  public static long e(XmlPullParser paramXmlPullParser)
  {
    String[] arrayOfString = b;
    int i = arrayOfString.length;
    for (int j = 0;; j++)
    {
      long l1 = -9223372036854775807L;
      if (j >= i) {
        break;
      }
      String str = N.a(paramXmlPullParser, arrayOfString[j]);
      if (str != null)
      {
        long l2 = Long.parseLong(str);
        if (l2 != -1L) {
          l1 = l2;
        }
        return l1;
      }
    }
    return -9223372036854775807L;
  }
  
  public static v f(XmlPullParser paramXmlPullParser, String paramString1, String paramString2)
  {
    v.a locala = v.M();
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append(paramString1);
    ((StringBuilder)localObject1).append(":Item");
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(paramString1);
    ((StringBuilder)localObject2).append(":Directory");
    paramString1 = ((StringBuilder)localObject2).toString();
    do
    {
      paramXmlPullParser.next();
      if (N.f(paramXmlPullParser, (String)localObject1))
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(paramString2);
        ((StringBuilder)localObject2).append(":Mime");
        String str1 = ((StringBuilder)localObject2).toString();
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(paramString2);
        ((StringBuilder)localObject2).append(":Semantic");
        String str2 = ((StringBuilder)localObject2).toString();
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(paramString2);
        ((StringBuilder)localObject2).append(":Length");
        String str3 = ((StringBuilder)localObject2).toString();
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(paramString2);
        ((StringBuilder)localObject2).append(":Padding");
        localObject2 = ((StringBuilder)localObject2).toString();
        str1 = N.a(paramXmlPullParser, str1);
        str2 = N.a(paramXmlPullParser, str2);
        str3 = N.a(paramXmlPullParser, str3);
        localObject2 = N.a(paramXmlPullParser, (String)localObject2);
        if ((str1 != null) && (str2 != null))
        {
          long l1;
          if (str3 != null) {
            l1 = Long.parseLong(str3);
          } else {
            l1 = 0L;
          }
          long l2;
          if (localObject2 != null) {
            l2 = Long.parseLong((String)localObject2);
          } else {
            l2 = 0L;
          }
          locala.h(new c.a(str1, str2, l1, l2));
        }
        else
        {
          return v.Y();
        }
      }
    } while (!N.d(paramXmlPullParser, paramString1));
    return locala.k();
  }
}

/* Location:
 * Qualified Name:     N0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
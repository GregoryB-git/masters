package h4;

import g;
import java.io.StringReader;
import java.util.AbstractCollection;
import o7.l0;
import o7.t;
import o7.t.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import p2.m0;
import v3.a1;

public final class e
{
  public static final String[] a = { "Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo" };
  public static final String[] b = { "Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs" };
  public static final String[] c = { "Camera:MicroVideoOffset", "GCamera:MicroVideoOffset" };
  
  public static b a(String paramString)
  {
    XmlPullParser localXmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
    localXmlPullParser.setInput(new StringReader(paramString));
    localXmlPullParser.next();
    if (m0.V(localXmlPullParser, "x:xmpmeta"))
    {
      paramString = t.b;
      Object localObject = l0.e;
      long l1 = -9223372036854775807L;
      label121:
      long l2;
      label184:
      label259:
      label310:
      do
      {
        localXmlPullParser.next();
        if (m0.V(localXmlPullParser, "rdf:Description"))
        {
          paramString = a;
          int i = 0;
          for (int j = 0;; j++)
          {
            int k = 1;
            if (j >= 4) {
              break;
            }
            localObject = m0.G(localXmlPullParser, paramString[j]);
            if (localObject != null)
            {
              if (Integer.parseInt((String)localObject) != 1) {
                break;
              }
              j = k;
              break label121;
            }
          }
          j = 0;
          if (j == 0) {
            return null;
          }
          paramString = b;
          for (j = 0; j < 4; j++)
          {
            localObject = m0.G(localXmlPullParser, paramString[j]);
            if (localObject != null)
            {
              l1 = Long.parseLong((String)localObject);
              l2 = l1;
              if (l1 != -1L) {
                break label184;
              }
              break;
            }
          }
          l2 = -9223372036854775807L;
          paramString = c;
          for (j = i; j < 2; j++)
          {
            localObject = m0.G(localXmlPullParser, paramString[j]);
            if (localObject != null)
            {
              l1 = Long.parseLong((String)localObject);
              paramString = t.u(new b.a(0L, 0L, "image/jpeg"), new b.a(l1, 0L, "video/mp4"));
              break label259;
            }
          }
          paramString = t.b;
          paramString = l0.e;
        }
        else
        {
          if (m0.V(localXmlPullParser, "Container:Directory"))
          {
            localObject = "Container";
            paramString = "Item";
          }
          else
          {
            paramString = (String)localObject;
            l2 = l1;
            if (!m0.V(localXmlPullParser, "GContainer:Directory")) {
              break label310;
            }
            localObject = "GContainer";
            paramString = "GContainerItem";
          }
          paramString = b(localXmlPullParser, (String)localObject, paramString);
          l2 = l1;
        }
        localObject = paramString;
        l1 = l2;
      } while (!m0.T(localXmlPullParser, "x:xmpmeta"));
      if (paramString.isEmpty()) {
        return null;
      }
      return new b(l2, paramString);
    }
    throw a1.a("Couldn't find xmp metadata", null);
  }
  
  public static l0 b(XmlPullParser paramXmlPullParser, String paramString1, String paramString2)
  {
    Object localObject = t.b;
    localObject = new t.a();
    String str1 = g.d(paramString1, ":Item");
    paramString1 = g.d(paramString1, ":Directory");
    do
    {
      paramXmlPullParser.next();
      if (m0.V(paramXmlPullParser, str1))
      {
        String str2 = g.d(paramString2, ":Mime");
        String str3 = g.d(paramString2, ":Semantic");
        String str4 = g.d(paramString2, ":Length");
        String str5 = g.d(paramString2, ":Padding");
        str2 = m0.G(paramXmlPullParser, str2);
        str3 = m0.G(paramXmlPullParser, str3);
        str4 = m0.G(paramXmlPullParser, str4);
        str5 = m0.G(paramXmlPullParser, str5);
        if ((str2 != null) && (str3 != null))
        {
          long l1;
          if (str4 != null) {
            l1 = Long.parseLong(str4);
          } else {
            l1 = 0L;
          }
          long l2;
          if (str5 != null) {
            l2 = Long.parseLong(str5);
          } else {
            l2 = 0L;
          }
          ((t.a)localObject).c(new b.a(l1, l2, str2));
        }
        else
        {
          return l0.e;
        }
      }
    } while (!m0.T(paramXmlPullParser, paramString1));
    return ((t.a)localObject).e();
  }
}

/* Location:
 * Qualified Name:     h4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
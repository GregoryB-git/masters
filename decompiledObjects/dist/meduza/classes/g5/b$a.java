package g5;

import android.util.Pair;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import v3.a1;

public abstract class b$a
{
  public final String a;
  public final String b;
  public final a c;
  public final LinkedList d;
  
  public b$a(a parama, String paramString1, String paramString2)
  {
    c = parama;
    a = paramString1;
    b = paramString2;
    d = new LinkedList();
  }
  
  public static int g(XmlPullParser paramXmlPullParser, String paramString)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      try
      {
        int i = Integer.parseInt(paramXmlPullParser);
        return i;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw a1.b(null, paramXmlPullParser);
      }
    }
    return -1;
  }
  
  public static long h(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      try
      {
        paramLong = Long.parseLong(paramXmlPullParser);
        return paramLong;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw a1.b(null, paramXmlPullParser);
      }
    }
    return paramLong;
  }
  
  public static int i(XmlPullParser paramXmlPullParser, String paramString)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      try
      {
        int i = Integer.parseInt(paramXmlPullParser);
        return i;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw a1.b(null, paramXmlPullParser);
      }
    }
    throw new b.b(paramString);
  }
  
  public void a(Object paramObject) {}
  
  public abstract Object b();
  
  public final Object c(String paramString)
  {
    for (int i = 0; i < d.size(); i++)
    {
      localObject = (Pair)d.get(i);
      if (((String)first).equals(paramString)) {
        return second;
      }
    }
    Object localObject = c;
    if (localObject == null) {
      paramString = null;
    } else {
      paramString = ((a)localObject).c(paramString);
    }
    return paramString;
  }
  
  public boolean d(String paramString)
  {
    return false;
  }
  
  public final Object e(XmlPullParser paramXmlPullParser)
  {
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      k = paramXmlPullParser.getEventType();
      Object localObject = null;
      if (k == 1) {
        break;
      }
      int m;
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4)
          {
            m = i;
            k = j;
          }
          else
          {
            m = i;
            k = j;
            if (i != 0)
            {
              m = i;
              k = j;
              if (j == 0)
              {
                k(paramXmlPullParser);
                m = i;
                k = j;
              }
            }
          }
        }
        else
        {
          m = i;
          k = j;
          if (i != 0) {
            if (j > 0)
            {
              k = j - 1;
              m = i;
            }
            else
            {
              localObject = paramXmlPullParser.getName();
              f(paramXmlPullParser);
              m = i;
              k = j;
              if (!d((String)localObject)) {
                return b();
              }
            }
          }
        }
      }
      else
      {
        String str1 = paramXmlPullParser.getName();
        if (b.equals(str1))
        {
          j(paramXmlPullParser);
          m = 1;
          k = j;
        }
        else
        {
          m = i;
          k = j;
          if (i != 0) {
            if (j > 0)
            {
              k = j + 1;
              m = i;
            }
            else if (d(str1))
            {
              j(paramXmlPullParser);
              m = i;
              k = j;
            }
            else
            {
              String str2 = a;
              if ("QualityLevel".equals(str1)) {
                localObject = new b.d(this, str2);
              } else if ("Protection".equals(str1)) {
                localObject = new b.c(this, str2);
              } else if ("StreamIndex".equals(str1)) {
                localObject = new b.f(this, str2);
              }
              if (localObject == null)
              {
                k = 1;
                m = i;
              }
              else
              {
                a(((a)localObject).e(paramXmlPullParser));
                k = j;
                m = i;
              }
            }
          }
        }
      }
      paramXmlPullParser.next();
      i = m;
    }
    return null;
  }
  
  public void f(XmlPullParser paramXmlPullParser) {}
  
  public abstract void j(XmlPullParser paramXmlPullParser);
  
  public void k(XmlPullParser paramXmlPullParser) {}
  
  public final void l(Object paramObject, String paramString)
  {
    d.add(Pair.create(paramString, paramObject));
  }
}

/* Location:
 * Qualified Name:     g5.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
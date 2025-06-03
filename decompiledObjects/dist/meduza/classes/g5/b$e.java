package g5;

import a4.d;
import a4.d.b;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import v3.a1;
import v3.i0;
import v3.i0.a;
import v5.e0;
import x6.b;

public final class b$e
  extends b.a
{
  public final LinkedList e = new LinkedList();
  public int f;
  public int g;
  public long h;
  public long i;
  public long j;
  public int k = -1;
  public boolean l;
  public a.a m = null;
  
  public b$e(String paramString)
  {
    super(null, paramString, "SmoothStreamingMedia");
  }
  
  public final void a(Object paramObject)
  {
    if ((paramObject instanceof a.b))
    {
      e.add((a.b)paramObject);
    }
    else if ((paramObject instanceof a.a))
    {
      boolean bool;
      if (m == null) {
        bool = true;
      } else {
        bool = false;
      }
      b.H(bool);
      m = ((a.a)paramObject);
    }
  }
  
  public final Object b()
  {
    int n = e.size();
    a.b[] arrayOfb = new a.b[n];
    e.toArray(arrayOfb);
    Object localObject1 = m;
    if (localObject1 != null)
    {
      localObject1 = new d(new d.b[] { new d.b(a, null, "video/mp4", b) });
      for (i1 = 0; i1 < n; i1++)
      {
        Object localObject2 = arrayOfb[i1];
        i2 = a;
        if ((i2 == 2) || (i2 == 1))
        {
          localObject2 = j;
          for (i2 = 0; i2 < localObject2.length; i2++)
          {
            Object localObject3 = localObject2[i2];
            localObject3.getClass();
            localObject3 = new i0.a((i0)localObject3);
            n = ((d)localObject1);
            localObject2[i2] = new i0((i0.a)localObject3);
          }
        }
      }
    }
    int i2 = f;
    n = g;
    long l1 = h;
    long l2 = i;
    long l3 = j;
    int i1 = k;
    boolean bool = l;
    localObject1 = m;
    if (l2 == 0L) {
      l2 = -9223372036854775807L;
    } else {
      l2 = e0.O(l2, 1000000L, l1);
    }
    if (l3 == 0L) {
      l3 = -9223372036854775807L;
    } else {
      l3 = e0.O(l3, 1000000L, l1);
    }
    return new a(i2, n, l2, l3, i1, bool, (a.a)localObject1, arrayOfb);
  }
  
  public final void j(XmlPullParser paramXmlPullParser)
  {
    f = b.a.i(paramXmlPullParser, "MajorVersion");
    g = b.a.i(paramXmlPullParser, "MinorVersion");
    h = b.a.h(paramXmlPullParser, "TimeScale", 10000000L);
    String str = paramXmlPullParser.getAttributeValue(null, "Duration");
    if (str != null) {
      try
      {
        long l1 = Long.parseLong(str);
        i = l1;
        j = b.a.h(paramXmlPullParser, "DVRWindowLength", 0L);
        k = b.a.g(paramXmlPullParser, "LookaheadCount");
        boolean bool = false;
        paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "IsLive");
        if (paramXmlPullParser != null) {
          bool = Boolean.parseBoolean(paramXmlPullParser);
        }
        l = bool;
        l(Long.valueOf(h), "TimeScale");
        return;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw a1.b(null, paramXmlPullParser);
      }
    }
    throw new b.b("Duration");
  }
}

/* Location:
 * Qualified Name:     g5.b.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
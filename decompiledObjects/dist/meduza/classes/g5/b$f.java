package g5;

import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import v3.a1;
import v3.i0;
import v5.e0;

public final class b$f
  extends b.a
{
  public final String e;
  public final LinkedList f;
  public int g;
  public String h;
  public long i;
  public String j;
  public String k;
  public int l;
  public int m;
  public int n;
  public int o;
  public String p;
  public ArrayList<Long> q;
  public long r;
  
  public b$f(b.a parama, String paramString)
  {
    super(parama, paramString, "StreamIndex");
    e = paramString;
    f = new LinkedList();
  }
  
  public final void a(Object paramObject)
  {
    if ((paramObject instanceof i0)) {
      f.add((i0)paramObject);
    }
  }
  
  public final Object b()
  {
    i0[] arrayOfi0 = new i0[f.size()];
    f.toArray(arrayOfi0);
    String str1 = e;
    String str2 = k;
    int i1 = g;
    String str3 = h;
    long l1 = i;
    String str4 = j;
    int i2 = l;
    int i3 = m;
    int i4 = n;
    int i5 = o;
    String str5 = p;
    ArrayList localArrayList1 = q;
    long l2 = r;
    int i6 = e0.a;
    int i9 = localArrayList1.size();
    long[] arrayOfLong = new long[i9];
    int i7 = l1 < 1000000L;
    long l3;
    if ((i7 >= 0) && (l1 % 1000000L == 0L))
    {
      l3 = l1 / 1000000L;
      i7 = 0;
    }
    while (i7 < i9)
    {
      arrayOfLong[i7] = (((Long)localArrayList1.get(i7)).longValue() / l3);
      i7++;
      continue;
      if ((i7 >= 0) || (1000000L % l1 != 0L)) {
        break label251;
      }
      l3 = 1000000L / l1;
      for (i8 = 0; i8 < i9; i8++) {
        arrayOfLong[i8] = (((Long)localArrayList1.get(i8)).longValue() * l3);
      }
    }
    ArrayList localArrayList2 = localArrayList1;
    break label304;
    label251:
    double d = 1000000L / l1;
    for (int i8 = 0;; i8++)
    {
      localArrayList2 = localArrayList1;
      if (i8 >= i9) {
        break;
      }
      arrayOfLong[i8] = ((((Long)localArrayList1.get(i8)).longValue() * d));
    }
    label304:
    return new a.b(str1, str2, i1, str3, l1, str4, i2, i3, i4, i5, str5, arrayOfi0, localArrayList2, arrayOfLong, e0.O(l2, 1000000L, l1));
  }
  
  public final boolean d(String paramString)
  {
    return "c".equals(paramString);
  }
  
  public final void j(XmlPullParser paramXmlPullParser)
  {
    boolean bool = "c".equals(paramXmlPullParser.getName());
    int i1 = 1;
    int i2 = 1;
    long l2;
    if (bool)
    {
      i1 = q.size();
      long l1 = b.a.h(paramXmlPullParser, "t", -9223372036854775807L);
      l2 = l1;
      if (l1 == -9223372036854775807L) {
        if (i1 == 0)
        {
          l2 = 0L;
        }
        else if (r != -1L)
        {
          l2 = ((Long)q.get(i1 - 1)).longValue();
          l2 = r + l2;
        }
        else
        {
          throw a1.b("Unable to infer start time", null);
        }
      }
      q.add(Long.valueOf(l2));
      r = b.a.h(paramXmlPullParser, "d", -9223372036854775807L);
      long l3 = b.a.h(paramXmlPullParser, "r", 1L);
      i1 = i2;
      if (l3 > 1L) {
        if (r != -9223372036854775807L) {
          i1 = i2;
        } else {
          throw a1.b("Repeated chunk with unspecified duration", null);
        }
      }
      for (;;)
      {
        l1 = i1;
        if (l1 >= l3) {
          break;
        }
        q.add(Long.valueOf(r * l1 + l2));
        i1++;
      }
    }
    String str = paramXmlPullParser.getAttributeValue(null, "Type");
    if (str != null)
    {
      if (!"audio".equalsIgnoreCase(str)) {
        if ("video".equalsIgnoreCase(str))
        {
          i1 = 2;
        }
        else
        {
          if (!"text".equalsIgnoreCase(str)) {
            break label526;
          }
          i1 = 3;
        }
      }
      g = i1;
      l(Integer.valueOf(i1), "Type");
      if (g == 3)
      {
        str = paramXmlPullParser.getAttributeValue(null, "Subtype");
        if (str == null) {
          throw new b.b("Subtype");
        }
      }
      else
      {
        str = paramXmlPullParser.getAttributeValue(null, "Subtype");
      }
      h = str;
      l(str, "Subtype");
      str = paramXmlPullParser.getAttributeValue(null, "Name");
      j = str;
      l(str, "Name");
      str = paramXmlPullParser.getAttributeValue(null, "Url");
      if (str != null)
      {
        k = str;
        l = b.a.g(paramXmlPullParser, "MaxWidth");
        m = b.a.g(paramXmlPullParser, "MaxHeight");
        n = b.a.g(paramXmlPullParser, "DisplayWidth");
        o = b.a.g(paramXmlPullParser, "DisplayHeight");
        str = paramXmlPullParser.getAttributeValue(null, "Language");
        p = str;
        l(str, "Language");
        l2 = b.a.g(paramXmlPullParser, "TimeScale");
        i = l2;
        if (l2 == -1L) {
          i = ((Long)c("TimeScale")).longValue();
        }
        q = new ArrayList();
        return;
      }
      throw new b.b("Url");
      label526:
      paramXmlPullParser = new StringBuilder();
      paramXmlPullParser.append("Invalid key value[");
      paramXmlPullParser.append(str);
      paramXmlPullParser.append("]");
      throw a1.b(paramXmlPullParser.toString(), null);
    }
    throw new b.b("Type");
  }
}

/* Location:
 * Qualified Name:     g5.b.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
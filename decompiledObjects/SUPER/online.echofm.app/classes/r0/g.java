package r0;

import android.net.Uri;
import d0.H;
import d0.q;
import d0.q.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class g
  extends h
{
  public static final g n = new g("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
  public final List d;
  public final List e;
  public final List f;
  public final List g;
  public final List h;
  public final List i;
  public final q j;
  public final List k;
  public final Map l;
  public final List m;
  
  public g(String paramString, List paramList1, List paramList2, List paramList3, List paramList4, List paramList5, List paramList6, q paramq, List paramList7, boolean paramBoolean, Map paramMap, List paramList8)
  {
    super(paramString, paramList1, paramBoolean);
    d = Collections.unmodifiableList(f(paramList2, paramList3, paramList4, paramList5, paramList6));
    e = Collections.unmodifiableList(paramList2);
    f = Collections.unmodifiableList(paramList3);
    g = Collections.unmodifiableList(paramList4);
    h = Collections.unmodifiableList(paramList5);
    i = Collections.unmodifiableList(paramList6);
    j = paramq;
    if (paramList7 != null) {
      paramString = Collections.unmodifiableList(paramList7);
    } else {
      paramString = null;
    }
    k = paramString;
    l = Collections.unmodifiableMap(paramMap);
    m = Collections.unmodifiableList(paramList8);
  }
  
  public static void b(List paramList1, List paramList2)
  {
    for (int i1 = 0; i1 < paramList1.size(); i1++)
    {
      Uri localUri = geta;
      if ((localUri != null) && (!paramList2.contains(localUri))) {
        paramList2.add(localUri);
      }
    }
  }
  
  public static List d(List paramList1, int paramInt, List paramList2)
  {
    ArrayList localArrayList = new ArrayList(paramList2.size());
    for (int i1 = 0; i1 < paramList1.size(); i1++)
    {
      Object localObject = paramList1.get(i1);
      for (int i2 = 0; i2 < paramList2.size(); i2++)
      {
        H localH = (H)paramList2.get(i2);
        if ((p == paramInt) && (q == i1))
        {
          localArrayList.add(localObject);
          break;
        }
      }
    }
    return localArrayList;
  }
  
  public static g e(String paramString)
  {
    paramString = Collections.singletonList(b.b(Uri.parse(paramString)));
    return new g("", Collections.emptyList(), paramString, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
  }
  
  public static List f(List paramList1, List paramList2, List paramList3, List paramList4, List paramList5)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < paramList1.size(); i1++)
    {
      Uri localUri = geta;
      if (!localArrayList.contains(localUri)) {
        localArrayList.add(localUri);
      }
    }
    b(paramList2, localArrayList);
    b(paramList3, localArrayList);
    b(paramList4, localArrayList);
    b(paramList5, localArrayList);
    return localArrayList;
  }
  
  public g c(List paramList)
  {
    return new g(a, b, d(e, 0, paramList), Collections.emptyList(), d(g, 1, paramList), d(h, 2, paramList), Collections.emptyList(), j, k, c, l, m);
  }
  
  public static final class a
  {
    public final Uri a;
    public final q b;
    public final String c;
    public final String d;
    
    public a(Uri paramUri, q paramq, String paramString1, String paramString2)
    {
      a = paramUri;
      b = paramq;
      c = paramString1;
      d = paramString2;
    }
  }
  
  public static final class b
  {
    public final Uri a;
    public final q b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    
    public b(Uri paramUri, q paramq, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      a = paramUri;
      b = paramq;
      c = paramString1;
      d = paramString2;
      e = paramString3;
      f = paramString4;
    }
    
    public static b b(Uri paramUri)
    {
      return new b(paramUri, new q.b().a0("0").Q("application/x-mpegURL").K(), null, null, null, null);
    }
    
    public b a(q paramq)
    {
      return new b(a, paramq, c, d, e, f);
    }
  }
}

/* Location:
 * Qualified Name:     r0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
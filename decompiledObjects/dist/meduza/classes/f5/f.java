package f5;

import a4.d;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v3.i0;
import y4.c;

public class f
  extends g
{
  public static final f n = new f("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
  public final List<Uri> d;
  public final List<b> e;
  public final List<a> f;
  public final List<a> g;
  public final List<a> h;
  public final List<a> i;
  public final i0 j;
  public final List<i0> k;
  public final Map<String, String> l;
  public final List<d> m;
  
  public f(String paramString, List<String> paramList, List<b> paramList1, List<a> paramList2, List<a> paramList3, List<a> paramList4, List<a> paramList5, i0 parami0, List<i0> paramList6, boolean paramBoolean, Map<String, String> paramMap, List<d> paramList7)
  {
    super(paramString, paramList, paramBoolean);
    paramList = new ArrayList();
    for (int i1 = 0; i1 < paramList1.size(); i1++)
    {
      paramString = geta;
      if (!paramList.contains(paramString)) {
        paramList.add(paramString);
      }
    }
    b(paramList2, paramList);
    b(paramList3, paramList);
    b(paramList4, paramList);
    b(paramList5, paramList);
    d = Collections.unmodifiableList(paramList);
    e = Collections.unmodifiableList(paramList1);
    f = Collections.unmodifiableList(paramList2);
    g = Collections.unmodifiableList(paramList3);
    h = Collections.unmodifiableList(paramList4);
    i = Collections.unmodifiableList(paramList5);
    j = parami0;
    if (paramList6 != null) {
      paramString = Collections.unmodifiableList(paramList6);
    } else {
      paramString = null;
    }
    k = paramString;
    l = Collections.unmodifiableMap(paramMap);
    m = Collections.unmodifiableList(paramList7);
  }
  
  public static void b(List paramList, ArrayList paramArrayList)
  {
    for (int i1 = 0; i1 < paramList.size(); i1++)
    {
      Uri localUri = geta;
      if ((localUri != null) && (!paramArrayList.contains(localUri))) {
        paramArrayList.add(localUri);
      }
    }
  }
  
  public static ArrayList c(List paramList1, int paramInt, List paramList2)
  {
    ArrayList localArrayList = new ArrayList(paramList2.size());
    for (int i1 = 0; i1 < paramList1.size(); i1++)
    {
      Object localObject = paramList1.get(i1);
      for (int i2 = 0; i2 < paramList2.size(); i2++)
      {
        c localc = (c)paramList2.get(i2);
        if ((b == paramInt) && (c == i1))
        {
          localArrayList.add(localObject);
          break;
        }
      }
    }
    return localArrayList;
  }
  
  public final Object a(List paramList)
  {
    return new f(a, b, c(e, 0, paramList), Collections.emptyList(), c(g, 1, paramList), c(h, 2, paramList), Collections.emptyList(), j, k, c, l, m);
  }
  
  public static final class a
  {
    public final Uri a;
    public final i0 b;
    public final String c;
    
    public a(Uri paramUri, i0 parami0, String paramString)
    {
      a = paramUri;
      b = parami0;
      c = paramString;
    }
  }
  
  public static final class b
  {
    public final Uri a;
    public final i0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    
    public b(Uri paramUri, i0 parami0, String paramString1, String paramString2, String paramString3, String paramString4)
    {
      a = paramUri;
      b = parami0;
      c = paramString1;
      d = paramString2;
      e = paramString3;
      f = paramString4;
    }
  }
}

/* Location:
 * Qualified Name:     f5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class rw
  extends rz
{
  public static final rw a = new rw("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
  public final List<Uri> b;
  public final List<ry> c;
  public final List<rv> d;
  public final List<rv> e;
  public final bw f;
  public final List<bw> g;
  public final Map<String, String> h;
  public final List<fe> i;
  
  public rw(String paramString, List<String> paramList, List<ry> paramList1, List<rv> paramList2, List<rv> paramList3, List<rv> paramList4, List<rv> paramList5, bw parambw, List<bw> paramList6, boolean paramBoolean, Map<String, String> paramMap, List<fe> paramList7)
  {
    super(paramString, paramList, paramBoolean);
    paramString = new ArrayList();
    for (int j = 0; j < paramList1.size(); j++)
    {
      paramList = geta;
      if (!paramString.contains(paramList)) {
        paramString.add(paramList);
      }
    }
    a(paramList2, paramString);
    a(paramList3, paramString);
    a(paramList4, paramString);
    a(paramList5, paramString);
    b = Collections.unmodifiableList(paramString);
    c = Collections.unmodifiableList(paramList1);
    Collections.unmodifiableList(paramList2);
    d = Collections.unmodifiableList(paramList3);
    e = Collections.unmodifiableList(paramList4);
    Collections.unmodifiableList(paramList5);
    f = parambw;
    if (paramList6 != null) {
      paramString = Collections.unmodifiableList(paramList6);
    } else {
      paramString = null;
    }
    g = paramString;
    h = Collections.unmodifiableMap(paramMap);
    i = Collections.unmodifiableList(paramList7);
  }
  
  public static rw a(String paramString)
  {
    paramString = Collections.singletonList(new ry(Uri.parse(paramString), bw.b("0", null, "application/x-mpegURL", null, null, -1, 0, 0, null), null, null, null, null));
    return new rw(null, Collections.emptyList(), paramString, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
  }
  
  private static <T> List<T> a(List<T> paramList, int paramInt, List<lp> paramList1)
  {
    ArrayList localArrayList = new ArrayList(paramList1.size());
    for (int j = 0; j < paramList.size(); j++)
    {
      Object localObject = paramList.get(j);
      for (int k = 0; k < paramList1.size(); k++)
      {
        lp locallp = (lp)paramList1.get(k);
        if ((b == paramInt) && (c == j))
        {
          localArrayList.add(localObject);
          break;
        }
      }
    }
    return localArrayList;
  }
  
  private static void a(List<rv> paramList, List<Uri> paramList1)
  {
    for (int j = 0; j < paramList.size(); j++)
    {
      Uri localUri = geta;
      if ((localUri != null) && (!paramList1.contains(localUri))) {
        paramList1.add(localUri);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
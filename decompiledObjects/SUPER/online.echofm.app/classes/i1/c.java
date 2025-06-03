package i1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import f0.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public final class c
{
  public final String a;
  public final String b;
  public final boolean c;
  public final long d;
  public final long e;
  public final g f;
  public final String[] g;
  public final String h;
  public final String i;
  public final c j;
  public final HashMap k;
  public final HashMap l;
  public List m;
  
  public c(String paramString1, String paramString2, long paramLong1, long paramLong2, g paramg, String[] paramArrayOfString, String paramString3, String paramString4, c paramc)
  {
    a = paramString1;
    b = paramString2;
    i = paramString4;
    f = paramg;
    g = paramArrayOfString;
    boolean bool;
    if (paramString2 != null) {
      bool = true;
    } else {
      bool = false;
    }
    c = bool;
    d = paramLong1;
    e = paramLong2;
    h = ((String)g0.a.e(paramString3));
    j = paramc;
    k = new HashMap();
    l = new HashMap();
  }
  
  public static c c(String paramString1, long paramLong1, long paramLong2, g paramg, String[] paramArrayOfString, String paramString2, String paramString3, c paramc)
  {
    return new c(paramString1, null, paramLong1, paramLong2, paramg, paramArrayOfString, paramString2, paramString3, paramc);
  }
  
  public static c d(String paramString)
  {
    return new c(null, f.b(paramString), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
  }
  
  public static void e(SpannableStringBuilder paramSpannableStringBuilder)
  {
    int n = paramSpannableStringBuilder.length();
    int i1 = 0;
    for (a locala : (a[])paramSpannableStringBuilder.getSpans(0, n, a.class)) {
      paramSpannableStringBuilder.replace(paramSpannableStringBuilder.getSpanStart(locala), paramSpannableStringBuilder.getSpanEnd(locala), "");
    }
    for (n = 0; n < paramSpannableStringBuilder.length(); n++) {
      if (paramSpannableStringBuilder.charAt(n) == ' ')
      {
        int i3 = n + 1;
        for (??? = i3; (??? < paramSpannableStringBuilder.length()) && (paramSpannableStringBuilder.charAt(???) == ' '); ???++) {}
        ??? -= i3;
        if (??? > 0) {
          paramSpannableStringBuilder.delete(n, ??? + n);
        }
      }
    }
    if ((paramSpannableStringBuilder.length() > 0) && (paramSpannableStringBuilder.charAt(0) == ' ')) {
      paramSpannableStringBuilder.delete(0, 1);
    }
    for (n = 0; n < paramSpannableStringBuilder.length() - 1; n++) {
      if (paramSpannableStringBuilder.charAt(n) == '\n')
      {
        ??? = n + 1;
        if (paramSpannableStringBuilder.charAt(???) == ' ') {
          paramSpannableStringBuilder.delete(???, n + 2);
        }
      }
    }
    n = i1;
    if (paramSpannableStringBuilder.length() > 0)
    {
      n = i1;
      if (paramSpannableStringBuilder.charAt(paramSpannableStringBuilder.length() - 1) == ' ') {
        paramSpannableStringBuilder.delete(paramSpannableStringBuilder.length() - 1, paramSpannableStringBuilder.length());
      }
    }
    for (n = i1; n < paramSpannableStringBuilder.length() - 1; n++) {
      if (paramSpannableStringBuilder.charAt(n) == ' ')
      {
        ??? = n + 1;
        if (paramSpannableStringBuilder.charAt(???) == '\n') {
          paramSpannableStringBuilder.delete(n, ???);
        }
      }
    }
    if ((paramSpannableStringBuilder.length() > 0) && (paramSpannableStringBuilder.charAt(paramSpannableStringBuilder.length() - 1) == '\n')) {
      paramSpannableStringBuilder.delete(paramSpannableStringBuilder.length() - 1, paramSpannableStringBuilder.length());
    }
  }
  
  public static SpannableStringBuilder k(String paramString, Map paramMap)
  {
    if (!paramMap.containsKey(paramString))
    {
      a.b localb = new a.b();
      localb.o(new SpannableStringBuilder());
      paramMap.put(paramString, localb);
    }
    return (SpannableStringBuilder)g0.a.e(((a.b)paramMap.get(paramString)).e());
  }
  
  public void a(c paramc)
  {
    if (m == null) {
      m = new ArrayList();
    }
    m.add(paramc);
  }
  
  public final void b(Map paramMap, a.b paramb, int paramInt1, int paramInt2, int paramInt3)
  {
    g localg = f.f(f, g, paramMap);
    SpannableStringBuilder localSpannableStringBuilder1 = (SpannableStringBuilder)paramb.e();
    SpannableStringBuilder localSpannableStringBuilder2 = localSpannableStringBuilder1;
    if (localSpannableStringBuilder1 == null)
    {
      localSpannableStringBuilder2 = new SpannableStringBuilder();
      paramb.o(localSpannableStringBuilder2);
    }
    if (localg != null)
    {
      f.a(localSpannableStringBuilder2, paramInt1, paramInt2, localg, j, paramMap, paramInt3);
      if ("p".equals(a))
      {
        if (localg.k() != Float.MAX_VALUE) {
          paramb.m(localg.k() * -90.0F / 100.0F);
        }
        if (localg.m() != null) {
          paramb.p(localg.m());
        }
        if (localg.h() != null) {
          paramb.j(localg.h());
        }
      }
    }
  }
  
  public c f(int paramInt)
  {
    List localList = m;
    if (localList != null) {
      return (c)localList.get(paramInt);
    }
    throw new IndexOutOfBoundsException();
  }
  
  public int g()
  {
    List localList = m;
    int n;
    if (localList == null) {
      n = 0;
    } else {
      n = localList.size();
    }
    return n;
  }
  
  public List h(long paramLong, Map paramMap1, Map paramMap2, Map paramMap3)
  {
    Object localObject1 = new ArrayList();
    n(paramLong, h, (List)localObject1);
    Object localObject2 = new TreeMap();
    p(paramLong, false, h, (Map)localObject2);
    o(paramLong, paramMap1, paramMap2, h, (Map)localObject2);
    paramMap1 = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject3 = (Pair)((Iterator)localObject1).next();
      Object localObject4 = (String)paramMap3.get(second);
      if (localObject4 != null)
      {
        localObject4 = Base64.decode((String)localObject4, 0);
        localObject4 = BitmapFactory.decodeByteArray((byte[])localObject4, 0, localObject4.length);
        localObject3 = (e)g0.a.e((e)paramMap2.get(first));
        paramMap1.add(new a.b().f((Bitmap)localObject4).k(b).l(0).h(c, 0).i(e).n(f).g(g).r(j).a());
      }
    }
    localObject2 = ((TreeMap)localObject2).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      paramMap3 = (e)g0.a.e((e)paramMap2.get(((Map.Entry)localObject1).getKey()));
      localObject1 = (a.b)((Map.Entry)localObject1).getValue();
      e((SpannableStringBuilder)g0.a.e(((a.b)localObject1).e()));
      ((a.b)localObject1).h(c, d);
      ((a.b)localObject1).i(e);
      ((a.b)localObject1).k(b);
      ((a.b)localObject1).n(f);
      ((a.b)localObject1).q(i, h);
      ((a.b)localObject1).r(j);
      paramMap1.add(((a.b)localObject1).a());
    }
    return paramMap1;
  }
  
  public final void i(TreeSet paramTreeSet, boolean paramBoolean)
  {
    boolean bool1 = "p".equals(a);
    boolean bool2 = "div".equals(a);
    if ((paramBoolean) || (bool1) || ((bool2) && (i != null)))
    {
      long l1 = d;
      if (l1 != -9223372036854775807L) {
        paramTreeSet.add(Long.valueOf(l1));
      }
      l1 = e;
      if (l1 != -9223372036854775807L) {
        paramTreeSet.add(Long.valueOf(l1));
      }
    }
    if (m == null) {
      return;
    }
    for (int n = 0; n < m.size(); n++)
    {
      c localc = (c)m.get(n);
      if ((!paramBoolean) && (!bool1)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      localc.i(paramTreeSet, bool2);
    }
  }
  
  public long[] j()
  {
    Object localObject = new TreeSet();
    int n = 0;
    i((TreeSet)localObject, false);
    long[] arrayOfLong = new long[((TreeSet)localObject).size()];
    localObject = ((TreeSet)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      arrayOfLong[n] = ((Long)((Iterator)localObject).next()).longValue();
      n++;
    }
    return arrayOfLong;
  }
  
  public String[] l()
  {
    return g;
  }
  
  public boolean m(long paramLong)
  {
    long l1 = d;
    boolean bool;
    if (((l1 == -9223372036854775807L) && (e == -9223372036854775807L)) || ((l1 <= paramLong) && (e == -9223372036854775807L)) || ((l1 == -9223372036854775807L) && (paramLong < e)) || ((l1 <= paramLong) && (paramLong < e))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void n(long paramLong, String paramString, List paramList)
  {
    if (!"".equals(h)) {
      paramString = h;
    }
    if ((m(paramLong)) && ("div".equals(a)) && (i != null))
    {
      paramList.add(new Pair(paramString, i));
      return;
    }
    for (int n = 0; n < g(); n++) {
      f(n).n(paramLong, paramString, paramList);
    }
  }
  
  public final void o(long paramLong, Map paramMap1, Map paramMap2, String paramString, Map paramMap3)
  {
    if (!m(paramLong)) {
      return;
    }
    if (!"".equals(h)) {
      paramString = h;
    }
    Iterator localIterator = l.entrySet().iterator();
    int n;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      n = 0;
      i1 = 0;
      if (!bool) {
        break;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      if (k.containsKey(str)) {
        i1 = ((Integer)k.get(str)).intValue();
      }
      n = ((Integer)localEntry.getValue()).intValue();
      if (i1 != n) {
        b(paramMap1, (a.b)g0.a.e((a.b)paramMap3.get(str)), i1, n, egetj);
      }
    }
    for (int i1 = n; i1 < g(); i1++) {
      f(i1).o(paramLong, paramMap1, paramMap2, paramString, paramMap3);
    }
  }
  
  public final void p(long paramLong, boolean paramBoolean, String paramString, Map paramMap)
  {
    k.clear();
    l.clear();
    if ("metadata".equals(a)) {
      return;
    }
    if (!"".equals(h)) {
      paramString = h;
    }
    if ((c) && (paramBoolean))
    {
      k(paramString, paramMap).append((CharSequence)g0.a.e(b));
    }
    else if (("br".equals(a)) && (paramBoolean))
    {
      k(paramString, paramMap).append('\n');
    }
    else if (m(paramLong))
    {
      Object localObject = paramMap.entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        k.put((String)localEntry.getKey(), Integer.valueOf(((CharSequence)g0.a.e(((a.b)localEntry.getValue()).e())).length()));
      }
      boolean bool1 = "p".equals(a);
      for (int n = 0; n < g(); n++)
      {
        localObject = f(n);
        boolean bool2;
        if ((!paramBoolean) && (!bool1)) {
          bool2 = false;
        } else {
          bool2 = true;
        }
        ((c)localObject).p(paramLong, bool2, paramString, paramMap);
      }
      if (bool1) {
        f.c(k(paramString, paramMap));
      }
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        paramString = (Map.Entry)paramMap.next();
        l.put((String)paramString.getKey(), Integer.valueOf(((CharSequence)g0.a.e(((a.b)paramString.getValue()).e())).length()));
      }
    }
  }
}

/* Location:
 * Qualified Name:     i1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
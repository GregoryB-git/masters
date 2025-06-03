package o5;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import b.a0;
import h5.a.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import l5.c;
import v5.e0;
import v5.m;

public final class d
{
  public final String a;
  public final String b;
  public final boolean c;
  public final long d;
  public final long e;
  public final f f;
  public final String[] g;
  public final String h;
  public final String i;
  public final d j;
  public final HashMap<String, Integer> k;
  public final HashMap<String, Integer> l;
  public ArrayList m;
  
  public d(String paramString1, String paramString2, long paramLong1, long paramLong2, f paramf, String[] paramArrayOfString, String paramString3, String paramString4, d paramd)
  {
    a = paramString1;
    b = paramString2;
    i = paramString4;
    f = paramf;
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
    paramString3.getClass();
    h = paramString3;
    j = paramd;
    k = new HashMap();
    l = new HashMap();
  }
  
  public static d a(String paramString)
  {
    return new d(null, paramString.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
  }
  
  public static SpannableStringBuilder e(String paramString, TreeMap paramTreeMap)
  {
    if (!paramTreeMap.containsKey(paramString))
    {
      a.a locala = new a.a();
      a = new SpannableStringBuilder();
      paramTreeMap.put(paramString, locala);
    }
    paramString = geta;
    paramString.getClass();
    return (SpannableStringBuilder)paramString;
  }
  
  public final d b(int paramInt)
  {
    ArrayList localArrayList = m;
    if (localArrayList != null) {
      return (d)localArrayList.get(paramInt);
    }
    throw new IndexOutOfBoundsException();
  }
  
  public final int c()
  {
    ArrayList localArrayList = m;
    int n;
    if (localArrayList == null) {
      n = 0;
    } else {
      n = localArrayList.size();
    }
    return n;
  }
  
  public final void d(TreeSet<Long> paramTreeSet, boolean paramBoolean)
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
      d locald = (d)m.get(n);
      if ((!paramBoolean) && (!bool1)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      locald.d(paramTreeSet, bool2);
    }
  }
  
  public final boolean f(long paramLong)
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
  
  public final void g(long paramLong, String paramString, ArrayList paramArrayList)
  {
    if (!"".equals(h)) {
      paramString = h;
    }
    if ((f(paramLong)) && ("div".equals(a)) && (i != null))
    {
      paramArrayList.add(new Pair(paramString, i));
      return;
    }
    for (int n = 0; n < c(); n++) {
      b(n).g(paramLong, paramString, paramArrayList);
    }
  }
  
  public final void h(long paramLong, Map paramMap1, Map paramMap2, String paramString, TreeMap paramTreeMap)
  {
    if (!f(paramLong)) {
      return;
    }
    String str;
    if ("".equals(h)) {
      str = paramString;
    } else {
      str = h;
    }
    Iterator localIterator = l.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramString = (Map.Entry)localIterator.next();
      Object localObject1 = (String)paramString.getKey();
      int n;
      if (k.containsKey(localObject1)) {
        n = ((Integer)k.get(localObject1)).intValue();
      } else {
        n = 0;
      }
      int i1 = ((Integer)paramString.getValue()).intValue();
      if (n != i1)
      {
        a.a locala = (a.a)paramTreeMap.get(localObject1);
        locala.getClass();
        paramString = (e)paramMap2.get(str);
        paramString.getClass();
        int i2 = j;
        f localf1 = a0.B(f, g, paramMap1);
        paramString = (SpannableStringBuilder)a;
        localObject1 = paramString;
        if (paramString == null)
        {
          localObject1 = new SpannableStringBuilder();
          a = ((CharSequence)localObject1);
        }
        if (localf1 != null)
        {
          paramString = j;
          int i3 = h;
          i4 = -1;
          if ((i3 != -1) || (i != -1))
          {
            if (i3 == 1) {
              i4 = 1;
            } else {
              i4 = 0;
            }
            if (i == 1) {
              i3 = 2;
            } else {
              i3 = 0;
            }
            i4 = i3 | i4;
          }
          if (i4 != -1)
          {
            i4 = h;
            if ((i4 == -1) && (i == -1))
            {
              i4 = -1;
            }
            else
            {
              if (i4 == 1) {
                i4 = 1;
              } else {
                i4 = 0;
              }
              if (i == 1) {
                i3 = 2;
              } else {
                i3 = 0;
              }
              i4 = i3 | i4;
            }
            ((Spannable)localObject1).setSpan(new StyleSpan(i4), n, i1, 33);
          }
          if (f == 1) {
            i4 = 1;
          } else {
            i4 = 0;
          }
          if (i4 != 0) {
            ((Spannable)localObject1).setSpan(new StrikethroughSpan(), n, i1, 33);
          }
          if (g == 1) {
            i4 = 1;
          } else {
            i4 = 0;
          }
          if (i4 != 0) {
            ((Spannable)localObject1).setSpan(new UnderlineSpan(), n, i1, 33);
          }
          if (c) {
            if (c) {
              x6.b.d((SpannableStringBuilder)localObject1, new ForegroundColorSpan(b), n, i1);
            } else {
              throw new IllegalStateException("Font color has not been defined.");
            }
          }
          if (e) {
            if (e) {
              x6.b.d((SpannableStringBuilder)localObject1, new BackgroundColorSpan(d), n, i1);
            } else {
              throw new IllegalStateException("Background color has not been defined.");
            }
          }
          if (a != null) {
            x6.b.d((SpannableStringBuilder)localObject1, new TypefaceSpan(a), n, i1);
          }
          Object localObject2 = r;
          if (localObject2 != null)
          {
            i3 = a;
            if (i3 == -1)
            {
              if ((i2 != 2) && (i2 != 1)) {
                i4 = 1;
              } else {
                i4 = 3;
              }
              i3 = i4;
              i4 = 1;
            }
            else
            {
              i4 = b;
            }
            int i5 = c;
            i2 = i5;
            if (i5 == -2) {
              i2 = 1;
            }
            x6.b.d((SpannableStringBuilder)localObject1, new l5.d(i3, i4, i2), n, i1);
          }
          i4 = m;
          label828:
          Object localObject3;
          if (i4 != 2)
          {
            if ((i4 == 3) || (i4 == 4))
            {
              paramString = new a();
              break label1072;
            }
          }
          else
          {
            while (paramString != null)
            {
              localObject2 = a0.B(f, g, paramMap1);
              if ((localObject2 != null) && (m == 1)) {
                break label828;
              }
              paramString = j;
            }
            paramString = null;
            if (paramString != null)
            {
              localObject3 = new ArrayDeque();
              ((ArrayDeque)localObject3).push(paramString);
              while (!((ArrayDeque)localObject3).isEmpty())
              {
                localObject2 = (d)((ArrayDeque)localObject3).pop();
                f localf2 = a0.B(f, g, paramMap1);
                if ((localf2 != null) && (m == 3)) {
                  break label938;
                }
                for (i4 = ((d)localObject2).c() - 1; i4 >= 0; i4--) {
                  ((ArrayDeque)localObject3).push(((d)localObject2).b(i4));
                }
              }
              localObject2 = null;
              label938:
              if (localObject2 == null) {
                break label1099;
              }
            }
          }
          if ((((d)localObject2).c() == 1) && (b0b != null))
          {
            localObject3 = b0b;
            i4 = e0.a;
            localObject2 = a0.B(f, g, paramMap1);
            if (localObject2 != null) {
              i4 = n;
            } else {
              i4 = -1;
            }
            i3 = i4;
            if (i4 == -1)
            {
              paramString = a0.B(f, g, paramMap1);
              i3 = i4;
              if (paramString != null) {
                i3 = n;
              }
            }
            paramString = new c((String)localObject3, i3);
            label1072:
            ((Spannable)localObject1).setSpan(paramString, n, i1, 33);
          }
          else
          {
            m.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
          }
          label1099:
          i4 = 0;
          if (q == 1) {
            i4 = 1;
          }
          if (i4 != 0) {
            x6.b.d((SpannableStringBuilder)localObject1, new l5.a(), n, i1);
          }
          i4 = j;
          if (i4 != 1)
          {
            if (i4 != 2)
            {
              if (i4 != 3) {
                break label1228;
              }
              paramString = new RelativeSizeSpan(k / 100.0F);
            }
            else
            {
              paramString = new RelativeSizeSpan(k);
            }
          }
          else {
            paramString = new AbsoluteSizeSpan((int)k, true);
          }
          x6.b.d((SpannableStringBuilder)localObject1, paramString, n, i1);
          label1228:
          if ("p".equals(a))
          {
            float f1 = s;
            if (f1 != Float.MAX_VALUE) {
              q = (f1 * -90.0F / 100.0F);
            }
            paramString = o;
            if (paramString != null) {
              c = paramString;
            }
            paramString = p;
            if (paramString != null) {
              d = paramString;
            }
          }
        }
      }
    }
    for (int i4 = 0; i4 < c(); i4++) {
      b(i4).h(paramLong, paramMap1, paramMap2, str, paramTreeMap);
    }
  }
  
  public final void i(long paramLong, boolean paramBoolean, String paramString, TreeMap paramTreeMap)
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
      paramString = e(paramString, paramTreeMap);
      paramTreeMap = b;
      paramTreeMap.getClass();
      paramString.append(paramTreeMap);
    }
    else if (("br".equals(a)) && (paramBoolean))
    {
      e(paramString, paramTreeMap).append('\n');
    }
    else if (f(paramLong))
    {
      Iterator localIterator = paramTreeMap.entrySet().iterator();
      Object localObject3;
      while (localIterator.hasNext())
      {
        Object localObject1 = (Map.Entry)localIterator.next();
        localObject2 = k;
        localObject3 = (String)((Map.Entry)localObject1).getKey();
        localObject1 = getValuea;
        localObject1.getClass();
        ((HashMap)localObject2).put(localObject3, Integer.valueOf(((CharSequence)localObject1).length()));
      }
      boolean bool1 = "p".equals(a);
      for (int n = 0; n < c(); n++)
      {
        localObject2 = b(n);
        boolean bool2;
        if ((!paramBoolean) && (!bool1)) {
          bool2 = false;
        } else {
          bool2 = true;
        }
        ((d)localObject2).i(paramLong, bool2, paramString, paramTreeMap);
      }
      if (bool1)
      {
        paramString = e(paramString, paramTreeMap);
        n = paramString.length();
        do
        {
          n--;
        } while ((n >= 0) && (paramString.charAt(n) == ' '));
        if ((n >= 0) && (paramString.charAt(n) != '\n')) {
          paramString.append('\n');
        }
      }
      Object localObject2 = paramTreeMap.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        paramString = l;
        paramTreeMap = (String)((Map.Entry)localObject3).getKey();
        localObject3 = getValuea;
        localObject3.getClass();
        paramString.put(paramTreeMap, Integer.valueOf(((CharSequence)localObject3).length()));
      }
    }
  }
}

/* Location:
 * Qualified Name:     o5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
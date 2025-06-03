package o5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import h5.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import v5.e0;

public final class g
  implements h5.g
{
  public final d a;
  public final long[] b;
  public final Map<String, f> c;
  public final Map<String, e> d;
  public final Map<String, String> e;
  
  public g(d paramd, HashMap paramHashMap1, HashMap paramHashMap2, HashMap paramHashMap3)
  {
    a = paramd;
    d = paramHashMap2;
    e = paramHashMap3;
    c = Collections.unmodifiableMap(paramHashMap1);
    paramHashMap1 = new TreeSet();
    int i = 0;
    paramd.d(paramHashMap1, false);
    paramd = new long[paramHashMap1.size()];
    paramHashMap1 = paramHashMap1.iterator();
    while (paramHashMap1.hasNext())
    {
      paramd[i] = ((Long)paramHashMap1.next()).longValue();
      i++;
    }
    b = paramd;
  }
  
  public final int f(long paramLong)
  {
    int i = e0.b(b, paramLong, false);
    if (i >= b.length) {
      i = -1;
    }
    return i;
  }
  
  public final long g(int paramInt)
  {
    return b[paramInt];
  }
  
  public final List<h5.a> h(long paramLong)
  {
    Object localObject1 = a;
    Object localObject2 = c;
    Map localMap = d;
    Object localObject3 = e;
    localObject1.getClass();
    Object localObject4 = new ArrayList();
    ((d)localObject1).g(paramLong, h, (ArrayList)localObject4);
    Object localObject5 = new TreeMap();
    ((d)localObject1).i(paramLong, false, h, (TreeMap)localObject5);
    ((d)localObject1).h(paramLong, (Map)localObject2, localMap, h, (TreeMap)localObject5);
    localObject1 = new ArrayList();
    localObject4 = ((ArrayList)localObject4).iterator();
    Object localObject6;
    Object localObject7;
    while (((Iterator)localObject4).hasNext())
    {
      localObject6 = (Pair)((Iterator)localObject4).next();
      localObject2 = (String)((Map)localObject3).get(second);
      if (localObject2 != null)
      {
        localObject2 = Base64.decode((String)localObject2, 0);
        localObject2 = BitmapFactory.decodeByteArray((byte[])localObject2, 0, localObject2.length);
        localObject6 = (e)localMap.get(first);
        localObject6.getClass();
        localObject7 = new a.a();
        b = ((Bitmap)localObject2);
        h = b;
        i = 0;
        e = c;
        f = 0;
        g = e;
        l = f;
        m = g;
        p = j;
        ((ArrayList)localObject1).add(((a.a)localObject7).a());
      }
    }
    localObject3 = ((TreeMap)localObject5).entrySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (Map.Entry)((Iterator)localObject3).next();
      localObject5 = (e)localMap.get(((Map.Entry)localObject4).getKey());
      localObject5.getClass();
      localObject4 = (a.a)((Map.Entry)localObject4).getValue();
      localObject2 = a;
      localObject2.getClass();
      localObject7 = (SpannableStringBuilder)localObject2;
      for (localObject6 : (a[])((SpannableStringBuilder)localObject7).getSpans(0, ((SpannableStringBuilder)localObject7).length(), a.class)) {
        ((SpannableStringBuilder)localObject7).replace(((SpannableStringBuilder)localObject7).getSpanStart(localObject6), ((SpannableStringBuilder)localObject7).getSpanEnd(localObject6), "");
      }
      for (??? = 0; ??? < ((SpannableStringBuilder)localObject7).length(); ???++) {
        if (((SpannableStringBuilder)localObject7).charAt(???) == ' ')
        {
          int k = ??? + 1;
          for (??? = k; (??? < ((SpannableStringBuilder)localObject7).length()) && (((SpannableStringBuilder)localObject7).charAt(???) == ' '); ???++) {}
          ??? -= k;
          if (??? > 0) {
            ((SpannableStringBuilder)localObject7).delete(???, ??? + ???);
          }
        }
      }
      if ((((SpannableStringBuilder)localObject7).length() > 0) && (((SpannableStringBuilder)localObject7).charAt(0) == ' ')) {
        ((SpannableStringBuilder)localObject7).delete(0, 1);
      }
      for (??? = 0; ??? < ((SpannableStringBuilder)localObject7).length() - 1; ???++) {
        if (((SpannableStringBuilder)localObject7).charAt(???) == '\n')
        {
          ??? = ??? + 1;
          if (((SpannableStringBuilder)localObject7).charAt(???) == ' ') {
            ((SpannableStringBuilder)localObject7).delete(???, ??? + 2);
          }
        }
      }
      if ((((SpannableStringBuilder)localObject7).length() > 0) && (((SpannableStringBuilder)localObject7).charAt(((SpannableStringBuilder)localObject7).length() - 1) == ' ')) {
        ((SpannableStringBuilder)localObject7).delete(((SpannableStringBuilder)localObject7).length() - 1, ((SpannableStringBuilder)localObject7).length());
      }
      for (??? = 0; ??? < ((SpannableStringBuilder)localObject7).length() - 1; ???++) {
        if (((SpannableStringBuilder)localObject7).charAt(???) == ' ')
        {
          ??? = ??? + 1;
          if (((SpannableStringBuilder)localObject7).charAt(???) == '\n') {
            ((SpannableStringBuilder)localObject7).delete(???, ???);
          }
        }
      }
      if ((((SpannableStringBuilder)localObject7).length() > 0) && (((SpannableStringBuilder)localObject7).charAt(((SpannableStringBuilder)localObject7).length() - 1) == '\n')) {
        ((SpannableStringBuilder)localObject7).delete(((SpannableStringBuilder)localObject7).length() - 1, ((SpannableStringBuilder)localObject7).length());
      }
      float f = c;
      ??? = d;
      e = f;
      f = ???;
      g = e;
      h = b;
      l = f;
      f = i;
      ??? = h;
      k = f;
      j = ???;
      p = j;
      ((ArrayList)localObject1).add(((a.a)localObject4).a());
    }
    return (List<h5.a>)localObject1;
  }
  
  public final int i()
  {
    return b.length;
  }
}

/* Location:
 * Qualified Name:     o5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
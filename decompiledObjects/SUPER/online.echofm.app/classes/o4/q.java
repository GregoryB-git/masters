package o4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class q
{
  public final SharedPreferences a;
  
  public q(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FirebaseHeartBeat");
    localStringBuilder.append(paramString);
    a = paramContext.getSharedPreferences(localStringBuilder.toString(), 0);
  }
  
  public final void a()
  {
    long l;
    Object localObject1;
    for (;;)
    {
      Map.Entry localEntry;
      try
      {
        l = a.getLong("fire-count", 0L);
        localObject1 = "";
        localObject2 = a.getAll().entrySet().iterator();
        Object localObject3 = null;
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        localEntry = (Map.Entry)((Iterator)localObject2).next();
        if (!(localEntry.getValue() instanceof Set)) {
          continue;
        }
        Iterator localIterator = ((Set)localEntry.getValue()).iterator();
        localObject5 = localObject3;
        localObject6 = localObject1;
        localObject1 = localObject6;
        localObject3 = localObject5;
        if (!localIterator.hasNext()) {
          continue;
        }
        localObject3 = (String)localIterator.next();
        if (localObject5 != null) {
          if (((String)localObject5).compareTo((String)localObject3) <= 0) {
            continue;
          }
        }
      }
      finally
      {
        break label254;
      }
      localObject6 = (String)localEntry.getKey();
      localObject5 = localObject4;
    }
    Object localObject5 = new java/util/HashSet;
    Object localObject2 = a;
    Object localObject6 = new java/util/HashSet;
    ((HashSet)localObject6).<init>();
    ((HashSet)localObject5).<init>(((SharedPreferences)localObject2).getStringSet((String)localObject1, (Set)localObject6));
    ((Set)localObject5).remove(localObject4);
    a.edit().putStringSet((String)localObject1, (Set)localObject5).putLong("fire-count", l - 1L).commit();
    return;
    label254:
    throw ((Throwable)localObject4);
  }
  
  public void b()
  {
    for (;;)
    {
      try
      {
        localEditor = a.edit();
        localIterator = a.getAll().entrySet().iterator();
        i = 0;
      }
      finally
      {
        SharedPreferences.Editor localEditor;
        Iterator localIterator;
        int i;
        Object localObject1;
        Object localObject2;
        String str;
        continue;
        localEditor.remove((String)localObject1);
        continue;
        if (i != 0) {
          continue;
        }
        localEditor.remove("fire-count");
        continue;
        localEditor.putLong("fire-count", i);
        localEditor.commit();
        return;
      }
      if (!localIterator.hasNext()) {
        continue;
      }
      localObject1 = (Map.Entry)localIterator.next();
      if ((((Map.Entry)localObject1).getValue() instanceof Set))
      {
        localObject2 = (Set)((Map.Entry)localObject1).getValue();
        str = d(System.currentTimeMillis());
        localObject1 = (String)((Map.Entry)localObject1).getKey();
        if (!((Set)localObject2).contains(str)) {
          continue;
        }
        localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>();
        ((Set)localObject2).add(str);
        i++;
        localEditor.putStringSet((String)localObject1, (Set)localObject2);
      }
    }
  }
  
  /* Error */
  public java.util.List c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 139	java/util/ArrayList
    //   5: astore_1
    //   6: aload_1
    //   7: invokespecial 140	java/util/ArrayList:<init>	()V
    //   10: aload_0
    //   11: getfield 34	o4/q:a	Landroid/content/SharedPreferences;
    //   14: invokeinterface 48 1 0
    //   19: invokeinterface 54 1 0
    //   24: invokeinterface 60 1 0
    //   29: astore_2
    //   30: aload_2
    //   31: invokeinterface 66 1 0
    //   36: ifeq +110 -> 146
    //   39: aload_2
    //   40: invokeinterface 70 1 0
    //   45: checkcast 72	java/util/Map$Entry
    //   48: astore_3
    //   49: aload_3
    //   50: invokeinterface 75 1 0
    //   55: instanceof 56
    //   58: ifeq -28 -> 30
    //   61: new 86	java/util/HashSet
    //   64: astore 4
    //   66: aload 4
    //   68: aload_3
    //   69: invokeinterface 75 1 0
    //   74: checkcast 56	java/util/Set
    //   77: invokespecial 94	java/util/HashSet:<init>	(Ljava/util/Collection;)V
    //   80: aload 4
    //   82: aload_0
    //   83: invokestatic 122	java/lang/System:currentTimeMillis	()J
    //   86: invokevirtual 126	o4/q:d	(J)Ljava/lang/String;
    //   89: invokeinterface 98 2 0
    //   94: pop
    //   95: aload 4
    //   97: invokeinterface 143 1 0
    //   102: ifne -72 -> 30
    //   105: aload_3
    //   106: invokeinterface 84 1 0
    //   111: checkcast 77	java/lang/String
    //   114: astore_3
    //   115: new 139	java/util/ArrayList
    //   118: astore 5
    //   120: aload 5
    //   122: aload 4
    //   124: invokespecial 144	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   127: aload_1
    //   128: aload_3
    //   129: aload 5
    //   131: invokestatic 149	o4/r:a	(Ljava/lang/String;Ljava/util/List;)Lo4/r;
    //   134: invokevirtual 150	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   137: pop
    //   138: goto -108 -> 30
    //   141: astore 4
    //   143: goto +14 -> 157
    //   146: aload_0
    //   147: invokestatic 122	java/lang/System:currentTimeMillis	()J
    //   150: invokevirtual 154	o4/q:l	(J)V
    //   153: aload_0
    //   154: monitorexit
    //   155: aload_1
    //   156: areturn
    //   157: aload_0
    //   158: monitorexit
    //   159: aload 4
    //   161: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	this	q
    //   5	151	1	localArrayList1	java.util.ArrayList
    //   29	11	2	localIterator	Iterator
    //   48	81	3	localObject1	Object
    //   64	59	4	localHashSet	HashSet
    //   141	19	4	localObject2	Object
    //   118	12	5	localArrayList2	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   2	30	141	finally
    //   30	138	141	finally
    //   146	153	141	finally
  }
  
  public final String d(long paramLong)
  {
    Object localObject3;
    label82:
    try
    {
      if (Build.VERSION.SDK_INT >= 26)
      {
        Object localObject1 = new java/util/Date;
        ((Date)localObject1).<init>(paramLong);
        localObject1 = p.a(n.a(m.a(k.a((Date)localObject1), l.a())), o.a());
        return (String)localObject1;
      }
    }
    finally
    {
      break label82;
      localObject3 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject3).<init>("yyyy-MM-dd", Locale.UK);
      Date localDate = new java/util/Date;
      localDate.<init>(paramLong);
      localObject3 = ((DateFormat)localObject3).format(localDate);
      return (String)localObject3;
    }
  }
  
  public final String e(String paramString)
  {
    label118:
    try
    {
      Map.Entry localEntry;
      Iterator localIterator2;
      do
      {
        Iterator localIterator1 = a.getAll().entrySet().iterator();
        while (!localIterator2.hasNext())
        {
          do
          {
            if (!localIterator1.hasNext()) {
              break;
            }
            localEntry = (Map.Entry)localIterator1.next();
          } while (!(localEntry.getValue() instanceof Set));
          localIterator2 = ((Set)localEntry.getValue()).iterator();
        }
      } while (!paramString.equals((String)localIterator2.next()));
      paramString = (String)localEntry.getKey();
      return paramString;
    }
    finally
    {
      break label118;
      return null;
    }
  }
  
  public boolean f(long paramLong1, long paramLong2)
  {
    try
    {
      boolean bool = d(paramLong1).equals(d(paramLong2));
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void g()
  {
    try
    {
      String str = d(System.currentTimeMillis());
      a.edit().putString("last-used-date", str).commit();
      h(str);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void h(String paramString)
  {
    for (;;)
    {
      String str;
      HashSet localHashSet1;
      try
      {
        str = e(paramString);
        if (str == null) {
          return;
        }
        localHashSet1 = new java/util/HashSet;
        SharedPreferences localSharedPreferences = a;
        HashSet localHashSet2 = new java/util/HashSet;
        localHashSet2.<init>();
        localHashSet1.<init>(localSharedPreferences.getStringSet(str, localHashSet2));
        localHashSet1.remove(paramString);
        if (localHashSet1.isEmpty())
        {
          paramString = a.edit().remove(str);
          paramString.commit();
        }
      }
      finally
      {
        break;
      }
      paramString = a.edit().putStringSet(str, localHashSet1);
    }
    return;
    throw paramString;
  }
  
  public boolean i(long paramLong)
  {
    try
    {
      boolean bool = j("fire-global", paramLong);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean j(String paramString, long paramLong)
  {
    label96:
    try
    {
      if (a.contains(paramString)) {
        if (!f(a.getLong(paramString, -1L), paramLong))
        {
          a.edit().putLong(paramString, paramLong).commit();
          return true;
        }
      }
    }
    finally
    {
      break label96;
      return false;
      a.edit().putLong(paramString, paramLong).commit();
      return true;
    }
  }
  
  public void k(long paramLong, String paramString)
  {
    label212:
    try
    {
      str = d(paramLong);
      if (a.getString("last-used-date", "").equals(str))
      {
        localObject = e(str);
        if (localObject == null) {
          return;
        }
        boolean bool = ((String)localObject).equals(paramString);
        if (bool) {
          return;
        }
        m(paramString, str);
        return;
      }
    }
    finally
    {
      String str;
      break label212;
      long l = a.getLong("fire-count", 0L);
      paramLong = l;
      if (l + 1L == 30L)
      {
        a();
        paramLong = a.getLong("fire-count", 0L);
      }
      HashSet localHashSet = new java/util/HashSet;
      SharedPreferences localSharedPreferences = a;
      Object localObject = new java/util/HashSet;
      ((HashSet)localObject).<init>();
      localHashSet.<init>(localSharedPreferences.getStringSet(paramString, (Set)localObject));
      localHashSet.add(str);
      a.edit().putStringSet(paramString, localHashSet).putLong("fire-count", paramLong + 1L).putString("last-used-date", str).commit();
      return;
    }
  }
  
  public void l(long paramLong)
  {
    try
    {
      a.edit().putLong("fire-global", paramLong).commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void m(String paramString1, String paramString2)
  {
    try
    {
      h(paramString2);
      HashSet localHashSet1 = new java/util/HashSet;
      SharedPreferences localSharedPreferences = a;
      HashSet localHashSet2 = new java/util/HashSet;
      localHashSet2.<init>();
      localHashSet1.<init>(localSharedPreferences.getStringSet(paramString1, localHashSet2));
      localHashSet1.add(paramString2);
      a.edit().putStringSet(paramString1, localHashSet1).commit();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
}

/* Location:
 * Qualified Name:     o4.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
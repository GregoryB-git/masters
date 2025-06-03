package q9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class g
{
  public final SharedPreferences a;
  
  public g(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FirebaseHeartBeat");
    localStringBuilder.append(paramString);
    a = paramContext.getSharedPreferences(localStringBuilder.toString(), 0);
  }
  
  public final void a()
  {
    try
    {
      long l = a.getLong("fire-count", 0L);
      Object localObject1 = null;
      Object localObject2 = "";
      Object localObject4 = a.getAll().entrySet().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject4).next();
        if ((localEntry.getValue() instanceof Set))
        {
          Iterator localIterator = ((Set)localEntry.getValue()).iterator();
          localObject5 = localObject2;
          for (localObject6 = localObject1;; localObject6 = localObject2)
          {
            do
            {
              localObject1 = localObject6;
              localObject2 = localObject5;
              if (!localIterator.hasNext()) {
                break;
              }
              localObject2 = (String)localIterator.next();
            } while ((localObject6 != null) && (((String)localObject6).compareTo((String)localObject2) <= 0));
            localObject5 = (String)localEntry.getKey();
          }
        }
      }
      localObject4 = new java/util/HashSet;
      Object localObject5 = a;
      Object localObject6 = new java/util/HashSet;
      ((HashSet)localObject6).<init>();
      ((HashSet)localObject4).<init>(((SharedPreferences)localObject5).getStringSet((String)localObject2, (Set)localObject6));
      ((HashSet)localObject4).remove(localObject1);
      a.edit().putStringSet((String)localObject2, (Set)localObject4).putLong("fire-count", l - 1L).commit();
      return;
    }
    finally {}
  }
  
  public final void b()
  {
    try
    {
      SharedPreferences.Editor localEditor = a.edit();
      int i = 0;
      Iterator localIterator = a.getAll().entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (Map.Entry)localIterator.next();
        if ((((Map.Entry)localObject1).getValue() instanceof Set))
        {
          Object localObject2 = (Set)((Map.Entry)localObject1).getValue();
          String str = d(System.currentTimeMillis());
          localObject1 = (String)((Map.Entry)localObject1).getKey();
          if (((Set)localObject2).contains(str))
          {
            localObject2 = new java/util/HashSet;
            ((HashSet)localObject2).<init>();
            ((HashSet)localObject2).add(str);
            i++;
            localEditor.putStringSet((String)localObject1, (Set)localObject2);
          }
          else
          {
            localEditor.remove((String)localObject1);
          }
        }
      }
      if (i == 0) {
        localEditor.remove("fire-count");
      } else {
        localEditor.putLong("fire-count", i);
      }
      localEditor.commit();
      return;
    }
    finally {}
  }
  
  /* Error */
  public final java.util.ArrayList c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 138	java/util/ArrayList
    //   5: astore_1
    //   6: aload_1
    //   7: invokespecial 139	java/util/ArrayList:<init>	()V
    //   10: aload_0
    //   11: getfield 32	q9/g:a	Landroid/content/SharedPreferences;
    //   14: invokeinterface 47 1 0
    //   19: invokeinterface 53 1 0
    //   24: invokeinterface 59 1 0
    //   29: astore_2
    //   30: aload_2
    //   31: invokeinterface 65 1 0
    //   36: ifeq +109 -> 145
    //   39: aload_2
    //   40: invokeinterface 69 1 0
    //   45: checkcast 71	java/util/Map$Entry
    //   48: astore_3
    //   49: aload_3
    //   50: invokeinterface 74 1 0
    //   55: instanceof 55
    //   58: ifeq -28 -> 30
    //   61: new 85	java/util/HashSet
    //   64: astore 4
    //   66: aload 4
    //   68: aload_3
    //   69: invokeinterface 74 1 0
    //   74: checkcast 55	java/util/Set
    //   77: invokespecial 93	java/util/HashSet:<init>	(Ljava/util/Collection;)V
    //   80: aload 4
    //   82: aload_0
    //   83: invokestatic 121	java/lang/System:currentTimeMillis	()J
    //   86: invokevirtual 125	q9/g:d	(J)Ljava/lang/String;
    //   89: invokevirtual 97	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   92: pop
    //   93: aload 4
    //   95: invokevirtual 142	java/util/HashSet:isEmpty	()Z
    //   98: ifne -68 -> 30
    //   101: aload_3
    //   102: invokeinterface 83 1 0
    //   107: checkcast 76	java/lang/String
    //   110: astore 5
    //   112: new 138	java/util/ArrayList
    //   115: astore_3
    //   116: aload_3
    //   117: aload 4
    //   119: invokespecial 143	java/util/ArrayList:<init>	(Ljava/util/Collection;)V
    //   122: new 145	q9/a
    //   125: astore 4
    //   127: aload 4
    //   129: aload 5
    //   131: aload_3
    //   132: invokespecial 148	q9/a:<init>	(Ljava/lang/String;Ljava/util/ArrayList;)V
    //   135: aload_1
    //   136: aload 4
    //   138: invokevirtual 149	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   141: pop
    //   142: goto -112 -> 30
    //   145: invokestatic 121	java/lang/System:currentTimeMillis	()J
    //   148: lstore 6
    //   150: aload_0
    //   151: monitorenter
    //   152: aload_0
    //   153: getfield 32	q9/g:a	Landroid/content/SharedPreferences;
    //   156: invokeinterface 101 1 0
    //   161: ldc -105
    //   163: lload 6
    //   165: invokeinterface 111 4 0
    //   170: invokeinterface 114 1 0
    //   175: pop
    //   176: aload_0
    //   177: monitorexit
    //   178: aload_0
    //   179: monitorexit
    //   180: aload_1
    //   181: areturn
    //   182: astore_2
    //   183: aload_0
    //   184: monitorexit
    //   185: aload_2
    //   186: athrow
    //   187: astore_2
    //   188: aload_0
    //   189: monitorexit
    //   190: aload_2
    //   191: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	this	g
    //   5	176	1	localArrayList	java.util.ArrayList
    //   29	11	2	localIterator	Iterator
    //   182	4	2	localObject1	Object
    //   187	4	2	localObject2	Object
    //   48	84	3	localObject3	Object
    //   64	73	4	localObject4	Object
    //   110	20	5	str	String
    //   148	16	6	l	long
    // Exception table:
    //   from	to	target	type
    //   152	176	182	finally
    //   2	30	187	finally
    //   30	142	187	finally
    //   145	152	187	finally
    //   176	178	187	finally
    //   183	187	187	finally
  }
  
  public final String d(long paramLong)
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 26)
      {
        localObject1 = new java/util/Date;
        ((Date)localObject1).<init>(paramLong);
        localObject1 = ((Date)localObject1).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        return (String)localObject1;
      }
      Object localObject1 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject1).<init>("yyyy-MM-dd", Locale.UK);
      Date localDate = new java/util/Date;
      localDate.<init>(paramLong);
      localObject1 = ((DateFormat)localObject1).format(localDate);
      return (String)localObject1;
    }
    finally {}
  }
  
  public final String e(String paramString)
  {
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
      return null;
    }
    finally {}
  }
  
  public final void f(String paramString)
  {
    try
    {
      String str = e(paramString);
      if (str == null) {
        return;
      }
      HashSet localHashSet1 = new java/util/HashSet;
      SharedPreferences localSharedPreferences = a;
      HashSet localHashSet2 = new java/util/HashSet;
      localHashSet2.<init>();
      localHashSet1.<init>(localSharedPreferences.getStringSet(str, localHashSet2));
      localHashSet1.remove(paramString);
      if (localHashSet1.isEmpty()) {}
      for (paramString = a.edit().remove(str);; paramString = a.edit().putStringSet(str, localHashSet1))
      {
        paramString.commit();
        break;
      }
      return;
    }
    finally {}
  }
  
  public final boolean g(long paramLong)
  {
    try
    {
      if (a.contains("fire-global"))
      {
        long l = a.getLong("fire-global", -1L);
        try
        {
          boolean bool = d(l).equals(d(paramLong));
          if (!bool)
          {
            a.edit().putLong("fire-global", paramLong).commit();
            return true;
          }
          return false;
        }
        finally
        {
          localObject1 = finally;
          throw ((Throwable)localObject1);
        }
      }
      a.edit().putLong("fire-global", paramLong).commit();
      return true;
    }
    finally {}
  }
  
  public final void h(String paramString, long paramLong)
  {
    try
    {
      String str = d(paramLong);
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
        i(paramString, str);
        return;
      }
      long l = a.getLong("fire-count", 0L);
      paramLong = l;
      if (l + 1L == 30L)
      {
        a();
        paramLong = a.getLong("fire-count", 0L);
      }
      HashSet localHashSet1 = new java/util/HashSet;
      Object localObject = a;
      HashSet localHashSet2 = new java/util/HashSet;
      localHashSet2.<init>();
      localHashSet1.<init>(((SharedPreferences)localObject).getStringSet(paramString, localHashSet2));
      localHashSet1.add(str);
      a.edit().putStringSet(paramString, localHashSet1).putLong("fire-count", paramLong + 1L).putString("last-used-date", str).commit();
      return;
    }
    finally {}
  }
  
  public final void i(String paramString1, String paramString2)
  {
    try
    {
      f(paramString2);
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
 * Qualified Name:     q9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
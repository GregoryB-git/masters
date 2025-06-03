package p1;

import android.util.Log;
import ec.i;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l.l;
import sb.q;
import sb.u;
import sb.x;
import t1.c;
import va.a;

public final class e
{
  public static final String[] o = { "UPDATE", "DELETE", "INSERT" };
  public final j a;
  public final Map<String, String> b;
  public final Map<String, Set<String>> c;
  public final LinkedHashMap d;
  public final String[] e;
  public final AtomicBoolean f;
  public volatile boolean g;
  public volatile t1.f h;
  public final b i;
  public final l j;
  public final n.b<c, d> k;
  public final Object l;
  public final Object m;
  public final f n;
  
  public e(j paramj, HashMap paramHashMap1, HashMap paramHashMap2, String... paramVarArgs)
  {
    a = paramj;
    b = paramHashMap1;
    c = paramHashMap2;
    int i1 = 0;
    f = new AtomicBoolean(false);
    i = new b(paramVarArgs.length);
    j = new l(paramj);
    k = new n.b();
    l = new Object();
    m = new Object();
    d = new LinkedHashMap();
    int i2 = paramVarArgs.length;
    paramHashMap2 = new String[i2];
    String str;
    while (i1 < i2)
    {
      paramHashMap1 = paramVarArgs[i1];
      paramj = Locale.US;
      i.d(paramj, "US");
      paramHashMap1 = paramHashMap1.toLowerCase(paramj);
      i.d(paramHashMap1, "this as java.lang.String).toLowerCase(locale)");
      d.put(paramHashMap1, Integer.valueOf(i1));
      str = (String)b.get(paramVarArgs[i1]);
      if (str != null)
      {
        paramj = str.toLowerCase(paramj);
        i.d(paramj, "this as java.lang.String).toLowerCase(locale)");
      }
      else
      {
        paramj = null;
      }
      if (paramj == null) {
        paramj = paramHashMap1;
      }
      paramHashMap2[i1] = paramj;
      i1++;
    }
    e = paramHashMap2;
    paramHashMap1 = b.entrySet().iterator();
    while (paramHashMap1.hasNext())
    {
      paramj = (Map.Entry)paramHashMap1.next();
      paramHashMap2 = (String)paramj.getValue();
      paramVarArgs = Locale.US;
      i.d(paramVarArgs, "US");
      paramHashMap2 = paramHashMap2.toLowerCase(paramVarArgs);
      i.d(paramHashMap2, "this as java.lang.String).toLowerCase(locale)");
      if (d.containsKey(paramHashMap2))
      {
        str = ((String)paramj.getKey()).toLowerCase(paramVarArgs);
        i.d(str, "this as java.lang.String).toLowerCase(locale)");
        paramVarArgs = d;
        i.e(paramVarArgs, "<this>");
        if ((paramVarArgs instanceof x))
        {
          paramj = ((x)paramVarArgs).a();
        }
        else
        {
          paramj = paramVarArgs.get(paramHashMap2);
          if ((paramj == null) && (!paramVarArgs.containsKey(paramHashMap2)))
          {
            paramj = new StringBuilder();
            paramj.append("Key ");
            paramj.append(paramHashMap2);
            paramj.append(" is missing in the map.");
            throw new NoSuchElementException(paramj.toString());
          }
        }
        paramVarArgs.put(str, paramj);
      }
    }
    n = new f(this);
  }
  
  public final void a(c paramc)
  {
    ??? = d(a);
    Object localObject3 = new ArrayList(???.length);
    int i1 = ???.length;
    int i2 = 0;
    int i3 = 0;
    while (i3 < i1)
    {
      localObject4 = ???[i3];
      Object localObject5 = d;
      Object localObject6 = Locale.US;
      i.d(localObject6, "US");
      localObject6 = ((String)localObject4).toLowerCase((Locale)localObject6);
      i.d(localObject6, "this as java.lang.String).toLowerCase(locale)");
      localObject5 = (Integer)((LinkedHashMap)localObject5).get(localObject6);
      if (localObject5 != null)
      {
        ((ArrayList)localObject3).add(Integer.valueOf(((Integer)localObject5).intValue()));
        i3++;
      }
      else
      {
        throw new IllegalArgumentException(g.d("There is no table with name ", (String)localObject4));
      }
    }
    Object localObject4 = q.t((ArrayList)localObject3);
    localObject3 = new d(paramc, (int[])localObject4, (String[])???);
    synchronized (k)
    {
      paramc = (d)k.h(paramc, localObject3);
      if (paramc == null)
      {
        paramc = i;
        localObject4 = Arrays.copyOf((int[])localObject4, localObject4.length);
        paramc.getClass();
        i.e(localObject4, "tableIds");
        try
        {
          int i4 = localObject4.length;
          i1 = 0;
          i3 = i2;
          i2 = i1;
          while (i3 < i4)
          {
            i1 = localObject4[i3];
            ??? = a;
            long l1 = ???[i1];
            ???[i1] = (1L + l1);
            if (l1 == 0L)
            {
              d = true;
              i2 = 1;
            }
            i3++;
          }
          ??? = rb.h.a;
          if ((i2 != 0) && (a.k())) {
            g(a.g().getWritableDatabase());
          }
        }
        finally {}
      }
      return;
    }
  }
  
  public final boolean b()
  {
    if (!a.k()) {
      return false;
    }
    if (!g) {
      a.g().getWritableDatabase();
    }
    if (!g)
    {
      Log.e("ROOM", "database is not initialized even though it is open");
      return false;
    }
    return true;
  }
  
  public final void c(c paramc)
  {
    i.e(paramc, "observer");
    synchronized (k)
    {
      Object localObject3 = (d)k.i(paramc);
      if (localObject3 != null)
      {
        paramc = i;
        ??? = b;
        ??? = Arrays.copyOf((int[])???, ???.length);
        paramc.getClass();
        i.e(???, "tableIds");
        try
        {
          int i1 = ???.length;
          int i2 = 0;
          int i3 = 0;
          while (i2 < i1)
          {
            int i4 = ???[i2];
            localObject3 = a;
            long l1 = localObject3[i4];
            localObject3[i4] = (l1 - 1L);
            if (l1 == 1L)
            {
              d = true;
              i3 = 1;
            }
            i2++;
          }
          ??? = rb.h.a;
          if ((i3 != 0) && (a.k())) {
            g(a.g().getWritableDatabase());
          }
        }
        finally {}
      }
      return;
    }
  }
  
  public final String[] d(String[] paramArrayOfString)
  {
    tb.g localg = new tb.g();
    int i1 = paramArrayOfString.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = paramArrayOfString[i2];
      Map localMap = c;
      Locale localLocale = Locale.US;
      i.d(localLocale, "US");
      String str = ((String)localObject).toLowerCase(localLocale);
      i.d(str, "this as java.lang.String).toLowerCase(locale)");
      if (localMap.containsKey(str))
      {
        localMap = c;
        localObject = ((String)localObject).toLowerCase(localLocale);
        i.d(localObject, "this as java.lang.String).toLowerCase(locale)");
        localObject = localMap.get(localObject);
        i.b(localObject);
        localg.addAll((Collection)localObject);
      }
      else
      {
        localg.add(localObject);
      }
    }
    paramArrayOfString = a.a(localg).toArray(new String[0]);
    i.c(paramArrayOfString, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    return (String[])paramArrayOfString;
  }
  
  public final void e(t1.b paramb, int paramInt)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
    ((StringBuilder)localObject1).append(paramInt);
    ((StringBuilder)localObject1).append(", 0)");
    paramb.m(((StringBuilder)localObject1).toString());
    localObject1 = e[paramInt];
    String[] arrayOfString = o;
    for (int i1 = 0; i1 < 3; i1++)
    {
      String str = arrayOfString[i1];
      Object localObject2 = f.l("CREATE TEMP TRIGGER IF NOT EXISTS ");
      ((StringBuilder)localObject2).append(a.a((String)localObject1, str));
      ((StringBuilder)localObject2).append(" AFTER ");
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(" ON `");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("` BEGIN UPDATE ");
      ((StringBuilder)localObject2).append("room_table_modification_log");
      ((StringBuilder)localObject2).append(" SET ");
      ((StringBuilder)localObject2).append("invalidated");
      ((StringBuilder)localObject2).append(" = 1");
      ((StringBuilder)localObject2).append(" WHERE ");
      ((StringBuilder)localObject2).append("table_id");
      ((StringBuilder)localObject2).append(" = ");
      ((StringBuilder)localObject2).append(paramInt);
      ((StringBuilder)localObject2).append(" AND ");
      ((StringBuilder)localObject2).append("invalidated");
      ((StringBuilder)localObject2).append(" = 0");
      ((StringBuilder)localObject2).append("; END");
      localObject2 = ((StringBuilder)localObject2).toString();
      i.d(localObject2, "StringBuilder().apply(builderAction).toString()");
      paramb.m((String)localObject2);
    }
  }
  
  public final void f(t1.b paramb, int paramInt)
  {
    String str1 = e[paramInt];
    String[] arrayOfString = o;
    for (paramInt = 0; paramInt < 3; paramInt++)
    {
      String str2 = arrayOfString[paramInt];
      Object localObject = f.l("DROP TRIGGER IF EXISTS ");
      ((StringBuilder)localObject).append(a.a(str1, str2));
      localObject = ((StringBuilder)localObject).toString();
      i.d(localObject, "StringBuilder().apply(builderAction).toString()");
      paramb.m((String)localObject);
    }
  }
  
  /* Error */
  public final void g(t1.b paramb)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 61
    //   3: invokestatic 66	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: invokeinterface 386 1 0
    //   12: ifeq +4 -> 16
    //   15: return
    //   16: aload_0
    //   17: getfield 70	p1/e:a	Lp1/j;
    //   20: getfield 389	p1/j:i	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   23: invokevirtual 395	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   26: astore_2
    //   27: aload_2
    //   28: ldc_w 397
    //   31: invokestatic 116	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   34: aload_2
    //   35: invokeinterface 402 1 0
    //   40: aload_0
    //   41: getfield 100	p1/e:l	Ljava/lang/Object;
    //   44: astore_3
    //   45: aload_3
    //   46: monitorenter
    //   47: aload_0
    //   48: getfield 86	p1/e:i	Lp1/e$b;
    //   51: invokevirtual 405	p1/e$b:a	()[I
    //   54: astore 4
    //   56: aload 4
    //   58: ifnonnull +12 -> 70
    //   61: aload_3
    //   62: monitorexit
    //   63: aload_2
    //   64: invokeinterface 408 1 0
    //   69: return
    //   70: aload_1
    //   71: invokeinterface 411 1 0
    //   76: ifeq +12 -> 88
    //   79: aload_1
    //   80: invokeinterface 414 1 0
    //   85: goto +9 -> 94
    //   88: aload_1
    //   89: invokeinterface 416 1 0
    //   94: aload 4
    //   96: arraylength
    //   97: istore 5
    //   99: iconst_0
    //   100: istore 6
    //   102: iconst_0
    //   103: istore 7
    //   105: iload 6
    //   107: iload 5
    //   109: if_icmpge +51 -> 160
    //   112: aload 4
    //   114: iload 6
    //   116: iaload
    //   117: istore 8
    //   119: iload 8
    //   121: iconst_1
    //   122: if_icmpeq +22 -> 144
    //   125: iload 8
    //   127: iconst_2
    //   128: if_icmpeq +6 -> 134
    //   131: goto +20 -> 151
    //   134: aload_0
    //   135: aload_1
    //   136: iload 7
    //   138: invokevirtual 418	p1/e:f	(Lt1/b;I)V
    //   141: goto +10 -> 151
    //   144: aload_0
    //   145: aload_1
    //   146: iload 7
    //   148: invokevirtual 420	p1/e:e	(Lt1/b;I)V
    //   151: iinc 6 1
    //   154: iinc 7 1
    //   157: goto -52 -> 105
    //   160: aload_1
    //   161: invokeinterface 423 1 0
    //   166: aload_1
    //   167: invokeinterface 426 1 0
    //   172: getstatic 267	rb/h:a	Lrb/h;
    //   175: astore_1
    //   176: aload_3
    //   177: monitorexit
    //   178: aload_2
    //   179: invokeinterface 408 1 0
    //   184: goto +44 -> 228
    //   187: astore 4
    //   189: aload_1
    //   190: invokeinterface 426 1 0
    //   195: aload 4
    //   197: athrow
    //   198: astore_1
    //   199: aload_3
    //   200: monitorexit
    //   201: aload_1
    //   202: athrow
    //   203: astore_1
    //   204: aload_2
    //   205: invokeinterface 408 1 0
    //   210: aload_1
    //   211: athrow
    //   212: astore_1
    //   213: goto +4 -> 217
    //   216: astore_1
    //   217: ldc_w 287
    //   220: ldc_w 428
    //   223: aload_1
    //   224: invokestatic 431	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   227: pop
    //   228: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	e
    //   0	229	1	paramb	t1.b
    //   26	179	2	localReadLock	java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock
    //   54	59	4	arrayOfInt	int[]
    //   187	9	4	localObject2	Object
    //   97	13	5	i1	int
    //   100	52	6	i2	int
    //   103	52	7	i3	int
    //   117	12	8	i4	int
    // Exception table:
    //   from	to	target	type
    //   94	99	187	finally
    //   134	141	187	finally
    //   144	151	187	finally
    //   160	166	187	finally
    //   47	56	198	finally
    //   70	85	198	finally
    //   88	94	198	finally
    //   166	176	198	finally
    //   189	198	198	finally
    //   40	47	203	finally
    //   61	63	203	finally
    //   176	178	203	finally
    //   199	203	203	finally
    //   16	40	212	android/database/sqlite/SQLiteException
    //   63	69	212	android/database/sqlite/SQLiteException
    //   178	184	212	android/database/sqlite/SQLiteException
    //   204	212	212	android/database/sqlite/SQLiteException
    //   16	40	216	java/lang/IllegalStateException
    //   63	69	216	java/lang/IllegalStateException
    //   178	184	216	java/lang/IllegalStateException
    //   204	212	216	java/lang/IllegalStateException
  }
  
  public static final class a
  {
    public static String a(String paramString1, String paramString2)
    {
      i.e(paramString1, "tableName");
      i.e(paramString2, "triggerType");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("`room_table_modification_trigger_");
      localStringBuilder.append(paramString1);
      localStringBuilder.append('_');
      localStringBuilder.append(paramString2);
      localStringBuilder.append('`');
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
  {
    public final long[] a;
    public final boolean[] b;
    public final int[] c;
    public boolean d;
    
    public b(int paramInt)
    {
      a = new long[paramInt];
      b = new boolean[paramInt];
      c = new int[paramInt];
    }
    
    public final int[] a()
    {
      try
      {
        int i = d;
        if (i == 0) {
          return null;
        }
        long[] arrayOfLong = a;
        int j = arrayOfLong.length;
        int k = 0;
        for (int m = k; k < j; m++)
        {
          long l = arrayOfLong[k];
          int n = 1;
          if (l > 0L) {
            i = 1;
          } else {
            i = 0;
          }
          boolean[] arrayOfBoolean = b;
          if (i != arrayOfBoolean[m])
          {
            arrayOfInt = c;
            if (i == 0) {
              n = 2;
            }
            arrayOfInt[m] = n;
          }
          else
          {
            c[m] = 0;
          }
          arrayOfBoolean[m] = i;
          k++;
        }
        d = false;
        int[] arrayOfInt = (int[])c.clone();
        return arrayOfInt;
      }
      finally {}
    }
  }
  
  public static abstract class c
  {
    public final String[] a;
    
    public c(String[] paramArrayOfString)
    {
      a = paramArrayOfString;
    }
    
    public abstract void a(Set<String> paramSet);
  }
  
  public static final class d
  {
    public final e.c a;
    public final int[] b;
    public final String[] c;
    public final Set<String> d;
    
    public d(e.c paramc, int[] paramArrayOfInt, String[] paramArrayOfString)
    {
      a = paramc;
      b = paramArrayOfInt;
      c = paramArrayOfString;
      int i = paramArrayOfString.length;
      int j = 1;
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i ^ 0x1) != 0)
      {
        paramc = Collections.singleton(paramArrayOfString[0]);
        i.d(paramc, "singleton(...)");
      }
      else
      {
        paramc = u.a;
      }
      d = paramc;
      if (paramArrayOfInt.length == paramArrayOfString.length) {
        i = j;
      } else {
        i = 0;
      }
      if (i != 0) {
        return;
      }
      throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void a(Set<Integer> paramSet)
    {
      i.e(paramSet, "invalidatedTablesIds");
      Object localObject = b;
      int i = localObject.length;
      if (i != 0)
      {
        int j = 0;
        if (i != 1)
        {
          localObject = new tb.g();
          int[] arrayOfInt = b;
          int k = arrayOfInt.length;
          for (i = 0; j < k; i++)
          {
            if (paramSet.contains(Integer.valueOf(arrayOfInt[j]))) {
              ((tb.g)localObject).add(c[i]);
            }
            j++;
          }
          paramSet = a.a((tb.g)localObject);
          break label126;
        }
        if (paramSet.contains(Integer.valueOf(localObject[0])))
        {
          paramSet = d;
          break label126;
        }
      }
      paramSet = u.a;
      label126:
      if ((paramSet.isEmpty() ^ true)) {
        a.a(paramSet);
      }
    }
    
    public final void b(String[] paramArrayOfString)
    {
      int i = c.length;
      if (i != 0)
      {
        int j = 0;
        if (i != 1)
        {
          tb.g localg = new tb.g();
          j = paramArrayOfString.length;
          for (i = 0; i < j; i++)
          {
            String str1 = paramArrayOfString[i];
            for (String str2 : c) {
              if (lc.h.k0(str2, str1)) {
                localg.add(str2);
              }
            }
          }
          paramArrayOfString = a.a(localg);
          break label167;
        }
        ??? = paramArrayOfString.length;
        for (i = 0;; i++)
        {
          ??? = j;
          if (i >= ???) {
            break;
          }
          if (lc.h.k0(paramArrayOfString[i], c[0]))
          {
            ??? = 1;
            break;
          }
        }
        if (??? != 0)
        {
          paramArrayOfString = d;
          break label167;
        }
      }
      paramArrayOfString = u.a;
      label167:
      if ((paramArrayOfString.isEmpty() ^ true)) {
        a.a(paramArrayOfString);
      }
    }
  }
  
  public static final class e
    extends e.c
  {
    public final e b;
    public final WeakReference<e.c> c;
    
    public e(e parame, m paramm)
    {
      super();
      b = parame;
      c = new WeakReference(paramm);
    }
    
    public final void a(Set<String> paramSet)
    {
      i.e(paramSet, "tables");
      e.c localc = (e.c)c.get();
      if (localc == null) {
        b.c(this);
      } else {
        localc.a(paramSet);
      }
    }
  }
}

/* Location:
 * Qualified Name:     p1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
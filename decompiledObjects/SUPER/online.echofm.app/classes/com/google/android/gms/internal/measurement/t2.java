package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public abstract class t2
{
  public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
  public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
  public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
  public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
  public static final AtomicBoolean e = new AtomicBoolean();
  public static ContentResolver f = null;
  public static HashMap g;
  public static final HashMap h = new HashMap(16, 1.0F);
  public static final HashMap i = new HashMap(16, 1.0F);
  public static final HashMap j = new HashMap(16, 1.0F);
  public static final HashMap k = new HashMap(16, 1.0F);
  public static Object l;
  public static boolean m;
  public static String[] n = new String[0];
  
  public static String a(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    int i1;
    try
    {
      localObject1 = g;
      i1 = 0;
      paramString2 = null;
      localObject2 = null;
      if (localObject1 == null)
      {
        e.set(false);
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>(16, 1.0F);
        g = (HashMap)localObject1;
        localObject1 = new java/lang/Object;
        localObject1.<init>();
        l = localObject1;
        m = false;
        Uri localUri = a;
        localObject1 = new com/google/android/gms/internal/measurement/w2;
        ((w2)localObject1).<init>(null);
        paramContentResolver.registerContentObserver(localUri, true, (ContentObserver)localObject1);
      }
    }
    finally
    {
      break label511;
    }
    if (e.getAndSet(false))
    {
      g.clear();
      h.clear();
      i.clear();
      j.clear();
      k.clear();
      localObject1 = new java/lang/Object;
      localObject1.<init>();
      l = localObject1;
      m = false;
    }
    Object localObject1 = l;
    if (g.containsKey(paramString1))
    {
      paramString1 = (String)g.get(paramString1);
      paramContentResolver = (ContentResolver)localObject2;
      if (paramString1 != null) {
        paramContentResolver = paramString1;
      }
      return paramContentResolver;
    }
    Object localObject2 = n;
    int i2 = localObject2.length;
    while (i1 < i2)
    {
      if (paramString1.startsWith(localObject2[i1]))
      {
        if (!m)
        {
          localObject2 = n;
          localObject1 = new com/google/android/gms/internal/measurement/v2;
          ((v2)localObject1).<init>();
          paramContentResolver = (HashMap)b(paramContentResolver, (String[])localObject2, (a)localObject1);
          if (paramContentResolver != null)
          {
            if (!paramContentResolver.isEmpty())
            {
              localObject2 = paramContentResolver.keySet();
              ((Set)localObject2).removeAll(h.keySet());
              ((Set)localObject2).removeAll(i.keySet());
              ((Set)localObject2).removeAll(j.keySet());
              ((Set)localObject2).removeAll(k.keySet());
            }
            if (!paramContentResolver.isEmpty()) {
              if (g.isEmpty()) {
                g = paramContentResolver;
              } else {
                g.putAll(paramContentResolver);
              }
            }
            m = true;
          }
          if (g.containsKey(paramString1))
          {
            paramString1 = (String)g.get(paramString1);
            paramContentResolver = paramString2;
            if (paramString1 != null) {
              paramContentResolver = paramString1;
            }
            return paramContentResolver;
          }
        }
        return null;
      }
      i1++;
    }
    paramContentResolver = paramContentResolver.query(a, null, null, new String[] { paramString1 }, null);
    if (paramContentResolver == null)
    {
      if (paramContentResolver != null) {
        paramContentResolver.close();
      }
      return null;
    }
    try
    {
      if (!paramContentResolver.moveToFirst())
      {
        d(localObject1, paramString1, null);
        paramContentResolver.close();
        return null;
      }
    }
    finally
    {
      break label503;
      paramString2 = paramContentResolver.getString(1);
      paramContentResolver.close();
      paramContentResolver = paramString2;
      if (paramString2 != null)
      {
        paramContentResolver = paramString2;
        if (paramString2.equals(null)) {
          paramContentResolver = null;
        }
      }
      d(localObject1, paramString1, paramContentResolver);
      if (paramContentResolver != null) {
        return paramContentResolver;
      }
      return null;
      label503:
      paramContentResolver.close();
    }
    label511:
    throw paramContentResolver;
  }
  
  /* Error */
  public static Map b(ContentResolver paramContentResolver, String[] paramArrayOfString, a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: getstatic 44	com/google/android/gms/internal/measurement/t2:b	Landroid/net/Uri;
    //   4: aconst_null
    //   5: aconst_null
    //   6: aload_1
    //   7: aconst_null
    //   8: invokevirtual 155	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   11: astore_0
    //   12: aload_0
    //   13: ifnonnull +5 -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: aload_2
    //   19: aload_0
    //   20: invokeinterface 177 1 0
    //   25: invokeinterface 180 2 0
    //   30: astore_1
    //   31: aload_0
    //   32: invokeinterface 183 1 0
    //   37: ifeq +31 -> 68
    //   40: aload_1
    //   41: aload_0
    //   42: iconst_0
    //   43: invokeinterface 170 2 0
    //   48: aload_0
    //   49: iconst_1
    //   50: invokeinterface 170 2 0
    //   55: invokeinterface 189 3 0
    //   60: pop
    //   61: goto -30 -> 31
    //   64: astore_1
    //   65: goto +11 -> 76
    //   68: aload_0
    //   69: invokeinterface 160 1 0
    //   74: aload_1
    //   75: areturn
    //   76: aload_0
    //   77: invokeinterface 160 1 0
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	paramContentResolver	ContentResolver
    //   0	84	1	paramArrayOfString	String[]
    //   0	84	2	parama	a
    // Exception table:
    //   from	to	target	type
    //   31	61	64	finally
  }
  
  public static void d(Object paramObject, String paramString1, String paramString2)
  {
    try
    {
      if (paramObject == l) {
        g.put(paramString1, paramString2);
      }
    }
    finally
    {
      break label30;
    }
    return;
    label30:
    throw ((Throwable)paramObject);
  }
  
  public static abstract interface a
  {
    public abstract Map e(int paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.t2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
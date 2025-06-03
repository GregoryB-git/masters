package com.yandex.metrica;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.f0;

@Deprecated
public class CounterConfiguration
  implements Parcelable
{
  public static final Parcelable.Creator<CounterConfiguration> CREATOR = new a();
  private final ContentValues a;
  
  public CounterConfiguration()
  {
    a = new ContentValues();
  }
  
  @VisibleForTesting
  public CounterConfiguration(ContentValues paramContentValues)
  {
    a = paramContentValues;
    r();
  }
  
  public CounterConfiguration(@NonNull CounterConfiguration paramCounterConfiguration)
  {
    try
    {
      ContentValues localContentValues = new android/content/ContentValues;
      localContentValues.<init>(a);
      a = localContentValues;
      r();
      return;
    }
    finally {}
  }
  
  public CounterConfiguration(@NonNull e parame)
  {
    this();
    try
    {
      a(apiKey);
      d(sessionTimeout);
      a(a);
      b(b);
      a(logs);
      c(statisticsSending);
      c(maxReportsInDatabaseCount);
      c(apiKey);
      return;
    }
    finally {}
  }
  
  public CounterConfiguration(i parami, @NonNull b paramb)
  {
    this();
    try
    {
      a(apiKey);
      d(sessionTimeout);
      f(parami);
      e(parami);
      c(parami);
      a(f);
      b(g);
      b(parami);
      a(parami);
      g(parami);
      d(parami);
      c(statisticsSending);
      c(maxReportsInDatabaseCount);
      b(nativeCrashReporting);
      h(parami);
      a(paramb);
      return;
    }
    finally {}
  }
  
  /* Error */
  public static CounterConfiguration a(Bundle paramBundle)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: ifnull +19 -> 22
    //   6: aload_0
    //   7: ldc -120
    //   9: invokevirtual 142	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   12: checkcast 2	com/yandex/metrica/CounterConfiguration
    //   15: astore_1
    //   16: goto +6 -> 22
    //   19: astore_0
    //   20: aconst_null
    //   21: areturn
    //   22: aload_1
    //   23: astore_2
    //   24: aload_1
    //   25: ifnonnull +11 -> 36
    //   28: new 2	com/yandex/metrica/CounterConfiguration
    //   31: dup
    //   32: invokespecial 44	com/yandex/metrica/CounterConfiguration:<init>	()V
    //   35: astore_2
    //   36: aload_2
    //   37: monitorenter
    //   38: aload_0
    //   39: ifnonnull +6 -> 45
    //   42: goto +173 -> 215
    //   45: aload_0
    //   46: ldc -112
    //   48: invokevirtual 150	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   51: ifeq +35 -> 86
    //   54: aload_0
    //   55: ldc -112
    //   57: invokevirtual 150	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   60: istore_3
    //   61: aload_2
    //   62: monitorenter
    //   63: aload_2
    //   64: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   67: ldc -112
    //   69: iload_3
    //   70: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   73: invokevirtual 160	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   76: aload_2
    //   77: monitorexit
    //   78: goto +8 -> 86
    //   81: astore_0
    //   82: aload_2
    //   83: monitorexit
    //   84: aload_0
    //   85: athrow
    //   86: aload_0
    //   87: ldc -94
    //   89: invokevirtual 150	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   92: ifeq +35 -> 127
    //   95: aload_0
    //   96: ldc -94
    //   98: invokevirtual 150	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   101: istore_3
    //   102: aload_2
    //   103: monitorenter
    //   104: aload_2
    //   105: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   108: ldc -94
    //   110: iload_3
    //   111: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   114: invokevirtual 160	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   117: aload_2
    //   118: monitorexit
    //   119: goto +8 -> 127
    //   122: astore_0
    //   123: aload_2
    //   124: monitorexit
    //   125: aload_0
    //   126: athrow
    //   127: aload_0
    //   128: ldc -92
    //   130: invokevirtual 150	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   133: ifeq +49 -> 182
    //   136: aload_0
    //   137: ldc -92
    //   139: invokevirtual 150	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   142: istore 4
    //   144: aload_2
    //   145: monitorenter
    //   146: aload_2
    //   147: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   150: astore_1
    //   151: iload 4
    //   153: istore_3
    //   154: iload 4
    //   156: ifgt +6 -> 162
    //   159: ldc -91
    //   161: istore_3
    //   162: aload_1
    //   163: ldc -92
    //   165: iload_3
    //   166: invokestatic 156	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   169: invokevirtual 160	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   172: aload_2
    //   173: monitorexit
    //   174: goto +8 -> 182
    //   177: astore_0
    //   178: aload_2
    //   179: monitorexit
    //   180: aload_0
    //   181: athrow
    //   182: aload_0
    //   183: ldc -89
    //   185: invokevirtual 171	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   188: ifnull +27 -> 215
    //   191: ldc -83
    //   193: aload_0
    //   194: ldc -89
    //   196: invokevirtual 171	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   199: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   202: ifne +13 -> 215
    //   205: aload_2
    //   206: aload_0
    //   207: ldc -89
    //   209: invokevirtual 171	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   212: invokevirtual 181	com/yandex/metrica/CounterConfiguration:b	(Ljava/lang/String;)V
    //   215: aload_2
    //   216: monitorexit
    //   217: aload_2
    //   218: areturn
    //   219: astore_0
    //   220: aload_2
    //   221: monitorexit
    //   222: aload_0
    //   223: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	paramBundle	Bundle
    //   1	162	1	localObject1	Object
    //   23	198	2	localObject2	Object
    //   60	106	3	i	int
    //   142	13	4	j	int
    // Exception table:
    //   from	to	target	type
    //   6	16	19	finally
    //   63	76	81	finally
    //   104	117	122	finally
    //   146	151	177	finally
    //   162	172	177	finally
    //   45	63	219	finally
    //   76	78	219	finally
    //   82	86	219	finally
    //   86	104	219	finally
    //   117	119	219	finally
    //   123	127	219	finally
    //   127	146	219	finally
    //   172	174	219	finally
    //   178	182	219	finally
    //   182	215	219	finally
  }
  
  private void a(i parami)
  {
    if (A2.a(e))
    {
      int i = e.intValue();
      try
      {
        a.put("CFG_APP_VERSION_CODE", String.valueOf(i));
      }
      finally
      {
        parami = finally;
        throw parami;
      }
    }
  }
  
  private void a(@Nullable Boolean paramBoolean)
  {
    if (A2.a(paramBoolean))
    {
      boolean bool = paramBoolean.booleanValue();
      try
      {
        a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(bool));
      }
      finally
      {
        paramBoolean = finally;
        throw paramBoolean;
      }
    }
  }
  
  private void a(@Nullable Integer paramInteger)
  {
    if (A2.a(paramInteger))
    {
      int i = paramInteger.intValue();
      try
      {
        a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(i));
      }
      finally
      {
        paramInteger = finally;
        throw paramInteger;
      }
    }
  }
  
  private void a(@Nullable String paramString)
  {
    if (A2.a(paramString)) {
      try
      {
        a.put("CFG_API_KEY", paramString);
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
  }
  
  private void b(i parami)
  {
    if (!TextUtils.isEmpty(appVersion))
    {
      parami = appVersion;
      try
      {
        a.put("CFG_APP_VERSION", parami);
      }
      finally
      {
        parami = finally;
        throw parami;
      }
    }
  }
  
  private void b(@Nullable Boolean paramBoolean)
  {
    if (A2.a(paramBoolean)) {
      a.put("CFG_NATIVE_CRASHES_ENABLED", paramBoolean);
    }
  }
  
  private void b(@Nullable Integer paramInteger)
  {
    if (A2.a(paramInteger))
    {
      int i = paramInteger.intValue();
      try
      {
        paramInteger = a;
        int j = i;
        if (i <= 0) {
          j = Integer.MAX_VALUE;
        }
        paramInteger.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(j));
      }
      finally {}
    }
  }
  
  private void c(i parami)
  {
    if (A2.a(a))
    {
      String str = a;
      try
      {
        ContentValues localContentValues = a;
        parami = str;
        if (TextUtils.isEmpty(str)) {
          parami = null;
        }
        localContentValues.put("CFG_DEVICE_SIZE_TYPE", parami);
      }
      finally {}
    }
  }
  
  private void c(@Nullable Boolean paramBoolean)
  {
    if (A2.a(paramBoolean)) {
      c(paramBoolean.booleanValue());
    }
  }
  
  private void c(@Nullable Integer paramInteger)
  {
    if (A2.a(paramInteger)) {
      a.put("MAX_REPORTS_IN_DB_COUNT", paramInteger);
    }
  }
  
  private void c(@Nullable String paramString)
  {
    if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(paramString)) {
      paramString = b.d;
    }
    try
    {
      a.put("CFG_REPORTER_TYPE", paramString.a());
    }
    finally {}
    try
    {
      a.put("CFG_REPORTER_TYPE", paramString.a());
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void d(i parami)
  {
    if (A2.a(firstActivationAsUpdate))
    {
      boolean bool = firstActivationAsUpdate.booleanValue();
      try
      {
        a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(bool));
      }
      finally
      {
        parami = finally;
        throw parami;
      }
    }
  }
  
  private void d(@Nullable Integer paramInteger)
  {
    if (A2.a(paramInteger))
    {
      int i = paramInteger.intValue();
      try
      {
        a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(i));
      }
      finally
      {
        paramInteger = finally;
        throw paramInteger;
      }
    }
  }
  
  private void e(i parami)
  {
    if (A2.a(locationTracking)) {
      b(locationTracking.booleanValue());
    }
  }
  
  private void f(i parami)
  {
    if (A2.a(location)) {
      a(location);
    }
  }
  
  private void g(i parami)
  {
    if (A2.a(j))
    {
      boolean bool = j.booleanValue();
      try
      {
        a.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf(bool));
      }
      finally
      {
        parami = finally;
        throw parami;
      }
    }
  }
  
  private void h(i parami)
  {
    if (A2.a(revenueAutoTrackingEnabled))
    {
      boolean bool = revenueAutoTrackingEnabled.booleanValue();
      try
      {
        a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(bool));
      }
      finally
      {
        parami = finally;
        throw parami;
      }
    }
  }
  
  /* Error */
  private void r()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   4: ldc -13
    //   6: invokevirtual 279	android/content/ContentValues:containsKey	(Ljava/lang/String;)Z
    //   9: ifeq +4 -> 13
    //   12: return
    //   13: aload_0
    //   14: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   17: ldc_w 281
    //   20: invokevirtual 279	android/content/ContentValues:containsKey	(Ljava/lang/String;)Z
    //   23: ifeq +57 -> 80
    //   26: aload_0
    //   27: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   30: ldc_w 281
    //   33: invokevirtual 285	android/content/ContentValues:getAsBoolean	(Ljava/lang/String;)Ljava/lang/Boolean;
    //   36: invokevirtual 206	java/lang/Boolean:booleanValue	()Z
    //   39: ifeq +30 -> 69
    //   42: getstatic 287	com/yandex/metrica/CounterConfiguration$b:b	Lcom/yandex/metrica/CounterConfiguration$b;
    //   45: astore_1
    //   46: aload_0
    //   47: monitorenter
    //   48: aload_0
    //   49: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   52: ldc -13
    //   54: aload_1
    //   55: invokevirtual 246	com/yandex/metrica/CounterConfiguration$b:a	()Ljava/lang/String;
    //   58: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: goto +67 -> 128
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    //   69: aload_0
    //   70: aload_0
    //   71: invokevirtual 288	com/yandex/metrica/CounterConfiguration:a	()Ljava/lang/String;
    //   74: invokespecial 91	com/yandex/metrica/CounterConfiguration:c	(Ljava/lang/String;)V
    //   77: goto +61 -> 138
    //   80: aload_0
    //   81: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   84: ldc_w 290
    //   87: invokevirtual 279	android/content/ContentValues:containsKey	(Ljava/lang/String;)Z
    //   90: ifeq +48 -> 138
    //   93: aload_0
    //   94: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   97: ldc_w 290
    //   100: invokevirtual 285	android/content/ContentValues:getAsBoolean	(Ljava/lang/String;)Ljava/lang/Boolean;
    //   103: invokevirtual 206	java/lang/Boolean:booleanValue	()Z
    //   106: ifeq +32 -> 138
    //   109: getstatic 292	com/yandex/metrica/CounterConfiguration$b:e	Lcom/yandex/metrica/CounterConfiguration$b;
    //   112: astore_1
    //   113: aload_0
    //   114: monitorenter
    //   115: aload_0
    //   116: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   119: ldc -13
    //   121: aload_1
    //   122: invokevirtual 246	com/yandex/metrica/CounterConfiguration$b:a	()Ljava/lang/String;
    //   125: invokevirtual 199	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload_0
    //   129: monitorexit
    //   130: goto +8 -> 138
    //   133: astore_1
    //   134: aload_0
    //   135: monitorexit
    //   136: aload_1
    //   137: athrow
    //   138: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	CounterConfiguration
    //   45	10	1	localb1	b
    //   64	4	1	localObject1	Object
    //   112	10	1	localb2	b
    //   133	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   48	61	64	finally
    //   115	128	133	finally
  }
  
  public String a()
  {
    return a.getAsString("CFG_API_KEY");
  }
  
  /* Error */
  public final void a(@Nullable android.location.Location paramLocation)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   6: astore_2
    //   7: getstatic 301	com/yandex/metrica/impl/ob/oc:q	I
    //   10: istore_3
    //   11: aconst_null
    //   12: astore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: aload_1
    //   18: ifnull +28 -> 46
    //   21: invokestatic 307	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   24: astore 4
    //   26: aload 4
    //   28: aload_1
    //   29: invokevirtual 311	android/os/Parcel:writeValue	(Ljava/lang/Object;)V
    //   32: aload 4
    //   34: invokevirtual 315	android/os/Parcel:marshall	()[B
    //   37: astore_1
    //   38: aload 4
    //   40: invokevirtual 318	android/os/Parcel:recycle	()V
    //   43: aload_1
    //   44: astore 4
    //   46: aload_2
    //   47: ldc_w 320
    //   50: aload 4
    //   52: invokevirtual 323	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: astore_1
    //   64: aload 5
    //   66: astore_1
    //   67: goto -29 -> 38
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	CounterConfiguration
    //   0	70	1	paramLocation	android.location.Location
    //   6	41	2	localContentValues	ContentValues
    //   10	1	3	i	int
    //   12	39	4	localObject1	Object
    //   15	50	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	58	finally
    //   21	26	58	finally
    //   38	43	58	finally
    //   46	55	58	finally
    //   26	38	63	finally
  }
  
  public void a(@NonNull b paramb)
  {
    try
    {
      a.put("CFG_REPORTER_TYPE", paramb.a());
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      a.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", Boolean.valueOf(paramBoolean));
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String b()
  {
    return a.getAsString("CFG_APP_VERSION_CODE");
  }
  
  @VisibleForTesting
  public void b(String paramString)
  {
    try
    {
      a.put("CFG_API_KEY", paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    try
    {
      a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(paramBoolean));
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String c()
  {
    return a.getAsString("CFG_APP_VERSION");
  }
  
  public final void c(boolean paramBoolean)
  {
    try
    {
      a.put("CFG_STATISTICS_SENDING", Boolean.valueOf(paramBoolean));
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Nullable
  public String d()
  {
    return a.getAsString("CFG_DEVICE_SIZE_TYPE");
  }
  
  public void d(String paramString)
  {
    try
    {
      a.put("CFG_UUID", paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public Integer e()
  {
    return a.getAsInteger("CFG_DISPATCH_PERIOD");
  }
  
  @Nullable
  public Boolean f()
  {
    return a.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
  }
  
  /* Error */
  public android.location.Location g()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   4: ldc_w 320
    //   7: invokevirtual 279	android/content/ContentValues:containsKey	(Ljava/lang/String;)Z
    //   10: istore_1
    //   11: aconst_null
    //   12: astore_2
    //   13: aload_2
    //   14: astore_3
    //   15: iload_1
    //   16: ifeq +80 -> 96
    //   19: aload_0
    //   20: getfield 31	com/yandex/metrica/CounterConfiguration:a	Landroid/content/ContentValues;
    //   23: ldc_w 320
    //   26: invokevirtual 343	android/content/ContentValues:getAsByteArray	(Ljava/lang/String;)[B
    //   29: astore 4
    //   31: getstatic 301	com/yandex/metrica/impl/ob/oc:q	I
    //   34: istore 5
    //   36: aload_2
    //   37: astore_3
    //   38: aload 4
    //   40: ifnull +56 -> 96
    //   43: invokestatic 307	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   46: astore 6
    //   48: aload 6
    //   50: aload 4
    //   52: iconst_0
    //   53: aload 4
    //   55: arraylength
    //   56: invokevirtual 347	android/os/Parcel:unmarshall	([BII)V
    //   59: aload 6
    //   61: iconst_0
    //   62: invokevirtual 351	android/os/Parcel:setDataPosition	(I)V
    //   65: aload 6
    //   67: ldc_w 353
    //   70: invokevirtual 359	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   73: invokevirtual 363	android/os/Parcel:readValue	(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    //   76: checkcast 353	android/location/Location
    //   79: astore_3
    //   80: aload 6
    //   82: invokevirtual 318	android/os/Parcel:recycle	()V
    //   85: goto +11 -> 96
    //   88: astore_3
    //   89: aload 6
    //   91: invokevirtual 318	android/os/Parcel:recycle	()V
    //   94: aload_2
    //   95: astore_3
    //   96: aload_3
    //   97: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	CounterConfiguration
    //   10	6	1	bool	boolean
    //   12	83	2	localObject1	Object
    //   14	66	3	localObject2	Object
    //   88	1	3	localObject3	Object
    //   95	2	3	localObject4	Object
    //   29	25	4	arrayOfByte	byte[]
    //   34	1	5	i	int
    //   46	44	6	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   48	80	88	finally
  }
  
  @Nullable
  public Integer h()
  {
    return a.getAsInteger("CFG_MAX_REPORTS_COUNT");
  }
  
  @Nullable
  public Integer i()
  {
    return a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
  }
  
  @Nullable
  public Boolean j()
  {
    return a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
  }
  
  @NonNull
  public b k()
  {
    return b.a(a.getAsString("CFG_REPORTER_TYPE"));
  }
  
  @Nullable
  public Integer l()
  {
    return a.getAsInteger("CFG_SESSION_TIMEOUT");
  }
  
  public Boolean m()
  {
    return a.getAsBoolean("CFG_STATISTICS_SENDING");
  }
  
  @Nullable
  public Boolean n()
  {
    return a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
  }
  
  @Nullable
  public Boolean o()
  {
    return a.getAsBoolean("CFG_LOCATION_TRACKING");
  }
  
  @Nullable
  public Boolean p()
  {
    return a.getAsBoolean("CFG_IS_LOG_ENABLED");
  }
  
  @Nullable
  public Boolean q()
  {
    try
    {
      Boolean localBoolean = a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
      return localBoolean;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String toString()
  {
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("CounterConfiguration{mParamsMapping=");
      ((StringBuilder)localObject1).append(a);
      ((StringBuilder)localObject1).append('}');
      localObject1 = ((StringBuilder)localObject1).toString();
      return (String)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", a);
      paramParcel.writeBundle(localBundle);
      return;
    }
    finally
    {
      paramParcel = finally;
      throw paramParcel;
    }
  }
  
  public class a
    implements Parcelable.Creator<CounterConfiguration>
  {
    public Object createFromParcel(Parcel paramParcel)
    {
      return new CounterConfiguration((ContentValues)paramParcel.readBundle(f0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
    }
    
    public Object[] newArray(int paramInt)
    {
      return new CounterConfiguration[paramInt];
    }
  }
  
  public static enum b
  {
    @NonNull
    private final String a;
    
    static
    {
      b localb1 = new b("MAIN", 0, "main");
      b = localb1;
      b localb2 = new b("MANUAL", 1, "manual");
      c = localb2;
      b localb3 = new b("APPMETRICA", 2, "appmetrica");
      d = localb3;
      b localb4 = new b("COMMUTATION", 3, "commutation");
      e = localb4;
      b localb5 = new b("SELF_DIAGNOSTIC_MAIN", 4, "self_diagnostic_main");
      f = localb5;
      b localb6 = new b("SELF_DIAGNOSTIC_MANUAL", 5, "self_diagnostic_manual");
      g = localb6;
      b localb7 = new b("CRASH", 6, "crash");
      h = localb7;
      i = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7 };
    }
    
    private b(@NonNull String paramString)
    {
      a = paramString;
    }
    
    @NonNull
    public static b a(@Nullable String paramString)
    {
      b[] arrayOfb = values();
      for (int j = 0; j < 7; j++)
      {
        b localb = arrayOfb[j];
        if (a.equals(paramString)) {
          return localb;
        }
      }
      return b;
    }
    
    @NonNull
    public String a()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.CounterConfiguration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
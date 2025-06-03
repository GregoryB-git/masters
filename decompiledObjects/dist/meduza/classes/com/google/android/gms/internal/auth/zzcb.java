package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class zzcb
{
  public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
  public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
  public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
  public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
  public static HashMap zze;
  public static final HashMap zzf = new HashMap(16, 1.0F);
  public static final HashMap zzg = new HashMap(16, 1.0F);
  public static final HashMap zzh = new HashMap(16, 1.0F);
  public static final HashMap zzi = new HashMap(16, 1.0F);
  public static boolean zzj;
  public static final String[] zzk = new String[0];
  private static final AtomicBoolean zzl = new AtomicBoolean();
  private static Object zzm;
  
  /* Error */
  public static String zza(android.content.ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 83	com/google/android/gms/internal/auth/zzcb:zze	Ljava/util/HashMap;
    //   6: astore_3
    //   7: aconst_null
    //   8: astore_2
    //   9: aload_3
    //   10: ifnonnull +67 -> 77
    //   13: getstatic 61	com/google/android/gms/internal/auth/zzcb:zzl	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   16: iconst_0
    //   17: invokevirtual 87	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   20: new 63	java/util/HashMap
    //   23: astore_3
    //   24: aload_3
    //   25: bipush 16
    //   27: fconst_1
    //   28: invokespecial 66	java/util/HashMap:<init>	(IF)V
    //   31: aload_3
    //   32: putstatic 83	com/google/android/gms/internal/auth/zzcb:zze	Ljava/util/HashMap;
    //   35: new 4	java/lang/Object
    //   38: astore_3
    //   39: aload_3
    //   40: invokespecial 80	java/lang/Object:<init>	()V
    //   43: aload_3
    //   44: putstatic 89	com/google/android/gms/internal/auth/zzcb:zzm	Ljava/lang/Object;
    //   47: iconst_0
    //   48: putstatic 91	com/google/android/gms/internal/auth/zzcb:zzj	Z
    //   51: getstatic 36	com/google/android/gms/internal/auth/zzcb:zza	Landroid/net/Uri;
    //   54: astore_3
    //   55: new 93	com/google/android/gms/internal/auth/zzca
    //   58: astore 4
    //   60: aload 4
    //   62: aconst_null
    //   63: invokespecial 96	com/google/android/gms/internal/auth/zzca:<init>	(Landroid/os/Handler;)V
    //   66: aload_0
    //   67: aload_3
    //   68: iconst_1
    //   69: aload 4
    //   71: invokevirtual 102	android/content/ContentResolver:registerContentObserver	(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V
    //   74: goto +59 -> 133
    //   77: getstatic 61	com/google/android/gms/internal/auth/zzcb:zzl	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   80: iconst_0
    //   81: invokevirtual 106	java/util/concurrent/atomic/AtomicBoolean:getAndSet	(Z)Z
    //   84: ifeq +49 -> 133
    //   87: getstatic 83	com/google/android/gms/internal/auth/zzcb:zze	Ljava/util/HashMap;
    //   90: invokevirtual 109	java/util/HashMap:clear	()V
    //   93: getstatic 68	com/google/android/gms/internal/auth/zzcb:zzf	Ljava/util/HashMap;
    //   96: invokevirtual 109	java/util/HashMap:clear	()V
    //   99: getstatic 70	com/google/android/gms/internal/auth/zzcb:zzg	Ljava/util/HashMap;
    //   102: invokevirtual 109	java/util/HashMap:clear	()V
    //   105: getstatic 72	com/google/android/gms/internal/auth/zzcb:zzh	Ljava/util/HashMap;
    //   108: invokevirtual 109	java/util/HashMap:clear	()V
    //   111: getstatic 74	com/google/android/gms/internal/auth/zzcb:zzi	Ljava/util/HashMap;
    //   114: invokevirtual 109	java/util/HashMap:clear	()V
    //   117: new 4	java/lang/Object
    //   120: astore_3
    //   121: aload_3
    //   122: invokespecial 80	java/lang/Object:<init>	()V
    //   125: aload_3
    //   126: putstatic 89	com/google/android/gms/internal/auth/zzcb:zzm	Ljava/lang/Object;
    //   129: iconst_0
    //   130: putstatic 91	com/google/android/gms/internal/auth/zzcb:zzj	Z
    //   133: getstatic 89	com/google/android/gms/internal/auth/zzcb:zzm	Ljava/lang/Object;
    //   136: astore_3
    //   137: getstatic 83	com/google/android/gms/internal/auth/zzcb:zze	Ljava/util/HashMap;
    //   140: aload_1
    //   141: invokevirtual 113	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   144: ifeq +28 -> 172
    //   147: getstatic 83	com/google/android/gms/internal/auth/zzcb:zze	Ljava/util/HashMap;
    //   150: aload_1
    //   151: invokevirtual 117	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   154: checkcast 76	java/lang/String
    //   157: astore_0
    //   158: aload_0
    //   159: ifnonnull +8 -> 167
    //   162: aload_2
    //   163: astore_0
    //   164: goto +3 -> 167
    //   167: ldc 2
    //   169: monitorexit
    //   170: aload_0
    //   171: areturn
    //   172: getstatic 78	com/google/android/gms/internal/auth/zzcb:zzk	[Ljava/lang/String;
    //   175: arraylength
    //   176: istore 5
    //   178: ldc 2
    //   180: monitorexit
    //   181: aload_0
    //   182: getstatic 36	com/google/android/gms/internal/auth/zzcb:zza	Landroid/net/Uri;
    //   185: aconst_null
    //   186: aconst_null
    //   187: iconst_1
    //   188: anewarray 76	java/lang/String
    //   191: dup
    //   192: iconst_0
    //   193: aload_1
    //   194: aastore
    //   195: aconst_null
    //   196: invokevirtual 121	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   199: astore_0
    //   200: aload_0
    //   201: ifnonnull +5 -> 206
    //   204: aconst_null
    //   205: areturn
    //   206: aload_0
    //   207: invokeinterface 127 1 0
    //   212: ifne +17 -> 229
    //   215: aload_3
    //   216: aload_1
    //   217: aconst_null
    //   218: invokestatic 130	com/google/android/gms/internal/auth/zzcb:zzc	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   221: aload_0
    //   222: invokeinterface 133 1 0
    //   227: aconst_null
    //   228: areturn
    //   229: aload_0
    //   230: iconst_1
    //   231: invokeinterface 137 2 0
    //   236: astore_2
    //   237: aload_0
    //   238: invokeinterface 133 1 0
    //   243: aload_2
    //   244: astore_0
    //   245: aload_2
    //   246: ifnull +15 -> 261
    //   249: aload_2
    //   250: astore_0
    //   251: aload_2
    //   252: aconst_null
    //   253: invokevirtual 140	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   256: ifeq +5 -> 261
    //   259: aconst_null
    //   260: astore_0
    //   261: aload_3
    //   262: aload_1
    //   263: aload_0
    //   264: invokestatic 130	com/google/android/gms/internal/auth/zzcb:zzc	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   267: aload_0
    //   268: ifnull +5 -> 273
    //   271: aload_0
    //   272: areturn
    //   273: aconst_null
    //   274: areturn
    //   275: astore_1
    //   276: aload_0
    //   277: invokeinterface 133 1 0
    //   282: aload_1
    //   283: athrow
    //   284: astore_0
    //   285: ldc 2
    //   287: monitorexit
    //   288: aload_0
    //   289: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	290	0	paramContentResolver	android.content.ContentResolver
    //   0	290	1	paramString1	String
    //   0	290	2	paramString2	String
    //   6	256	3	localObject	Object
    //   58	12	4	localzzca	zzca
    //   176	1	5	i	int
    // Exception table:
    //   from	to	target	type
    //   206	221	275	finally
    //   229	237	275	finally
    //   3	7	284	finally
    //   13	74	284	finally
    //   77	133	284	finally
    //   133	158	284	finally
    //   167	170	284	finally
    //   172	181	284	finally
    //   285	288	284	finally
  }
  
  private static void zzc(Object paramObject, String paramString1, String paramString2)
  {
    try
    {
      if (paramObject == zzm) {
        zze.put(paramString1, paramString2);
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
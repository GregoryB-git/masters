package com.google.android.gms.internal.measurement;

public final class zzhc
  implements zzhe
{
  /* Error */
  public final String zza(android.content.ContentResolver paramContentResolver, String paramString)
  {
    // Byte code:
    //   0: getstatic 20	com/google/android/gms/internal/measurement/zzgw:zza	Landroid/net/Uri;
    //   3: astore_3
    //   4: aload_1
    //   5: aload_3
    //   6: invokevirtual 26	android/content/ContentResolver:acquireUnstableContentProviderClient	(Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +129 -> 140
    //   14: aload_1
    //   15: aload_3
    //   16: aconst_null
    //   17: aconst_null
    //   18: iconst_1
    //   19: anewarray 28	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: aload_2
    //   25: aastore
    //   26: aconst_null
    //   27: invokevirtual 34	android/content/ContentProviderClient:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnull +50 -> 82
    //   35: aload_2
    //   36: invokeinterface 40 1 0
    //   41: ifeq +24 -> 65
    //   44: aload_2
    //   45: iconst_1
    //   46: invokeinterface 44 2 0
    //   51: astore_3
    //   52: aload_2
    //   53: invokeinterface 47 1 0
    //   58: aload_1
    //   59: invokevirtual 50	android/content/ContentProviderClient:release	()Z
    //   62: pop
    //   63: aload_3
    //   64: areturn
    //   65: aload_2
    //   66: invokeinterface 47 1 0
    //   71: aload_1
    //   72: invokevirtual 50	android/content/ContentProviderClient:release	()Z
    //   75: pop
    //   76: aconst_null
    //   77: areturn
    //   78: astore_3
    //   79: goto +15 -> 94
    //   82: new 52	com/google/android/gms/internal/measurement/zzhd
    //   85: astore_3
    //   86: aload_3
    //   87: ldc 54
    //   89: invokespecial 57	com/google/android/gms/internal/measurement/zzhd:<init>	(Ljava/lang/String;)V
    //   92: aload_3
    //   93: athrow
    //   94: aload_2
    //   95: ifnull +18 -> 113
    //   98: aload_2
    //   99: invokeinterface 47 1 0
    //   104: goto +9 -> 113
    //   107: astore_2
    //   108: aload_3
    //   109: aload_2
    //   110: invokevirtual 63	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   113: aload_3
    //   114: athrow
    //   115: astore_2
    //   116: goto +17 -> 133
    //   119: astore_3
    //   120: new 52	com/google/android/gms/internal/measurement/zzhd
    //   123: astore_2
    //   124: aload_2
    //   125: ldc 65
    //   127: aload_3
    //   128: invokespecial 68	com/google/android/gms/internal/measurement/zzhd:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   131: aload_2
    //   132: athrow
    //   133: aload_1
    //   134: invokevirtual 50	android/content/ContentProviderClient:release	()Z
    //   137: pop
    //   138: aload_2
    //   139: athrow
    //   140: new 52	com/google/android/gms/internal/measurement/zzhd
    //   143: dup
    //   144: ldc 70
    //   146: invokespecial 57	com/google/android/gms/internal/measurement/zzhd:<init>	(Ljava/lang/String;)V
    //   149: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	this	zzhc
    //   0	150	1	paramContentResolver	android.content.ContentResolver
    //   0	150	2	paramString	String
    //   3	61	3	localObject1	Object
    //   78	1	3	localObject2	Object
    //   85	29	3	localzzhd	zzhd
    //   119	9	3	localRemoteException	android.os.RemoteException
    // Exception table:
    //   from	to	target	type
    //   35	52	78	finally
    //   82	94	78	finally
    //   98	104	107	finally
    //   14	31	115	finally
    //   52	58	115	finally
    //   65	71	115	finally
    //   108	113	115	finally
    //   113	115	115	finally
    //   120	133	115	finally
    //   14	31	119	android/os/RemoteException
    //   52	58	119	android/os/RemoteException
    //   65	71	119	android/os/RemoteException
    //   108	113	119	android/os/RemoteException
    //   113	115	119	android/os/RemoteException
  }
  
  /* Error */
  public final <T extends java.util.Map<String, String>> T zza(android.content.ContentResolver paramContentResolver, String[] paramArrayOfString, zzhb<T> paramzzhb)
  {
    // Byte code:
    //   0: getstatic 74	com/google/android/gms/internal/measurement/zzgw:zzb	Landroid/net/Uri;
    //   3: astore 4
    //   5: aload_1
    //   6: aload 4
    //   8: invokevirtual 26	android/content/ContentResolver:acquireUnstableContentProviderClient	(Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull +164 -> 177
    //   16: aload_1
    //   17: aload 4
    //   19: aconst_null
    //   20: aconst_null
    //   21: aload_2
    //   22: aconst_null
    //   23: invokevirtual 34	android/content/ContentProviderClient:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   26: astore_2
    //   27: aload_2
    //   28: ifnull +91 -> 119
    //   31: aload_3
    //   32: aload_2
    //   33: invokeinterface 78 1 0
    //   38: invokeinterface 83 2 0
    //   43: astore_3
    //   44: aload_2
    //   45: invokeinterface 86 1 0
    //   50: ifeq +27 -> 77
    //   53: aload_3
    //   54: aload_2
    //   55: iconst_0
    //   56: invokeinterface 44 2 0
    //   61: aload_2
    //   62: iconst_1
    //   63: invokeinterface 44 2 0
    //   68: invokeinterface 92 3 0
    //   73: pop
    //   74: goto -30 -> 44
    //   77: aload_2
    //   78: invokeinterface 95 1 0
    //   83: istore 5
    //   85: iload 5
    //   87: ifeq +16 -> 103
    //   90: aload_2
    //   91: invokeinterface 47 1 0
    //   96: aload_1
    //   97: invokevirtual 50	android/content/ContentProviderClient:release	()Z
    //   100: pop
    //   101: aload_3
    //   102: areturn
    //   103: new 52	com/google/android/gms/internal/measurement/zzhd
    //   106: astore_3
    //   107: aload_3
    //   108: ldc 97
    //   110: invokespecial 57	com/google/android/gms/internal/measurement/zzhd:<init>	(Ljava/lang/String;)V
    //   113: aload_3
    //   114: athrow
    //   115: astore_3
    //   116: goto +15 -> 131
    //   119: new 52	com/google/android/gms/internal/measurement/zzhd
    //   122: astore_3
    //   123: aload_3
    //   124: ldc 54
    //   126: invokespecial 57	com/google/android/gms/internal/measurement/zzhd:<init>	(Ljava/lang/String;)V
    //   129: aload_3
    //   130: athrow
    //   131: aload_2
    //   132: ifnull +18 -> 150
    //   135: aload_2
    //   136: invokeinterface 47 1 0
    //   141: goto +9 -> 150
    //   144: astore_2
    //   145: aload_3
    //   146: aload_2
    //   147: invokevirtual 63	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   150: aload_3
    //   151: athrow
    //   152: astore_2
    //   153: goto +17 -> 170
    //   156: astore_3
    //   157: new 52	com/google/android/gms/internal/measurement/zzhd
    //   160: astore_2
    //   161: aload_2
    //   162: ldc 65
    //   164: aload_3
    //   165: invokespecial 68	com/google/android/gms/internal/measurement/zzhd:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   168: aload_2
    //   169: athrow
    //   170: aload_1
    //   171: invokevirtual 50	android/content/ContentProviderClient:release	()Z
    //   174: pop
    //   175: aload_2
    //   176: athrow
    //   177: new 52	com/google/android/gms/internal/measurement/zzhd
    //   180: dup
    //   181: ldc 70
    //   183: invokespecial 57	com/google/android/gms/internal/measurement/zzhd:<init>	(Ljava/lang/String;)V
    //   186: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	zzhc
    //   0	187	1	paramContentResolver	android.content.ContentResolver
    //   0	187	2	paramArrayOfString	String[]
    //   0	187	3	paramzzhb	zzhb<T>
    //   3	15	4	localUri	android.net.Uri
    //   83	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   31	44	115	finally
    //   44	74	115	finally
    //   77	85	115	finally
    //   103	115	115	finally
    //   119	131	115	finally
    //   135	141	144	finally
    //   16	27	152	finally
    //   90	96	152	finally
    //   145	150	152	finally
    //   150	152	152	finally
    //   157	170	152	finally
    //   16	27	156	android/os/RemoteException
    //   90	96	156	android/os/RemoteException
    //   145	150	156	android/os/RemoteException
    //   150	152	156	android/os/RemoteException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
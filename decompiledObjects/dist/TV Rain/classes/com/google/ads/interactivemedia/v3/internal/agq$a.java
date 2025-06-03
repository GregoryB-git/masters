package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

final class agq$a
  implements Runnable
{
  private Context a;
  
  public agq$a(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    a = localContext;
    if (localContext == null) {
      a = paramContext;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc 8
    //   2: monitorenter
    //   3: invokestatic 34	com/google/ads/interactivemedia/v3/internal/agq:a	()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    //   6: ifnonnull +24 -> 30
    //   9: new 36	com/google/android/gms/ads/identifier/AdvertisingIdClient
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: getfield 23	com/google/ads/interactivemedia/v3/internal/agq$a:a	Landroid/content/Context;
    //   18: invokespecial 38	com/google/android/gms/ads/identifier/AdvertisingIdClient:<init>	(Landroid/content/Context;)V
    //   21: aload_1
    //   22: invokevirtual 41	com/google/android/gms/ads/identifier/AdvertisingIdClient:start	()V
    //   25: aload_1
    //   26: invokestatic 44	com/google/ads/interactivemedia/v3/internal/agq:a	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    //   29: pop
    //   30: invokestatic 48	com/google/ads/interactivemedia/v3/internal/agq:b	()Ljava/util/concurrent/CountDownLatch;
    //   33: invokevirtual 53	java/util/concurrent/CountDownLatch:countDown	()V
    //   36: goto +43 -> 79
    //   39: astore_1
    //   40: goto +43 -> 83
    //   43: astore_1
    //   44: invokestatic 48	com/google/ads/interactivemedia/v3/internal/agq:b	()Ljava/util/concurrent/CountDownLatch;
    //   47: invokevirtual 53	java/util/concurrent/CountDownLatch:countDown	()V
    //   50: goto +29 -> 79
    //   53: astore_1
    //   54: invokestatic 48	com/google/ads/interactivemedia/v3/internal/agq:b	()Ljava/util/concurrent/CountDownLatch;
    //   57: invokevirtual 53	java/util/concurrent/CountDownLatch:countDown	()V
    //   60: goto +19 -> 79
    //   63: astore_1
    //   64: goto +27 -> 91
    //   67: astore_1
    //   68: iconst_1
    //   69: invokestatic 56	com/google/ads/interactivemedia/v3/internal/agq:a	(Z)Z
    //   72: pop
    //   73: invokestatic 48	com/google/ads/interactivemedia/v3/internal/agq:b	()Ljava/util/concurrent/CountDownLatch;
    //   76: invokevirtual 53	java/util/concurrent/CountDownLatch:countDown	()V
    //   79: ldc 8
    //   81: monitorexit
    //   82: return
    //   83: invokestatic 48	com/google/ads/interactivemedia/v3/internal/agq:b	()Ljava/util/concurrent/CountDownLatch;
    //   86: invokevirtual 53	java/util/concurrent/CountDownLatch:countDown	()V
    //   89: aload_1
    //   90: athrow
    //   91: ldc 8
    //   93: monitorexit
    //   94: aload_1
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	a
    //   12	14	1	localAdvertisingIdClient	com.google.android.gms.ads.identifier.AdvertisingIdClient
    //   39	1	1	localObject1	Object
    //   43	1	1	localGooglePlayServicesRepairableException	com.google.android.gms.common.GooglePlayServicesRepairableException
    //   53	1	1	localIOException	java.io.IOException
    //   63	1	1	localObject2	Object
    //   67	28	1	localGooglePlayServicesNotAvailableException	com.google.android.gms.common.GooglePlayServicesNotAvailableException
    // Exception table:
    //   from	to	target	type
    //   3	30	39	finally
    //   68	73	39	finally
    //   3	30	43	com/google/android/gms/common/GooglePlayServicesRepairableException
    //   3	30	53	java/io/IOException
    //   30	36	63	finally
    //   44	50	63	finally
    //   54	60	63	finally
    //   73	79	63	finally
    //   79	82	63	finally
    //   83	91	63	finally
    //   91	94	63	finally
    //   3	30	67	com/google/android/gms/common/GooglePlayServicesNotAvailableException
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.agq.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
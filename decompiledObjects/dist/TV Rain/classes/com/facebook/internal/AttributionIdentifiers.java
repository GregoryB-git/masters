package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class AttributionIdentifiers
{
  private static final String ANDROID_ID_COLUMN_NAME = "androidid";
  private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
  private static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
  private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
  private static final int CONNECTION_RESULT_SUCCESS = 0;
  private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 3600000L;
  private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
  private static final String TAG = "com.facebook.internal.AttributionIdentifiers";
  private static AttributionIdentifiers recentlyFetchedIdentifiers;
  private String androidAdvertiserId;
  private String androidInstallerPackage;
  private String attributionId;
  private long fetchTime;
  private boolean limitTracking;
  
  private static AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers paramAttributionIdentifiers)
  {
    fetchTime = System.currentTimeMillis();
    recentlyFetchedIdentifiers = paramAttributionIdentifiers;
    return paramAttributionIdentifiers;
  }
  
  private static AttributionIdentifiers getAndroidId(Context paramContext)
  {
    AttributionIdentifiers localAttributionIdentifiers = getAndroidIdViaReflection(paramContext);
    Object localObject = localAttributionIdentifiers;
    if (localAttributionIdentifiers == null)
    {
      paramContext = getAndroidIdViaService(paramContext);
      localObject = paramContext;
      if (paramContext == null) {
        localObject = new AttributionIdentifiers();
      }
    }
    return (AttributionIdentifiers)localObject;
  }
  
  private static AttributionIdentifiers getAndroidIdViaReflection(Context paramContext)
  {
    try
    {
      if (!isGooglePlayServicesAvailable(paramContext)) {
        return null;
      }
      Method localMethod = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] { Context.class });
      if (localMethod == null) {
        return null;
      }
      Object localObject = Utility.invokeMethodQuietly(null, localMethod, new Object[] { paramContext });
      if (localObject == null) {
        return null;
      }
      localMethod = Utility.getMethodQuietly(localObject.getClass(), "getId", new Class[0]);
      paramContext = Utility.getMethodQuietly(localObject.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
      if ((localMethod != null) && (paramContext != null))
      {
        AttributionIdentifiers localAttributionIdentifiers = new com/facebook/internal/AttributionIdentifiers;
        localAttributionIdentifiers.<init>();
        androidAdvertiserId = ((String)Utility.invokeMethodQuietly(localObject, localMethod, new Object[0]));
        limitTracking = ((Boolean)Utility.invokeMethodQuietly(localObject, paramContext, new Object[0])).booleanValue();
        return localAttributionIdentifiers;
      }
      return null;
    }
    catch (Exception paramContext)
    {
      Utility.logd("android_id", paramContext);
    }
    return null;
  }
  
  /* Error */
  private static AttributionIdentifiers getAndroidIdViaService(Context paramContext)
  {
    // Byte code:
    //   0: new 11	com/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection
    //   3: dup
    //   4: aconst_null
    //   5: invokespecial 128	com/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection:<init>	(Lcom/facebook/internal/AttributionIdentifiers$1;)V
    //   8: astore_1
    //   9: new 130	android/content/Intent
    //   12: dup
    //   13: ldc -124
    //   15: invokespecial 135	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   18: astore_2
    //   19: aload_2
    //   20: ldc -119
    //   22: invokevirtual 141	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   25: pop
    //   26: aload_0
    //   27: aload_2
    //   28: aload_1
    //   29: iconst_1
    //   30: invokevirtual 145	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   33: ifeq +72 -> 105
    //   36: new 8	com/facebook/internal/AttributionIdentifiers$GoogleAdInfo
    //   39: astore_3
    //   40: aload_3
    //   41: aload_1
    //   42: invokevirtual 149	com/facebook/internal/AttributionIdentifiers$GoogleAdServiceConnection:getBinder	()Landroid/os/IBinder;
    //   45: invokespecial 152	com/facebook/internal/AttributionIdentifiers$GoogleAdInfo:<init>	(Landroid/os/IBinder;)V
    //   48: new 2	com/facebook/internal/AttributionIdentifiers
    //   51: astore_2
    //   52: aload_2
    //   53: invokespecial 72	com/facebook/internal/AttributionIdentifiers:<init>	()V
    //   56: aload_2
    //   57: aload_3
    //   58: invokevirtual 156	com/facebook/internal/AttributionIdentifiers$GoogleAdInfo:getAdvertiserId	()Ljava/lang/String;
    //   61: putfield 111	com/facebook/internal/AttributionIdentifiers:androidAdvertiserId	Ljava/lang/String;
    //   64: aload_2
    //   65: aload_3
    //   66: invokevirtual 159	com/facebook/internal/AttributionIdentifiers$GoogleAdInfo:isTrackingLimited	()Z
    //   69: putfield 119	com/facebook/internal/AttributionIdentifiers:limitTracking	Z
    //   72: aload_0
    //   73: aload_1
    //   74: invokevirtual 163	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   77: aload_2
    //   78: areturn
    //   79: astore_2
    //   80: goto +18 -> 98
    //   83: astore_2
    //   84: ldc 121
    //   86: aload_2
    //   87: invokestatic 125	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   90: aload_0
    //   91: aload_1
    //   92: invokevirtual 163	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   95: goto +10 -> 105
    //   98: aload_0
    //   99: aload_1
    //   100: invokevirtual 163	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   103: aload_2
    //   104: athrow
    //   105: aconst_null
    //   106: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramContext	Context
    //   8	92	1	localGoogleAdServiceConnection	GoogleAdServiceConnection
    //   18	60	2	localObject1	Object
    //   79	1	2	localObject2	Object
    //   83	21	2	localException	Exception
    //   39	27	3	localGoogleAdInfo	GoogleAdInfo
    // Exception table:
    //   from	to	target	type
    //   36	72	79	finally
    //   84	90	79	finally
    //   36	72	83	java/lang/Exception
  }
  
  /* Error */
  @Nullable
  public static AttributionIdentifiers getAttributionIdentifiers(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 167	com/facebook/internal/AttributionIdentifiers:getAndroidId	(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    //   4: astore_1
    //   5: aconst_null
    //   6: astore_2
    //   7: invokestatic 173	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   10: invokestatic 176	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   13: if_acmpeq +317 -> 330
    //   16: getstatic 63	com/facebook/internal/AttributionIdentifiers:recentlyFetchedIdentifiers	Lcom/facebook/internal/AttributionIdentifiers;
    //   19: ifnull +29 -> 48
    //   22: invokestatic 59	java/lang/System:currentTimeMillis	()J
    //   25: lstore_3
    //   26: getstatic 63	com/facebook/internal/AttributionIdentifiers:recentlyFetchedIdentifiers	Lcom/facebook/internal/AttributionIdentifiers;
    //   29: astore 5
    //   31: lload_3
    //   32: aload 5
    //   34: getfield 61	com/facebook/internal/AttributionIdentifiers:fetchTime	J
    //   37: lsub
    //   38: ldc2_w 31
    //   41: lcmp
    //   42: ifge +6 -> 48
    //   45: aload 5
    //   47: areturn
    //   48: aload_0
    //   49: invokevirtual 180	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   52: ldc 22
    //   54: iconst_0
    //   55: invokevirtual 186	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   58: astore 5
    //   60: aload_0
    //   61: invokevirtual 180	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   64: ldc 25
    //   66: iconst_0
    //   67: invokevirtual 186	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   70: astore 6
    //   72: aload 5
    //   74: ifnull +25 -> 99
    //   77: aload_0
    //   78: aload 5
    //   80: getfield 191	android/content/pm/ProviderInfo:packageName	Ljava/lang/String;
    //   83: invokestatic 197	com/facebook/internal/FacebookSignatureValidator:validateSignature	(Landroid/content/Context;Ljava/lang/String;)Z
    //   86: ifeq +13 -> 99
    //   89: ldc -57
    //   91: invokestatic 205	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   94: astore 5
    //   96: goto +33 -> 129
    //   99: aload 6
    //   101: ifnull +25 -> 126
    //   104: aload_0
    //   105: aload 6
    //   107: getfield 191	android/content/pm/ProviderInfo:packageName	Ljava/lang/String;
    //   110: invokestatic 197	com/facebook/internal/FacebookSignatureValidator:validateSignature	(Landroid/content/Context;Ljava/lang/String;)Z
    //   113: ifeq +13 -> 126
    //   116: ldc -49
    //   118: invokestatic 205	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   121: astore 5
    //   123: goto -27 -> 96
    //   126: aconst_null
    //   127: astore 5
    //   129: aload_0
    //   130: invokestatic 211	com/facebook/internal/AttributionIdentifiers:getInstallerPackageName	(Landroid/content/Context;)Ljava/lang/String;
    //   133: astore 6
    //   135: aload 6
    //   137: ifnull +9 -> 146
    //   140: aload_1
    //   141: aload 6
    //   143: putfield 213	com/facebook/internal/AttributionIdentifiers:androidInstallerPackage	Ljava/lang/String;
    //   146: aload 5
    //   148: ifnonnull +8 -> 156
    //   151: aload_1
    //   152: invokestatic 215	com/facebook/internal/AttributionIdentifiers:cacheAndReturnIdentifiers	(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    //   155: areturn
    //   156: aload_0
    //   157: invokevirtual 219	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   160: aload 5
    //   162: iconst_3
    //   163: anewarray 109	java/lang/String
    //   166: dup
    //   167: iconst_0
    //   168: ldc 19
    //   170: aastore
    //   171: dup
    //   172: iconst_1
    //   173: ldc 16
    //   175: aastore
    //   176: dup
    //   177: iconst_2
    //   178: ldc 35
    //   180: aastore
    //   181: aconst_null
    //   182: aconst_null
    //   183: aconst_null
    //   184: invokevirtual 225	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   187: astore_0
    //   188: aload_0
    //   189: ifnull +112 -> 301
    //   192: aload_0
    //   193: invokeinterface 230 1 0
    //   198: ifne +6 -> 204
    //   201: goto +100 -> 301
    //   204: aload_0
    //   205: ldc 19
    //   207: invokeinterface 234 2 0
    //   212: istore 7
    //   214: aload_0
    //   215: ldc 16
    //   217: invokeinterface 234 2 0
    //   222: istore 8
    //   224: aload_0
    //   225: ldc 35
    //   227: invokeinterface 234 2 0
    //   232: istore 9
    //   234: aload_1
    //   235: aload_0
    //   236: iload 7
    //   238: invokeinterface 238 2 0
    //   243: putfield 240	com/facebook/internal/AttributionIdentifiers:attributionId	Ljava/lang/String;
    //   246: iload 8
    //   248: ifle +42 -> 290
    //   251: iload 9
    //   253: ifle +37 -> 290
    //   256: aload_1
    //   257: invokevirtual 243	com/facebook/internal/AttributionIdentifiers:getAndroidAdvertiserId	()Ljava/lang/String;
    //   260: ifnonnull +30 -> 290
    //   263: aload_1
    //   264: aload_0
    //   265: iload 8
    //   267: invokeinterface 238 2 0
    //   272: putfield 111	com/facebook/internal/AttributionIdentifiers:androidAdvertiserId	Ljava/lang/String;
    //   275: aload_1
    //   276: aload_0
    //   277: iload 9
    //   279: invokeinterface 238 2 0
    //   284: invokestatic 247	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   287: putfield 119	com/facebook/internal/AttributionIdentifiers:limitTracking	Z
    //   290: aload_0
    //   291: invokeinterface 250 1 0
    //   296: aload_1
    //   297: invokestatic 215	com/facebook/internal/AttributionIdentifiers:cacheAndReturnIdentifiers	(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    //   300: areturn
    //   301: aload_1
    //   302: invokestatic 215	com/facebook/internal/AttributionIdentifiers:cacheAndReturnIdentifiers	(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    //   305: astore 5
    //   307: aload_0
    //   308: ifnull +9 -> 317
    //   311: aload_0
    //   312: invokeinterface 250 1 0
    //   317: aload 5
    //   319: areturn
    //   320: astore 5
    //   322: goto +83 -> 405
    //   325: astore 5
    //   327: goto +26 -> 353
    //   330: new 252	com/facebook/FacebookException
    //   333: astore_0
    //   334: aload_0
    //   335: ldc -2
    //   337: invokespecial 255	com/facebook/FacebookException:<init>	(Ljava/lang/String;)V
    //   340: aload_0
    //   341: athrow
    //   342: astore 5
    //   344: aload_2
    //   345: astore_0
    //   346: goto +59 -> 405
    //   349: astore 5
    //   351: aconst_null
    //   352: astore_0
    //   353: getstatic 257	com/facebook/internal/AttributionIdentifiers:TAG	Ljava/lang/String;
    //   356: astore_1
    //   357: new 259	java/lang/StringBuilder
    //   360: astore_2
    //   361: aload_2
    //   362: invokespecial 260	java/lang/StringBuilder:<init>	()V
    //   365: aload_2
    //   366: ldc_w 262
    //   369: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: pop
    //   373: aload_2
    //   374: aload 5
    //   376: invokevirtual 269	java/lang/Object:toString	()Ljava/lang/String;
    //   379: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: pop
    //   383: aload_1
    //   384: aload_2
    //   385: invokevirtual 270	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   388: invokestatic 273	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/String;)V
    //   391: aload_0
    //   392: ifnull +9 -> 401
    //   395: aload_0
    //   396: invokeinterface 250 1 0
    //   401: aconst_null
    //   402: areturn
    //   403: astore 5
    //   405: aload_0
    //   406: ifnull +9 -> 415
    //   409: aload_0
    //   410: invokeinterface 250 1 0
    //   415: aload 5
    //   417: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	418	0	paramContext	Context
    //   4	380	1	localObject1	Object
    //   6	379	2	localStringBuilder	StringBuilder
    //   25	7	3	l	long
    //   29	289	5	localObject2	Object
    //   320	1	5	localObject3	Object
    //   325	1	5	localException1	Exception
    //   342	1	5	localObject4	Object
    //   349	26	5	localException2	Exception
    //   403	13	5	localObject5	Object
    //   70	72	6	localObject6	Object
    //   212	25	7	i	int
    //   222	44	8	j	int
    //   232	46	9	k	int
    // Exception table:
    //   from	to	target	type
    //   192	201	320	finally
    //   204	246	320	finally
    //   256	290	320	finally
    //   301	307	320	finally
    //   192	201	325	java/lang/Exception
    //   204	246	325	java/lang/Exception
    //   256	290	325	java/lang/Exception
    //   301	307	325	java/lang/Exception
    //   7	45	342	finally
    //   48	72	342	finally
    //   77	96	342	finally
    //   104	123	342	finally
    //   129	135	342	finally
    //   140	146	342	finally
    //   151	156	342	finally
    //   156	188	342	finally
    //   330	342	342	finally
    //   7	45	349	java/lang/Exception
    //   48	72	349	java/lang/Exception
    //   77	96	349	java/lang/Exception
    //   104	123	349	java/lang/Exception
    //   129	135	349	java/lang/Exception
    //   140	146	349	java/lang/Exception
    //   151	156	349	java/lang/Exception
    //   156	188	349	java/lang/Exception
    //   330	342	349	java/lang/Exception
    //   353	391	403	finally
  }
  
  public static AttributionIdentifiers getCachedIdentifiers()
  {
    return recentlyFetchedIdentifiers;
  }
  
  @Nullable
  private static String getInstallerPackageName(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager != null) {
      return localPackageManager.getInstallerPackageName(paramContext.getPackageName());
    }
    return null;
  }
  
  private static boolean isGooglePlayServicesAvailable(Context paramContext)
  {
    Method localMethod = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] { Context.class });
    if (localMethod == null) {
      return false;
    }
    paramContext = Utility.invokeMethodQuietly(null, localMethod, new Object[] { paramContext });
    return ((paramContext instanceof Integer)) && (((Integer)paramContext).intValue() == 0);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static boolean isTrackingLimited(Context paramContext)
  {
    paramContext = getAttributionIdentifiers(paramContext);
    boolean bool;
    if ((paramContext != null) && (paramContext.isTrackingLimited())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String getAndroidAdvertiserId()
  {
    if ((FacebookSdk.isInitialized()) && (FacebookSdk.getAdvertiserIDCollectionEnabled())) {
      return androidAdvertiserId;
    }
    return null;
  }
  
  public String getAndroidInstallerPackage()
  {
    return androidInstallerPackage;
  }
  
  public String getAttributionId()
  {
    return attributionId;
  }
  
  public boolean isTrackingLimited()
  {
    return limitTracking;
  }
  
  public static final class GoogleAdInfo
    implements IInterface
  {
    private static final int FIRST_TRANSACTION_CODE = 1;
    private static final int SECOND_TRANSACTION_CODE = 2;
    private IBinder binder;
    
    public GoogleAdInfo(IBinder paramIBinder)
    {
      binder = paramIBinder;
    }
    
    public IBinder asBinder()
    {
      return binder;
    }
    
    public String getAdvertiserId()
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        binder.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        String str = localParcel2.readString();
        return str;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public boolean isTrackingLimited()
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        boolean bool = true;
        localParcel1.writeInt(1);
        binder.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i == 0) {
          bool = false;
        }
        return bool;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public static final class GoogleAdServiceConnection
    implements ServiceConnection
  {
    private AtomicBoolean consumed = new AtomicBoolean(false);
    private final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();
    
    public IBinder getBinder()
      throws InterruptedException
    {
      if (!consumed.compareAndSet(true, true)) {
        return (IBinder)queue.take();
      }
      throw new IllegalStateException("Binder already consumed");
    }
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (paramIBinder != null) {}
      try
      {
        queue.put(paramIBinder);
        return;
      }
      catch (InterruptedException paramComponentName)
      {
        for (;;) {}
      }
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName) {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.AttributionIdentifiers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
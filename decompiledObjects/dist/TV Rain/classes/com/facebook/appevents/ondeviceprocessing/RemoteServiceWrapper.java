package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.FacebookSignatureValidator;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class RemoteServiceWrapper
{
  public static final String RECEIVER_SERVICE_ACTION = "ReceiverService";
  public static final String RECEIVER_SERVICE_PACKAGE = "com.facebook.katana";
  public static final String RECEIVER_SERVICE_PACKAGE_WAKIZASHI = "com.facebook.wakizashi";
  private static final String TAG = "RemoteServiceWrapper";
  private static Boolean isServiceAvailable;
  
  @Nullable
  private static Intent getVerifiedServiceIntent(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(RemoteServiceWrapper.class)) {
      return null;
    }
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager != null)
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>("ReceiverService");
        localIntent.setPackage("com.facebook.katana");
        if ((localPackageManager.resolveService(localIntent, 0) != null) && (FacebookSignatureValidator.validateSignature(paramContext, "com.facebook.katana"))) {
          return localIntent;
        }
        localIntent = new android/content/Intent;
        localIntent.<init>("ReceiverService");
        localIntent.setPackage("com.facebook.wakizashi");
        if (localPackageManager.resolveService(localIntent, 0) != null)
        {
          boolean bool = FacebookSignatureValidator.validateSignature(paramContext, "com.facebook.wakizashi");
          if (bool) {
            return localIntent;
          }
        }
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, RemoteServiceWrapper.class);
    }
    return null;
  }
  
  public static boolean isServiceAvailable()
  {
    if (CrashShieldHandler.isObjectCrashing(RemoteServiceWrapper.class)) {
      return false;
    }
    try
    {
      if (isServiceAvailable == null)
      {
        if (getVerifiedServiceIntent(FacebookSdk.getApplicationContext()) != null) {
          bool = true;
        } else {
          bool = false;
        }
        isServiceAvailable = Boolean.valueOf(bool);
      }
      boolean bool = isServiceAvailable.booleanValue();
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, RemoteServiceWrapper.class);
    }
    return false;
  }
  
  public static ServiceResult sendCustomEvents(String paramString, List<AppEvent> paramList)
  {
    if (CrashShieldHandler.isObjectCrashing(RemoteServiceWrapper.class)) {
      return null;
    }
    try
    {
      paramString = sendEvents(EventType.CUSTOM_APP_EVENTS, paramString, paramList);
      return paramString;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, RemoteServiceWrapper.class);
    }
    return null;
  }
  
  /* Error */
  private static ServiceResult sendEvents(EventType paramEventType, String paramString, List<AppEvent> paramList)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 46	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: getstatic 118	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult:SERVICE_NOT_AVAILABLE	Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;
    //   13: astore_3
    //   14: invokestatic 123	com/facebook/appevents/internal/AppEventUtility:assertIsNotMainThread	()V
    //   17: invokestatic 87	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   20: astore 4
    //   22: aload 4
    //   24: invokestatic 89	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper:getVerifiedServiceIntent	(Landroid/content/Context;)Landroid/content/Intent;
    //   27: astore 5
    //   29: aload_3
    //   30: astore 6
    //   32: aload 5
    //   34: ifnull +189 -> 223
    //   37: new 9	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$RemoteServiceConnection
    //   40: astore 7
    //   42: aload 7
    //   44: invokespecial 124	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$RemoteServiceConnection:<init>	()V
    //   47: aload 4
    //   49: aload 5
    //   51: aload 7
    //   53: iconst_1
    //   54: invokevirtual 128	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   57: istore 8
    //   59: iload 8
    //   61: ifeq +157 -> 218
    //   64: aload 7
    //   66: invokevirtual 132	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$RemoteServiceConnection:getBinder	()Landroid/os/IBinder;
    //   69: astore 5
    //   71: aload_3
    //   72: astore 6
    //   74: aload 5
    //   76: ifnull +68 -> 144
    //   79: aload 5
    //   81: invokestatic 138	com/facebook/ppml/receiver/IReceiverService$Stub:asInterface	(Landroid/os/IBinder;)Lcom/facebook/ppml/receiver/IReceiverService;
    //   84: astore 6
    //   86: aload_0
    //   87: aload_1
    //   88: aload_2
    //   89: invokestatic 144	com/facebook/appevents/ondeviceprocessing/RemoteServiceParametersHelper:buildEventsBundle	(Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;
    //   92: astore_0
    //   93: aload_0
    //   94: ifnull +45 -> 139
    //   97: aload 6
    //   99: aload_0
    //   100: invokeinterface 149 2 0
    //   105: pop
    //   106: getstatic 151	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper:TAG	Ljava/lang/String;
    //   109: astore_1
    //   110: new 153	java/lang/StringBuilder
    //   113: astore_2
    //   114: aload_2
    //   115: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   118: aload_2
    //   119: ldc -100
    //   121: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload_2
    //   126: aload_0
    //   127: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload_1
    //   132: aload_2
    //   133: invokevirtual 167	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   136: invokestatic 173	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: getstatic 176	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult:OPERATION_SUCCESS	Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;
    //   142: astore 6
    //   144: aload 4
    //   146: aload 7
    //   148: invokevirtual 180	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   151: getstatic 151	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper:TAG	Ljava/lang/String;
    //   154: ldc -74
    //   156: invokestatic 173	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: goto +64 -> 223
    //   162: astore_0
    //   163: goto +38 -> 201
    //   166: astore_0
    //   167: goto +4 -> 171
    //   170: astore_0
    //   171: getstatic 185	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult:SERVICE_ERROR	Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;
    //   174: astore 6
    //   176: getstatic 151	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper:TAG	Ljava/lang/String;
    //   179: astore_1
    //   180: aload_1
    //   181: aload_0
    //   182: invokestatic 188	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   185: aload 4
    //   187: aload 7
    //   189: invokevirtual 180	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   192: aload_1
    //   193: ldc -74
    //   195: invokestatic 173	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: goto +25 -> 223
    //   201: aload 4
    //   203: aload 7
    //   205: invokevirtual 180	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   208: getstatic 151	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper:TAG	Ljava/lang/String;
    //   211: ldc -74
    //   213: invokestatic 173	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/String;)V
    //   216: aload_0
    //   217: athrow
    //   218: getstatic 185	com/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult:SERVICE_ERROR	Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;
    //   221: astore 6
    //   223: aload 6
    //   225: areturn
    //   226: astore_0
    //   227: aload_0
    //   228: ldc 2
    //   230: invokestatic 77	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   233: aconst_null
    //   234: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	paramEventType	EventType
    //   0	235	1	paramString	String
    //   0	235	2	paramList	List<AppEvent>
    //   13	59	3	localServiceResult	ServiceResult
    //   20	182	4	localContext	Context
    //   27	53	5	localObject1	Object
    //   30	194	6	localObject2	Object
    //   40	164	7	localRemoteServiceConnection	RemoteServiceConnection
    //   57	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   64	71	162	finally
    //   79	93	162	finally
    //   97	139	162	finally
    //   139	144	162	finally
    //   171	185	162	finally
    //   64	71	166	android/os/RemoteException
    //   79	93	166	android/os/RemoteException
    //   97	139	166	android/os/RemoteException
    //   139	144	166	android/os/RemoteException
    //   64	71	170	java/lang/InterruptedException
    //   79	93	170	java/lang/InterruptedException
    //   97	139	170	java/lang/InterruptedException
    //   139	144	170	java/lang/InterruptedException
    //   10	29	226	finally
    //   37	59	226	finally
    //   144	159	226	finally
    //   185	198	226	finally
    //   201	218	226	finally
    //   218	223	226	finally
  }
  
  public static ServiceResult sendInstallEvent(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(RemoteServiceWrapper.class)) {
      return null;
    }
    try
    {
      EventType localEventType = EventType.MOBILE_APP_INSTALL;
      LinkedList localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      paramString = sendEvents(localEventType, paramString, localLinkedList);
      return paramString;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, RemoteServiceWrapper.class);
    }
    return null;
  }
  
  public static enum EventType
  {
    private String eventType;
    
    static
    {
      EventType localEventType1 = new EventType("MOBILE_APP_INSTALL", 0, "MOBILE_APP_INSTALL");
      MOBILE_APP_INSTALL = localEventType1;
      EventType localEventType2 = new EventType("CUSTOM_APP_EVENTS", 1, "CUSTOM_APP_EVENTS");
      CUSTOM_APP_EVENTS = localEventType2;
      $VALUES = new EventType[] { localEventType1, localEventType2 };
    }
    
    private EventType(String paramString)
    {
      eventType = paramString;
    }
    
    public String toString()
    {
      return eventType;
    }
  }
  
  public static final class RemoteServiceConnection
    implements ServiceConnection
  {
    @Nullable
    private IBinder binder;
    private final CountDownLatch latch = new CountDownLatch(1);
    
    @Nullable
    public IBinder getBinder()
      throws InterruptedException
    {
      latch.await(5L, TimeUnit.SECONDS);
      return binder;
    }
    
    public void onNullBinding(ComponentName paramComponentName)
    {
      latch.countDown();
    }
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      binder = paramIBinder;
      latch.countDown();
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName) {}
  }
  
  public static enum ServiceResult
  {
    static
    {
      ServiceResult localServiceResult1 = new ServiceResult("OPERATION_SUCCESS", 0);
      OPERATION_SUCCESS = localServiceResult1;
      ServiceResult localServiceResult2 = new ServiceResult("SERVICE_NOT_AVAILABLE", 1);
      SERVICE_NOT_AVAILABLE = localServiceResult2;
      ServiceResult localServiceResult3 = new ServiceResult("SERVICE_ERROR", 2);
      SERVICE_ERROR = localServiceResult3;
      $VALUES = new ServiceResult[] { localServiceResult1, localServiceResult2, localServiceResult3 };
    }
    
    private ServiceResult() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
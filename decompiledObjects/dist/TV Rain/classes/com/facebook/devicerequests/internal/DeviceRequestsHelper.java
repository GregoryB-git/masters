package com.facebook.devicerequests.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.AbstractCollection;
import java.util.EnumMap;
import java.util.HashMap;

public class DeviceRequestsHelper
{
  public static final String DEVICE_INFO_DEVICE = "device";
  public static final String DEVICE_INFO_MODEL = "model";
  public static final String DEVICE_INFO_PARAM = "device_info";
  public static final String DEVICE_TARGET_USER_ID = "target_user_id";
  public static final String SDK_FLAVOR = "android";
  public static final String SDK_HEADER = "fbsdk";
  public static final String SERVICE_TYPE = "_fb._tcp.";
  private static final String TAG = "com.facebook.devicerequests.internal.DeviceRequestsHelper";
  private static HashMap<String, NsdManager.RegistrationListener> deviceRequestsListeners = new HashMap();
  
  public static void cleanUpAdvertisementService(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
      return;
    }
    try
    {
      cleanUpAdvertisementServiceImpl(paramString);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, DeviceRequestsHelper.class);
    }
  }
  
  @TargetApi(16)
  private static void cleanUpAdvertisementServiceImpl(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
      return;
    }
    try
    {
      NsdManager.RegistrationListener localRegistrationListener = (NsdManager.RegistrationListener)deviceRequestsListeners.get(paramString);
      if (localRegistrationListener != null)
      {
        NsdManager localNsdManager = (NsdManager)FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
        try
        {
          localNsdManager.unregisterService(localRegistrationListener);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          Utility.logd(TAG, localIllegalArgumentException);
        }
        deviceRequestsListeners.remove(paramString);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, DeviceRequestsHelper.class);
    }
  }
  
  public static Bitmap generateQRCode(String paramString)
  {
    boolean bool = CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class);
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    for (;;)
    {
      try
      {
        localEnumMap = new java/util/EnumMap;
        localEnumMap.<init>(EncodeHintType.class);
        localEnumMap.put(EncodeHintType.MARGIN, Integer.valueOf(2));
      }
      finally
      {
        EnumMap localEnumMap;
        Object localObject2;
        int i;
        int j;
        int k;
        CrashShieldHandler.handleThrowable(paramString, DeviceRequestsHelper.class);
        return null;
      }
      try
      {
        localObject2 = new com/google/zxing/MultiFormatWriter;
        ((MultiFormatWriter)localObject2).<init>();
        paramString = ((MultiFormatWriter)localObject2).encode(paramString, BarcodeFormat.QR_CODE, 200, 200, localEnumMap);
        i = paramString.getHeight();
        j = paramString.getWidth();
        localObject2 = new int[i * j];
        k = 0;
        if (k < i)
        {
          int m = 0;
          if (m < j)
          {
            int n;
            if (paramString.get(m, k)) {
              n = -16777216;
            } else {
              n = -1;
            }
            localObject2[(k * j + m)] = n;
            m++;
          }
          else
          {
            k++;
          }
        }
        else
        {
          paramString = Bitmap.createBitmap(j, i, Bitmap.Config.ARGB_8888);
          try
          {
            paramString.setPixels((int[])localObject2, 0, j, 0, 0, j, i);
          }
          catch (WriterException localWriterException) {}
        }
      }
      catch (WriterException paramString)
      {
        paramString = localWriterException;
      }
    }
    return paramString;
  }
  
  /* Error */
  public static String getDeviceInfo()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 53	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: new 176	org/json/JSONObject
    //   13: astore_0
    //   14: aload_0
    //   15: invokespecial 177	org/json/JSONObject:<init>	()V
    //   18: aload_0
    //   19: ldc 10
    //   21: getstatic 182	android/os/Build:DEVICE	Ljava/lang/String;
    //   24: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   27: pop
    //   28: aload_0
    //   29: ldc 13
    //   31: getstatic 188	android/os/Build:MODEL	Ljava/lang/String;
    //   34: invokevirtual 185	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   37: pop
    //   38: aload_0
    //   39: invokevirtual 191	org/json/JSONObject:toString	()Ljava/lang/String;
    //   42: astore_0
    //   43: aload_0
    //   44: areturn
    //   45: astore_0
    //   46: aload_0
    //   47: ldc 2
    //   49: invokestatic 60	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   52: aconst_null
    //   53: areturn
    //   54: astore_1
    //   55: goto -17 -> 38
    // Local variable table:
    //   start	length	slot	name	signature
    //   13	31	0	localObject	Object
    //   45	2	0	localThrowable	Throwable
    //   54	1	1	localJSONException	org.json.JSONException
    // Exception table:
    //   from	to	target	type
    //   10	18	45	finally
    //   18	38	45	finally
    //   38	43	45	finally
    //   18	38	54	org/json/JSONException
  }
  
  public static boolean isAvailable()
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
      bool1 = bool2;
      if (localFetchedAppSettings != null)
      {
        boolean bool3 = localFetchedAppSettings.getSmartLoginOptions().contains(SmartLoginOption.Enabled);
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, DeviceRequestsHelper.class);
    }
    return false;
  }
  
  public static boolean startAdvertisementService(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
      return false;
    }
    try
    {
      if (isAvailable())
      {
        boolean bool = startAdvertisementServiceImpl(paramString);
        return bool;
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, DeviceRequestsHelper.class);
    }
    return false;
  }
  
  @TargetApi(16)
  private static boolean startAdvertisementServiceImpl(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(DeviceRequestsHelper.class)) {
      return false;
    }
    try
    {
      if (deviceRequestsListeners.containsKey(paramString)) {
        return true;
      }
      String str = String.format("%s_%s_%s", new Object[] { "fbsdk", String.format("%s-%s", new Object[] { "android", FacebookSdk.getSdkVersion().replace('.', '|') }), paramString });
      NsdServiceInfo localNsdServiceInfo = new android/net/nsd/NsdServiceInfo;
      localNsdServiceInfo.<init>();
      localNsdServiceInfo.setServiceType("_fb._tcp.");
      localNsdServiceInfo.setServiceName(str);
      localNsdServiceInfo.setPort(80);
      NsdManager localNsdManager = (NsdManager)FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
      NsdManager.RegistrationListener local1 = new com/facebook/devicerequests/internal/DeviceRequestsHelper$1;
      local1.<init>(str, paramString);
      deviceRequestsListeners.put(paramString, local1);
      localNsdManager.registerService(localNsdServiceInfo, 1, local1);
      return true;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, DeviceRequestsHelper.class);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.devicerequests.internal.DeviceRequestsHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
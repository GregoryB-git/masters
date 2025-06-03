package za;

import android.app.ActivityManager;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import ec.i;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import lc.h;
import lc.k;
import sb.m;
import va.a;

public final class b
  implements MethodChannel.MethodCallHandler
{
  public final PackageManager a;
  public final ActivityManager b;
  
  public b(PackageManager paramPackageManager, ActivityManager paramActivityManager)
  {
    a = paramPackageManager;
    b = paramActivityManager;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    i.e(paramMethodCall, "call");
    i.e(paramResult, "result");
    HashMap localHashMap;
    Object localObject1;
    if (method.equals("getDeviceInfo"))
    {
      localHashMap = new HashMap();
      localHashMap.put("board", Build.BOARD);
      localHashMap.put("bootloader", Build.BOOTLOADER);
      paramMethodCall = Build.BRAND;
      localHashMap.put("brand", paramMethodCall);
      localObject1 = Build.DEVICE;
      localHashMap.put("device", localObject1);
      localHashMap.put("display", Build.DISPLAY);
      String str1 = Build.FINGERPRINT;
      localHashMap.put("fingerprint", str1);
      String str2 = Build.HARDWARE;
      localHashMap.put("hardware", str2);
      localHashMap.put("host", Build.HOST);
      localHashMap.put("id", Build.ID);
      Object localObject2 = Build.MANUFACTURER;
      localHashMap.put("manufacturer", localObject2);
      String str3 = Build.MODEL;
      localHashMap.put("model", str3);
      Object localObject3 = Build.PRODUCT;
      localHashMap.put("product", localObject3);
      String[] arrayOfString = Build.SUPPORTED_32_BIT_ABIS;
      localHashMap.put("supported32BitAbis", a.g(Arrays.copyOf(arrayOfString, arrayOfString.length)));
      arrayOfString = Build.SUPPORTED_64_BIT_ABIS;
      localHashMap.put("supported64BitAbis", a.g(Arrays.copyOf(arrayOfString, arrayOfString.length)));
      arrayOfString = Build.SUPPORTED_ABIS;
      localHashMap.put("supportedAbis", a.g(Arrays.copyOf(arrayOfString, arrayOfString.length)));
      localHashMap.put("tags", Build.TAGS);
      localHashMap.put("type", Build.TYPE);
      i.d(paramMethodCall, "BRAND");
      boolean bool = h.n0(paramMethodCall, "generic");
      paramMethodCall = "unknown";
      if (bool)
      {
        i.d(localObject1, "DEVICE");
        if (h.n0((String)localObject1, "generic")) {}
      }
      else
      {
        i.d(str1, "FINGERPRINT");
        if ((!h.n0(str1, "generic")) && (!h.n0(str1, "unknown")))
        {
          i.d(str2, "HARDWARE");
          if ((!k.o0(str2, "goldfish")) && (!k.o0(str2, "ranchu")))
          {
            i.d(str3, "MODEL");
            if ((!k.o0(str3, "google_sdk")) && (!k.o0(str3, "Emulator")) && (!k.o0(str3, "Android SDK built for x86")))
            {
              i.d(localObject2, "MANUFACTURER");
              if (!k.o0((CharSequence)localObject2, "Genymotion"))
              {
                i.d(localObject3, "PRODUCT");
                if ((!k.o0((CharSequence)localObject3, "sdk")) && (!k.o0((CharSequence)localObject3, "vbox86p")) && (!k.o0((CharSequence)localObject3, "emulator")) && (!k.o0((CharSequence)localObject3, "simulator")))
                {
                  i = 0;
                  break label473;
                }
              }
            }
          }
        }
      }
      int i = 1;
      label473:
      localHashMap.put("isPhysicalDevice", Boolean.valueOf(i ^ 0x1));
      localObject3 = a.getSystemAvailableFeatures();
      i.d(localObject3, "getSystemAvailableFeatures(...)");
      localObject1 = new ArrayList();
      int j = localObject3.length;
      for (i = 0; i < j; i++)
      {
        localObject2 = localObject3[i];
        int k;
        if (name == null) {
          k = 1;
        } else {
          k = 0;
        }
        if (k == 0) {
          ((ArrayList)localObject1).add(localObject2);
        }
      }
      localObject2 = new ArrayList(m.j((Iterable)localObject1));
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((ArrayList)localObject2).add(nextname);
      }
      localHashMap.put("systemFeatures", localObject2);
      localObject1 = new HashMap();
      i = Build.VERSION.SDK_INT;
      ((HashMap)localObject1).put("baseOS", Build.VERSION.BASE_OS);
      ((HashMap)localObject1).put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
      ((HashMap)localObject1).put("securityPatch", Build.VERSION.SECURITY_PATCH);
      ((HashMap)localObject1).put("codename", Build.VERSION.CODENAME);
      ((HashMap)localObject1).put("incremental", Build.VERSION.INCREMENTAL);
      ((HashMap)localObject1).put("release", Build.VERSION.RELEASE);
      ((HashMap)localObject1).put("sdkInt", Integer.valueOf(i));
      localHashMap.put("version", localObject1);
      localHashMap.put("isLowRamDevice", Boolean.valueOf(b.isLowRamDevice()));
      if (i < 26) {}
    }
    try
    {
      localObject1 = c0.b.l();
      paramMethodCall = (MethodCall)localObject1;
    }
    catch (SecurityException localSecurityException)
    {
      for (;;) {}
    }
    localHashMap.put("serialNumber", paramMethodCall);
    break label801;
    localHashMap.put("serialNumber", Build.SERIAL);
    label801:
    paramResult.success(localHashMap);
    break label817;
    paramResult.notImplemented();
    label817:
  }
}

/* Location:
 * Qualified Name:     za.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
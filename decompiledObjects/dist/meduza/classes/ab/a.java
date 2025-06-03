package ab;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import sb.k;

public final class a
  implements MethodChannel.MethodCallHandler, FlutterPlugin
{
  public Context a;
  public MethodChannel b;
  
  public static String b(byte[] paramArrayOfByte)
  {
    Object localObject = MessageDigest.getInstance("SHA-256");
    ((MessageDigest)localObject).update(paramArrayOfByte);
    localObject = ((MessageDigest)localObject).digest();
    i.b(localObject);
    char[] arrayOfChar = new char[16];
    char[] tmp26_25 = arrayOfChar;
    tmp26_25[0] = 48;
    char[] tmp31_26 = tmp26_25;
    tmp31_26[1] = 49;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[2] = 50;
    char[] tmp41_36 = tmp36_31;
    tmp41_36[3] = 51;
    char[] tmp46_41 = tmp41_36;
    tmp46_41[4] = 52;
    char[] tmp51_46 = tmp46_41;
    tmp51_46[5] = 53;
    char[] tmp56_51 = tmp51_46;
    tmp56_51[6] = 54;
    char[] tmp62_56 = tmp56_51;
    tmp62_56[7] = 55;
    char[] tmp68_62 = tmp62_56;
    tmp68_62[8] = 56;
    char[] tmp74_68 = tmp68_62;
    tmp74_68[9] = 57;
    char[] tmp80_74 = tmp74_68;
    tmp80_74[10] = 65;
    char[] tmp86_80 = tmp80_74;
    tmp86_80[11] = 66;
    char[] tmp92_86 = tmp86_80;
    tmp92_86[12] = 67;
    char[] tmp98_92 = tmp92_86;
    tmp98_92[13] = 68;
    char[] tmp104_98 = tmp98_92;
    tmp104_98[14] = 69;
    char[] tmp110_104 = tmp104_98;
    tmp110_104[15] = 70;
    tmp110_104;
    paramArrayOfByte = new char[localObject.length * 2];
    int i = localObject.length;
    for (int j = 0; j < i; j++)
    {
      int k = localObject[j] & 0xFF;
      int m = j * 2;
      paramArrayOfByte[m] = ((char)arrayOfChar[(k >>> 4)]);
      paramArrayOfByte[(m + 1)] = ((char)arrayOfChar[(k & 0xF)]);
    }
    return new String(paramArrayOfByte);
  }
  
  public final String a(PackageManager paramPackageManager)
  {
    localObject1 = null;
    try
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject2;
      if (i >= 28)
      {
        localObject2 = a;
        i.b(localObject2);
        paramPackageManager = getPackageInfogetPackageName134217728signingInfo;
        if (paramPackageManager == null) {
          return null;
        }
        if (paramPackageManager.hasMultipleSigners())
        {
          paramPackageManager = paramPackageManager.getApkContentsSigners();
          i.d(paramPackageManager, "getApkContentsSigners(...)");
          paramPackageManager = ((Signature)k.o(paramPackageManager)).toByteArray();
          i.d(paramPackageManager, "toByteArray(...)");
          paramPackageManager = b(paramPackageManager);
        }
        else
        {
          paramPackageManager = paramPackageManager.getSigningCertificateHistory();
          i.d(paramPackageManager, "getSigningCertificateHistory(...)");
          paramPackageManager = ((Signature)k.o(paramPackageManager)).toByteArray();
          i.d(paramPackageManager, "toByteArray(...)");
          paramPackageManager = b(paramPackageManager);
        }
      }
      else
      {
        localObject2 = a;
        i.b(localObject2);
        localObject2 = getPackageInfogetPackageName64signatures;
        int j = 0;
        if (localObject2 != null)
        {
          if (localObject2.length == 0) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0) {}
        }
        else
        {
          j = 1;
        }
        paramPackageManager = (PackageManager)localObject1;
        if (j == 0) {
          if (k.o((Object[])localObject2) == null)
          {
            paramPackageManager = (PackageManager)localObject1;
          }
          else
          {
            paramPackageManager = ((Signature)k.o((Object[])localObject2)).toByteArray();
            i.d(paramPackageManager, "toByteArray(...)");
            paramPackageManager = b(paramPackageManager);
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException|NoSuchAlgorithmException paramPackageManager)
    {
      for (;;)
      {
        paramPackageManager = (PackageManager)localObject1;
      }
    }
    return paramPackageManager;
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    a = paramFlutterPluginBinding.getApplicationContext();
    paramFlutterPluginBinding = new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
    b = paramFlutterPluginBinding;
    paramFlutterPluginBinding.setMethodCallHandler(this);
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    a = null;
    paramFlutterPluginBinding = b;
    i.b(paramFlutterPluginBinding);
    paramFlutterPluginBinding.setMethodCallHandler(null);
    b = null;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    i.e(paramMethodCall, "call");
    i.e(paramResult, "result");
    try
    {
      if (i.a(method, "getAll"))
      {
        paramMethodCall = a;
        i.b(paramMethodCall);
        Object localObject1 = paramMethodCall.getPackageManager();
        paramMethodCall = a;
        i.b(paramMethodCall);
        PackageInfo localPackageInfo = ((PackageManager)localObject1).getPackageInfo(paramMethodCall.getPackageName(), 0);
        String str = a((PackageManager)localObject1);
        paramMethodCall = a;
        i.b(paramMethodCall);
        paramMethodCall = paramMethodCall.getPackageManager();
        Object localObject2 = a;
        i.b(localObject2);
        localObject2 = ((Context)localObject2).getPackageName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
          paramMethodCall = paramMethodCall.getInstallSourceInfo((String)localObject2).getInitiatingPackageName();
        } else {
          paramMethodCall = paramMethodCall.getInstallerPackageName((String)localObject2);
        }
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        Object localObject3 = applicationInfo;
        localObject2 = "";
        if (localObject3 != null)
        {
          localObject1 = ((PackageItemInfo)localObject3).loadLabel((PackageManager)localObject1);
          if (localObject1 != null)
          {
            localObject3 = localObject1.toString();
            localObject1 = localObject3;
            if (localObject3 != null) {
              break label183;
            }
          }
        }
        localObject1 = "";
        label183:
        localHashMap.put("appName", localObject1);
        localObject1 = a;
        i.b(localObject1);
        localHashMap.put("packageName", ((Context)localObject1).getPackageName());
        localObject1 = versionName;
        if (localObject1 == null) {
          localObject1 = localObject2;
        }
        localHashMap.put("version", localObject1);
        long l;
        if (i >= 28) {
          l = com.google.android.recaptcha.internal.a.e(localPackageInfo);
        } else {
          l = versionCode;
        }
        localHashMap.put("buildNumber", String.valueOf(l));
        if (str != null) {
          localHashMap.put("buildSignature", str);
        }
        if (paramMethodCall != null) {
          localHashMap.put("installerStore", paramMethodCall);
        }
        paramResult.success(localHashMap);
      }
      else
      {
        paramResult.notImplemented();
      }
    }
    catch (PackageManager.NameNotFoundException paramMethodCall)
    {
      paramResult.error("Name not found", paramMethodCall.getMessage(), null);
    }
  }
}

/* Location:
 * Qualified Name:     ab.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
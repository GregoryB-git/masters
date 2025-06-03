package r5;

import A5.a.b;
import E5.j;
import E5.k.c;
import E5.k.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import com.appsflyer.internal.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class e
  implements k.c, A5.a
{
  public static final a c = new a(null);
  public Context a;
  public E5.k b;
  
  public final String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar1 = new char[16];
    char[] tmp6_5 = arrayOfChar1;
    tmp6_5[0] = 48;
    char[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 49;
    char[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 50;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 51;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 52;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 53;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 54;
    char[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 55;
    char[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 56;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 57;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 65;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 66;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 67;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 68;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 69;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 70;
    tmp90_84;
    char[] arrayOfChar2 = new char[paramArrayOfByte.length * 2];
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramArrayOfByte[j];
      int m = j * 2;
      arrayOfChar2[m] = ((char)arrayOfChar1[((k & 0xFF) >>> 4)]);
      arrayOfChar2[(m + 1)] = ((char)arrayOfChar1[(k & 0xF)]);
    }
    return new String(arrayOfChar2);
  }
  
  public final String b(PackageManager paramPackageManager)
  {
    localObject1 = null;
    try
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject2;
      if (i >= 28)
      {
        localObject2 = a;
        Intrinsics.b(localObject2);
        paramPackageManager = a.a(paramPackageManager.getPackageInfo(((Context)localObject2).getPackageName(), 134217728));
        if (paramPackageManager == null) {
          return null;
        }
        if (b.a(paramPackageManager))
        {
          paramPackageManager = c.a(paramPackageManager);
          Intrinsics.checkNotNullExpressionValue(paramPackageManager, "getApkContentsSigners(...)");
          paramPackageManager = ((Signature)W5.g.i(paramPackageManager)).toByteArray();
          Intrinsics.checkNotNullExpressionValue(paramPackageManager, "toByteArray(...)");
          paramPackageManager = e(paramPackageManager);
        }
        else
        {
          paramPackageManager = d.a(paramPackageManager);
          Intrinsics.checkNotNullExpressionValue(paramPackageManager, "getSigningCertificateHistory(...)");
          paramPackageManager = ((Signature)W5.g.i(paramPackageManager)).toByteArray();
          Intrinsics.checkNotNullExpressionValue(paramPackageManager, "toByteArray(...)");
          paramPackageManager = e(paramPackageManager);
        }
      }
      else
      {
        localObject2 = a;
        Intrinsics.b(localObject2);
        localObject2 = getPackageInfogetPackageName64signatures;
        paramPackageManager = (PackageManager)localObject1;
        if (localObject2 != null) {
          if (localObject2.length == 0)
          {
            paramPackageManager = (PackageManager)localObject1;
          }
          else
          {
            Intrinsics.checkNotNullExpressionValue(localObject2, "signatures");
            if (W5.g.i((Object[])localObject2) == null)
            {
              paramPackageManager = (PackageManager)localObject1;
            }
            else
            {
              paramPackageManager = ((Signature)W5.g.i((Object[])localObject2)).toByteArray();
              Intrinsics.checkNotNullExpressionValue(paramPackageManager, "toByteArray(...)");
              paramPackageManager = e(paramPackageManager);
            }
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
  
  public final String c()
  {
    Object localObject1 = a;
    Intrinsics.b(localObject1);
    localObject1 = ((Context)localObject1).getPackageManager();
    Object localObject2 = a;
    Intrinsics.b(localObject2);
    localObject2 = ((Context)localObject2).getPackageName();
    if (Build.VERSION.SDK_INT >= 30) {
      localObject1 = l.a(com.appsflyer.internal.k.a((PackageManager)localObject1, (String)localObject2));
    } else {
      localObject1 = ((PackageManager)localObject1).getInstallerPackageName((String)localObject2);
    }
    return (String)localObject1;
  }
  
  public final long d(PackageInfo paramPackageInfo)
  {
    long l;
    if (Build.VERSION.SDK_INT >= 28) {
      l = com.appsflyer.internal.g.a(paramPackageInfo);
    } else {
      l = versionCode;
    }
    return l;
  }
  
  public final String e(byte[] paramArrayOfByte)
  {
    MessageDigest localMessageDigest = MessageDigest.getInstance("SHA1");
    localMessageDigest.update(paramArrayOfByte);
    paramArrayOfByte = localMessageDigest.digest();
    Intrinsics.b(paramArrayOfByte);
    return a(paramArrayOfByte);
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "binding");
    a = paramb.a();
    paramb = new E5.k(paramb.b(), "dev.fluttercommunity.plus/package_info");
    b = paramb;
    Intrinsics.b(paramb);
    paramb.e(this);
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "binding");
    a = null;
    paramb = b;
    Intrinsics.b(paramb);
    paramb.e(null);
    b = null;
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    Intrinsics.checkNotNullParameter(paramj, "call");
    Intrinsics.checkNotNullParameter(paramd, "result");
    String str;
    HashMap localHashMap;
    try
    {
      if (!Intrinsics.a(a, "getAll")) {
        break label208;
      }
      paramj = a;
      Intrinsics.b(paramj);
      paramj = paramj.getPackageManager();
      Object localObject = a;
      Intrinsics.b(localObject);
      PackageInfo localPackageInfo = paramj.getPackageInfo(((Context)localObject).getPackageName(), 0);
      Intrinsics.b(paramj);
      localObject = b(paramj);
      str = c();
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localHashMap.put("appName", applicationInfo.loadLabel(paramj).toString());
      paramj = a;
      Intrinsics.b(paramj);
      localHashMap.put("packageName", paramj.getPackageName());
      localHashMap.put("version", versionName);
      Intrinsics.b(localPackageInfo);
      localHashMap.put("buildNumber", String.valueOf(d(localPackageInfo)));
      if (localObject != null) {
        localHashMap.put("buildSignature", localObject);
      }
    }
    catch (PackageManager.NameNotFoundException paramj)
    {
      break label217;
    }
    if (str != null) {
      localHashMap.put("installerStore", str);
    }
    paramd.a(localHashMap);
    return;
    label208:
    paramd.c();
    return;
    label217:
    paramd.b("Name not found", paramj.getMessage(), null);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     r5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
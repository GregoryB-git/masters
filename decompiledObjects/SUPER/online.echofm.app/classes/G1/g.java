package G1;

import O1.P;
import T1.a;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.i;
import x1.B;

public final class g
{
  public static final g a = new g();
  
  public static final void a() {}
  
  public static final void b() {}
  
  public static final String c(byte[] paramArrayOfByte)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "bytes");
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramArrayOfByte.length;
    int j = 0;
    while (j < i)
    {
      byte b = paramArrayOfByte[j];
      j++;
      Object localObject = x.a;
      localObject = String.format("%02x", Arrays.copyOf(new Object[] { Byte.valueOf(b) }, 1));
      Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
      localStringBuffer.append((String)localObject);
    }
    paramArrayOfByte = localStringBuffer.toString();
    Intrinsics.checkNotNullExpressionValue(paramArrayOfByte, "sb.toString()");
    return paramArrayOfByte;
  }
  
  public static final String d()
  {
    Object localObject = B.l();
    String str;
    try
    {
      localObject = getPackageManagergetPackageInfogetPackageName0versionName;
      Intrinsics.checkNotNullExpressionValue(localObject, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      str = "";
    }
    return str;
  }
  
  public static final View e(Activity paramActivity)
  {
    boolean bool = a.d(g.class);
    localObject = null;
    if (bool) {
      return null;
    }
    if (paramActivity == null) {
      return null;
    }
    try
    {
      try
      {
        paramActivity = paramActivity.getWindow();
        if (paramActivity == null) {
          return null;
        }
        paramActivity = paramActivity.getDecorView().getRootView();
      }
      finally
      {
        a.b(paramActivity, g.class);
        paramActivity = (Activity)localObject;
      }
    }
    catch (Exception paramActivity)
    {
      for (;;)
      {
        paramActivity = (Activity)localObject;
      }
    }
    return paramActivity;
  }
  
  public static final boolean f()
  {
    String str = Build.FINGERPRINT;
    Intrinsics.checkNotNullExpressionValue(str, "FINGERPRINT");
    boolean bool = false;
    if (!i.s(str, "generic", false, 2, null))
    {
      Intrinsics.checkNotNullExpressionValue(str, "FINGERPRINT");
      if (!i.s(str, "unknown", false, 2, null))
      {
        str = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "MODEL");
        if (!i.v(str, "google_sdk", false, 2, null))
        {
          Intrinsics.checkNotNullExpressionValue(str, "MODEL");
          if (!i.v(str, "Emulator", false, 2, null))
          {
            Intrinsics.checkNotNullExpressionValue(str, "MODEL");
            if (!i.v(str, "Android SDK built for x86", false, 2, null))
            {
              str = Build.MANUFACTURER;
              Intrinsics.checkNotNullExpressionValue(str, "MANUFACTURER");
              if (!i.v(str, "Genymotion", false, 2, null))
              {
                str = Build.BRAND;
                Intrinsics.checkNotNullExpressionValue(str, "BRAND");
                if (i.s(str, "generic", false, 2, null))
                {
                  str = Build.DEVICE;
                  Intrinsics.checkNotNullExpressionValue(str, "DEVICE");
                  if (i.s(str, "generic", false, 2, null)) {}
                }
                else if (!Intrinsics.a("google_sdk", Build.PRODUCT))
                {
                  return bool;
                }
              }
            }
          }
        }
      }
    }
    bool = true;
    return bool;
  }
  
  public static final double g(String paramString)
  {
    d1 = 0.0D;
    try
    {
      paramString = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(paramString);
      d2 = d1;
      if (paramString.find())
      {
        paramString = paramString.group(0);
        d2 = NumberFormat.getNumberInstance(P.A()).parse(paramString).doubleValue();
      }
    }
    catch (ParseException paramString)
    {
      for (;;)
      {
        double d2 = d1;
      }
    }
    return d2;
  }
}

/* Location:
 * Qualified Name:     G1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
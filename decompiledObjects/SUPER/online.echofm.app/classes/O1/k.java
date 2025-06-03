package O1;

import W5.I;
import W5.m;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;

public final class k
{
  public static final k a = new k();
  public static final HashSet b = I.c(new String[] { "8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211" });
  
  public static final boolean a(Context paramContext, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString, "packageName");
    Object localObject1 = Build.BRAND;
    int i = getApplicationInfoflags;
    Intrinsics.checkNotNullExpressionValue(localObject1, "brand");
    bool1 = false;
    if ((i.s((String)localObject1, "generic", false, 2, null)) && ((i & 0x2) != 0)) {
      return true;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      paramString = signatures;
      bool2 = bool1;
      if (paramString != null)
      {
        Intrinsics.checkNotNullExpressionValue(paramString, "packageInfo.signatures");
        if (paramString.length == 0)
        {
          bool2 = bool1;
        }
        else
        {
          paramString = signatures;
          Intrinsics.checkNotNullExpressionValue(paramString, "packageInfo.signatures");
          int j = paramString.length;
          for (i = 0; i < j; i++)
          {
            Object localObject2 = paramString[i];
            paramContext = b;
            localObject1 = P.a;
            localObject1 = ((Signature)localObject2).toByteArray();
            Intrinsics.checkNotNullExpressionValue(localObject1, "it.toByteArray()");
            bool2 = m.o(paramContext, P.E0((byte[])localObject1));
            if (!bool2)
            {
              bool2 = bool1;
              break label174;
            }
          }
          bool2 = true;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        label174:
        boolean bool2 = bool1;
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     O1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
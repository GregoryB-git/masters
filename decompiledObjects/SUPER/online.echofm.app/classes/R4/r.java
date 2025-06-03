package R4;

import S4.b.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.appsflyer.internal.g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import s3.e;
import s3.m;

public final class r
{
  public static final r a = new r();
  public static final j4.a b;
  
  static
  {
    j4.a locala = new l4.d().j(c.a).k(true).i();
    Intrinsics.checkNotNullExpressionValue(locala, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
    b = locala;
  }
  
  public final b a(e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "firebaseApp");
    Object localObject1 = parame.m();
    Intrinsics.checkNotNullExpressionValue(localObject1, "firebaseApp.applicationContext");
    String str1 = ((Context)localObject1).getPackageName();
    Object localObject2 = ((Context)localObject1).getPackageManager().getPackageInfo(str1, 0);
    if (Build.VERSION.SDK_INT >= 28) {
      localObject1 = String.valueOf(g.a((PackageInfo)localObject2));
    } else {
      localObject1 = String.valueOf(versionCode);
    }
    String str2 = parame.r().c();
    Intrinsics.checkNotNullExpressionValue(str2, "firebaseApp.options.applicationId");
    String str3 = Build.MODEL;
    Intrinsics.checkNotNullExpressionValue(str3, "MODEL");
    String str4 = Build.VERSION.RELEASE;
    Intrinsics.checkNotNullExpressionValue(str4, "RELEASE");
    n localn = n.s;
    Intrinsics.checkNotNullExpressionValue(str1, "packageName");
    localObject2 = versionName;
    parame = (e)localObject2;
    if (localObject2 == null) {
      parame = (e)localObject1;
    }
    localObject2 = Build.MANUFACTURER;
    Intrinsics.checkNotNullExpressionValue(localObject2, "MANUFACTURER");
    return new b(str2, str3, "1.1.0", str4, localn, new a(str1, parame, (String)localObject1, (String)localObject2));
  }
  
  public final j4.a b()
  {
    return b;
  }
  
  public final q c(e parame, p paramp, T4.f paramf, Map paramMap)
  {
    Intrinsics.checkNotNullParameter(parame, "firebaseApp");
    Intrinsics.checkNotNullParameter(paramp, "sessionDetails");
    Intrinsics.checkNotNullParameter(paramf, "sessionsSettings");
    Intrinsics.checkNotNullParameter(paramMap, "subscribers");
    return new q(j.q, new t(paramp.b(), paramp.a(), paramp.c(), paramp.d(), new f(d((S4.b)paramMap.get(b.a.p)), d((S4.b)paramMap.get(b.a.o)), paramf.b()), null, 32, null), a(parame));
  }
  
  public final d d(S4.b paramb)
  {
    if (paramb == null) {
      paramb = d.q;
    } else if (paramb.c()) {
      paramb = d.r;
    } else {
      paramb = d.s;
    }
    return paramb;
  }
}

/* Location:
 * Qualified Name:     R4.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
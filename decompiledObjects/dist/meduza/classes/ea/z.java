package ea;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import ec.i;
import java.util.ArrayList;
import java.util.Iterator;

public final class z
{
  public static final z a = new z();
  public static final a9.d b;
  
  static
  {
    a9.e locale = new a9.e();
    locale.a(y.class, g.a);
    locale.a(f0.class, h.a);
    locale.a(j.class, e.a);
    locale.a(b.class, d.a);
    locale.a(a.class, c.a);
    locale.a(s.class, f.a);
    d = true;
    b = new a9.d(locale);
  }
  
  public static b a(u7.f paramf)
  {
    paramf.a();
    Object localObject1 = a;
    i.d(localObject1, "firebaseApp.applicationContext");
    String str1 = ((Context)localObject1).getPackageName();
    Object localObject2 = ((Context)localObject1).getPackageManager().getPackageInfo(str1, 0);
    if (Build.VERSION.SDK_INT >= 28) {
      localObject1 = String.valueOf(com.google.android.recaptcha.internal.a.e((PackageInfo)localObject2));
    } else {
      localObject1 = String.valueOf(versionCode);
    }
    paramf.a();
    String str2 = c.b;
    i.d(str2, "firebaseApp.options.applicationId");
    String str3 = Build.MODEL;
    i.d(str3, "MODEL");
    String str4 = Build.VERSION.RELEASE;
    i.d(str4, "RELEASE");
    i.d(str1, "packageName");
    localObject2 = versionName;
    if (localObject2 == null) {
      localObject2 = localObject1;
    }
    String str5 = Build.MANUFACTURER;
    i.d(str5, "MANUFACTURER");
    paramf.a();
    Object localObject3 = a;
    i.d(localObject3, "firebaseApp.applicationContext");
    int i = Process.myPid();
    Object localObject4 = t.a((Context)localObject3).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = ((Iterator)localObject4).next();
      int j;
      if (b == i) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        break label217;
      }
    }
    localObject3 = null;
    label217:
    localObject4 = (s)localObject3;
    localObject3 = localObject4;
    if (localObject4 == null) {
      localObject3 = new s(i, 0, t.b(), false);
    }
    paramf.a();
    paramf = a;
    i.d(paramf, "firebaseApp.applicationContext");
    return new b(str2, str3, str4, new a(str1, (String)localObject2, (String)localObject1, str5, (s)localObject3, t.a(paramf)));
  }
}

/* Location:
 * Qualified Name:     ea.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package H3;

import E3.e;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import com.appsflyer.internal.g;
import java.util.List;

public class a
{
  public final String a;
  public final String b;
  public final List c;
  public final String d;
  public final String e;
  public final String f;
  public final String g;
  public final e h;
  
  public a(String paramString1, String paramString2, List paramList, String paramString3, String paramString4, String paramString5, String paramString6, e parame)
  {
    a = paramString1;
    b = paramString2;
    c = paramList;
    d = paramString3;
    e = paramString4;
    f = paramString5;
    g = paramString6;
    h = parame;
  }
  
  public static a a(Context paramContext, C paramC, String paramString1, String paramString2, List paramList, e parame)
  {
    String str1 = paramContext.getPackageName();
    String str2 = paramC.g();
    paramContext = paramContext.getPackageManager().getPackageInfo(str1, 0);
    String str3 = b(paramContext);
    paramC = versionName;
    paramContext = paramC;
    if (paramC == null) {
      paramContext = "0.0";
    }
    return new a(paramString1, paramString2, paramList, str2, str1, str3, paramContext, parame);
  }
  
  public static String b(PackageInfo paramPackageInfo)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Long.toString(g.a(paramPackageInfo));
    }
    return Integer.toString(versionCode);
  }
}

/* Location:
 * Qualified Name:     H3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package x1;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;

public final class F$h
  implements F.e
{
  public F$h(ArrayList paramArrayList) {}
  
  public void a(String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "key");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    ArrayList localArrayList = a;
    x localx = x.a;
    paramString1 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[] { paramString1, URLEncoder.encode(paramString2, "UTF-8") }, 2));
    Intrinsics.checkNotNullExpressionValue(paramString1, "java.lang.String.format(locale, format, *args)");
    localArrayList.add(paramString1);
  }
}

/* Location:
 * Qualified Name:     x1.F.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
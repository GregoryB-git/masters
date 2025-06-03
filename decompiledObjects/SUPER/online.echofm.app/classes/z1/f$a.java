package z1;

import android.app.Activity;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.i;

public final class f$a
{
  public final String c(String paramString1, String paramString2)
  {
    String str = paramString2;
    if (Intrinsics.a("r2", paramString1)) {
      str = new Regex("[^\\d.]").replace(paramString2, "");
    }
    return str;
  }
  
  public final void d(Map paramMap, String paramString1, String paramString2)
  {
    String str;
    switch (paramString1.hashCode())
    {
    default: 
      str = paramString2;
      break;
    case 3588: 
      if (!paramString1.equals("r6"))
      {
        str = paramString2;
        break label239;
      }
      str = paramString2;
      if (!i.v(paramString2, "-", false, 2, null)) {
        break label239;
      }
      paramString2 = ((Collection)new Regex("-").c(paramString2, 0)).toArray(new String[0]);
      if (paramString2 != null)
      {
        str = ((String[])paramString2)[0];
        break label239;
      }
      throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    case 3587: 
      if (!paramString1.equals("r5")) {
        str = paramString2;
      }
      break;
    case 3586: 
      if (!paramString1.equals("r4")) {
        str = paramString2;
      } else {
        str = new Regex("[^a-z]+").replace(paramString2, "");
      }
      break;
    }
    if (!paramString1.equals("r3")) {
      str = paramString2;
    } else if ((!i.s(paramString2, "m", false, 2, null)) && (!i.s(paramString2, "b", false, 2, null)) && (!i.s(paramString2, "ge", false, 2, null))) {
      str = "f";
    } else {
      str = "m";
    }
    label239:
    paramMap.put(paramString1, str);
  }
  
  public final void e(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    int i = paramActivity.hashCode();
    Map localMap = f.b();
    Integer localInteger = Integer.valueOf(i);
    Object localObject1 = localMap.get(localInteger);
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new f(paramActivity, null);
      localMap.put(localInteger, localObject2);
    }
    f.c((f)localObject2);
  }
}

/* Location:
 * Qualified Name:     z1.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
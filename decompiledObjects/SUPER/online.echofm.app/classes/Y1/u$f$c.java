package Y1;

import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import x1.a;
import x1.i;

public final class u$f$c
{
  public final u.f a(u.e parame, String paramString)
  {
    return new u.f(parame, u.f.a.q, null, paramString, null);
  }
  
  public final u.f b(u.e parame, a parama, i parami)
  {
    return new u.f(parame, u.f.a.p, parama, parami, null, null);
  }
  
  public final u.f c(u.e parame, String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramString1 != null) {
      localArrayList.add(paramString1);
    }
    if (paramString2 != null) {
      localArrayList.add(paramString2);
    }
    paramString1 = TextUtils.join(": ", localArrayList);
    return new u.f(parame, u.f.a.r, null, paramString1, paramString3);
  }
  
  public final u.f e(u.e parame, a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "token");
    return new u.f(parame, u.f.a.p, parama, null, null);
  }
}

/* Location:
 * Qualified Name:     Y1.u.f.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
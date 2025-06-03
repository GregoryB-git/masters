package O1;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class m$a
{
  public final m a(Context paramContext, String paramString1, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramString1, "url");
    Intrinsics.checkNotNullParameter(paramString2, "expectedRedirectUrl");
    V.s(paramContext);
    return new m(paramContext, paramString1, paramString2, null);
  }
}

/* Location:
 * Qualified Name:     O1.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
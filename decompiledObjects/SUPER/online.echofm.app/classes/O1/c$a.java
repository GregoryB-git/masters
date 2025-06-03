package O1;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class c$a
  implements c.h
{
  public void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramObject, "value");
    paramBundle.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
  }
}

/* Location:
 * Qualified Name:     O1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
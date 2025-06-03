package O1;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class c$d
  implements c.h
{
  public void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramObject, "value");
    paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
  }
}

/* Location:
 * Qualified Name:     O1.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
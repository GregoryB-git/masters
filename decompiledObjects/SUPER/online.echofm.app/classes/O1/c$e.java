package O1;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class c$e
  implements c.h
{
  public void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramObject, "value");
    paramBundle.putString(paramString, (String)paramObject);
  }
}

/* Location:
 * Qualified Name:     O1.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
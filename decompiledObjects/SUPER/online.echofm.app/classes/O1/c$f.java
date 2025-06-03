package O1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class c$f
  implements c.h
{
  public void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramObject, "value");
    throw new IllegalArgumentException("Unexpected type from JSON");
  }
}

/* Location:
 * Qualified Name:     O1.c.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
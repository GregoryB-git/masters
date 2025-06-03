package O1;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class c$b
  implements c.h
{
  public void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "bundle");
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramObject, "value");
    paramBundle.putInt(paramString, ((Integer)paramObject).intValue());
  }
}

/* Location:
 * Qualified Name:     O1.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
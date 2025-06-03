package R;

import O.a;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public abstract class b
{
  public static final File a(Context paramContext, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "name");
    return a.a(paramContext, Intrinsics.i(paramString, ".preferences_pb"));
  }
}

/* Location:
 * Qualified Name:     R.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
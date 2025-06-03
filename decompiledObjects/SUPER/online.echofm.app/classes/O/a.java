package O;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public abstract class a
{
  public static final File a(Context paramContext, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "fileName");
    return new File(paramContext.getApplicationContext().getFilesDir(), Intrinsics.i("datastore/", paramString));
  }
}

/* Location:
 * Qualified Name:     O.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
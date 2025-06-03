package p2;

import android.content.Context;
import ec.i;
import java.io.File;

public final class a
{
  public static final a a = new a();
  
  public final File a(Context paramContext)
  {
    i.e(paramContext, "context");
    paramContext = paramContext.getNoBackupFilesDir();
    i.d(paramContext, "context.noBackupFilesDir");
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     p2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
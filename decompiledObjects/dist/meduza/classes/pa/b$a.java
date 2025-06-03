package pa;

import android.util.Log;
import ec.i;
import java.io.File;

public final class b$a
{
  public static void a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile != null) {
        for (int i = 0;; i++)
        {
          int j;
          if (i < arrayOfFile.length) {
            j = 1;
          } else {
            j = 0;
          }
          if (j == 0) {
            break;
          }
          File localFile = arrayOfFile[i];
          i.b(localFile);
          a(localFile);
        }
      }
    }
    if (!paramFile.delete()) {
      Log.e("BetterPlayer", "Failed to delete cache dir.");
    }
  }
}

/* Location:
 * Qualified Name:     pa.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package va;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.File;
import p2.m0;

public final class r
  implements Runnable
{
  public final void run()
  {
    synchronized (s.f)
    {
      Object localObject2 = a;
      if (localObject2 != null) {
        s.a(d, (d)localObject2);
      }
      try
      {
        if (m0.O(s.o))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("delete database ");
          ((StringBuilder)localObject2).append(b);
          Log.d("Sqflite", ((StringBuilder)localObject2).toString());
        }
        localObject2 = b;
        File localFile = new java/io/File;
        localFile.<init>((String)localObject2);
        SQLiteDatabase.deleteDatabase(localFile);
      }
      catch (Exception localException)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("error ");
        ((StringBuilder)localObject2).append(localException);
        ((StringBuilder)localObject2).append(" while closing database ");
        ((StringBuilder)localObject2).append(s.s);
        Log.e("Sqflite", ((StringBuilder)localObject2).toString());
      }
      c.success(null);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     va.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
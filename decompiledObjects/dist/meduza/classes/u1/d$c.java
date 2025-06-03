package u1;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import dc.a;
import ec.i;
import ec.j;
import java.io.File;

public final class d$c
  extends j
  implements a<d.b>
{
  public d$c(d paramd)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    Object localObject1 = a;
    if ((b != null) && (d))
    {
      localObject1 = a.a;
      i.e(localObject1, "context");
      localObject1 = ((Context)localObject1).getNoBackupFilesDir();
      i.d(localObject1, "context.noBackupFilesDir");
      Object localObject2 = new File((File)localObject1, a.b);
      localObject1 = a.a;
      localObject2 = ((File)localObject2).getAbsolutePath();
      d.a locala = new d.a();
      d locald = a;
      localObject1 = new d.b((Context)localObject1, (String)localObject2, locala, c, e);
    }
    else
    {
      localObject1 = a;
      localObject1 = new d.b(a, b, new d.a(), c, e);
    }
    ((SQLiteOpenHelper)localObject1).setWriteAheadLoggingEnabled(a.o);
    return localObject1;
  }
}

/* Location:
 * Qualified Name:     u1.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
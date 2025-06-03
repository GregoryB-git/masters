package t1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import ec.i;
import java.io.Closeable;
import java.io.File;
import lc.h;

public abstract interface c
  extends Closeable
{
  public abstract void close();
  
  public abstract String getDatabaseName();
  
  public abstract b getWritableDatabase();
  
  public abstract void setWriteAheadLoggingEnabled(boolean paramBoolean);
  
  public static abstract class a
  {
    public final int a;
    
    public a(int paramInt)
    {
      a = paramInt;
    }
    
    public static void a(String paramString)
    {
      if (!h.k0(paramString, ":memory:"))
      {
        int i = paramString.length();
        int j = 1;
        int k = i - 1;
        i = 0;
        int m = i;
        while (i <= k)
        {
          int n;
          if (m == 0) {
            n = i;
          } else {
            n = k;
          }
          if (i.f(paramString.charAt(n), 32) <= 0) {
            n = 1;
          } else {
            n = 0;
          }
          if (m == 0)
          {
            if (n == 0) {
              m = 1;
            } else {
              i++;
            }
          }
          else
          {
            if (n == 0) {
              break;
            }
            k--;
          }
        }
        if (paramString.subSequence(i, k + 1).toString().length() == 0) {
          i = j;
        } else {
          i = 0;
        }
        if (i == 0)
        {
          Object localObject = new StringBuilder();
          ((StringBuilder)localObject).append("deleting the database file: ");
          ((StringBuilder)localObject).append(paramString);
          Log.w("SupportSQLite", ((StringBuilder)localObject).toString());
          try
          {
            localObject = new java/io/File;
            ((File)localObject).<init>(paramString);
            SQLiteDatabase.deleteDatabase((File)localObject);
          }
          catch (Exception paramString)
          {
            Log.w("SupportSQLite", "delete failed: ", paramString);
          }
        }
      }
    }
    
    public abstract void b(u1.c paramc);
    
    public abstract void c(u1.c paramc);
    
    public abstract void d(u1.c paramc, int paramInt1, int paramInt2);
    
    public abstract void e(u1.c paramc);
    
    public abstract void f(u1.c paramc, int paramInt1, int paramInt2);
  }
  
  public static final class b
  {
    public final Context a;
    public final String b;
    public final c.a c;
    public final boolean d;
    public final boolean e;
    
    public b(Context paramContext, String paramString, c.a parama, boolean paramBoolean1, boolean paramBoolean2)
    {
      a = paramContext;
      b = paramString;
      c = parama;
      d = paramBoolean1;
      e = paramBoolean2;
    }
  }
  
  public static abstract interface c
  {
    public abstract c c(c.b paramb);
  }
}

/* Location:
 * Qualified Name:     t1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
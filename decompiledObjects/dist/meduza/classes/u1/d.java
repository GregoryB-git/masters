package u1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import b.z;
import ec.i;
import ec.j;
import java.io.File;
import java.util.UUID;
import p2.m0;
import t1.b;
import t1.c.a;

public final class d
  implements t1.c
{
  public final Context a;
  public final String b;
  public final c.a c;
  public final boolean d;
  public final boolean e;
  public final rb.g f;
  public boolean o;
  
  public d(Context paramContext, String paramString, c.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramContext;
    b = paramString;
    c = parama;
    d = paramBoolean1;
    e = paramBoolean2;
    f = z.n(new c(this));
  }
  
  public final void close()
  {
    int i;
    if (f.b != m0.B) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      ((b)f.getValue()).close();
    }
  }
  
  public final String getDatabaseName()
  {
    return b;
  }
  
  public final b getWritableDatabase()
  {
    return ((b)f.getValue()).f(true);
  }
  
  public final void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    int i;
    if (f.b != m0.B) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      b localb = (b)f.getValue();
      i.e(localb, "sQLiteOpenHelper");
      localb.setWriteAheadLoggingEnabled(paramBoolean);
    }
    o = paramBoolean;
  }
  
  public static final class a
  {
    public c a = null;
  }
  
  public static final class b
    extends SQLiteOpenHelper
  {
    public final Context a;
    public final d.a b;
    public final c.a c;
    public final boolean d;
    public boolean e;
    public final v1.a f;
    public boolean o;
    
    public b(Context paramContext, String paramString, d.a parama, c.a parama1, boolean paramBoolean)
    {
      super(paramString, null, a, new e(parama1, parama));
      a = paramContext;
      b = parama;
      c = parama1;
      d = paramBoolean;
      parama = paramString;
      if (paramString == null)
      {
        parama = UUID.randomUUID().toString();
        i.d(parama, "randomUUID().toString()");
      }
      paramContext = paramContext.getCacheDir();
      i.d(paramContext, "context.cacheDir");
      f = new v1.a(parama, paramContext, false);
    }
    
    public final SQLiteDatabase C(boolean paramBoolean)
    {
      SQLiteDatabase localSQLiteDatabase;
      if (paramBoolean) {
        localSQLiteDatabase = getWritableDatabase();
      } else {
        localSQLiteDatabase = getReadableDatabase();
      }
      i.d(localSQLiteDatabase, "{\n                super.…eDatabase()\n            }");
      return localSQLiteDatabase;
    }
    
    public final SQLiteDatabase H(boolean paramBoolean)
    {
      Object localObject1 = getDatabaseName();
      Object localObject2;
      Object localObject3;
      if (localObject1 != null)
      {
        localObject2 = a.getDatabasePath((String)localObject1).getParentFile();
        if (localObject2 != null)
        {
          ((File)localObject2).mkdirs();
          if (!((File)localObject2).isDirectory())
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("Invalid database parent file, not a directory: ");
            ((StringBuilder)localObject3).append(localObject2);
            Log.w("SupportSQLite", ((StringBuilder)localObject3).toString());
          }
        }
      }
      try
      {
        localObject3 = C(paramBoolean);
        return (SQLiteDatabase)localObject3;
      }
      finally
      {
        super.close();
      }
      try
      {
        Thread.sleep(500L);
        Throwable localThrowable;
        label221:
        label224:
        try
        {
          SQLiteDatabase localSQLiteDatabase = C(paramBoolean);
          return localSQLiteDatabase;
        }
        finally
        {
          super.close();
          if ((localObject5 instanceof a))
          {
            localObject2 = (a)localObject5;
            localThrowable = b;
            int i = q0.g.c(a);
            if ((i != 0) && (i != 1) && (i != 2) && (i != 3))
            {
              if (!(localThrowable instanceof SQLiteException)) {
                throw localThrowable;
              }
            }
            else {
              throw localThrowable;
            }
          }
          else
          {
            if (!(localThrowable instanceof SQLiteException)) {
              break label224;
            }
            if ((localObject1 == null) || (!d)) {
              break label221;
            }
          }
          a.deleteDatabase((String)localObject1);
          try
          {
            localObject1 = C(paramBoolean);
            return (SQLiteDatabase)localObject1;
          }
          catch (a locala)
          {
            throw b;
          }
          throw localThrowable;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
    
    public final void close()
    {
      try
      {
        v1.a locala = f;
        locala.a(a);
        super.close();
        b.a = null;
        o = false;
        return;
      }
      finally
      {
        f.b();
      }
    }
    
    public final b f(boolean paramBoolean)
    {
      try
      {
        Object localObject1 = f;
        boolean bool;
        if ((!o) && (getDatabaseName() != null)) {
          bool = true;
        } else {
          bool = false;
        }
        ((v1.a)localObject1).a(bool);
        e = false;
        localObject1 = H(paramBoolean);
        if (e)
        {
          close();
          localObject1 = f(paramBoolean);
          return (b)localObject1;
        }
        localObject1 = g((SQLiteDatabase)localObject1);
        return (b)localObject1;
      }
      finally
      {
        f.b();
      }
    }
    
    public final c g(SQLiteDatabase paramSQLiteDatabase)
    {
      i.e(paramSQLiteDatabase, "sqLiteDatabase");
      return b.a(b, paramSQLiteDatabase);
    }
    
    public final void onConfigure(SQLiteDatabase paramSQLiteDatabase)
    {
      i.e(paramSQLiteDatabase, "db");
      try
      {
        c.b(g(paramSQLiteDatabase));
        return;
      }
      finally {}
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      i.e(paramSQLiteDatabase, "sqLiteDatabase");
      try
      {
        c.c(g(paramSQLiteDatabase));
        return;
      }
      finally {}
    }
    
    public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      i.e(paramSQLiteDatabase, "db");
      e = true;
      try
      {
        c.d(g(paramSQLiteDatabase), paramInt1, paramInt2);
        return;
      }
      finally {}
    }
    
    /* Error */
    public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
    {
      // Byte code:
      //   0: aload_1
      //   1: ldc -51
      //   3: invokestatic 34	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_0
      //   7: getfield 187	u1/d$b:e	Z
      //   10: ifne +29 -> 39
      //   13: aload_0
      //   14: getfield 54	u1/d$b:c	Lt1/c$a;
      //   17: aload_0
      //   18: aload_1
      //   19: invokevirtual 196	u1/d$b:g	(Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;
      //   22: invokevirtual 222	t1/c$a:e	(Lu1/c;)V
      //   25: goto +14 -> 39
      //   28: astore_1
      //   29: new 9	u1/d$b$a
      //   32: dup
      //   33: iconst_5
      //   34: aload_1
      //   35: invokespecial 211	u1/d$b$a:<init>	(ILjava/lang/Throwable;)V
      //   38: athrow
      //   39: aload_0
      //   40: iconst_1
      //   41: putfield 182	u1/d$b:o	Z
      //   44: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	45	0	this	b
      //   0	45	1	paramSQLiteDatabase	SQLiteDatabase
      // Exception table:
      //   from	to	target	type
      //   13	25	28	finally
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      i.e(paramSQLiteDatabase, "sqLiteDatabase");
      e = true;
      try
      {
        c.f(g(paramSQLiteDatabase), paramInt1, paramInt2);
        return;
      }
      finally {}
    }
    
    public static final class a
      extends RuntimeException
    {
      public final int a;
      public final Throwable b;
      
      public a(int paramInt, Throwable paramThrowable)
      {
        super();
        a = paramInt;
        b = paramThrowable;
      }
      
      public final Throwable getCause()
      {
        return b;
      }
    }
    
    public static final class b
    {
      public static c a(d.a parama, SQLiteDatabase paramSQLiteDatabase)
      {
        i.e(parama, "refHolder");
        i.e(paramSQLiteDatabase, "sqLiteDatabase");
        c localc1 = a;
        c localc2;
        if (localc1 != null)
        {
          localc2 = localc1;
          if (i.a(a, paramSQLiteDatabase)) {}
        }
        else
        {
          localc2 = new c(paramSQLiteDatabase);
          a = localc2;
        }
        return localc2;
      }
    }
  }
  
  public static final class c
    extends j
    implements dc.a<d.b>
  {
    public c(d paramd)
    {
      super();
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
}

/* Location:
 * Qualified Name:     u1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
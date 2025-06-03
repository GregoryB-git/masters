package i9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.f.a;
import e9.e;
import g;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n9.h;
import n9.l;
import n9.o;

public final class y0
  extends e9.a
{
  public final c b;
  public final i c;
  public final j1 d;
  public final i0 e;
  public final b1 f;
  public final v0 g;
  public final a h = new a();
  public SQLiteDatabase i;
  public boolean j;
  
  public y0(Context paramContext, String paramString, j9.f paramf, i parami, q.b paramb)
  {
    b = paramContext;
    c = parami;
    d = new j1(this, parami);
    e = new i0(this, parami);
    f = new b1(this, parami);
    g = new v0(this, paramb);
  }
  
  public static void C(SQLiteProgram paramSQLiteProgram, Object[] paramArrayOfObject)
  {
    int m = 0;
    while (m < paramArrayOfObject.length)
    {
      Object localObject = paramArrayOfObject[m];
      if (localObject == null)
      {
        paramSQLiteProgram.bindNull(m + 1);
      }
      else if ((localObject instanceof String))
      {
        paramSQLiteProgram.bindString(m + 1, (String)localObject);
      }
      else
      {
        int n;
        long l;
        if ((localObject instanceof Integer))
        {
          n = m + 1;
          l = ((Integer)localObject).intValue();
        }
        else
        {
          if (!(localObject instanceof Long)) {
            break label104;
          }
          n = m + 1;
          l = ((Long)localObject).longValue();
        }
        paramSQLiteProgram.bindLong(n, l);
        break label146;
        label104:
        if ((localObject instanceof Double))
        {
          paramSQLiteProgram.bindDouble(m + 1, ((Double)localObject).doubleValue());
        }
        else
        {
          if (!(localObject instanceof byte[])) {
            break label152;
          }
          paramSQLiteProgram.bindBlob(m + 1, (byte[])localObject);
        }
      }
      label146:
      m++;
      continue;
      label152:
      x6.b.T("Unknown argument %s of type %s", new Object[] { localObject, localObject.getClass() });
      throw null;
    }
  }
  
  public static void D(Context paramContext, j9.f paramf, String paramString)
  {
    paramContext = paramContext.getDatabasePath(E(paramString, paramf)).getPath();
    paramString = g.d(paramContext, "-journal");
    paramf = g.d(paramContext, "-wal");
    paramContext = new File(paramContext);
    paramString = new File(paramString);
    paramf = new File(paramf);
    try
    {
      h.a(paramContext);
      h.a(paramString);
      h.a(paramf);
      return;
    }
    catch (IOException paramf)
    {
      paramContext = new StringBuilder();
      paramContext.append("Failed to clear persistence.");
      paramContext.append(paramf);
      throw new com.google.firebase.firestore.f(paramContext.toString(), f.a.d);
    }
  }
  
  public static String E(String paramString, j9.f paramf)
  {
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("firestore.");
      localStringBuilder.append(URLEncoder.encode(paramString, "utf-8"));
      localStringBuilder.append(".");
      localStringBuilder.append(URLEncoder.encode(a, "utf-8"));
      localStringBuilder.append(".");
      localStringBuilder.append(URLEncoder.encode(b, "utf-8"));
      paramString = localStringBuilder.toString();
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  public static int F(SQLiteStatement paramSQLiteStatement, Object... paramVarArgs)
  {
    paramSQLiteStatement.clearBindings();
    C(paramSQLiteStatement, paramVarArgs);
    return paramSQLiteStatement.executeUpdateDelete();
  }
  
  public final void A()
  {
    x6.b.Z("SQLitePersistence shutdown without start!", j, new Object[0]);
    j = false;
    i.close();
    i = null;
  }
  
  public final void B()
  {
    boolean bool1 = j;
    boolean bool2 = true;
    x6.b.Z("SQLitePersistence double-started!", bool1 ^ true, new Object[0]);
    j = true;
    try
    {
      i = b.getWritableDatabase();
      Object localObject = d;
      if (a.H("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").b(new t(localObject, 3)) != 1) {
        bool2 = false;
      }
      x6.b.Z("Missing target_globals entry", bool2, new Object[0]);
      localObject = g;
      long l = d.d;
      localObject.getClass();
      b = new g9.a0(l);
      return;
    }
    catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
    {
      throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", localSQLiteDatabaseLockedException);
    }
  }
  
  public final void G(String paramString, Object... paramVarArgs)
  {
    i.execSQL(paramString, paramVarArgs);
  }
  
  public final d H(String paramString)
  {
    return new d(i, paramString);
  }
  
  public final a j()
  {
    return e;
  }
  
  public final b k(e parame)
  {
    return new m0(this, c, parame);
  }
  
  public final d l()
  {
    return new n0();
  }
  
  public final f m(e parame)
  {
    return new t0(this, c, parame);
  }
  
  public final a0 n(e parame, f paramf)
  {
    return new w0(this, c, parame, paramf);
  }
  
  public final b0 o()
  {
    return new x0(this);
  }
  
  public final f0 p()
  {
    return g;
  }
  
  public final g0 q()
  {
    return f;
  }
  
  public final l1 r()
  {
    return d;
  }
  
  public final boolean u()
  {
    return j;
  }
  
  public final <T> T x(String paramString, l<T> paraml)
  {
    p2.m0.y(1, "a", "Starting transaction: %s", new Object[] { paramString });
    i.beginTransactionWithListener(h);
    try
    {
      paramString = paraml.get();
      i.setTransactionSuccessful();
      return paramString;
    }
    finally
    {
      i.endTransaction();
    }
  }
  
  public final void y(String paramString, Runnable paramRunnable)
  {
    p2.m0.y(1, "a", "Starting transaction: %s", new Object[] { paramString });
    i.beginTransactionWithListener(h);
    try
    {
      paramRunnable.run();
      i.setTransactionSuccessful();
      return;
    }
    finally
    {
      i.endTransaction();
    }
  }
  
  public final class a
    implements SQLiteTransactionListener
  {
    public a() {}
    
    public final void onBegin()
    {
      g.f();
    }
    
    public final void onCommit()
    {
      g.d();
    }
    
    public final void onRollback() {}
  }
  
  public static final class b
  {
    public final y0 a;
    public final String b;
    public final String c;
    public final List<Object> d;
    public int e = 0;
    public final Iterator<Object> f;
    
    public b(y0 paramy0, String paramString1, List paramList, ArrayList paramArrayList, String paramString2)
    {
      a = paramy0;
      b = paramString1;
      d = paramList;
      c = paramString2;
      f = paramArrayList.iterator();
    }
    
    public b(y0 paramy0, ArrayList paramArrayList)
    {
      a = paramy0;
      b = "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (";
      d = Collections.emptyList();
      c = ") ORDER BY path";
      f = paramArrayList.iterator();
    }
    
    public final y0.d a()
    {
      e += 1;
      Object localObject1 = new ArrayList(d);
      for (int i = 0; (f.hasNext()) && (i < 900 - d.size()); i++) {
        ((ArrayList)localObject1).add(f.next());
      }
      localObject1 = ((ArrayList)localObject1).toArray();
      Object localObject2 = a;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(b);
      localStringBuilder.append(o.h("?", localObject1.length, ", "));
      localStringBuilder.append(c);
      localObject2 = ((y0)localObject2).H(localStringBuilder.toString());
      ((y0.d)localObject2).a((Object[])localObject1);
      return (y0.d)localObject2;
    }
  }
  
  public static final class c
    extends SQLiteOpenHelper
  {
    public final i a;
    public boolean b;
    
    public c(Context paramContext, i parami, String paramString)
    {
      super(paramString, null, 17);
      a = parami;
    }
    
    public final void onConfigure(SQLiteDatabase paramSQLiteDatabase)
    {
      b = true;
      paramSQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      if (!b) {
        onConfigure(paramSQLiteDatabase);
      }
      new h1(paramSQLiteDatabase, a).c(0);
    }
    
    public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      if (!b) {
        onConfigure(paramSQLiteDatabase);
      }
    }
    
    public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
    {
      if (!b) {
        onConfigure(paramSQLiteDatabase);
      }
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      if (!b) {
        onConfigure(paramSQLiteDatabase);
      }
      new h1(paramSQLiteDatabase, a).c(paramInt1);
    }
  }
  
  public static final class d
  {
    public final SQLiteDatabase a;
    public final String b;
    public u1.b c;
    
    public d(SQLiteDatabase paramSQLiteDatabase, String paramString)
    {
      a = paramSQLiteDatabase;
      b = paramString;
    }
    
    public final void a(Object... paramVarArgs)
    {
      c = new u1.b(paramVarArgs, 1);
    }
    
    /* Error */
    public final int b(n9.d<Cursor> paramd)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 36	i9/y0$d:e	()Landroid/database/Cursor;
      //   4: astore_2
      //   5: aload_2
      //   6: invokeinterface 42 1 0
      //   11: ifeq +20 -> 31
      //   14: aload_1
      //   15: aload_2
      //   16: invokeinterface 48 2 0
      //   21: iconst_1
      //   22: istore_3
      //   23: aload_2
      //   24: invokeinterface 51 1 0
      //   29: iload_3
      //   30: ireturn
      //   31: iconst_0
      //   32: istore_3
      //   33: goto -10 -> 23
      //   36: astore_1
      //   37: aload_2
      //   38: ifnull +18 -> 56
      //   41: aload_2
      //   42: invokeinterface 51 1 0
      //   47: goto +9 -> 56
      //   50: astore_2
      //   51: aload_1
      //   52: aload_2
      //   53: invokevirtual 57	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   56: aload_1
      //   57: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	58	0	this	d
      //   0	58	1	paramd	n9.d<Cursor>
      //   4	38	2	localCursor	Cursor
      //   50	3	2	localThrowable	Throwable
      //   22	11	3	i	int
      // Exception table:
      //   from	to	target	type
      //   5	21	36	finally
      //   41	47	50	finally
    }
    
    /* Error */
    public final <T> T c(n9.i<Cursor, T> parami)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 36	i9/y0$d:e	()Landroid/database/Cursor;
      //   4: astore_2
      //   5: aload_2
      //   6: invokeinterface 42 1 0
      //   11: ifeq +19 -> 30
      //   14: aload_1
      //   15: aload_2
      //   16: invokeinterface 66 2 0
      //   21: astore_1
      //   22: aload_2
      //   23: invokeinterface 51 1 0
      //   28: aload_1
      //   29: areturn
      //   30: aload_2
      //   31: invokeinterface 51 1 0
      //   36: aconst_null
      //   37: areturn
      //   38: astore_1
      //   39: aload_2
      //   40: ifnull +18 -> 58
      //   43: aload_2
      //   44: invokeinterface 51 1 0
      //   49: goto +9 -> 58
      //   52: astore_2
      //   53: aload_1
      //   54: aload_2
      //   55: invokevirtual 57	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   58: aload_1
      //   59: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	60	0	this	d
      //   0	60	1	parami	n9.i<Cursor, T>
      //   4	40	2	localCursor	Cursor
      //   52	3	2	localThrowable	Throwable
      // Exception table:
      //   from	to	target	type
      //   5	22	38	finally
      //   43	49	52	finally
    }
    
    /* Error */
    public final int d(n9.d<Cursor> paramd)
    {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual 36	i9/y0$d:e	()Landroid/database/Cursor;
      //   4: astore_2
      //   5: iconst_0
      //   6: istore_3
      //   7: aload_2
      //   8: invokeinterface 70 1 0
      //   13: ifeq +16 -> 29
      //   16: iinc 3 1
      //   19: aload_1
      //   20: aload_2
      //   21: invokeinterface 48 2 0
      //   26: goto -19 -> 7
      //   29: aload_2
      //   30: invokeinterface 51 1 0
      //   35: iload_3
      //   36: ireturn
      //   37: astore_1
      //   38: aload_2
      //   39: ifnull +18 -> 57
      //   42: aload_2
      //   43: invokeinterface 51 1 0
      //   48: goto +9 -> 57
      //   51: astore_2
      //   52: aload_1
      //   53: aload_2
      //   54: invokevirtual 57	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   57: aload_1
      //   58: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	59	0	this	d
      //   0	59	1	paramd	n9.d<Cursor>
      //   4	39	2	localCursor	Cursor
      //   51	3	2	localThrowable	Throwable
      //   6	30	3	i	int
      // Exception table:
      //   from	to	target	type
      //   7	16	37	finally
      //   19	26	37	finally
      //   42	48	51	finally
    }
    
    public final Cursor e()
    {
      u1.b localb = c;
      if (localb != null) {
        return a.rawQueryWithFactory(localb, b, null, null);
      }
      return a.rawQuery(b, null);
    }
  }
}

/* Location:
 * Qualified Name:     i9.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
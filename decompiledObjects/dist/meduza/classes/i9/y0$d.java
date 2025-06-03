package i9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import u1.b;

public final class y0$d
{
  public final SQLiteDatabase a;
  public final String b;
  public b c;
  
  public y0$d(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    a = paramSQLiteDatabase;
    b = paramString;
  }
  
  public final void a(Object... paramVarArgs)
  {
    c = new b(paramVarArgs, 1);
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
    b localb = c;
    if (localb != null) {
      return a.rawQueryWithFactory(localb, b, null, null);
    }
    return a.rawQuery(b, null);
  }
}

/* Location:
 * Qualified Name:     i9.y0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
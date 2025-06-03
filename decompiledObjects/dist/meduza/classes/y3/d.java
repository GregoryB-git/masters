package y3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class d
  extends SQLiteOpenHelper
  implements b
{
  public d(Context paramContext)
  {
    super(paramContext.getApplicationContext(), "exoplayer_internal.db", null, 1);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase) {}
  
  /* Error */
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 28
    //   3: iconst_2
    //   4: anewarray 30	java/lang/String
    //   7: dup
    //   8: iconst_0
    //   9: ldc 32
    //   11: aastore
    //   12: dup
    //   13: iconst_1
    //   14: ldc 34
    //   16: aastore
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: aconst_null
    //   21: aconst_null
    //   22: invokevirtual 40	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   25: astore 4
    //   27: aload 4
    //   29: invokeinterface 46 1 0
    //   34: ifeq +134 -> 168
    //   37: aload 4
    //   39: iconst_0
    //   40: invokeinterface 50 2 0
    //   45: astore 5
    //   47: aload 4
    //   49: iconst_1
    //   50: invokeinterface 50 2 0
    //   55: astore 6
    //   57: ldc 52
    //   59: aload 6
    //   61: invokevirtual 56	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   64: ifne -37 -> 27
    //   67: new 58	java/lang/StringBuilder
    //   70: astore 7
    //   72: aload 7
    //   74: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   77: aload 7
    //   79: ldc 63
    //   81: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: aload 7
    //   87: aload 5
    //   89: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload 7
    //   95: ldc 69
    //   97: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload 7
    //   103: aload 6
    //   105: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload 7
    //   111: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: astore 6
    //   116: aload_1
    //   117: aload 6
    //   119: invokevirtual 77	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   122: goto -95 -> 27
    //   125: astore 7
    //   127: new 58	java/lang/StringBuilder
    //   130: astore 5
    //   132: aload 5
    //   134: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   137: aload 5
    //   139: ldc 79
    //   141: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload 5
    //   147: aload 6
    //   149: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: ldc 81
    //   155: aload 5
    //   157: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: aload 7
    //   162: invokestatic 87	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   165: goto -138 -> 27
    //   168: aload 4
    //   170: invokeinterface 90 1 0
    //   175: return
    //   176: astore_1
    //   177: aload 4
    //   179: ifnull +21 -> 200
    //   182: aload 4
    //   184: invokeinterface 90 1 0
    //   189: goto +11 -> 200
    //   192: astore 4
    //   194: aload_1
    //   195: aload 4
    //   197: invokevirtual 96	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   200: aload_1
    //   201: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	d
    //   0	202	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	202	2	paramInt1	int
    //   0	202	3	paramInt2	int
    //   25	158	4	localCursor	android.database.Cursor
    //   192	4	4	localThrowable	Throwable
    //   45	111	5	localObject	Object
    //   55	93	6	str	String
    //   70	40	7	localStringBuilder	StringBuilder
    //   125	36	7	localSQLException	android.database.SQLException
    // Exception table:
    //   from	to	target	type
    //   116	122	125	android/database/SQLException
    //   27	116	176	finally
    //   116	122	176	finally
    //   127	165	176	finally
    //   182	189	192	finally
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}

/* Location:
 * Qualified Name:     y3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
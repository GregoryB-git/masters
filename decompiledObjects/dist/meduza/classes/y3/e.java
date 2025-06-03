package y3;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import v3.h0;

public final class e
{
  static
  {
    h0.a("goog.exo.database");
  }
  
  /* Error */
  public static int a(SQLiteDatabase paramSQLiteDatabase, int paramInt, String paramString)
  {
    // Byte code:
    //   0: getstatic 24	v5/e0:a	I
    //   3: istore_3
    //   4: aload_0
    //   5: ldc 26
    //   7: ldc 28
    //   9: iconst_1
    //   10: anewarray 30	java/lang/String
    //   13: dup
    //   14: iconst_0
    //   15: ldc 32
    //   17: aastore
    //   18: invokestatic 38	android/database/DatabaseUtils:queryNumEntries	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J
    //   21: lconst_0
    //   22: lcmp
    //   23: ifle +8 -> 31
    //   26: iconst_1
    //   27: istore_3
    //   28: goto +5 -> 33
    //   31: iconst_0
    //   32: istore_3
    //   33: iload_3
    //   34: ifne +5 -> 39
    //   37: iconst_m1
    //   38: ireturn
    //   39: iload_1
    //   40: invokestatic 44	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   43: astore 4
    //   45: aload_0
    //   46: ldc 32
    //   48: iconst_1
    //   49: anewarray 30	java/lang/String
    //   52: dup
    //   53: iconst_0
    //   54: ldc 46
    //   56: aastore
    //   57: ldc 48
    //   59: iconst_2
    //   60: anewarray 30	java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: aload 4
    //   67: aastore
    //   68: dup
    //   69: iconst_1
    //   70: aload_2
    //   71: aastore
    //   72: aconst_null
    //   73: aconst_null
    //   74: aconst_null
    //   75: invokevirtual 54	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore_2
    //   79: aload_2
    //   80: invokeinterface 60 1 0
    //   85: istore_1
    //   86: iload_1
    //   87: ifne +11 -> 98
    //   90: aload_2
    //   91: invokeinterface 63 1 0
    //   96: iconst_m1
    //   97: ireturn
    //   98: aload_2
    //   99: invokeinterface 67 1 0
    //   104: pop
    //   105: aload_2
    //   106: iconst_0
    //   107: invokeinterface 71 2 0
    //   112: istore_1
    //   113: aload_2
    //   114: invokeinterface 63 1 0
    //   119: iload_1
    //   120: ireturn
    //   121: astore_0
    //   122: aload_2
    //   123: ifnull +18 -> 141
    //   126: aload_2
    //   127: invokeinterface 63 1 0
    //   132: goto +9 -> 141
    //   135: astore_2
    //   136: aload_0
    //   137: aload_2
    //   138: invokevirtual 77	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   141: aload_0
    //   142: athrow
    //   143: astore_0
    //   144: new 79	y3/a
    //   147: dup
    //   148: aload_0
    //   149: invokespecial 83	y3/a:<init>	(Landroid/database/SQLException;)V
    //   152: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	153	1	paramInt	int
    //   0	153	2	paramString	String
    //   3	31	3	i	int
    //   43	23	4	str	String
    // Exception table:
    //   from	to	target	type
    //   79	86	121	finally
    //   98	113	121	finally
    //   126	132	135	finally
    //   0	26	143	android/database/SQLException
    //   39	79	143	android/database/SQLException
    //   90	96	143	android/database/SQLException
    //   113	119	143	android/database/SQLException
    //   136	141	143	android/database/SQLException
    //   141	143	143	android/database/SQLException
  }
  
  public static void b(SQLiteDatabase paramSQLiteDatabase, int paramInt, String paramString)
  {
    try
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
      ContentValues localContentValues = new android/content/ContentValues;
      localContentValues.<init>();
      localContentValues.put("feature", Integer.valueOf(paramInt));
      localContentValues.put("instance_uid", paramString);
      localContentValues.put("version", Integer.valueOf(1));
      paramSQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, localContentValues);
      return;
    }
    catch (SQLException paramSQLiteDatabase)
    {
      throw new a(paramSQLiteDatabase);
    }
  }
}

/* Location:
 * Qualified Name:     y3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package u5;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import y3.a;
import y3.b;
import y3.c;

public final class f
{
  public static final String[] c = { "name", "length", "last_touch_timestamp" };
  public final b a;
  public String b;
  
  public f(c paramc)
  {
    a = paramc;
  }
  
  /* Error */
  public final java.util.HashMap a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	u5/f:b	Ljava/lang/String;
    //   4: invokevirtual 38	java/lang/Object:getClass	()Ljava/lang/Class;
    //   7: pop
    //   8: aload_0
    //   9: getfield 29	u5/f:a	Ly3/b;
    //   12: invokeinterface 44 1 0
    //   17: aload_0
    //   18: getfield 34	u5/f:b	Ljava/lang/String;
    //   21: getstatic 22	u5/f:c	[Ljava/lang/String;
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: invokevirtual 50	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore_1
    //   33: new 52	java/util/HashMap
    //   36: astore_2
    //   37: aload_2
    //   38: aload_1
    //   39: invokeinterface 58 1 0
    //   44: invokespecial 61	java/util/HashMap:<init>	(I)V
    //   47: aload_1
    //   48: invokeinterface 65 1 0
    //   53: ifeq +59 -> 112
    //   56: aload_1
    //   57: iconst_0
    //   58: invokeinterface 69 2 0
    //   63: astore_3
    //   64: aload_3
    //   65: invokevirtual 38	java/lang/Object:getClass	()Ljava/lang/Class;
    //   68: pop
    //   69: aload_1
    //   70: iconst_1
    //   71: invokeinterface 73 2 0
    //   76: lstore 4
    //   78: aload_1
    //   79: iconst_2
    //   80: invokeinterface 73 2 0
    //   85: lstore 6
    //   87: new 75	u5/e
    //   90: astore 8
    //   92: aload 8
    //   94: lload 4
    //   96: lload 6
    //   98: invokespecial 78	u5/e:<init>	(JJ)V
    //   101: aload_2
    //   102: aload_3
    //   103: aload 8
    //   105: invokevirtual 82	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: goto -62 -> 47
    //   112: aload_1
    //   113: invokeinterface 85 1 0
    //   118: aload_2
    //   119: areturn
    //   120: astore 8
    //   122: aload_1
    //   123: ifnull +19 -> 142
    //   126: aload_1
    //   127: invokeinterface 85 1 0
    //   132: goto +10 -> 142
    //   135: astore_1
    //   136: aload 8
    //   138: aload_1
    //   139: invokevirtual 91	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   142: aload 8
    //   144: athrow
    //   145: astore_1
    //   146: new 93	y3/a
    //   149: dup
    //   150: aload_1
    //   151: invokespecial 96	y3/a:<init>	(Landroid/database/SQLException;)V
    //   154: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	155	0	this	f
    //   32	95	1	localCursor	android.database.Cursor
    //   135	4	1	localThrowable	Throwable
    //   145	6	1	localSQLException	SQLException
    //   36	83	2	localHashMap	java.util.HashMap
    //   63	40	3	str	String
    //   76	19	4	l1	long
    //   85	12	6	l2	long
    //   90	14	8	locale	e
    //   120	23	8	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   33	47	120	finally
    //   47	109	120	finally
    //   126	132	135	finally
    //   0	33	145	android/database/SQLException
    //   112	118	145	android/database/SQLException
    //   136	142	145	android/database/SQLException
    //   142	145	145	android/database/SQLException
  }
  
  /* Error */
  public final void b(long paramLong)
  {
    // Byte code:
    //   0: lload_1
    //   1: invokestatic 103	java/lang/Long:toHexString	(J)Ljava/lang/String;
    //   4: astore_3
    //   5: new 105	java/lang/StringBuilder
    //   8: astore 4
    //   10: aload 4
    //   12: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   15: aload 4
    //   17: ldc 108
    //   19: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: pop
    //   23: aload 4
    //   25: aload_3
    //   26: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload_0
    //   31: aload 4
    //   33: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: putfield 34	u5/f:b	Ljava/lang/String;
    //   39: aload_0
    //   40: getfield 29	u5/f:a	Ly3/b;
    //   43: invokeinterface 44 1 0
    //   48: iconst_2
    //   49: aload_3
    //   50: invokestatic 121	y3/e:a	(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I
    //   53: iconst_1
    //   54: if_icmpeq +131 -> 185
    //   57: aload_0
    //   58: getfield 29	u5/f:a	Ly3/b;
    //   61: invokeinterface 124 1 0
    //   66: astore 4
    //   68: aload 4
    //   70: invokevirtual 127	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
    //   73: aload 4
    //   75: iconst_2
    //   76: aload_3
    //   77: invokestatic 130	y3/e:b	(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)V
    //   80: aload_0
    //   81: getfield 34	u5/f:b	Ljava/lang/String;
    //   84: astore 5
    //   86: new 105	java/lang/StringBuilder
    //   89: astore_3
    //   90: aload_3
    //   91: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   94: aload_3
    //   95: ldc -124
    //   97: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload_3
    //   102: aload 5
    //   104: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload 4
    //   110: aload_3
    //   111: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokevirtual 136	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   117: new 105	java/lang/StringBuilder
    //   120: astore_3
    //   121: aload_3
    //   122: invokespecial 106	java/lang/StringBuilder:<init>	()V
    //   125: aload_3
    //   126: ldc -118
    //   128: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload_3
    //   133: aload_0
    //   134: getfield 34	u5/f:b	Ljava/lang/String;
    //   137: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_3
    //   142: ldc -116
    //   144: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload_3
    //   149: ldc -114
    //   151: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload 4
    //   157: aload_3
    //   158: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: invokevirtual 136	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   164: aload 4
    //   166: invokevirtual 145	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   169: aload 4
    //   171: invokevirtual 148	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   174: goto +11 -> 185
    //   177: astore_3
    //   178: aload 4
    //   180: invokevirtual 148	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   183: aload_3
    //   184: athrow
    //   185: return
    //   186: astore 4
    //   188: new 93	y3/a
    //   191: dup
    //   192: aload 4
    //   194: invokespecial 96	y3/a:<init>	(Landroid/database/SQLException;)V
    //   197: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	this	f
    //   0	198	1	paramLong	long
    //   4	154	3	localObject1	Object
    //   177	7	3	localObject2	Object
    //   8	171	4	localObject3	Object
    //   186	7	4	localSQLException	SQLException
    //   84	19	5	str	String
    // Exception table:
    //   from	to	target	type
    //   73	169	177	finally
    //   0	73	186	android/database/SQLException
    //   169	174	186	android/database/SQLException
    //   178	185	186	android/database/SQLException
  }
  
  /* Error */
  public final void c(java.util.Set<String> paramSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	u5/f:b	Ljava/lang/String;
    //   4: invokevirtual 38	java/lang/Object:getClass	()Ljava/lang/Class;
    //   7: pop
    //   8: aload_0
    //   9: getfield 29	u5/f:a	Ly3/b;
    //   12: invokeinterface 124 1 0
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual 127	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
    //   22: aload_1
    //   23: invokeinterface 155 1 0
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 160 1 0
    //   35: ifeq +35 -> 70
    //   38: aload_1
    //   39: invokeinterface 164 1 0
    //   44: checkcast 14	java/lang/String
    //   47: astore_3
    //   48: aload_2
    //   49: aload_0
    //   50: getfield 34	u5/f:b	Ljava/lang/String;
    //   53: ldc -90
    //   55: iconst_1
    //   56: anewarray 14	java/lang/String
    //   59: dup
    //   60: iconst_0
    //   61: aload_3
    //   62: aastore
    //   63: invokevirtual 170	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   66: pop
    //   67: goto -38 -> 29
    //   70: aload_2
    //   71: invokevirtual 145	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   74: aload_2
    //   75: invokevirtual 148	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   78: return
    //   79: astore_1
    //   80: aload_2
    //   81: invokevirtual 148	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   84: aload_1
    //   85: athrow
    //   86: astore_1
    //   87: new 93	y3/a
    //   90: dup
    //   91: aload_1
    //   92: invokespecial 96	y3/a:<init>	(Landroid/database/SQLException;)V
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	f
    //   0	96	1	paramSet	java.util.Set<String>
    //   17	64	2	localSQLiteDatabase	SQLiteDatabase
    //   47	15	3	str	String
    // Exception table:
    //   from	to	target	type
    //   22	29	79	finally
    //   29	67	79	finally
    //   70	74	79	finally
    //   8	22	86	android/database/SQLException
    //   74	78	86	android/database/SQLException
    //   80	86	86	android/database/SQLException
  }
  
  public final void d(long paramLong1, long paramLong2, String paramString)
  {
    b.getClass();
    try
    {
      SQLiteDatabase localSQLiteDatabase = a.getWritableDatabase();
      ContentValues localContentValues = new android/content/ContentValues;
      localContentValues.<init>();
      localContentValues.put("name", paramString);
      localContentValues.put("length", Long.valueOf(paramLong1));
      localContentValues.put("last_touch_timestamp", Long.valueOf(paramLong2));
      localSQLiteDatabase.replaceOrThrow(b, null, localContentValues);
      return;
    }
    catch (SQLException paramString)
    {
      throw new a(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     u5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
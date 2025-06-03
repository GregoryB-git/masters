package u5;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import g;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import y3.a;
import y3.b;
import y3.c;
import y3.e;

public final class j$a
  implements j.c
{
  public static final String[] e = { "id", "key", "metadata" };
  public final b a;
  public final SparseArray<i> b;
  public String c;
  public String d;
  
  public j$a(c paramc)
  {
    a = paramc;
    b = new SparseArray();
  }
  
  /* Error */
  public final void a(java.util.HashMap<String, i> paramHashMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	u5/j$a:a	Ly3/b;
    //   4: invokeinterface 51 1 0
    //   9: astore_2
    //   10: aload_2
    //   11: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
    //   14: aload_0
    //   15: aload_2
    //   16: invokevirtual 60	u5/j$a:j	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   19: aload_1
    //   20: invokevirtual 66	java/util/HashMap:values	()Ljava/util/Collection;
    //   23: invokeinterface 72 1 0
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 78 1 0
    //   35: ifeq +20 -> 55
    //   38: aload_0
    //   39: aload_2
    //   40: aload_1
    //   41: invokeinterface 82 1 0
    //   46: checkcast 84	u5/i
    //   49: invokevirtual 88	u5/j$a:i	(Landroid/database/sqlite/SQLiteDatabase;Lu5/i;)V
    //   52: goto -23 -> 29
    //   55: aload_2
    //   56: invokevirtual 91	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   59: aload_0
    //   60: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
    //   63: invokevirtual 94	android/util/SparseArray:clear	()V
    //   66: aload_2
    //   67: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   70: return
    //   71: astore_1
    //   72: aload_2
    //   73: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   76: aload_1
    //   77: athrow
    //   78: astore_1
    //   79: new 99	y3/a
    //   82: dup
    //   83: aload_1
    //   84: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	a
    //   0	88	1	paramHashMap	java.util.HashMap<String, i>
    //   9	64	2	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   14	29	71	finally
    //   29	52	71	finally
    //   55	66	71	finally
    //   0	14	78	android/database/SQLException
    //   66	70	78	android/database/SQLException
    //   72	78	78	android/database/SQLException
  }
  
  public final void b(i parami, boolean paramBoolean)
  {
    if (paramBoolean) {
      b.delete(a);
    } else {
      b.put(a, null);
    }
  }
  
  public final boolean c()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = a.getReadableDatabase();
      String str = c;
      str.getClass();
      boolean bool = true;
      int i = e.a(localSQLiteDatabase, 1, str);
      if (i == -1) {
        bool = false;
      }
      return bool;
    }
    catch (SQLException localSQLException)
    {
      throw new a(localSQLException);
    }
  }
  
  /* Error */
  public final void d(java.util.HashMap<String, i> paramHashMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
    //   4: invokevirtual 134	android/util/SparseArray:size	()I
    //   7: ifne +4 -> 11
    //   10: return
    //   11: aload_0
    //   12: getfield 37	u5/j$a:a	Ly3/b;
    //   15: invokeinterface 51 1 0
    //   20: astore_1
    //   21: aload_1
    //   22: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
    //   25: iconst_0
    //   26: istore_2
    //   27: iload_2
    //   28: aload_0
    //   29: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
    //   32: invokevirtual 134	android/util/SparseArray:size	()I
    //   35: if_icmpge +74 -> 109
    //   38: aload_0
    //   39: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
    //   42: iload_2
    //   43: invokevirtual 138	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
    //   46: checkcast 84	u5/i
    //   49: astore_3
    //   50: aload_3
    //   51: ifnonnull +46 -> 97
    //   54: aload_0
    //   55: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
    //   58: iload_2
    //   59: invokevirtual 142	android/util/SparseArray:keyAt	(I)I
    //   62: istore 4
    //   64: aload_0
    //   65: getfield 144	u5/j$a:d	Ljava/lang/String;
    //   68: astore_3
    //   69: aload_3
    //   70: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
    //   73: pop
    //   74: aload_1
    //   75: aload_3
    //   76: ldc -110
    //   78: iconst_1
    //   79: anewarray 22	java/lang/String
    //   82: dup
    //   83: iconst_0
    //   84: iload 4
    //   86: invokestatic 152	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   89: aastore
    //   90: invokevirtual 155	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   93: pop
    //   94: goto +9 -> 103
    //   97: aload_0
    //   98: aload_1
    //   99: aload_3
    //   100: invokevirtual 88	u5/j$a:i	(Landroid/database/sqlite/SQLiteDatabase;Lu5/i;)V
    //   103: iinc 2 1
    //   106: goto -79 -> 27
    //   109: aload_1
    //   110: invokevirtual 91	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   113: aload_0
    //   114: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
    //   117: invokevirtual 94	android/util/SparseArray:clear	()V
    //   120: aload_1
    //   121: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   124: return
    //   125: astore_3
    //   126: aload_1
    //   127: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   130: aload_3
    //   131: athrow
    //   132: astore_1
    //   133: new 99	y3/a
    //   136: dup
    //   137: aload_1
    //   138: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	a
    //   0	142	1	paramHashMap	java.util.HashMap<String, i>
    //   26	78	2	i	int
    //   49	51	3	localObject1	Object
    //   125	6	3	localObject2	Object
    //   62	23	4	j	int
    // Exception table:
    //   from	to	target	type
    //   27	50	125	finally
    //   54	94	125	finally
    //   97	103	125	finally
    //   109	120	125	finally
    //   11	25	132	android/database/SQLException
    //   120	124	132	android/database/SQLException
    //   126	132	132	android/database/SQLException
  }
  
  public final void e(long paramLong)
  {
    String str = Long.toHexString(paramLong);
    c = str;
    d = g.d("ExoPlayerCacheIndex", str);
  }
  
  public final void f(i parami)
  {
    b.put(a, parami);
  }
  
  /* Error */
  public final void g(java.util.HashMap<String, i> paramHashMap, SparseArray<String> paramSparseArray)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
    //   4: invokevirtual 134	android/util/SparseArray:size	()I
    //   7: ifne +8 -> 15
    //   10: iconst_1
    //   11: istore_3
    //   12: goto +5 -> 17
    //   15: iconst_0
    //   16: istore_3
    //   17: iload_3
    //   18: invokestatic 180	x6/b:H	(Z)V
    //   21: aload_0
    //   22: getfield 37	u5/j$a:a	Ly3/b;
    //   25: invokeinterface 119 1 0
    //   30: astore 4
    //   32: aload_0
    //   33: getfield 121	u5/j$a:c	Ljava/lang/String;
    //   36: astore 5
    //   38: aload 5
    //   40: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
    //   43: pop
    //   44: aload 4
    //   46: iconst_1
    //   47: aload 5
    //   49: invokestatic 130	y3/e:a	(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I
    //   52: iconst_1
    //   53: if_icmpeq +48 -> 101
    //   56: aload_0
    //   57: getfield 37	u5/j$a:a	Ly3/b;
    //   60: invokeinterface 51 1 0
    //   65: astore 5
    //   67: aload 5
    //   69: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
    //   72: aload_0
    //   73: aload 5
    //   75: invokevirtual 60	u5/j$a:j	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   78: aload 5
    //   80: invokevirtual 91	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   83: aload 5
    //   85: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   88: goto +13 -> 101
    //   91: astore 4
    //   93: aload 5
    //   95: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   98: aload 4
    //   100: athrow
    //   101: aload_0
    //   102: getfield 37	u5/j$a:a	Ly3/b;
    //   105: invokeinterface 119 1 0
    //   110: astore 5
    //   112: aload_0
    //   113: getfield 144	u5/j$a:d	Ljava/lang/String;
    //   116: astore 4
    //   118: aload 4
    //   120: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
    //   123: pop
    //   124: aload 5
    //   126: aload 4
    //   128: getstatic 30	u5/j$a:e	[Ljava/lang/String;
    //   131: aconst_null
    //   132: aconst_null
    //   133: aconst_null
    //   134: aconst_null
    //   135: aconst_null
    //   136: invokevirtual 184	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   139: astore 5
    //   141: aload 5
    //   143: invokeinterface 189 1 0
    //   148: ifeq +106 -> 254
    //   151: aload 5
    //   153: iconst_0
    //   154: invokeinterface 192 2 0
    //   159: istore 6
    //   161: aload 5
    //   163: iconst_1
    //   164: invokeinterface 195 2 0
    //   169: astore 4
    //   171: aload 4
    //   173: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
    //   176: pop
    //   177: aload 5
    //   179: iconst_2
    //   180: invokeinterface 199 2 0
    //   185: astore 7
    //   187: new 201	java/io/ByteArrayInputStream
    //   190: astore 8
    //   192: aload 8
    //   194: aload 7
    //   196: invokespecial 204	java/io/ByteArrayInputStream:<init>	([B)V
    //   199: new 206	java/io/DataInputStream
    //   202: astore 7
    //   204: aload 7
    //   206: aload 8
    //   208: invokespecial 209	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   211: aload 7
    //   213: invokestatic 212	u5/j:a	(Ljava/io/DataInputStream;)Lu5/m;
    //   216: astore 7
    //   218: new 84	u5/i
    //   221: astore 8
    //   223: aload 8
    //   225: iload 6
    //   227: aload 4
    //   229: aload 7
    //   231: invokespecial 215	u5/i:<init>	(ILjava/lang/String;Lu5/m;)V
    //   234: aload_1
    //   235: aload 4
    //   237: aload 8
    //   239: invokevirtual 218	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   242: pop
    //   243: aload_2
    //   244: iload 6
    //   246: aload 4
    //   248: invokevirtual 116	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   251: goto -110 -> 141
    //   254: aload 5
    //   256: invokeinterface 221 1 0
    //   261: return
    //   262: astore 4
    //   264: aload 5
    //   266: ifnull +22 -> 288
    //   269: aload 5
    //   271: invokeinterface 221 1 0
    //   276: goto +12 -> 288
    //   279: astore 5
    //   281: aload 4
    //   283: aload 5
    //   285: invokevirtual 227	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   288: aload 4
    //   290: athrow
    //   291: astore 5
    //   293: aload_1
    //   294: invokevirtual 228	java/util/HashMap:clear	()V
    //   297: aload_2
    //   298: invokevirtual 94	android/util/SparseArray:clear	()V
    //   301: new 99	y3/a
    //   304: dup
    //   305: aload 5
    //   307: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
    //   310: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	311	0	this	a
    //   0	311	1	paramHashMap	java.util.HashMap<String, i>
    //   0	311	2	paramSparseArray	SparseArray<String>
    //   11	7	3	bool	boolean
    //   30	15	4	localSQLiteDatabase	SQLiteDatabase
    //   91	8	4	localObject1	Object
    //   116	131	4	str	String
    //   262	27	4	localObject2	Object
    //   36	234	5	localObject3	Object
    //   279	5	5	localThrowable	Throwable
    //   291	15	5	localSQLiteException	android.database.sqlite.SQLiteException
    //   159	86	6	i	int
    //   185	45	7	localObject4	Object
    //   190	48	8	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   72	83	91	finally
    //   141	251	262	finally
    //   269	276	279	finally
    //   21	72	291	android/database/sqlite/SQLiteException
    //   83	88	291	android/database/sqlite/SQLiteException
    //   93	101	291	android/database/sqlite/SQLiteException
    //   101	141	291	android/database/sqlite/SQLiteException
    //   254	261	291	android/database/sqlite/SQLiteException
    //   281	288	291	android/database/sqlite/SQLiteException
    //   288	291	291	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  public final void h()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	u5/j$a:a	Ly3/b;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 121	u5/j$a:c	Ljava/lang/String;
    //   9: astore_2
    //   10: aload_2
    //   11: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
    //   14: pop
    //   15: new 232	java/lang/StringBuilder
    //   18: astore_3
    //   19: aload_3
    //   20: invokespecial 233	java/lang/StringBuilder:<init>	()V
    //   23: aload_3
    //   24: ldc -92
    //   26: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload_3
    //   31: aload_2
    //   32: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_3
    //   37: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: astore_3
    //   41: aload_1
    //   42: invokeinterface 51 1 0
    //   47: astore_1
    //   48: aload_1
    //   49: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
    //   52: getstatic 241	y3/e:a	I
    //   55: istore 4
    //   57: getstatic 244	v5/e0:a	I
    //   60: istore 4
    //   62: aload_1
    //   63: ldc -10
    //   65: ldc -8
    //   67: iconst_1
    //   68: anewarray 22	java/lang/String
    //   71: dup
    //   72: iconst_0
    //   73: ldc -6
    //   75: aastore
    //   76: invokestatic 256	android/database/DatabaseUtils:queryNumEntries	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J
    //   79: lconst_0
    //   80: lcmp
    //   81: ifle +9 -> 90
    //   84: iconst_1
    //   85: istore 4
    //   87: goto +6 -> 93
    //   90: iconst_0
    //   91: istore 4
    //   93: iload 4
    //   95: ifne +6 -> 101
    //   98: goto +28 -> 126
    //   101: aload_1
    //   102: ldc -6
    //   104: ldc_w 258
    //   107: iconst_2
    //   108: anewarray 22	java/lang/String
    //   111: dup
    //   112: iconst_0
    //   113: iconst_1
    //   114: invokestatic 152	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   117: aastore
    //   118: dup
    //   119: iconst_1
    //   120: aload_2
    //   121: aastore
    //   122: invokevirtual 155	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   125: pop
    //   126: new 232	java/lang/StringBuilder
    //   129: astore_2
    //   130: aload_2
    //   131: invokespecial 233	java/lang/StringBuilder:<init>	()V
    //   134: aload_2
    //   135: ldc_w 260
    //   138: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload_2
    //   143: aload_3
    //   144: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload_1
    //   149: aload_2
    //   150: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokevirtual 264	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   156: aload_1
    //   157: invokevirtual 91	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   160: aload_1
    //   161: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   164: return
    //   165: astore_2
    //   166: goto +15 -> 181
    //   169: astore_3
    //   170: new 99	y3/a
    //   173: astore_2
    //   174: aload_2
    //   175: aload_3
    //   176: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
    //   179: aload_2
    //   180: athrow
    //   181: aload_1
    //   182: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   185: aload_2
    //   186: athrow
    //   187: astore_1
    //   188: new 99	y3/a
    //   191: dup
    //   192: aload_1
    //   193: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
    //   196: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	a
    //   4	178	1	localObject1	Object
    //   187	6	1	localSQLException1	SQLException
    //   9	141	2	localObject2	Object
    //   165	1	2	localObject3	Object
    //   173	13	2	locala	a
    //   18	126	3	localObject4	Object
    //   169	7	3	localSQLException2	SQLException
    //   55	39	4	i	int
    // Exception table:
    //   from	to	target	type
    //   52	57	165	finally
    //   57	84	165	finally
    //   101	126	165	finally
    //   126	160	165	finally
    //   170	181	165	finally
    //   57	84	169	android/database/SQLException
    //   101	126	169	android/database/SQLException
    //   15	52	187	android/database/SQLException
    //   160	164	187	android/database/SQLException
    //   181	187	187	android/database/SQLException
  }
  
  public final void i(SQLiteDatabase paramSQLiteDatabase, i parami)
  {
    Object localObject = new ByteArrayOutputStream();
    j.b(e, new DataOutputStream((OutputStream)localObject));
    byte[] arrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
    localObject = new ContentValues();
    ((ContentValues)localObject).put("id", Integer.valueOf(a));
    ((ContentValues)localObject).put("key", b);
    ((ContentValues)localObject).put("metadata", arrayOfByte);
    parami = d;
    parami.getClass();
    paramSQLiteDatabase.replaceOrThrow(parami, null, (ContentValues)localObject);
  }
  
  public final void j(SQLiteDatabase paramSQLiteDatabase)
  {
    Object localObject = c;
    localObject.getClass();
    e.b(paramSQLiteDatabase, 1, (String)localObject);
    String str = d;
    str.getClass();
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("DROP TABLE IF EXISTS ");
    ((StringBuilder)localObject).append(str);
    paramSQLiteDatabase.execSQL(((StringBuilder)localObject).toString());
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("CREATE TABLE ");
    ((StringBuilder)localObject).append(d);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    paramSQLiteDatabase.execSQL(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     u5.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package e7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

public final class s
{
  public static HashSet a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new HashSet();
    StringBuilder localStringBuilder = new StringBuilder("SELECT * FROM ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" LIMIT 0");
    paramSQLiteDatabase = paramSQLiteDatabase.rawQuery(localStringBuilder.toString(), null);
    try
    {
      Collections.addAll(localHashSet, paramSQLiteDatabase.getColumnNames());
      return localHashSet;
    }
    finally
    {
      paramSQLiteDatabase.close();
    }
  }
  
  public static void b(a1 parama1, SQLiteDatabase paramSQLiteDatabase)
  {
    if (parama1 != null)
    {
      paramSQLiteDatabase = new File(zzcf.zza().zza(paramSQLiteDatabase.getPath()));
      if (!paramSQLiteDatabase.setReadable(false, false)) {
        r.b("Failed to turn off database read permission");
      }
      if (!paramSQLiteDatabase.setWritable(false, false)) {
        r.b("Failed to turn off database write permission");
      }
      if (!paramSQLiteDatabase.setReadable(true, true)) {
        r.b("Failed to turn on database read permission for owner");
      }
      if (!paramSQLiteDatabase.setWritable(true, true)) {
        r.b("Failed to turn on database write permission for owner");
      }
      return;
    }
    throw new IllegalArgumentException("Monitor must not be null");
  }
  
  /* Error */
  public static void c(a1 parama1, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +317 -> 318
    //   4: aconst_null
    //   5: astore 6
    //   7: aconst_null
    //   8: astore 7
    //   10: iconst_0
    //   11: istore 8
    //   13: aload_1
    //   14: ldc 106
    //   16: iconst_1
    //   17: anewarray 108	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: ldc 110
    //   24: aastore
    //   25: ldc 112
    //   27: iconst_1
    //   28: anewarray 108	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: aload_2
    //   34: aastore
    //   35: aconst_null
    //   36: aconst_null
    //   37: aconst_null
    //   38: invokevirtual 116	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   41: astore 9
    //   43: aload 9
    //   45: astore 7
    //   47: aload 9
    //   49: astore 6
    //   51: aload 9
    //   53: invokeinterface 120 1 0
    //   58: istore 10
    //   60: aload 9
    //   62: invokeinterface 50 1 0
    //   67: goto +40 -> 107
    //   70: astore_0
    //   71: goto +233 -> 304
    //   74: astore 9
    //   76: aload 6
    //   78: astore 7
    //   80: aload_0
    //   81: getfield 80	e7/a1:r	Le7/b1;
    //   84: ldc 122
    //   86: aload_2
    //   87: aload 9
    //   89: invokevirtual 126	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   92: aload 6
    //   94: ifnull +10 -> 104
    //   97: aload 6
    //   99: invokeinterface 50 1 0
    //   104: iconst_0
    //   105: istore 10
    //   107: iload 10
    //   109: ifne +8 -> 117
    //   112: aload_1
    //   113: aload_3
    //   114: invokevirtual 129	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   117: aload_1
    //   118: aload_2
    //   119: invokestatic 131	e7/s:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/util/HashSet;
    //   122: astore 7
    //   124: aload 4
    //   126: ldc -123
    //   128: invokevirtual 137	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   131: astore 4
    //   133: aload 4
    //   135: arraylength
    //   136: istore 11
    //   138: iconst_0
    //   139: istore 12
    //   141: iload 12
    //   143: iload 11
    //   145: if_icmpge +73 -> 218
    //   148: aload 4
    //   150: iload 12
    //   152: aaload
    //   153: astore_3
    //   154: aload 7
    //   156: aload_3
    //   157: invokevirtual 141	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   160: ifeq +9 -> 169
    //   163: iinc 12 1
    //   166: goto -25 -> 141
    //   169: new 104	android/database/sqlite/SQLiteException
    //   172: astore_1
    //   173: new 14	java/lang/StringBuilder
    //   176: astore 4
    //   178: aload 4
    //   180: ldc -113
    //   182: invokespecial 19	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   185: aload 4
    //   187: aload_2
    //   188: invokevirtual 23	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload 4
    //   194: ldc -111
    //   196: invokevirtual 23	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: aload 4
    //   202: aload_3
    //   203: invokevirtual 23	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload_1
    //   208: aload 4
    //   210: invokevirtual 29	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: invokespecial 146	android/database/sqlite/SQLiteException:<init>	(Ljava/lang/String;)V
    //   216: aload_1
    //   217: athrow
    //   218: aload 5
    //   220: ifnull +45 -> 265
    //   223: iload 8
    //   225: istore 12
    //   227: iload 12
    //   229: aload 5
    //   231: arraylength
    //   232: if_icmpge +33 -> 265
    //   235: aload 7
    //   237: aload 5
    //   239: iload 12
    //   241: aaload
    //   242: invokevirtual 141	java/util/HashSet:remove	(Ljava/lang/Object;)Z
    //   245: ifne +14 -> 259
    //   248: aload_1
    //   249: aload 5
    //   251: iload 12
    //   253: iconst_1
    //   254: iadd
    //   255: aaload
    //   256: invokevirtual 129	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   259: iinc 12 2
    //   262: goto -35 -> 227
    //   265: aload 7
    //   267: invokevirtual 149	java/util/HashSet:isEmpty	()Z
    //   270: ifne +20 -> 290
    //   273: aload_0
    //   274: getfield 80	e7/a1:r	Le7/b1;
    //   277: ldc -105
    //   279: aload_2
    //   280: ldc -103
    //   282: aload 7
    //   284: invokestatic 159	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   287: invokevirtual 126	e7/b1:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   290: return
    //   291: astore_1
    //   292: aload_0
    //   293: getfield 162	e7/a1:o	Le7/b1;
    //   296: ldc -92
    //   298: aload_2
    //   299: invokevirtual 167	e7/b1:c	(Ljava/lang/String;Ljava/lang/Object;)V
    //   302: aload_1
    //   303: athrow
    //   304: aload 7
    //   306: ifnull +10 -> 316
    //   309: aload 7
    //   311: invokeinterface 50 1 0
    //   316: aload_0
    //   317: athrow
    //   318: new 97	java/lang/IllegalArgumentException
    //   321: dup
    //   322: ldc 99
    //   324: invokespecial 100	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   327: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	328	0	parama1	a1
    //   0	328	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	328	2	paramString1	String
    //   0	328	3	paramString2	String
    //   0	328	4	paramString3	String
    //   0	328	5	paramArrayOfString	String[]
    //   5	93	6	localObject1	Object
    //   8	302	7	localObject2	Object
    //   11	213	8	i	int
    //   41	20	9	localCursor	Cursor
    //   74	14	9	localSQLiteException	android.database.sqlite.SQLiteException
    //   58	50	10	bool	boolean
    //   136	10	11	j	int
    //   139	121	12	k	int
    // Exception table:
    //   from	to	target	type
    //   13	43	70	finally
    //   51	60	70	finally
    //   80	92	70	finally
    //   13	43	74	android/database/sqlite/SQLiteException
    //   51	60	74	android/database/sqlite/SQLiteException
    //   117	138	291	android/database/sqlite/SQLiteException
    //   154	163	291	android/database/sqlite/SQLiteException
    //   169	218	291	android/database/sqlite/SQLiteException
    //   227	259	291	android/database/sqlite/SQLiteException
    //   265	290	291	android/database/sqlite/SQLiteException
  }
}

/* Location:
 * Qualified Name:     e7.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
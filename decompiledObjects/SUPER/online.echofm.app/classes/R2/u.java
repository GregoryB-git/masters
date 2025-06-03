package R2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class u
{
  public static Set a(SQLiteDatabase paramSQLiteDatabase, String paramString)
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
  
  public static void b(Y1 paramY1, SQLiteDatabase paramSQLiteDatabase)
  {
    if (paramY1 != null)
    {
      paramSQLiteDatabase = new File(paramSQLiteDatabase.getPath());
      if (!paramSQLiteDatabase.setReadable(false, false)) {
        paramY1.L().a("Failed to turn off database read permission");
      }
      if (!paramSQLiteDatabase.setWritable(false, false)) {
        paramY1.L().a("Failed to turn off database write permission");
      }
      if (!paramSQLiteDatabase.setReadable(true, true)) {
        paramY1.L().a("Failed to turn on database read permission for owner");
      }
      if (!paramSQLiteDatabase.setWritable(true, true)) {
        paramY1.L().a("Failed to turn on database write permission for owner");
      }
      return;
    }
    throw new IllegalArgumentException("Monitor must not be null");
  }
  
  public static void c(Y1 paramY1, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString)
  {
    if (paramY1 != null)
    {
      if (!d(paramY1, paramSQLiteDatabase, paramString1)) {
        paramSQLiteDatabase.execSQL(paramString2);
      }
      try
      {
        localSet = a(paramSQLiteDatabase, paramString1);
        paramString3 = paramString3.split(",");
        int i = paramString3.length;
        j = 0;
        k = 0;
        while (k < i)
        {
          paramString2 = paramString3[k];
          if (localSet.remove(paramString2))
          {
            k++;
          }
          else
          {
            paramString3 = new android/database/sqlite/SQLiteException;
            paramSQLiteDatabase = new java/lang/StringBuilder;
            paramSQLiteDatabase.<init>("Table ");
            paramSQLiteDatabase.append(paramString1);
            paramSQLiteDatabase.append(" is missing required column: ");
            paramSQLiteDatabase.append(paramString2);
            paramString3.<init>(paramSQLiteDatabase.toString());
            throw paramString3;
          }
        }
      }
      catch (SQLiteException paramSQLiteDatabase)
      {
        Set localSet;
        int j;
        int k;
        break label202;
        if (paramArrayOfString != null) {
          for (k = j; k < paramArrayOfString.length; k += 2) {
            if (!localSet.remove(paramArrayOfString[k])) {
              paramSQLiteDatabase.execSQL(paramArrayOfString[(k + 1)]);
            }
          }
        }
        if (!localSet.isEmpty()) {
          paramY1.L().c("Table has extra columns. table, columns", paramString1, TextUtils.join(", ", localSet));
        }
        return;
        label202:
        paramY1.G().b("Failed to verify columns on table that was just created", paramString1);
        throw paramSQLiteDatabase;
      }
    }
    throw new IllegalArgumentException("Monitor must not be null");
  }
  
  /* Error */
  public static boolean d(Y1 paramY1, SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +104 -> 105
    //   4: aconst_null
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload_1
    //   10: ldc -108
    //   12: iconst_1
    //   13: anewarray 106	java/lang/String
    //   16: dup
    //   17: iconst_0
    //   18: ldc -106
    //   20: aastore
    //   21: ldc -104
    //   23: iconst_1
    //   24: anewarray 106	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: aload_2
    //   30: aastore
    //   31: aconst_null
    //   32: aconst_null
    //   33: aconst_null
    //   34: invokevirtual 156	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore_1
    //   38: aload_1
    //   39: astore 4
    //   41: aload_1
    //   42: astore_3
    //   43: aload_1
    //   44: invokeinterface 159 1 0
    //   49: istore 5
    //   51: aload_1
    //   52: invokeinterface 50 1 0
    //   57: iload 5
    //   59: ireturn
    //   60: astore_0
    //   61: goto +30 -> 91
    //   64: astore_1
    //   65: aload_3
    //   66: astore 4
    //   68: aload_0
    //   69: invokevirtual 69	R2/Y1:L	()LR2/a2;
    //   72: ldc -95
    //   74: aload_2
    //   75: aload_1
    //   76: invokevirtual 138	R2/a2:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   79: aload_3
    //   80: ifnull +9 -> 89
    //   83: aload_3
    //   84: invokeinterface 50 1 0
    //   89: iconst_0
    //   90: ireturn
    //   91: aload 4
    //   93: ifnull +10 -> 103
    //   96: aload 4
    //   98: invokeinterface 50 1 0
    //   103: aload_0
    //   104: athrow
    //   105: new 86	java/lang/IllegalArgumentException
    //   108: dup
    //   109: ldc 88
    //   111: invokespecial 89	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   114: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	paramY1	Y1
    //   0	115	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	115	2	paramString	String
    //   5	79	3	localSQLiteDatabase1	SQLiteDatabase
    //   7	90	4	localSQLiteDatabase2	SQLiteDatabase
    //   49	9	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	38	60	finally
    //   43	51	60	finally
    //   68	79	60	finally
    //   9	38	64	android/database/sqlite/SQLiteException
    //   43	51	64	android/database/sqlite/SQLiteException
  }
}

/* Location:
 * Qualified Name:     R2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
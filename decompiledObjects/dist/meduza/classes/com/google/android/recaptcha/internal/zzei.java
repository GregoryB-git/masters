package com.google.android.recaptcha.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;
import sb.q;
import va.a;

public final class zzei
  extends SQLiteOpenHelper
{
  public static final zzeg zza;
  private static final int zzb;
  private static final String zzc;
  private static zzei zzd;
  
  static
  {
    zzeg localzzeg = new zzeg(null);
    zza = localzzeg;
    zzb = zzeg.zza(localzzeg, "18.6.1");
    zzc = zzeg.zzb(localzzeg, "18.6.1");
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
    paramSQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
    paramSQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
  }
  
  public final int zza(List paramList)
  {
    if (paramList.isEmpty()) {
      return 0;
    }
    paramList = String.valueOf(q.p(paramList, ", ", "(", ")", zzeh.zza, 24));
    return getWritableDatabase().delete("ce", "id IN ".concat(paramList), null);
  }
  
  /* Error */
  public final int zzb()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 111	android/database/sqlite/SQLiteOpenHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: ldc 113
    //   6: aconst_null
    //   7: invokevirtual 117	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   10: astore_1
    //   11: iconst_m1
    //   12: istore_2
    //   13: iload_2
    //   14: istore_3
    //   15: aload_1
    //   16: invokeinterface 122 1 0
    //   21: ifeq +25 -> 46
    //   24: aload_1
    //   25: iconst_0
    //   26: invokeinterface 126 2 0
    //   31: istore_3
    //   32: goto +14 -> 46
    //   35: astore 4
    //   37: aload_1
    //   38: invokeinterface 129 1 0
    //   43: aload 4
    //   45: athrow
    //   46: aload_1
    //   47: invokeinterface 129 1 0
    //   52: iload_3
    //   53: ireturn
    //   54: astore 4
    //   56: iload_2
    //   57: istore_3
    //   58: goto -12 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	zzei
    //   10	37	1	localCursor	android.database.Cursor
    //   12	45	2	i	int
    //   14	44	3	j	int
    //   35	9	4	localObject	Object
    //   54	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   15	32	35	finally
    //   15	32	54	java/lang/Exception
  }
  
  /* Error */
  public final List zzd()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 111	android/database/sqlite/SQLiteOpenHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: ldc 95
    //   6: aconst_null
    //   7: aconst_null
    //   8: aconst_null
    //   9: aconst_null
    //   10: aconst_null
    //   11: ldc -124
    //   13: invokevirtual 136	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   16: astore_1
    //   17: new 138	java/util/ArrayList
    //   20: dup
    //   21: invokespecial 140	java/util/ArrayList:<init>	()V
    //   24: astore_2
    //   25: aload_2
    //   26: astore_3
    //   27: aload_1
    //   28: invokeinterface 122 1 0
    //   33: ifeq +90 -> 123
    //   36: aload_1
    //   37: aload_1
    //   38: ldc -114
    //   40: invokeinterface 146 2 0
    //   45: invokeinterface 126 2 0
    //   50: istore 4
    //   52: aload_1
    //   53: aload_1
    //   54: ldc -108
    //   56: invokeinterface 146 2 0
    //   61: invokeinterface 152 2 0
    //   66: astore_3
    //   67: aload_1
    //   68: aload_1
    //   69: ldc -102
    //   71: invokeinterface 146 2 0
    //   76: invokeinterface 158 2 0
    //   81: lstore 5
    //   83: new 160	com/google/android/recaptcha/internal/zzej
    //   86: astore 7
    //   88: aload_3
    //   89: invokestatic 166	ec/i:b	(Ljava/lang/Object;)V
    //   92: aload 7
    //   94: aload_3
    //   95: lload 5
    //   97: iload 4
    //   99: invokespecial 169	com/google/android/recaptcha/internal/zzej:<init>	(Ljava/lang/String;JI)V
    //   102: aload_2
    //   103: aload 7
    //   105: invokeinterface 173 2 0
    //   110: pop
    //   111: goto -86 -> 25
    //   114: astore_3
    //   115: goto +16 -> 131
    //   118: astore_3
    //   119: getstatic 179	sb/s:a	Lsb/s;
    //   122: astore_3
    //   123: aload_1
    //   124: invokeinterface 129 1 0
    //   129: aload_3
    //   130: areturn
    //   131: aload_1
    //   132: invokeinterface 129 1 0
    //   137: aload_3
    //   138: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	zzei
    //   16	116	1	localCursor	android.database.Cursor
    //   24	79	2	localArrayList	java.util.ArrayList
    //   26	69	3	localObject1	Object
    //   114	1	3	localObject2	Object
    //   118	1	3	localException	Exception
    //   122	16	3	locals	sb.s
    //   50	48	4	i	int
    //   81	15	5	l	long
    //   86	18	7	localzzej	zzej
    // Exception table:
    //   from	to	target	type
    //   27	111	114	finally
    //   119	123	114	finally
    //   27	111	118	java/lang/Exception
  }
  
  public final boolean zzf(zzej paramzzej)
  {
    return zza(a.f(paramzzej)) == 1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzei
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
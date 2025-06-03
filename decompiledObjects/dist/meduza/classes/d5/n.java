package d5;

import ad.b;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import c8.w;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import ec.i;
import f9.e;
import f9.j;
import i9.a;
import java.util.HashMap;
import java.util.Map;
import vn.hunghd.flutterdownloader.c;

public final class n
  implements OnFailureListener, a
{
  public final Object b;
  
  public n()
  {
    b = new HashMap();
    c = new HashMap();
  }
  
  public n(TaskCompletionSource paramTaskCompletionSource, Context paramContext) {}
  
  public n(c paramc)
  {
    b = paramc;
    c = new String[] { "_id", "task_id", "progress", "status", "url", "file_name", "saved_dir", "headers", "mime_type", "resumable", "open_file_from_notification", "show_notification", "time_created", "save_in_public_storage", "allow_cellular" };
  }
  
  public static b f(Cursor paramCursor)
  {
    int i = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("_id"));
    String str1 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("task_id"));
    int j = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("status"));
    int k = paramCursor.getInt(paramCursor.getColumnIndexOrThrow("progress"));
    String str2 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("url"));
    String str3 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("file_name"));
    String str4 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("saved_dir"));
    String str5 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("headers"));
    String str6 = paramCursor.getString(paramCursor.getColumnIndexOrThrow("mime_type"));
    int m = paramCursor.getShort(paramCursor.getColumnIndexOrThrow("resumable"));
    int n = paramCursor.getShort(paramCursor.getColumnIndexOrThrow("show_notification"));
    int i1 = paramCursor.getShort(paramCursor.getColumnIndexOrThrow("open_file_from_notification"));
    long l = paramCursor.getLong(paramCursor.getColumnIndexOrThrow("time_created"));
    int i2 = paramCursor.getShort(paramCursor.getColumnIndexOrThrow("save_in_public_storage"));
    int i3 = paramCursor.getShort(paramCursor.getColumnIndexOrThrow("allow_cellular"));
    i.b(str1);
    paramCursor = ad.a.values()[j];
    i.b(str2);
    i.b(str4);
    i.b(str5);
    i.b(str6);
    boolean bool1;
    if (m == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if (n == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    boolean bool3;
    if (i1 == 1) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    boolean bool4;
    if (i2 == 1) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    boolean bool5;
    if (i3 == 1) {
      bool5 = true;
    } else {
      bool5 = false;
    }
    return new b(i, str1, paramCursor, k, str2, str3, str4, str5, str6, bool1, bool2, bool3, l, bool4, bool5);
  }
  
  public final e a(String paramString)
  {
    return (e)((Map)b).get(paramString);
  }
  
  public final void b(e parame)
  {
    ((Map)b).put(a, parame);
  }
  
  public final void c(j paramj)
  {
    ((Map)c).put(a, paramj);
  }
  
  public final j d(String paramString)
  {
    return (j)((Map)c).get(paramString);
  }
  
  public final b e(String paramString)
  {
    Cursor localCursor = ((c)b).getReadableDatabase().query("task", (String[])c, "task_id = ?", new String[] { paramString }, null, null, "_id DESC", "1");
    for (paramString = null; localCursor.moveToNext(); paramString = f(localCursor)) {}
    localCursor.close();
    return paramString;
  }
  
  /* Error */
  public final void g(String paramString, ad.a parama, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	d5/n:b	Ljava/lang/Object;
    //   4: checkcast 129	vn/hunghd/flutterdownloader/c
    //   7: invokevirtual 167	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 4
    //   12: new 169	android/content/ContentValues
    //   15: dup
    //   16: invokespecial 170	android/content/ContentValues:<init>	()V
    //   19: astore 5
    //   21: aload 5
    //   23: ldc 40
    //   25: aload_2
    //   26: invokevirtual 176	java/lang/Enum:ordinal	()I
    //   29: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   32: invokevirtual 185	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   35: aload 5
    //   37: ldc 38
    //   39: iload_3
    //   40: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: invokevirtual 185	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   46: aload 4
    //   48: invokevirtual 188	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   51: aload 4
    //   53: ldc -119
    //   55: aload 5
    //   57: ldc -115
    //   59: iconst_1
    //   60: anewarray 32	java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: aload_1
    //   66: aastore
    //   67: invokevirtual 192	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   70: pop
    //   71: aload 4
    //   73: invokevirtual 195	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   76: goto +12 -> 88
    //   79: astore_1
    //   80: goto +14 -> 94
    //   83: astore_1
    //   84: aload_1
    //   85: invokevirtual 200	java/lang/Throwable:printStackTrace	()V
    //   88: aload 4
    //   90: invokevirtual 203	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   93: return
    //   94: aload 4
    //   96: invokevirtual 203	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   99: aload_1
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	n
    //   0	101	1	paramString	String
    //   0	101	2	parama	ad.a
    //   0	101	3	paramInt	int
    //   10	85	4	localSQLiteDatabase	SQLiteDatabase
    //   19	37	5	localContentValues	android.content.ContentValues
    // Exception table:
    //   from	to	target	type
    //   51	76	79	finally
    //   84	88	79	finally
    //   51	76	83	java/lang/Exception
  }
  
  /* Error */
  public final void h(String paramString1, String paramString2, ad.a parama, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	d5/n:b	Ljava/lang/Object;
    //   4: checkcast 129	vn/hunghd/flutterdownloader/c
    //   7: invokevirtual 167	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 5
    //   12: new 169	android/content/ContentValues
    //   15: dup
    //   16: invokespecial 170	android/content/ContentValues:<init>	()V
    //   19: astore 6
    //   21: aload 6
    //   23: ldc 36
    //   25: aload_2
    //   26: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: aload 6
    //   31: ldc 40
    //   33: aload_3
    //   34: invokevirtual 176	java/lang/Enum:ordinal	()I
    //   37: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   40: invokevirtual 185	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   43: aload 6
    //   45: ldc 38
    //   47: iload 4
    //   49: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   52: invokevirtual 185	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   55: aload 6
    //   57: ldc 52
    //   59: iconst_0
    //   60: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   63: invokevirtual 185	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   66: aload 6
    //   68: ldc 58
    //   70: invokestatic 214	java/lang/System:currentTimeMillis	()J
    //   73: invokestatic 219	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   76: invokevirtual 222	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   79: aload 5
    //   81: invokevirtual 188	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   84: aload 5
    //   86: ldc -119
    //   88: aload 6
    //   90: ldc -115
    //   92: iconst_1
    //   93: anewarray 32	java/lang/String
    //   96: dup
    //   97: iconst_0
    //   98: aload_1
    //   99: aastore
    //   100: invokevirtual 192	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   103: pop
    //   104: aload 5
    //   106: invokevirtual 195	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   109: goto +12 -> 121
    //   112: astore_1
    //   113: goto +14 -> 127
    //   116: astore_1
    //   117: aload_1
    //   118: invokevirtual 200	java/lang/Throwable:printStackTrace	()V
    //   121: aload 5
    //   123: invokevirtual 203	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   126: return
    //   127: aload 5
    //   129: invokevirtual 203	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   132: aload_1
    //   133: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	134	0	this	n
    //   0	134	1	paramString1	String
    //   0	134	2	paramString2	String
    //   0	134	3	parama	ad.a
    //   0	134	4	paramInt	int
    //   10	118	5	localSQLiteDatabase	SQLiteDatabase
    //   19	70	6	localContentValues	android.content.ContentValues
    // Exception table:
    //   from	to	target	type
    //   84	109	112	finally
    //   117	121	112	finally
    //   84	109	116	java/lang/Exception
  }
  
  /* Error */
  public final void i(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	d5/n:b	Ljava/lang/Object;
    //   4: checkcast 129	vn/hunghd/flutterdownloader/c
    //   7: invokevirtual 167	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 4
    //   12: new 169	android/content/ContentValues
    //   15: dup
    //   16: invokespecial 170	android/content/ContentValues:<init>	()V
    //   19: astore 5
    //   21: aload 5
    //   23: ldc 44
    //   25: aload_2
    //   26: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: aload 5
    //   31: ldc 50
    //   33: aload_3
    //   34: invokevirtual 208	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: aload 4
    //   39: invokevirtual 188	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   42: aload 4
    //   44: ldc -119
    //   46: aload 5
    //   48: ldc -115
    //   50: iconst_1
    //   51: anewarray 32	java/lang/String
    //   54: dup
    //   55: iconst_0
    //   56: aload_1
    //   57: aastore
    //   58: invokevirtual 192	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   61: pop
    //   62: aload 4
    //   64: invokevirtual 195	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   67: goto +12 -> 79
    //   70: astore_1
    //   71: goto +14 -> 85
    //   74: astore_1
    //   75: aload_1
    //   76: invokevirtual 200	java/lang/Throwable:printStackTrace	()V
    //   79: aload 4
    //   81: invokevirtual 203	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   84: return
    //   85: aload 4
    //   87: invokevirtual 203	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   90: aload_1
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	n
    //   0	92	1	paramString1	String
    //   0	92	2	paramString2	String
    //   0	92	3	paramString3	String
    //   10	76	4	localSQLiteDatabase	SQLiteDatabase
    //   19	28	5	localContentValues	android.content.ContentValues
    // Exception table:
    //   from	to	target	type
    //   42	67	70	finally
    //   75	79	70	finally
    //   42	67	74	java/lang/Exception
  }
  
  /* Error */
  public final void j(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	d5/n:b	Ljava/lang/Object;
    //   4: checkcast 129	vn/hunghd/flutterdownloader/c
    //   7: invokevirtual 167	android/database/sqlite/SQLiteOpenHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_3
    //   11: new 169	android/content/ContentValues
    //   14: dup
    //   15: invokespecial 170	android/content/ContentValues:<init>	()V
    //   18: astore 4
    //   20: aload 4
    //   22: ldc 52
    //   24: iload_2
    //   25: invokestatic 182	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: invokevirtual 185	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   31: aload_3
    //   32: invokevirtual 188	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   35: aload_3
    //   36: ldc -119
    //   38: aload 4
    //   40: ldc -115
    //   42: iconst_1
    //   43: anewarray 32	java/lang/String
    //   46: dup
    //   47: iconst_0
    //   48: aload_1
    //   49: aastore
    //   50: invokevirtual 192	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   53: pop
    //   54: aload_3
    //   55: invokevirtual 195	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   58: goto +12 -> 70
    //   61: astore_1
    //   62: goto +13 -> 75
    //   65: astore_1
    //   66: aload_1
    //   67: invokevirtual 200	java/lang/Throwable:printStackTrace	()V
    //   70: aload_3
    //   71: invokevirtual 203	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   74: return
    //   75: aload_3
    //   76: invokevirtual 203	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	n
    //   0	81	1	paramString	String
    //   0	81	2	paramBoolean	boolean
    //   10	66	3	localSQLiteDatabase	SQLiteDatabase
    //   18	21	4	localContentValues	android.content.ContentValues
    // Exception table:
    //   from	to	target	type
    //   35	58	61	finally
    //   66	70	61	finally
    //   35	58	65	java/lang/Exception
  }
  
  public final void onFailure(Exception paramException)
  {
    ((TaskCompletionSource)b).setException(paramException);
    w.c((Context)c);
  }
  
  public final String toString()
  {
    switch (a)
    {
    default: 
      return super.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)b);
    localStringBuilder.append(", ");
    localStringBuilder.append((String)c);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
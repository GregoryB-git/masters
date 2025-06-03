package u1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import dc.r;
import ec.i;
import ec.j;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t1.a.a;
import t1.e;

public final class c
  implements t1.b
{
  public static final String[] c = { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
  public static final String[] d = new String[0];
  public final SQLiteDatabase a;
  public final List<Pair<String, String>> b;
  
  public c(SQLiteDatabase paramSQLiteDatabase)
  {
    a = paramSQLiteDatabase;
    b = paramSQLiteDatabase.getAttachedDbs();
  }
  
  public final Cursor C(String paramString)
  {
    i.e(paramString, "query");
    return y(new t1.a(paramString));
  }
  
  public final void G()
  {
    a.setTransactionSuccessful();
  }
  
  public final int H(String paramString1, int paramInt, ContentValues paramContentValues, String paramString2, Object[] paramArrayOfObject)
  {
    i.e(paramString1, "table");
    i.e(paramContentValues, "values");
    int i = paramContentValues.size();
    int j = 0;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      i = paramContentValues.size();
      int k;
      if (paramArrayOfObject == null) {
        k = i;
      } else {
        k = paramArrayOfObject.length + i;
      }
      Object[] arrayOfObject = new Object[k];
      StringBuilder localStringBuilder = f.l("UPDATE ");
      localStringBuilder.append(c[paramInt]);
      localStringBuilder.append(paramString1);
      localStringBuilder.append(" SET ");
      Iterator localIterator = paramContentValues.keySet().iterator();
      for (paramInt = j; localIterator.hasNext(); paramInt++)
      {
        String str = (String)localIterator.next();
        if (paramInt > 0) {
          paramString1 = ",";
        } else {
          paramString1 = "";
        }
        localStringBuilder.append(paramString1);
        localStringBuilder.append(str);
        arrayOfObject[paramInt] = paramContentValues.get(str);
        localStringBuilder.append("=?");
      }
      if (paramArrayOfObject != null) {
        for (paramInt = i; paramInt < k; paramInt++) {
          arrayOfObject[paramInt] = paramArrayOfObject[(paramInt - i)];
        }
      }
      if (!TextUtils.isEmpty(paramString2))
      {
        localStringBuilder.append(" WHERE ");
        localStringBuilder.append(paramString2);
      }
      paramString1 = localStringBuilder.toString();
      i.d(paramString1, "StringBuilder().apply(builderAction).toString()");
      paramString1 = q(paramString1);
      a.a.a(paramString1, arrayOfObject);
      return ((g)paramString1).p();
    }
    throw new IllegalArgumentException("Empty values".toString());
  }
  
  public final void J()
  {
    a.beginTransactionNonExclusive();
  }
  
  public final Cursor V(e parame, CancellationSignal paramCancellationSignal)
  {
    i.e(parame, "query");
    SQLiteDatabase localSQLiteDatabase = a;
    String str = parame.g();
    String[] arrayOfString = d;
    i.b(paramCancellationSignal);
    parame = new a(parame, 0);
    i.e(localSQLiteDatabase, "sQLiteDatabase");
    i.e(str, "sql");
    parame = localSQLiteDatabase.rawQueryWithFactory(parame, str, arrayOfString, null, paramCancellationSignal);
    i.d(parame, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
    return parame;
  }
  
  public final void X()
  {
    a.endTransaction();
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final void f(String paramString, Object[] paramArrayOfObject)
  {
    i.e(paramString, "sql");
    i.e(paramArrayOfObject, "bindArgs");
    a.execSQL(paramString, paramArrayOfObject);
  }
  
  public final String g()
  {
    return a.getPath();
  }
  
  public final void h()
  {
    a.beginTransaction();
  }
  
  public final boolean isOpen()
  {
    return a.isOpen();
  }
  
  public final boolean j0()
  {
    return a.inTransaction();
  }
  
  public final void m(String paramString)
  {
    i.e(paramString, "sql");
    a.execSQL(paramString);
  }
  
  public final boolean n0()
  {
    SQLiteDatabase localSQLiteDatabase = a;
    i.e(localSQLiteDatabase, "sQLiteDatabase");
    return localSQLiteDatabase.isWriteAheadLoggingEnabled();
  }
  
  public final t1.f q(String paramString)
  {
    i.e(paramString, "sql");
    paramString = a.compileStatement(paramString);
    i.d(paramString, "delegate.compileStatement(sql)");
    return new g(paramString);
  }
  
  public final Cursor y(e parame)
  {
    i.e(parame, "query");
    a locala = new a(parame);
    parame = a.rawQueryWithFactory(new b(locala, 0), parame.g(), d, null);
    i.d(parame, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
    return parame;
  }
  
  public static final class a
    extends j
    implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>
  {
    public a(e parame)
    {
      super();
    }
    
    public final SQLiteCursor d(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
    {
      paramObject1 = (SQLiteDatabase)paramObject1;
      paramObject1 = (SQLiteCursorDriver)paramObject2;
      paramObject2 = (String)paramObject3;
      paramObject4 = (SQLiteQuery)paramObject4;
      paramObject3 = a;
      i.b(paramObject4);
      ((e)paramObject3).f(new f((SQLiteProgram)paramObject4));
      return new SQLiteCursor((SQLiteCursorDriver)paramObject1, (String)paramObject2, (SQLiteQuery)paramObject4);
    }
  }
}

/* Location:
 * Qualified Name:     u1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
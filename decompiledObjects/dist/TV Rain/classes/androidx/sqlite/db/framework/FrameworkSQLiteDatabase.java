package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import z2;

class FrameworkSQLiteDatabase
  implements SupportSQLiteDatabase
{
  private static final String[] CONFLICT_VALUES = { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
  private static final String[] EMPTY_STRING_ARRAY = new String[0];
  private final SQLiteDatabase mDelegate;
  
  public FrameworkSQLiteDatabase(SQLiteDatabase paramSQLiteDatabase)
  {
    mDelegate = paramSQLiteDatabase;
  }
  
  public void beginTransaction()
  {
    mDelegate.beginTransaction();
  }
  
  public void beginTransactionNonExclusive()
  {
    mDelegate.beginTransactionNonExclusive();
  }
  
  public void beginTransactionWithListener(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    mDelegate.beginTransactionWithListener(paramSQLiteTransactionListener);
  }
  
  public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    mDelegate.beginTransactionWithListenerNonExclusive(paramSQLiteTransactionListener);
  }
  
  public void close()
    throws IOException
  {
    mDelegate.close();
  }
  
  public SupportSQLiteStatement compileStatement(String paramString)
  {
    return new FrameworkSQLiteStatement(mDelegate.compileStatement(paramString));
  }
  
  public int delete(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    StringBuilder localStringBuilder = z2.u("DELETE FROM ", paramString1);
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = "";
    } else {
      paramString1 = z2.o(" WHERE ", paramString2);
    }
    localStringBuilder.append(paramString1);
    paramString1 = compileStatement(localStringBuilder.toString());
    SimpleSQLiteQuery.bind(paramString1, paramArrayOfObject);
    return paramString1.executeUpdateDelete();
  }
  
  @RequiresApi(api=16)
  public void disableWriteAheadLogging()
  {
    mDelegate.disableWriteAheadLogging();
  }
  
  public boolean enableWriteAheadLogging()
  {
    return mDelegate.enableWriteAheadLogging();
  }
  
  public void endTransaction()
  {
    mDelegate.endTransaction();
  }
  
  public void execSQL(String paramString)
    throws SQLException
  {
    mDelegate.execSQL(paramString);
  }
  
  public void execSQL(String paramString, Object[] paramArrayOfObject)
    throws SQLException
  {
    mDelegate.execSQL(paramString, paramArrayOfObject);
  }
  
  public List<Pair<String, String>> getAttachedDbs()
  {
    return mDelegate.getAttachedDbs();
  }
  
  public long getMaximumSize()
  {
    return mDelegate.getMaximumSize();
  }
  
  public long getPageSize()
  {
    return mDelegate.getPageSize();
  }
  
  public String getPath()
  {
    return mDelegate.getPath();
  }
  
  public int getVersion()
  {
    return mDelegate.getVersion();
  }
  
  public boolean inTransaction()
  {
    return mDelegate.inTransaction();
  }
  
  public long insert(String paramString, int paramInt, ContentValues paramContentValues)
    throws SQLException
  {
    return mDelegate.insertWithOnConflict(paramString, null, paramContentValues, paramInt);
  }
  
  public boolean isDatabaseIntegrityOk()
  {
    return mDelegate.isDatabaseIntegrityOk();
  }
  
  public boolean isDbLockedByCurrentThread()
  {
    return mDelegate.isDbLockedByCurrentThread();
  }
  
  public boolean isDelegate(SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool;
    if (mDelegate == paramSQLiteDatabase) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isOpen()
  {
    return mDelegate.isOpen();
  }
  
  public boolean isReadOnly()
  {
    return mDelegate.isReadOnly();
  }
  
  @RequiresApi(api=16)
  public boolean isWriteAheadLoggingEnabled()
  {
    return mDelegate.isWriteAheadLoggingEnabled();
  }
  
  public boolean needUpgrade(int paramInt)
  {
    return mDelegate.needUpgrade(paramInt);
  }
  
  public Cursor query(final SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    mDelegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory()
    {
      public Cursor newCursor(SQLiteDatabase paramAnonymousSQLiteDatabase, SQLiteCursorDriver paramAnonymousSQLiteCursorDriver, String paramAnonymousString, SQLiteQuery paramAnonymousSQLiteQuery)
      {
        paramSupportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(paramAnonymousSQLiteQuery));
        return new SQLiteCursor(paramAnonymousSQLiteCursorDriver, paramAnonymousString, paramAnonymousSQLiteQuery);
      }
    }, paramSupportSQLiteQuery.getSql(), EMPTY_STRING_ARRAY, null);
  }
  
  @RequiresApi(api=16)
  public Cursor query(final SupportSQLiteQuery paramSupportSQLiteQuery, CancellationSignal paramCancellationSignal)
  {
    mDelegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory()
    {
      public Cursor newCursor(SQLiteDatabase paramAnonymousSQLiteDatabase, SQLiteCursorDriver paramAnonymousSQLiteCursorDriver, String paramAnonymousString, SQLiteQuery paramAnonymousSQLiteQuery)
      {
        paramSupportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(paramAnonymousSQLiteQuery));
        return new SQLiteCursor(paramAnonymousSQLiteCursorDriver, paramAnonymousString, paramAnonymousSQLiteQuery);
      }
    }, paramSupportSQLiteQuery.getSql(), EMPTY_STRING_ARRAY, null, paramCancellationSignal);
  }
  
  public Cursor query(String paramString)
  {
    return query(new SimpleSQLiteQuery(paramString));
  }
  
  public Cursor query(String paramString, Object[] paramArrayOfObject)
  {
    return query(new SimpleSQLiteQuery(paramString, paramArrayOfObject));
  }
  
  @RequiresApi(api=16)
  public void setForeignKeyConstraintsEnabled(boolean paramBoolean)
  {
    mDelegate.setForeignKeyConstraintsEnabled(paramBoolean);
  }
  
  public void setLocale(Locale paramLocale)
  {
    mDelegate.setLocale(paramLocale);
  }
  
  public void setMaxSqlCacheSize(int paramInt)
  {
    mDelegate.setMaxSqlCacheSize(paramInt);
  }
  
  public long setMaximumSize(long paramLong)
  {
    return mDelegate.setMaximumSize(paramLong);
  }
  
  public void setPageSize(long paramLong)
  {
    mDelegate.setPageSize(paramLong);
  }
  
  public void setTransactionSuccessful()
  {
    mDelegate.setTransactionSuccessful();
  }
  
  public void setVersion(int paramInt)
  {
    mDelegate.setVersion(paramInt);
  }
  
  public int update(String paramString1, int paramInt, ContentValues paramContentValues, String paramString2, Object[] paramArrayOfObject)
  {
    if ((paramContentValues != null) && (paramContentValues.size() != 0))
    {
      StringBuilder localStringBuilder = new StringBuilder(120);
      localStringBuilder.append("UPDATE ");
      localStringBuilder.append(CONFLICT_VALUES[paramInt]);
      localStringBuilder.append(paramString1);
      localStringBuilder.append(" SET ");
      paramInt = paramContentValues.size();
      int i;
      if (paramArrayOfObject == null) {
        i = paramInt;
      } else {
        i = paramArrayOfObject.length + paramInt;
      }
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      Iterator localIterator = paramContentValues.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (j > 0) {
          paramString1 = ",";
        } else {
          paramString1 = "";
        }
        localStringBuilder.append(paramString1);
        localStringBuilder.append(str);
        arrayOfObject[j] = paramContentValues.get(str);
        localStringBuilder.append("=?");
        j++;
      }
      if (paramArrayOfObject != null) {
        for (j = paramInt; j < i; j++) {
          arrayOfObject[j] = paramArrayOfObject[(j - paramInt)];
        }
      }
      if (!TextUtils.isEmpty(paramString2))
      {
        localStringBuilder.append(" WHERE ");
        localStringBuilder.append(paramString2);
      }
      paramString1 = compileStatement(localStringBuilder.toString());
      SimpleSQLiteQuery.bind(paramString1, arrayOfObject);
      return paramString1.executeUpdateDelete();
    }
    throw new IllegalArgumentException("Empty values");
  }
  
  public boolean yieldIfContendedSafely()
  {
    return mDelegate.yieldIfContendedSafely();
  }
  
  public boolean yieldIfContendedSafely(long paramLong)
  {
    return mDelegate.yieldIfContendedSafely(paramLong);
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.framework.FrameworkSQLiteDatabase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
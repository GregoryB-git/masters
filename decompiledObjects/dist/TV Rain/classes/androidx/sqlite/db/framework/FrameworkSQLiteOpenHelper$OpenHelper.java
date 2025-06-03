package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;

class FrameworkSQLiteOpenHelper$OpenHelper
  extends SQLiteOpenHelper
{
  public final SupportSQLiteOpenHelper.Callback mCallback;
  public final FrameworkSQLiteDatabase[] mDbRef;
  private boolean mMigrated;
  
  public FrameworkSQLiteOpenHelper$OpenHelper(Context paramContext, String paramString, final FrameworkSQLiteDatabase[] paramArrayOfFrameworkSQLiteDatabase, SupportSQLiteOpenHelper.Callback paramCallback)
  {
    super(paramContext, paramString, null, version, new DatabaseErrorHandler()
    {
      public void onCorruption(SQLiteDatabase paramAnonymousSQLiteDatabase)
      {
        onCorruption(FrameworkSQLiteOpenHelper.OpenHelper.getWrappedDb(paramArrayOfFrameworkSQLiteDatabase, paramAnonymousSQLiteDatabase));
      }
    });
    mCallback = paramCallback;
    mDbRef = paramArrayOfFrameworkSQLiteDatabase;
  }
  
  public static FrameworkSQLiteDatabase getWrappedDb(FrameworkSQLiteDatabase[] paramArrayOfFrameworkSQLiteDatabase, SQLiteDatabase paramSQLiteDatabase)
  {
    FrameworkSQLiteDatabase localFrameworkSQLiteDatabase = paramArrayOfFrameworkSQLiteDatabase[0];
    if ((localFrameworkSQLiteDatabase == null) || (!localFrameworkSQLiteDatabase.isDelegate(paramSQLiteDatabase))) {
      paramArrayOfFrameworkSQLiteDatabase[0] = new FrameworkSQLiteDatabase(paramSQLiteDatabase);
    }
    return paramArrayOfFrameworkSQLiteDatabase[0];
  }
  
  public void close()
  {
    try
    {
      super.close();
      mDbRef[0] = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public SupportSQLiteDatabase getReadableSupportDatabase()
  {
    try
    {
      mMigrated = false;
      Object localObject1 = super.getReadableDatabase();
      if (mMigrated)
      {
        close();
        localObject1 = getReadableSupportDatabase();
        return (SupportSQLiteDatabase)localObject1;
      }
      localObject1 = getWrappedDb((SQLiteDatabase)localObject1);
      return (SupportSQLiteDatabase)localObject1;
    }
    finally {}
  }
  
  public FrameworkSQLiteDatabase getWrappedDb(SQLiteDatabase paramSQLiteDatabase)
  {
    return getWrappedDb(mDbRef, paramSQLiteDatabase);
  }
  
  public SupportSQLiteDatabase getWritableSupportDatabase()
  {
    try
    {
      mMigrated = false;
      Object localObject1 = super.getWritableDatabase();
      if (mMigrated)
      {
        close();
        localObject1 = getWritableSupportDatabase();
        return (SupportSQLiteDatabase)localObject1;
      }
      localObject1 = getWrappedDb((SQLiteDatabase)localObject1);
      return (SupportSQLiteDatabase)localObject1;
    }
    finally {}
  }
  
  public void onConfigure(SQLiteDatabase paramSQLiteDatabase)
  {
    mCallback.onConfigure(getWrappedDb(paramSQLiteDatabase));
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    mCallback.onCreate(getWrappedDb(paramSQLiteDatabase));
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    mMigrated = true;
    mCallback.onDowngrade(getWrappedDb(paramSQLiteDatabase), paramInt1, paramInt2);
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    if (!mMigrated) {
      mCallback.onOpen(getWrappedDb(paramSQLiteDatabase));
    }
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    mMigrated = true;
    mCallback.onUpgrade(getWrappedDb(paramSQLiteDatabase), paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
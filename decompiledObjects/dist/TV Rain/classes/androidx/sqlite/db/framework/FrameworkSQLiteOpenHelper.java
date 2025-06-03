package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import java.io.File;

class FrameworkSQLiteOpenHelper
  implements SupportSQLiteOpenHelper
{
  private final SupportSQLiteOpenHelper.Callback mCallback;
  private final Context mContext;
  private OpenHelper mDelegate;
  private final Object mLock;
  private final String mName;
  private final boolean mUseNoBackupDirectory;
  private boolean mWriteAheadLoggingEnabled;
  
  public FrameworkSQLiteOpenHelper(Context paramContext, String paramString, SupportSQLiteOpenHelper.Callback paramCallback)
  {
    this(paramContext, paramString, paramCallback, false);
  }
  
  public FrameworkSQLiteOpenHelper(Context paramContext, String paramString, SupportSQLiteOpenHelper.Callback paramCallback, boolean paramBoolean)
  {
    mContext = paramContext;
    mName = paramString;
    mCallback = paramCallback;
    mUseNoBackupDirectory = paramBoolean;
    mLock = new Object();
  }
  
  private OpenHelper getDelegate()
  {
    synchronized (mLock)
    {
      if (mDelegate == null)
      {
        localObject2 = new FrameworkSQLiteDatabase[1];
        Object localObject4;
        if ((mName != null) && (mUseNoBackupDirectory))
        {
          localObject4 = new java/io/File;
          ((File)localObject4).<init>(mContext.getNoBackupFilesDir(), mName);
          OpenHelper localOpenHelper = new androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;
          localOpenHelper.<init>(mContext, ((File)localObject4).getAbsolutePath(), (FrameworkSQLiteDatabase[])localObject2, mCallback);
          mDelegate = localOpenHelper;
        }
        else
        {
          localObject4 = new androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;
          ((OpenHelper)localObject4).<init>(mContext, mName, (FrameworkSQLiteDatabase[])localObject2, mCallback);
          mDelegate = ((OpenHelper)localObject4);
        }
        mDelegate.setWriteAheadLoggingEnabled(mWriteAheadLoggingEnabled);
      }
      Object localObject2 = mDelegate;
      return (OpenHelper)localObject2;
    }
  }
  
  public void close()
  {
    getDelegate().close();
  }
  
  public String getDatabaseName()
  {
    return mName;
  }
  
  public SupportSQLiteDatabase getReadableDatabase()
  {
    return getDelegate().getReadableSupportDatabase();
  }
  
  public SupportSQLiteDatabase getWritableDatabase()
  {
    return getDelegate().getWritableSupportDatabase();
  }
  
  @RequiresApi(api=16)
  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    synchronized (mLock)
    {
      OpenHelper localOpenHelper = mDelegate;
      if (localOpenHelper != null) {
        localOpenHelper.setWriteAheadLoggingEnabled(paramBoolean);
      }
      mWriteAheadLoggingEnabled = paramBoolean;
      return;
    }
  }
  
  public static class OpenHelper
    extends SQLiteOpenHelper
  {
    public final SupportSQLiteOpenHelper.Callback mCallback;
    public final FrameworkSQLiteDatabase[] mDbRef;
    private boolean mMigrated;
    
    public OpenHelper(Context paramContext, String paramString, final FrameworkSQLiteDatabase[] paramArrayOfFrameworkSQLiteDatabase, SupportSQLiteOpenHelper.Callback paramCallback)
    {
      super(paramString, null, version, new DatabaseErrorHandler()
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
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
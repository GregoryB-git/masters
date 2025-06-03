package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import z2;

public abstract interface SupportSQLiteOpenHelper
  extends Closeable
{
  public abstract void close();
  
  @Nullable
  public abstract String getDatabaseName();
  
  public abstract SupportSQLiteDatabase getReadableDatabase();
  
  public abstract SupportSQLiteDatabase getWritableDatabase();
  
  @RequiresApi(api=16)
  public abstract void setWriteAheadLoggingEnabled(boolean paramBoolean);
  
  public static abstract class Callback
  {
    private static final String TAG = "SupportSQLite";
    public final int version;
    
    public Callback(int paramInt)
    {
      version = paramInt;
    }
    
    private void deleteDatabaseFile(String paramString)
    {
      if ((!paramString.equalsIgnoreCase(":memory:")) && (paramString.trim().length() != 0))
      {
        z2.A("deleting the database file: ", paramString, "SupportSQLite");
        try
        {
          File localFile = new java/io/File;
          localFile.<init>(paramString);
          SQLiteDatabase.deleteDatabase(localFile);
        }
        catch (Exception paramString)
        {
          Log.w("SupportSQLite", "delete failed: ", paramString);
        }
      }
    }
    
    public void onConfigure(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onCorruption(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
    {
      Object localObject1 = z2.t("Corruption reported by sqlite on database: ");
      ((StringBuilder)localObject1).append(paramSupportSQLiteDatabase.getPath());
      Log.e("SupportSQLite", ((StringBuilder)localObject1).toString());
      if (!paramSupportSQLiteDatabase.isOpen())
      {
        deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
        return;
      }
      localObject1 = null;
      Object localObject3 = null;
      try
      {
        try
        {
          List localList = paramSupportSQLiteDatabase.getAttachedDbs();
          localObject1 = localList;
        }
        finally
        {
          break label80;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;) {}
      }
      localObject3 = localObject2;
      try
      {
        paramSupportSQLiteDatabase.close();
      }
      catch (IOException localIOException)
      {
        label80:
        for (;;) {}
      }
      if (localObject3 != null)
      {
        paramSupportSQLiteDatabase = ((List)localObject3).iterator();
        while (paramSupportSQLiteDatabase.hasNext()) {
          deleteDatabaseFile((String)nextsecond);
        }
      }
      deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
      throw ((Throwable)localObject2);
      if (localObject2 != null)
      {
        paramSupportSQLiteDatabase = ((List)localObject2).iterator();
        while (paramSupportSQLiteDatabase.hasNext()) {
          deleteDatabaseFile((String)nextsecond);
        }
      }
      deleteDatabaseFile(paramSupportSQLiteDatabase.getPath());
    }
    
    public abstract void onCreate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    public void onDowngrade(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2)
    {
      throw new SQLiteException(z2.n("Can't downgrade database from version ", paramInt1, " to ", paramInt2));
    }
    
    public void onOpen(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public abstract void onUpgrade(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2);
  }
  
  public static class Configuration
  {
    @NonNull
    public final SupportSQLiteOpenHelper.Callback callback;
    @NonNull
    public final Context context;
    @Nullable
    public final String name;
    public final boolean useNoBackupDirectory;
    
    public Configuration(@NonNull Context paramContext, @Nullable String paramString, @NonNull SupportSQLiteOpenHelper.Callback paramCallback)
    {
      this(paramContext, paramString, paramCallback, false);
    }
    
    public Configuration(@NonNull Context paramContext, @Nullable String paramString, @NonNull SupportSQLiteOpenHelper.Callback paramCallback, boolean paramBoolean)
    {
      context = paramContext;
      name = paramString;
      callback = paramCallback;
      useNoBackupDirectory = paramBoolean;
    }
    
    @NonNull
    public static Builder builder(@NonNull Context paramContext)
    {
      return new Builder(paramContext);
    }
    
    public static class Builder
    {
      public SupportSQLiteOpenHelper.Callback mCallback;
      public Context mContext;
      public String mName;
      public boolean mUseNoBackUpDirectory;
      
      public Builder(@NonNull Context paramContext)
      {
        mContext = paramContext;
      }
      
      @NonNull
      public SupportSQLiteOpenHelper.Configuration build()
      {
        if (mCallback != null)
        {
          if (mContext != null)
          {
            if ((mUseNoBackUpDirectory) && (TextUtils.isEmpty(mName))) {
              throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            return new SupportSQLiteOpenHelper.Configuration(mContext, mName, mCallback, mUseNoBackUpDirectory);
          }
          throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
      }
      
      @NonNull
      public Builder callback(@NonNull SupportSQLiteOpenHelper.Callback paramCallback)
      {
        mCallback = paramCallback;
        return this;
      }
      
      @NonNull
      public Builder name(@Nullable String paramString)
      {
        mName = paramString;
        return this;
      }
      
      @NonNull
      public Builder noBackupDirectory(boolean paramBoolean)
      {
        mUseNoBackUpDirectory = paramBoolean;
        return this;
      }
    }
  }
  
  public static abstract interface Factory
  {
    @NonNull
    public abstract SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration paramConfiguration);
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.SupportSQLiteOpenHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
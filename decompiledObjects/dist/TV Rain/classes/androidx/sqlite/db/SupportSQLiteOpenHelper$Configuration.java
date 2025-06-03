package androidx.sqlite.db;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SupportSQLiteOpenHelper$Configuration
{
  @NonNull
  public final SupportSQLiteOpenHelper.Callback callback;
  @NonNull
  public final Context context;
  @Nullable
  public final String name;
  public final boolean useNoBackupDirectory;
  
  public SupportSQLiteOpenHelper$Configuration(@NonNull Context paramContext, @Nullable String paramString, @NonNull SupportSQLiteOpenHelper.Callback paramCallback)
  {
    this(paramContext, paramString, paramCallback, false);
  }
  
  public SupportSQLiteOpenHelper$Configuration(@NonNull Context paramContext, @Nullable String paramString, @NonNull SupportSQLiteOpenHelper.Callback paramCallback, boolean paramBoolean)
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

/* Location:
 * Qualified Name:     androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
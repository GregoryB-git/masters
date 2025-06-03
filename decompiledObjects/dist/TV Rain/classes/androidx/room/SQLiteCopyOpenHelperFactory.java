package androidx.room;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import java.io.File;

class SQLiteCopyOpenHelperFactory
  implements SupportSQLiteOpenHelper.Factory
{
  @Nullable
  private final String mCopyFromAssetPath;
  @Nullable
  private final File mCopyFromFile;
  @NonNull
  private final SupportSQLiteOpenHelper.Factory mDelegate;
  
  public SQLiteCopyOpenHelperFactory(@Nullable String paramString, @Nullable File paramFile, @NonNull SupportSQLiteOpenHelper.Factory paramFactory)
  {
    mCopyFromAssetPath = paramString;
    mCopyFromFile = paramFile;
    mDelegate = paramFactory;
  }
  
  public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration paramConfiguration)
  {
    return new SQLiteCopyOpenHelper(context, mCopyFromAssetPath, mCopyFromFile, callback.version, mDelegate.create(paramConfiguration));
  }
}

/* Location:
 * Qualified Name:     androidx.room.SQLiteCopyOpenHelperFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
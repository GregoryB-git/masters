package androidx.sqlite.db.framework;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;

public final class FrameworkSQLiteOpenHelperFactory
  implements SupportSQLiteOpenHelper.Factory
{
  @NonNull
  public SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration paramConfiguration)
  {
    return new FrameworkSQLiteOpenHelper(context, name, callback, useNoBackupDirectory);
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
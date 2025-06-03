package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;

class WorkDatabase$1
  implements SupportSQLiteOpenHelper.Factory
{
  public WorkDatabase$1(Context paramContext) {}
  
  @NonNull
  public SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration paramConfiguration)
  {
    SupportSQLiteOpenHelper.Configuration.Builder localBuilder = SupportSQLiteOpenHelper.Configuration.builder(val$context);
    localBuilder.name(name).callback(callback).noBackupDirectory(true);
    return new FrameworkSQLiteOpenHelperFactory().create(localBuilder.build());
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabase.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
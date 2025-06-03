package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabase.Builder;
import androidx.room.RoomDatabase.Callback;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.Data;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@Database(entities={Dependency.class, WorkSpec.class, WorkTag.class, SystemIdInfo.class, WorkName.class, WorkProgress.class, Preference.class}, version=12)
@TypeConverters({Data.class, WorkTypeConverters.class})
public abstract class WorkDatabase
  extends RoomDatabase
{
  private static final String PRUNE_SQL_FORMAT_PREFIX = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";
  private static final String PRUNE_SQL_FORMAT_SUFFIX = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
  private static final long PRUNE_THRESHOLD_MILLIS = TimeUnit.DAYS.toMillis(1L);
  
  @NonNull
  public static WorkDatabase create(@NonNull Context paramContext, @NonNull Executor paramExecutor, boolean paramBoolean)
  {
    RoomDatabase.Builder localBuilder;
    if (paramBoolean)
    {
      localBuilder = Room.inMemoryDatabaseBuilder(paramContext, WorkDatabase.class).allowMainThreadQueries();
    }
    else
    {
      localBuilder = Room.databaseBuilder(paramContext, WorkDatabase.class, WorkDatabasePathHelper.getWorkDatabaseName());
      localBuilder.openHelperFactory(new SupportSQLiteOpenHelper.Factory()
      {
        @NonNull
        public SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration paramAnonymousConfiguration)
        {
          SupportSQLiteOpenHelper.Configuration.Builder localBuilder = SupportSQLiteOpenHelper.Configuration.builder(WorkDatabase.this);
          localBuilder.name(name).callback(callback).noBackupDirectory(true);
          return new FrameworkSQLiteOpenHelperFactory().create(localBuilder.build());
        }
      });
    }
    return (WorkDatabase)localBuilder.setQueryExecutor(paramExecutor).addCallback(generateCleanupCallback()).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_1_2 }).addMigrations(new Migration[] { new WorkDatabaseMigrations.RescheduleMigration(paramContext, 2, 3) }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_3_4 }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_4_5 }).addMigrations(new Migration[] { new WorkDatabaseMigrations.RescheduleMigration(paramContext, 5, 6) }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_6_7 }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_7_8 }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_8_9 }).addMigrations(new Migration[] { new WorkDatabaseMigrations.WorkMigration9To10(paramContext) }).addMigrations(new Migration[] { new WorkDatabaseMigrations.RescheduleMigration(paramContext, 10, 11) }).addMigrations(new Migration[] { WorkDatabaseMigrations.MIGRATION_11_12 }).fallbackToDestructiveMigration().build();
  }
  
  public static RoomDatabase.Callback generateCleanupCallback()
  {
    new RoomDatabase.Callback()
    {
      public void onOpen(@NonNull SupportSQLiteDatabase paramAnonymousSupportSQLiteDatabase)
      {
        super.onOpen(paramAnonymousSupportSQLiteDatabase);
        paramAnonymousSupportSQLiteDatabase.beginTransaction();
        try
        {
          paramAnonymousSupportSQLiteDatabase.execSQL(WorkDatabase.getPruneSQL());
          paramAnonymousSupportSQLiteDatabase.setTransactionSuccessful();
          return;
        }
        finally
        {
          paramAnonymousSupportSQLiteDatabase.endTransaction();
        }
      }
    };
  }
  
  public static long getPruneDate()
  {
    return System.currentTimeMillis() - PRUNE_THRESHOLD_MILLIS;
  }
  
  @NonNull
  public static String getPruneSQL()
  {
    StringBuilder localStringBuilder = z2.t("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
    localStringBuilder.append(getPruneDate());
    localStringBuilder.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
    return localStringBuilder.toString();
  }
  
  @NonNull
  public abstract DependencyDao dependencyDao();
  
  @NonNull
  public abstract PreferenceDao preferenceDao();
  
  @NonNull
  public abstract RawWorkInfoDao rawWorkInfoDao();
  
  @NonNull
  public abstract SystemIdInfoDao systemIdInfoDao();
  
  @NonNull
  public abstract WorkNameDao workNameDao();
  
  @NonNull
  public abstract WorkProgressDao workProgressDao();
  
  @NonNull
  public abstract WorkSpecDao workSpecDao();
  
  @NonNull
  public abstract WorkTagDao workTagDao();
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
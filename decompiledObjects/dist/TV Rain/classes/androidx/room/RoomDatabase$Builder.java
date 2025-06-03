package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public class RoomDatabase$Builder<T extends RoomDatabase>
{
  private boolean mAllowDestructiveMigrationOnDowngrade;
  private boolean mAllowMainThreadQueries;
  private ArrayList<RoomDatabase.Callback> mCallbacks;
  private final Context mContext;
  private String mCopyFromAssetPath;
  private File mCopyFromFile;
  private final Class<T> mDatabaseClass;
  private SupportSQLiteOpenHelper.Factory mFactory;
  private RoomDatabase.JournalMode mJournalMode;
  private final RoomDatabase.MigrationContainer mMigrationContainer;
  private Set<Integer> mMigrationStartAndEndVersions;
  private Set<Integer> mMigrationsNotRequiredFrom;
  private boolean mMultiInstanceInvalidation;
  private final String mName;
  private Executor mQueryExecutor;
  private boolean mRequireMigration;
  private Executor mTransactionExecutor;
  
  public RoomDatabase$Builder(@NonNull Context paramContext, @NonNull Class<T> paramClass, @Nullable String paramString)
  {
    mContext = paramContext;
    mDatabaseClass = paramClass;
    mName = paramString;
    mJournalMode = RoomDatabase.JournalMode.AUTOMATIC;
    mRequireMigration = true;
    mMigrationContainer = new RoomDatabase.MigrationContainer();
  }
  
  @NonNull
  public Builder<T> addCallback(@NonNull RoomDatabase.Callback paramCallback)
  {
    if (mCallbacks == null) {
      mCallbacks = new ArrayList();
    }
    mCallbacks.add(paramCallback);
    return this;
  }
  
  @NonNull
  public Builder<T> addMigrations(@NonNull Migration... paramVarArgs)
  {
    if (mMigrationStartAndEndVersions == null) {
      mMigrationStartAndEndVersions = new HashSet();
    }
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      Migration localMigration = paramVarArgs[j];
      mMigrationStartAndEndVersions.add(Integer.valueOf(startVersion));
      mMigrationStartAndEndVersions.add(Integer.valueOf(endVersion));
    }
    mMigrationContainer.addMigrations(paramVarArgs);
    return this;
  }
  
  @NonNull
  public Builder<T> allowMainThreadQueries()
  {
    mAllowMainThreadQueries = true;
    return this;
  }
  
  @SuppressLint({"RestrictedApi"})
  @NonNull
  public T build()
  {
    if (mContext != null)
    {
      if (mDatabaseClass != null)
      {
        Object localObject1 = mQueryExecutor;
        if ((localObject1 == null) && (mTransactionExecutor == null))
        {
          localObject1 = ArchTaskExecutor.getIOThreadExecutor();
          mTransactionExecutor = ((Executor)localObject1);
          mQueryExecutor = ((Executor)localObject1);
        }
        else if ((localObject1 != null) && (mTransactionExecutor == null))
        {
          mTransactionExecutor = ((Executor)localObject1);
        }
        else if (localObject1 == null)
        {
          localObject1 = mTransactionExecutor;
          if (localObject1 != null) {
            mQueryExecutor = ((Executor)localObject1);
          }
        }
        localObject1 = mMigrationStartAndEndVersions;
        Object localObject2;
        if ((localObject1 != null) && (mMigrationsNotRequiredFrom != null))
        {
          localObject2 = ((Set)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (Integer)((Iterator)localObject2).next();
            if (mMigrationsNotRequiredFrom.contains(localObject1))
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
              ((StringBuilder)localObject2).append(localObject1);
              throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
            }
          }
        }
        if (mFactory == null) {
          mFactory = new FrameworkSQLiteOpenHelperFactory();
        }
        localObject1 = mCopyFromAssetPath;
        if ((localObject1 != null) || (mCopyFromFile != null))
        {
          if (mName != null)
          {
            if ((localObject1 != null) && (mCopyFromFile != null)) {
              throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
            }
            mFactory = new SQLiteCopyOpenHelperFactory((String)localObject1, mCopyFromFile, mFactory);
          }
        }
        else
        {
          localObject1 = mContext;
          localObject1 = new DatabaseConfiguration((Context)localObject1, mName, mFactory, mMigrationContainer, mCallbacks, mAllowMainThreadQueries, mJournalMode.resolve((Context)localObject1), mQueryExecutor, mTransactionExecutor, mMultiInstanceInvalidation, mRequireMigration, mAllowDestructiveMigrationOnDowngrade, mMigrationsNotRequiredFrom, mCopyFromAssetPath, mCopyFromFile);
          localObject2 = (RoomDatabase)Room.getGeneratedImplementation(mDatabaseClass, "_Impl");
          ((RoomDatabase)localObject2).init((DatabaseConfiguration)localObject1);
          return (T)localObject2;
        }
        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
      }
      throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
    }
    throw new IllegalArgumentException("Cannot provide null context for the database.");
  }
  
  @NonNull
  public Builder<T> createFromAsset(@NonNull String paramString)
  {
    mCopyFromAssetPath = paramString;
    return this;
  }
  
  @NonNull
  public Builder<T> createFromFile(@NonNull File paramFile)
  {
    mCopyFromFile = paramFile;
    return this;
  }
  
  @NonNull
  public Builder<T> enableMultiInstanceInvalidation()
  {
    boolean bool;
    if (mName != null) {
      bool = true;
    } else {
      bool = false;
    }
    mMultiInstanceInvalidation = bool;
    return this;
  }
  
  @NonNull
  public Builder<T> fallbackToDestructiveMigration()
  {
    mRequireMigration = false;
    mAllowDestructiveMigrationOnDowngrade = true;
    return this;
  }
  
  @NonNull
  public Builder<T> fallbackToDestructiveMigrationFrom(int... paramVarArgs)
  {
    if (mMigrationsNotRequiredFrom == null) {
      mMigrationsNotRequiredFrom = new HashSet(paramVarArgs.length);
    }
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      int k = paramVarArgs[j];
      mMigrationsNotRequiredFrom.add(Integer.valueOf(k));
    }
    return this;
  }
  
  @NonNull
  public Builder<T> fallbackToDestructiveMigrationOnDowngrade()
  {
    mRequireMigration = true;
    mAllowDestructiveMigrationOnDowngrade = true;
    return this;
  }
  
  @NonNull
  public Builder<T> openHelperFactory(@Nullable SupportSQLiteOpenHelper.Factory paramFactory)
  {
    mFactory = paramFactory;
    return this;
  }
  
  @NonNull
  public Builder<T> setJournalMode(@NonNull RoomDatabase.JournalMode paramJournalMode)
  {
    mJournalMode = paramJournalMode;
    return this;
  }
  
  @NonNull
  public Builder<T> setQueryExecutor(@NonNull Executor paramExecutor)
  {
    mQueryExecutor = paramExecutor;
    return this;
  }
  
  @NonNull
  public Builder<T> setTransactionExecutor(@NonNull Executor paramExecutor)
  {
    mTransactionExecutor = paramExecutor;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomDatabase.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
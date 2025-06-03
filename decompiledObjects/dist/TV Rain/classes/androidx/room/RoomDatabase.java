package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class RoomDatabase
{
  private static final String DB_IMPL_SUFFIX = "_Impl";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final int MAX_BIND_PARAMETER_CNT = 999;
  private boolean mAllowMainThreadQueries;
  private final Map<String, Object> mBackingFieldMap = new ConcurrentHashMap();
  @Deprecated
  @Nullable
  public List<Callback> mCallbacks;
  private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
  @Deprecated
  public volatile SupportSQLiteDatabase mDatabase;
  private final InvalidationTracker mInvalidationTracker = createInvalidationTracker();
  private SupportSQLiteOpenHelper mOpenHelper;
  private Executor mQueryExecutor;
  private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal();
  private Executor mTransactionExecutor;
  public boolean mWriteAheadLoggingEnabled;
  
  private static boolean isMainThread()
  {
    boolean bool;
    if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void assertNotMainThread()
  {
    if (mAllowMainThreadQueries) {
      return;
    }
    if (!isMainThread()) {
      return;
    }
    throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void assertNotSuspendingTransaction()
  {
    if ((!inTransaction()) && (mSuspendingTransactionId.get() != null)) {
      throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }
  }
  
  @Deprecated
  public void beginTransaction()
  {
    assertNotMainThread();
    SupportSQLiteDatabase localSupportSQLiteDatabase = mOpenHelper.getWritableDatabase();
    mInvalidationTracker.syncTriggers(localSupportSQLiteDatabase);
    localSupportSQLiteDatabase.beginTransaction();
  }
  
  @WorkerThread
  public abstract void clearAllTables();
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 147	androidx/room/RoomDatabase:isOpen	()Z
    //   4: ifeq +51 -> 55
    //   7: aload_0
    //   8: getfield 61	androidx/room/RoomDatabase:mCloseLock	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   11: invokevirtual 151	java/util/concurrent/locks/ReentrantReadWriteLock:writeLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
    //   14: astore_1
    //   15: aload_1
    //   16: invokeinterface 156 1 0
    //   21: aload_0
    //   22: getfield 77	androidx/room/RoomDatabase:mInvalidationTracker	Landroidx/room/InvalidationTracker;
    //   25: invokevirtual 159	androidx/room/InvalidationTracker:stopMultiInstanceInvalidation	()V
    //   28: aload_0
    //   29: getfield 124	androidx/room/RoomDatabase:mOpenHelper	Landroidx/sqlite/db/SupportSQLiteOpenHelper;
    //   32: invokeinterface 161 1 0
    //   37: aload_1
    //   38: invokeinterface 164 1 0
    //   43: goto +12 -> 55
    //   46: astore_2
    //   47: aload_1
    //   48: invokeinterface 164 1 0
    //   53: aload_2
    //   54: athrow
    //   55: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	RoomDatabase
    //   14	34	1	localWriteLock	java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock
    //   46	8	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	37	46	finally
  }
  
  public SupportSQLiteStatement compileStatement(@NonNull String paramString)
  {
    assertNotMainThread();
    assertNotSuspendingTransaction();
    return mOpenHelper.getWritableDatabase().compileStatement(paramString);
  }
  
  @NonNull
  public abstract InvalidationTracker createInvalidationTracker();
  
  @NonNull
  public abstract SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration paramDatabaseConfiguration);
  
  @Deprecated
  public void endTransaction()
  {
    mOpenHelper.getWritableDatabase().endTransaction();
    if (!inTransaction()) {
      mInvalidationTracker.refreshVersionsAsync();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Map<String, Object> getBackingFieldMap()
  {
    return mBackingFieldMap;
  }
  
  public Lock getCloseLock()
  {
    return mCloseLock.readLock();
  }
  
  @NonNull
  public InvalidationTracker getInvalidationTracker()
  {
    return mInvalidationTracker;
  }
  
  @NonNull
  public SupportSQLiteOpenHelper getOpenHelper()
  {
    return mOpenHelper;
  }
  
  @NonNull
  public Executor getQueryExecutor()
  {
    return mQueryExecutor;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public ThreadLocal<Integer> getSuspendingTransactionId()
  {
    return mSuspendingTransactionId;
  }
  
  @NonNull
  public Executor getTransactionExecutor()
  {
    return mTransactionExecutor;
  }
  
  public boolean inTransaction()
  {
    return mOpenHelper.getWritableDatabase().inTransaction();
  }
  
  @CallSuper
  public void init(@NonNull DatabaseConfiguration paramDatabaseConfiguration)
  {
    SupportSQLiteOpenHelper localSupportSQLiteOpenHelper = createOpenHelper(paramDatabaseConfiguration);
    mOpenHelper = localSupportSQLiteOpenHelper;
    if ((localSupportSQLiteOpenHelper instanceof SQLiteCopyOpenHelper)) {
      ((SQLiteCopyOpenHelper)localSupportSQLiteOpenHelper).setDatabaseConfiguration(paramDatabaseConfiguration);
    }
    boolean bool;
    if (journalMode == JournalMode.WRITE_AHEAD_LOGGING) {
      bool = true;
    } else {
      bool = false;
    }
    mOpenHelper.setWriteAheadLoggingEnabled(bool);
    mCallbacks = callbacks;
    mQueryExecutor = queryExecutor;
    mTransactionExecutor = new TransactionExecutor(transactionExecutor);
    mAllowMainThreadQueries = allowMainThreadQueries;
    mWriteAheadLoggingEnabled = bool;
    if (multiInstanceInvalidation) {
      mInvalidationTracker.startMultiInstanceInvalidation(context, name);
    }
  }
  
  public void internalInitInvalidationTracker(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    mInvalidationTracker.internalInit(paramSupportSQLiteDatabase);
  }
  
  public boolean isOpen()
  {
    SupportSQLiteDatabase localSupportSQLiteDatabase = mDatabase;
    boolean bool;
    if ((localSupportSQLiteDatabase != null) && (localSupportSQLiteDatabase.isOpen())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NonNull
  public Cursor query(@NonNull SupportSQLiteQuery paramSupportSQLiteQuery)
  {
    return query(paramSupportSQLiteQuery, null);
  }
  
  @NonNull
  public Cursor query(@NonNull SupportSQLiteQuery paramSupportSQLiteQuery, @Nullable CancellationSignal paramCancellationSignal)
  {
    assertNotMainThread();
    assertNotSuspendingTransaction();
    if (paramCancellationSignal != null) {
      return mOpenHelper.getWritableDatabase().query(paramSupportSQLiteQuery, paramCancellationSignal);
    }
    return mOpenHelper.getWritableDatabase().query(paramSupportSQLiteQuery);
  }
  
  @NonNull
  public Cursor query(@NonNull String paramString, @Nullable Object[] paramArrayOfObject)
  {
    return mOpenHelper.getWritableDatabase().query(new SimpleSQLiteQuery(paramString, paramArrayOfObject));
  }
  
  /* Error */
  public <V> V runInTransaction(@NonNull java.util.concurrent.Callable<V> paramCallable)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 290	androidx/room/RoomDatabase:beginTransaction	()V
    //   4: aload_1
    //   5: invokeinterface 295 1 0
    //   10: astore_1
    //   11: aload_0
    //   12: invokevirtual 298	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   15: aload_0
    //   16: invokevirtual 299	androidx/room/RoomDatabase:endTransaction	()V
    //   19: aload_1
    //   20: areturn
    //   21: astore_1
    //   22: goto +17 -> 39
    //   25: astore_1
    //   26: aload_1
    //   27: invokestatic 305	androidx/room/util/SneakyThrow:reThrow	(Ljava/lang/Exception;)V
    //   30: aload_0
    //   31: invokevirtual 299	androidx/room/RoomDatabase:endTransaction	()V
    //   34: aconst_null
    //   35: areturn
    //   36: astore_1
    //   37: aload_1
    //   38: athrow
    //   39: aload_0
    //   40: invokevirtual 299	androidx/room/RoomDatabase:endTransaction	()V
    //   43: aload_1
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	RoomDatabase
    //   0	45	1	paramCallable	java.util.concurrent.Callable<V>
    // Exception table:
    //   from	to	target	type
    //   4	15	21	finally
    //   26	30	21	finally
    //   37	39	21	finally
    //   4	15	25	java/lang/Exception
    //   4	15	36	java/lang/RuntimeException
  }
  
  public void runInTransaction(@NonNull Runnable paramRunnable)
  {
    beginTransaction();
    try
    {
      paramRunnable.run();
      setTransactionSuccessful();
      return;
    }
    finally
    {
      endTransaction();
    }
  }
  
  @Deprecated
  public void setTransactionSuccessful()
  {
    mOpenHelper.getWritableDatabase().setTransactionSuccessful();
  }
  
  public static class Builder<T extends RoomDatabase>
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
    
    public Builder(@NonNull Context paramContext, @NonNull Class<T> paramClass, @Nullable String paramString)
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
  
  public static abstract class Callback
  {
    public void onCreate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onDestructiveMigration(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onOpen(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
  }
  
  public static enum JournalMode
  {
    static
    {
      JournalMode localJournalMode1 = new JournalMode("AUTOMATIC", 0);
      AUTOMATIC = localJournalMode1;
      JournalMode localJournalMode2 = new JournalMode("TRUNCATE", 1);
      TRUNCATE = localJournalMode2;
      JournalMode localJournalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
      WRITE_AHEAD_LOGGING = localJournalMode3;
      $VALUES = new JournalMode[] { localJournalMode1, localJournalMode2, localJournalMode3 };
    }
    
    private JournalMode() {}
    
    private static boolean isLowRamDevice(@NonNull ActivityManager paramActivityManager)
    {
      return paramActivityManager.isLowRamDevice();
    }
    
    @SuppressLint({"NewApi"})
    public JournalMode resolve(Context paramContext)
    {
      if (this != AUTOMATIC) {
        return this;
      }
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      if ((paramContext != null) && (!isLowRamDevice(paramContext))) {
        return WRITE_AHEAD_LOGGING;
      }
      return TRUNCATE;
    }
  }
  
  public static class MigrationContainer
  {
    private HashMap<Integer, TreeMap<Integer, Migration>> mMigrations = new HashMap();
    
    private void addMigration(Migration paramMigration)
    {
      int i = startVersion;
      int j = endVersion;
      Object localObject1 = (TreeMap)mMigrations.get(Integer.valueOf(i));
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new TreeMap();
        mMigrations.put(Integer.valueOf(i), localObject2);
      }
      Migration localMigration = (Migration)((TreeMap)localObject2).get(Integer.valueOf(j));
      if (localMigration != null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Overriding migration ");
        ((StringBuilder)localObject1).append(localMigration);
        ((StringBuilder)localObject1).append(" with ");
        ((StringBuilder)localObject1).append(paramMigration);
        Log.w("ROOM", ((StringBuilder)localObject1).toString());
      }
      ((TreeMap)localObject2).put(Integer.valueOf(j), paramMigration);
    }
    
    private List<Migration> findUpMigrationPath(List<Migration> paramList, boolean paramBoolean, int paramInt1, int paramInt2)
    {
      while (paramBoolean ? paramInt1 < paramInt2 : paramInt1 > paramInt2)
      {
        TreeMap localTreeMap = (TreeMap)mMigrations.get(Integer.valueOf(paramInt1));
        if (localTreeMap == null) {
          return null;
        }
        if (paramBoolean) {
          localObject = localTreeMap.descendingKeySet();
        } else {
          localObject = localTreeMap.keySet();
        }
        Object localObject = ((Set)localObject).iterator();
        int i;
        int k;
        do
        {
          boolean bool = ((Iterator)localObject).hasNext();
          i = 1;
          int j = 0;
          if (!bool) {
            break;
          }
          k = ((Integer)((Iterator)localObject).next()).intValue();
          if (paramBoolean)
          {
            m = j;
            if (k <= paramInt2)
            {
              m = j;
              if (k <= paramInt1) {}
            }
          }
          else
          {
            do
            {
              m = 1;
              break;
              m = j;
              if (k < paramInt2) {
                break;
              }
              m = j;
            } while (k < paramInt1);
          }
        } while (m == 0);
        paramList.add(localTreeMap.get(Integer.valueOf(k)));
        paramInt1 = k;
        int m = i;
        break label197;
        m = 0;
        label197:
        if (m == 0) {
          return null;
        }
      }
      return paramList;
    }
    
    public void addMigrations(@NonNull Migration... paramVarArgs)
    {
      int i = paramVarArgs.length;
      for (int j = 0; j < i; j++) {
        addMigration(paramVarArgs[j]);
      }
    }
    
    @Nullable
    public List<Migration> findMigrationPath(int paramInt1, int paramInt2)
    {
      if (paramInt1 == paramInt2) {
        return Collections.emptyList();
      }
      boolean bool;
      if (paramInt2 > paramInt1) {
        bool = true;
      } else {
        bool = false;
      }
      return findUpMigrationPath(new ArrayList(), bool, paramInt1, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomDatabase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
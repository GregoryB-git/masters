package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class SharedSQLiteStatement
{
  private final RoomDatabase mDatabase;
  private final AtomicBoolean mLock = new AtomicBoolean(false);
  private volatile SupportSQLiteStatement mStmt;
  
  public SharedSQLiteStatement(RoomDatabase paramRoomDatabase)
  {
    mDatabase = paramRoomDatabase;
  }
  
  private SupportSQLiteStatement createNewStatement()
  {
    String str = createQuery();
    return mDatabase.compileStatement(str);
  }
  
  private SupportSQLiteStatement getStmt(boolean paramBoolean)
  {
    SupportSQLiteStatement localSupportSQLiteStatement;
    if (paramBoolean)
    {
      if (mStmt == null) {
        mStmt = createNewStatement();
      }
      localSupportSQLiteStatement = mStmt;
    }
    else
    {
      localSupportSQLiteStatement = createNewStatement();
    }
    return localSupportSQLiteStatement;
  }
  
  public SupportSQLiteStatement acquire()
  {
    assertNotMainThread();
    return getStmt(mLock.compareAndSet(false, true));
  }
  
  public void assertNotMainThread()
  {
    mDatabase.assertNotMainThread();
  }
  
  public abstract String createQuery();
  
  public void release(SupportSQLiteStatement paramSupportSQLiteStatement)
  {
    if (paramSupportSQLiteStatement == mStmt) {
      mLock.set(false);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.SharedSQLiteStatement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
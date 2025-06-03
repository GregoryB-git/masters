package androidx.room;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import java.util.Iterator;
import java.util.List;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class RoomOpenHelper
  extends SupportSQLiteOpenHelper.Callback
{
  @Nullable
  private DatabaseConfiguration mConfiguration;
  @NonNull
  private final Delegate mDelegate;
  @NonNull
  private final String mIdentityHash;
  @NonNull
  private final String mLegacyHash;
  
  public RoomOpenHelper(@NonNull DatabaseConfiguration paramDatabaseConfiguration, @NonNull Delegate paramDelegate, @NonNull String paramString)
  {
    this(paramDatabaseConfiguration, paramDelegate, "", paramString);
  }
  
  public RoomOpenHelper(@NonNull DatabaseConfiguration paramDatabaseConfiguration, @NonNull Delegate paramDelegate, @NonNull String paramString1, @NonNull String paramString2)
  {
    super(version);
    mConfiguration = paramDatabaseConfiguration;
    mDelegate = paramDelegate;
    mIdentityHash = paramString1;
    mLegacyHash = paramString2;
  }
  
  private void checkIdentity(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    if (hasRoomMasterTable(paramSupportSQLiteDatabase))
    {
      localValidationResult = null;
      Cursor localCursor = paramSupportSQLiteDatabase.query(new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
      paramSupportSQLiteDatabase = localValidationResult;
      try
      {
        if (localCursor.moveToFirst()) {
          paramSupportSQLiteDatabase = localCursor.getString(0);
        }
        localCursor.close();
        if ((mIdentityHash.equals(paramSupportSQLiteDatabase)) || (mLegacyHash.equals(paramSupportSQLiteDatabase))) {
          break label123;
        }
        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
      }
      finally
      {
        localCursor.close();
      }
    }
    ValidationResult localValidationResult = mDelegate.onValidateSchema(paramSupportSQLiteDatabase);
    if (isValid)
    {
      mDelegate.onPostMigrate(paramSupportSQLiteDatabase);
      updateIdentity(paramSupportSQLiteDatabase);
      label123:
      return;
    }
    paramSupportSQLiteDatabase = z2.t("Pre-packaged database has an invalid schema: ");
    paramSupportSQLiteDatabase.append(expectedFoundMsg);
    throw new IllegalStateException(paramSupportSQLiteDatabase.toString());
  }
  
  private void createMasterTableIfNotExists(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
  }
  
  private static boolean hasEmptySchema(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
    try
    {
      boolean bool1 = paramSupportSQLiteDatabase.moveToFirst();
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        int i = paramSupportSQLiteDatabase.getInt(0);
        bool3 = bool2;
        if (i == 0) {
          bool3 = true;
        }
      }
      return bool3;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  private static boolean hasRoomMasterTable(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
    try
    {
      boolean bool1 = paramSupportSQLiteDatabase.moveToFirst();
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        int i = paramSupportSQLiteDatabase.getInt(0);
        bool3 = bool2;
        if (i != 0) {
          bool3 = true;
        }
      }
      return bool3;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  private void updateIdentity(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    createMasterTableIfNotExists(paramSupportSQLiteDatabase);
    paramSupportSQLiteDatabase.execSQL(RoomMasterTable.createInsertQuery(mIdentityHash));
  }
  
  public void onConfigure(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    super.onConfigure(paramSupportSQLiteDatabase);
  }
  
  public void onCreate(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    boolean bool = hasEmptySchema(paramSupportSQLiteDatabase);
    mDelegate.createAllTables(paramSupportSQLiteDatabase);
    if (!bool)
    {
      ValidationResult localValidationResult = mDelegate.onValidateSchema(paramSupportSQLiteDatabase);
      if (!isValid)
      {
        paramSupportSQLiteDatabase = z2.t("Pre-packaged database has an invalid schema: ");
        paramSupportSQLiteDatabase.append(expectedFoundMsg);
        throw new IllegalStateException(paramSupportSQLiteDatabase.toString());
      }
    }
    updateIdentity(paramSupportSQLiteDatabase);
    mDelegate.onCreate(paramSupportSQLiteDatabase);
  }
  
  public void onDowngrade(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2)
  {
    onUpgrade(paramSupportSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public void onOpen(SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    super.onOpen(paramSupportSQLiteDatabase);
    checkIdentity(paramSupportSQLiteDatabase);
    mDelegate.onOpen(paramSupportSQLiteDatabase);
    mConfiguration = null;
  }
  
  public void onUpgrade(SupportSQLiteDatabase paramSupportSQLiteDatabase, int paramInt1, int paramInt2)
  {
    Object localObject = mConfiguration;
    if (localObject != null)
    {
      localObject = migrationContainer.findMigrationPath(paramInt1, paramInt2);
      if (localObject != null)
      {
        mDelegate.onPreMigrate(paramSupportSQLiteDatabase);
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          ((Migration)((Iterator)localObject).next()).migrate(paramSupportSQLiteDatabase);
        }
        localObject = mDelegate.onValidateSchema(paramSupportSQLiteDatabase);
        if (isValid)
        {
          mDelegate.onPostMigrate(paramSupportSQLiteDatabase);
          updateIdentity(paramSupportSQLiteDatabase);
          i = 1;
          break label140;
        }
        paramSupportSQLiteDatabase = z2.t("Migration didn't properly handle: ");
        paramSupportSQLiteDatabase.append(expectedFoundMsg);
        throw new IllegalStateException(paramSupportSQLiteDatabase.toString());
      }
    }
    int i = 0;
    label140:
    if (i == 0)
    {
      localObject = mConfiguration;
      if ((localObject != null) && (!((DatabaseConfiguration)localObject).isMigrationRequired(paramInt1, paramInt2)))
      {
        mDelegate.dropAllTables(paramSupportSQLiteDatabase);
        mDelegate.createAllTables(paramSupportSQLiteDatabase);
      }
      else
      {
        paramSupportSQLiteDatabase = new StringBuilder();
        paramSupportSQLiteDatabase.append("A migration from ");
        paramSupportSQLiteDatabase.append(paramInt1);
        paramSupportSQLiteDatabase.append(" to ");
        paramSupportSQLiteDatabase.append(paramInt2);
        paramSupportSQLiteDatabase.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new IllegalStateException(paramSupportSQLiteDatabase.toString());
      }
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static abstract class Delegate
  {
    public final int version;
    
    public Delegate(int paramInt)
    {
      version = paramInt;
    }
    
    public abstract void createAllTables(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    public abstract void dropAllTables(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    public abstract void onCreate(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    public abstract void onOpen(SupportSQLiteDatabase paramSupportSQLiteDatabase);
    
    public void onPostMigrate(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    public void onPreMigrate(SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
    
    @NonNull
    public RoomOpenHelper.ValidationResult onValidateSchema(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
    {
      validateMigration(paramSupportSQLiteDatabase);
      return new RoomOpenHelper.ValidationResult(true, null);
    }
    
    @Deprecated
    public void validateMigration(SupportSQLiteDatabase paramSupportSQLiteDatabase)
    {
      throw new UnsupportedOperationException("validateMigration is deprecated");
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static class ValidationResult
  {
    @Nullable
    public final String expectedFoundMsg;
    public final boolean isValid;
    
    public ValidationResult(boolean paramBoolean, @Nullable String paramString)
    {
      isValid = paramBoolean;
      expectedFoundMsg = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomOpenHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
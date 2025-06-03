package androidx.room;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class RoomOpenHelper$Delegate
{
  public final int version;
  
  public RoomOpenHelper$Delegate(int paramInt)
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

/* Location:
 * Qualified Name:     androidx.room.RoomOpenHelper.Delegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
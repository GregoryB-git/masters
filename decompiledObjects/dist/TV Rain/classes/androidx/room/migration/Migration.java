package androidx.room.migration;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

public abstract class Migration
{
  public final int endVersion;
  public final int startVersion;
  
  public Migration(int paramInt1, int paramInt2)
  {
    startVersion = paramInt1;
    endVersion = paramInt2;
  }
  
  public abstract void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase);
}

/* Location:
 * Qualified Name:     androidx.room.migration.Migration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
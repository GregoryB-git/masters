package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;

class PreferenceDao_Impl$1
  extends EntityInsertionAdapter<Preference>
{
  public PreferenceDao_Impl$1(PreferenceDao_Impl paramPreferenceDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public void bind(SupportSQLiteStatement paramSupportSQLiteStatement, Preference paramPreference)
  {
    String str = mKey;
    if (str == null) {
      paramSupportSQLiteStatement.bindNull(1);
    } else {
      paramSupportSQLiteStatement.bindString(1, str);
    }
    paramPreference = mValue;
    if (paramPreference == null) {
      paramSupportSQLiteStatement.bindNull(2);
    } else {
      paramSupportSQLiteStatement.bindLong(2, paramPreference.longValue());
    }
  }
  
  public String createQuery()
  {
    return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.PreferenceDao_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
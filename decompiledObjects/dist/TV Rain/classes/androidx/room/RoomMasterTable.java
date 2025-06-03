package androidx.room;

import androidx.annotation.RestrictTo;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class RoomMasterTable
{
  private static final String COLUMN_ID = "id";
  private static final String COLUMN_IDENTITY_HASH = "identity_hash";
  public static final String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
  public static final String DEFAULT_ID = "42";
  public static final String NAME = "room_master_table";
  public static final String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";
  public static final String TABLE_NAME = "room_master_table";
  
  public static String createInsertQuery(String paramString)
  {
    return z2.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", paramString, "')");
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomMasterTable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
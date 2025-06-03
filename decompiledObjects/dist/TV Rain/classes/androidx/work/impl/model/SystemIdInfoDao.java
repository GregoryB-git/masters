package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public abstract interface SystemIdInfoDao
{
  @Nullable
  @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
  public abstract SystemIdInfo getSystemIdInfo(@NonNull String paramString);
  
  @NonNull
  @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
  public abstract List<String> getWorkSpecIds();
  
  @Insert(onConflict=1)
  public abstract void insertSystemIdInfo(@NonNull SystemIdInfo paramSystemIdInfo);
  
  @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
  public abstract void removeSystemIdInfo(@NonNull String paramString);
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.SystemIdInfoDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
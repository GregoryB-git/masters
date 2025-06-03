package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public abstract interface WorkNameDao
{
  @NonNull
  @Query("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
  public abstract List<String> getNamesForWorkSpecId(@NonNull String paramString);
  
  @Query("SELECT work_spec_id FROM workname WHERE name=:name")
  public abstract List<String> getWorkSpecIdsWithName(String paramString);
  
  @Insert(onConflict=5)
  public abstract void insert(WorkName paramWorkName);
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkNameDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
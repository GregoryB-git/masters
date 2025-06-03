package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public abstract interface WorkTagDao
{
  @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
  public abstract List<String> getTagsForWorkSpecId(String paramString);
  
  @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
  public abstract List<String> getWorkSpecIdsWithTag(String paramString);
  
  @Insert(onConflict=5)
  public abstract void insert(WorkTag paramWorkTag);
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkTagDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
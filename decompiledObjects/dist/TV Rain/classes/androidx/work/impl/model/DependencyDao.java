package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public abstract interface DependencyDao
{
  @Query("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
  public abstract List<String> getDependentWorkIds(String paramString);
  
  @Query("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
  public abstract List<String> getPrerequisites(String paramString);
  
  @Query("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
  public abstract boolean hasCompletedAllPrerequisites(String paramString);
  
  @Query("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
  public abstract boolean hasDependents(String paramString);
  
  @Insert(onConflict=5)
  public abstract void insertDependency(Dependency paramDependency);
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.DependencyDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
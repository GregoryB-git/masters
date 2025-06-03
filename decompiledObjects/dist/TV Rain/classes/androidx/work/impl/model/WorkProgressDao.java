package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.work.Data;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@Dao
public abstract interface WorkProgressDao
{
  @Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
  public abstract void delete(@NonNull String paramString);
  
  @Query("DELETE FROM WorkProgress")
  public abstract void deleteAll();
  
  @Nullable
  @Query("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
  public abstract Data getProgressForWorkSpecId(@NonNull String paramString);
  
  @NonNull
  @Query("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
  public abstract List<Data> getProgressForWorkSpecIds(@NonNull List<String> paramList);
  
  @Insert(onConflict=1)
  public abstract void insert(@NonNull WorkProgress paramWorkProgress);
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkProgressDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
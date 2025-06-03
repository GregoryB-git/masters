package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import java.util.List;

@SuppressLint({"UnknownNullness"})
@Dao
public abstract interface WorkSpecDao
{
  @Query("DELETE FROM workspec WHERE id=:id")
  public abstract void delete(String paramString);
  
  @Query("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
  public abstract List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int paramInt);
  
  @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
  public abstract List<String> getAllUnfinishedWork();
  
  @Query("SELECT id FROM workspec")
  public abstract List<String> getAllWorkSpecIds();
  
  @Query("SELECT id FROM workspec")
  @Transaction
  public abstract LiveData<List<String>> getAllWorkSpecIdsLiveData();
  
  @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
  public abstract List<WorkSpec> getEligibleWorkForScheduling(int paramInt);
  
  @Query("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
  public abstract List<Data> getInputsFromPrerequisites(String paramString);
  
  @Query("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
  public abstract List<WorkSpec> getRecentlyCompletedWork(long paramLong);
  
  @Query("SELECT * FROM workspec WHERE state=1")
  public abstract List<WorkSpec> getRunningWork();
  
  @Query("SELECT schedule_requested_at FROM workspec WHERE id=:id")
  public abstract LiveData<Long> getScheduleRequestedAtLiveData(@NonNull String paramString);
  
  @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
  public abstract List<WorkSpec> getScheduledWork();
  
  @Query("SELECT state FROM workspec WHERE id=:id")
  public abstract WorkInfo.State getState(String paramString);
  
  @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
  public abstract List<String> getUnfinishedWorkWithName(@NonNull String paramString);
  
  @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
  public abstract List<String> getUnfinishedWorkWithTag(@NonNull String paramString);
  
  @Query("SELECT * FROM workspec WHERE id=:id")
  public abstract WorkSpec getWorkSpec(String paramString);
  
  @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
  public abstract List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String paramString);
  
  @Query("SELECT * FROM workspec WHERE id IN (:ids)")
  public abstract WorkSpec[] getWorkSpecs(List<String> paramList);
  
  @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=:id")
  @Transaction
  public abstract WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String paramString);
  
  @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
  @Transaction
  public abstract List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> paramList);
  
  @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
  @Transaction
  public abstract List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String paramString);
  
  @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
  @Transaction
  public abstract List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String paramString);
  
  @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
  @Transaction
  public abstract LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> paramList);
  
  @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
  @Transaction
  public abstract LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String paramString);
  
  @Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
  @Transaction
  public abstract LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String paramString);
  
  @Query("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
  public abstract boolean hasUnfinishedWork();
  
  @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
  public abstract int incrementWorkSpecRunAttemptCount(String paramString);
  
  @Insert(onConflict=5)
  public abstract void insertWorkSpec(WorkSpec paramWorkSpec);
  
  @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
  public abstract int markWorkSpecScheduled(@NonNull String paramString, long paramLong);
  
  @Query("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
  public abstract void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
  
  @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
  public abstract int resetScheduledState();
  
  @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
  public abstract int resetWorkSpecRunAttemptCount(String paramString);
  
  @Query("UPDATE workspec SET output=:output WHERE id=:id")
  public abstract void setOutput(String paramString, Data paramData);
  
  @Query("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
  public abstract void setPeriodStartTime(String paramString, long paramLong);
  
  @Query("UPDATE workspec SET state=:state WHERE id IN (:ids)")
  public abstract int setState(WorkInfo.State paramState, String... paramVarArgs);
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
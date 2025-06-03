package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;

class WorkSpecDao_Impl$1
  extends EntityInsertionAdapter<WorkSpec>
{
  public WorkSpecDao_Impl$1(WorkSpecDao_Impl paramWorkSpecDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public void bind(SupportSQLiteStatement paramSupportSQLiteStatement, WorkSpec paramWorkSpec)
  {
    Object localObject = id;
    if (localObject == null) {
      paramSupportSQLiteStatement.bindNull(1);
    } else {
      paramSupportSQLiteStatement.bindString(1, (String)localObject);
    }
    paramSupportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(state));
    localObject = workerClassName;
    if (localObject == null) {
      paramSupportSQLiteStatement.bindNull(3);
    } else {
      paramSupportSQLiteStatement.bindString(3, (String)localObject);
    }
    localObject = inputMergerClassName;
    if (localObject == null) {
      paramSupportSQLiteStatement.bindNull(4);
    } else {
      paramSupportSQLiteStatement.bindString(4, (String)localObject);
    }
    localObject = Data.toByteArrayInternal(input);
    if (localObject == null) {
      paramSupportSQLiteStatement.bindNull(5);
    } else {
      paramSupportSQLiteStatement.bindBlob(5, (byte[])localObject);
    }
    localObject = Data.toByteArrayInternal(output);
    if (localObject == null) {
      paramSupportSQLiteStatement.bindNull(6);
    } else {
      paramSupportSQLiteStatement.bindBlob(6, (byte[])localObject);
    }
    paramSupportSQLiteStatement.bindLong(7, initialDelay);
    paramSupportSQLiteStatement.bindLong(8, intervalDuration);
    paramSupportSQLiteStatement.bindLong(9, flexDuration);
    paramSupportSQLiteStatement.bindLong(10, runAttemptCount);
    paramSupportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(backoffPolicy));
    paramSupportSQLiteStatement.bindLong(12, backoffDelayDuration);
    paramSupportSQLiteStatement.bindLong(13, periodStartTime);
    paramSupportSQLiteStatement.bindLong(14, minimumRetentionDuration);
    paramSupportSQLiteStatement.bindLong(15, scheduleRequestedAt);
    paramSupportSQLiteStatement.bindLong(16, expedited);
    paramSupportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(outOfQuotaPolicy));
    paramWorkSpec = constraints;
    if (paramWorkSpec != null)
    {
      paramSupportSQLiteStatement.bindLong(18, WorkTypeConverters.networkTypeToInt(paramWorkSpec.getRequiredNetworkType()));
      paramSupportSQLiteStatement.bindLong(19, paramWorkSpec.requiresCharging());
      paramSupportSQLiteStatement.bindLong(20, paramWorkSpec.requiresDeviceIdle());
      paramSupportSQLiteStatement.bindLong(21, paramWorkSpec.requiresBatteryNotLow());
      paramSupportSQLiteStatement.bindLong(22, paramWorkSpec.requiresStorageNotLow());
      paramSupportSQLiteStatement.bindLong(23, paramWorkSpec.getTriggerContentUpdateDelay());
      paramSupportSQLiteStatement.bindLong(24, paramWorkSpec.getTriggerMaxContentDelay());
      paramWorkSpec = WorkTypeConverters.contentUriTriggersToByteArray(paramWorkSpec.getContentUriTriggers());
      if (paramWorkSpec == null) {
        paramSupportSQLiteStatement.bindNull(25);
      } else {
        paramSupportSQLiteStatement.bindBlob(25, paramWorkSpec);
      }
    }
    else
    {
      paramSupportSQLiteStatement.bindNull(18);
      paramSupportSQLiteStatement.bindNull(19);
      paramSupportSQLiteStatement.bindNull(20);
      paramSupportSQLiteStatement.bindNull(21);
      paramSupportSQLiteStatement.bindNull(22);
      paramSupportSQLiteStatement.bindNull(23);
      paramSupportSQLiteStatement.bindNull(24);
      paramSupportSQLiteStatement.bindNull(25);
    }
  }
  
  public String createQuery()
  {
    return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public final class WorkSpecDao_Impl
  implements WorkSpecDao
{
  private final RoomDatabase __db;
  private final EntityInsertionAdapter<WorkSpec> __insertionAdapterOfWorkSpec;
  private final SharedSQLiteStatement __preparedStmtOfDelete;
  private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
  private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
  private final SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
  private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
  private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
  private final SharedSQLiteStatement __preparedStmtOfSetOutput;
  private final SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;
  
  public WorkSpecDao_Impl(RoomDatabase paramRoomDatabase)
  {
    __db = paramRoomDatabase;
    __insertionAdapterOfWorkSpec = new EntityInsertionAdapter(paramRoomDatabase)
    {
      public void bind(SupportSQLiteStatement paramAnonymousSupportSQLiteStatement, WorkSpec paramAnonymousWorkSpec)
      {
        Object localObject = id;
        if (localObject == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(1);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(1, (String)localObject);
        }
        paramAnonymousSupportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(state));
        localObject = workerClassName;
        if (localObject == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(3);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(3, (String)localObject);
        }
        localObject = inputMergerClassName;
        if (localObject == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(4);
        } else {
          paramAnonymousSupportSQLiteStatement.bindString(4, (String)localObject);
        }
        localObject = Data.toByteArrayInternal(input);
        if (localObject == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(5);
        } else {
          paramAnonymousSupportSQLiteStatement.bindBlob(5, (byte[])localObject);
        }
        localObject = Data.toByteArrayInternal(output);
        if (localObject == null) {
          paramAnonymousSupportSQLiteStatement.bindNull(6);
        } else {
          paramAnonymousSupportSQLiteStatement.bindBlob(6, (byte[])localObject);
        }
        paramAnonymousSupportSQLiteStatement.bindLong(7, initialDelay);
        paramAnonymousSupportSQLiteStatement.bindLong(8, intervalDuration);
        paramAnonymousSupportSQLiteStatement.bindLong(9, flexDuration);
        paramAnonymousSupportSQLiteStatement.bindLong(10, runAttemptCount);
        paramAnonymousSupportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(backoffPolicy));
        paramAnonymousSupportSQLiteStatement.bindLong(12, backoffDelayDuration);
        paramAnonymousSupportSQLiteStatement.bindLong(13, periodStartTime);
        paramAnonymousSupportSQLiteStatement.bindLong(14, minimumRetentionDuration);
        paramAnonymousSupportSQLiteStatement.bindLong(15, scheduleRequestedAt);
        paramAnonymousSupportSQLiteStatement.bindLong(16, expedited);
        paramAnonymousSupportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(outOfQuotaPolicy));
        paramAnonymousWorkSpec = constraints;
        if (paramAnonymousWorkSpec != null)
        {
          paramAnonymousSupportSQLiteStatement.bindLong(18, WorkTypeConverters.networkTypeToInt(paramAnonymousWorkSpec.getRequiredNetworkType()));
          paramAnonymousSupportSQLiteStatement.bindLong(19, paramAnonymousWorkSpec.requiresCharging());
          paramAnonymousSupportSQLiteStatement.bindLong(20, paramAnonymousWorkSpec.requiresDeviceIdle());
          paramAnonymousSupportSQLiteStatement.bindLong(21, paramAnonymousWorkSpec.requiresBatteryNotLow());
          paramAnonymousSupportSQLiteStatement.bindLong(22, paramAnonymousWorkSpec.requiresStorageNotLow());
          paramAnonymousSupportSQLiteStatement.bindLong(23, paramAnonymousWorkSpec.getTriggerContentUpdateDelay());
          paramAnonymousSupportSQLiteStatement.bindLong(24, paramAnonymousWorkSpec.getTriggerMaxContentDelay());
          paramAnonymousWorkSpec = WorkTypeConverters.contentUriTriggersToByteArray(paramAnonymousWorkSpec.getContentUriTriggers());
          if (paramAnonymousWorkSpec == null) {
            paramAnonymousSupportSQLiteStatement.bindNull(25);
          } else {
            paramAnonymousSupportSQLiteStatement.bindBlob(25, paramAnonymousWorkSpec);
          }
        }
        else
        {
          paramAnonymousSupportSQLiteStatement.bindNull(18);
          paramAnonymousSupportSQLiteStatement.bindNull(19);
          paramAnonymousSupportSQLiteStatement.bindNull(20);
          paramAnonymousSupportSQLiteStatement.bindNull(21);
          paramAnonymousSupportSQLiteStatement.bindNull(22);
          paramAnonymousSupportSQLiteStatement.bindNull(23);
          paramAnonymousSupportSQLiteStatement.bindNull(24);
          paramAnonymousSupportSQLiteStatement.bindNull(25);
        }
      }
      
      public String createQuery()
      {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }
    };
    __preparedStmtOfDelete = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "DELETE FROM workspec WHERE id=?";
      }
    };
    __preparedStmtOfSetOutput = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET output=? WHERE id=?";
      }
    };
    __preparedStmtOfSetPeriodStartTime = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET period_start_time=? WHERE id=?";
      }
    };
    __preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
      }
    };
    __preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
      }
    };
    __preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
      }
    };
    __preparedStmtOfResetScheduledState = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
      }
    };
    __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new SharedSQLiteStatement(paramRoomDatabase)
    {
      public String createQuery()
      {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
      }
    };
  }
  
  private void __fetchRelationshipWorkProgressAsandroidxWorkData(ArrayMap<String, ArrayList<Data>> paramArrayMap)
  {
    Object localObject1 = paramArrayMap.keySet();
    if (((Set)localObject1).isEmpty()) {
      return;
    }
    if (paramArrayMap.size() > 999)
    {
      localObject2 = new ArrayMap(999);
      int i = paramArrayMap.size();
      int j = 0;
      k = j;
      while (j < i)
      {
        ((SimpleArrayMap)localObject2).put((String)paramArrayMap.keyAt(j), (ArrayList)paramArrayMap.valueAt(j));
        int m = j + 1;
        int n = k + 1;
        j = m;
        k = n;
        if (n == 999)
        {
          __fetchRelationshipWorkProgressAsandroidxWorkData((ArrayMap)localObject2);
          localObject2 = new ArrayMap(999);
          k = 0;
          j = m;
        }
      }
      if (k > 0) {
        __fetchRelationshipWorkProgressAsandroidxWorkData((ArrayMap)localObject2);
      }
      return;
    }
    Object localObject2 = StringUtil.newStringBuilder();
    ((StringBuilder)localObject2).append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
    int k = ((Set)localObject1).size();
    StringUtil.appendPlaceholders((StringBuilder)localObject2, k);
    ((StringBuilder)localObject2).append(")");
    localObject2 = RoomSQLiteQuery.acquire(((StringBuilder)localObject2).toString(), k + 0);
    Iterator localIterator = ((Set)localObject1).iterator();
    for (k = 1; localIterator.hasNext(); k++)
    {
      localObject1 = (String)localIterator.next();
      if (localObject1 == null) {
        ((RoomSQLiteQuery)localObject2).bindNull(k);
      } else {
        ((RoomSQLiteQuery)localObject2).bindString(k, (String)localObject1);
      }
    }
    localObject2 = DBUtil.query(__db, (SupportSQLiteQuery)localObject2, false, null);
    try
    {
      k = CursorUtil.getColumnIndex((Cursor)localObject2, "work_spec_id");
      if (k == -1) {
        return;
      }
      while (((Cursor)localObject2).moveToNext()) {
        if (!((Cursor)localObject2).isNull(k))
        {
          localObject1 = (ArrayList)paramArrayMap.get(((Cursor)localObject2).getString(k));
          if (localObject1 != null) {
            ((ArrayList)localObject1).add(Data.fromByteArray(((Cursor)localObject2).getBlob(0)));
          }
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject2).close();
    }
  }
  
  private void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap<String, ArrayList<String>> paramArrayMap)
  {
    Object localObject1 = paramArrayMap.keySet();
    if (((Set)localObject1).isEmpty()) {
      return;
    }
    if (paramArrayMap.size() > 999)
    {
      localObject2 = new ArrayMap(999);
      int i = paramArrayMap.size();
      int j = 0;
      k = j;
      while (j < i)
      {
        ((SimpleArrayMap)localObject2).put((String)paramArrayMap.keyAt(j), (ArrayList)paramArrayMap.valueAt(j));
        int m = j + 1;
        int n = k + 1;
        j = m;
        k = n;
        if (n == 999)
        {
          __fetchRelationshipWorkTagAsjavaLangString((ArrayMap)localObject2);
          localObject2 = new ArrayMap(999);
          k = 0;
          j = m;
        }
      }
      if (k > 0) {
        __fetchRelationshipWorkTagAsjavaLangString((ArrayMap)localObject2);
      }
      return;
    }
    Object localObject2 = StringUtil.newStringBuilder();
    ((StringBuilder)localObject2).append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
    int k = ((Set)localObject1).size();
    StringUtil.appendPlaceholders((StringBuilder)localObject2, k);
    ((StringBuilder)localObject2).append(")");
    localObject2 = RoomSQLiteQuery.acquire(((StringBuilder)localObject2).toString(), k + 0);
    Iterator localIterator = ((Set)localObject1).iterator();
    for (k = 1; localIterator.hasNext(); k++)
    {
      localObject1 = (String)localIterator.next();
      if (localObject1 == null) {
        ((RoomSQLiteQuery)localObject2).bindNull(k);
      } else {
        ((RoomSQLiteQuery)localObject2).bindString(k, (String)localObject1);
      }
    }
    localObject2 = DBUtil.query(__db, (SupportSQLiteQuery)localObject2, false, null);
    try
    {
      k = CursorUtil.getColumnIndex((Cursor)localObject2, "work_spec_id");
      if (k == -1) {
        return;
      }
      while (((Cursor)localObject2).moveToNext()) {
        if (!((Cursor)localObject2).isNull(k))
        {
          localObject1 = (ArrayList)paramArrayMap.get(((Cursor)localObject2).getString(k));
          if (localObject1 != null) {
            ((ArrayList)localObject1).add(((Cursor)localObject2).getString(0));
          }
        }
      }
      return;
    }
    finally
    {
      ((Cursor)localObject2).close();
    }
  }
  
  public void delete(String paramString)
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfDelete.acquire();
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindString(1, paramString);
    }
    __db.beginTransaction();
    try
    {
      localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfDelete.release(localSupportSQLiteStatement);
    }
  }
  
  /* Error */
  public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 275
    //   3: iconst_1
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_2
    //   8: aload_2
    //   9: iconst_1
    //   10: iload_1
    //   11: i2l
    //   12: invokevirtual 279	androidx/room/RoomSQLiteQuery:bindLong	(IJ)V
    //   15: aload_0
    //   16: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   19: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   22: aload_0
    //   23: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   26: aload_2
    //   27: iconst_0
    //   28: aconst_null
    //   29: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   32: astore_3
    //   33: aload_3
    //   34: ldc_w 281
    //   37: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   40: istore 4
    //   42: aload_3
    //   43: ldc_w 286
    //   46: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   49: istore 5
    //   51: aload_3
    //   52: ldc_w 288
    //   55: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   58: istore 6
    //   60: aload_3
    //   61: ldc_w 290
    //   64: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 7
    //   69: aload_3
    //   70: ldc_w 292
    //   73: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   76: istore 8
    //   78: aload_3
    //   79: ldc_w 294
    //   82: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 9
    //   87: aload_3
    //   88: ldc_w 296
    //   91: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   94: istore 10
    //   96: aload_3
    //   97: ldc_w 298
    //   100: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   103: istore 11
    //   105: aload_3
    //   106: ldc_w 300
    //   109: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   112: istore 12
    //   114: aload_3
    //   115: ldc_w 302
    //   118: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   121: istore 13
    //   123: aload_3
    //   124: ldc_w 304
    //   127: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   130: istore 14
    //   132: aload_3
    //   133: ldc_w 306
    //   136: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   139: istore 15
    //   141: aload_3
    //   142: ldc_w 308
    //   145: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   148: istore 16
    //   150: aload_3
    //   151: ldc_w 310
    //   154: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 17
    //   159: aload_3
    //   160: ldc_w 312
    //   163: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   166: istore 18
    //   168: aload_3
    //   169: ldc_w 314
    //   172: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   175: istore 19
    //   177: aload_3
    //   178: ldc_w 316
    //   181: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   184: istore 20
    //   186: aload_3
    //   187: ldc_w 318
    //   190: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   193: istore 21
    //   195: aload_3
    //   196: ldc_w 320
    //   199: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   202: istore 22
    //   204: aload_3
    //   205: ldc_w 322
    //   208: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   211: istore 23
    //   213: aload_3
    //   214: ldc_w 324
    //   217: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   220: istore 24
    //   222: aload_3
    //   223: ldc_w 326
    //   226: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   229: istore 25
    //   231: aload_3
    //   232: ldc_w 328
    //   235: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   238: istore 26
    //   240: aload_3
    //   241: ldc_w 330
    //   244: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   247: istore_1
    //   248: aload_3
    //   249: ldc_w 332
    //   252: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   255: istore 27
    //   257: new 119	java/util/ArrayList
    //   260: astore 28
    //   262: aload 28
    //   264: aload_3
    //   265: invokeinterface 335 1 0
    //   270: invokespecial 336	java/util/ArrayList:<init>	(I)V
    //   273: aload_3
    //   274: invokeinterface 198 1 0
    //   279: ifeq +454 -> 733
    //   282: aload_3
    //   283: iload 12
    //   285: invokeinterface 206 2 0
    //   290: astore 29
    //   292: aload_3
    //   293: iload 14
    //   295: invokeinterface 206 2 0
    //   300: astore 30
    //   302: new 338	androidx/work/Constraints
    //   305: astore 31
    //   307: aload 31
    //   309: invokespecial 339	androidx/work/Constraints:<init>	()V
    //   312: aload 31
    //   314: aload_3
    //   315: iload 4
    //   317: invokeinterface 343 2 0
    //   322: invokestatic 349	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   325: invokevirtual 353	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   328: aload_3
    //   329: iload 5
    //   331: invokeinterface 343 2 0
    //   336: ifeq +9 -> 345
    //   339: iconst_1
    //   340: istore 32
    //   342: goto +6 -> 348
    //   345: iconst_0
    //   346: istore 32
    //   348: aload 31
    //   350: iload 32
    //   352: invokevirtual 357	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   355: aload_3
    //   356: iload 6
    //   358: invokeinterface 343 2 0
    //   363: ifeq +9 -> 372
    //   366: iconst_1
    //   367: istore 32
    //   369: goto +6 -> 375
    //   372: iconst_0
    //   373: istore 32
    //   375: aload 31
    //   377: iload 32
    //   379: invokevirtual 360	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   382: aload_3
    //   383: iload 7
    //   385: invokeinterface 343 2 0
    //   390: ifeq +9 -> 399
    //   393: iconst_1
    //   394: istore 32
    //   396: goto +6 -> 402
    //   399: iconst_0
    //   400: istore 32
    //   402: aload 31
    //   404: iload 32
    //   406: invokevirtual 363	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   409: aload_3
    //   410: iload 8
    //   412: invokeinterface 343 2 0
    //   417: ifeq +9 -> 426
    //   420: iconst_1
    //   421: istore 32
    //   423: goto +6 -> 429
    //   426: iconst_0
    //   427: istore 32
    //   429: aload 31
    //   431: iload 32
    //   433: invokevirtual 366	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   436: aload 31
    //   438: aload_3
    //   439: iload 9
    //   441: invokeinterface 370 2 0
    //   446: invokevirtual 374	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   449: aload 31
    //   451: aload_3
    //   452: iload 10
    //   454: invokeinterface 370 2 0
    //   459: invokevirtual 377	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   462: aload 31
    //   464: aload_3
    //   465: iload 11
    //   467: invokeinterface 214 2 0
    //   472: invokestatic 381	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   475: invokevirtual 385	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   478: new 387	androidx/work/impl/model/WorkSpec
    //   481: astore 33
    //   483: aload 33
    //   485: aload 29
    //   487: aload 30
    //   489: invokespecial 390	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   492: aload 33
    //   494: aload_3
    //   495: iload 13
    //   497: invokeinterface 343 2 0
    //   502: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   505: putfield 397	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   508: aload 33
    //   510: aload_3
    //   511: iload 15
    //   513: invokeinterface 206 2 0
    //   518: putfield 401	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   521: aload 33
    //   523: aload_3
    //   524: iload 16
    //   526: invokeinterface 214 2 0
    //   531: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   534: putfield 404	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   537: aload 33
    //   539: aload_3
    //   540: iload 17
    //   542: invokeinterface 214 2 0
    //   547: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   550: putfield 406	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   553: aload 33
    //   555: aload_3
    //   556: iload 18
    //   558: invokeinterface 370 2 0
    //   563: putfield 410	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   566: aload 33
    //   568: aload_3
    //   569: iload 19
    //   571: invokeinterface 370 2 0
    //   576: putfield 413	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   579: aload 33
    //   581: aload_3
    //   582: iload 20
    //   584: invokeinterface 370 2 0
    //   589: putfield 416	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   592: aload 33
    //   594: aload_3
    //   595: iload 21
    //   597: invokeinterface 343 2 0
    //   602: putfield 420	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   605: aload 33
    //   607: aload_3
    //   608: iload 22
    //   610: invokeinterface 343 2 0
    //   615: invokestatic 424	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   618: putfield 428	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   621: aload 33
    //   623: aload_3
    //   624: iload 23
    //   626: invokeinterface 370 2 0
    //   631: putfield 431	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   634: aload 33
    //   636: aload_3
    //   637: iload 24
    //   639: invokeinterface 370 2 0
    //   644: putfield 434	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   647: aload 33
    //   649: aload_3
    //   650: iload 25
    //   652: invokeinterface 370 2 0
    //   657: putfield 437	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   660: aload 33
    //   662: aload_3
    //   663: iload 26
    //   665: invokeinterface 370 2 0
    //   670: putfield 440	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   673: aload_3
    //   674: iload_1
    //   675: invokeinterface 343 2 0
    //   680: ifeq +9 -> 689
    //   683: iconst_1
    //   684: istore 32
    //   686: goto +6 -> 692
    //   689: iconst_0
    //   690: istore 32
    //   692: aload 33
    //   694: iload 32
    //   696: putfield 444	androidx/work/impl/model/WorkSpec:expedited	Z
    //   699: aload 33
    //   701: aload_3
    //   702: iload 27
    //   704: invokeinterface 343 2 0
    //   709: invokestatic 448	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   712: putfield 452	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   715: aload 33
    //   717: aload 31
    //   719: putfield 456	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   722: aload 28
    //   724: aload 33
    //   726: invokevirtual 224	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   729: pop
    //   730: goto -457 -> 273
    //   733: aload_3
    //   734: invokeinterface 195 1 0
    //   739: aload_2
    //   740: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   743: aload 28
    //   745: areturn
    //   746: astore 33
    //   748: goto +5 -> 753
    //   751: astore 33
    //   753: aload_3
    //   754: invokeinterface 195 1 0
    //   759: aload_2
    //   760: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   763: aload 33
    //   765: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	766	0	this	WorkSpecDao_Impl
    //   0	766	1	paramInt	int
    //   7	753	2	localRoomSQLiteQuery	RoomSQLiteQuery
    //   32	722	3	localCursor	Cursor
    //   40	276	4	i	int
    //   49	281	5	j	int
    //   58	299	6	k	int
    //   67	317	7	m	int
    //   76	335	8	n	int
    //   85	355	9	i1	int
    //   94	359	10	i2	int
    //   103	363	11	i3	int
    //   112	172	12	i4	int
    //   121	375	13	i5	int
    //   130	164	14	i6	int
    //   139	373	15	i7	int
    //   148	377	16	i8	int
    //   157	384	17	i9	int
    //   166	391	18	i10	int
    //   175	395	19	i11	int
    //   184	399	20	i12	int
    //   193	403	21	i13	int
    //   202	407	22	i14	int
    //   211	414	23	i15	int
    //   220	418	24	i16	int
    //   229	422	25	i17	int
    //   238	426	26	i18	int
    //   255	448	27	i19	int
    //   260	484	28	localArrayList	ArrayList
    //   290	196	29	str1	String
    //   300	188	30	str2	String
    //   305	413	31	localConstraints	Constraints
    //   340	355	32	bool	boolean
    //   481	244	33	localWorkSpec	WorkSpec
    //   746	1	33	localObject1	Object
    //   751	13	33	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   159	262	746	finally
    //   262	273	746	finally
    //   273	339	746	finally
    //   348	366	746	finally
    //   375	393	746	finally
    //   402	420	746	finally
    //   429	553	746	finally
    //   553	621	746	finally
    //   621	647	746	finally
    //   647	683	746	finally
    //   692	730	746	finally
    //   33	159	751	finally
  }
  
  public List<String> getAllUnfinishedWork()
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
    __db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext()) {
        localArrayList.add(localCursor.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<String> getAllWorkSpecIds()
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
    __db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(localCursor.getCount());
      while (localCursor.moveToNext()) {
        localArrayList.add(localCursor.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public LiveData<List<String>> getAllWorkSpecIdsLiveData()
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
    InvalidationTracker localInvalidationTracker = __db.getInvalidationTracker();
    localObject = new Callable()
    {
      /* Error */
      public List<String> call()
        throws Exception
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   4: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   7: invokevirtual 43	androidx/room/RoomDatabase:beginTransaction	()V
        //   10: aload_0
        //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   14: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   17: aload_0
        //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$10:val$_statement	Landroidx/room/RoomSQLiteQuery;
        //   21: iconst_0
        //   22: aconst_null
        //   23: invokestatic 49	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   26: astore_1
        //   27: new 51	java/util/ArrayList
        //   30: astore_2
        //   31: aload_2
        //   32: aload_1
        //   33: invokeinterface 57 1 0
        //   38: invokespecial 60	java/util/ArrayList:<init>	(I)V
        //   41: aload_1
        //   42: invokeinterface 64 1 0
        //   47: ifeq +18 -> 65
        //   50: aload_2
        //   51: aload_1
        //   52: iconst_0
        //   53: invokeinterface 68 2 0
        //   58: invokevirtual 72	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   61: pop
        //   62: goto -21 -> 41
        //   65: aload_0
        //   66: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   69: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   72: invokevirtual 75	androidx/room/RoomDatabase:setTransactionSuccessful	()V
        //   75: aload_1
        //   76: invokeinterface 78 1 0
        //   81: aload_0
        //   82: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   85: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   88: invokevirtual 81	androidx/room/RoomDatabase:endTransaction	()V
        //   91: aload_2
        //   92: areturn
        //   93: astore_2
        //   94: aload_1
        //   95: invokeinterface 78 1 0
        //   100: aload_2
        //   101: athrow
        //   102: astore_1
        //   103: aload_0
        //   104: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$10:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   107: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   110: invokevirtual 81	androidx/room/RoomDatabase:endTransaction	()V
        //   113: aload_1
        //   114: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	115	0	this	10
        //   26	69	1	localCursor	Cursor
        //   102	12	1	localObject1	Object
        //   30	62	2	localArrayList	ArrayList
        //   93	8	2	localObject2	Object
        // Exception table:
        //   from	to	target	type
        //   27	41	93	finally
        //   41	62	93	finally
        //   65	75	93	finally
        //   10	27	102	finally
        //   75	81	102	finally
        //   94	102	102	finally
      }
      
      public void finalize()
      {
        localObject.release();
      }
    };
    return localInvalidationTracker.createLiveData(new String[] { "workspec" }, true, (Callable)localObject);
  }
  
  /* Error */
  public List<WorkSpec> getEligibleWorkForScheduling(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 488
    //   3: iconst_1
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_2
    //   8: aload_2
    //   9: iconst_1
    //   10: iload_1
    //   11: i2l
    //   12: invokevirtual 279	androidx/room/RoomSQLiteQuery:bindLong	(IJ)V
    //   15: aload_0
    //   16: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   19: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   22: aload_0
    //   23: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   26: aload_2
    //   27: iconst_0
    //   28: aconst_null
    //   29: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   32: astore_3
    //   33: aload_3
    //   34: ldc_w 281
    //   37: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   40: istore 4
    //   42: aload_3
    //   43: ldc_w 286
    //   46: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   49: istore 5
    //   51: aload_3
    //   52: ldc_w 288
    //   55: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   58: istore 6
    //   60: aload_3
    //   61: ldc_w 290
    //   64: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 7
    //   69: aload_3
    //   70: ldc_w 292
    //   73: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   76: istore 8
    //   78: aload_3
    //   79: ldc_w 294
    //   82: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 9
    //   87: aload_3
    //   88: ldc_w 296
    //   91: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   94: istore 10
    //   96: aload_3
    //   97: ldc_w 298
    //   100: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   103: istore 11
    //   105: aload_3
    //   106: ldc_w 300
    //   109: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   112: istore 12
    //   114: aload_3
    //   115: ldc_w 302
    //   118: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   121: istore 13
    //   123: aload_3
    //   124: ldc_w 304
    //   127: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   130: istore 14
    //   132: aload_3
    //   133: ldc_w 306
    //   136: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   139: istore 15
    //   141: aload_3
    //   142: ldc_w 308
    //   145: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   148: istore 16
    //   150: aload_3
    //   151: ldc_w 310
    //   154: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   157: istore 17
    //   159: aload_3
    //   160: ldc_w 312
    //   163: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   166: istore 18
    //   168: aload_3
    //   169: ldc_w 314
    //   172: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   175: istore 19
    //   177: aload_3
    //   178: ldc_w 316
    //   181: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   184: istore 20
    //   186: aload_3
    //   187: ldc_w 318
    //   190: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   193: istore 21
    //   195: aload_3
    //   196: ldc_w 320
    //   199: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   202: istore 22
    //   204: aload_3
    //   205: ldc_w 322
    //   208: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   211: istore 23
    //   213: aload_3
    //   214: ldc_w 324
    //   217: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   220: istore 24
    //   222: aload_3
    //   223: ldc_w 326
    //   226: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   229: istore 25
    //   231: aload_3
    //   232: ldc_w 328
    //   235: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   238: istore 26
    //   240: aload_3
    //   241: ldc_w 330
    //   244: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   247: istore_1
    //   248: aload_3
    //   249: ldc_w 332
    //   252: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   255: istore 27
    //   257: new 119	java/util/ArrayList
    //   260: astore 28
    //   262: aload 28
    //   264: aload_3
    //   265: invokeinterface 335 1 0
    //   270: invokespecial 336	java/util/ArrayList:<init>	(I)V
    //   273: aload_3
    //   274: invokeinterface 198 1 0
    //   279: ifeq +454 -> 733
    //   282: aload_3
    //   283: iload 12
    //   285: invokeinterface 206 2 0
    //   290: astore 29
    //   292: aload_3
    //   293: iload 14
    //   295: invokeinterface 206 2 0
    //   300: astore 30
    //   302: new 338	androidx/work/Constraints
    //   305: astore 31
    //   307: aload 31
    //   309: invokespecial 339	androidx/work/Constraints:<init>	()V
    //   312: aload 31
    //   314: aload_3
    //   315: iload 4
    //   317: invokeinterface 343 2 0
    //   322: invokestatic 349	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   325: invokevirtual 353	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   328: aload_3
    //   329: iload 5
    //   331: invokeinterface 343 2 0
    //   336: ifeq +9 -> 345
    //   339: iconst_1
    //   340: istore 32
    //   342: goto +6 -> 348
    //   345: iconst_0
    //   346: istore 32
    //   348: aload 31
    //   350: iload 32
    //   352: invokevirtual 357	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   355: aload_3
    //   356: iload 6
    //   358: invokeinterface 343 2 0
    //   363: ifeq +9 -> 372
    //   366: iconst_1
    //   367: istore 32
    //   369: goto +6 -> 375
    //   372: iconst_0
    //   373: istore 32
    //   375: aload 31
    //   377: iload 32
    //   379: invokevirtual 360	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   382: aload_3
    //   383: iload 7
    //   385: invokeinterface 343 2 0
    //   390: ifeq +9 -> 399
    //   393: iconst_1
    //   394: istore 32
    //   396: goto +6 -> 402
    //   399: iconst_0
    //   400: istore 32
    //   402: aload 31
    //   404: iload 32
    //   406: invokevirtual 363	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   409: aload_3
    //   410: iload 8
    //   412: invokeinterface 343 2 0
    //   417: ifeq +9 -> 426
    //   420: iconst_1
    //   421: istore 32
    //   423: goto +6 -> 429
    //   426: iconst_0
    //   427: istore 32
    //   429: aload 31
    //   431: iload 32
    //   433: invokevirtual 366	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   436: aload 31
    //   438: aload_3
    //   439: iload 9
    //   441: invokeinterface 370 2 0
    //   446: invokevirtual 374	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   449: aload 31
    //   451: aload_3
    //   452: iload 10
    //   454: invokeinterface 370 2 0
    //   459: invokevirtual 377	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   462: aload 31
    //   464: aload_3
    //   465: iload 11
    //   467: invokeinterface 214 2 0
    //   472: invokestatic 381	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   475: invokevirtual 385	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   478: new 387	androidx/work/impl/model/WorkSpec
    //   481: astore 33
    //   483: aload 33
    //   485: aload 29
    //   487: aload 30
    //   489: invokespecial 390	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   492: aload 33
    //   494: aload_3
    //   495: iload 13
    //   497: invokeinterface 343 2 0
    //   502: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   505: putfield 397	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   508: aload 33
    //   510: aload_3
    //   511: iload 15
    //   513: invokeinterface 206 2 0
    //   518: putfield 401	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   521: aload 33
    //   523: aload_3
    //   524: iload 16
    //   526: invokeinterface 214 2 0
    //   531: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   534: putfield 404	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   537: aload 33
    //   539: aload_3
    //   540: iload 17
    //   542: invokeinterface 214 2 0
    //   547: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   550: putfield 406	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   553: aload 33
    //   555: aload_3
    //   556: iload 18
    //   558: invokeinterface 370 2 0
    //   563: putfield 410	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   566: aload 33
    //   568: aload_3
    //   569: iload 19
    //   571: invokeinterface 370 2 0
    //   576: putfield 413	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   579: aload 33
    //   581: aload_3
    //   582: iload 20
    //   584: invokeinterface 370 2 0
    //   589: putfield 416	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   592: aload 33
    //   594: aload_3
    //   595: iload 21
    //   597: invokeinterface 343 2 0
    //   602: putfield 420	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   605: aload 33
    //   607: aload_3
    //   608: iload 22
    //   610: invokeinterface 343 2 0
    //   615: invokestatic 424	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   618: putfield 428	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   621: aload 33
    //   623: aload_3
    //   624: iload 23
    //   626: invokeinterface 370 2 0
    //   631: putfield 431	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   634: aload 33
    //   636: aload_3
    //   637: iload 24
    //   639: invokeinterface 370 2 0
    //   644: putfield 434	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   647: aload 33
    //   649: aload_3
    //   650: iload 25
    //   652: invokeinterface 370 2 0
    //   657: putfield 437	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   660: aload 33
    //   662: aload_3
    //   663: iload 26
    //   665: invokeinterface 370 2 0
    //   670: putfield 440	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   673: aload_3
    //   674: iload_1
    //   675: invokeinterface 343 2 0
    //   680: ifeq +9 -> 689
    //   683: iconst_1
    //   684: istore 32
    //   686: goto +6 -> 692
    //   689: iconst_0
    //   690: istore 32
    //   692: aload 33
    //   694: iload 32
    //   696: putfield 444	androidx/work/impl/model/WorkSpec:expedited	Z
    //   699: aload 33
    //   701: aload_3
    //   702: iload 27
    //   704: invokeinterface 343 2 0
    //   709: invokestatic 448	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   712: putfield 452	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   715: aload 33
    //   717: aload 31
    //   719: putfield 456	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   722: aload 28
    //   724: aload 33
    //   726: invokevirtual 224	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   729: pop
    //   730: goto -457 -> 273
    //   733: aload_3
    //   734: invokeinterface 195 1 0
    //   739: aload_2
    //   740: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   743: aload 28
    //   745: areturn
    //   746: astore 29
    //   748: goto +5 -> 753
    //   751: astore 29
    //   753: aload_3
    //   754: invokeinterface 195 1 0
    //   759: aload_2
    //   760: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   763: aload 29
    //   765: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	766	0	this	WorkSpecDao_Impl
    //   0	766	1	paramInt	int
    //   7	753	2	localRoomSQLiteQuery	RoomSQLiteQuery
    //   32	722	3	localCursor	Cursor
    //   40	276	4	i	int
    //   49	281	5	j	int
    //   58	299	6	k	int
    //   67	317	7	m	int
    //   76	335	8	n	int
    //   85	355	9	i1	int
    //   94	359	10	i2	int
    //   103	363	11	i3	int
    //   112	172	12	i4	int
    //   121	375	13	i5	int
    //   130	164	14	i6	int
    //   139	373	15	i7	int
    //   148	377	16	i8	int
    //   157	384	17	i9	int
    //   166	391	18	i10	int
    //   175	395	19	i11	int
    //   184	399	20	i12	int
    //   193	403	21	i13	int
    //   202	407	22	i14	int
    //   211	414	23	i15	int
    //   220	418	24	i16	int
    //   229	422	25	i17	int
    //   238	426	26	i18	int
    //   255	448	27	i19	int
    //   260	484	28	localArrayList	ArrayList
    //   290	196	29	str1	String
    //   746	1	29	localObject1	Object
    //   751	13	29	localObject2	Object
    //   300	188	30	str2	String
    //   305	413	31	localConstraints	Constraints
    //   340	355	32	bool	boolean
    //   481	244	33	localWorkSpec	WorkSpec
    // Exception table:
    //   from	to	target	type
    //   159	262	746	finally
    //   262	273	746	finally
    //   273	339	746	finally
    //   348	366	746	finally
    //   375	393	746	finally
    //   402	420	746	finally
    //   429	553	746	finally
    //   553	621	746	finally
    //   621	647	746	finally
    //   647	683	746	finally
    //   692	730	746	finally
    //   33	159	751	finally
  }
  
  public List<Data> getInputsFromPrerequisites(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(Data.fromByteArray(paramString.getBlob(0)));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  /* Error */
  public List<WorkSpec> getRecentlyCompletedWork(long paramLong)
  {
    // Byte code:
    //   0: ldc_w 497
    //   3: iconst_1
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_3
    //   8: aload_3
    //   9: iconst_1
    //   10: lload_1
    //   11: invokevirtual 279	androidx/room/RoomSQLiteQuery:bindLong	(IJ)V
    //   14: aload_0
    //   15: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   18: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   21: aload_0
    //   22: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   25: aload_3
    //   26: iconst_0
    //   27: aconst_null
    //   28: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   31: astore 4
    //   33: aload 4
    //   35: ldc_w 281
    //   38: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   41: istore 5
    //   43: aload 4
    //   45: ldc_w 286
    //   48: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   51: istore 6
    //   53: aload 4
    //   55: ldc_w 288
    //   58: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   61: istore 7
    //   63: aload 4
    //   65: ldc_w 290
    //   68: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   71: istore 8
    //   73: aload 4
    //   75: ldc_w 292
    //   78: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   81: istore 9
    //   83: aload 4
    //   85: ldc_w 294
    //   88: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   91: istore 10
    //   93: aload 4
    //   95: ldc_w 296
    //   98: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   101: istore 11
    //   103: aload 4
    //   105: ldc_w 298
    //   108: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   111: istore 12
    //   113: aload 4
    //   115: ldc_w 300
    //   118: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   121: istore 13
    //   123: aload 4
    //   125: ldc_w 302
    //   128: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   131: istore 14
    //   133: aload 4
    //   135: ldc_w 304
    //   138: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   141: istore 15
    //   143: aload 4
    //   145: ldc_w 306
    //   148: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   151: istore 16
    //   153: aload 4
    //   155: ldc_w 308
    //   158: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   161: istore 17
    //   163: aload 4
    //   165: ldc_w 310
    //   168: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   171: istore 18
    //   173: aload 4
    //   175: ldc_w 312
    //   178: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   181: istore 19
    //   183: aload 4
    //   185: ldc_w 314
    //   188: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   191: istore 20
    //   193: aload 4
    //   195: ldc_w 316
    //   198: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   201: istore 21
    //   203: aload 4
    //   205: ldc_w 318
    //   208: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   211: istore 22
    //   213: aload 4
    //   215: ldc_w 320
    //   218: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   221: istore 23
    //   223: aload 4
    //   225: ldc_w 322
    //   228: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   231: istore 24
    //   233: aload 4
    //   235: ldc_w 324
    //   238: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   241: istore 25
    //   243: aload 4
    //   245: ldc_w 326
    //   248: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   251: istore 26
    //   253: aload 4
    //   255: ldc_w 328
    //   258: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   261: istore 27
    //   263: aload 4
    //   265: ldc_w 330
    //   268: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   271: istore 28
    //   273: aload 4
    //   275: ldc_w 332
    //   278: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   281: istore 29
    //   283: new 119	java/util/ArrayList
    //   286: astore 30
    //   288: aload 30
    //   290: aload 4
    //   292: invokeinterface 335 1 0
    //   297: invokespecial 336	java/util/ArrayList:<init>	(I)V
    //   300: aload 4
    //   302: invokeinterface 198 1 0
    //   307: ifeq +480 -> 787
    //   310: aload 4
    //   312: iload 13
    //   314: invokeinterface 206 2 0
    //   319: astore 31
    //   321: aload 4
    //   323: iload 15
    //   325: invokeinterface 206 2 0
    //   330: astore 32
    //   332: new 338	androidx/work/Constraints
    //   335: astore 33
    //   337: aload 33
    //   339: invokespecial 339	androidx/work/Constraints:<init>	()V
    //   342: aload 33
    //   344: aload 4
    //   346: iload 5
    //   348: invokeinterface 343 2 0
    //   353: invokestatic 349	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   356: invokevirtual 353	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   359: aload 4
    //   361: iload 6
    //   363: invokeinterface 343 2 0
    //   368: ifeq +9 -> 377
    //   371: iconst_1
    //   372: istore 34
    //   374: goto +6 -> 380
    //   377: iconst_0
    //   378: istore 34
    //   380: aload 33
    //   382: iload 34
    //   384: invokevirtual 357	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   387: aload 4
    //   389: iload 7
    //   391: invokeinterface 343 2 0
    //   396: ifeq +9 -> 405
    //   399: iconst_1
    //   400: istore 34
    //   402: goto +6 -> 408
    //   405: iconst_0
    //   406: istore 34
    //   408: aload 33
    //   410: iload 34
    //   412: invokevirtual 360	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   415: aload 4
    //   417: iload 8
    //   419: invokeinterface 343 2 0
    //   424: ifeq +9 -> 433
    //   427: iconst_1
    //   428: istore 34
    //   430: goto +6 -> 436
    //   433: iconst_0
    //   434: istore 34
    //   436: aload 33
    //   438: iload 34
    //   440: invokevirtual 363	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   443: aload 4
    //   445: iload 9
    //   447: invokeinterface 343 2 0
    //   452: ifeq +9 -> 461
    //   455: iconst_1
    //   456: istore 34
    //   458: goto +6 -> 464
    //   461: iconst_0
    //   462: istore 34
    //   464: aload 33
    //   466: iload 34
    //   468: invokevirtual 366	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   471: aload 33
    //   473: aload 4
    //   475: iload 10
    //   477: invokeinterface 370 2 0
    //   482: invokevirtual 374	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   485: aload 33
    //   487: aload 4
    //   489: iload 11
    //   491: invokeinterface 370 2 0
    //   496: invokevirtual 377	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   499: aload 33
    //   501: aload 4
    //   503: iload 12
    //   505: invokeinterface 214 2 0
    //   510: invokestatic 381	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   513: invokevirtual 385	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   516: new 387	androidx/work/impl/model/WorkSpec
    //   519: astore 35
    //   521: aload 35
    //   523: aload 31
    //   525: aload 32
    //   527: invokespecial 390	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   530: aload 35
    //   532: aload 4
    //   534: iload 14
    //   536: invokeinterface 343 2 0
    //   541: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   544: putfield 397	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   547: aload 35
    //   549: aload 4
    //   551: iload 16
    //   553: invokeinterface 206 2 0
    //   558: putfield 401	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   561: aload 35
    //   563: aload 4
    //   565: iload 17
    //   567: invokeinterface 214 2 0
    //   572: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   575: putfield 404	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   578: aload 35
    //   580: aload 4
    //   582: iload 18
    //   584: invokeinterface 214 2 0
    //   589: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   592: putfield 406	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   595: aload 35
    //   597: aload 4
    //   599: iload 19
    //   601: invokeinterface 370 2 0
    //   606: putfield 410	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   609: aload 35
    //   611: aload 4
    //   613: iload 20
    //   615: invokeinterface 370 2 0
    //   620: putfield 413	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   623: aload 35
    //   625: aload 4
    //   627: iload 21
    //   629: invokeinterface 370 2 0
    //   634: putfield 416	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   637: aload 35
    //   639: aload 4
    //   641: iload 22
    //   643: invokeinterface 343 2 0
    //   648: putfield 420	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   651: aload 35
    //   653: aload 4
    //   655: iload 23
    //   657: invokeinterface 343 2 0
    //   662: invokestatic 424	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   665: putfield 428	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   668: aload 35
    //   670: aload 4
    //   672: iload 24
    //   674: invokeinterface 370 2 0
    //   679: putfield 431	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   682: aload 35
    //   684: aload 4
    //   686: iload 25
    //   688: invokeinterface 370 2 0
    //   693: putfield 434	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   696: aload 35
    //   698: aload 4
    //   700: iload 26
    //   702: invokeinterface 370 2 0
    //   707: putfield 437	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   710: aload 35
    //   712: aload 4
    //   714: iload 27
    //   716: invokeinterface 370 2 0
    //   721: putfield 440	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   724: aload 4
    //   726: iload 28
    //   728: invokeinterface 343 2 0
    //   733: ifeq +9 -> 742
    //   736: iconst_1
    //   737: istore 34
    //   739: goto +6 -> 745
    //   742: iconst_0
    //   743: istore 34
    //   745: aload 35
    //   747: iload 34
    //   749: putfield 444	androidx/work/impl/model/WorkSpec:expedited	Z
    //   752: aload 35
    //   754: aload 4
    //   756: iload 29
    //   758: invokeinterface 343 2 0
    //   763: invokestatic 448	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   766: putfield 452	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   769: aload 35
    //   771: aload 33
    //   773: putfield 456	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   776: aload 30
    //   778: aload 35
    //   780: invokevirtual 224	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   783: pop
    //   784: goto -484 -> 300
    //   787: aload 4
    //   789: invokeinterface 195 1 0
    //   794: aload_3
    //   795: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   798: aload 30
    //   800: areturn
    //   801: astore 30
    //   803: goto +5 -> 808
    //   806: astore 30
    //   808: aload 4
    //   810: invokeinterface 195 1 0
    //   815: aload_3
    //   816: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   819: aload 30
    //   821: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	822	0	this	WorkSpecDao_Impl
    //   0	822	1	paramLong	long
    //   7	809	3	localRoomSQLiteQuery	RoomSQLiteQuery
    //   31	778	4	localCursor	Cursor
    //   41	306	5	i	int
    //   51	311	6	j	int
    //   61	329	7	k	int
    //   71	347	8	m	int
    //   81	365	9	n	int
    //   91	385	10	i1	int
    //   101	389	11	i2	int
    //   111	393	12	i3	int
    //   121	192	13	i4	int
    //   131	404	14	i5	int
    //   141	183	15	i6	int
    //   151	401	16	i7	int
    //   161	405	17	i8	int
    //   171	412	18	i9	int
    //   181	419	19	i10	int
    //   191	423	20	i11	int
    //   201	427	21	i12	int
    //   211	431	22	i13	int
    //   221	435	23	i14	int
    //   231	442	24	i15	int
    //   241	446	25	i16	int
    //   251	450	26	i17	int
    //   261	454	27	i18	int
    //   271	456	28	i19	int
    //   281	476	29	i20	int
    //   286	513	30	localArrayList	ArrayList
    //   801	1	30	localObject1	Object
    //   806	14	30	localObject2	Object
    //   319	205	31	str1	String
    //   330	196	32	str2	String
    //   335	437	33	localConstraints	Constraints
    //   372	376	34	bool	boolean
    //   519	260	35	localWorkSpec	WorkSpec
    // Exception table:
    //   from	to	target	type
    //   173	288	801	finally
    //   288	300	801	finally
    //   300	371	801	finally
    //   380	399	801	finally
    //   408	427	801	finally
    //   436	455	801	finally
    //   464	595	801	finally
    //   595	668	801	finally
    //   668	696	801	finally
    //   696	736	801	finally
    //   745	784	801	finally
    //   33	173	806	finally
  }
  
  /* Error */
  public List<WorkSpec> getRunningWork()
  {
    // Byte code:
    //   0: ldc_w 501
    //   3: iconst_0
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   12: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   15: aload_0
    //   16: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   19: aload_1
    //   20: iconst_0
    //   21: aconst_null
    //   22: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   25: astore_2
    //   26: aload_2
    //   27: ldc_w 281
    //   30: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   33: istore_3
    //   34: aload_2
    //   35: ldc_w 286
    //   38: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   41: istore 4
    //   43: aload_2
    //   44: ldc_w 288
    //   47: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   50: istore 5
    //   52: aload_2
    //   53: ldc_w 290
    //   56: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   59: istore 6
    //   61: aload_2
    //   62: ldc_w 292
    //   65: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   68: istore 7
    //   70: aload_2
    //   71: ldc_w 294
    //   74: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   77: istore 8
    //   79: aload_2
    //   80: ldc_w 296
    //   83: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   86: istore 9
    //   88: aload_2
    //   89: ldc_w 298
    //   92: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   95: istore 10
    //   97: aload_2
    //   98: ldc_w 300
    //   101: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   104: istore 11
    //   106: aload_2
    //   107: ldc_w 302
    //   110: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   113: istore 12
    //   115: aload_2
    //   116: ldc_w 304
    //   119: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   122: istore 13
    //   124: aload_2
    //   125: ldc_w 306
    //   128: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   131: istore 14
    //   133: aload_2
    //   134: ldc_w 308
    //   137: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   140: istore 15
    //   142: aload_2
    //   143: ldc_w 310
    //   146: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   149: istore 16
    //   151: aload_2
    //   152: ldc_w 312
    //   155: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   158: istore 17
    //   160: aload_2
    //   161: ldc_w 314
    //   164: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   167: istore 18
    //   169: aload_2
    //   170: ldc_w 316
    //   173: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   176: istore 19
    //   178: aload_2
    //   179: ldc_w 318
    //   182: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   185: istore 20
    //   187: aload_2
    //   188: ldc_w 320
    //   191: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   194: istore 21
    //   196: aload_2
    //   197: ldc_w 322
    //   200: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   203: istore 22
    //   205: aload_2
    //   206: ldc_w 324
    //   209: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   212: istore 23
    //   214: aload_2
    //   215: ldc_w 326
    //   218: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   221: istore 24
    //   223: aload_2
    //   224: ldc_w 328
    //   227: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   230: istore 25
    //   232: aload_2
    //   233: ldc_w 330
    //   236: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   239: istore 26
    //   241: aload_2
    //   242: ldc_w 332
    //   245: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   248: istore 27
    //   250: new 119	java/util/ArrayList
    //   253: astore 28
    //   255: aload 28
    //   257: aload_2
    //   258: invokeinterface 335 1 0
    //   263: invokespecial 336	java/util/ArrayList:<init>	(I)V
    //   266: aload_2
    //   267: invokeinterface 198 1 0
    //   272: ifeq +454 -> 726
    //   275: aload_2
    //   276: iload 11
    //   278: invokeinterface 206 2 0
    //   283: astore 29
    //   285: aload_2
    //   286: iload 13
    //   288: invokeinterface 206 2 0
    //   293: astore 30
    //   295: new 338	androidx/work/Constraints
    //   298: astore 31
    //   300: aload 31
    //   302: invokespecial 339	androidx/work/Constraints:<init>	()V
    //   305: aload 31
    //   307: aload_2
    //   308: iload_3
    //   309: invokeinterface 343 2 0
    //   314: invokestatic 349	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   317: invokevirtual 353	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   320: aload_2
    //   321: iload 4
    //   323: invokeinterface 343 2 0
    //   328: ifeq +9 -> 337
    //   331: iconst_1
    //   332: istore 32
    //   334: goto +6 -> 340
    //   337: iconst_0
    //   338: istore 32
    //   340: aload 31
    //   342: iload 32
    //   344: invokevirtual 357	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   347: aload_2
    //   348: iload 5
    //   350: invokeinterface 343 2 0
    //   355: ifeq +9 -> 364
    //   358: iconst_1
    //   359: istore 32
    //   361: goto +6 -> 367
    //   364: iconst_0
    //   365: istore 32
    //   367: aload 31
    //   369: iload 32
    //   371: invokevirtual 360	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   374: aload_2
    //   375: iload 6
    //   377: invokeinterface 343 2 0
    //   382: ifeq +9 -> 391
    //   385: iconst_1
    //   386: istore 32
    //   388: goto +6 -> 394
    //   391: iconst_0
    //   392: istore 32
    //   394: aload 31
    //   396: iload 32
    //   398: invokevirtual 363	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   401: aload_2
    //   402: iload 7
    //   404: invokeinterface 343 2 0
    //   409: ifeq +9 -> 418
    //   412: iconst_1
    //   413: istore 32
    //   415: goto +6 -> 421
    //   418: iconst_0
    //   419: istore 32
    //   421: aload 31
    //   423: iload 32
    //   425: invokevirtual 366	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   428: aload 31
    //   430: aload_2
    //   431: iload 8
    //   433: invokeinterface 370 2 0
    //   438: invokevirtual 374	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   441: aload 31
    //   443: aload_2
    //   444: iload 9
    //   446: invokeinterface 370 2 0
    //   451: invokevirtual 377	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   454: aload 31
    //   456: aload_2
    //   457: iload 10
    //   459: invokeinterface 214 2 0
    //   464: invokestatic 381	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   467: invokevirtual 385	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   470: new 387	androidx/work/impl/model/WorkSpec
    //   473: astore 33
    //   475: aload 33
    //   477: aload 29
    //   479: aload 30
    //   481: invokespecial 390	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   484: aload 33
    //   486: aload_2
    //   487: iload 12
    //   489: invokeinterface 343 2 0
    //   494: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   497: putfield 397	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   500: aload 33
    //   502: aload_2
    //   503: iload 14
    //   505: invokeinterface 206 2 0
    //   510: putfield 401	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   513: aload 33
    //   515: aload_2
    //   516: iload 15
    //   518: invokeinterface 214 2 0
    //   523: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   526: putfield 404	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   529: aload 33
    //   531: aload_2
    //   532: iload 16
    //   534: invokeinterface 214 2 0
    //   539: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   542: putfield 406	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   545: aload 33
    //   547: aload_2
    //   548: iload 17
    //   550: invokeinterface 370 2 0
    //   555: putfield 410	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   558: aload 33
    //   560: aload_2
    //   561: iload 18
    //   563: invokeinterface 370 2 0
    //   568: putfield 413	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   571: aload 33
    //   573: aload_2
    //   574: iload 19
    //   576: invokeinterface 370 2 0
    //   581: putfield 416	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   584: aload 33
    //   586: aload_2
    //   587: iload 20
    //   589: invokeinterface 343 2 0
    //   594: putfield 420	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   597: aload 33
    //   599: aload_2
    //   600: iload 21
    //   602: invokeinterface 343 2 0
    //   607: invokestatic 424	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   610: putfield 428	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   613: aload 33
    //   615: aload_2
    //   616: iload 22
    //   618: invokeinterface 370 2 0
    //   623: putfield 431	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   626: aload 33
    //   628: aload_2
    //   629: iload 23
    //   631: invokeinterface 370 2 0
    //   636: putfield 434	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   639: aload 33
    //   641: aload_2
    //   642: iload 24
    //   644: invokeinterface 370 2 0
    //   649: putfield 437	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   652: aload 33
    //   654: aload_2
    //   655: iload 25
    //   657: invokeinterface 370 2 0
    //   662: putfield 440	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   665: aload_2
    //   666: iload 26
    //   668: invokeinterface 343 2 0
    //   673: ifeq +9 -> 682
    //   676: iconst_1
    //   677: istore 32
    //   679: goto +6 -> 685
    //   682: iconst_0
    //   683: istore 32
    //   685: aload 33
    //   687: iload 32
    //   689: putfield 444	androidx/work/impl/model/WorkSpec:expedited	Z
    //   692: aload 33
    //   694: aload_2
    //   695: iload 27
    //   697: invokeinterface 343 2 0
    //   702: invokestatic 448	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   705: putfield 452	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   708: aload 33
    //   710: aload 31
    //   712: putfield 456	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   715: aload 28
    //   717: aload 33
    //   719: invokevirtual 224	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   722: pop
    //   723: goto -457 -> 266
    //   726: aload_2
    //   727: invokeinterface 195 1 0
    //   732: aload_1
    //   733: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   736: aload 28
    //   738: areturn
    //   739: astore 28
    //   741: goto +5 -> 746
    //   744: astore 28
    //   746: aload_2
    //   747: invokeinterface 195 1 0
    //   752: aload_1
    //   753: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   756: aload 28
    //   758: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	759	0	this	WorkSpecDao_Impl
    //   7	746	1	localRoomSQLiteQuery	RoomSQLiteQuery
    //   25	722	2	localCursor	Cursor
    //   33	276	3	i	int
    //   41	281	4	j	int
    //   50	299	5	k	int
    //   59	317	6	m	int
    //   68	335	7	n	int
    //   77	355	8	i1	int
    //   86	359	9	i2	int
    //   95	363	10	i3	int
    //   104	173	11	i4	int
    //   113	375	12	i5	int
    //   122	165	13	i6	int
    //   131	373	14	i7	int
    //   140	377	15	i8	int
    //   149	384	16	i9	int
    //   158	391	17	i10	int
    //   167	395	18	i11	int
    //   176	399	19	i12	int
    //   185	403	20	i13	int
    //   194	407	21	i14	int
    //   203	414	22	i15	int
    //   212	418	23	i16	int
    //   221	422	24	i17	int
    //   230	426	25	i18	int
    //   239	428	26	i19	int
    //   248	448	27	i20	int
    //   253	484	28	localArrayList	ArrayList
    //   739	1	28	localObject1	Object
    //   744	13	28	localObject2	Object
    //   283	195	29	str1	String
    //   293	187	30	str2	String
    //   298	413	31	localConstraints	Constraints
    //   332	356	32	bool	boolean
    //   473	245	33	localWorkSpec	WorkSpec
    // Exception table:
    //   from	to	target	type
    //   151	255	739	finally
    //   255	266	739	finally
    //   266	331	739	finally
    //   340	358	739	finally
    //   367	385	739	finally
    //   394	412	739	finally
    //   421	545	739	finally
    //   545	613	739	finally
    //   613	639	739	finally
    //   639	676	739	finally
    //   685	723	739	finally
    //   26	151	744	finally
  }
  
  public LiveData<Long> getScheduleRequestedAtLiveData(String paramString)
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
    if (paramString == null) {
      ((RoomSQLiteQuery)localObject).bindNull(1);
    } else {
      ((RoomSQLiteQuery)localObject).bindString(1, paramString);
    }
    paramString = __db.getInvalidationTracker();
    localObject = new Callable()
    {
      public Long call()
        throws Exception
      {
        Object localObject1 = WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this);
        Object localObject3 = localObject;
        Object localObject4 = null;
        localObject3 = DBUtil.query((RoomDatabase)localObject1, (SupportSQLiteQuery)localObject3, false, null);
        localObject1 = localObject4;
        try
        {
          if (((Cursor)localObject3).moveToFirst()) {
            if (((Cursor)localObject3).isNull(0)) {
              localObject1 = localObject4;
            } else {
              localObject1 = Long.valueOf(((Cursor)localObject3).getLong(0));
            }
          }
          return (Long)localObject1;
        }
        finally
        {
          ((Cursor)localObject3).close();
        }
      }
      
      public void finalize()
      {
        localObject.release();
      }
    };
    return paramString.createLiveData(new String[] { "workspec" }, false, (Callable)localObject);
  }
  
  /* Error */
  public List<WorkSpec> getScheduledWork()
  {
    // Byte code:
    //   0: ldc_w 511
    //   3: iconst_0
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   12: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   15: aload_0
    //   16: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   19: aload_1
    //   20: iconst_0
    //   21: aconst_null
    //   22: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   25: astore_2
    //   26: aload_2
    //   27: ldc_w 281
    //   30: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   33: istore_3
    //   34: aload_2
    //   35: ldc_w 286
    //   38: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   41: istore 4
    //   43: aload_2
    //   44: ldc_w 288
    //   47: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   50: istore 5
    //   52: aload_2
    //   53: ldc_w 290
    //   56: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   59: istore 6
    //   61: aload_2
    //   62: ldc_w 292
    //   65: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   68: istore 7
    //   70: aload_2
    //   71: ldc_w 294
    //   74: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   77: istore 8
    //   79: aload_2
    //   80: ldc_w 296
    //   83: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   86: istore 9
    //   88: aload_2
    //   89: ldc_w 298
    //   92: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   95: istore 10
    //   97: aload_2
    //   98: ldc_w 300
    //   101: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   104: istore 11
    //   106: aload_2
    //   107: ldc_w 302
    //   110: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   113: istore 12
    //   115: aload_2
    //   116: ldc_w 304
    //   119: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   122: istore 13
    //   124: aload_2
    //   125: ldc_w 306
    //   128: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   131: istore 14
    //   133: aload_2
    //   134: ldc_w 308
    //   137: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   140: istore 15
    //   142: aload_2
    //   143: ldc_w 310
    //   146: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   149: istore 16
    //   151: aload_2
    //   152: ldc_w 312
    //   155: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   158: istore 17
    //   160: aload_2
    //   161: ldc_w 314
    //   164: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   167: istore 18
    //   169: aload_2
    //   170: ldc_w 316
    //   173: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   176: istore 19
    //   178: aload_2
    //   179: ldc_w 318
    //   182: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   185: istore 20
    //   187: aload_2
    //   188: ldc_w 320
    //   191: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   194: istore 21
    //   196: aload_2
    //   197: ldc_w 322
    //   200: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   203: istore 22
    //   205: aload_2
    //   206: ldc_w 324
    //   209: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   212: istore 23
    //   214: aload_2
    //   215: ldc_w 326
    //   218: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   221: istore 24
    //   223: aload_2
    //   224: ldc_w 328
    //   227: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   230: istore 25
    //   232: aload_2
    //   233: ldc_w 330
    //   236: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   239: istore 26
    //   241: aload_2
    //   242: ldc_w 332
    //   245: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   248: istore 27
    //   250: new 119	java/util/ArrayList
    //   253: astore 28
    //   255: aload 28
    //   257: aload_2
    //   258: invokeinterface 335 1 0
    //   263: invokespecial 336	java/util/ArrayList:<init>	(I)V
    //   266: aload_2
    //   267: invokeinterface 198 1 0
    //   272: ifeq +454 -> 726
    //   275: aload_2
    //   276: iload 11
    //   278: invokeinterface 206 2 0
    //   283: astore 29
    //   285: aload_2
    //   286: iload 13
    //   288: invokeinterface 206 2 0
    //   293: astore 30
    //   295: new 338	androidx/work/Constraints
    //   298: astore 31
    //   300: aload 31
    //   302: invokespecial 339	androidx/work/Constraints:<init>	()V
    //   305: aload 31
    //   307: aload_2
    //   308: iload_3
    //   309: invokeinterface 343 2 0
    //   314: invokestatic 349	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   317: invokevirtual 353	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   320: aload_2
    //   321: iload 4
    //   323: invokeinterface 343 2 0
    //   328: ifeq +9 -> 337
    //   331: iconst_1
    //   332: istore 32
    //   334: goto +6 -> 340
    //   337: iconst_0
    //   338: istore 32
    //   340: aload 31
    //   342: iload 32
    //   344: invokevirtual 357	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   347: aload_2
    //   348: iload 5
    //   350: invokeinterface 343 2 0
    //   355: ifeq +9 -> 364
    //   358: iconst_1
    //   359: istore 32
    //   361: goto +6 -> 367
    //   364: iconst_0
    //   365: istore 32
    //   367: aload 31
    //   369: iload 32
    //   371: invokevirtual 360	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   374: aload_2
    //   375: iload 6
    //   377: invokeinterface 343 2 0
    //   382: ifeq +9 -> 391
    //   385: iconst_1
    //   386: istore 32
    //   388: goto +6 -> 394
    //   391: iconst_0
    //   392: istore 32
    //   394: aload 31
    //   396: iload 32
    //   398: invokevirtual 363	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   401: aload_2
    //   402: iload 7
    //   404: invokeinterface 343 2 0
    //   409: ifeq +9 -> 418
    //   412: iconst_1
    //   413: istore 32
    //   415: goto +6 -> 421
    //   418: iconst_0
    //   419: istore 32
    //   421: aload 31
    //   423: iload 32
    //   425: invokevirtual 366	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   428: aload 31
    //   430: aload_2
    //   431: iload 8
    //   433: invokeinterface 370 2 0
    //   438: invokevirtual 374	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   441: aload 31
    //   443: aload_2
    //   444: iload 9
    //   446: invokeinterface 370 2 0
    //   451: invokevirtual 377	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   454: aload 31
    //   456: aload_2
    //   457: iload 10
    //   459: invokeinterface 214 2 0
    //   464: invokestatic 381	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   467: invokevirtual 385	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   470: new 387	androidx/work/impl/model/WorkSpec
    //   473: astore 33
    //   475: aload 33
    //   477: aload 29
    //   479: aload 30
    //   481: invokespecial 390	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   484: aload 33
    //   486: aload_2
    //   487: iload 12
    //   489: invokeinterface 343 2 0
    //   494: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   497: putfield 397	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   500: aload 33
    //   502: aload_2
    //   503: iload 14
    //   505: invokeinterface 206 2 0
    //   510: putfield 401	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   513: aload 33
    //   515: aload_2
    //   516: iload 15
    //   518: invokeinterface 214 2 0
    //   523: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   526: putfield 404	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   529: aload 33
    //   531: aload_2
    //   532: iload 16
    //   534: invokeinterface 214 2 0
    //   539: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   542: putfield 406	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   545: aload 33
    //   547: aload_2
    //   548: iload 17
    //   550: invokeinterface 370 2 0
    //   555: putfield 410	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   558: aload 33
    //   560: aload_2
    //   561: iload 18
    //   563: invokeinterface 370 2 0
    //   568: putfield 413	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   571: aload 33
    //   573: aload_2
    //   574: iload 19
    //   576: invokeinterface 370 2 0
    //   581: putfield 416	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   584: aload 33
    //   586: aload_2
    //   587: iload 20
    //   589: invokeinterface 343 2 0
    //   594: putfield 420	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   597: aload 33
    //   599: aload_2
    //   600: iload 21
    //   602: invokeinterface 343 2 0
    //   607: invokestatic 424	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   610: putfield 428	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   613: aload 33
    //   615: aload_2
    //   616: iload 22
    //   618: invokeinterface 370 2 0
    //   623: putfield 431	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   626: aload 33
    //   628: aload_2
    //   629: iload 23
    //   631: invokeinterface 370 2 0
    //   636: putfield 434	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   639: aload 33
    //   641: aload_2
    //   642: iload 24
    //   644: invokeinterface 370 2 0
    //   649: putfield 437	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   652: aload 33
    //   654: aload_2
    //   655: iload 25
    //   657: invokeinterface 370 2 0
    //   662: putfield 440	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   665: aload_2
    //   666: iload 26
    //   668: invokeinterface 343 2 0
    //   673: ifeq +9 -> 682
    //   676: iconst_1
    //   677: istore 32
    //   679: goto +6 -> 685
    //   682: iconst_0
    //   683: istore 32
    //   685: aload 33
    //   687: iload 32
    //   689: putfield 444	androidx/work/impl/model/WorkSpec:expedited	Z
    //   692: aload 33
    //   694: aload_2
    //   695: iload 27
    //   697: invokeinterface 343 2 0
    //   702: invokestatic 448	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   705: putfield 452	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   708: aload 33
    //   710: aload 31
    //   712: putfield 456	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   715: aload 28
    //   717: aload 33
    //   719: invokevirtual 224	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   722: pop
    //   723: goto -457 -> 266
    //   726: aload_2
    //   727: invokeinterface 195 1 0
    //   732: aload_1
    //   733: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   736: aload 28
    //   738: areturn
    //   739: astore 30
    //   741: goto +5 -> 746
    //   744: astore 30
    //   746: aload_2
    //   747: invokeinterface 195 1 0
    //   752: aload_1
    //   753: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   756: aload 30
    //   758: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	759	0	this	WorkSpecDao_Impl
    //   7	746	1	localRoomSQLiteQuery	RoomSQLiteQuery
    //   25	722	2	localCursor	Cursor
    //   33	276	3	i	int
    //   41	281	4	j	int
    //   50	299	5	k	int
    //   59	317	6	m	int
    //   68	335	7	n	int
    //   77	355	8	i1	int
    //   86	359	9	i2	int
    //   95	363	10	i3	int
    //   104	173	11	i4	int
    //   113	375	12	i5	int
    //   122	165	13	i6	int
    //   131	373	14	i7	int
    //   140	377	15	i8	int
    //   149	384	16	i9	int
    //   158	391	17	i10	int
    //   167	395	18	i11	int
    //   176	399	19	i12	int
    //   185	403	20	i13	int
    //   194	407	21	i14	int
    //   203	414	22	i15	int
    //   212	418	23	i16	int
    //   221	422	24	i17	int
    //   230	426	25	i18	int
    //   239	428	26	i19	int
    //   248	448	27	i20	int
    //   253	484	28	localArrayList	ArrayList
    //   283	195	29	str1	String
    //   293	187	30	str2	String
    //   739	1	30	localObject1	Object
    //   744	13	30	localObject2	Object
    //   298	413	31	localConstraints	Constraints
    //   332	356	32	bool	boolean
    //   473	245	33	localWorkSpec	WorkSpec
    // Exception table:
    //   from	to	target	type
    //   151	255	739	finally
    //   255	266	739	finally
    //   266	331	739	finally
    //   340	358	739	finally
    //   367	385	739	finally
    //   394	412	739	finally
    //   421	545	739	finally
    //   545	613	739	finally
    //   613	639	739	finally
    //   639	676	739	finally
    //   685	723	739	finally
    //   26	151	744	finally
  }
  
  public WorkInfo.State getState(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    Object localObject = __db;
    paramString = null;
    localObject = DBUtil.query((RoomDatabase)localObject, localRoomSQLiteQuery, false, null);
    try
    {
      if (((Cursor)localObject).moveToFirst()) {
        paramString = WorkTypeConverters.intToState(((Cursor)localObject).getInt(0));
      }
      return paramString;
    }
    finally
    {
      ((Cursor)localObject).close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<String> getUnfinishedWorkWithName(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(paramString.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public List<String> getUnfinishedWorkWithTag(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext()) {
        localArrayList.add(paramString.getString(0));
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  /* Error */
  public WorkSpec getWorkSpec(String paramString)
  {
    // Byte code:
    //   0: ldc_w 529
    //   3: iconst_1
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_2
    //   8: aload_1
    //   9: ifnonnull +11 -> 20
    //   12: aload_2
    //   13: iconst_1
    //   14: invokevirtual 172	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   17: goto +9 -> 26
    //   20: aload_2
    //   21: iconst_1
    //   22: aload_1
    //   23: invokevirtual 176	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   26: aload_0
    //   27: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   30: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   33: aload_0
    //   34: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   37: aload_2
    //   38: iconst_0
    //   39: aconst_null
    //   40: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   43: astore_3
    //   44: aload_3
    //   45: ldc_w 281
    //   48: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   51: istore 4
    //   53: aload_3
    //   54: ldc_w 286
    //   57: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   60: istore 5
    //   62: aload_3
    //   63: ldc_w 288
    //   66: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   69: istore 6
    //   71: aload_3
    //   72: ldc_w 290
    //   75: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   78: istore 7
    //   80: aload_3
    //   81: ldc_w 292
    //   84: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   87: istore 8
    //   89: aload_3
    //   90: ldc_w 294
    //   93: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   96: istore 9
    //   98: aload_3
    //   99: ldc_w 296
    //   102: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   105: istore 10
    //   107: aload_3
    //   108: ldc_w 298
    //   111: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   114: istore 11
    //   116: aload_3
    //   117: ldc_w 300
    //   120: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   123: istore 12
    //   125: aload_3
    //   126: ldc_w 302
    //   129: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   132: istore 13
    //   134: aload_3
    //   135: ldc_w 304
    //   138: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   141: istore 14
    //   143: aload_3
    //   144: ldc_w 306
    //   147: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   150: istore 15
    //   152: aload_3
    //   153: ldc_w 308
    //   156: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   159: istore 16
    //   161: aload_3
    //   162: ldc_w 310
    //   165: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   168: istore 17
    //   170: aload_3
    //   171: ldc_w 312
    //   174: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   177: istore 18
    //   179: aload_3
    //   180: ldc_w 314
    //   183: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   186: istore 19
    //   188: aload_3
    //   189: ldc_w 316
    //   192: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   195: istore 20
    //   197: aload_3
    //   198: ldc_w 318
    //   201: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   204: istore 21
    //   206: aload_3
    //   207: ldc_w 320
    //   210: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   213: istore 22
    //   215: aload_3
    //   216: ldc_w 322
    //   219: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   222: istore 23
    //   224: aload_3
    //   225: ldc_w 324
    //   228: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   231: istore 24
    //   233: aload_3
    //   234: ldc_w 326
    //   237: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   240: istore 25
    //   242: aload_3
    //   243: ldc_w 328
    //   246: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   249: istore 26
    //   251: aload_3
    //   252: ldc_w 330
    //   255: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   258: istore 27
    //   260: aload_3
    //   261: ldc_w 332
    //   264: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   267: istore 28
    //   269: aload_3
    //   270: invokeinterface 518 1 0
    //   275: ifeq +429 -> 704
    //   278: aload_3
    //   279: iload 12
    //   281: invokeinterface 206 2 0
    //   286: astore 29
    //   288: aload_3
    //   289: iload 14
    //   291: invokeinterface 206 2 0
    //   296: astore 30
    //   298: new 338	androidx/work/Constraints
    //   301: astore 31
    //   303: aload 31
    //   305: invokespecial 339	androidx/work/Constraints:<init>	()V
    //   308: aload 31
    //   310: aload_3
    //   311: iload 4
    //   313: invokeinterface 343 2 0
    //   318: invokestatic 349	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   321: invokevirtual 353	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   324: aload_3
    //   325: iload 5
    //   327: invokeinterface 343 2 0
    //   332: ifeq +9 -> 341
    //   335: iconst_1
    //   336: istore 32
    //   338: goto +6 -> 344
    //   341: iconst_0
    //   342: istore 32
    //   344: aload 31
    //   346: iload 32
    //   348: invokevirtual 357	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   351: aload_3
    //   352: iload 6
    //   354: invokeinterface 343 2 0
    //   359: ifeq +9 -> 368
    //   362: iconst_1
    //   363: istore 32
    //   365: goto +6 -> 371
    //   368: iconst_0
    //   369: istore 32
    //   371: aload 31
    //   373: iload 32
    //   375: invokevirtual 360	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   378: aload_3
    //   379: iload 7
    //   381: invokeinterface 343 2 0
    //   386: ifeq +9 -> 395
    //   389: iconst_1
    //   390: istore 32
    //   392: goto +6 -> 398
    //   395: iconst_0
    //   396: istore 32
    //   398: aload 31
    //   400: iload 32
    //   402: invokevirtual 363	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   405: aload_3
    //   406: iload 8
    //   408: invokeinterface 343 2 0
    //   413: ifeq +9 -> 422
    //   416: iconst_1
    //   417: istore 32
    //   419: goto +6 -> 425
    //   422: iconst_0
    //   423: istore 32
    //   425: aload 31
    //   427: iload 32
    //   429: invokevirtual 366	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   432: aload 31
    //   434: aload_3
    //   435: iload 9
    //   437: invokeinterface 370 2 0
    //   442: invokevirtual 374	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   445: aload 31
    //   447: aload_3
    //   448: iload 10
    //   450: invokeinterface 370 2 0
    //   455: invokevirtual 377	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   458: aload 31
    //   460: aload_3
    //   461: iload 11
    //   463: invokeinterface 214 2 0
    //   468: invokestatic 381	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   471: invokevirtual 385	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   474: new 387	androidx/work/impl/model/WorkSpec
    //   477: astore_1
    //   478: aload_1
    //   479: aload 29
    //   481: aload 30
    //   483: invokespecial 390	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   486: aload_1
    //   487: aload_3
    //   488: iload 13
    //   490: invokeinterface 343 2 0
    //   495: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   498: putfield 397	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   501: aload_1
    //   502: aload_3
    //   503: iload 15
    //   505: invokeinterface 206 2 0
    //   510: putfield 401	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   513: aload_1
    //   514: aload_3
    //   515: iload 16
    //   517: invokeinterface 214 2 0
    //   522: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   525: putfield 404	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   528: aload_1
    //   529: aload_3
    //   530: iload 17
    //   532: invokeinterface 214 2 0
    //   537: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   540: putfield 406	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   543: aload_1
    //   544: aload_3
    //   545: iload 18
    //   547: invokeinterface 370 2 0
    //   552: putfield 410	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   555: aload_1
    //   556: aload_3
    //   557: iload 19
    //   559: invokeinterface 370 2 0
    //   564: putfield 413	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   567: aload_1
    //   568: aload_3
    //   569: iload 20
    //   571: invokeinterface 370 2 0
    //   576: putfield 416	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   579: aload_1
    //   580: aload_3
    //   581: iload 21
    //   583: invokeinterface 343 2 0
    //   588: putfield 420	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   591: aload_1
    //   592: aload_3
    //   593: iload 22
    //   595: invokeinterface 343 2 0
    //   600: invokestatic 424	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   603: putfield 428	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   606: aload_1
    //   607: aload_3
    //   608: iload 23
    //   610: invokeinterface 370 2 0
    //   615: putfield 431	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   618: aload_1
    //   619: aload_3
    //   620: iload 24
    //   622: invokeinterface 370 2 0
    //   627: putfield 434	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   630: aload_1
    //   631: aload_3
    //   632: iload 25
    //   634: invokeinterface 370 2 0
    //   639: putfield 437	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   642: aload_1
    //   643: aload_3
    //   644: iload 26
    //   646: invokeinterface 370 2 0
    //   651: putfield 440	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   654: aload_3
    //   655: iload 27
    //   657: invokeinterface 343 2 0
    //   662: ifeq +9 -> 671
    //   665: iconst_1
    //   666: istore 32
    //   668: goto +6 -> 674
    //   671: iconst_0
    //   672: istore 32
    //   674: aload_1
    //   675: iload 32
    //   677: putfield 444	androidx/work/impl/model/WorkSpec:expedited	Z
    //   680: aload_1
    //   681: aload_3
    //   682: iload 28
    //   684: invokeinterface 343 2 0
    //   689: invokestatic 448	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   692: putfield 452	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   695: aload_1
    //   696: aload 31
    //   698: putfield 456	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   701: goto +5 -> 706
    //   704: aconst_null
    //   705: astore_1
    //   706: aload_3
    //   707: invokeinterface 195 1 0
    //   712: aload_2
    //   713: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   716: aload_1
    //   717: areturn
    //   718: astore_1
    //   719: goto +4 -> 723
    //   722: astore_1
    //   723: aload_3
    //   724: invokeinterface 195 1 0
    //   729: aload_2
    //   730: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   733: aload_1
    //   734: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	735	0	this	WorkSpecDao_Impl
    //   0	735	1	paramString	String
    //   7	723	2	localRoomSQLiteQuery	RoomSQLiteQuery
    //   43	681	3	localCursor	Cursor
    //   51	261	4	i	int
    //   60	266	5	j	int
    //   69	284	6	k	int
    //   78	302	7	m	int
    //   87	320	8	n	int
    //   96	340	9	i1	int
    //   105	344	10	i2	int
    //   114	348	11	i3	int
    //   123	157	12	i4	int
    //   132	357	13	i5	int
    //   141	149	14	i6	int
    //   150	354	15	i7	int
    //   159	357	16	i8	int
    //   168	363	17	i9	int
    //   177	369	18	i10	int
    //   186	372	19	i11	int
    //   195	375	20	i12	int
    //   204	378	21	i13	int
    //   213	381	22	i14	int
    //   222	387	23	i15	int
    //   231	390	24	i16	int
    //   240	393	25	i17	int
    //   249	396	26	i18	int
    //   258	398	27	i19	int
    //   267	416	28	i20	int
    //   286	194	29	str1	String
    //   296	186	30	str2	String
    //   301	396	31	localConstraints	Constraints
    //   336	340	32	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   170	335	718	finally
    //   344	362	718	finally
    //   371	389	718	finally
    //   398	416	718	finally
    //   425	665	718	finally
    //   674	701	718	finally
    //   44	170	722	finally
  }
  
  public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String paramString)
  {
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
    if (paramString == null) {
      localRoomSQLiteQuery.bindNull(1);
    } else {
      localRoomSQLiteQuery.bindString(1, paramString);
    }
    __db.assertNotSuspendingTransaction();
    paramString = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    try
    {
      int i = CursorUtil.getColumnIndexOrThrow(paramString, "id");
      int j = CursorUtil.getColumnIndexOrThrow(paramString, "state");
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(paramString.getCount());
      while (paramString.moveToNext())
      {
        WorkSpec.IdAndState localIdAndState = new androidx/work/impl/model/WorkSpec$IdAndState;
        localIdAndState.<init>();
        id = paramString.getString(i);
        state = WorkTypeConverters.intToState(paramString.getInt(j));
        localArrayList.add(localIdAndState);
      }
      return localArrayList;
    }
    finally
    {
      paramString.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  /* Error */
  public WorkSpec[] getWorkSpecs(List<String> paramList)
  {
    // Byte code:
    //   0: invokestatic 131	androidx/room/util/StringUtil:newStringBuilder	()Ljava/lang/StringBuilder;
    //   3: astore_2
    //   4: aload_2
    //   5: ldc_w 543
    //   8: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11: pop
    //   12: aload_2
    //   13: ldc_w 545
    //   16: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: pop
    //   20: aload_2
    //   21: ldc_w 547
    //   24: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload_1
    //   29: invokeinterface 550 1 0
    //   34: istore_3
    //   35: aload_2
    //   36: iload_3
    //   37: invokestatic 144	androidx/room/util/StringUtil:appendPlaceholders	(Ljava/lang/StringBuilder;I)V
    //   40: aload_2
    //   41: ldc -110
    //   43: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_2
    //   48: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: iload_3
    //   52: iconst_0
    //   53: iadd
    //   54: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   57: astore_2
    //   58: aload_1
    //   59: invokeinterface 551 1 0
    //   64: astore_1
    //   65: iconst_1
    //   66: istore_3
    //   67: aload_1
    //   68: invokeinterface 165 1 0
    //   73: ifeq +40 -> 113
    //   76: aload_1
    //   77: invokeinterface 169 1 0
    //   82: checkcast 114	java/lang/String
    //   85: astore 4
    //   87: aload 4
    //   89: ifnonnull +11 -> 100
    //   92: aload_2
    //   93: iload_3
    //   94: invokevirtual 172	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   97: goto +10 -> 107
    //   100: aload_2
    //   101: iload_3
    //   102: aload 4
    //   104: invokevirtual 176	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   107: iinc 3 1
    //   110: goto -43 -> 67
    //   113: aload_0
    //   114: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   117: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   120: aload_0
    //   121: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   124: aload_2
    //   125: iconst_0
    //   126: aconst_null
    //   127: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   130: astore 4
    //   132: aload 4
    //   134: ldc_w 281
    //   137: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   140: istore 5
    //   142: aload 4
    //   144: ldc_w 286
    //   147: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   150: istore 6
    //   152: aload 4
    //   154: ldc_w 288
    //   157: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   160: istore 7
    //   162: aload 4
    //   164: ldc_w 290
    //   167: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   170: istore 8
    //   172: aload 4
    //   174: ldc_w 292
    //   177: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   180: istore 9
    //   182: aload 4
    //   184: ldc_w 294
    //   187: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   190: istore 10
    //   192: aload 4
    //   194: ldc_w 296
    //   197: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   200: istore 11
    //   202: aload 4
    //   204: ldc_w 298
    //   207: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   210: istore 12
    //   212: aload 4
    //   214: ldc_w 300
    //   217: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   220: istore 13
    //   222: aload 4
    //   224: ldc_w 302
    //   227: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   230: istore 14
    //   232: aload 4
    //   234: ldc_w 304
    //   237: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   240: istore 15
    //   242: aload 4
    //   244: ldc_w 306
    //   247: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   250: istore 16
    //   252: aload 4
    //   254: ldc_w 308
    //   257: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   260: istore 17
    //   262: aload 4
    //   264: ldc_w 310
    //   267: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   270: istore 18
    //   272: aload 4
    //   274: ldc_w 312
    //   277: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   280: istore 19
    //   282: aload 4
    //   284: ldc_w 314
    //   287: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   290: istore 20
    //   292: aload 4
    //   294: ldc_w 316
    //   297: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   300: istore 21
    //   302: aload 4
    //   304: ldc_w 318
    //   307: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   310: istore 22
    //   312: aload 4
    //   314: ldc_w 320
    //   317: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   320: istore_3
    //   321: aload 4
    //   323: ldc_w 322
    //   326: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   329: istore 23
    //   331: aload 4
    //   333: ldc_w 324
    //   336: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   339: istore 24
    //   341: aload 4
    //   343: ldc_w 326
    //   346: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   349: istore 25
    //   351: aload 4
    //   353: ldc_w 328
    //   356: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   359: istore 26
    //   361: aload 4
    //   363: ldc_w 330
    //   366: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   369: istore 27
    //   371: aload 4
    //   373: ldc_w 332
    //   376: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   379: istore 28
    //   381: aload 4
    //   383: invokeinterface 335 1 0
    //   388: anewarray 387	androidx/work/impl/model/WorkSpec
    //   391: astore_1
    //   392: iconst_0
    //   393: istore 29
    //   395: aload 4
    //   397: invokeinterface 198 1 0
    //   402: ifeq +480 -> 882
    //   405: aload 4
    //   407: iload 13
    //   409: invokeinterface 206 2 0
    //   414: astore 30
    //   416: aload 4
    //   418: iload 15
    //   420: invokeinterface 206 2 0
    //   425: astore 31
    //   427: new 338	androidx/work/Constraints
    //   430: astore 32
    //   432: aload 32
    //   434: invokespecial 339	androidx/work/Constraints:<init>	()V
    //   437: aload 32
    //   439: aload 4
    //   441: iload 5
    //   443: invokeinterface 343 2 0
    //   448: invokestatic 349	androidx/work/impl/model/WorkTypeConverters:intToNetworkType	(I)Landroidx/work/NetworkType;
    //   451: invokevirtual 353	androidx/work/Constraints:setRequiredNetworkType	(Landroidx/work/NetworkType;)V
    //   454: aload 4
    //   456: iload 6
    //   458: invokeinterface 343 2 0
    //   463: ifeq +9 -> 472
    //   466: iconst_1
    //   467: istore 33
    //   469: goto +6 -> 475
    //   472: iconst_0
    //   473: istore 33
    //   475: aload 32
    //   477: iload 33
    //   479: invokevirtual 357	androidx/work/Constraints:setRequiresCharging	(Z)V
    //   482: aload 4
    //   484: iload 7
    //   486: invokeinterface 343 2 0
    //   491: ifeq +9 -> 500
    //   494: iconst_1
    //   495: istore 33
    //   497: goto +6 -> 503
    //   500: iconst_0
    //   501: istore 33
    //   503: aload 32
    //   505: iload 33
    //   507: invokevirtual 360	androidx/work/Constraints:setRequiresDeviceIdle	(Z)V
    //   510: aload 4
    //   512: iload 8
    //   514: invokeinterface 343 2 0
    //   519: ifeq +9 -> 528
    //   522: iconst_1
    //   523: istore 33
    //   525: goto +6 -> 531
    //   528: iconst_0
    //   529: istore 33
    //   531: aload 32
    //   533: iload 33
    //   535: invokevirtual 363	androidx/work/Constraints:setRequiresBatteryNotLow	(Z)V
    //   538: aload 4
    //   540: iload 9
    //   542: invokeinterface 343 2 0
    //   547: ifeq +9 -> 556
    //   550: iconst_1
    //   551: istore 33
    //   553: goto +6 -> 559
    //   556: iconst_0
    //   557: istore 33
    //   559: aload 32
    //   561: iload 33
    //   563: invokevirtual 366	androidx/work/Constraints:setRequiresStorageNotLow	(Z)V
    //   566: aload 32
    //   568: aload 4
    //   570: iload 10
    //   572: invokeinterface 370 2 0
    //   577: invokevirtual 374	androidx/work/Constraints:setTriggerContentUpdateDelay	(J)V
    //   580: aload 32
    //   582: aload 4
    //   584: iload 11
    //   586: invokeinterface 370 2 0
    //   591: invokevirtual 377	androidx/work/Constraints:setTriggerMaxContentDelay	(J)V
    //   594: aload 32
    //   596: aload 4
    //   598: iload 12
    //   600: invokeinterface 214 2 0
    //   605: invokestatic 381	androidx/work/impl/model/WorkTypeConverters:byteArrayToContentUriTriggers	([B)Landroidx/work/ContentUriTriggers;
    //   608: invokevirtual 385	androidx/work/Constraints:setContentUriTriggers	(Landroidx/work/ContentUriTriggers;)V
    //   611: new 387	androidx/work/impl/model/WorkSpec
    //   614: astore 34
    //   616: aload 34
    //   618: aload 30
    //   620: aload 31
    //   622: invokespecial 390	androidx/work/impl/model/WorkSpec:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   625: aload 34
    //   627: aload 4
    //   629: iload 14
    //   631: invokeinterface 343 2 0
    //   636: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   639: putfield 397	androidx/work/impl/model/WorkSpec:state	Landroidx/work/WorkInfo$State;
    //   642: aload 34
    //   644: aload 4
    //   646: iload 16
    //   648: invokeinterface 206 2 0
    //   653: putfield 401	androidx/work/impl/model/WorkSpec:inputMergerClassName	Ljava/lang/String;
    //   656: aload 34
    //   658: aload 4
    //   660: iload 17
    //   662: invokeinterface 214 2 0
    //   667: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   670: putfield 404	androidx/work/impl/model/WorkSpec:input	Landroidx/work/Data;
    //   673: aload 34
    //   675: aload 4
    //   677: iload 18
    //   679: invokeinterface 214 2 0
    //   684: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   687: putfield 406	androidx/work/impl/model/WorkSpec:output	Landroidx/work/Data;
    //   690: aload 34
    //   692: aload 4
    //   694: iload 19
    //   696: invokeinterface 370 2 0
    //   701: putfield 410	androidx/work/impl/model/WorkSpec:initialDelay	J
    //   704: aload 34
    //   706: aload 4
    //   708: iload 20
    //   710: invokeinterface 370 2 0
    //   715: putfield 413	androidx/work/impl/model/WorkSpec:intervalDuration	J
    //   718: aload 34
    //   720: aload 4
    //   722: iload 21
    //   724: invokeinterface 370 2 0
    //   729: putfield 416	androidx/work/impl/model/WorkSpec:flexDuration	J
    //   732: aload 34
    //   734: aload 4
    //   736: iload 22
    //   738: invokeinterface 343 2 0
    //   743: putfield 420	androidx/work/impl/model/WorkSpec:runAttemptCount	I
    //   746: aload 34
    //   748: aload 4
    //   750: iload_3
    //   751: invokeinterface 343 2 0
    //   756: invokestatic 424	androidx/work/impl/model/WorkTypeConverters:intToBackoffPolicy	(I)Landroidx/work/BackoffPolicy;
    //   759: putfield 428	androidx/work/impl/model/WorkSpec:backoffPolicy	Landroidx/work/BackoffPolicy;
    //   762: aload 34
    //   764: aload 4
    //   766: iload 23
    //   768: invokeinterface 370 2 0
    //   773: putfield 431	androidx/work/impl/model/WorkSpec:backoffDelayDuration	J
    //   776: aload 34
    //   778: aload 4
    //   780: iload 24
    //   782: invokeinterface 370 2 0
    //   787: putfield 434	androidx/work/impl/model/WorkSpec:periodStartTime	J
    //   790: aload 34
    //   792: aload 4
    //   794: iload 25
    //   796: invokeinterface 370 2 0
    //   801: putfield 437	androidx/work/impl/model/WorkSpec:minimumRetentionDuration	J
    //   804: aload 34
    //   806: aload 4
    //   808: iload 26
    //   810: invokeinterface 370 2 0
    //   815: putfield 440	androidx/work/impl/model/WorkSpec:scheduleRequestedAt	J
    //   818: aload 4
    //   820: iload 27
    //   822: invokeinterface 343 2 0
    //   827: ifeq +9 -> 836
    //   830: iconst_1
    //   831: istore 33
    //   833: goto +6 -> 839
    //   836: iconst_0
    //   837: istore 33
    //   839: aload 34
    //   841: iload 33
    //   843: putfield 444	androidx/work/impl/model/WorkSpec:expedited	Z
    //   846: aload 34
    //   848: aload 4
    //   850: iload 28
    //   852: invokeinterface 343 2 0
    //   857: invokestatic 448	androidx/work/impl/model/WorkTypeConverters:intToOutOfQuotaPolicy	(I)Landroidx/work/OutOfQuotaPolicy;
    //   860: putfield 452	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   863: aload 34
    //   865: aload 32
    //   867: putfield 456	androidx/work/impl/model/WorkSpec:constraints	Landroidx/work/Constraints;
    //   870: aload_1
    //   871: iload 29
    //   873: aload 34
    //   875: aastore
    //   876: iinc 29 1
    //   879: goto -484 -> 395
    //   882: aload 4
    //   884: invokeinterface 195 1 0
    //   889: aload_2
    //   890: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   893: aload_1
    //   894: areturn
    //   895: astore_1
    //   896: goto +4 -> 900
    //   899: astore_1
    //   900: aload 4
    //   902: invokeinterface 195 1 0
    //   907: aload_2
    //   908: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   911: aload_1
    //   912: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	913	0	this	WorkSpecDao_Impl
    //   0	913	1	paramList	List<String>
    //   3	905	2	localObject1	Object
    //   34	717	3	i	int
    //   85	816	4	localObject2	Object
    //   140	302	5	j	int
    //   150	307	6	k	int
    //   160	325	7	m	int
    //   170	343	8	n	int
    //   180	361	9	i1	int
    //   190	381	10	i2	int
    //   200	385	11	i3	int
    //   210	389	12	i4	int
    //   220	188	13	i5	int
    //   230	400	14	i6	int
    //   240	179	15	i7	int
    //   250	397	16	i8	int
    //   260	401	17	i9	int
    //   270	408	18	i10	int
    //   280	415	19	i11	int
    //   290	419	20	i12	int
    //   300	423	21	i13	int
    //   310	427	22	i14	int
    //   329	438	23	i15	int
    //   339	442	24	i16	int
    //   349	446	25	i17	int
    //   359	450	26	i18	int
    //   369	452	27	i19	int
    //   379	472	28	i20	int
    //   393	484	29	i21	int
    //   414	205	30	str1	String
    //   425	196	31	str2	String
    //   430	436	32	localConstraints	Constraints
    //   467	375	33	bool	boolean
    //   614	260	34	localWorkSpec	WorkSpec
    // Exception table:
    //   from	to	target	type
    //   272	392	895	finally
    //   395	466	895	finally
    //   475	494	895	finally
    //   503	522	895	finally
    //   531	550	895	finally
    //   559	704	895	finally
    //   704	762	895	finally
    //   762	790	895	finally
    //   790	804	895	finally
    //   804	830	895	finally
    //   839	870	895	finally
    //   132	272	899	finally
  }
  
  /* Error */
  public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String paramString)
  {
    // Byte code:
    //   0: ldc_w 556
    //   3: iconst_1
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_2
    //   8: aload_1
    //   9: ifnonnull +11 -> 20
    //   12: aload_2
    //   13: iconst_1
    //   14: invokevirtual 172	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   17: goto +9 -> 26
    //   20: aload_2
    //   21: iconst_1
    //   22: aload_1
    //   23: invokevirtual 176	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   26: aload_0
    //   27: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   30: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   33: aload_0
    //   34: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   37: invokevirtual 256	androidx/room/RoomDatabase:beginTransaction	()V
    //   40: aload_0
    //   41: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   44: astore_3
    //   45: aconst_null
    //   46: astore_1
    //   47: aconst_null
    //   48: astore 4
    //   50: aload_3
    //   51: aload_2
    //   52: iconst_1
    //   53: aconst_null
    //   54: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   57: astore 5
    //   59: aload 5
    //   61: ldc_w 300
    //   64: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 6
    //   69: aload 5
    //   71: ldc_w 302
    //   74: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   77: istore 7
    //   79: aload 5
    //   81: ldc_w 310
    //   84: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   87: istore 8
    //   89: aload 5
    //   91: ldc_w 318
    //   94: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   97: istore 9
    //   99: new 89	androidx/collection/ArrayMap
    //   102: astore_3
    //   103: aload_3
    //   104: invokespecial 557	androidx/collection/ArrayMap:<init>	()V
    //   107: new 89	androidx/collection/ArrayMap
    //   110: astore 10
    //   112: aload 10
    //   114: invokespecial 557	androidx/collection/ArrayMap:<init>	()V
    //   117: aload 5
    //   119: invokeinterface 198 1 0
    //   124: ifeq +116 -> 240
    //   127: aload 5
    //   129: iload 6
    //   131: invokeinterface 202 2 0
    //   136: ifne +45 -> 181
    //   139: aload 5
    //   141: iload 6
    //   143: invokeinterface 206 2 0
    //   148: astore 11
    //   150: aload_3
    //   151: aload 11
    //   153: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   156: checkcast 119	java/util/ArrayList
    //   159: ifnonnull +22 -> 181
    //   162: new 119	java/util/ArrayList
    //   165: astore 12
    //   167: aload 12
    //   169: invokespecial 558	java/util/ArrayList:<init>	()V
    //   172: aload_3
    //   173: aload 11
    //   175: aload 12
    //   177: invokevirtual 123	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   180: pop
    //   181: aload 5
    //   183: iload 6
    //   185: invokeinterface 202 2 0
    //   190: ifne -73 -> 117
    //   193: aload 5
    //   195: iload 6
    //   197: invokeinterface 206 2 0
    //   202: astore 12
    //   204: aload 10
    //   206: aload 12
    //   208: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   211: checkcast 119	java/util/ArrayList
    //   214: ifnonnull -97 -> 117
    //   217: new 119	java/util/ArrayList
    //   220: astore 11
    //   222: aload 11
    //   224: invokespecial 558	java/util/ArrayList:<init>	()V
    //   227: aload 10
    //   229: aload 12
    //   231: aload 11
    //   233: invokevirtual 123	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   236: pop
    //   237: goto -120 -> 117
    //   240: aload 5
    //   242: iconst_m1
    //   243: invokeinterface 561 2 0
    //   248: pop
    //   249: aload_0
    //   250: aload_3
    //   251: invokespecial 229	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkTagAsjavaLangString	(Landroidx/collection/ArrayMap;)V
    //   254: aload_0
    //   255: aload 10
    //   257: invokespecial 125	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkProgressAsandroidxWorkData	(Landroidx/collection/ArrayMap;)V
    //   260: aload 5
    //   262: invokeinterface 518 1 0
    //   267: ifeq +178 -> 445
    //   270: aload 5
    //   272: iload 6
    //   274: invokeinterface 202 2 0
    //   279: ifne +23 -> 302
    //   282: aload_3
    //   283: aload 5
    //   285: iload 6
    //   287: invokeinterface 206 2 0
    //   292: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   295: checkcast 119	java/util/ArrayList
    //   298: astore_1
    //   299: goto +5 -> 304
    //   302: aconst_null
    //   303: astore_1
    //   304: aload_1
    //   305: astore_3
    //   306: aload_1
    //   307: ifnonnull +11 -> 318
    //   310: new 119	java/util/ArrayList
    //   313: astore_3
    //   314: aload_3
    //   315: invokespecial 558	java/util/ArrayList:<init>	()V
    //   318: aload 4
    //   320: astore_1
    //   321: aload 5
    //   323: iload 6
    //   325: invokeinterface 202 2 0
    //   330: ifne +21 -> 351
    //   333: aload 10
    //   335: aload 5
    //   337: iload 6
    //   339: invokeinterface 206 2 0
    //   344: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   347: checkcast 119	java/util/ArrayList
    //   350: astore_1
    //   351: aload_1
    //   352: astore 4
    //   354: aload_1
    //   355: ifnonnull +13 -> 368
    //   358: new 119	java/util/ArrayList
    //   361: astore 4
    //   363: aload 4
    //   365: invokespecial 558	java/util/ArrayList:<init>	()V
    //   368: new 563	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   371: astore_1
    //   372: aload_1
    //   373: invokespecial 564	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   376: aload_1
    //   377: aload 5
    //   379: iload 6
    //   381: invokeinterface 206 2 0
    //   386: putfield 565	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   389: aload_1
    //   390: aload 5
    //   392: iload 7
    //   394: invokeinterface 343 2 0
    //   399: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   402: putfield 566	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   405: aload_1
    //   406: aload 5
    //   408: iload 8
    //   410: invokeinterface 214 2 0
    //   415: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   418: putfield 567	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   421: aload_1
    //   422: aload 5
    //   424: iload 9
    //   426: invokeinterface 343 2 0
    //   431: putfield 568	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   434: aload_1
    //   435: aload_3
    //   436: putfield 572	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   439: aload_1
    //   440: aload 4
    //   442: putfield 575	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   445: aload_0
    //   446: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   449: invokevirtual 264	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   452: aload 5
    //   454: invokeinterface 195 1 0
    //   459: aload_2
    //   460: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   463: aload_0
    //   464: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   467: invokevirtual 267	androidx/room/RoomDatabase:endTransaction	()V
    //   470: aload_1
    //   471: areturn
    //   472: astore_1
    //   473: aload 5
    //   475: invokeinterface 195 1 0
    //   480: aload_2
    //   481: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   484: aload_1
    //   485: athrow
    //   486: astore_1
    //   487: aload_0
    //   488: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   491: invokevirtual 267	androidx/room/RoomDatabase:endTransaction	()V
    //   494: aload_1
    //   495: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	496	0	this	WorkSpecDao_Impl
    //   0	496	1	paramString	String
    //   7	474	2	localRoomSQLiteQuery	RoomSQLiteQuery
    //   44	392	3	localObject1	Object
    //   48	393	4	localObject2	Object
    //   57	417	5	localCursor	Cursor
    //   67	313	6	i	int
    //   77	316	7	j	int
    //   87	322	8	k	int
    //   97	328	9	m	int
    //   110	224	10	localArrayMap	ArrayMap
    //   148	84	11	localObject3	Object
    //   165	65	12	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   59	117	472	finally
    //   117	181	472	finally
    //   181	237	472	finally
    //   240	260	472	finally
    //   260	299	472	finally
    //   310	318	472	finally
    //   321	351	472	finally
    //   358	368	472	finally
    //   368	445	472	finally
    //   445	452	472	finally
    //   40	45	486	finally
    //   50	59	486	finally
    //   452	463	486	finally
    //   473	486	486	finally
  }
  
  /* Error */
  public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> paramList)
  {
    // Byte code:
    //   0: invokestatic 131	androidx/room/util/StringUtil:newStringBuilder	()Ljava/lang/StringBuilder;
    //   3: astore_2
    //   4: aload_2
    //   5: ldc_w 579
    //   8: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11: pop
    //   12: aload_1
    //   13: invokeinterface 550 1 0
    //   18: istore_3
    //   19: aload_2
    //   20: iload_3
    //   21: invokestatic 144	androidx/room/util/StringUtil:appendPlaceholders	(Ljava/lang/StringBuilder;I)V
    //   24: aload_2
    //   25: ldc -110
    //   27: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_2
    //   32: invokevirtual 150	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: iload_3
    //   36: iconst_0
    //   37: iadd
    //   38: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   41: astore 4
    //   43: aload_1
    //   44: invokeinterface 551 1 0
    //   49: astore_2
    //   50: iconst_1
    //   51: istore_3
    //   52: aload_2
    //   53: invokeinterface 165 1 0
    //   58: ifeq +39 -> 97
    //   61: aload_2
    //   62: invokeinterface 169 1 0
    //   67: checkcast 114	java/lang/String
    //   70: astore_1
    //   71: aload_1
    //   72: ifnonnull +12 -> 84
    //   75: aload 4
    //   77: iload_3
    //   78: invokevirtual 172	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   81: goto +10 -> 91
    //   84: aload 4
    //   86: iload_3
    //   87: aload_1
    //   88: invokevirtual 176	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   91: iinc 3 1
    //   94: goto -42 -> 52
    //   97: aload_0
    //   98: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   101: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   104: aload_0
    //   105: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   108: invokevirtual 256	androidx/room/RoomDatabase:beginTransaction	()V
    //   111: aload_0
    //   112: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   115: aload 4
    //   117: iconst_1
    //   118: aconst_null
    //   119: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   122: astore 5
    //   124: aload 5
    //   126: ldc_w 300
    //   129: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   132: istore 6
    //   134: aload 5
    //   136: ldc_w 302
    //   139: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   142: istore 7
    //   144: aload 5
    //   146: ldc_w 310
    //   149: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   152: istore 8
    //   154: aload 5
    //   156: ldc_w 318
    //   159: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   162: istore_3
    //   163: new 89	androidx/collection/ArrayMap
    //   166: astore 9
    //   168: aload 9
    //   170: invokespecial 557	androidx/collection/ArrayMap:<init>	()V
    //   173: new 89	androidx/collection/ArrayMap
    //   176: astore 10
    //   178: aload 10
    //   180: invokespecial 557	androidx/collection/ArrayMap:<init>	()V
    //   183: aload 5
    //   185: invokeinterface 198 1 0
    //   190: ifeq +106 -> 296
    //   193: aload 5
    //   195: iload 6
    //   197: invokeinterface 202 2 0
    //   202: ifne +41 -> 243
    //   205: aload 5
    //   207: iload 6
    //   209: invokeinterface 206 2 0
    //   214: astore_2
    //   215: aload 9
    //   217: aload_2
    //   218: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   221: checkcast 119	java/util/ArrayList
    //   224: ifnonnull +19 -> 243
    //   227: new 119	java/util/ArrayList
    //   230: astore_1
    //   231: aload_1
    //   232: invokespecial 558	java/util/ArrayList:<init>	()V
    //   235: aload 9
    //   237: aload_2
    //   238: aload_1
    //   239: invokevirtual 123	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   242: pop
    //   243: aload 5
    //   245: iload 6
    //   247: invokeinterface 202 2 0
    //   252: ifne -69 -> 183
    //   255: aload 5
    //   257: iload 6
    //   259: invokeinterface 206 2 0
    //   264: astore_2
    //   265: aload 10
    //   267: aload_2
    //   268: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   271: checkcast 119	java/util/ArrayList
    //   274: ifnonnull -91 -> 183
    //   277: new 119	java/util/ArrayList
    //   280: astore_1
    //   281: aload_1
    //   282: invokespecial 558	java/util/ArrayList:<init>	()V
    //   285: aload 10
    //   287: aload_2
    //   288: aload_1
    //   289: invokevirtual 123	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   292: pop
    //   293: goto -110 -> 183
    //   296: aload 5
    //   298: iconst_m1
    //   299: invokeinterface 561 2 0
    //   304: pop
    //   305: aload_0
    //   306: aload 9
    //   308: invokespecial 229	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkTagAsjavaLangString	(Landroidx/collection/ArrayMap;)V
    //   311: aload_0
    //   312: aload 10
    //   314: invokespecial 125	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkProgressAsandroidxWorkData	(Landroidx/collection/ArrayMap;)V
    //   317: new 119	java/util/ArrayList
    //   320: astore 11
    //   322: aload 11
    //   324: aload 5
    //   326: invokeinterface 335 1 0
    //   331: invokespecial 336	java/util/ArrayList:<init>	(I)V
    //   334: aload 5
    //   336: invokeinterface 198 1 0
    //   341: ifeq +190 -> 531
    //   344: aload 5
    //   346: iload 6
    //   348: invokeinterface 202 2 0
    //   353: ifne +24 -> 377
    //   356: aload 9
    //   358: aload 5
    //   360: iload 6
    //   362: invokeinterface 206 2 0
    //   367: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   370: checkcast 119	java/util/ArrayList
    //   373: astore_1
    //   374: goto +5 -> 379
    //   377: aconst_null
    //   378: astore_1
    //   379: aload_1
    //   380: astore_2
    //   381: aload_1
    //   382: ifnonnull +11 -> 393
    //   385: new 119	java/util/ArrayList
    //   388: astore_2
    //   389: aload_2
    //   390: invokespecial 558	java/util/ArrayList:<init>	()V
    //   393: aload 5
    //   395: iload 6
    //   397: invokeinterface 202 2 0
    //   402: ifne +24 -> 426
    //   405: aload 10
    //   407: aload 5
    //   409: iload 6
    //   411: invokeinterface 206 2 0
    //   416: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   419: checkcast 119	java/util/ArrayList
    //   422: astore_1
    //   423: goto +5 -> 428
    //   426: aconst_null
    //   427: astore_1
    //   428: aload_1
    //   429: astore 12
    //   431: aload_1
    //   432: ifnonnull +13 -> 445
    //   435: new 119	java/util/ArrayList
    //   438: astore 12
    //   440: aload 12
    //   442: invokespecial 558	java/util/ArrayList:<init>	()V
    //   445: new 563	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   448: astore_1
    //   449: aload_1
    //   450: invokespecial 564	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   453: aload_1
    //   454: aload 5
    //   456: iload 6
    //   458: invokeinterface 206 2 0
    //   463: putfield 565	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   466: aload_1
    //   467: aload 5
    //   469: iload 7
    //   471: invokeinterface 343 2 0
    //   476: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   479: putfield 566	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   482: aload_1
    //   483: aload 5
    //   485: iload 8
    //   487: invokeinterface 214 2 0
    //   492: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   495: putfield 567	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   498: aload_1
    //   499: aload 5
    //   501: iload_3
    //   502: invokeinterface 343 2 0
    //   507: putfield 568	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   510: aload_1
    //   511: aload_2
    //   512: putfield 572	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   515: aload_1
    //   516: aload 12
    //   518: putfield 575	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   521: aload 11
    //   523: aload_1
    //   524: invokevirtual 224	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   527: pop
    //   528: goto -194 -> 334
    //   531: aload_0
    //   532: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   535: invokevirtual 264	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   538: aload 5
    //   540: invokeinterface 195 1 0
    //   545: aload 4
    //   547: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   550: aload_0
    //   551: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   554: invokevirtual 267	androidx/room/RoomDatabase:endTransaction	()V
    //   557: aload 11
    //   559: areturn
    //   560: astore_1
    //   561: aload 5
    //   563: invokeinterface 195 1 0
    //   568: aload 4
    //   570: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   573: aload_1
    //   574: athrow
    //   575: astore_1
    //   576: aload_0
    //   577: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   580: invokevirtual 267	androidx/room/RoomDatabase:endTransaction	()V
    //   583: aload_1
    //   584: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	585	0	this	WorkSpecDao_Impl
    //   0	585	1	paramList	List<String>
    //   3	509	2	localObject1	Object
    //   18	484	3	i	int
    //   41	528	4	localRoomSQLiteQuery	RoomSQLiteQuery
    //   122	440	5	localCursor	Cursor
    //   132	325	6	j	int
    //   142	328	7	k	int
    //   152	334	8	m	int
    //   166	191	9	localArrayMap1	ArrayMap
    //   176	230	10	localArrayMap2	ArrayMap
    //   320	238	11	localArrayList	ArrayList
    //   429	88	12	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   124	183	560	finally
    //   183	243	560	finally
    //   243	293	560	finally
    //   296	334	560	finally
    //   334	374	560	finally
    //   385	393	560	finally
    //   393	423	560	finally
    //   435	445	560	finally
    //   445	528	560	finally
    //   531	538	560	finally
    //   111	124	575	finally
    //   538	550	575	finally
    //   561	575	575	finally
  }
  
  /* Error */
  public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String paramString)
  {
    // Byte code:
    //   0: ldc_w 583
    //   3: iconst_1
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_2
    //   8: aload_1
    //   9: ifnonnull +11 -> 20
    //   12: aload_2
    //   13: iconst_1
    //   14: invokevirtual 172	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   17: goto +9 -> 26
    //   20: aload_2
    //   21: iconst_1
    //   22: aload_1
    //   23: invokevirtual 176	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   26: aload_0
    //   27: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   30: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   33: aload_0
    //   34: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   37: invokevirtual 256	androidx/room/RoomDatabase:beginTransaction	()V
    //   40: aload_0
    //   41: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   44: aload_2
    //   45: iconst_1
    //   46: aconst_null
    //   47: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   50: astore_3
    //   51: aload_3
    //   52: ldc_w 300
    //   55: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   58: istore 4
    //   60: aload_3
    //   61: ldc_w 302
    //   64: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 5
    //   69: aload_3
    //   70: ldc_w 310
    //   73: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   76: istore 6
    //   78: aload_3
    //   79: ldc_w 318
    //   82: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 7
    //   87: new 89	androidx/collection/ArrayMap
    //   90: astore 8
    //   92: aload 8
    //   94: invokespecial 557	androidx/collection/ArrayMap:<init>	()V
    //   97: new 89	androidx/collection/ArrayMap
    //   100: astore 9
    //   102: aload 9
    //   104: invokespecial 557	androidx/collection/ArrayMap:<init>	()V
    //   107: aload_3
    //   108: invokeinterface 198 1 0
    //   113: ifeq +108 -> 221
    //   116: aload_3
    //   117: iload 4
    //   119: invokeinterface 202 2 0
    //   124: ifne +43 -> 167
    //   127: aload_3
    //   128: iload 4
    //   130: invokeinterface 206 2 0
    //   135: astore_1
    //   136: aload 8
    //   138: aload_1
    //   139: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   142: checkcast 119	java/util/ArrayList
    //   145: ifnonnull +22 -> 167
    //   148: new 119	java/util/ArrayList
    //   151: astore 10
    //   153: aload 10
    //   155: invokespecial 558	java/util/ArrayList:<init>	()V
    //   158: aload 8
    //   160: aload_1
    //   161: aload 10
    //   163: invokevirtual 123	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   166: pop
    //   167: aload_3
    //   168: iload 4
    //   170: invokeinterface 202 2 0
    //   175: ifne -68 -> 107
    //   178: aload_3
    //   179: iload 4
    //   181: invokeinterface 206 2 0
    //   186: astore_1
    //   187: aload 9
    //   189: aload_1
    //   190: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   193: checkcast 119	java/util/ArrayList
    //   196: ifnonnull -89 -> 107
    //   199: new 119	java/util/ArrayList
    //   202: astore 10
    //   204: aload 10
    //   206: invokespecial 558	java/util/ArrayList:<init>	()V
    //   209: aload 9
    //   211: aload_1
    //   212: aload 10
    //   214: invokevirtual 123	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   217: pop
    //   218: goto -111 -> 107
    //   221: aload_3
    //   222: iconst_m1
    //   223: invokeinterface 561 2 0
    //   228: pop
    //   229: aload_0
    //   230: aload 8
    //   232: invokespecial 229	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkTagAsjavaLangString	(Landroidx/collection/ArrayMap;)V
    //   235: aload_0
    //   236: aload 9
    //   238: invokespecial 125	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkProgressAsandroidxWorkData	(Landroidx/collection/ArrayMap;)V
    //   241: new 119	java/util/ArrayList
    //   244: astore 11
    //   246: aload 11
    //   248: aload_3
    //   249: invokeinterface 335 1 0
    //   254: invokespecial 336	java/util/ArrayList:<init>	(I)V
    //   257: aload_3
    //   258: invokeinterface 198 1 0
    //   263: ifeq +187 -> 450
    //   266: aload_3
    //   267: iload 4
    //   269: invokeinterface 202 2 0
    //   274: ifne +23 -> 297
    //   277: aload 8
    //   279: aload_3
    //   280: iload 4
    //   282: invokeinterface 206 2 0
    //   287: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   290: checkcast 119	java/util/ArrayList
    //   293: astore_1
    //   294: goto +5 -> 299
    //   297: aconst_null
    //   298: astore_1
    //   299: aload_1
    //   300: astore 10
    //   302: aload_1
    //   303: ifnonnull +13 -> 316
    //   306: new 119	java/util/ArrayList
    //   309: astore 10
    //   311: aload 10
    //   313: invokespecial 558	java/util/ArrayList:<init>	()V
    //   316: aload_3
    //   317: iload 4
    //   319: invokeinterface 202 2 0
    //   324: ifne +23 -> 347
    //   327: aload 9
    //   329: aload_3
    //   330: iload 4
    //   332: invokeinterface 206 2 0
    //   337: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   340: checkcast 119	java/util/ArrayList
    //   343: astore_1
    //   344: goto +5 -> 349
    //   347: aconst_null
    //   348: astore_1
    //   349: aload_1
    //   350: astore 12
    //   352: aload_1
    //   353: ifnonnull +13 -> 366
    //   356: new 119	java/util/ArrayList
    //   359: astore 12
    //   361: aload 12
    //   363: invokespecial 558	java/util/ArrayList:<init>	()V
    //   366: new 563	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   369: astore_1
    //   370: aload_1
    //   371: invokespecial 564	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   374: aload_1
    //   375: aload_3
    //   376: iload 4
    //   378: invokeinterface 206 2 0
    //   383: putfield 565	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   386: aload_1
    //   387: aload_3
    //   388: iload 5
    //   390: invokeinterface 343 2 0
    //   395: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   398: putfield 566	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   401: aload_1
    //   402: aload_3
    //   403: iload 6
    //   405: invokeinterface 214 2 0
    //   410: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   413: putfield 567	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   416: aload_1
    //   417: aload_3
    //   418: iload 7
    //   420: invokeinterface 343 2 0
    //   425: putfield 568	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   428: aload_1
    //   429: aload 10
    //   431: putfield 572	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   434: aload_1
    //   435: aload 12
    //   437: putfield 575	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   440: aload 11
    //   442: aload_1
    //   443: invokevirtual 224	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   446: pop
    //   447: goto -190 -> 257
    //   450: aload_0
    //   451: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   454: invokevirtual 264	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   457: aload_3
    //   458: invokeinterface 195 1 0
    //   463: aload_2
    //   464: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   467: aload_0
    //   468: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   471: invokevirtual 267	androidx/room/RoomDatabase:endTransaction	()V
    //   474: aload 11
    //   476: areturn
    //   477: astore_1
    //   478: aload_3
    //   479: invokeinterface 195 1 0
    //   484: aload_2
    //   485: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   488: aload_1
    //   489: athrow
    //   490: astore_1
    //   491: aload_0
    //   492: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   495: invokevirtual 267	androidx/room/RoomDatabase:endTransaction	()V
    //   498: aload_1
    //   499: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	500	0	this	WorkSpecDao_Impl
    //   0	500	1	paramString	String
    //   7	478	2	localRoomSQLiteQuery	RoomSQLiteQuery
    //   50	429	3	localCursor	Cursor
    //   58	319	4	i	int
    //   67	322	5	j	int
    //   76	328	6	k	int
    //   85	334	7	m	int
    //   90	188	8	localArrayMap1	ArrayMap
    //   100	228	9	localArrayMap2	ArrayMap
    //   151	279	10	localObject1	Object
    //   244	231	11	localArrayList	ArrayList
    //   350	86	12	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   51	107	477	finally
    //   107	167	477	finally
    //   167	218	477	finally
    //   221	257	477	finally
    //   257	294	477	finally
    //   306	316	477	finally
    //   316	344	477	finally
    //   356	366	477	finally
    //   366	447	477	finally
    //   450	457	477	finally
    //   40	51	490	finally
    //   457	467	490	finally
    //   478	490	490	finally
  }
  
  /* Error */
  public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String paramString)
  {
    // Byte code:
    //   0: ldc_w 587
    //   3: iconst_1
    //   4: invokestatic 156	androidx/room/RoomSQLiteQuery:acquire	(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;
    //   7: astore_2
    //   8: aload_1
    //   9: ifnonnull +11 -> 20
    //   12: aload_2
    //   13: iconst_1
    //   14: invokevirtual 172	androidx/room/RoomSQLiteQuery:bindNull	(I)V
    //   17: goto +9 -> 26
    //   20: aload_2
    //   21: iconst_1
    //   22: aload_1
    //   23: invokevirtual 176	androidx/room/RoomSQLiteQuery:bindString	(ILjava/lang/String;)V
    //   26: aload_0
    //   27: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   30: invokevirtual 244	androidx/room/RoomDatabase:assertNotSuspendingTransaction	()V
    //   33: aload_0
    //   34: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   37: invokevirtual 256	androidx/room/RoomDatabase:beginTransaction	()V
    //   40: aload_0
    //   41: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   44: aload_2
    //   45: iconst_1
    //   46: aconst_null
    //   47: invokestatic 182	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   50: astore_3
    //   51: aload_3
    //   52: ldc_w 300
    //   55: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   58: istore 4
    //   60: aload_3
    //   61: ldc_w 302
    //   64: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   67: istore 5
    //   69: aload_3
    //   70: ldc_w 310
    //   73: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   76: istore 6
    //   78: aload_3
    //   79: ldc_w 318
    //   82: invokestatic 284	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
    //   85: istore 7
    //   87: new 89	androidx/collection/ArrayMap
    //   90: astore 8
    //   92: aload 8
    //   94: invokespecial 557	androidx/collection/ArrayMap:<init>	()V
    //   97: new 89	androidx/collection/ArrayMap
    //   100: astore 9
    //   102: aload 9
    //   104: invokespecial 557	androidx/collection/ArrayMap:<init>	()V
    //   107: aload_3
    //   108: invokeinterface 198 1 0
    //   113: ifeq +108 -> 221
    //   116: aload_3
    //   117: iload 4
    //   119: invokeinterface 202 2 0
    //   124: ifne +43 -> 167
    //   127: aload_3
    //   128: iload 4
    //   130: invokeinterface 206 2 0
    //   135: astore_1
    //   136: aload 8
    //   138: aload_1
    //   139: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   142: checkcast 119	java/util/ArrayList
    //   145: ifnonnull +22 -> 167
    //   148: new 119	java/util/ArrayList
    //   151: astore 10
    //   153: aload 10
    //   155: invokespecial 558	java/util/ArrayList:<init>	()V
    //   158: aload 8
    //   160: aload_1
    //   161: aload 10
    //   163: invokevirtual 123	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   166: pop
    //   167: aload_3
    //   168: iload 4
    //   170: invokeinterface 202 2 0
    //   175: ifne -68 -> 107
    //   178: aload_3
    //   179: iload 4
    //   181: invokeinterface 206 2 0
    //   186: astore_1
    //   187: aload 9
    //   189: aload_1
    //   190: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   193: checkcast 119	java/util/ArrayList
    //   196: ifnonnull -89 -> 107
    //   199: new 119	java/util/ArrayList
    //   202: astore 10
    //   204: aload 10
    //   206: invokespecial 558	java/util/ArrayList:<init>	()V
    //   209: aload 9
    //   211: aload_1
    //   212: aload 10
    //   214: invokevirtual 123	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   217: pop
    //   218: goto -111 -> 107
    //   221: aload_3
    //   222: iconst_m1
    //   223: invokeinterface 561 2 0
    //   228: pop
    //   229: aload_0
    //   230: aload 8
    //   232: invokespecial 229	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkTagAsjavaLangString	(Landroidx/collection/ArrayMap;)V
    //   235: aload_0
    //   236: aload 9
    //   238: invokespecial 125	androidx/work/impl/model/WorkSpecDao_Impl:__fetchRelationshipWorkProgressAsandroidxWorkData	(Landroidx/collection/ArrayMap;)V
    //   241: new 119	java/util/ArrayList
    //   244: astore 11
    //   246: aload 11
    //   248: aload_3
    //   249: invokeinterface 335 1 0
    //   254: invokespecial 336	java/util/ArrayList:<init>	(I)V
    //   257: aload_3
    //   258: invokeinterface 198 1 0
    //   263: ifeq +187 -> 450
    //   266: aload_3
    //   267: iload 4
    //   269: invokeinterface 202 2 0
    //   274: ifne +23 -> 297
    //   277: aload 8
    //   279: aload_3
    //   280: iload 4
    //   282: invokeinterface 206 2 0
    //   287: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   290: checkcast 119	java/util/ArrayList
    //   293: astore_1
    //   294: goto +5 -> 299
    //   297: aconst_null
    //   298: astore_1
    //   299: aload_1
    //   300: astore 10
    //   302: aload_1
    //   303: ifnonnull +13 -> 316
    //   306: new 119	java/util/ArrayList
    //   309: astore 10
    //   311: aload 10
    //   313: invokespecial 558	java/util/ArrayList:<init>	()V
    //   316: aload_3
    //   317: iload 4
    //   319: invokeinterface 202 2 0
    //   324: ifne +23 -> 347
    //   327: aload 9
    //   329: aload_3
    //   330: iload 4
    //   332: invokeinterface 206 2 0
    //   337: invokevirtual 210	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   340: checkcast 119	java/util/ArrayList
    //   343: astore_1
    //   344: goto +5 -> 349
    //   347: aconst_null
    //   348: astore_1
    //   349: aload_1
    //   350: astore 12
    //   352: aload_1
    //   353: ifnonnull +13 -> 366
    //   356: new 119	java/util/ArrayList
    //   359: astore 12
    //   361: aload 12
    //   363: invokespecial 558	java/util/ArrayList:<init>	()V
    //   366: new 563	androidx/work/impl/model/WorkSpec$WorkInfoPojo
    //   369: astore_1
    //   370: aload_1
    //   371: invokespecial 564	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
    //   374: aload_1
    //   375: aload_3
    //   376: iload 4
    //   378: invokeinterface 206 2 0
    //   383: putfield 565	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
    //   386: aload_1
    //   387: aload_3
    //   388: iload 5
    //   390: invokeinterface 343 2 0
    //   395: invokestatic 394	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
    //   398: putfield 566	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
    //   401: aload_1
    //   402: aload_3
    //   403: iload 6
    //   405: invokeinterface 214 2 0
    //   410: invokestatic 220	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
    //   413: putfield 567	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
    //   416: aload_1
    //   417: aload_3
    //   418: iload 7
    //   420: invokeinterface 343 2 0
    //   425: putfield 568	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
    //   428: aload_1
    //   429: aload 10
    //   431: putfield 572	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
    //   434: aload_1
    //   435: aload 12
    //   437: putfield 575	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
    //   440: aload 11
    //   442: aload_1
    //   443: invokevirtual 224	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   446: pop
    //   447: goto -190 -> 257
    //   450: aload_0
    //   451: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   454: invokevirtual 264	androidx/room/RoomDatabase:setTransactionSuccessful	()V
    //   457: aload_3
    //   458: invokeinterface 195 1 0
    //   463: aload_2
    //   464: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   467: aload_0
    //   468: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   471: invokevirtual 267	androidx/room/RoomDatabase:endTransaction	()V
    //   474: aload 11
    //   476: areturn
    //   477: astore_1
    //   478: aload_3
    //   479: invokeinterface 195 1 0
    //   484: aload_2
    //   485: invokevirtual 458	androidx/room/RoomSQLiteQuery:release	()V
    //   488: aload_1
    //   489: athrow
    //   490: astore_1
    //   491: aload_0
    //   492: getfield 55	androidx/work/impl/model/WorkSpecDao_Impl:__db	Landroidx/room/RoomDatabase;
    //   495: invokevirtual 267	androidx/room/RoomDatabase:endTransaction	()V
    //   498: aload_1
    //   499: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	500	0	this	WorkSpecDao_Impl
    //   0	500	1	paramString	String
    //   7	478	2	localRoomSQLiteQuery	RoomSQLiteQuery
    //   50	429	3	localCursor	Cursor
    //   58	319	4	i	int
    //   67	322	5	j	int
    //   76	328	6	k	int
    //   85	334	7	m	int
    //   90	188	8	localArrayMap1	ArrayMap
    //   100	228	9	localArrayMap2	ArrayMap
    //   151	279	10	localObject1	Object
    //   244	231	11	localArrayList	ArrayList
    //   350	86	12	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   51	107	477	finally
    //   107	167	477	finally
    //   167	218	477	finally
    //   221	257	477	finally
    //   257	294	477	finally
    //   306	316	477	finally
    //   316	344	477	finally
    //   356	366	477	finally
    //   366	447	477	finally
    //   450	457	477	finally
    //   40	51	490	finally
    //   457	467	490	finally
    //   478	490	490	finally
  }
  
  public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> paramList)
  {
    final Object localObject = StringUtil.newStringBuilder();
    ((StringBuilder)localObject).append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
    int i = paramList.size();
    StringUtil.appendPlaceholders((StringBuilder)localObject, i);
    ((StringBuilder)localObject).append(")");
    localObject = RoomSQLiteQuery.acquire(((StringBuilder)localObject).toString(), i + 0);
    paramList = paramList.iterator();
    for (i = 1; paramList.hasNext(); i++)
    {
      String str = (String)paramList.next();
      if (str == null) {
        ((RoomSQLiteQuery)localObject).bindNull(i);
      } else {
        ((RoomSQLiteQuery)localObject).bindString(i, str);
      }
    }
    paramList = __db.getInvalidationTracker();
    localObject = new Callable()
    {
      /* Error */
      public List<WorkSpec.WorkInfoPojo> call()
        throws Exception
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   4: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   7: invokevirtual 43	androidx/room/RoomDatabase:beginTransaction	()V
        //   10: aload_0
        //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   14: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   17: aload_0
        //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$11:val$_statement	Landroidx/room/RoomSQLiteQuery;
        //   21: iconst_1
        //   22: aconst_null
        //   23: invokestatic 49	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   26: astore_1
        //   27: aload_1
        //   28: ldc 51
        //   30: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   33: istore_2
        //   34: aload_1
        //   35: ldc 59
        //   37: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   40: istore_3
        //   41: aload_1
        //   42: ldc 61
        //   44: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   47: istore 4
        //   49: aload_1
        //   50: ldc 63
        //   52: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   55: istore 5
        //   57: new 65	androidx/collection/ArrayMap
        //   60: astore 6
        //   62: aload 6
        //   64: invokespecial 66	androidx/collection/ArrayMap:<init>	()V
        //   67: new 65	androidx/collection/ArrayMap
        //   70: astore 7
        //   72: aload 7
        //   74: invokespecial 66	androidx/collection/ArrayMap:<init>	()V
        //   77: aload_1
        //   78: invokeinterface 72 1 0
        //   83: ifeq +110 -> 193
        //   86: aload_1
        //   87: iload_2
        //   88: invokeinterface 76 2 0
        //   93: ifne +45 -> 138
        //   96: aload_1
        //   97: iload_2
        //   98: invokeinterface 80 2 0
        //   103: astore 8
        //   105: aload 6
        //   107: aload 8
        //   109: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   112: checkcast 88	java/util/ArrayList
        //   115: ifnonnull +23 -> 138
        //   118: new 88	java/util/ArrayList
        //   121: astore 9
        //   123: aload 9
        //   125: invokespecial 89	java/util/ArrayList:<init>	()V
        //   128: aload 6
        //   130: aload 8
        //   132: aload 9
        //   134: invokevirtual 93	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   137: pop
        //   138: aload_1
        //   139: iload_2
        //   140: invokeinterface 76 2 0
        //   145: ifne -68 -> 77
        //   148: aload_1
        //   149: iload_2
        //   150: invokeinterface 80 2 0
        //   155: astore 8
        //   157: aload 7
        //   159: aload 8
        //   161: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   164: checkcast 88	java/util/ArrayList
        //   167: ifnonnull -90 -> 77
        //   170: new 88	java/util/ArrayList
        //   173: astore 9
        //   175: aload 9
        //   177: invokespecial 89	java/util/ArrayList:<init>	()V
        //   180: aload 7
        //   182: aload 8
        //   184: aload 9
        //   186: invokevirtual 93	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   189: pop
        //   190: goto -113 -> 77
        //   193: aload_1
        //   194: iconst_m1
        //   195: invokeinterface 96 2 0
        //   200: pop
        //   201: aload_0
        //   202: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   205: aload 6
        //   207: invokestatic 100	androidx/work/impl/model/WorkSpecDao_Impl:access$100	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   210: aload_0
        //   211: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   214: aload 7
        //   216: invokestatic 103	androidx/work/impl/model/WorkSpecDao_Impl:access$200	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   219: new 88	java/util/ArrayList
        //   222: astore 10
        //   224: aload 10
        //   226: aload_1
        //   227: invokeinterface 107 1 0
        //   232: invokespecial 110	java/util/ArrayList:<init>	(I)V
        //   235: aload_1
        //   236: invokeinterface 72 1 0
        //   241: ifeq +198 -> 439
        //   244: aload_1
        //   245: iload_2
        //   246: invokeinterface 76 2 0
        //   251: ifne +23 -> 274
        //   254: aload 6
        //   256: aload_1
        //   257: iload_2
        //   258: invokeinterface 80 2 0
        //   263: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   266: checkcast 88	java/util/ArrayList
        //   269: astore 9
        //   271: goto +6 -> 277
        //   274: aconst_null
        //   275: astore 9
        //   277: aload 9
        //   279: astore 8
        //   281: aload 9
        //   283: ifnonnull +13 -> 296
        //   286: new 88	java/util/ArrayList
        //   289: astore 8
        //   291: aload 8
        //   293: invokespecial 89	java/util/ArrayList:<init>	()V
        //   296: aload_1
        //   297: iload_2
        //   298: invokeinterface 76 2 0
        //   303: ifne +23 -> 326
        //   306: aload 7
        //   308: aload_1
        //   309: iload_2
        //   310: invokeinterface 80 2 0
        //   315: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   318: checkcast 88	java/util/ArrayList
        //   321: astore 9
        //   323: goto +6 -> 329
        //   326: aconst_null
        //   327: astore 9
        //   329: aload 9
        //   331: astore 11
        //   333: aload 9
        //   335: ifnonnull +13 -> 348
        //   338: new 88	java/util/ArrayList
        //   341: astore 11
        //   343: aload 11
        //   345: invokespecial 89	java/util/ArrayList:<init>	()V
        //   348: new 112	androidx/work/impl/model/WorkSpec$WorkInfoPojo
        //   351: astore 9
        //   353: aload 9
        //   355: invokespecial 113	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
        //   358: aload 9
        //   360: aload_1
        //   361: iload_2
        //   362: invokeinterface 80 2 0
        //   367: putfield 116	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
        //   370: aload 9
        //   372: aload_1
        //   373: iload_3
        //   374: invokeinterface 120 2 0
        //   379: invokestatic 126	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
        //   382: putfield 129	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
        //   385: aload 9
        //   387: aload_1
        //   388: iload 4
        //   390: invokeinterface 133 2 0
        //   395: invokestatic 139	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
        //   398: putfield 142	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
        //   401: aload 9
        //   403: aload_1
        //   404: iload 5
        //   406: invokeinterface 120 2 0
        //   411: putfield 146	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
        //   414: aload 9
        //   416: aload 8
        //   418: putfield 150	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
        //   421: aload 9
        //   423: aload 11
        //   425: putfield 153	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
        //   428: aload 10
        //   430: aload 9
        //   432: invokevirtual 157	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   435: pop
        //   436: goto -201 -> 235
        //   439: aload_0
        //   440: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   443: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   446: invokevirtual 160	androidx/room/RoomDatabase:setTransactionSuccessful	()V
        //   449: aload_1
        //   450: invokeinterface 163 1 0
        //   455: aload_0
        //   456: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   459: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   462: invokevirtual 166	androidx/room/RoomDatabase:endTransaction	()V
        //   465: aload 10
        //   467: areturn
        //   468: astore 9
        //   470: aload_1
        //   471: invokeinterface 163 1 0
        //   476: aload 9
        //   478: athrow
        //   479: astore 9
        //   481: aload_0
        //   482: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$11:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   485: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   488: invokevirtual 166	androidx/room/RoomDatabase:endTransaction	()V
        //   491: aload 9
        //   493: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	494	0	this	11
        //   26	445	1	localCursor	Cursor
        //   33	329	2	i	int
        //   40	334	3	j	int
        //   47	342	4	k	int
        //   55	350	5	m	int
        //   60	195	6	localArrayMap1	ArrayMap
        //   70	237	7	localArrayMap2	ArrayMap
        //   103	314	8	localObject1	Object
        //   121	310	9	localObject2	Object
        //   468	9	9	localObject3	Object
        //   479	13	9	localObject4	Object
        //   222	244	10	localArrayList	ArrayList
        //   331	93	11	localObject5	Object
        // Exception table:
        //   from	to	target	type
        //   27	77	468	finally
        //   77	138	468	finally
        //   138	190	468	finally
        //   193	235	468	finally
        //   235	271	468	finally
        //   286	296	468	finally
        //   296	323	468	finally
        //   338	348	468	finally
        //   348	436	468	finally
        //   439	449	468	finally
        //   10	27	479	finally
        //   449	455	479	finally
        //   470	479	479	finally
      }
      
      public void finalize()
      {
        localObject.release();
      }
    };
    return paramList.createLiveData(new String[] { "WorkTag", "WorkProgress", "workspec" }, true, (Callable)localObject);
  }
  
  public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String paramString)
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
    if (paramString == null) {
      ((RoomSQLiteQuery)localObject).bindNull(1);
    } else {
      ((RoomSQLiteQuery)localObject).bindString(1, paramString);
    }
    paramString = __db.getInvalidationTracker();
    localObject = new Callable()
    {
      /* Error */
      public List<WorkSpec.WorkInfoPojo> call()
        throws Exception
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   4: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   7: invokevirtual 43	androidx/room/RoomDatabase:beginTransaction	()V
        //   10: aload_0
        //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   14: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   17: aload_0
        //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$13:val$_statement	Landroidx/room/RoomSQLiteQuery;
        //   21: iconst_1
        //   22: aconst_null
        //   23: invokestatic 49	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   26: astore_1
        //   27: aload_1
        //   28: ldc 51
        //   30: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   33: istore_2
        //   34: aload_1
        //   35: ldc 59
        //   37: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   40: istore_3
        //   41: aload_1
        //   42: ldc 61
        //   44: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   47: istore 4
        //   49: aload_1
        //   50: ldc 63
        //   52: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   55: istore 5
        //   57: new 65	androidx/collection/ArrayMap
        //   60: astore 6
        //   62: aload 6
        //   64: invokespecial 66	androidx/collection/ArrayMap:<init>	()V
        //   67: new 65	androidx/collection/ArrayMap
        //   70: astore 7
        //   72: aload 7
        //   74: invokespecial 66	androidx/collection/ArrayMap:<init>	()V
        //   77: aload_1
        //   78: invokeinterface 72 1 0
        //   83: ifeq +110 -> 193
        //   86: aload_1
        //   87: iload_2
        //   88: invokeinterface 76 2 0
        //   93: ifne +45 -> 138
        //   96: aload_1
        //   97: iload_2
        //   98: invokeinterface 80 2 0
        //   103: astore 8
        //   105: aload 6
        //   107: aload 8
        //   109: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   112: checkcast 88	java/util/ArrayList
        //   115: ifnonnull +23 -> 138
        //   118: new 88	java/util/ArrayList
        //   121: astore 9
        //   123: aload 9
        //   125: invokespecial 89	java/util/ArrayList:<init>	()V
        //   128: aload 6
        //   130: aload 8
        //   132: aload 9
        //   134: invokevirtual 93	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   137: pop
        //   138: aload_1
        //   139: iload_2
        //   140: invokeinterface 76 2 0
        //   145: ifne -68 -> 77
        //   148: aload_1
        //   149: iload_2
        //   150: invokeinterface 80 2 0
        //   155: astore 9
        //   157: aload 7
        //   159: aload 9
        //   161: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   164: checkcast 88	java/util/ArrayList
        //   167: ifnonnull -90 -> 77
        //   170: new 88	java/util/ArrayList
        //   173: astore 8
        //   175: aload 8
        //   177: invokespecial 89	java/util/ArrayList:<init>	()V
        //   180: aload 7
        //   182: aload 9
        //   184: aload 8
        //   186: invokevirtual 93	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   189: pop
        //   190: goto -113 -> 77
        //   193: aload_1
        //   194: iconst_m1
        //   195: invokeinterface 96 2 0
        //   200: pop
        //   201: aload_0
        //   202: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   205: aload 6
        //   207: invokestatic 100	androidx/work/impl/model/WorkSpecDao_Impl:access$100	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   210: aload_0
        //   211: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   214: aload 7
        //   216: invokestatic 103	androidx/work/impl/model/WorkSpecDao_Impl:access$200	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   219: new 88	java/util/ArrayList
        //   222: astore 10
        //   224: aload 10
        //   226: aload_1
        //   227: invokeinterface 107 1 0
        //   232: invokespecial 110	java/util/ArrayList:<init>	(I)V
        //   235: aload_1
        //   236: invokeinterface 72 1 0
        //   241: ifeq +198 -> 439
        //   244: aload_1
        //   245: iload_2
        //   246: invokeinterface 76 2 0
        //   251: ifne +23 -> 274
        //   254: aload 6
        //   256: aload_1
        //   257: iload_2
        //   258: invokeinterface 80 2 0
        //   263: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   266: checkcast 88	java/util/ArrayList
        //   269: astore 9
        //   271: goto +6 -> 277
        //   274: aconst_null
        //   275: astore 9
        //   277: aload 9
        //   279: astore 8
        //   281: aload 9
        //   283: ifnonnull +13 -> 296
        //   286: new 88	java/util/ArrayList
        //   289: astore 8
        //   291: aload 8
        //   293: invokespecial 89	java/util/ArrayList:<init>	()V
        //   296: aload_1
        //   297: iload_2
        //   298: invokeinterface 76 2 0
        //   303: ifne +23 -> 326
        //   306: aload 7
        //   308: aload_1
        //   309: iload_2
        //   310: invokeinterface 80 2 0
        //   315: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   318: checkcast 88	java/util/ArrayList
        //   321: astore 9
        //   323: goto +6 -> 329
        //   326: aconst_null
        //   327: astore 9
        //   329: aload 9
        //   331: astore 11
        //   333: aload 9
        //   335: ifnonnull +13 -> 348
        //   338: new 88	java/util/ArrayList
        //   341: astore 11
        //   343: aload 11
        //   345: invokespecial 89	java/util/ArrayList:<init>	()V
        //   348: new 112	androidx/work/impl/model/WorkSpec$WorkInfoPojo
        //   351: astore 9
        //   353: aload 9
        //   355: invokespecial 113	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
        //   358: aload 9
        //   360: aload_1
        //   361: iload_2
        //   362: invokeinterface 80 2 0
        //   367: putfield 116	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
        //   370: aload 9
        //   372: aload_1
        //   373: iload_3
        //   374: invokeinterface 120 2 0
        //   379: invokestatic 126	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
        //   382: putfield 129	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
        //   385: aload 9
        //   387: aload_1
        //   388: iload 4
        //   390: invokeinterface 133 2 0
        //   395: invokestatic 139	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
        //   398: putfield 142	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
        //   401: aload 9
        //   403: aload_1
        //   404: iload 5
        //   406: invokeinterface 120 2 0
        //   411: putfield 146	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
        //   414: aload 9
        //   416: aload 8
        //   418: putfield 150	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
        //   421: aload 9
        //   423: aload 11
        //   425: putfield 153	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
        //   428: aload 10
        //   430: aload 9
        //   432: invokevirtual 157	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   435: pop
        //   436: goto -201 -> 235
        //   439: aload_0
        //   440: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   443: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   446: invokevirtual 160	androidx/room/RoomDatabase:setTransactionSuccessful	()V
        //   449: aload_1
        //   450: invokeinterface 163 1 0
        //   455: aload_0
        //   456: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   459: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   462: invokevirtual 166	androidx/room/RoomDatabase:endTransaction	()V
        //   465: aload 10
        //   467: areturn
        //   468: astore 9
        //   470: aload_1
        //   471: invokeinterface 163 1 0
        //   476: aload 9
        //   478: athrow
        //   479: astore 9
        //   481: aload_0
        //   482: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$13:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   485: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   488: invokevirtual 166	androidx/room/RoomDatabase:endTransaction	()V
        //   491: aload 9
        //   493: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	494	0	this	13
        //   26	445	1	localCursor	Cursor
        //   33	329	2	i	int
        //   40	334	3	j	int
        //   47	342	4	k	int
        //   55	350	5	m	int
        //   60	195	6	localArrayMap1	ArrayMap
        //   70	237	7	localArrayMap2	ArrayMap
        //   103	314	8	localObject1	Object
        //   121	310	9	localObject2	Object
        //   468	9	9	localObject3	Object
        //   479	13	9	localObject4	Object
        //   222	244	10	localArrayList	ArrayList
        //   331	93	11	localObject5	Object
        // Exception table:
        //   from	to	target	type
        //   27	77	468	finally
        //   77	138	468	finally
        //   138	190	468	finally
        //   193	235	468	finally
        //   235	271	468	finally
        //   286	296	468	finally
        //   296	323	468	finally
        //   338	348	468	finally
        //   348	436	468	finally
        //   439	449	468	finally
        //   10	27	479	finally
        //   449	455	479	finally
        //   470	479	479	finally
      }
      
      public void finalize()
      {
        localObject.release();
      }
    };
    return paramString.createLiveData(new String[] { "WorkTag", "WorkProgress", "workspec", "workname" }, true, (Callable)localObject);
  }
  
  public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String paramString)
  {
    final Object localObject = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
    if (paramString == null) {
      ((RoomSQLiteQuery)localObject).bindNull(1);
    } else {
      ((RoomSQLiteQuery)localObject).bindString(1, paramString);
    }
    paramString = __db.getInvalidationTracker();
    localObject = new Callable()
    {
      /* Error */
      public List<WorkSpec.WorkInfoPojo> call()
        throws Exception
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   4: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   7: invokevirtual 43	androidx/room/RoomDatabase:beginTransaction	()V
        //   10: aload_0
        //   11: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   14: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   17: aload_0
        //   18: getfield 22	androidx/work/impl/model/WorkSpecDao_Impl$12:val$_statement	Landroidx/room/RoomSQLiteQuery;
        //   21: iconst_1
        //   22: aconst_null
        //   23: invokestatic 49	androidx/room/util/DBUtil:query	(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   26: astore_1
        //   27: aload_1
        //   28: ldc 51
        //   30: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   33: istore_2
        //   34: aload_1
        //   35: ldc 59
        //   37: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   40: istore_3
        //   41: aload_1
        //   42: ldc 61
        //   44: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   47: istore 4
        //   49: aload_1
        //   50: ldc 63
        //   52: invokestatic 57	androidx/room/util/CursorUtil:getColumnIndexOrThrow	(Landroid/database/Cursor;Ljava/lang/String;)I
        //   55: istore 5
        //   57: new 65	androidx/collection/ArrayMap
        //   60: astore 6
        //   62: aload 6
        //   64: invokespecial 66	androidx/collection/ArrayMap:<init>	()V
        //   67: new 65	androidx/collection/ArrayMap
        //   70: astore 7
        //   72: aload 7
        //   74: invokespecial 66	androidx/collection/ArrayMap:<init>	()V
        //   77: aload_1
        //   78: invokeinterface 72 1 0
        //   83: ifeq +110 -> 193
        //   86: aload_1
        //   87: iload_2
        //   88: invokeinterface 76 2 0
        //   93: ifne +45 -> 138
        //   96: aload_1
        //   97: iload_2
        //   98: invokeinterface 80 2 0
        //   103: astore 8
        //   105: aload 6
        //   107: aload 8
        //   109: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   112: checkcast 88	java/util/ArrayList
        //   115: ifnonnull +23 -> 138
        //   118: new 88	java/util/ArrayList
        //   121: astore 9
        //   123: aload 9
        //   125: invokespecial 89	java/util/ArrayList:<init>	()V
        //   128: aload 6
        //   130: aload 8
        //   132: aload 9
        //   134: invokevirtual 93	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   137: pop
        //   138: aload_1
        //   139: iload_2
        //   140: invokeinterface 76 2 0
        //   145: ifne -68 -> 77
        //   148: aload_1
        //   149: iload_2
        //   150: invokeinterface 80 2 0
        //   155: astore 8
        //   157: aload 7
        //   159: aload 8
        //   161: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   164: checkcast 88	java/util/ArrayList
        //   167: ifnonnull -90 -> 77
        //   170: new 88	java/util/ArrayList
        //   173: astore 9
        //   175: aload 9
        //   177: invokespecial 89	java/util/ArrayList:<init>	()V
        //   180: aload 7
        //   182: aload 8
        //   184: aload 9
        //   186: invokevirtual 93	androidx/collection/SimpleArrayMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   189: pop
        //   190: goto -113 -> 77
        //   193: aload_1
        //   194: iconst_m1
        //   195: invokeinterface 96 2 0
        //   200: pop
        //   201: aload_0
        //   202: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   205: aload 6
        //   207: invokestatic 100	androidx/work/impl/model/WorkSpecDao_Impl:access$100	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   210: aload_0
        //   211: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   214: aload 7
        //   216: invokestatic 103	androidx/work/impl/model/WorkSpecDao_Impl:access$200	(Landroidx/work/impl/model/WorkSpecDao_Impl;Landroidx/collection/ArrayMap;)V
        //   219: new 88	java/util/ArrayList
        //   222: astore 10
        //   224: aload 10
        //   226: aload_1
        //   227: invokeinterface 107 1 0
        //   232: invokespecial 110	java/util/ArrayList:<init>	(I)V
        //   235: aload_1
        //   236: invokeinterface 72 1 0
        //   241: ifeq +198 -> 439
        //   244: aload_1
        //   245: iload_2
        //   246: invokeinterface 76 2 0
        //   251: ifne +23 -> 274
        //   254: aload 6
        //   256: aload_1
        //   257: iload_2
        //   258: invokeinterface 80 2 0
        //   263: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   266: checkcast 88	java/util/ArrayList
        //   269: astore 8
        //   271: goto +6 -> 277
        //   274: aconst_null
        //   275: astore 8
        //   277: aload 8
        //   279: astore 9
        //   281: aload 8
        //   283: ifnonnull +13 -> 296
        //   286: new 88	java/util/ArrayList
        //   289: astore 9
        //   291: aload 9
        //   293: invokespecial 89	java/util/ArrayList:<init>	()V
        //   296: aload_1
        //   297: iload_2
        //   298: invokeinterface 76 2 0
        //   303: ifne +23 -> 326
        //   306: aload 7
        //   308: aload_1
        //   309: iload_2
        //   310: invokeinterface 80 2 0
        //   315: invokevirtual 86	androidx/collection/SimpleArrayMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   318: checkcast 88	java/util/ArrayList
        //   321: astore 8
        //   323: goto +6 -> 329
        //   326: aconst_null
        //   327: astore 8
        //   329: aload 8
        //   331: astore 11
        //   333: aload 8
        //   335: ifnonnull +13 -> 348
        //   338: new 88	java/util/ArrayList
        //   341: astore 11
        //   343: aload 11
        //   345: invokespecial 89	java/util/ArrayList:<init>	()V
        //   348: new 112	androidx/work/impl/model/WorkSpec$WorkInfoPojo
        //   351: astore 8
        //   353: aload 8
        //   355: invokespecial 113	androidx/work/impl/model/WorkSpec$WorkInfoPojo:<init>	()V
        //   358: aload 8
        //   360: aload_1
        //   361: iload_2
        //   362: invokeinterface 80 2 0
        //   367: putfield 116	androidx/work/impl/model/WorkSpec$WorkInfoPojo:id	Ljava/lang/String;
        //   370: aload 8
        //   372: aload_1
        //   373: iload_3
        //   374: invokeinterface 120 2 0
        //   379: invokestatic 126	androidx/work/impl/model/WorkTypeConverters:intToState	(I)Landroidx/work/WorkInfo$State;
        //   382: putfield 129	androidx/work/impl/model/WorkSpec$WorkInfoPojo:state	Landroidx/work/WorkInfo$State;
        //   385: aload 8
        //   387: aload_1
        //   388: iload 4
        //   390: invokeinterface 133 2 0
        //   395: invokestatic 139	androidx/work/Data:fromByteArray	([B)Landroidx/work/Data;
        //   398: putfield 142	androidx/work/impl/model/WorkSpec$WorkInfoPojo:output	Landroidx/work/Data;
        //   401: aload 8
        //   403: aload_1
        //   404: iload 5
        //   406: invokeinterface 120 2 0
        //   411: putfield 146	androidx/work/impl/model/WorkSpec$WorkInfoPojo:runAttemptCount	I
        //   414: aload 8
        //   416: aload 9
        //   418: putfield 150	androidx/work/impl/model/WorkSpec$WorkInfoPojo:tags	Ljava/util/List;
        //   421: aload 8
        //   423: aload 11
        //   425: putfield 153	androidx/work/impl/model/WorkSpec$WorkInfoPojo:progress	Ljava/util/List;
        //   428: aload 10
        //   430: aload 8
        //   432: invokevirtual 157	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   435: pop
        //   436: goto -201 -> 235
        //   439: aload_0
        //   440: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   443: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   446: invokevirtual 160	androidx/room/RoomDatabase:setTransactionSuccessful	()V
        //   449: aload_1
        //   450: invokeinterface 163 1 0
        //   455: aload_0
        //   456: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   459: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   462: invokevirtual 166	androidx/room/RoomDatabase:endTransaction	()V
        //   465: aload 10
        //   467: areturn
        //   468: astore 8
        //   470: aload_1
        //   471: invokeinterface 163 1 0
        //   476: aload 8
        //   478: athrow
        //   479: astore 8
        //   481: aload_0
        //   482: getfield 20	androidx/work/impl/model/WorkSpecDao_Impl$12:this$0	Landroidx/work/impl/model/WorkSpecDao_Impl;
        //   485: invokestatic 38	androidx/work/impl/model/WorkSpecDao_Impl:access$000	(Landroidx/work/impl/model/WorkSpecDao_Impl;)Landroidx/room/RoomDatabase;
        //   488: invokevirtual 166	androidx/room/RoomDatabase:endTransaction	()V
        //   491: aload 8
        //   493: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	494	0	this	12
        //   26	445	1	localCursor	Cursor
        //   33	329	2	i	int
        //   40	334	3	j	int
        //   47	342	4	k	int
        //   55	350	5	m	int
        //   60	195	6	localArrayMap1	ArrayMap
        //   70	237	7	localArrayMap2	ArrayMap
        //   103	328	8	localObject1	Object
        //   468	9	8	localObject2	Object
        //   479	13	8	localObject3	Object
        //   121	296	9	localObject4	Object
        //   222	244	10	localArrayList	ArrayList
        //   331	93	11	localObject5	Object
        // Exception table:
        //   from	to	target	type
        //   27	77	468	finally
        //   77	138	468	finally
        //   138	190	468	finally
        //   193	235	468	finally
        //   235	271	468	finally
        //   286	296	468	finally
        //   296	323	468	finally
        //   338	348	468	finally
        //   348	436	468	finally
        //   439	449	468	finally
        //   10	27	479	finally
        //   449	455	479	finally
        //   470	479	479	finally
      }
      
      public void finalize()
      {
        localObject.release();
      }
    };
    return paramString.createLiveData(new String[] { "WorkTag", "WorkProgress", "workspec", "worktag" }, true, (Callable)localObject);
  }
  
  public boolean hasUnfinishedWork()
  {
    boolean bool1 = false;
    RoomSQLiteQuery localRoomSQLiteQuery = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
    __db.assertNotSuspendingTransaction();
    Cursor localCursor = DBUtil.query(__db, localRoomSQLiteQuery, false, null);
    boolean bool2 = bool1;
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(0);
        bool2 = bool1;
        if (i != 0) {
          bool2 = true;
        }
      }
      return bool2;
    }
    finally
    {
      localCursor.close();
      localRoomSQLiteQuery.release();
    }
  }
  
  public int incrementWorkSpecRunAttemptCount(String paramString)
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindString(1, paramString);
    }
    __db.beginTransaction();
    try
    {
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfIncrementWorkSpecRunAttemptCount.release(localSupportSQLiteStatement);
    }
  }
  
  public void insertWorkSpec(WorkSpec paramWorkSpec)
  {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try
    {
      __insertionAdapterOfWorkSpec.insert(paramWorkSpec);
      __db.setTransactionSuccessful();
      return;
    }
    finally
    {
      __db.endTransaction();
    }
  }
  
  public int markWorkSpecScheduled(String paramString, long paramLong)
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfMarkWorkSpecScheduled.acquire();
    localSupportSQLiteStatement.bindLong(1, paramLong);
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(2);
    } else {
      localSupportSQLiteStatement.bindString(2, paramString);
    }
    __db.beginTransaction();
    try
    {
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfMarkWorkSpecScheduled.release(localSupportSQLiteStatement);
    }
  }
  
  public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast()
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
    __db.beginTransaction();
    try
    {
      localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(localSupportSQLiteStatement);
    }
  }
  
  public int resetScheduledState()
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfResetScheduledState.acquire();
    __db.beginTransaction();
    try
    {
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfResetScheduledState.release(localSupportSQLiteStatement);
    }
  }
  
  public int resetWorkSpecRunAttemptCount(String paramString)
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindString(1, paramString);
    }
    __db.beginTransaction();
    try
    {
      int i = localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return i;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfResetWorkSpecRunAttemptCount.release(localSupportSQLiteStatement);
    }
  }
  
  public void setOutput(String paramString, Data paramData)
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfSetOutput.acquire();
    paramData = Data.toByteArrayInternal(paramData);
    if (paramData == null) {
      localSupportSQLiteStatement.bindNull(1);
    } else {
      localSupportSQLiteStatement.bindBlob(1, paramData);
    }
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(2);
    } else {
      localSupportSQLiteStatement.bindString(2, paramString);
    }
    __db.beginTransaction();
    try
    {
      localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfSetOutput.release(localSupportSQLiteStatement);
    }
  }
  
  public void setPeriodStartTime(String paramString, long paramLong)
  {
    __db.assertNotSuspendingTransaction();
    SupportSQLiteStatement localSupportSQLiteStatement = __preparedStmtOfSetPeriodStartTime.acquire();
    localSupportSQLiteStatement.bindLong(1, paramLong);
    if (paramString == null) {
      localSupportSQLiteStatement.bindNull(2);
    } else {
      localSupportSQLiteStatement.bindString(2, paramString);
    }
    __db.beginTransaction();
    try
    {
      localSupportSQLiteStatement.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return;
    }
    finally
    {
      __db.endTransaction();
      __preparedStmtOfSetPeriodStartTime.release(localSupportSQLiteStatement);
    }
  }
  
  public int setState(WorkInfo.State paramState, String... paramVarArgs)
  {
    __db.assertNotSuspendingTransaction();
    Object localObject = StringUtil.newStringBuilder();
    ((StringBuilder)localObject).append("UPDATE workspec SET state=");
    ((StringBuilder)localObject).append("?");
    ((StringBuilder)localObject).append(" WHERE id IN (");
    StringUtil.appendPlaceholders((StringBuilder)localObject, paramVarArgs.length);
    ((StringBuilder)localObject).append(")");
    localObject = ((StringBuilder)localObject).toString();
    localObject = __db.compileStatement((String)localObject);
    ((SupportSQLiteProgram)localObject).bindLong(1, WorkTypeConverters.stateToInt(paramState));
    int i = paramVarArgs.length;
    int j = 2;
    for (int k = 0; k < i; k++)
    {
      paramState = paramVarArgs[k];
      if (paramState == null) {
        ((SupportSQLiteProgram)localObject).bindNull(j);
      } else {
        ((SupportSQLiteProgram)localObject).bindString(j, paramState);
      }
      j++;
    }
    __db.beginTransaction();
    try
    {
      k = ((SupportSQLiteStatement)localObject).executeUpdateDelete();
      __db.setTransactionSuccessful();
      return k;
    }
    finally
    {
      __db.endTransaction();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao_Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
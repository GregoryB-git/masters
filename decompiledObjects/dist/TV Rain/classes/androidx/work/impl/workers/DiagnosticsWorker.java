package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.Logger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsWorker
  extends Worker
{
  private static final String TAG = Logger.tagWithPrefix("DiagnosticsWrkr");
  
  public DiagnosticsWorker(@NonNull Context paramContext, @NonNull WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  @NonNull
  private static String workSpecRow(@NonNull WorkSpec paramWorkSpec, @Nullable String paramString1, @Nullable Integer paramInteger, @NonNull String paramString2)
  {
    return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[] { id, workerClassName, paramInteger, state.name(), paramString1, paramString2 });
  }
  
  @NonNull
  private static String workSpecRows(@NonNull WorkNameDao paramWorkNameDao, @NonNull WorkTagDao paramWorkTagDao, @NonNull SystemIdInfoDao paramSystemIdInfoDao, @NonNull List<WorkSpec> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[] { "Job Id" }));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      WorkSpec localWorkSpec = (WorkSpec)localIterator.next();
      paramList = null;
      Object localObject = paramSystemIdInfoDao.getSystemIdInfo(id);
      if (localObject != null) {
        paramList = Integer.valueOf(systemId);
      }
      List localList = paramWorkNameDao.getNamesForWorkSpecId(id);
      localObject = paramWorkTagDao.getTagsForWorkSpecId(id);
      localStringBuilder.append(workSpecRow(localWorkSpec, TextUtils.join(",", localList), paramList, TextUtils.join(",", (Iterable)localObject)));
    }
    return localStringBuilder.toString();
  }
  
  @NonNull
  public ListenableWorker.Result doWork()
  {
    Object localObject1 = WorkManagerImpl.getInstance(getApplicationContext()).getWorkDatabase();
    Object localObject2 = ((WorkDatabase)localObject1).workSpecDao();
    WorkNameDao localWorkNameDao = ((WorkDatabase)localObject1).workNameDao();
    WorkTagDao localWorkTagDao = ((WorkDatabase)localObject1).workTagDao();
    localObject1 = ((WorkDatabase)localObject1).systemIdInfoDao();
    Object localObject3 = ((WorkSpecDao)localObject2).getRecentlyCompletedWork(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
    Object localObject4 = ((WorkSpecDao)localObject2).getRunningWork();
    localObject2 = ((WorkSpecDao)localObject2).getAllEligibleWorkSpecsForScheduling(200);
    String str;
    if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
    {
      Logger localLogger = Logger.get();
      str = TAG;
      localLogger.info(str, "Recently completed work:\n\n", new Throwable[0]);
      Logger.get().info(str, workSpecRows(localWorkNameDao, localWorkTagDao, (SystemIdInfoDao)localObject1, (List)localObject3), new Throwable[0]);
    }
    if ((localObject4 != null) && (!((List)localObject4).isEmpty()))
    {
      localObject3 = Logger.get();
      str = TAG;
      ((Logger)localObject3).info(str, "Running work:\n\n", new Throwable[0]);
      Logger.get().info(str, workSpecRows(localWorkNameDao, localWorkTagDao, (SystemIdInfoDao)localObject1, (List)localObject4), new Throwable[0]);
    }
    if ((localObject2 != null) && (!((List)localObject2).isEmpty()))
    {
      localObject4 = Logger.get();
      localObject3 = TAG;
      ((Logger)localObject4).info((String)localObject3, "Enqueued work:\n\n", new Throwable[0]);
      Logger.get().info((String)localObject3, workSpecRows(localWorkNameDao, localWorkTagDao, (SystemIdInfoDao)localObject1, (List)localObject2), new Throwable[0]);
    }
    return ListenableWorker.Result.success();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.workers.DiagnosticsWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkDatabasePathHelper
{
  private static final String[] DATABASE_EXTRA_FILES = { "-journal", "-shm", "-wal" };
  private static final String TAG = Logger.tagWithPrefix("WrkDbPathHelper");
  private static final String WORK_DATABASE_NAME = "androidx.work.workdb";
  
  @NonNull
  @VisibleForTesting
  public static File getDatabasePath(@NonNull Context paramContext)
  {
    return getNoBackupPath(paramContext, "androidx.work.workdb");
  }
  
  @NonNull
  @VisibleForTesting
  public static File getDefaultDatabasePath(@NonNull Context paramContext)
  {
    return paramContext.getDatabasePath("androidx.work.workdb");
  }
  
  @RequiresApi(23)
  private static File getNoBackupPath(@NonNull Context paramContext, @NonNull String paramString)
  {
    return new File(paramContext.getNoBackupFilesDir(), paramString);
  }
  
  @NonNull
  public static String getWorkDatabaseName()
  {
    return "androidx.work.workdb";
  }
  
  public static void migrateDatabase(@NonNull Context paramContext)
  {
    if (getDefaultDatabasePath(paramContext).exists())
    {
      Logger.get().debug(TAG, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
      Map localMap = migrationPaths(paramContext);
      Iterator localIterator = localMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        File localFile = (File)localIterator.next();
        paramContext = (File)localMap.get(localFile);
        if ((localFile.exists()) && (paramContext != null))
        {
          if (paramContext.exists())
          {
            String str = String.format("Over-writing contents of %s", new Object[] { paramContext });
            Logger.get().warning(TAG, str, new Throwable[0]);
          }
          if (localFile.renameTo(paramContext)) {
            paramContext = String.format("Migrated %s to %s", new Object[] { localFile, paramContext });
          } else {
            paramContext = String.format("Renaming %s to %s failed", new Object[] { localFile, paramContext });
          }
          Logger.get().debug(TAG, paramContext, new Throwable[0]);
        }
      }
    }
  }
  
  @NonNull
  @VisibleForTesting
  public static Map<File, File> migrationPaths(@NonNull Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    File localFile1 = getDefaultDatabasePath(paramContext);
    paramContext = getDatabasePath(paramContext);
    localHashMap.put(localFile1, paramContext);
    for (String str : DATABASE_EXTRA_FILES)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localFile1.getPath());
      localStringBuilder.append(str);
      File localFile2 = new File(localStringBuilder.toString());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramContext.getPath());
      localStringBuilder.append(str);
      localHashMap.put(localFile2, new File(localStringBuilder.toString()));
    }
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabasePathHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.google.android.exoplayer2.offline;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.Nullable;
import c1;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class DownloadManager
{
  private static final boolean DEBUG = false;
  public static final int DEFAULT_MAX_SIMULTANEOUS_DOWNLOADS = 1;
  public static final int DEFAULT_MIN_RETRY_COUNT = 5;
  private static final String TAG = "DownloadManager";
  private final ActionFile actionFile;
  private final ArrayList<Task> activeDownloadTasks;
  private final DownloadAction.Deserializer[] deserializers;
  private final DownloaderConstructorHelper downloaderConstructorHelper;
  private boolean downloadsStopped;
  private final Handler fileIOHandler;
  private final HandlerThread fileIOThread;
  private final Handler handler;
  private boolean initialized;
  private final CopyOnWriteArraySet<Listener> listeners;
  private final int maxActiveDownloadTasks;
  private final int minRetryCount;
  private int nextTaskId;
  private boolean released;
  private final ArrayList<Task> tasks;
  
  public DownloadManager(DownloaderConstructorHelper paramDownloaderConstructorHelper, int paramInt1, int paramInt2, File paramFile, DownloadAction.Deserializer... paramVarArgs)
  {
    downloaderConstructorHelper = paramDownloaderConstructorHelper;
    maxActiveDownloadTasks = paramInt1;
    minRetryCount = paramInt2;
    actionFile = new ActionFile(paramFile);
    if (paramVarArgs.length <= 0) {
      paramVarArgs = DownloadAction.getDefaultDeserializers();
    }
    deserializers = paramVarArgs;
    downloadsStopped = true;
    tasks = new ArrayList();
    activeDownloadTasks = new ArrayList();
    paramFile = Looper.myLooper();
    paramDownloaderConstructorHelper = paramFile;
    if (paramFile == null) {
      paramDownloaderConstructorHelper = Looper.getMainLooper();
    }
    handler = new Handler(paramDownloaderConstructorHelper);
    paramDownloaderConstructorHelper = new HandlerThread("DownloadManager file i/o");
    fileIOThread = paramDownloaderConstructorHelper;
    paramDownloaderConstructorHelper.start();
    fileIOHandler = new Handler(paramDownloaderConstructorHelper.getLooper());
    listeners = new CopyOnWriteArraySet();
    loadActions();
    logd("Created");
  }
  
  public DownloadManager(DownloaderConstructorHelper paramDownloaderConstructorHelper, File paramFile, DownloadAction.Deserializer... paramVarArgs)
  {
    this(paramDownloaderConstructorHelper, 1, 5, paramFile, paramVarArgs);
  }
  
  public DownloadManager(Cache paramCache, DataSource.Factory paramFactory, File paramFile, DownloadAction.Deserializer... paramVarArgs)
  {
    this(new DownloaderConstructorHelper(paramCache, paramFactory), paramFile, paramVarArgs);
  }
  
  private Task addTaskForAction(DownloadAction paramDownloadAction)
  {
    int i = nextTaskId;
    nextTaskId = (i + 1);
    paramDownloadAction = new Task(i, this, paramDownloadAction, minRetryCount, null);
    tasks.add(paramDownloadAction);
    logd("Task is added", paramDownloadAction);
    return paramDownloadAction;
  }
  
  private void loadActions()
  {
    fileIOHandler.post(new c(this, 1));
  }
  
  private static void logd(String paramString) {}
  
  private static void logd(String paramString, Task paramTask)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(": ");
    localStringBuilder.append(paramTask);
    logd(localStringBuilder.toString());
  }
  
  private void maybeNotifyListenersIdle()
  {
    if (!isIdle()) {
      return;
    }
    logd("Notify idle state");
    Iterator localIterator = listeners.iterator();
    while (localIterator.hasNext()) {
      ((Listener)localIterator.next()).onIdle(this);
    }
  }
  
  private void maybeStartTasks()
  {
    if ((initialized) && (!released))
    {
      int i;
      if ((!downloadsStopped) && (activeDownloadTasks.size() != maxActiveDownloadTasks)) {
        i = 0;
      } else {
        i = 1;
      }
      for (int j = 0; j < tasks.size(); j++)
      {
        Task localTask1 = (Task)tasks.get(j);
        if (Task.access$500(localTask1))
        {
          DownloadAction localDownloadAction = Task.access$300(localTask1);
          boolean bool = isRemoveAction;
          if ((bool) || (i == 0))
          {
            int k = 0;
            int n;
            int i1;
            for (int m = 1;; m = n)
            {
              n = i;
              i1 = m;
              if (k >= j) {
                break;
              }
              Task localTask2 = (Task)tasks.get(k);
              n = m;
              if (Task.access$300(localTask2).isSameMedia(localDownloadAction)) {
                if (bool)
                {
                  StringBuilder localStringBuilder = new StringBuilder();
                  localStringBuilder.append(localTask1);
                  localStringBuilder.append(" clashes with ");
                  localStringBuilder.append(localTask2);
                  logd(localStringBuilder.toString());
                  Task.access$600(localTask2);
                  n = 0;
                }
                else
                {
                  n = m;
                  if (access$300isRemoveAction)
                  {
                    i1 = 0;
                    n = 1;
                    break;
                  }
                }
              }
              k++;
            }
            i = n;
            if (i1 != 0)
            {
              Task.access$700(localTask1);
              i = n;
              if (!bool)
              {
                activeDownloadTasks.add(localTask1);
                if (activeDownloadTasks.size() == maxActiveDownloadTasks) {
                  i = 1;
                } else {
                  i = 0;
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void notifyListenersTaskStateChange(Task paramTask)
  {
    logd("Task state is changed", paramTask);
    paramTask = paramTask.getDownloadState();
    Iterator localIterator = listeners.iterator();
    while (localIterator.hasNext()) {
      ((Listener)localIterator.next()).onTaskStateChanged(this, paramTask);
    }
  }
  
  private void onTaskStateChange(Task paramTask)
  {
    if (released) {
      return;
    }
    boolean bool = paramTask.isActive() ^ true;
    if (bool) {
      activeDownloadTasks.remove(paramTask);
    }
    notifyListenersTaskStateChange(paramTask);
    if (paramTask.isFinished())
    {
      tasks.remove(paramTask);
      saveActions();
    }
    if (bool)
    {
      maybeStartTasks();
      maybeNotifyListenersIdle();
    }
  }
  
  private void saveActions()
  {
    if (released) {
      return;
    }
    DownloadAction[] arrayOfDownloadAction = new DownloadAction[tasks.size()];
    for (int i = 0; i < tasks.size(); i++) {
      arrayOfDownloadAction[i] = Task.access$300((Task)tasks.get(i));
    }
    fileIOHandler.post(new c1(this, arrayOfDownloadAction, 1));
  }
  
  public void addListener(Listener paramListener)
  {
    listeners.add(paramListener);
  }
  
  public TaskState[] getAllTaskStates()
  {
    Assertions.checkState(released ^ true);
    int i = tasks.size();
    TaskState[] arrayOfTaskState = new TaskState[i];
    for (int j = 0; j < i; j++) {
      arrayOfTaskState[j] = ((Task)tasks.get(j)).getDownloadState();
    }
    return arrayOfTaskState;
  }
  
  public int getDownloadCount()
  {
    int i = 0;
    int k;
    for (int j = 0; i < tasks.size(); j = k)
    {
      k = j;
      if (!access$300tasks.get(i)).isRemoveAction) {
        k = j + 1;
      }
      i++;
    }
    return j;
  }
  
  public int getTaskCount()
  {
    Assertions.checkState(released ^ true);
    return tasks.size();
  }
  
  @Nullable
  public TaskState getTaskState(int paramInt)
  {
    Assertions.checkState(released ^ true);
    for (int i = 0; i < tasks.size(); i++)
    {
      Task localTask = (Task)tasks.get(i);
      if (Task.access$200(localTask) == paramInt) {
        return localTask.getDownloadState();
      }
    }
    return null;
  }
  
  public int handleAction(DownloadAction paramDownloadAction)
  {
    Assertions.checkState(released ^ true);
    paramDownloadAction = addTaskForAction(paramDownloadAction);
    if (initialized)
    {
      saveActions();
      maybeStartTasks();
      if (Task.access$100(paramDownloadAction) == 0) {
        notifyListenersTaskStateChange(paramDownloadAction);
      }
    }
    return Task.access$200(paramDownloadAction);
  }
  
  public int handleAction(byte[] paramArrayOfByte)
    throws IOException
  {
    Assertions.checkState(released ^ true);
    paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte);
    return handleAction(DownloadAction.deserializeFromStream(deserializers, paramArrayOfByte));
  }
  
  public boolean isIdle()
  {
    Assertions.checkState(released ^ true);
    if (!initialized) {
      return false;
    }
    for (int i = 0; i < tasks.size(); i++) {
      if (((Task)tasks.get(i)).isActive()) {
        return false;
      }
    }
    return true;
  }
  
  public boolean isInitialized()
  {
    Assertions.checkState(released ^ true);
    return initialized;
  }
  
  public void release()
  {
    if (released) {
      return;
    }
    released = true;
    for (int i = 0; i < tasks.size(); i++) {
      Task.access$000((Task)tasks.get(i));
    }
    ConditionVariable localConditionVariable = new ConditionVariable();
    fileIOHandler.post(new c(localConditionVariable, 2));
    localConditionVariable.block();
    fileIOThread.quit();
    logd("Released");
  }
  
  public void removeListener(Listener paramListener)
  {
    listeners.remove(paramListener);
  }
  
  public void startDownloads()
  {
    Assertions.checkState(released ^ true);
    if (downloadsStopped)
    {
      downloadsStopped = false;
      maybeStartTasks();
      logd("Downloads are started");
    }
  }
  
  public void stopDownloads()
  {
    Assertions.checkState(released ^ true);
    if (!downloadsStopped)
    {
      downloadsStopped = true;
      for (int i = 0; i < activeDownloadTasks.size(); i++) {
        Task.access$000((Task)activeDownloadTasks.get(i));
      }
      logd("Downloads are stopping");
    }
  }
  
  public static abstract interface Listener
  {
    public abstract void onIdle(DownloadManager paramDownloadManager);
    
    public abstract void onInitialized(DownloadManager paramDownloadManager);
    
    public abstract void onTaskStateChanged(DownloadManager paramDownloadManager, DownloadManager.TaskState paramTaskState);
  }
  
  public static final class Task
    implements Runnable
  {
    public static final int STATE_QUEUED_CANCELING = 5;
    public static final int STATE_STARTED_CANCELING = 6;
    public static final int STATE_STARTED_STOPPING = 7;
    private final DownloadAction action;
    private volatile int currentState;
    private final DownloadManager downloadManager;
    private volatile Downloader downloader;
    private Throwable error;
    private final int id;
    private final int minRetryCount;
    private Thread thread;
    
    private Task(int paramInt1, DownloadManager paramDownloadManager, DownloadAction paramDownloadAction, int paramInt2)
    {
      id = paramInt1;
      downloadManager = paramDownloadManager;
      action = paramDownloadAction;
      currentState = 0;
      minRetryCount = paramInt2;
    }
    
    private boolean canStart()
    {
      boolean bool;
      if (currentState == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private void cancel()
    {
      if (changeStateAndNotify(0, 5)) {
        DownloadManager.access$900(downloadManager).post(new c(this, 0));
      } else if (changeStateAndNotify(1, 6)) {
        cancelDownload();
      }
    }
    
    private void cancelDownload()
    {
      if (downloader != null) {
        downloader.cancel();
      }
      thread.interrupt();
    }
    
    private boolean changeStateAndNotify(int paramInt1, int paramInt2)
    {
      return changeStateAndNotify(paramInt1, paramInt2, null);
    }
    
    private boolean changeStateAndNotify(int paramInt1, int paramInt2, Throwable paramThrowable)
    {
      int i = currentState;
      int j = 0;
      if (i != paramInt1) {
        return false;
      }
      currentState = paramInt2;
      error = paramThrowable;
      paramInt1 = j;
      if (currentState != getExternalState()) {
        paramInt1 = 1;
      }
      if (paramInt1 == 0) {
        DownloadManager.access$1100(downloadManager, this);
      }
      return true;
    }
    
    private int getExternalState()
    {
      int i = currentState;
      if (i != 5)
      {
        if ((i != 6) && (i != 7)) {
          return currentState;
        }
        return 1;
      }
      return 0;
    }
    
    private int getRetryDelayMillis(int paramInt)
    {
      return Math.min((paramInt - 1) * 1000, 5000);
    }
    
    private String getStateString()
    {
      int i = currentState;
      if ((i != 5) && (i != 6))
      {
        if (i != 7) {
          return DownloadManager.TaskState.getStateString(currentState);
        }
        return "STOPPING";
      }
      return "CANCELING";
    }
    
    private void start()
    {
      if (changeStateAndNotify(0, 1))
      {
        Thread localThread = new Thread(this);
        thread = localThread;
        localThread.start();
      }
    }
    
    private void stop()
    {
      if (changeStateAndNotify(1, 7))
      {
        DownloadManager.access$1000("Stopping", this);
        cancelDownload();
      }
    }
    
    private static String toString(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte.length > 100) {
        return "<data is too long>";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append('\'');
      localStringBuilder.append(Util.fromUtf8Bytes(paramArrayOfByte));
      localStringBuilder.append('\'');
      return localStringBuilder.toString();
    }
    
    public float getDownloadPercentage()
    {
      float f;
      if (downloader != null) {
        f = downloader.getDownloadPercentage();
      } else {
        f = -1.0F;
      }
      return f;
    }
    
    public DownloadManager.TaskState getDownloadState()
    {
      int i = getExternalState();
      return new DownloadManager.TaskState(id, action, i, getDownloadPercentage(), getDownloadedBytes(), error, null);
    }
    
    public long getDownloadedBytes()
    {
      long l;
      if (downloader != null) {
        l = downloader.getDownloadedBytes();
      } else {
        l = 0L;
      }
      return l;
    }
    
    public boolean isActive()
    {
      int i = currentState;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i != 5)
      {
        bool2 = bool1;
        if (currentState != 1)
        {
          bool2 = bool1;
          if (currentState != 7) {
            if (currentState == 6) {
              bool2 = bool1;
            } else {
              bool2 = false;
            }
          }
        }
      }
      return bool2;
    }
    
    public boolean isFinished()
    {
      boolean bool;
      if ((currentState != 4) && (currentState != 2) && (currentState != 3)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void run()
    {
      DownloadManager.access$1000("Task is started", this);
      try
      {
        downloader = action.createDownloader(DownloadManager.access$1200(downloadManager));
        if (action.isRemoveAction)
        {
          downloader.remove();
        }
        else
        {
          long l1 = -1L;
          int i = 0;
          for (;;)
          {
            boolean bool = Thread.interrupted();
            if (!bool) {
              try
              {
                downloader.download();
              }
              catch (IOException localIOException)
              {
                long l2 = downloader.getDownloadedBytes();
                long l3 = l1;
                if (l2 != l1)
                {
                  localStringBuilder = new java/lang/StringBuilder;
                  localStringBuilder.<init>();
                  localStringBuilder.append("Reset error count. downloadedBytes = ");
                  localStringBuilder.append(l2);
                  DownloadManager.access$1000(localStringBuilder.toString(), this);
                  i = 0;
                  l3 = l2;
                }
                if (currentState == 1)
                {
                  i++;
                  if (i <= minRetryCount)
                  {
                    localStringBuilder = new java/lang/StringBuilder;
                    localStringBuilder.<init>();
                    localStringBuilder.append("Download error. Retry ");
                    localStringBuilder.append(i);
                    DownloadManager.access$1000(localStringBuilder.toString(), this);
                    Thread.sleep(getRetryDelayMillis(i));
                    l1 = l3;
                    continue;
                  }
                }
                throw localIOException;
              }
            }
          }
        }
        StringBuilder localStringBuilder = null;
      }
      finally {}
      DownloadManager.access$900(downloadManager).post(new a(1, localObject, this));
    }
    
    public String toString()
    {
      return super.toString();
    }
    
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public static @interface InternalState {}
  }
  
  public static final class TaskState
  {
    public static final int STATE_CANCELED = 3;
    public static final int STATE_COMPLETED = 2;
    public static final int STATE_FAILED = 4;
    public static final int STATE_QUEUED = 0;
    public static final int STATE_STARTED = 1;
    public final DownloadAction action;
    public final float downloadPercentage;
    public final long downloadedBytes;
    public final Throwable error;
    public final int state;
    public final int taskId;
    
    private TaskState(int paramInt1, DownloadAction paramDownloadAction, int paramInt2, float paramFloat, long paramLong, Throwable paramThrowable)
    {
      taskId = paramInt1;
      action = paramDownloadAction;
      state = paramInt2;
      downloadPercentage = paramFloat;
      downloadedBytes = paramLong;
      error = paramThrowable;
    }
    
    public static String getStateString(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt == 4) {
                return "FAILED";
              }
              throw new IllegalStateException();
            }
            return "CANCELED";
          }
          return "COMPLETED";
        }
        return "STARTED";
      }
      return "QUEUED";
    }
    
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public static @interface State {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
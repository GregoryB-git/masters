package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory;
import com.facebook.common.file.FileTree;
import com.facebook.common.file.FileUtils;
import com.facebook.common.file.FileUtils.CreateDirectoryException;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;

public class DynamicDefaultDiskStorage
  implements DiskStorage
{
  private static final Class<?> TAG = DynamicDefaultDiskStorage.class;
  private final String mBaseDirectoryName;
  private final Supplier<File> mBaseDirectoryPathSupplier;
  private final CacheErrorLogger mCacheErrorLogger;
  @VisibleForTesting
  public volatile State mCurrentState;
  private final int mVersion;
  
  public DynamicDefaultDiskStorage(int paramInt, Supplier<File> paramSupplier, String paramString, CacheErrorLogger paramCacheErrorLogger)
  {
    mVersion = paramInt;
    mCacheErrorLogger = paramCacheErrorLogger;
    mBaseDirectoryPathSupplier = paramSupplier;
    mBaseDirectoryName = paramString;
    mCurrentState = new State(null, null);
  }
  
  private void createStorage()
    throws IOException
  {
    File localFile = new File((File)mBaseDirectoryPathSupplier.get(), mBaseDirectoryName);
    createRootDirectoryIfNecessary(localFile);
    mCurrentState = new State(localFile, new DefaultDiskStorage(localFile, mVersion, mCacheErrorLogger));
  }
  
  private boolean shouldCreateNewStorage()
  {
    Object localObject = mCurrentState;
    if (delegate != null)
    {
      localObject = rootDirectory;
      if ((localObject != null) && (((File)localObject).exists())) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public void clearAll()
    throws IOException
  {
    get().clearAll();
  }
  
  public boolean contains(String paramString, Object paramObject)
    throws IOException
  {
    return get().contains(paramString, paramObject);
  }
  
  @VisibleForTesting
  public void createRootDirectoryIfNecessary(File paramFile)
    throws IOException
  {
    try
    {
      FileUtils.mkdirs(paramFile);
      FLog.d(TAG, "Created cache directory %s", paramFile.getAbsolutePath());
      return;
    }
    catch (FileUtils.CreateDirectoryException paramFile)
    {
      mCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, TAG, "createRootDirectoryIfNecessary", paramFile);
      throw paramFile;
    }
  }
  
  @VisibleForTesting
  public void deleteOldStorageIfNecessary()
  {
    if ((mCurrentState.delegate != null) && (mCurrentState.rootDirectory != null)) {
      FileTree.deleteRecursively(mCurrentState.rootDirectory);
    }
  }
  
  @VisibleForTesting
  public DiskStorage get()
    throws IOException
  {
    try
    {
      if (shouldCreateNewStorage())
      {
        deleteOldStorageIfNecessary();
        createStorage();
      }
      DiskStorage localDiskStorage = (DiskStorage)Preconditions.checkNotNull(mCurrentState.delegate);
      return localDiskStorage;
    }
    finally {}
  }
  
  public DiskStorage.DiskDumpInfo getDumpInfo()
    throws IOException
  {
    return get().getDumpInfo();
  }
  
  public Collection<DiskStorage.Entry> getEntries()
    throws IOException
  {
    return get().getEntries();
  }
  
  public BinaryResource getResource(String paramString, Object paramObject)
    throws IOException
  {
    return get().getResource(paramString, paramObject);
  }
  
  public String getStorageName()
  {
    try
    {
      String str = get().getStorageName();
      return str;
    }
    catch (IOException localIOException) {}
    return "";
  }
  
  public DiskStorage.Inserter insert(String paramString, Object paramObject)
    throws IOException
  {
    return get().insert(paramString, paramObject);
  }
  
  public boolean isEnabled()
  {
    try
    {
      boolean bool = get().isEnabled();
      return bool;
    }
    catch (IOException localIOException) {}
    return false;
  }
  
  public boolean isExternal()
  {
    try
    {
      boolean bool = get().isExternal();
      return bool;
    }
    catch (IOException localIOException) {}
    return false;
  }
  
  public void purgeUnexpectedResources()
  {
    try
    {
      get().purgeUnexpectedResources();
    }
    catch (IOException localIOException)
    {
      FLog.e(TAG, "purgeUnexpectedResources", localIOException);
    }
  }
  
  public long remove(DiskStorage.Entry paramEntry)
    throws IOException
  {
    return get().remove(paramEntry);
  }
  
  public long remove(String paramString)
    throws IOException
  {
    return get().remove(paramString);
  }
  
  public boolean touch(String paramString, Object paramObject)
    throws IOException
  {
    return get().touch(paramString, paramObject);
  }
  
  @VisibleForTesting
  public static class State
  {
    @Nullable
    public final DiskStorage delegate;
    @Nullable
    public final File rootDirectory;
    
    @VisibleForTesting
    public State(@Nullable File paramFile, @Nullable DiskStorage paramDiskStorage)
    {
      delegate = paramDiskStorage;
      rootDirectory = paramFile;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DynamicDefaultDiskStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
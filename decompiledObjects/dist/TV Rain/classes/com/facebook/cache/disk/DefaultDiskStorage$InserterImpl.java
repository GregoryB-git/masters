package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory;
import com.facebook.common.file.FileUtils;
import com.facebook.common.file.FileUtils.ParentDirNotFoundException;
import com.facebook.common.file.FileUtils.RenameException;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.time.Clock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@VisibleForTesting
class DefaultDiskStorage$InserterImpl
  implements DiskStorage.Inserter
{
  private final String mResourceId;
  @VisibleForTesting
  public final File mTemporaryFile;
  
  public DefaultDiskStorage$InserterImpl(DefaultDiskStorage paramDefaultDiskStorage, String paramString, File paramFile)
  {
    mResourceId = paramString;
    mTemporaryFile = paramFile;
  }
  
  public boolean cleanUp()
  {
    boolean bool;
    if ((mTemporaryFile.exists()) && (!mTemporaryFile.delete())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public BinaryResource commit(Object paramObject)
    throws IOException
  {
    paramObject = this$0.getContentFileFor(mResourceId);
    try
    {
      FileUtils.rename(mTemporaryFile, (File)paramObject);
      if (((File)paramObject).exists()) {
        ((File)paramObject).setLastModified(DefaultDiskStorage.access$400(this$0).now());
      }
      return FileBinaryResource.createOrNull((File)paramObject);
    }
    catch (FileUtils.RenameException localRenameException)
    {
      paramObject = localRenameException.getCause();
      if (paramObject != null)
      {
        if (!(paramObject instanceof FileUtils.ParentDirNotFoundException))
        {
          if ((paramObject instanceof FileNotFoundException)) {
            paramObject = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
          } else {
            paramObject = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
          }
        }
        else {
          paramObject = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
        }
      }
      else {
        paramObject = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
      }
      DefaultDiskStorage.access$1000(this$0).logError((CacheErrorLogger.CacheErrorCategory)paramObject, DefaultDiskStorage.access$900(), "commit", localRenameException);
      throw localRenameException;
    }
  }
  
  /* Error */
  public void writeData(com.facebook.cache.common.WriterCallback paramWriterCallback, Object paramObject)
    throws IOException
  {
    // Byte code:
    //   0: new 116	java/io/FileOutputStream
    //   3: dup
    //   4: aload_0
    //   5: getfield 27	com/facebook/cache/disk/DefaultDiskStorage$InserterImpl:mTemporaryFile	Ljava/io/File;
    //   8: invokespecial 119	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   11: astore_2
    //   12: new 121	com/facebook/common/internal/CountingOutputStream
    //   15: astore_3
    //   16: aload_3
    //   17: aload_2
    //   18: invokespecial 124	com/facebook/common/internal/CountingOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   21: aload_1
    //   22: aload_3
    //   23: invokeinterface 129 2 0
    //   28: aload_3
    //   29: invokevirtual 134	java/io/OutputStream:flush	()V
    //   32: aload_3
    //   33: invokevirtual 137	com/facebook/common/internal/CountingOutputStream:getCount	()J
    //   36: lstore 4
    //   38: aload_2
    //   39: invokevirtual 140	java/io/FileOutputStream:close	()V
    //   42: aload_0
    //   43: getfield 27	com/facebook/cache/disk/DefaultDiskStorage$InserterImpl:mTemporaryFile	Ljava/io/File;
    //   46: invokevirtual 143	java/io/File:length	()J
    //   49: lload 4
    //   51: lcmp
    //   52: ifne +4 -> 56
    //   55: return
    //   56: new 145	com/facebook/cache/disk/DefaultDiskStorage$IncompleteFileException
    //   59: dup
    //   60: lload 4
    //   62: aload_0
    //   63: getfield 27	com/facebook/cache/disk/DefaultDiskStorage$InserterImpl:mTemporaryFile	Ljava/io/File;
    //   66: invokevirtual 143	java/io/File:length	()J
    //   69: invokespecial 148	com/facebook/cache/disk/DefaultDiskStorage$IncompleteFileException:<init>	(JJ)V
    //   72: athrow
    //   73: astore_1
    //   74: aload_2
    //   75: invokevirtual 140	java/io/FileOutputStream:close	()V
    //   78: aload_1
    //   79: athrow
    //   80: astore_1
    //   81: aload_0
    //   82: getfield 20	com/facebook/cache/disk/DefaultDiskStorage$InserterImpl:this$0	Lcom/facebook/cache/disk/DefaultDiskStorage;
    //   85: invokestatic 100	com/facebook/cache/disk/DefaultDiskStorage:access$1000	(Lcom/facebook/cache/disk/DefaultDiskStorage;)Lcom/facebook/cache/common/CacheErrorLogger;
    //   88: getstatic 151	com/facebook/cache/common/CacheErrorLogger$CacheErrorCategory:WRITE_UPDATE_FILE_NOT_FOUND	Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;
    //   91: invokestatic 104	com/facebook/cache/disk/DefaultDiskStorage:access$900	()Ljava/lang/Class;
    //   94: ldc -103
    //   96: aload_1
    //   97: invokeinterface 111 5 0
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	InserterImpl
    //   0	104	1	paramWriterCallback	com.facebook.cache.common.WriterCallback
    //   0	104	2	paramObject	Object
    //   15	18	3	localCountingOutputStream	com.facebook.common.internal.CountingOutputStream
    //   36	25	4	l	long
    // Exception table:
    //   from	to	target	type
    //   12	38	73	finally
    //   0	12	80	java/io/FileNotFoundException
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultDiskStorage.InserterImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
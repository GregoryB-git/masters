package com.facebook.cache.disk;

import android.os.Environment;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory;
import com.facebook.common.file.FileTree;
import com.facebook.common.file.FileTreeVisitor;
import com.facebook.common.file.FileUtils;
import com.facebook.common.file.FileUtils.CreateDirectoryException;
import com.facebook.common.file.FileUtils.ParentDirNotFoundException;
import com.facebook.common.file.FileUtils.RenameException;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.time.Clock;
import com.facebook.common.time.SystemClock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import z2;

public class DefaultDiskStorage
  implements DiskStorage
{
  private static final String CONTENT_FILE_EXTENSION = ".cnt";
  private static final String DEFAULT_DISK_STORAGE_VERSION_PREFIX = "v2";
  private static final int SHARDING_BUCKET_COUNT = 100;
  private static final Class<?> TAG = DefaultDiskStorage.class;
  private static final String TEMP_FILE_EXTENSION = ".tmp";
  public static final long TEMP_FILE_LIFETIME_MS = TimeUnit.MINUTES.toMillis(30L);
  private final CacheErrorLogger mCacheErrorLogger;
  private final Clock mClock;
  private final boolean mIsExternal;
  private final File mRootDirectory;
  private final File mVersionDirectory;
  
  public DefaultDiskStorage(File paramFile, int paramInt, CacheErrorLogger paramCacheErrorLogger)
  {
    Preconditions.checkNotNull(paramFile);
    mRootDirectory = paramFile;
    mIsExternal = isExternal(paramFile, paramCacheErrorLogger);
    mVersionDirectory = new File(paramFile, getVersionSubdirectoryName(paramInt));
    mCacheErrorLogger = paramCacheErrorLogger;
    recreateDirectoryIfVersionChanges();
    mClock = SystemClock.get();
  }
  
  private long doRemove(File paramFile)
  {
    if (!paramFile.exists()) {
      return 0L;
    }
    long l = paramFile.length();
    if (paramFile.delete()) {
      return l;
    }
    return -1L;
  }
  
  private DiskStorage.DiskDumpInfoEntry dumpCacheEntry(DiskStorage.Entry paramEntry)
    throws IOException
  {
    EntryImpl localEntryImpl = (EntryImpl)paramEntry;
    paramEntry = localEntryImpl.getResource().read();
    String str = typeOfBytes(paramEntry);
    if ((str.equals("undefined")) && (paramEntry.length >= 4)) {
      paramEntry = String.format(null, "0x%02X 0x%02X 0x%02X 0x%02X", new Object[] { Byte.valueOf(paramEntry[0]), Byte.valueOf(paramEntry[1]), Byte.valueOf(paramEntry[2]), Byte.valueOf(paramEntry[3]) });
    } else {
      paramEntry = "";
    }
    return new DiskStorage.DiskDumpInfoEntry(localEntryImpl.getResource().getFile().getPath(), str, (float)localEntryImpl.getSize(), paramEntry);
  }
  
  @Nullable
  @FileType
  private static String getFileTypefromExtension(String paramString)
  {
    if (".cnt".equals(paramString)) {
      return ".cnt";
    }
    if (".tmp".equals(paramString)) {
      return ".tmp";
    }
    return null;
  }
  
  private String getFilename(String paramString)
  {
    paramString = new FileInfo(".cnt", paramString, null);
    return paramString.toPath(getSubdirectoryPath(resourceId));
  }
  
  private FileInfo getShardFileInfo(File paramFile)
  {
    FileInfo localFileInfo = FileInfo.fromFile(paramFile);
    if (localFileInfo == null) {
      return null;
    }
    if (getSubdirectory(resourceId).equals(paramFile.getParentFile())) {
      paramFile = localFileInfo;
    } else {
      paramFile = null;
    }
    return paramFile;
  }
  
  private File getSubdirectory(String paramString)
  {
    return new File(getSubdirectoryPath(paramString));
  }
  
  private String getSubdirectoryPath(String paramString)
  {
    int i = Math.abs(paramString.hashCode() % 100);
    paramString = new StringBuilder();
    paramString.append(mVersionDirectory);
    return z2.s(paramString, File.separator, String.valueOf(i));
  }
  
  @VisibleForTesting
  public static String getVersionSubdirectoryName(int paramInt)
  {
    return String.format(null, "%s.ols%d.%d", new Object[] { "v2", Integer.valueOf(100), Integer.valueOf(paramInt) });
  }
  
  private static boolean isExternal(File paramFile, CacheErrorLogger paramCacheErrorLogger)
  {
    boolean bool1 = false;
    boolean bool2;
    try
    {
      Object localObject1 = Environment.getExternalStorageDirectory();
      bool2 = bool1;
      if (localObject1 != null)
      {
        Object localObject2 = ((File)localObject1).toString();
        try
        {
          localObject1 = paramFile.getCanonicalPath();
          try
          {
            bool2 = ((String)localObject1).contains((CharSequence)localObject2);
          }
          catch (IOException paramFile) {}
          localObject2 = CacheErrorLogger.CacheErrorCategory.OTHER;
        }
        catch (IOException paramFile)
        {
          localObject1 = null;
        }
        Class localClass = TAG;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("failed to read folder to check if external: ");
        localStringBuilder.append((String)localObject1);
        paramCacheErrorLogger.logError((CacheErrorLogger.CacheErrorCategory)localObject2, localClass, localStringBuilder.toString(), paramFile);
        bool2 = bool1;
      }
    }
    catch (Exception paramFile)
    {
      paramCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.OTHER, TAG, "failed to get the external storage directory!", paramFile);
      bool2 = bool1;
    }
    return bool2;
  }
  
  private void mkdirs(File paramFile, String paramString)
    throws IOException
  {
    try
    {
      FileUtils.mkdirs(paramFile);
      return;
    }
    catch (FileUtils.CreateDirectoryException paramFile)
    {
      mCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, TAG, paramString, paramFile);
      throw paramFile;
    }
  }
  
  private boolean query(String paramString, boolean paramBoolean)
  {
    paramString = getContentFileFor(paramString);
    boolean bool = paramString.exists();
    if ((paramBoolean) && (bool)) {
      paramString.setLastModified(mClock.now());
    }
    return bool;
  }
  
  private void recreateDirectoryIfVersionChanges()
  {
    boolean bool = mRootDirectory.exists();
    int i = 1;
    if (bool) {
      if (!mVersionDirectory.exists()) {
        FileTree.deleteRecursively(mRootDirectory);
      } else {
        i = 0;
      }
    }
    if (i != 0) {
      try
      {
        FileUtils.mkdirs(mVersionDirectory);
      }
      catch (FileUtils.CreateDirectoryException localCreateDirectoryException)
      {
        CacheErrorLogger localCacheErrorLogger = mCacheErrorLogger;
        CacheErrorLogger.CacheErrorCategory localCacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
        Class localClass = TAG;
        StringBuilder localStringBuilder = z2.t("version directory could not be created: ");
        localStringBuilder.append(mVersionDirectory);
        localCacheErrorLogger.logError(localCacheErrorCategory, localClass, localStringBuilder.toString(), null);
      }
    }
  }
  
  private String typeOfBytes(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length >= 2)
    {
      int i = paramArrayOfByte[0];
      if ((i == -1) && (paramArrayOfByte[1] == -40)) {
        return "jpg";
      }
      if ((i == -119) && (paramArrayOfByte[1] == 80)) {
        return "png";
      }
      if ((i == 82) && (paramArrayOfByte[1] == 73)) {
        return "webp";
      }
      if ((i == 71) && (paramArrayOfByte[1] == 73)) {
        return "gif";
      }
    }
    return "undefined";
  }
  
  public void clearAll()
  {
    FileTree.deleteContents(mRootDirectory);
  }
  
  public boolean contains(String paramString, Object paramObject)
  {
    return query(paramString, false);
  }
  
  @VisibleForTesting
  public File getContentFileFor(String paramString)
  {
    return new File(getFilename(paramString));
  }
  
  public DiskStorage.DiskDumpInfo getDumpInfo()
    throws IOException
  {
    Object localObject = getEntries();
    DiskStorage.DiskDumpInfo localDiskDumpInfo = new DiskStorage.DiskDumpInfo();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      DiskStorage.DiskDumpInfoEntry localDiskDumpInfoEntry = dumpCacheEntry((DiskStorage.Entry)localIterator.next());
      localObject = type;
      if (!typeCounts.containsKey(localObject)) {
        typeCounts.put(localObject, Integer.valueOf(0));
      }
      Map localMap = typeCounts;
      localMap.put(localObject, Integer.valueOf(((Integer)localMap.get(localObject)).intValue() + 1));
      entries.add(localDiskDumpInfoEntry);
    }
    return localDiskDumpInfo;
  }
  
  public List<DiskStorage.Entry> getEntries()
    throws IOException
  {
    EntriesCollector localEntriesCollector = new EntriesCollector(null);
    FileTree.walkFileTree(mVersionDirectory, localEntriesCollector);
    return localEntriesCollector.getEntries();
  }
  
  public BinaryResource getResource(String paramString, Object paramObject)
  {
    paramString = getContentFileFor(paramString);
    if (paramString.exists())
    {
      paramString.setLastModified(mClock.now());
      return FileBinaryResource.createOrNull(paramString);
    }
    return null;
  }
  
  public String getStorageName()
  {
    String str = mRootDirectory.getAbsolutePath();
    StringBuilder localStringBuilder = z2.t("_");
    localStringBuilder.append(str.substring(str.lastIndexOf('/') + 1, str.length()));
    localStringBuilder.append("_");
    localStringBuilder.append(str.hashCode());
    return localStringBuilder.toString();
  }
  
  public DiskStorage.Inserter insert(String paramString, Object paramObject)
    throws IOException
  {
    FileInfo localFileInfo = new FileInfo(".tmp", paramString, null);
    paramObject = getSubdirectory(resourceId);
    if (!((File)paramObject).exists()) {
      mkdirs((File)paramObject, "insert");
    }
    try
    {
      paramString = new InserterImpl(paramString, localFileInfo.createTempFile((File)paramObject));
      return paramString;
    }
    catch (IOException paramString)
    {
      mCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, TAG, "insert", paramString);
      throw paramString;
    }
  }
  
  public boolean isEnabled()
  {
    return true;
  }
  
  public boolean isExternal()
  {
    return mIsExternal;
  }
  
  public void purgeUnexpectedResources()
  {
    FileTree.walkFileTree(mRootDirectory, new PurgingVisitor(null));
  }
  
  public long remove(DiskStorage.Entry paramEntry)
  {
    return doRemove(((EntryImpl)paramEntry).getResource().getFile());
  }
  
  public long remove(String paramString)
  {
    return doRemove(getContentFileFor(paramString));
  }
  
  public boolean touch(String paramString, Object paramObject)
  {
    return query(paramString, true);
  }
  
  public class EntriesCollector
    implements FileTreeVisitor
  {
    private final List<DiskStorage.Entry> result = new ArrayList();
    
    private EntriesCollector() {}
    
    public List<DiskStorage.Entry> getEntries()
    {
      return Collections.unmodifiableList(result);
    }
    
    public void postVisitDirectory(File paramFile) {}
    
    public void preVisitDirectory(File paramFile) {}
    
    public void visitFile(File paramFile)
    {
      DefaultDiskStorage.FileInfo localFileInfo = DefaultDiskStorage.access$000(DefaultDiskStorage.this, paramFile);
      if ((localFileInfo != null) && (type == ".cnt")) {
        result.add(new DefaultDiskStorage.EntryImpl(resourceId, paramFile, null));
      }
    }
  }
  
  @VisibleForTesting
  public static class EntryImpl
    implements DiskStorage.Entry
  {
    private final String id;
    private final FileBinaryResource resource;
    private long size;
    private long timestamp;
    
    private EntryImpl(String paramString, File paramFile)
    {
      Preconditions.checkNotNull(paramFile);
      id = ((String)Preconditions.checkNotNull(paramString));
      resource = FileBinaryResource.createOrNull(paramFile);
      size = -1L;
      timestamp = -1L;
    }
    
    public String getId()
    {
      return id;
    }
    
    public FileBinaryResource getResource()
    {
      return resource;
    }
    
    public long getSize()
    {
      if (size < 0L) {
        size = resource.size();
      }
      return size;
    }
    
    public long getTimestamp()
    {
      if (timestamp < 0L) {
        timestamp = resource.getFile().lastModified();
      }
      return timestamp;
    }
  }
  
  public static class FileInfo
  {
    public final String resourceId;
    @DefaultDiskStorage.FileType
    public final String type;
    
    private FileInfo(@DefaultDiskStorage.FileType String paramString1, String paramString2)
    {
      type = paramString1;
      resourceId = paramString2;
    }
    
    @Nullable
    public static FileInfo fromFile(File paramFile)
    {
      paramFile = paramFile.getName();
      int i = paramFile.lastIndexOf('.');
      if (i <= 0) {
        return null;
      }
      String str1 = DefaultDiskStorage.access$800(paramFile.substring(i));
      if (str1 == null) {
        return null;
      }
      String str2 = paramFile.substring(0, i);
      paramFile = str2;
      if (str1.equals(".tmp"))
      {
        i = str2.lastIndexOf('.');
        if (i <= 0) {
          return null;
        }
        paramFile = str2.substring(0, i);
      }
      return new FileInfo(str1, paramFile);
    }
    
    public File createTempFile(File paramFile)
      throws IOException
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(resourceId);
      localStringBuilder.append(".");
      return File.createTempFile(localStringBuilder.toString(), ".tmp", paramFile);
    }
    
    public String toPath(String paramString)
    {
      paramString = z2.t(paramString);
      paramString.append(File.separator);
      paramString.append(resourceId);
      paramString.append(type);
      return paramString.toString();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(type);
      localStringBuilder.append("(");
      return z2.s(localStringBuilder, resourceId, ")");
    }
  }
  
  public static @interface FileType
  {
    public static final String CONTENT = ".cnt";
    public static final String TEMP = ".tmp";
  }
  
  public static class IncompleteFileException
    extends IOException
  {
    public final long actual;
    public final long expected;
    
    public IncompleteFileException(long paramLong1, long paramLong2)
    {
      super();
      expected = paramLong1;
      actual = paramLong2;
    }
  }
  
  @VisibleForTesting
  public class InserterImpl
    implements DiskStorage.Inserter
  {
    private final String mResourceId;
    @VisibleForTesting
    public final File mTemporaryFile;
    
    public InserterImpl(String paramString, File paramFile)
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
      paramObject = getContentFileFor(mResourceId);
      try
      {
        FileUtils.rename(mTemporaryFile, (File)paramObject);
        if (((File)paramObject).exists()) {
          ((File)paramObject).setLastModified(DefaultDiskStorage.access$400(DefaultDiskStorage.this).now());
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
        DefaultDiskStorage.access$1000(DefaultDiskStorage.this).logError((CacheErrorLogger.CacheErrorCategory)paramObject, DefaultDiskStorage.access$900(), "commit", localRenameException);
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
  
  public class PurgingVisitor
    implements FileTreeVisitor
  {
    private boolean insideBaseDirectory;
    
    private PurgingVisitor() {}
    
    private boolean isExpectedFile(File paramFile)
    {
      Object localObject = DefaultDiskStorage.access$000(DefaultDiskStorage.this, paramFile);
      boolean bool = false;
      if (localObject == null) {
        return false;
      }
      localObject = type;
      if (localObject == ".tmp") {
        return isRecentFile(paramFile);
      }
      if (localObject == ".cnt") {
        bool = true;
      }
      Preconditions.checkState(bool);
      return true;
    }
    
    private boolean isRecentFile(File paramFile)
    {
      boolean bool;
      if (paramFile.lastModified() > DefaultDiskStorage.access$400(DefaultDiskStorage.this).now() - DefaultDiskStorage.TEMP_FILE_LIFETIME_MS) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void postVisitDirectory(File paramFile)
    {
      if ((!DefaultDiskStorage.access$300(DefaultDiskStorage.this).equals(paramFile)) && (!insideBaseDirectory)) {
        paramFile.delete();
      }
      if ((insideBaseDirectory) && (paramFile.equals(DefaultDiskStorage.access$200(DefaultDiskStorage.this)))) {
        insideBaseDirectory = false;
      }
    }
    
    public void preVisitDirectory(File paramFile)
    {
      if ((!insideBaseDirectory) && (paramFile.equals(DefaultDiskStorage.access$200(DefaultDiskStorage.this)))) {
        insideBaseDirectory = true;
      }
    }
    
    public void visitFile(File paramFile)
    {
      if ((!insideBaseDirectory) || (!isExpectedFile(paramFile))) {
        paramFile.delete();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultDiskStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
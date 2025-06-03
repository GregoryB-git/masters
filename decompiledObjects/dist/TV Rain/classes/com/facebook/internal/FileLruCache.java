package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.AbstractQueue;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import z2;

public final class FileLruCache
{
  private static final String HEADER_CACHEKEY_KEY = "key";
  private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
  public static final String TAG = "FileLruCache";
  private static final AtomicLong bufferIndex = new AtomicLong();
  private final File directory;
  private boolean isTrimInProgress;
  private boolean isTrimPending;
  private AtomicLong lastClearCacheTime = new AtomicLong(0L);
  private final Limits limits;
  private final Object lock;
  private final String tag;
  
  public FileLruCache(String paramString, Limits paramLimits)
  {
    tag = paramString;
    limits = paramLimits;
    paramString = new File(FacebookSdk.getCacheDir(), paramString);
    directory = paramString;
    lock = new Object();
    if ((paramString.mkdirs()) || (paramString.isDirectory())) {
      BufferFile.deleteAll(paramString);
    }
  }
  
  private void postTrim()
  {
    synchronized (lock)
    {
      if (!isTrimPending)
      {
        isTrimPending = true;
        Executor localExecutor = FacebookSdk.getExecutor();
        Runnable local3 = new com/facebook/internal/FileLruCache$3;
        local3.<init>(this);
        localExecutor.execute(local3);
      }
      return;
    }
  }
  
  private void renameToTargetAndTrim(String paramString, File paramFile)
  {
    if (!paramFile.renameTo(new File(directory, Utility.md5hash(paramString)))) {
      paramFile.delete();
    }
    postTrim();
  }
  
  private void trim()
  {
    synchronized (lock)
    {
      isTrimPending = false;
      isTrimInProgress = true;
      try
      {
        Logger.log(LoggingBehavior.CACHE, TAG, "trim started");
        PriorityQueue localPriorityQueue = new java/util/PriorityQueue;
        localPriorityQueue.<init>();
        File[] arrayOfFile = directory.listFiles(BufferFile.excludeBufferFiles());
        long l1 = 0L;
        int j;
        Object localObject7;
        Object localObject8;
        Object localObject9;
        if (arrayOfFile != null)
        {
          int i = arrayOfFile.length;
          j = 0;
          long l2 = 0L;
          long l3 = l1;
          for (;;)
          {
            l1 = l3;
            l4 = l2;
            if (j >= i) {
              break;
            }
            localObject7 = arrayOfFile[j];
            localObject8 = new com/facebook/internal/FileLruCache$ModifiedFile;
            ((ModifiedFile)localObject8).<init>((File)localObject7);
            localPriorityQueue.add(localObject8);
            ??? = LoggingBehavior.CACHE;
            String str = TAG;
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>();
            ((StringBuilder)localObject9).append("  trim considering time=");
            ((StringBuilder)localObject9).append(Long.valueOf(((ModifiedFile)localObject8).getModified()));
            ((StringBuilder)localObject9).append(" name=");
            ((StringBuilder)localObject9).append(((ModifiedFile)localObject8).getFile().getName());
            Logger.log((LoggingBehavior)???, str, ((StringBuilder)localObject9).toString());
            l3 += ((File)localObject7).length();
            l2 += 1L;
            j++;
          }
        }
        long l4 = 0L;
        for (;;)
        {
          if (l1 <= limits.getByteCount())
          {
            j = limits.getFileCount();
            if (l4 <= j) {
              synchronized (lock)
              {
                isTrimInProgress = false;
                lock.notifyAll();
                return;
              }
            }
          }
          localObject9 = ((ModifiedFile)((AbstractQueue)localObject4).remove()).getFile();
          localObject8 = LoggingBehavior.CACHE;
          localObject7 = TAG;
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>();
          ((StringBuilder)???).append("  trim removing ");
          ((StringBuilder)???).append(((File)localObject9).getName());
          Logger.log((LoggingBehavior)localObject8, (String)localObject7, ((StringBuilder)???).toString());
          l1 -= ((File)localObject9).length();
          l4 -= 1L;
          ((File)localObject9).delete();
        }
        synchronized (lock)
        {
          isTrimInProgress = false;
          lock.notifyAll();
          throw ((Throwable)localObject2);
        }
      }
      finally {}
    }
  }
  
  public void clearCache()
  {
    final File[] arrayOfFile = directory.listFiles(BufferFile.excludeBufferFiles());
    lastClearCacheTime.set(System.currentTimeMillis());
    if (arrayOfFile != null) {
      FacebookSdk.getExecutor().execute(new Runnable()
      {
        public void run()
        {
          if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
          }
          try
          {
            File[] arrayOfFile = arrayOfFile;
            int i = arrayOfFile.length;
            for (int j = 0; j < i; j++) {
              arrayOfFile[j].delete();
            }
            return;
          }
          finally
          {
            CrashShieldHandler.handleThrowable(localThrowable, this);
          }
        }
      });
    }
  }
  
  public InputStream get(String paramString)
    throws IOException
  {
    return get(paramString, null);
  }
  
  public InputStream get(String paramString1, String paramString2)
    throws IOException
  {
    File localFile = new File(directory, Utility.md5hash(paramString1));
    try
    {
      Object localObject1 = new FileInputStream(localFile);
      localObject1 = new BufferedInputStream((InputStream)localObject1, 8192);
      try
      {
        Object localObject2 = StreamHeader.readHeader((InputStream)localObject1);
        if (localObject2 == null) {
          return null;
        }
        String str = ((JSONObject)localObject2).optString("key");
        if ((str != null) && (str.equals(paramString1)))
        {
          paramString1 = ((JSONObject)localObject2).optString("tag", null);
          if ((paramString2 != null) || (paramString1 == null))
          {
            if (paramString2 != null)
            {
              boolean bool = paramString2.equals(paramString1);
              if (bool) {}
            }
          }
          else {
            return null;
          }
          paramString1 = new java/util/Date;
          paramString1.<init>();
          long l = paramString1.getTime();
          paramString2 = LoggingBehavior.CACHE;
          localObject2 = TAG;
          paramString1 = new java/lang/StringBuilder;
          paramString1.<init>();
          paramString1.append("Setting lastModified to ");
          paramString1.append(Long.valueOf(l));
          paramString1.append(" for ");
          paramString1.append(localFile.getName());
          Logger.log(paramString2, (String)localObject2, paramString1.toString());
          localFile.setLastModified(l);
          return (InputStream)localObject1;
        }
        return null;
      }
      finally
      {
        ((BufferedInputStream)localObject1).close();
      }
      return null;
    }
    catch (IOException paramString1) {}
  }
  
  public String getLocation()
  {
    return directory.getPath();
  }
  
  public InputStream interceptAndPut(String paramString, InputStream paramInputStream)
    throws IOException
  {
    return new CopyingInputStream(paramInputStream, openPutStream(paramString));
  }
  
  public OutputStream openPutStream(String paramString)
    throws IOException
  {
    return openPutStream(paramString, null);
  }
  
  /* Error */
  public OutputStream openPutStream(final String paramString1, String paramString2)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 91	com/facebook/internal/FileLruCache:directory	Ljava/io/File;
    //   4: invokestatic 325	com/facebook/internal/FileLruCache$BufferFile:newFile	(Ljava/io/File;)Ljava/io/File;
    //   7: astore_3
    //   8: aload_3
    //   9: invokevirtual 147	java/io/File:delete	()Z
    //   12: pop
    //   13: aload_3
    //   14: invokevirtual 328	java/io/File:createNewFile	()Z
    //   17: ifeq +216 -> 233
    //   20: new 330	java/io/FileOutputStream
    //   23: dup
    //   24: aload_3
    //   25: invokespecial 331	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   28: astore 4
    //   30: new 333	java/io/BufferedOutputStream
    //   33: dup
    //   34: new 19	com/facebook/internal/FileLruCache$CloseCallbackOutputStream
    //   37: dup
    //   38: aload 4
    //   40: new 6	com/facebook/internal/FileLruCache$1
    //   43: dup
    //   44: aload_0
    //   45: invokestatic 245	java/lang/System:currentTimeMillis	()J
    //   48: aload_3
    //   49: aload_1
    //   50: invokespecial 336	com/facebook/internal/FileLruCache$1:<init>	(Lcom/facebook/internal/FileLruCache;JLjava/io/File;Ljava/lang/String;)V
    //   53: invokespecial 339	com/facebook/internal/FileLruCache$CloseCallbackOutputStream:<init>	(Ljava/io/OutputStream;Lcom/facebook/internal/FileLruCache$StreamCloseCallback;)V
    //   56: sipush 8192
    //   59: invokespecial 342	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   62: astore_3
    //   63: new 276	org/json/JSONObject
    //   66: astore 4
    //   68: aload 4
    //   70: invokespecial 343	org/json/JSONObject:<init>	()V
    //   73: aload 4
    //   75: ldc 39
    //   77: aload_1
    //   78: invokevirtual 347	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   81: pop
    //   82: aload_2
    //   83: invokestatic 351	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   86: ifne +12 -> 98
    //   89: aload 4
    //   91: ldc 42
    //   93: aload_2
    //   94: invokevirtual 347	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   97: pop
    //   98: aload_3
    //   99: aload 4
    //   101: invokestatic 355	com/facebook/internal/FileLruCache$StreamHeader:writeHeader	(Ljava/io/OutputStream;Lorg/json/JSONObject;)V
    //   104: aload_3
    //   105: areturn
    //   106: astore_1
    //   107: goto +65 -> 172
    //   110: astore_1
    //   111: getstatic 157	com/facebook/LoggingBehavior:CACHE	Lcom/facebook/LoggingBehavior;
    //   114: astore 5
    //   116: getstatic 159	com/facebook/internal/FileLruCache:TAG	Ljava/lang/String;
    //   119: astore_2
    //   120: new 186	java/lang/StringBuilder
    //   123: astore 4
    //   125: aload 4
    //   127: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   130: aload 4
    //   132: ldc_w 357
    //   135: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: aload 4
    //   141: aload_1
    //   142: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload 5
    //   148: iconst_5
    //   149: aload_2
    //   150: aload 4
    //   152: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: invokestatic 360	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //   158: new 255	java/io/IOException
    //   161: astore_2
    //   162: aload_2
    //   163: aload_1
    //   164: invokevirtual 365	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   167: invokespecial 368	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   170: aload_2
    //   171: athrow
    //   172: aload_3
    //   173: invokevirtual 371	java/io/OutputStream:close	()V
    //   176: aload_1
    //   177: athrow
    //   178: astore_2
    //   179: getstatic 157	com/facebook/LoggingBehavior:CACHE	Lcom/facebook/LoggingBehavior;
    //   182: astore 4
    //   184: getstatic 159	com/facebook/internal/FileLruCache:TAG	Ljava/lang/String;
    //   187: astore_3
    //   188: new 186	java/lang/StringBuilder
    //   191: dup
    //   192: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   195: astore_1
    //   196: aload_1
    //   197: ldc_w 373
    //   200: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload_1
    //   205: aload_2
    //   206: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: aload 4
    //   212: iconst_5
    //   213: aload_3
    //   214: aload_1
    //   215: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   218: invokestatic 360	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //   221: new 255	java/io/IOException
    //   224: dup
    //   225: aload_2
    //   226: invokevirtual 365	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   229: invokespecial 368	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   232: athrow
    //   233: ldc_w 375
    //   236: invokestatic 380	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: astore_1
    //   240: aload_1
    //   241: aload_3
    //   242: invokevirtual 383	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   245: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: new 255	java/io/IOException
    //   252: dup
    //   253: aload_1
    //   254: invokevirtual 218	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: invokespecial 368	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   260: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	this	FileLruCache
    //   0	261	1	paramString1	String
    //   0	261	2	paramString2	String
    //   7	235	3	localObject1	Object
    //   28	183	4	localObject2	Object
    //   114	33	5	localLoggingBehavior	LoggingBehavior
    // Exception table:
    //   from	to	target	type
    //   63	98	106	finally
    //   98	104	106	finally
    //   111	172	106	finally
    //   63	98	110	org/json/JSONException
    //   98	104	110	org/json/JSONException
    //   20	30	178	java/io/FileNotFoundException
  }
  
  public long sizeInBytesForTest()
  {
    for (;;)
    {
      synchronized (lock)
      {
        if ((!isTrimPending) && (!isTrimInProgress))
        {
          ??? = directory.listFiles();
          long l1 = 0L;
          long l2 = l1;
          if (??? != null)
          {
            int i = ???.length;
            int j = 0;
            l2 = l1;
            if (j < i)
            {
              l1 += ???[j].length();
              j++;
              continue;
            }
          }
          return l2;
        }
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("{FileLruCache: tag:");
    localStringBuilder.append(tag);
    localStringBuilder.append(" file:");
    localStringBuilder.append(directory.getName());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static class BufferFile
  {
    private static final String FILE_NAME_PREFIX = "buffer";
    private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.startsWith("buffer") ^ true;
      }
    };
    private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter()
    {
      public boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.startsWith("buffer");
      }
    };
    
    public static void deleteAll(File paramFile)
    {
      paramFile = paramFile.listFiles(excludeNonBufferFiles());
      if (paramFile != null)
      {
        int i = paramFile.length;
        for (int j = 0; j < i; j++) {
          paramFile[j].delete();
        }
      }
    }
    
    public static FilenameFilter excludeBufferFiles()
    {
      return filterExcludeBufferFiles;
    }
    
    public static FilenameFilter excludeNonBufferFiles()
    {
      return filterExcludeNonBufferFiles;
    }
    
    public static File newFile(File paramFile)
    {
      StringBuilder localStringBuilder = z2.t("buffer");
      localStringBuilder.append(Long.valueOf(FileLruCache.access$300().incrementAndGet()).toString());
      return new File(paramFile, localStringBuilder.toString());
    }
  }
  
  public static class CloseCallbackOutputStream
    extends OutputStream
  {
    public final FileLruCache.StreamCloseCallback callback;
    public final OutputStream innerStream;
    
    public CloseCallbackOutputStream(OutputStream paramOutputStream, FileLruCache.StreamCloseCallback paramStreamCloseCallback)
    {
      innerStream = paramOutputStream;
      callback = paramStreamCloseCallback;
    }
    
    public void close()
      throws IOException
    {
      try
      {
        innerStream.close();
        return;
      }
      finally
      {
        callback.onClose();
      }
    }
    
    public void flush()
      throws IOException
    {
      innerStream.flush();
    }
    
    public void write(int paramInt)
      throws IOException
    {
      innerStream.write(paramInt);
    }
    
    public void write(byte[] paramArrayOfByte)
      throws IOException
    {
      innerStream.write(paramArrayOfByte);
    }
    
    public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      innerStream.write(paramArrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public static final class CopyingInputStream
    extends InputStream
  {
    public final InputStream input;
    public final OutputStream output;
    
    public CopyingInputStream(InputStream paramInputStream, OutputStream paramOutputStream)
    {
      input = paramInputStream;
      output = paramOutputStream;
    }
    
    public int available()
      throws IOException
    {
      return input.available();
    }
    
    public void close()
      throws IOException
    {
      try
      {
        input.close();
        return;
      }
      finally
      {
        output.close();
      }
    }
    
    public void mark(int paramInt)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean markSupported()
    {
      return false;
    }
    
    public int read()
      throws IOException
    {
      int i = input.read();
      if (i >= 0) {
        output.write(i);
      }
      return i;
    }
    
    public int read(byte[] paramArrayOfByte)
      throws IOException
    {
      int i = input.read(paramArrayOfByte);
      if (i > 0) {
        output.write(paramArrayOfByte, 0, i);
      }
      return i;
    }
    
    public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
      throws IOException
    {
      paramInt2 = input.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt2 > 0) {
        output.write(paramArrayOfByte, paramInt1, paramInt2);
      }
      return paramInt2;
    }
    
    public void reset()
    {
      try
      {
        UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
        localUnsupportedOperationException.<init>();
        throw localUnsupportedOperationException;
      }
      finally {}
    }
    
    public long skip(long paramLong)
      throws IOException
    {
      byte[] arrayOfByte = new byte['Ѐ'];
      int i;
      for (long l = 0L; l < paramLong; l += i)
      {
        i = read(arrayOfByte, 0, (int)Math.min(paramLong - l, 'Ѐ'));
        if (i < 0) {
          return l;
        }
      }
      return l;
    }
  }
  
  public static final class Limits
  {
    private int byteCount = 1048576;
    private int fileCount = 1024;
    
    public int getByteCount()
    {
      return byteCount;
    }
    
    public int getFileCount()
    {
      return fileCount;
    }
    
    public void setByteCount(int paramInt)
    {
      if (paramInt >= 0)
      {
        byteCount = paramInt;
        return;
      }
      throw new InvalidParameterException("Cache byte-count limit must be >= 0");
    }
    
    public void setFileCount(int paramInt)
    {
      if (paramInt >= 0)
      {
        fileCount = paramInt;
        return;
      }
      throw new InvalidParameterException("Cache file count limit must be >= 0");
    }
  }
  
  public static final class ModifiedFile
    implements Comparable<ModifiedFile>
  {
    private static final int HASH_MULTIPLIER = 37;
    private static final int HASH_SEED = 29;
    private final File file;
    private final long modified;
    
    public ModifiedFile(File paramFile)
    {
      file = paramFile;
      modified = paramFile.lastModified();
    }
    
    public int compareTo(ModifiedFile paramModifiedFile)
    {
      if (getModified() < paramModifiedFile.getModified()) {
        return -1;
      }
      if (getModified() > paramModifiedFile.getModified()) {
        return 1;
      }
      return getFile().compareTo(paramModifiedFile.getFile());
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool;
      if (((paramObject instanceof ModifiedFile)) && (compareTo((ModifiedFile)paramObject) == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public File getFile()
    {
      return file;
    }
    
    public long getModified()
    {
      return modified;
    }
    
    public int hashCode()
    {
      return (file.hashCode() + 1073) * 37 + (int)(modified % 2147483647L);
    }
  }
  
  public static abstract interface StreamCloseCallback
  {
    public abstract void onClose();
  }
  
  public static final class StreamHeader
  {
    private static final int HEADER_VERSION = 0;
    
    public static JSONObject readHeader(InputStream paramInputStream)
      throws IOException
    {
      if (paramInputStream.read() != 0) {
        return null;
      }
      int i = 0;
      int j = 0;
      int k = j;
      while (j < 3)
      {
        int m = paramInputStream.read();
        if (m == -1)
        {
          Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
          return null;
        }
        k = (k << 8) + (m & 0xFF);
        j++;
      }
      Object localObject1 = new byte[k];
      j = i;
      Object localObject2;
      while (j < k)
      {
        i = paramInputStream.read((byte[])localObject1, j, k - j);
        if (i < 1)
        {
          localObject2 = LoggingBehavior.CACHE;
          paramInputStream = FileLruCache.TAG;
          localObject1 = z2.t("readHeader: stream.read stopped at ");
          ((StringBuilder)localObject1).append(Integer.valueOf(j));
          ((StringBuilder)localObject1).append(" when expected ");
          ((StringBuilder)localObject1).append(k);
          Logger.log((LoggingBehavior)localObject2, paramInputStream, ((StringBuilder)localObject1).toString());
          return null;
        }
        j += i;
      }
      paramInputStream = new JSONTokener(new String((byte[])localObject1));
      try
      {
        localObject2 = paramInputStream.nextValue();
        if (!(localObject2 instanceof JSONObject))
        {
          localObject1 = LoggingBehavior.CACHE;
          String str = FileLruCache.TAG;
          paramInputStream = new java/lang/StringBuilder;
          paramInputStream.<init>();
          paramInputStream.append("readHeader: expected JSONObject, got ");
          paramInputStream.append(localObject2.getClass().getCanonicalName());
          Logger.log((LoggingBehavior)localObject1, str, paramInputStream.toString());
          return null;
        }
        paramInputStream = (JSONObject)localObject2;
        return paramInputStream;
      }
      catch (JSONException paramInputStream)
      {
        throw new IOException(paramInputStream.getMessage());
      }
    }
    
    public static void writeHeader(OutputStream paramOutputStream, JSONObject paramJSONObject)
      throws IOException
    {
      paramJSONObject = paramJSONObject.toString().getBytes();
      paramOutputStream.write(0);
      paramOutputStream.write(paramJSONObject.length >> 16 & 0xFF);
      paramOutputStream.write(paramJSONObject.length >> 8 & 0xFF);
      paramOutputStream.write(paramJSONObject.length >> 0 & 0xFF);
      paramOutputStream.write(paramJSONObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FileLruCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
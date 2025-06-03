package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Parcel;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

public final class SysUtil
{
  private static final byte APK_SIGNATURE_VERSION = 1;
  
  public static int copyBytes(RandomAccessFile paramRandomAccessFile, InputStream paramInputStream, int paramInt, byte[] paramArrayOfByte)
    throws IOException
  {
    int i = 0;
    while (i < paramInt)
    {
      int j = paramInputStream.read(paramArrayOfByte, 0, Math.min(paramArrayOfByte.length, paramInt - i));
      if (j == -1) {
        break;
      }
      paramRandomAccessFile.write(paramArrayOfByte, 0, j);
      i += j;
    }
    return i;
  }
  
  public static void deleteOrThrow(File paramFile)
    throws IOException
  {
    if (paramFile.delete()) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("could not delete file ");
    localStringBuilder.append(paramFile);
    throw new IOException(localStringBuilder.toString());
  }
  
  public static void dumbDeleteRecursive(File paramFile)
    throws IOException
  {
    Object localObject;
    if (paramFile.isDirectory())
    {
      localObject = paramFile.listFiles();
      if (localObject == null) {
        return;
      }
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        dumbDeleteRecursive(localObject[j]);
      }
    }
    if ((!paramFile.delete()) && (paramFile.exists()))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("could not delete: ");
      ((StringBuilder)localObject).append(paramFile);
      throw new IOException(((StringBuilder)localObject).toString());
    }
  }
  
  public static void fallocateIfSupported(FileDescriptor paramFileDescriptor, long paramLong)
    throws IOException
  {
    LollipopSysdeps.fallocateIfSupported(paramFileDescriptor, paramLong);
  }
  
  public static int findAbiScore(String[] paramArrayOfString, String paramString)
  {
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      String str = paramArrayOfString[i];
      if ((str != null) && (paramString.equals(str))) {
        return i;
      }
    }
    return -1;
  }
  
  /* Error */
  public static void fsyncRecursive(File paramFile)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 69	java/io/File:isDirectory	()Z
    //   4: ifeq +65 -> 69
    //   7: aload_0
    //   8: invokevirtual 73	java/io/File:listFiles	()[Ljava/io/File;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull +23 -> 36
    //   16: iconst_0
    //   17: istore_2
    //   18: iload_2
    //   19: aload_1
    //   20: arraylength
    //   21: if_icmpge +85 -> 106
    //   24: aload_1
    //   25: iload_2
    //   26: aaload
    //   27: invokestatic 95	com/facebook/soloader/SysUtil:fsyncRecursive	(Ljava/io/File;)V
    //   30: iinc 2 1
    //   33: goto -15 -> 18
    //   36: new 48	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 49	java/lang/StringBuilder:<init>	()V
    //   43: astore_1
    //   44: aload_1
    //   45: ldc 97
    //   47: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload_1
    //   52: aload_0
    //   53: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: new 19	java/io/IOException
    //   60: dup
    //   61: aload_1
    //   62: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokespecial 65	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   68: athrow
    //   69: aload_0
    //   70: invokevirtual 100	java/io/File:getPath	()Ljava/lang/String;
    //   73: ldc 102
    //   75: invokevirtual 106	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   78: ifeq +6 -> 84
    //   81: goto +25 -> 106
    //   84: new 33	java/io/RandomAccessFile
    //   87: dup
    //   88: aload_0
    //   89: ldc 108
    //   91: invokespecial 111	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   94: astore_3
    //   95: aload_3
    //   96: invokevirtual 115	java/io/RandomAccessFile:getFD	()Ljava/io/FileDescriptor;
    //   99: invokevirtual 120	java/io/FileDescriptor:sync	()V
    //   102: aload_3
    //   103: invokevirtual 123	java/io/RandomAccessFile:close	()V
    //   106: return
    //   107: astore_1
    //   108: aload_1
    //   109: athrow
    //   110: astore_0
    //   111: aload_3
    //   112: invokevirtual 123	java/io/RandomAccessFile:close	()V
    //   115: goto +9 -> 124
    //   118: astore_3
    //   119: aload_1
    //   120: aload_3
    //   121: invokevirtual 129	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   124: aload_0
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramFile	File
    //   11	51	1	localObject1	Object
    //   107	13	1	localObject2	Object
    //   17	14	2	i	int
    //   94	18	3	localRandomAccessFile	RandomAccessFile
    //   118	3	3	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   95	102	107	finally
    //   108	110	110	finally
    //   111	115	118	finally
  }
  
  public static int getAppVersionCode(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager != null) {}
    try
    {
      int i = getPackageInfogetPackageName0versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException|RuntimeException paramContext)
    {
      for (;;) {}
    }
    return 0;
  }
  
  public static String[] getSupportedAbis()
  {
    return LollipopSysdeps.getSupportedAbis();
  }
  
  public static byte[] makeApkDepBlock(File paramFile, Context paramContext)
    throws IOException
  {
    File localFile = paramFile.getCanonicalFile();
    paramFile = Parcel.obtain();
    try
    {
      paramFile.writeByte((byte)1);
      paramFile.writeString(localFile.getPath());
      paramFile.writeLong(localFile.lastModified());
      paramFile.writeInt(getAppVersionCode(paramContext));
      paramContext = paramFile.marshall();
      return paramContext;
    }
    finally
    {
      paramFile.recycle();
    }
  }
  
  public static void mkdirOrThrow(File paramFile)
    throws IOException
  {
    if ((!paramFile.mkdirs()) && (!paramFile.isDirectory()))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("cannot mkdir: ");
      localStringBuilder.append(paramFile);
      throw new IOException(localStringBuilder.toString());
    }
  }
  
  public static final class LollipopSysdeps
  {
    @DoNotOptimize
    public static void fallocateIfSupported(FileDescriptor paramFileDescriptor, long paramLong)
      throws IOException
    {
      try
      {
        Os.posix_fallocate(paramFileDescriptor, 0L, paramLong);
      }
      catch (ErrnoException paramFileDescriptor)
      {
        if (errno != OsConstants.EOPNOTSUPP)
        {
          int i = errno;
          if ((i != OsConstants.ENOSYS) && (i != OsConstants.EINVAL)) {
            throw new IOException(paramFileDescriptor.toString(), paramFileDescriptor);
          }
        }
      }
    }
    
    @DoNotOptimize
    public static String[] getSupportedAbis()
    {
      return Build.SUPPORTED_ABIS;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.SysUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
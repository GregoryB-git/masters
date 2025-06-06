package com.facebook.soloader;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.IOException;

final class SysUtil$LollipopSysdeps
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

/* Location:
 * Qualified Name:     com.facebook.soloader.SysUtil.LollipopSysdeps
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
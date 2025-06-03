package T;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.FileDescriptor;

public abstract class b
{
  public static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      localStringBuilder.append(String.format("%02x", new Object[] { Byte.valueOf(paramArrayOfByte[i]) }));
    }
    return localStringBuilder.toString();
  }
  
  public static long[] b(Object paramObject)
  {
    if ((paramObject instanceof int[]))
    {
      paramObject = (int[])paramObject;
      long[] arrayOfLong = new long[paramObject.length];
      for (int i = 0; i < paramObject.length; i++) {
        arrayOfLong[i] = paramObject[i];
      }
      return arrayOfLong;
    }
    if ((paramObject instanceof long[])) {
      return (long[])paramObject;
    }
    return null;
  }
  
  public static boolean c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte1 != null) && (paramArrayOfByte2 != null))
    {
      if (paramArrayOfByte1.length < paramArrayOfByte2.length) {
        return false;
      }
      for (int i = 0; i < paramArrayOfByte2.length; i++) {
        if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public static abstract class a
  {
    public static void a(FileDescriptor paramFileDescriptor)
    {
      Os.close(paramFileDescriptor);
    }
    
    public static FileDescriptor b(FileDescriptor paramFileDescriptor)
    {
      return Os.dup(paramFileDescriptor);
    }
    
    public static long c(FileDescriptor paramFileDescriptor, long paramLong, int paramInt)
    {
      return Os.lseek(paramFileDescriptor, paramLong, paramInt);
    }
  }
  
  public static abstract class b
  {
    public static void a(MediaMetadataRetriever paramMediaMetadataRetriever, MediaDataSource paramMediaDataSource)
    {
      paramMediaMetadataRetriever.setDataSource(paramMediaDataSource);
    }
  }
}

/* Location:
 * Qualified Name:     T.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package T;

import android.system.Os;
import java.io.FileDescriptor;

public abstract class b$a
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

/* Location:
 * Qualified Name:     T.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
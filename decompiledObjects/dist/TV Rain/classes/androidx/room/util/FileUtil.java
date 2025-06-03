package androidx.room.util;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FileUtil
{
  @SuppressLint({"LambdaLast"})
  public static void copy(@NonNull ReadableByteChannel paramReadableByteChannel, @NonNull FileChannel paramFileChannel)
    throws IOException
  {
    try
    {
      paramFileChannel.transferFrom(paramReadableByteChannel, 0L, Long.MAX_VALUE);
      paramFileChannel.force(false);
      return;
    }
    finally
    {
      paramReadableByteChannel.close();
      paramFileChannel.close();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.FileUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
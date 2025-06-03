package v5;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class a$a
  extends OutputStream
{
  public final FileOutputStream a;
  public boolean b = false;
  
  public a$a(File paramFile)
  {
    a = new FileOutputStream(paramFile);
  }
  
  public final void close()
  {
    if (b) {
      return;
    }
    b = true;
    flush();
    try
    {
      a.getFD().sync();
    }
    catch (IOException localIOException)
    {
      m.g("AtomicFile", "Failed to sync file descriptor:", localIOException);
    }
    a.close();
  }
  
  public final void flush()
  {
    a.flush();
  }
  
  public final void write(int paramInt)
  {
    a.write(paramInt);
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    a.write(paramArrayOfByte);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     v5.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
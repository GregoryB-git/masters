package o0;

import ec.i;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class q$b
  extends OutputStream
{
  public final FileOutputStream a;
  
  public q$b(FileOutputStream paramFileOutputStream)
  {
    a = paramFileOutputStream;
  }
  
  public final void close() {}
  
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
    i.e(paramArrayOfByte, "b");
    a.write(paramArrayOfByte);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    i.e(paramArrayOfByte, "bytes");
    a.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     o0.q.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
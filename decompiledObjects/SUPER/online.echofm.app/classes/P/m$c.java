package P;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

public final class m$c
  extends OutputStream
{
  public final FileOutputStream o;
  
  public m$c(FileOutputStream paramFileOutputStream)
  {
    o = paramFileOutputStream;
  }
  
  public void close() {}
  
  public void flush()
  {
    o.flush();
  }
  
  public void write(int paramInt)
  {
    o.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "b");
    o.write(paramArrayOfByte);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "bytes");
    o.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     P.m.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
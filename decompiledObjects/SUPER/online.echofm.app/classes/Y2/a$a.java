package Y2;

import W2.m;
import java.io.OutputStream;

public class a$a
  extends OutputStream
{
  public String toString()
  {
    return "ByteStreams.nullOutputStream()";
  }
  
  public void write(int paramInt) {}
  
  public void write(byte[] paramArrayOfByte)
  {
    m.j(paramArrayOfByte);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    m.j(paramArrayOfByte);
    m.n(paramInt1, paramInt2 + paramInt1, paramArrayOfByte.length);
  }
}

/* Location:
 * Qualified Name:     Y2.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package gb;

import java.io.OutputStream;

public final class j2$b
  extends OutputStream
{
  public j2$b(j2 paramj2) {}
  
  public final void write(int paramInt)
  {
    write(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.e(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     gb.j2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
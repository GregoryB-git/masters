package gb;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public abstract interface u2
  extends Closeable
{
  public abstract void U(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void Z();
  
  public abstract int b();
  
  public abstract void close();
  
  public abstract void m0(OutputStream paramOutputStream, int paramInt);
  
  public abstract boolean markSupported();
  
  public abstract u2 r(int paramInt);
  
  public abstract int readUnsignedByte();
  
  public abstract void reset();
  
  public abstract void skipBytes(int paramInt);
  
  public abstract void v0(ByteBuffer paramByteBuffer);
}

/* Location:
 * Qualified Name:     gb.u2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
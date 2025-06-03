package xc;

import java.nio.channels.WritableByteChannel;

public abstract interface g
  extends w, WritableByteChannel
{
  public abstract g D();
  
  public abstract g O(String paramString);
  
  public abstract g Y(long paramLong);
  
  public abstract void flush();
  
  public abstract f k();
  
  public abstract g o();
  
  public abstract g write(byte[] paramArrayOfByte);
  
  public abstract g writeByte(int paramInt);
  
  public abstract g writeInt(int paramInt);
  
  public abstract g writeShort(int paramInt);
}

/* Location:
 * Qualified Name:     xc.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
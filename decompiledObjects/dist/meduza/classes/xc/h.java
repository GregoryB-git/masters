package xc;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public abstract interface h
  extends y, ReadableByteChannel
{
  public abstract String E(long paramLong);
  
  public abstract boolean K(i parami);
  
  public abstract String S(Charset paramCharset);
  
  public abstract String f0();
  
  public abstract i l(long paramLong);
  
  public abstract byte readByte();
  
  public abstract int readInt();
  
  public abstract short readShort();
  
  public abstract void skip(long paramLong);
  
  public abstract f t();
  
  public abstract void u0(long paramLong);
  
  public abstract boolean v();
  
  public abstract long x0();
}

/* Location:
 * Qualified Name:     xc.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
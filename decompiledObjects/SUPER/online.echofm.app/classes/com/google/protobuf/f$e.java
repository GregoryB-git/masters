package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class f$e
  extends f.i
{
  private static final long serialVersionUID = 1L;
  public final int t;
  public final int u;
  
  public f$e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    f.g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    t = paramInt1;
    u = paramInt2;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
  }
  
  public byte d(int paramInt)
  {
    f.f(paramInt, size());
    return s[(t + paramInt)];
  }
  
  public int d0()
  {
    return t;
  }
  
  public void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(s, d0() + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public byte q(int paramInt)
  {
    return s[(t + paramInt)];
  }
  
  public int size()
  {
    return u;
  }
  
  public Object writeReplace()
  {
    return f.a0(U());
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.f.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
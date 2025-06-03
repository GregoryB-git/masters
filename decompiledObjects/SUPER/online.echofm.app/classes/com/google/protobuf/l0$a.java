package com.google.protobuf;

public abstract class l0$a
{
  public abstract int a(CharSequence paramCharSequence, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public final boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (c(0, paramArrayOfByte, paramInt1, paramInt2) == 0) {
      bool = true;
    }
    return bool;
  }
  
  public abstract int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
}

/* Location:
 * Qualified Name:     com.google.protobuf.l0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package ma;

public final class h$d
  extends h.h
{
  public final int e;
  public final int f;
  
  public h$d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super(paramArrayOfByte);
    h.l(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    e = paramInt1;
    f = paramInt2;
  }
  
  public final int D()
  {
    return e;
  }
  
  public final byte i(int paramInt)
  {
    h.k(paramInt, f);
    return d[(e + paramInt)];
  }
  
  public final void n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    System.arraycopy(d, e + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public final byte p(int paramInt)
  {
    return d[(e + paramInt)];
  }
  
  public final int size()
  {
    return f;
  }
}

/* Location:
 * Qualified Name:     ma.h.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
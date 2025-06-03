package e3;

public class c
  extends d
{
  public c(byte[] paramArrayOfByte, int paramInt)
  {
    super(paramArrayOfByte, paramInt);
  }
  
  public int[] b(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt.length == e() / 4)
    {
      int[] arrayOfInt = new int[16];
      a.c(arrayOfInt, a);
      arrayOfInt[12] = paramInt;
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 13, paramArrayOfInt.length);
      return arrayOfInt;
    }
    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[] { Integer.valueOf(paramArrayOfInt.length * 32) }));
  }
  
  public int e()
  {
    return 12;
  }
}

/* Location:
 * Qualified Name:     e3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
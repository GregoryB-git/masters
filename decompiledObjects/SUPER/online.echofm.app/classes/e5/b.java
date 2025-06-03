package e5;

public final class b
{
  public final byte[] a;
  public int b;
  
  public b(int paramInt)
  {
    a = new byte[paramInt];
    b = 0;
  }
  
  public void a(boolean paramBoolean, int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
    {
      int j = b;
      b = (j + 1);
      c(j, paramBoolean);
    }
  }
  
  public byte[] b(int paramInt)
  {
    int i = a.length * paramInt;
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++) {
      arrayOfByte[j] = ((byte)a[(j / paramInt)]);
    }
    return arrayOfByte;
  }
  
  public final void c(int paramInt, boolean paramBoolean)
  {
    a[paramInt] = ((byte)(byte)paramBoolean);
  }
}

/* Location:
 * Qualified Name:     e5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
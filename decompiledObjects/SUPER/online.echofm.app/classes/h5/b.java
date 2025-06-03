package h5;

import java.util.Arrays;

public final class b
{
  public final byte[][] a;
  public final int b;
  public final int c;
  
  public b(int paramInt1, int paramInt2)
  {
    a = new byte[paramInt2][paramInt1];
    b = paramInt1;
    c = paramInt2;
  }
  
  public void a(byte paramByte)
  {
    byte[][] arrayOfByte = a;
    int i = arrayOfByte.length;
    for (int j = 0; j < i; j++) {
      Arrays.fill(arrayOfByte[j], paramByte);
    }
  }
  
  public byte b(int paramInt1, int paramInt2)
  {
    return a[paramInt2][paramInt1];
  }
  
  public byte[][] c()
  {
    return a;
  }
  
  public int d()
  {
    return c;
  }
  
  public int e()
  {
    return b;
  }
  
  public void f(int paramInt1, int paramInt2, int paramInt3)
  {
    a[paramInt2][paramInt1] = ((byte)(byte)paramInt3);
  }
  
  public void g(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a[paramInt2][paramInt1] = ((byte)(byte)paramBoolean);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(b * 2 * c + 2);
    for (int i = 0; i < c; i++)
    {
      byte[] arrayOfByte = a[i];
      for (int j = 0; j < b; j++)
      {
        int k = arrayOfByte[j];
        String str;
        if (k != 0) {
          if (k != 1) {
            str = "  ";
          }
        }
        for (;;)
        {
          localStringBuilder.append(str);
          break;
          str = " 1";
          continue;
          str = " 0";
        }
      }
      localStringBuilder.append('\n');
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     h5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
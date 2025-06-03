package e5;

public final class a
{
  public final b[] a;
  public int b;
  public final int c;
  public final int d;
  
  public a(int paramInt1, int paramInt2)
  {
    b[] arrayOfb = new b[paramInt1];
    a = arrayOfb;
    int i = arrayOfb.length;
    for (int j = 0; j < i; j++) {
      a[j] = new b((paramInt2 + 4) * 17 + 1);
    }
    d = (paramInt2 * 17);
    c = paramInt1;
    b = -1;
  }
  
  public b a()
  {
    return a[b];
  }
  
  public byte[][] b(int paramInt1, int paramInt2)
  {
    int i = c;
    int j = d;
    byte[][] arrayOfByte = new byte[i * paramInt2][j * paramInt1];
    i = c * paramInt2;
    for (j = 0; j < i; j++) {
      arrayOfByte[(i - j - 1)] = a[(j / paramInt2)].b(paramInt1);
    }
    return arrayOfByte;
  }
  
  public void c()
  {
    b += 1;
  }
}

/* Location:
 * Qualified Name:     e5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package X4;

import Y4.a;

public final class b
  extends g
{
  public final short c;
  public final short d;
  
  public b(g paramg, int paramInt1, int paramInt2)
  {
    super(paramg);
    c = ((short)(short)paramInt1);
    d = ((short)(short)paramInt2);
  }
  
  public void c(a parama, byte[] paramArrayOfByte)
  {
    for (int i = 0;; i++)
    {
      int j = d;
      if (i >= j) {
        break;
      }
      if ((i == 0) || ((i == 31) && (j <= 62)))
      {
        int k = 5;
        parama.d(31, 5);
        j = d;
        if (j > 62)
        {
          j -= 31;
          k = 16;
        }
        for (;;)
        {
          parama.d(j, k);
          break;
          if (i == 0)
          {
            parama.d(Math.min(j, 31), 5);
            break;
          }
          j -= 31;
        }
      }
      parama.d(paramArrayOfByte[(c + i)], 8);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(c);
    localStringBuilder.append("::");
    localStringBuilder.append(c + d - 1);
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     X4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
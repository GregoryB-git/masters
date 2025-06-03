package X4;

import Y4.a;

public final class e
  extends g
{
  public final short c;
  public final short d;
  
  public e(g paramg, int paramInt1, int paramInt2)
  {
    super(paramg);
    c = ((short)(short)paramInt1);
    d = ((short)(short)paramInt2);
  }
  
  public void c(a parama, byte[] paramArrayOfByte)
  {
    parama.d(c, d);
  }
  
  public String toString()
  {
    int i = c;
    int j = d;
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(Integer.toBinaryString(i & (1 << j) - 1 | 1 << j | 1 << d).substring(1));
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     X4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package q0;

import d0.q;
import i0.g;
import java.util.Arrays;

public final class f$a
  extends y0.k
{
  public byte[] l;
  
  public f$a(g paramg, i0.k paramk, q paramq, int paramInt, Object paramObject, byte[] paramArrayOfByte)
  {
    super(paramg, paramk, 3, paramq, paramInt, paramObject, paramArrayOfByte);
  }
  
  public void g(byte[] paramArrayOfByte, int paramInt)
  {
    l = Arrays.copyOf(paramArrayOfByte, paramInt);
  }
  
  public byte[] j()
  {
    return l;
  }
}

/* Location:
 * Qualified Name:     q0.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
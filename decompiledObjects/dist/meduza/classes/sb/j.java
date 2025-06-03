package sb;

import ec.i;
import java.util.Arrays;
import java.util.List;
import va.a;

public class j
  extends a
{
  public static final <T> List<T> j(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "<this>");
    paramArrayOfT = Arrays.asList(paramArrayOfT);
    i.d(paramArrayOfT, "asList(...)");
    return paramArrayOfT;
  }
  
  public static final void k(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    i.e(paramArrayOfByte1, "<this>");
    i.e(paramArrayOfByte2, "destination");
    System.arraycopy(paramArrayOfByte1, paramInt2, paramArrayOfByte2, paramInt1, paramInt3 - paramInt2);
  }
  
  public static final void l(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
  {
    i.e(paramArrayOfObject1, "<this>");
    i.e(paramArrayOfObject2, "destination");
    System.arraycopy(paramArrayOfObject1, paramInt2, paramArrayOfObject2, paramInt1, paramInt3 - paramInt2);
  }
  
  public static final void m(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    i.e(paramArrayOfObject, "<this>");
    Arrays.fill(paramArrayOfObject, paramInt1, paramInt2, null);
  }
}

/* Location:
 * Qualified Name:     sb.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
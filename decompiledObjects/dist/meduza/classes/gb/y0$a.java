package gb;

import eb.h0;
import eb.h0.a;
import f;
import java.io.Serializable;

public final class y0$a
  implements h0.a<Integer>
{
  public final byte[] a(Serializable paramSerializable)
  {
    paramSerializable = (Integer)paramSerializable;
    throw new UnsupportedOperationException();
  }
  
  public final Object b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length >= 3)
    {
      int i = paramArrayOfByte[0];
      int j = paramArrayOfByte[1];
      return Integer.valueOf(paramArrayOfByte[2] - 48 + ((j - 48) * 10 + (i - 48) * 100));
    }
    StringBuilder localStringBuilder = f.l("Malformed status code ");
    localStringBuilder.append(new String(paramArrayOfByte, h0.a));
    throw new NumberFormatException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     gb.y0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
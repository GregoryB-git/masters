package eb;

import f;
import java.io.Serializable;
import java.util.List;
import n7.d;

public final class e1$b
  implements s0.g<e1>
{
  public final byte[] a(Serializable paramSerializable)
  {
    return a.b;
  }
  
  public final Object b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = 0;
    if ((i == 1) && (paramArrayOfByte[0] == 48))
    {
      paramArrayOfByte = e1.e;
    }
    else
    {
      i = paramArrayOfByte.length;
      if (i != 1)
      {
        if (i != 2) {
          break label134;
        }
        i = paramArrayOfByte[0];
        if ((i < 48) || (i > 57)) {
          break label134;
        }
        i = 0 + (i - 48) * 10;
        j = 1;
      }
      else
      {
        i = 0;
      }
      j = paramArrayOfByte[j];
      if ((j >= 48) && (j <= 57))
      {
        i = j - 48 + i;
        localObject = e1.d;
        if (i < ((List)localObject).size()) {
          return (e1)((List)localObject).get(i);
        }
      }
      label134:
      Object localObject = e1.g;
      StringBuilder localStringBuilder = f.l("Unknown code ");
      localStringBuilder.append(new String(paramArrayOfByte, d.a));
      paramArrayOfByte = ((e1)localObject).g(localStringBuilder.toString());
    }
    return paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     eb.e1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
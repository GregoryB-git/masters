package d5;

import V4.g;
import Y4.b;
import e5.d;
import java.nio.charset.Charset;
import java.util.Map;

public final class a
  implements g
{
  public static b b(byte[][] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[0].length;
    int j = paramInt * 2;
    b localb = new b(i + j, paramArrayOfByte.length + j);
    localb.b();
    i = localb.g() - paramInt - 1;
    j = 0;
    while (j < paramArrayOfByte.length)
    {
      byte[] arrayOfByte = paramArrayOfByte[j];
      for (int k = 0; k < paramArrayOfByte[0].length; k++) {
        if (arrayOfByte[k] == 1) {
          localb.l(k + paramInt, i);
        }
      }
      j++;
      i--;
    }
    return localb;
  }
  
  public static b c(d paramd, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramd.e(paramString, paramInt1);
    paramString = paramd.f().b(1, 4);
    if (paramInt3 > paramInt2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    int i;
    if (paramString[0].length < paramString.length) {
      i = 1;
    } else {
      i = 0;
    }
    if (paramInt1 != i)
    {
      paramString = d(paramString);
      paramInt1 = 1;
    }
    else
    {
      paramInt1 = 0;
    }
    paramInt2 /= paramString[0].length;
    paramInt3 /= paramString.length;
    if (paramInt2 >= paramInt3) {
      paramInt2 = paramInt3;
    }
    if (paramInt2 > 1)
    {
      paramString = paramd.f().b(paramInt2, paramInt2 << 2);
      paramd = paramString;
      if (paramInt1 != 0) {
        paramd = d(paramString);
      }
      return b(paramd, paramInt4);
    }
    return b(paramString, paramInt4);
  }
  
  public static byte[][] d(byte[][] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0].length;
    int j = paramArrayOfByte.length;
    byte[][] arrayOfByte = new byte[i][j];
    for (j = 0; j < paramArrayOfByte.length; j++)
    {
      int k = paramArrayOfByte.length;
      for (i = 0; i < paramArrayOfByte[0].length; i++) {
        arrayOfByte[i][(k - j - 1)] = ((byte)paramArrayOfByte[j][i]);
      }
    }
    return arrayOfByte;
  }
  
  public b a(String paramString, V4.a parama, int paramInt1, int paramInt2, Map paramMap)
  {
    if (parama == V4.a.y)
    {
      parama = new d();
      int i = 30;
      int j = 2;
      int k = j;
      int m = i;
      V4.c localc;
      if (paramMap != null)
      {
        localc = V4.c.u;
        if (paramMap.containsKey(localc)) {
          parama.h(Boolean.valueOf(paramMap.get(localc).toString()).booleanValue());
        }
        localc = V4.c.v;
        if (paramMap.containsKey(localc)) {
          parama.i(e5.c.valueOf(paramMap.get(localc).toString()));
        }
        localc = V4.c.w;
        if (paramMap.containsKey(localc)) {
          break label250;
        }
        localc = V4.c.t;
        if (paramMap.containsKey(localc)) {
          i = Integer.parseInt(paramMap.get(localc).toString());
        }
        localc = V4.c.o;
        if (paramMap.containsKey(localc)) {
          j = Integer.parseInt(paramMap.get(localc).toString());
        }
        localc = V4.c.p;
        k = j;
        m = i;
        if (paramMap.containsKey(localc))
        {
          parama.j(Charset.forName(paramMap.get(localc).toString()));
          m = i;
          k = j;
        }
      }
      break label264;
      label250:
      android.support.v4.media.a.a(paramMap.get(localc));
      throw null;
      label264:
      return c(parama, paramString, k, paramInt1, paramInt2, m);
    }
    throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(parama)));
  }
}

/* Location:
 * Qualified Name:     d5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
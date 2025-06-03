package g0;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

public abstract class d
{
  public static final byte[] a = { 0, 0, 0, 1 };
  public static final String[] b = { "", "A", "B", "C" };
  
  public static String a(int paramInt1, int paramInt2, int paramInt3)
  {
    return String.format("avc1.%02X%02X%02X", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public static List b(boolean paramBoolean)
  {
    byte[] arrayOfByte;
    if (paramBoolean)
    {
      arrayOfByte = new byte[1];
      arrayOfByte[0] = ((byte)1);
    }
    else
    {
      arrayOfByte = new byte[1];
      arrayOfByte[0] = ((byte)0);
    }
    return Collections.singletonList(arrayOfByte);
  }
  
  public static String c(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int[] paramArrayOfInt, int paramInt4)
  {
    Object localObject = b[paramInt1];
    int i;
    if (paramBoolean)
    {
      paramInt1 = 72;
      i = paramInt1;
    }
    else
    {
      paramInt1 = 76;
      i = paramInt1;
    }
    localObject = new StringBuilder(M.G("hvc1.%s%d.%X.%c%d", new Object[] { localObject, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Character.valueOf(i), Integer.valueOf(paramInt4) }));
    for (paramInt1 = paramArrayOfInt.length; (paramInt1 > 0) && (paramArrayOfInt[(paramInt1 - 1)] == 0); paramInt1--) {}
    for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2++) {
      ((StringBuilder)localObject).append(String.format(".%02X", new Object[] { Integer.valueOf(paramArrayOfInt[paramInt2]) }));
    }
    return ((StringBuilder)localObject).toString();
  }
  
  public static byte[] d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramInt2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte2, arrayOfByte1.length, paramInt2);
    return arrayOfByte2;
  }
  
  public static Pair e(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new z(paramArrayOfByte);
    paramArrayOfByte.T(9);
    int i = paramArrayOfByte.G();
    paramArrayOfByte.T(20);
    return Pair.create(Integer.valueOf(paramArrayOfByte.K()), Integer.valueOf(i));
  }
  
  public static boolean f(List paramList)
  {
    int i = paramList.size();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i == 1)
    {
      bool2 = bool1;
      if (((byte[])paramList.get(0)).length == 1)
      {
        bool2 = bool1;
        if (((byte[])paramList.get(0))[0] == 1) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     g0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
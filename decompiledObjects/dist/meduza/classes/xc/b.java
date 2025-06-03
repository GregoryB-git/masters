package xc;

import ec.i;

public final class b
{
  public static final f.a a = new f.a();
  
  public static final boolean a(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    i.e(paramArrayOfByte1, "a");
    i.e(paramArrayOfByte2, "b");
    for (int i = 0; i < paramInt3; i++) {
      if (paramArrayOfByte1[(i + paramInt1)] != paramArrayOfByte2[(i + paramInt2)]) {
        return false;
      }
    }
    return true;
  }
  
  public static final void b(long paramLong1, long paramLong2, long paramLong3)
  {
    if (((paramLong2 | paramLong3) >= 0L) && (paramLong2 <= paramLong1) && (paramLong1 - paramLong2 >= paramLong3)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("size=");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(" offset=");
    localStringBuilder.append(paramLong2);
    localStringBuilder.append(" byteCount=");
    localStringBuilder.append(paramLong3);
    throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     xc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
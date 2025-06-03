package v5;

import a0.j;
import java.io.Serializable;
import java.util.Arrays;

public final class n
{
  public int a;
  public Serializable b;
  
  public final void a(long paramLong)
  {
    int i = a;
    Object localObject = b;
    if (i == ((long[])localObject).length) {
      b = Arrays.copyOf((long[])localObject, i * 2);
    }
    localObject = (long[])b;
    i = a;
    a = (i + 1);
    localObject[i] = paramLong;
  }
  
  public final long b(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < a)) {
      return ((long[])b)[paramInt];
    }
    StringBuilder localStringBuilder = j.n("Invalid index ", paramInt, ", size is ");
    localStringBuilder.append(a);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     v5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
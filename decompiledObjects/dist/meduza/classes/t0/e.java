package t0;

import androidx.emoji2.text.h;
import java.nio.ByteBuffer;
import u0.a;
import u0.c;

public final class e
{
  public static final ThreadLocal<a> d = new ThreadLocal();
  public final int a;
  public final h b;
  public volatile int c = 0;
  
  public e(h paramh, int paramInt)
  {
    b = paramh;
    a = paramInt;
  }
  
  public final int a(int paramInt)
  {
    a locala = c();
    int i = locala.a(16);
    if (i != 0)
    {
      ByteBuffer localByteBuffer = b;
      i += a;
      paramInt = localByteBuffer.getInt(paramInt * 4 + (localByteBuffer.getInt(i) + i + 4));
    }
    else
    {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public final int b()
  {
    a locala = c();
    int i = locala.a(16);
    if (i != 0)
    {
      i += a;
      int j = b.getInt(i);
      i = b.getInt(j + i);
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public final a c()
  {
    ThreadLocal localThreadLocal = d;
    Object localObject1 = (a)localThreadLocal.get();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new a();
      localThreadLocal.set(localObject2);
    }
    localObject1 = b.a;
    int i = a;
    int j = ((c)localObject1).a(6);
    if (j != 0)
    {
      j += a;
      i = i * 4 + (b.getInt(j) + j + 4);
      i = b.getInt(i) + i;
      localObject1 = b;
      b = ((ByteBuffer)localObject1);
      if (localObject1 != null)
      {
        a = i;
        i -= ((ByteBuffer)localObject1).getInt(i);
        c = i;
        i = b.getShort(i);
      }
      else
      {
        i = 0;
        a = 0;
        c = 0;
      }
      d = i;
    }
    return (a)localObject2;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append(", id:");
    a locala = c();
    int i = locala.a(4);
    int j = 0;
    if (i != 0) {
      i = b.getInt(i + a);
    } else {
      i = 0;
    }
    localStringBuilder.append(Integer.toHexString(i));
    localStringBuilder.append(", codepoints:");
    int k = b();
    for (i = j; i < k; i++)
    {
      localStringBuilder.append(Integer.toHexString(a(i)));
      localStringBuilder.append(" ");
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     t0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
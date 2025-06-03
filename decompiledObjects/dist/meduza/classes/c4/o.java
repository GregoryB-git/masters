package c4;

import java.util.Arrays;
import java.util.Collections;
import p4.a;
import p4.a.b;
import v3.i0;
import v3.i0.a;
import v5.e0;
import v5.t;

public final class o
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final long j;
  public final a k;
  public final a l;
  
  public o(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, a parama, a parama1)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
    f = d(paramInt5);
    g = paramInt6;
    h = paramInt7;
    i = a(paramInt7);
    j = paramLong;
    k = parama;
    l = parama1;
  }
  
  public o(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = new t(paramArrayOfByte, paramArrayOfByte.length);
    paramArrayOfByte.k(paramInt * 8);
    a = paramArrayOfByte.g(16);
    b = paramArrayOfByte.g(16);
    c = paramArrayOfByte.g(24);
    d = paramArrayOfByte.g(24);
    paramInt = paramArrayOfByte.g(20);
    e = paramInt;
    f = d(paramInt);
    g = (paramArrayOfByte.g(3) + 1);
    paramInt = paramArrayOfByte.g(5) + 1;
    h = paramInt;
    i = a(paramInt);
    paramInt = paramArrayOfByte.g(4);
    int m = paramArrayOfByte.g(32);
    int n = e0.a;
    j = ((paramInt & 0xFFFFFFFF) << 32 | m & 0xFFFFFFFF);
    k = null;
    l = null;
  }
  
  public static int a(int paramInt)
  {
    if (paramInt != 8)
    {
      if (paramInt != 12)
      {
        if (paramInt != 16)
        {
          if (paramInt != 20)
          {
            if (paramInt != 24) {
              return -1;
            }
            return 6;
          }
          return 5;
        }
        return 4;
      }
      return 2;
    }
    return 1;
  }
  
  public static int d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 192000: 
      return 3;
    case 176400: 
      return 2;
    case 96000: 
      return 11;
    case 88200: 
      return 1;
    case 48000: 
      return 10;
    case 44100: 
      return 9;
    case 32000: 
      return 8;
    case 24000: 
      return 7;
    case 22050: 
      return 6;
    case 16000: 
      return 5;
    }
    return 4;
  }
  
  public final long b()
  {
    long l1 = j;
    if (l1 == 0L) {
      l1 = -9223372036854775807L;
    } else {
      l1 = l1 * 1000000L / e;
    }
    return l1;
  }
  
  public final i0 c(byte[] paramArrayOfByte, a parama)
  {
    paramArrayOfByte[4] = ((byte)Byte.MIN_VALUE);
    int m = d;
    if (m <= 0) {
      m = -1;
    }
    Object localObject = l;
    if (localObject != null)
    {
      if (parama != null)
      {
        parama = a;
        if (parama.length != 0) {}
      }
      else
      {
        parama = (a)localObject;
        break label116;
      }
      long l1 = b;
      localObject = a;
      int n = e0.a;
      Object[] arrayOfObject = Arrays.copyOf((Object[])localObject, localObject.length + parama.length);
      System.arraycopy(parama, 0, arrayOfObject, localObject.length, parama.length);
      parama = new a(l1, (a.b[])arrayOfObject);
    }
    label116:
    localObject = new i0.a();
    k = "audio/flac";
    l = m;
    x = g;
    y = e;
    m = Collections.singletonList(paramArrayOfByte);
    i = parama;
    return new i0((i0.a)localObject);
  }
  
  public static final class a
  {
    public final long[] a;
    public final long[] b;
    
    public a(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
    {
      a = paramArrayOfLong1;
      b = paramArrayOfLong2;
    }
  }
}

/* Location:
 * Qualified Name:     c4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
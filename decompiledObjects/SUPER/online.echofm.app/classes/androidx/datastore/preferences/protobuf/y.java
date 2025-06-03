package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public abstract class y
{
  public static final Charset a = Charset.forName("UTF-8");
  public static final Charset b = Charset.forName("ISO-8859-1");
  public static final byte[] c;
  public static final ByteBuffer d;
  public static final h e;
  
  static
  {
    byte[] arrayOfByte = new byte[0];
    c = arrayOfByte;
    d = ByteBuffer.wrap(arrayOfByte);
    e = h.h(arrayOfByte);
  }
  
  public static Object a(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static Object b(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException(paramString);
  }
  
  public static int c(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1231;
    } else {
      i = 1237;
    }
    return i;
  }
  
  public static int d(byte[] paramArrayOfByte)
  {
    return e(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt2 = i(paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = paramInt2;
    if (paramInt2 == 0) {
      paramInt1 = 1;
    }
    return paramInt1;
  }
  
  public static int f(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static boolean g(byte[] paramArrayOfByte)
  {
    return q0.m(paramArrayOfByte);
  }
  
  public static Object h(Object paramObject1, Object paramObject2)
  {
    return ((O)paramObject1).f().h((O)paramObject2).c();
  }
  
  public static int i(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    int j = paramInt1;
    for (paramInt1 = i; paramInt1 < paramInt2 + paramInt3; paramInt1++) {
      j = j * 31 + paramArrayOfByte[paramInt1];
    }
    return j;
  }
  
  public static String j(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, a);
  }
  
  public static abstract interface a
  {
    public abstract boolean a(int paramInt);
  }
  
  public static abstract interface b
    extends List, RandomAccess
  {
    public abstract b h(int paramInt);
    
    public abstract void j();
    
    public abstract boolean p();
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
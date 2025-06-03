package D6;

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;

public class c
  implements Serializable, Comparable
{
  public static final char[] r = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  public static final c s = n(new byte[0]);
  private static final long serialVersionUID = 1L;
  public final byte[] o;
  public transient int p;
  public transient String q;
  
  public c(byte[] paramArrayOfByte)
  {
    o = paramArrayOfByte;
  }
  
  public static int c(String paramString, int paramInt)
  {
    int i = paramString.length();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      if (k == paramInt) {
        return j;
      }
      int m = paramString.codePointAt(j);
      if (((Character.isISOControl(m)) && (m != 10) && (m != 13)) || (m == 65533)) {
        return -1;
      }
      k++;
      j += Character.charCount(m);
    }
    return paramString.length();
  }
  
  public static c h(String paramString)
  {
    if (paramString != null)
    {
      if (paramString.length() % 2 == 0)
      {
        int i = paramString.length() / 2;
        localObject = new byte[i];
        for (int j = 0; j < i; j++)
        {
          int k = j * 2;
          localObject[j] = ((byte)(byte)((j(paramString.charAt(k)) << 4) + j(paramString.charAt(k + 1))));
        }
        return n((byte[])localObject);
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Unexpected hex string: ");
      ((StringBuilder)localObject).append(paramString);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    throw new IllegalArgumentException("hex == null");
  }
  
  public static int j(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return paramChar - '0';
    }
    if ((paramChar >= 'a') && (paramChar <= 'f')) {
      return paramChar - 'W';
    }
    if ((paramChar >= 'A') && (paramChar <= 'F')) {
      return paramChar - '7';
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unexpected hex digit: ");
    localStringBuilder.append(paramChar);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static c n(byte... paramVarArgs)
  {
    if (paramVarArgs != null) {
      return new c((byte[])paramVarArgs.clone());
    }
    throw new IllegalArgumentException("data == null");
  }
  
  public static c p(InputStream paramInputStream, int paramInt)
  {
    if (paramInputStream != null)
    {
      if (paramInt >= 0)
      {
        byte[] arrayOfByte = new byte[paramInt];
        int i = 0;
        while (i < paramInt)
        {
          int j = paramInputStream.read(arrayOfByte, i, paramInt - i);
          if (j != -1) {
            i += j;
          } else {
            throw new EOFException();
          }
        }
        return new c(arrayOfByte);
      }
      paramInputStream = new StringBuilder();
      paramInputStream.append("byteCount < 0: ");
      paramInputStream.append(paramInt);
      throw new IllegalArgumentException(paramInputStream.toString());
    }
    throw new IllegalArgumentException("in == null");
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream = p(paramObjectInputStream, paramObjectInputStream.readInt());
    try
    {
      Field localField = c.class.getDeclaredField("o");
      localField.setAccessible(true);
      localField.set(this, o);
      return;
    }
    catch (IllegalAccessException paramObjectInputStream)
    {
      throw new AssertionError();
    }
    catch (NoSuchFieldException paramObjectInputStream)
    {
      throw new AssertionError();
    }
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.writeInt(o.length);
    paramObjectOutputStream.write(o);
  }
  
  public int e(c paramc)
  {
    int i = r();
    int j = paramc.r();
    int k = Math.min(i, j);
    int n;
    int i1;
    int i2;
    for (int m = 0;; m++)
    {
      n = -1;
      if (m >= k) {
        break label83;
      }
      i1 = l(m) & 0xFF;
      i2 = paramc.l(m) & 0xFF;
      if (i1 != i2) {
        break;
      }
    }
    if (i1 >= i2) {
      n = 1;
    }
    return n;
    label83:
    if (i == j) {
      return 0;
    }
    if (i >= j) {
      n = 1;
    }
    return n;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof c))
    {
      paramObject = (c)paramObject;
      int i = ((c)paramObject).r();
      byte[] arrayOfByte = o;
      if ((i == arrayOfByte.length) && (((c)paramObject).o(0, arrayOfByte, 0, arrayOfByte.length))) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int i = p;
    if (i == 0)
    {
      i = Arrays.hashCode(o);
      p = i;
    }
    return i;
  }
  
  public byte l(int paramInt)
  {
    return o[paramInt];
  }
  
  public String m()
  {
    byte[] arrayOfByte = o;
    char[] arrayOfChar1 = new char[arrayOfByte.length * 2];
    int i = arrayOfByte.length;
    int j = 0;
    int k = 0;
    for (;;)
    {
      int m = k;
      if (j >= i) {
        break;
      }
      int n = arrayOfByte[j];
      char[] arrayOfChar2 = r;
      arrayOfChar1[m] = ((char)arrayOfChar2[(n >> 4 & 0xF)]);
      k = m + 2;
      arrayOfChar1[(m + 1)] = ((char)arrayOfChar2[(n & 0xF)]);
      j++;
    }
    return new String(arrayOfChar1);
  }
  
  public boolean o(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= 0)
    {
      byte[] arrayOfByte = o;
      if ((paramInt1 <= arrayOfByte.length - paramInt3) && (paramInt2 >= 0) && (paramInt2 <= paramArrayOfByte.length - paramInt3) && (g.a(arrayOfByte, paramInt1, paramArrayOfByte, paramInt2, paramInt3)))
      {
        bool = true;
        break label55;
      }
    }
    boolean bool = false;
    label55:
    return bool;
  }
  
  public int r()
  {
    return o.length;
  }
  
  public c s(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      byte[] arrayOfByte = o;
      if (paramInt2 <= arrayOfByte.length)
      {
        int i = paramInt2 - paramInt1;
        if (i >= 0)
        {
          if ((paramInt1 == 0) && (paramInt2 == arrayOfByte.length)) {
            return this;
          }
          localObject = new byte[i];
          System.arraycopy(arrayOfByte, paramInt1, localObject, 0, i);
          return new c((byte[])localObject);
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("endIndex > length(");
      ((StringBuilder)localObject).append(o.length);
      ((StringBuilder)localObject).append(")");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    throw new IllegalArgumentException("beginIndex < 0");
  }
  
  public String toString()
  {
    if (o.length == 0) {
      return "[size=0]";
    }
    Object localObject = u();
    int i = c((String)localObject, 64);
    if (i == -1)
    {
      if (o.length <= 64)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("[hex=");
        ((StringBuilder)localObject).append(m());
        ((StringBuilder)localObject).append("]");
      }
      for (;;)
      {
        localObject = ((StringBuilder)localObject).toString();
        break;
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("[size=");
        ((StringBuilder)localObject).append(o.length);
        ((StringBuilder)localObject).append(" hex=");
        ((StringBuilder)localObject).append(s(0, 64).m());
        ((StringBuilder)localObject).append("…]");
      }
      return (String)localObject;
    }
    String str = ((String)localObject).substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
    if (i < ((String)localObject).length())
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("[size=");
      ((StringBuilder)localObject).append(o.length);
      ((StringBuilder)localObject).append(" text=");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("…]");
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      break;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("[text=");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("]");
    }
    return (String)localObject;
  }
  
  public String u()
  {
    String str = q;
    if (str == null)
    {
      str = new String(o, g.a);
      q = str;
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     D6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
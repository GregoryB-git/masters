package c2;

import f;
import java.util.Objects;

public final class j
{
  public final k[] a;
  public final String b;
  public final byte[] c;
  public final int d;
  
  public j(String paramString, k[] paramArrayOfk)
  {
    b = paramString;
    c = null;
    a = paramArrayOfk;
    d = 0;
  }
  
  public j(byte[] paramArrayOfByte, k[] paramArrayOfk)
  {
    Objects.requireNonNull(paramArrayOfByte);
    c = paramArrayOfByte;
    b = null;
    a = paramArrayOfk;
    d = 1;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == d) {
      return;
    }
    StringBuilder localStringBuilder = f.l("Wrong data accessor type detected. ");
    int i = d;
    String str1 = "Unknown";
    String str2;
    if (i != 0)
    {
      if (i != 1) {
        str2 = "Unknown";
      } else {
        str2 = "ArrayBuffer";
      }
    }
    else {
      str2 = "String";
    }
    localStringBuilder.append(str2);
    localStringBuilder.append(" expected, but got ");
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        str2 = str1;
      } else {
        str2 = "ArrayBuffer";
      }
    }
    else {
      str2 = "String";
    }
    localStringBuilder.append(str2);
    throw new IllegalStateException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     c2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
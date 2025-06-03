package p7;

import f;
import java.util.Objects;
import x6.b;

public class a$e
  extends a
{
  public final a.a b;
  public final Character c;
  
  public a$e(String paramString1, String paramString2, Character paramCharacter)
  {
    this(new a.a(paramString1, paramString2.toCharArray()), paramCharacter);
  }
  
  public a$e(a.a parama, Character paramCharacter)
  {
    parama.getClass();
    b = parama;
    boolean bool = false;
    if (paramCharacter != null)
    {
      int i = paramCharacter.charValue();
      parama = g;
      if ((i < parama.length) && (parama[i] != -1)) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {}
    }
    else
    {
      bool = true;
    }
    b.n(paramCharacter, "Padding character %s was already in alphabet", bool);
    c = paramCharacter;
  }
  
  public int b(byte[] paramArrayOfByte, CharSequence paramCharSequence)
  {
    paramCharSequence = e(paramCharSequence);
    a.a locala = b;
    int i = paramCharSequence.length();
    if (h[(i % e)] != 0)
    {
      i = 0;
      int j = i;
      while (i < paramCharSequence.length())
      {
        long l1 = 0L;
        int k = 0;
        for (int m = k;; m = n)
        {
          locala = b;
          if (k >= e) {
            break;
          }
          long l2 = l1 << d;
          l1 = l2;
          n = m;
          if (i + k < paramCharSequence.length())
          {
            l1 = l2 | b.a(paramCharSequence.charAt(m + i));
            n = m + 1;
          }
          k++;
        }
        k = f;
        int i1 = d;
        int n = (k - 1) * 8;
        while (n >= k * 8 - m * i1)
        {
          paramArrayOfByte[j] = ((byte)(byte)(int)(l1 >>> n & 0xFF));
          n -= 8;
          j++;
        }
        i += b.e;
      }
      return j;
    }
    paramArrayOfByte = f.l("Invalid input length ");
    paramArrayOfByte.append(paramCharSequence.length());
    throw new a.d(paramArrayOfByte.toString());
  }
  
  public void d(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
  {
    b.E(0, 0 + paramInt, paramArrayOfByte.length);
    int i = 0;
    while (i < paramInt)
    {
      f(paramStringBuilder, paramArrayOfByte, 0 + i, Math.min(b.f, paramInt - i));
      i += b.f;
    }
  }
  
  public final CharSequence e(CharSequence paramCharSequence)
  {
    Character localCharacter = c;
    if (localCharacter == null) {
      return paramCharSequence;
    }
    int i = localCharacter.charValue();
    int j = paramCharSequence.length();
    int k;
    do
    {
      k = j - 1;
      if (k < 0) {
        break;
      }
      j = k;
    } while (paramCharSequence.charAt(k) == i);
    return paramCharSequence.subSequence(0, k + 1);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof e;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (e)paramObject;
      bool3 = bool2;
      if (b.equals(b))
      {
        bool3 = bool2;
        if (Objects.equals(c, c)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public final void f(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    b.E(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    int i = b.f;
    int j = 0;
    boolean bool;
    if (paramInt2 <= i) {
      bool = true;
    } else {
      bool = false;
    }
    b.t(bool);
    long l = 0L;
    for (i = 0; i < paramInt2; i++) {
      l = (l | paramArrayOfByte[(paramInt1 + i)] & 0xFF) << 8;
    }
    i = b.d;
    paramInt1 = j;
    while (paramInt1 < paramInt2 * 8)
    {
      j = (int)(l >>> (paramInt2 + 1) * 8 - i - paramInt1);
      paramArrayOfByte = b;
      int k = c;
      paramStringBuilder.append(b[(j & k)]);
      paramInt1 += b.d;
    }
    if (c != null) {
      while (paramInt1 < b.f * 8)
      {
        paramStringBuilder.append(c.charValue());
        paramInt1 += b.d;
      }
    }
  }
  
  public a g(a.a parama)
  {
    return new e(parama, null);
  }
  
  public final int hashCode()
  {
    return b.hashCode() ^ Objects.hashCode(c);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("BaseEncoding.");
    localStringBuilder.append(b);
    if (8 % b.d != 0)
    {
      String str;
      if (c == null)
      {
        str = ".omitPadding()";
      }
      else
      {
        localStringBuilder.append(".withPadChar('");
        localStringBuilder.append(c);
        str = "')";
      }
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p7.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
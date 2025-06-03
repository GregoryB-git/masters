package p7;

import f;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

public abstract class a
{
  public static final c a;
  
  static
  {
    Character localCharacter = Character.valueOf('=');
    a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", localCharacter);
    new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", localCharacter);
    new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", localCharacter);
    new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", localCharacter);
    new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
  }
  
  public final byte[] a(String paramString)
  {
    try
    {
      Object localObject = e(paramString);
      int i = ((CharSequence)localObject).length();
      i = (int)((b.d * i + 7L) / 8L);
      paramString = new byte[i];
      int j = b(paramString, (CharSequence)localObject);
      if (j != i)
      {
        localObject = new byte[j];
        System.arraycopy(paramString, 0, localObject, 0, j);
        paramString = (String)localObject;
      }
      return paramString;
    }
    catch (d paramString)
    {
      throw new IllegalArgumentException(paramString);
    }
  }
  
  public abstract int b(byte[] paramArrayOfByte, CharSequence paramCharSequence);
  
  public final String c(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    x6.b.E(0, i + 0, paramArrayOfByte.length);
    Object localObject = b;
    int j = e;
    localObject = new StringBuilder(q7.b.a(i, f, RoundingMode.CEILING) * j);
    try
    {
      d((StringBuilder)localObject, paramArrayOfByte, i);
      return ((StringBuilder)localObject).toString();
    }
    catch (IOException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
  
  public abstract void d(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt);
  
  public abstract CharSequence e(CharSequence paramCharSequence);
  
  public static final class a
  {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;
    
    public a(String paramString, char[] paramArrayOfChar)
    {
      a = paramString;
      b = paramArrayOfChar;
      try
      {
        j = q7.b.b(paramArrayOfChar.length, RoundingMode.UNNECESSARY);
        d = j;
        k = Integer.numberOfTrailingZeros(j);
        int m = 1 << 3 - k;
        e = m;
        f = (j >> k);
        c = (paramArrayOfChar.length - 1);
        g = arrayOfByte;
        paramString = new boolean[m];
        for (j = 0; j < f; j++) {
          paramString[q7.b.a(j * 8, d, RoundingMode.CEILING)] = 1;
        }
        h = paramString;
        i = false;
        return;
      }
      catch (ArithmeticException localArithmeticException)
      {
        paramString = f.l("Illegal alphabet length ");
        paramString.append(paramArrayOfChar.length);
        throw new IllegalArgumentException(paramString.toString(), localArithmeticException);
      }
    }
    
    public final int a(char paramChar)
    {
      if (paramChar <= '')
      {
        int j = g[paramChar];
        if (j == -1)
        {
          if ((paramChar > ' ') && (paramChar != ''))
          {
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("Unrecognized character: ");
            localStringBuilder.append(paramChar);
            throw new a.d(localStringBuilder.toString());
          }
          localStringBuilder = f.l("Unrecognized character: 0x");
          localStringBuilder.append(Integer.toHexString(paramChar));
          throw new a.d(localStringBuilder.toString());
        }
        return j;
      }
      StringBuilder localStringBuilder = f.l("Unrecognized character: 0x");
      localStringBuilder.append(Integer.toHexString(paramChar));
      throw new a.d(localStringBuilder.toString());
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (a)paramObject;
        bool3 = bool2;
        if (i == i)
        {
          bool3 = bool2;
          if (Arrays.equals(b, b)) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public final int hashCode()
    {
      int j = Arrays.hashCode(b);
      int k;
      if (i) {
        k = 1231;
      } else {
        k = 1237;
      }
      return j + k;
    }
    
    public final String toString()
    {
      return a;
    }
  }
  
  public static final class b
    extends a.e
  {
    public final char[] d = new char['Ȁ'];
    
    public b(a.a parama)
    {
      super(null);
      int i = b.length;
      int j = 0;
      boolean bool;
      if (i == 16) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.t(bool);
      while (j < 256)
      {
        char[] arrayOfChar1 = d;
        char[] arrayOfChar2 = b;
        arrayOfChar1[j] = ((char)arrayOfChar2[(j >>> 4)]);
        arrayOfChar1[(j | 0x100)] = ((char)arrayOfChar2[(j & 0xF)]);
        j++;
      }
    }
    
    public final int b(byte[] paramArrayOfByte, CharSequence paramCharSequence)
    {
      if (paramCharSequence.length() % 2 != 1)
      {
        int i = 0;
        for (int j = 0; i < paramCharSequence.length(); j++)
        {
          paramArrayOfByte[j] = ((byte)(byte)(b.a(paramCharSequence.charAt(i)) << 4 | b.a(paramCharSequence.charAt(i + 1))));
          i += 2;
        }
        return j;
      }
      paramArrayOfByte = f.l("Invalid input length ");
      paramArrayOfByte.append(paramCharSequence.length());
      throw new a.d(paramArrayOfByte.toString());
    }
    
    public final void d(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
    {
      x6.b.E(0, 0 + paramInt, paramArrayOfByte.length);
      for (int i = 0; i < paramInt; i++)
      {
        int j = paramArrayOfByte[(0 + i)] & 0xFF;
        paramStringBuilder.append(d[j]);
        paramStringBuilder.append(d[(j | 0x100)]);
      }
    }
    
    public final a g(a.a parama)
    {
      return new b(parama);
    }
  }
  
  public static final class c
    extends a.e
  {
    public c(String paramString1, String paramString2, Character paramCharacter)
    {
      this(new a.a(paramString1, paramString2.toCharArray()), paramCharacter);
    }
    
    public c(a.a parama, Character paramCharacter)
    {
      super(paramCharacter);
      boolean bool;
      if (b.length == 64) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.t(bool);
    }
    
    public final int b(byte[] paramArrayOfByte, CharSequence paramCharSequence)
    {
      paramCharSequence = e(paramCharSequence);
      a.a locala = b;
      int i = paramCharSequence.length();
      if (h[(i % e)] != 0)
      {
        int j = 0;
        i = 0;
        while (j < paramCharSequence.length())
        {
          locala = b;
          int k = j + 1;
          j = locala.a(paramCharSequence.charAt(j));
          locala = b;
          int m = k + 1;
          int n = j << 18 | locala.a(paramCharSequence.charAt(k)) << 12;
          k = i + 1;
          paramArrayOfByte[i] = ((byte)(byte)(n >>> 16));
          i = k;
          j = m;
          if (m < paramCharSequence.length())
          {
            locala = b;
            int i1 = m + 1;
            m = n | locala.a(paramCharSequence.charAt(m)) << 6;
            i = k + 1;
            paramArrayOfByte[k] = ((byte)(byte)(m >>> 8 & 0xFF));
            if (i1 < paramCharSequence.length())
            {
              locala = b;
              j = i1 + 1;
              i1 = locala.a(paramCharSequence.charAt(i1));
              k = i + 1;
              paramArrayOfByte[i] = ((byte)(byte)((m | i1) & 0xFF));
              i = k;
            }
            else
            {
              j = i1;
            }
          }
        }
        return i;
      }
      paramArrayOfByte = f.l("Invalid input length ");
      paramArrayOfByte.append(paramCharSequence.length());
      throw new a.d(paramArrayOfByte.toString());
    }
    
    public final void d(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
    {
      int i = 0;
      int j = 0 + paramInt;
      x6.b.E(0, j, paramArrayOfByte.length);
      while (paramInt >= 3)
      {
        int k = i + 1;
        int m = paramArrayOfByte[i];
        i = k + 1;
        k = (m & 0xFF) << 16 | (paramArrayOfByte[k] & 0xFF) << 8 | paramArrayOfByte[i] & 0xFF;
        paramStringBuilder.append(b.b[(k >>> 18)]);
        paramStringBuilder.append(b.b[(k >>> 12 & 0x3F)]);
        paramStringBuilder.append(b.b[(k >>> 6 & 0x3F)]);
        paramStringBuilder.append(b.b[(k & 0x3F)]);
        paramInt -= 3;
        i++;
      }
      if (i < j) {
        f(paramStringBuilder, paramArrayOfByte, i, j - i);
      }
    }
    
    public final a g(a.a parama)
    {
      return new c(parama, null);
    }
  }
  
  public static final class d
    extends IOException
  {
    public d(String paramString)
    {
      super();
    }
  }
  
  public static class e
    extends a
  {
    public final a.a b;
    public final Character c;
    
    public e(String paramString1, String paramString2, Character paramCharacter)
    {
      this(new a.a(paramString1, paramString2.toCharArray()), paramCharacter);
    }
    
    public e(a.a parama, Character paramCharacter)
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
      x6.b.n(paramCharacter, "Padding character %s was already in alphabet", bool);
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
      x6.b.E(0, 0 + paramInt, paramArrayOfByte.length);
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
      x6.b.E(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
      int i = b.f;
      int j = 0;
      boolean bool;
      if (paramInt2 <= i) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.t(bool);
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
}

/* Location:
 * Qualified Name:     p7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
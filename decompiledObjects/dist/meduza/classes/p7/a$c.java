package p7;

import f;
import x6.b;

public final class a$c
  extends a.e
{
  public a$c(String paramString1, String paramString2, Character paramCharacter)
  {
    this(new a.a(paramString1, paramString2.toCharArray()), paramCharacter);
  }
  
  public a$c(a.a parama, Character paramCharacter)
  {
    super(parama, paramCharacter);
    boolean bool;
    if (b.length == 64) {
      bool = true;
    } else {
      bool = false;
    }
    b.t(bool);
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
    b.E(0, j, paramArrayOfByte.length);
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

/* Location:
 * Qualified Name:     p7.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
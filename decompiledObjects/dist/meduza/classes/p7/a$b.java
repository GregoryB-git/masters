package p7;

import f;
import x6.b;

public final class a$b
  extends a.e
{
  public final char[] d = new char['Ȁ'];
  
  public a$b(a.a parama)
  {
    super(parama, null);
    int i = b.length;
    int j = 0;
    boolean bool;
    if (i == 16) {
      bool = true;
    } else {
      bool = false;
    }
    b.t(bool);
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
    b.E(0, 0 + paramInt, paramArrayOfByte.length);
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

/* Location:
 * Qualified Name:     p7.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
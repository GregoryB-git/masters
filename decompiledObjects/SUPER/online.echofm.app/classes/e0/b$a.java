package e0;

import W2.k;
import d0.q;
import g0.M;

public final class b$a
{
  public static final a e = new a(-1, -1, -1);
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  
  public b$a(int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    if (M.A0(paramInt3)) {
      paramInt1 = M.g0(paramInt3, paramInt2);
    } else {
      paramInt1 = -1;
    }
    d = paramInt1;
  }
  
  public b$a(q paramq)
  {
    this(C, B, D);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if ((a != a) || (b != b) || (c != c)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return k.b(new Object[] { Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AudioFormat[sampleRate=");
    localStringBuilder.append(a);
    localStringBuilder.append(", channelCount=");
    localStringBuilder.append(b);
    localStringBuilder.append(", encoding=");
    localStringBuilder.append(c);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     e0.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.media;

import java.util.Arrays;

public class AudioAttributesImplBase
  implements AudioAttributesImpl
{
  public int a;
  public int b;
  public int c;
  public int d;
  
  public AudioAttributesImplBase()
  {
    a = 0;
    b = 0;
    c = 0;
    d = -1;
  }
  
  public AudioAttributesImplBase(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b = paramInt1;
    c = paramInt2;
    a = paramInt3;
    d = paramInt4;
  }
  
  public int a()
  {
    int i = d;
    if (i != -1) {
      return i;
    }
    return AudioAttributesCompat.c(false, c, a);
  }
  
  public Object b()
  {
    return null;
  }
  
  public int c()
  {
    return b;
  }
  
  public int d()
  {
    int i = c;
    int j = a();
    int k;
    if (j == 6)
    {
      k = i | 0x4;
    }
    else
    {
      k = i;
      if (j == 7) {
        k = i | 0x1;
      }
    }
    return k & 0x111;
  }
  
  public int e()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof AudioAttributesImplBase;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (AudioAttributesImplBase)paramObject;
    bool1 = bool2;
    if (b == ((AudioAttributesImplBase)paramObject).c())
    {
      bool1 = bool2;
      if (c == ((AudioAttributesImplBase)paramObject).d())
      {
        bool1 = bool2;
        if (a == ((AudioAttributesImplBase)paramObject).e())
        {
          bool1 = bool2;
          if (d == d) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(a), Integer.valueOf(d) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("AudioAttributesCompat:");
    if (d != -1)
    {
      localStringBuilder.append(" stream=");
      localStringBuilder.append(d);
      localStringBuilder.append(" derived");
    }
    localStringBuilder.append(" usage=");
    localStringBuilder.append(AudioAttributesCompat.e(a));
    localStringBuilder.append(" content=");
    localStringBuilder.append(b);
    localStringBuilder.append(" flags=0x");
    localStringBuilder.append(Integer.toHexString(c).toUpperCase());
    return localStringBuilder.toString();
  }
  
  public static class a
    implements AudioAttributesImpl.a
  {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;
    
    public AudioAttributesImpl a()
    {
      return new AudioAttributesImplBase(b, c, a, d);
    }
    
    public a e(int paramInt)
    {
      int i = paramInt;
      if (paramInt != 0)
      {
        i = paramInt;
        if (paramInt != 1)
        {
          i = paramInt;
          if (paramInt != 2)
          {
            i = paramInt;
            if (paramInt != 3)
            {
              i = paramInt;
              if (paramInt != 4) {
                i = 0;
              }
            }
          }
        }
      }
      b = i;
      return this;
    }
    
    public a f(int paramInt)
    {
      c = (paramInt & 0x3FF | c);
      return this;
    }
    
    public a g(int paramInt)
    {
      int i = paramInt;
      switch (paramInt)
      {
      }
      for (i = 0;; i = 12)
      {
        a = i;
        break;
      }
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
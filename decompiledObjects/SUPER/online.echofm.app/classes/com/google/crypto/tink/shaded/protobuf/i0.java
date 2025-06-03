package com.google.crypto.tink.shaded.protobuf;

public abstract class i0
{
  public static String a(h paramh)
  {
    return b(new a());
  }
  
  public static String b(b paramb)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramb.size());
    for (int i = 0; i < paramb.size(); i++)
    {
      int j = paramb.a(i);
      String str;
      if (j != 34) {
        if (j != 39) {
          if (j != 92) {
            switch (j)
            {
            default: 
              if ((j >= 32) && (j <= 126)) {}
              for (;;)
              {
                localStringBuilder.append((char)j);
                break;
                localStringBuilder.append('\\');
                localStringBuilder.append((char)((j >>> 6 & 0x3) + 48));
                localStringBuilder.append((char)((j >>> 3 & 0x7) + 48));
                j = (j & 0x7) + 48;
              }
            case 13: 
              str = "\\r";
            }
          }
        }
      }
      for (;;)
      {
        localStringBuilder.append(str);
        break;
        str = "\\f";
        continue;
        str = "\\v";
        continue;
        str = "\\n";
        continue;
        str = "\\t";
        continue;
        str = "\\b";
        continue;
        str = "\\a";
        continue;
        str = "\\\\";
        continue;
        str = "\\'";
        continue;
        str = "\\\"";
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String c(String paramString)
  {
    return a(h.q(paramString));
  }
  
  public class a
    implements i0.b
  {
    public a() {}
    
    public byte a(int paramInt)
    {
      return d(paramInt);
    }
    
    public int size()
    {
      return i0.this.size();
    }
  }
  
  public static abstract interface b
  {
    public abstract byte a(int paramInt);
    
    public abstract int size();
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
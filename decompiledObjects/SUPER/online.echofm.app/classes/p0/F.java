package p0;

import j0.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l0.y1;

public abstract interface F
{
  public abstract void a(b paramb);
  
  public abstract boolean b(byte[] paramArrayOfByte, String paramString);
  
  public abstract void c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public abstract Map d(byte[] paramArrayOfByte);
  
  public abstract void e(byte[] paramArrayOfByte);
  
  public abstract void f(byte[] paramArrayOfByte, y1 paramy1);
  
  public abstract byte[] g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public abstract d h();
  
  public abstract void i(byte[] paramArrayOfByte);
  
  public abstract a j(byte[] paramArrayOfByte, List paramList, int paramInt, HashMap paramHashMap);
  
  public abstract int k();
  
  public abstract b l(byte[] paramArrayOfByte);
  
  public abstract byte[] m();
  
  public abstract void release();
  
  public static final class a
  {
    public final byte[] a;
    public final String b;
    public final int c;
    
    public a(byte[] paramArrayOfByte, String paramString, int paramInt)
    {
      a = paramArrayOfByte;
      b = paramString;
      c = paramInt;
    }
    
    public byte[] a()
    {
      return a;
    }
    
    public String b()
    {
      return b;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(F paramF, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2);
  }
  
  public static abstract interface c
  {
    public abstract F a(UUID paramUUID);
  }
  
  public static final class d
  {
    public final byte[] a;
    public final String b;
    
    public d(byte[] paramArrayOfByte, String paramString)
    {
      a = paramArrayOfByte;
      b = paramString;
    }
    
    public byte[] a()
    {
      return a;
    }
    
    public String b()
    {
      return b;
    }
  }
}

/* Location:
 * Qualified Name:     p0.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
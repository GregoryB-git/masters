package a4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import w3.a0;
import z3.b;

public abstract interface o
{
  public abstract Map<String, String> a(byte[] paramArrayOfByte);
  
  public abstract d b();
  
  public abstract b c(byte[] paramArrayOfByte);
  
  public abstract byte[] d();
  
  public abstract void e(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public abstract void f(byte[] paramArrayOfByte);
  
  public abstract void g(b.a parama);
  
  public abstract byte[] h(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public abstract void i(byte[] paramArrayOfByte);
  
  public abstract void j(byte[] paramArrayOfByte, a0 parama0);
  
  public abstract a k(byte[] paramArrayOfByte, List<d.b> paramList, int paramInt, HashMap<String, String> paramHashMap);
  
  public abstract int l();
  
  public abstract boolean m(String paramString, byte[] paramArrayOfByte);
  
  public abstract void release();
  
  public static final class a
  {
    public final byte[] a;
    public final String b;
    
    public a(String paramString, byte[] paramArrayOfByte)
    {
      a = paramArrayOfByte;
      b = paramString;
    }
  }
  
  public static abstract interface b {}
  
  public static abstract interface c
  {
    public abstract o b(UUID paramUUID);
  }
  
  public static final class d
  {
    public final byte[] a;
    public final String b;
    
    public d(String paramString, byte[] paramArrayOfByte)
    {
      a = paramArrayOfByte;
      b = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     a4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package m;

import eb.e1;
import java.util.List;
import ma.h;
import wa.d;

public abstract class e
  implements d
{
  public abstract Object c(String paramString);
  
  public abstract String d();
  
  public boolean e()
  {
    return Boolean.TRUE.equals(c("noResult"));
  }
  
  public abstract boolean f();
  
  public void g(int paramInt) {}
  
  public void h(int paramInt, long paramLong) {}
  
  public void i(long paramLong) {}
  
  public void j(long paramLong) {}
  
  public void k(int paramInt) {}
  
  public void l(int paramInt, long paramLong1, long paramLong2) {}
  
  public void m(long paramLong) {}
  
  public void n(long paramLong) {}
  
  public void o(e1 parame1) {}
  
  public abstract void p(h paramh);
  
  public abstract void q(double paramDouble);
  
  public abstract void r();
  
  public abstract void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract void t(long paramLong);
  
  public String toString()
  {
    switch (a)
    {
    default: 
      return super.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(d());
    localStringBuilder.append(" ");
    localStringBuilder.append((String)c("sql"));
    localStringBuilder.append(" ");
    localStringBuilder.append((List)c("arguments"));
    return localStringBuilder.toString();
  }
  
  public abstract void u(String paramString);
}

/* Location:
 * Qualified Name:     m.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
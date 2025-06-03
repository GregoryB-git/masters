package J3;

public abstract class B$e$d$a$b$a
{
  public static a a()
  {
    return new o.b();
  }
  
  public abstract long b();
  
  public abstract String c();
  
  public abstract long d();
  
  public abstract String e();
  
  public byte[] f()
  {
    Object localObject = e();
    if (localObject != null) {
      localObject = ((String)localObject).getBytes(B.a());
    } else {
      localObject = null;
    }
    return (byte[])localObject;
  }
  
  public static abstract class a
  {
    public abstract B.e.d.a.b.a a();
    
    public abstract a b(long paramLong);
    
    public abstract a c(String paramString);
    
    public abstract a d(long paramLong);
    
    public abstract a e(String paramString);
    
    public a f(byte[] paramArrayOfByte)
    {
      return e(new String(paramArrayOfByte, B.a()));
    }
  }
}

/* Location:
 * Qualified Name:     J3.B.e.d.a.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
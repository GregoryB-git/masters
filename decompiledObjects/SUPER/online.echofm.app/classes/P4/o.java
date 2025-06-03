package P4;

import s3.l;

public class o
  extends l
{
  public final a o;
  
  public o(String paramString)
  {
    super(paramString);
    o = a.p;
  }
  
  public o(String paramString, a parama)
  {
    super(paramString);
    o = parama;
  }
  
  public o(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    o = a.p;
  }
  
  public o(String paramString, Throwable paramThrowable, a parama)
  {
    super(paramString, paramThrowable);
    o = parama;
  }
  
  public static enum a
  {
    public final int o;
    
    static
    {
      a locala1 = new a("UNKNOWN", 0, 0);
      p = locala1;
      a locala2 = new a("CONFIG_UPDATE_STREAM_ERROR", 1, 1);
      q = locala2;
      a locala3 = new a("CONFIG_UPDATE_MESSAGE_INVALID", 2, 2);
      r = locala3;
      a locala4 = new a("CONFIG_UPDATE_NOT_FETCHED", 3, 3);
      s = locala4;
      a locala5 = new a("CONFIG_UPDATE_UNAVAILABLE", 4, 4);
      t = locala5;
      u = new a[] { locala1, locala2, locala3, locala4, locala5 };
    }
    
    public a(int paramInt1)
    {
      o = paramInt1;
    }
  }
}

/* Location:
 * Qualified Name:     P4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
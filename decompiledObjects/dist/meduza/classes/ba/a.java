package ba;

import b9.c;

public final class a
{
  public final long a;
  public final String b;
  public final String c;
  public final b d;
  public final c e;
  public final String f;
  public final String g;
  public final int h;
  public final int i;
  public final String j;
  public final long k;
  public final a l;
  public final String m;
  public final long n;
  public final String o;
  
  public a(long paramLong, String paramString1, String paramString2, b paramb, c paramc, String paramString3, String paramString4, int paramInt1, int paramInt2, String paramString5, a parama, String paramString6, String paramString7)
  {
    a = paramLong;
    b = paramString1;
    c = paramString2;
    d = paramb;
    e = paramc;
    f = paramString3;
    g = paramString4;
    h = paramInt1;
    i = paramInt2;
    j = paramString5;
    k = 0L;
    l = parama;
    m = paramString6;
    n = 0L;
    o = paramString7;
  }
  
  public static enum a
    implements c
  {
    public final int a;
    
    static
    {
      a locala1 = new a("UNKNOWN_EVENT", 0, 0);
      a locala2 = new a("MESSAGE_DELIVERED", 1, 1);
      b = locala2;
      c = new a[] { locala1, locala2, new a("MESSAGE_OPEN", 2, 2) };
    }
    
    public a(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a()
    {
      return a;
    }
  }
  
  public static enum b
    implements c
  {
    public final int a;
    
    static
    {
      b localb1 = new b("UNKNOWN", 0, 0);
      b localb2 = new b("DATA_MESSAGE", 1, 1);
      b = localb2;
      b localb3 = new b("TOPIC", 2, 2);
      b localb4 = new b("DISPLAY_NOTIFICATION", 3, 3);
      c = localb4;
      d = new b[] { localb1, localb2, localb3, localb4 };
    }
    
    public b(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a()
    {
      return a;
    }
  }
  
  public static enum c
    implements c
  {
    public final int a;
    
    static
    {
      c localc1 = new c("UNKNOWN_OS", 0, 0);
      c localc2 = new c("ANDROID", 1, 1);
      b = localc2;
      c = new c[] { localc1, localc2, new c("IOS", 2, 2), new c("WEB", 3, 3) };
    }
    
    public c(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     ba.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package ib;

public enum k
{
  public final String a;
  
  static
  {
    k localk1 = new k("TLS_1_3", 0, "TLSv1.3");
    b = localk1;
    k localk2 = new k("TLS_1_2", 1, "TLSv1.2");
    c = localk2;
    k localk3 = new k("TLS_1_1", 2, "TLSv1.1");
    d = localk3;
    k localk4 = new k("TLS_1_0", 3, "TLSv1");
    e = localk4;
    k localk5 = new k("SSL_3_0", 4, "SSLv3");
    f = localk5;
    o = new k[] { localk1, localk2, localk3, localk4, localk5 };
  }
  
  public k(String paramString)
  {
    a = paramString;
  }
}

/* Location:
 * Qualified Name:     ib.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
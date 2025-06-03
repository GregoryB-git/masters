package jb;

public enum a
{
  public final int a;
  
  static
  {
    a locala1 = new a("NO_ERROR", 0, 0);
    b = locala1;
    a locala2 = new a("PROTOCOL_ERROR", 1, 1);
    c = locala2;
    a locala3 = new a("INVALID_STREAM", 2, 1);
    a locala4 = new a("UNSUPPORTED_VERSION", 3, 1);
    a locala5 = new a("STREAM_IN_USE", 4, 1);
    a locala6 = new a("STREAM_ALREADY_CLOSED", 5, 1);
    a locala7 = new a("INTERNAL_ERROR", 6, 2);
    d = locala7;
    a locala8 = new a("FLOW_CONTROL_ERROR", 7, 3);
    e = locala8;
    a locala9 = new a("STREAM_CLOSED", 8, 5);
    f = locala9;
    a locala10 = new a("FRAME_TOO_LARGE", 9, 6);
    o = locala10;
    a locala11 = new a("REFUSED_STREAM", 10, 7);
    p = locala11;
    a locala12 = new a("CANCEL", 11, 8);
    q = locala12;
    a locala13 = new a("COMPRESSION_ERROR", 12, 9);
    r = locala13;
    a locala14 = new a("CONNECT_ERROR", 13, 10);
    s = locala14;
    a locala15 = new a("ENHANCE_YOUR_CALM", 14, 11);
    t = locala15;
    a locala16 = new a("INADEQUATE_SECURITY", 15, 12);
    u = locala16;
    v = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, locala15, locala16, new a("HTTP_1_1_REQUIRED", 16, 13), new a("INVALID_CREDENTIALS", 17, -1) };
  }
  
  public a(int paramInt1)
  {
    a = paramInt1;
  }
}

/* Location:
 * Qualified Name:     jb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
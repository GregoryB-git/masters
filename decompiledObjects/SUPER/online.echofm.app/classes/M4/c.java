package M4;

public enum c
{
  public String o;
  
  static
  {
    c localc1 = new c("APP_START_TRACE_NAME", 0, "_as");
    p = localc1;
    c localc2 = new c("ON_CREATE_TRACE_NAME", 1, "_astui");
    q = localc2;
    c localc3 = new c("ON_START_TRACE_NAME", 2, "_astfd");
    r = localc3;
    c localc4 = new c("ON_RESUME_TRACE_NAME", 3, "_asti");
    s = localc4;
    c localc5 = new c("FOREGROUND_TRACE_NAME", 4, "_fs");
    t = localc5;
    c localc6 = new c("BACKGROUND_TRACE_NAME", 5, "_bs");
    u = localc6;
    v = new c[] { localc1, localc2, localc3, localc4, localc5, localc6 };
  }
  
  public c(String paramString1)
  {
    o = paramString1;
  }
  
  public String toString()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     M4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
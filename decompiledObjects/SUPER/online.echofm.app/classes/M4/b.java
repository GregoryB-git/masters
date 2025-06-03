package M4;

public enum b
{
  public String o;
  
  static
  {
    b localb1 = new b("TRACE_EVENT_RATE_LIMITED", 0, "_fstec");
    p = localb1;
    b localb2 = new b("NETWORK_TRACE_EVENT_RATE_LIMITED", 1, "_fsntc");
    q = localb2;
    b localb3 = new b("TRACE_STARTED_NOT_STOPPED", 2, "_tsns");
    r = localb3;
    b localb4 = new b("FRAMES_TOTAL", 3, "_fr_tot");
    s = localb4;
    b localb5 = new b("FRAMES_SLOW", 4, "_fr_slo");
    t = localb5;
    b localb6 = new b("FRAMES_FROZEN", 5, "_fr_fzn");
    u = localb6;
    v = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
  }
  
  public b(String paramString1)
  {
    o = paramString1;
  }
  
  public String toString()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     M4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
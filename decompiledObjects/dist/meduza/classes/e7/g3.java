package e7;

public enum g3
{
  public final String a;
  
  static
  {
    g3 localg31 = new g3("UNINITIALIZED", 0, "uninitialized");
    b = localg31;
    g3 localg32 = new g3("POLICY", 1, "eu_consent_policy");
    c = localg32;
    g3 localg33 = new g3("DENIED", 2, "denied");
    d = localg33;
    g3 localg34 = new g3("GRANTED", 3, "granted");
    e = localg34;
    f = new g3[] { localg31, localg32, localg33, localg34 };
  }
  
  public g3(String paramString)
  {
    a = paramString;
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     e7.g3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package d9;

public enum b
{
  static
  {
    b localb = new b();
    a = localb;
    b = new b[] { localb };
  }
  
  public b() {}
}

/* Location:
 * Qualified Name:     d9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
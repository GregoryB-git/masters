package h3;

public enum e
{
  static
  {
    e locale1 = new e("DEFAULT", 0);
    a = locale1;
    e locale2 = new e("VERY_LOW", 1);
    b = locale2;
    e locale3 = new e("HIGHEST", 2);
    c = locale3;
    d = new e[] { locale1, locale2, locale3 };
  }
  
  public e() {}
}

/* Location:
 * Qualified Name:     h3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
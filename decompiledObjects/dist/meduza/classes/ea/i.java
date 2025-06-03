package ea;

import a9.g;

public enum i
  implements g
{
  public final int a;
  
  static
  {
    i locali1 = new i("COLLECTION_UNKNOWN", 0, 0);
    i locali2 = new i("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
    b = locali2;
    i locali3 = new i("COLLECTION_ENABLED", 2, 2);
    c = locali3;
    i locali4 = new i("COLLECTION_DISABLED", 3, 3);
    d = locali4;
    e = new i[] { locali1, locali2, locali3, locali4, new i("COLLECTION_DISABLED_REMOTE", 4, 4), new i("COLLECTION_SAMPLED", 5, 5) };
  }
  
  public i(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     ea.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
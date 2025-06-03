package ia;

import ma.a0.a;

public enum a$c
  implements a0.a
{
  public final int a;
  
  static
  {
    c localc1 = new c("QUERY_SCOPE_UNSPECIFIED", 0, 0);
    c localc2 = new c("COLLECTION", 1, 1);
    c localc3 = new c("COLLECTION_GROUP", 2, 2);
    b = localc3;
    c localc4 = new c("UNRECOGNIZED", 3, -1);
    c = localc4;
    d = new c[] { localc1, localc2, localc3, localc4 };
  }
  
  public a$c(int paramInt)
  {
    a = paramInt;
  }
  
  public final int a()
  {
    if (this != c) {
      return a;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     ia.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
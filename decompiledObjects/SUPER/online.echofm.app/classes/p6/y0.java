package p6;

import u6.F;

public abstract class y0
{
  public static final F a = new F("COMPLETING_ALREADY");
  public static final F b = new F("COMPLETING_WAITING_CHILDREN");
  public static final F c = new F("COMPLETING_RETRY");
  public static final F d = new F("TOO_LATE_TO_CANCEL");
  public static final F e = new F("SEALED");
  public static final Z f = new Z(false);
  public static final Z g = new Z(true);
  
  public static final Object g(Object paramObject)
  {
    Object localObject = paramObject;
    if ((paramObject instanceof l0)) {
      localObject = new m0((l0)paramObject);
    }
    return localObject;
  }
  
  public static final Object h(Object paramObject)
  {
    m0 localm0;
    if ((paramObject instanceof m0)) {
      localm0 = (m0)paramObject;
    } else {
      localm0 = null;
    }
    Object localObject = paramObject;
    if (localm0 != null)
    {
      localObject = a;
      if (localObject == null) {
        localObject = paramObject;
      }
    }
    return localObject;
  }
}

/* Location:
 * Qualified Name:     p6.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
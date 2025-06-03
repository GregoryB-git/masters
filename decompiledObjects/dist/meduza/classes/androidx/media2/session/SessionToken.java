package androidx.media2.session;

import b2.e;

public final class SessionToken
  implements e
{
  public SessionTokenImpl a;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof SessionToken)) {
      return false;
    }
    paramObject = (SessionToken)paramObject;
    return a.equals(a);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return a.toString();
  }
  
  public static abstract interface SessionTokenImpl
    extends e
  {}
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
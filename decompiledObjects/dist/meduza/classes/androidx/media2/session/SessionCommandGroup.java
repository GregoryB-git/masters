package androidx.media2.session;

import b2.e;
import java.util.HashSet;
import java.util.Set;

public final class SessionCommandGroup
  implements e
{
  public Set<SessionCommand> a = new HashSet();
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof SessionCommandGroup)) {
      return false;
    }
    Object localObject = (SessionCommandGroup)paramObject;
    paramObject = a;
    localObject = a;
    if (paramObject == null)
    {
      if (localObject != null) {
        bool = false;
      }
      return bool;
    }
    return ((Set)paramObject).equals(localObject);
  }
  
  public final int hashCode()
  {
    Set localSet = a;
    int i;
    if (localSet != null) {
      i = localSet.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionCommandGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
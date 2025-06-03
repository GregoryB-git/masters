package o2;

import android.net.Uri;
import ec.i;

public final class c$a
{
  public final Uri a;
  public final boolean b;
  
  public c$a(boolean paramBoolean, Uri paramUri)
  {
    a = paramUri;
    b = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    Class localClass;
    if (paramObject != null) {
      localClass = paramObject.getClass();
    } else {
      localClass = null;
    }
    if (!i.a(a.class, localClass)) {
      return false;
    }
    i.c(paramObject, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
    paramObject = (a)paramObject;
    if (!i.a(a, a)) {
      return false;
    }
    return b == b;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j;
    if (b) {
      j = 1231;
    } else {
      j = 1237;
    }
    return i * 31 + j;
  }
}

/* Location:
 * Qualified Name:     o2.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
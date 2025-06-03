package j7;

import android.app.PendingIntent;
import f;

public final class c
  extends b
{
  public final PendingIntent a;
  public final boolean b;
  
  public c(PendingIntent paramPendingIntent, boolean paramBoolean)
  {
    if (paramPendingIntent != null)
    {
      a = paramPendingIntent;
      b = paramBoolean;
      return;
    }
    throw new NullPointerException("Null pendingIntent");
  }
  
  public final PendingIntent a()
  {
    return a;
  }
  
  public final boolean b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof b))
    {
      paramObject = (b)paramObject;
      if ((a.equals(((b)paramObject).a())) && (b == ((b)paramObject).b())) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j;
    if (true != b) {
      j = 1237;
    } else {
      j = 1231;
    }
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.m("ReviewInfo{pendingIntent=", a.toString(), ", isNoOp=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     j7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
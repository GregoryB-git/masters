package o2;

import android.app.Notification;

public final class d
{
  public final int a;
  public final int b;
  public final Notification c;
  
  public d(int paramInt1, int paramInt2, Notification paramNotification)
  {
    a = paramInt1;
    c = paramNotification;
    b = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if (a != a) {
        return false;
      }
      if (b != b) {
        return false;
      }
      return c.equals(c);
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = b;
    return c.hashCode() + (i * 31 + j) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ForegroundInfo{");
    localStringBuilder.append("mNotificationId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", mForegroundServiceType=");
    localStringBuilder.append(b);
    localStringBuilder.append(", mNotification=");
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
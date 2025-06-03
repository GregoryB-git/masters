package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import f;
import java.util.Objects;

final class SessionTokenImplBase
  implements SessionToken.SessionTokenImpl
{
  public int a;
  public int b;
  public String c;
  public String d;
  public IBinder e;
  public ComponentName f;
  public Bundle g;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof SessionTokenImplBase;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (SessionTokenImplBase)paramObject;
    bool1 = bool2;
    if (a == a)
    {
      bool1 = bool2;
      if (TextUtils.equals(c, c))
      {
        bool1 = bool2;
        if (TextUtils.equals(d, d))
        {
          bool1 = bool2;
          if (b == b)
          {
            bool1 = bool2;
            if (Objects.equals(e, e)) {
              bool1 = true;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(b), Integer.valueOf(a), c, d });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SessionToken {pkg=");
    localStringBuilder.append(c);
    localStringBuilder.append(" type=");
    localStringBuilder.append(b);
    localStringBuilder.append(" service=");
    localStringBuilder.append(d);
    localStringBuilder.append(" IMediaSession=");
    localStringBuilder.append(e);
    localStringBuilder.append(" extras=");
    localStringBuilder.append(g);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionTokenImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
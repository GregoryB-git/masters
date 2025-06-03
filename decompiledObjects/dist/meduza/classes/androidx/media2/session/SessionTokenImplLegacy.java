package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat.Token;
import androidx.versionedparcelable.CustomVersionedParcelable;
import f;
import java.util.Objects;

final class SessionTokenImplLegacy
  extends CustomVersionedParcelable
  implements SessionToken.SessionTokenImpl
{
  public MediaSessionCompat.Token a;
  public Bundle b;
  public int c;
  public int d;
  public ComponentName e;
  public String f;
  public Bundle g;
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof SessionTokenImplLegacy)) {
      return false;
    }
    paramObject = (SessionTokenImplLegacy)paramObject;
    int i = d;
    if (i != d) {
      return false;
    }
    if (i != 100)
    {
      if (i != 101) {
        return false;
      }
      return Objects.equals(e, e);
    }
    return Objects.equals(a, a);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(d), e, a });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SessionToken {legacyToken=");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionTokenImplLegacy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
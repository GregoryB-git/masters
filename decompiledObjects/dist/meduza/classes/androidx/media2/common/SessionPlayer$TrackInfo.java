package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class SessionPlayer$TrackInfo
  extends CustomVersionedParcelable
{
  public int a;
  public int b;
  public MediaFormat c;
  public boolean d;
  public Bundle e;
  public final Object f = new Object();
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof TrackInfo)) {
      return false;
    }
    paramObject = (TrackInfo)paramObject;
    if (a != a) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(getClass().getName());
    localStringBuilder.append('#');
    localStringBuilder.append(a);
    localStringBuilder.append('{');
    int i = b;
    String str;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 4)
        {
          if (i != 5) {
            str = "UNKNOWN";
          } else {
            str = "METADATA";
          }
        }
        else {
          str = "SUBTITLE";
        }
      }
      else {
        str = "AUDIO";
      }
    }
    else {
      str = "VIDEO";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(c);
    localStringBuilder.append(", isSelectable=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.SessionPlayer.TrackInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
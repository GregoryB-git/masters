package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import b2.e;
import java.util.Objects;

public final class MediaController$PlaybackInfo
  implements e
{
  public int a;
  public int b;
  public int c;
  public int d;
  public AudioAttributesCompat e;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof PlaybackInfo;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (PlaybackInfo)paramObject;
    bool1 = bool2;
    if (a == a)
    {
      bool1 = bool2;
      if (b == b)
      {
        bool1 = bool2;
        if (c == c)
        {
          bool1 = bool2;
          if (d == d)
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
    return Objects.hash(new Object[] { Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d), e });
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.MediaController.PlaybackInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package pa;

import android.os.BaseBundle;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import r.h;
import v3.d0;
import v3.f1.c;

public final class b$c
  implements f1.c
{
  public b$c(b paramb) {}
  
  public final void N(int paramInt)
  {
    MediaSessionCompat localMediaSessionCompat = a.n;
    if (localMediaSessionCompat != null)
    {
      Bundle localBundle = new Bundle();
      Object localObject = a.c;
      long l;
      if (localObject != null) {
        l = ((d0)localObject).getDuration();
      } else {
        l = 0L;
      }
      localObject = MediaMetadataCompat.d;
      if ((((h)localObject).containsKey("android.media.metadata.DURATION")) && (((Integer)((h)localObject).getOrDefault("android.media.metadata.DURATION", null)).intValue() != 0)) {
        throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
      }
      localBundle.putLong("android.media.metadata.DURATION", l);
      localMediaSessionCompat.g(new MediaMetadataCompat(localBundle));
    }
  }
}

/* Location:
 * Qualified Name:     pa.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
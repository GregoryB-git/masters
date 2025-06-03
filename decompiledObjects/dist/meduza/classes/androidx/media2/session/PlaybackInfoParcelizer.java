package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import b2.c;

public final class PlaybackInfoParcelizer
{
  public static MediaController.PlaybackInfo read(c paramc)
  {
    MediaController.PlaybackInfo localPlaybackInfo = new MediaController.PlaybackInfo();
    a = paramc.o(a, 1);
    b = paramc.o(b, 2);
    c = paramc.o(c, 3);
    d = paramc.o(d, 4);
    e = ((AudioAttributesCompat)paramc.x(e, 5));
    return localPlaybackInfo;
  }
  
  public static void write(MediaController.PlaybackInfo paramPlaybackInfo, c paramc)
  {
    paramc.getClass();
    paramc.I(a, 1);
    paramc.I(b, 2);
    paramc.I(c, 3);
    paramc.I(d, 4);
    paramc.R(e, 5);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.PlaybackInfoParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
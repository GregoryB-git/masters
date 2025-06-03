package androidx.media2.common;

import b2.c;

public final class MediaItemParcelizer
{
  public static MediaItem read(c paramc)
  {
    MediaItem localMediaItem = new MediaItem();
    b = ((MediaMetadata)paramc.x(b, 1));
    c = paramc.q(2, c);
    d = paramc.q(3, d);
    return localMediaItem;
  }
  
  public static void write(MediaItem paramMediaItem, c paramc)
  {
    paramc.getClass();
    if (paramMediaItem.getClass() == MediaItem.class)
    {
      paramc.R(b, 1);
      paramc.J(2, c);
      paramc.J(3, d);
      return;
    }
    throw new RuntimeException("MediaItem's subclasses shouldn't be parcelized.");
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.MediaItemParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
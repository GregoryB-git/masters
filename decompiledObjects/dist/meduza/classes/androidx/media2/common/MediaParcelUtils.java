package androidx.media2.common;

import androidx.versionedparcelable.ParcelImpl;
import b2.e;

public final class MediaParcelUtils
{
  public static ParcelImpl a(e parame)
  {
    if ((parame instanceof MediaItem)) {
      return new MediaItemParcelImpl((MediaItem)parame);
    }
    return new ParcelImpl(parame);
  }
  
  public static class MediaItemParcelImpl
    extends ParcelImpl
  {
    public final MediaItem b;
    
    public MediaItemParcelImpl(MediaItem paramMediaItem)
    {
      super();
      b = paramMediaItem;
    }
    
    public final e a()
    {
      return b;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.MediaParcelUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
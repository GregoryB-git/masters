package androidx.media2.common;

import android.graphics.Bitmap;
import b2.c;

public final class BitmapEntryParcelizer
{
  public static MediaMetadata.BitmapEntry read(c paramc)
  {
    MediaMetadata.BitmapEntry localBitmapEntry = new MediaMetadata.BitmapEntry();
    a = paramc.u(1, a);
    b = ((Bitmap)paramc.s(b, 2));
    return localBitmapEntry;
  }
  
  public static void write(MediaMetadata.BitmapEntry paramBitmapEntry, c paramc)
  {
    paramc.getClass();
    paramc.O(1, a);
    paramc.M(b, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.BitmapEntryParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
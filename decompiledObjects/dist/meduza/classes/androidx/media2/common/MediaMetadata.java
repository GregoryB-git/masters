package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b2.e;
import r.b;
import r.h;

public final class MediaMetadata
  extends CustomVersionedParcelable
{
  public Bundle a;
  public Bundle b;
  public ParcelImplListSlice c;
  
  static
  {
    b localb = new b();
    Integer localInteger1 = Integer.valueOf(1);
    localb.put("android.media.metadata.TITLE", localInteger1);
    localb.put("android.media.metadata.ARTIST", localInteger1);
    Integer localInteger2 = Integer.valueOf(0);
    localb.put("android.media.metadata.DURATION", localInteger2);
    localb.put("android.media.metadata.ALBUM", localInteger1);
    localb.put("android.media.metadata.AUTHOR", localInteger1);
    localb.put("android.media.metadata.WRITER", localInteger1);
    localb.put("android.media.metadata.COMPOSER", localInteger1);
    localb.put("android.media.metadata.COMPILATION", localInteger1);
    localb.put("android.media.metadata.DATE", localInteger1);
    localb.put("android.media.metadata.YEAR", localInteger2);
    localb.put("android.media.metadata.GENRE", localInteger1);
    localb.put("android.media.metadata.TRACK_NUMBER", localInteger2);
    localb.put("android.media.metadata.NUM_TRACKS", localInteger2);
    localb.put("android.media.metadata.DISC_NUMBER", localInteger2);
    localb.put("android.media.metadata.ALBUM_ARTIST", localInteger1);
    Integer localInteger3 = Integer.valueOf(2);
    localb.put("android.media.metadata.ART", localInteger3);
    localb.put("android.media.metadata.ART_URI", localInteger1);
    localb.put("android.media.metadata.ALBUM_ART", localInteger3);
    localb.put("android.media.metadata.ALBUM_ART_URI", localInteger1);
    Integer localInteger4 = Integer.valueOf(3);
    localb.put("android.media.metadata.USER_RATING", localInteger4);
    localb.put("android.media.metadata.RATING", localInteger4);
    localb.put("android.media.metadata.DISPLAY_TITLE", localInteger1);
    localb.put("android.media.metadata.DISPLAY_SUBTITLE", localInteger1);
    localb.put("android.media.metadata.DISPLAY_DESCRIPTION", localInteger1);
    localb.put("android.media.metadata.DISPLAY_ICON", localInteger3);
    localb.put("android.media.metadata.DISPLAY_ICON_URI", localInteger1);
    localb.put("android.media.metadata.MEDIA_ID", localInteger1);
    localb.put("android.media.metadata.MEDIA_URI", localInteger1);
    localb.put("androidx.media2.metadata.RADIO_FREQUENCY", Integer.valueOf(4));
    localb.put("androidx.media2.metadata.RADIO_PROGRAM_NAME", localInteger1);
    localb.put("androidx.media2.metadata.BROWSABLE", localInteger2);
    localb.put("androidx.media2.metadata.PLAYABLE", localInteger2);
    localb.put("androidx.media2.metadata.ADVERTISEMENT", localInteger2);
    localb.put("androidx.media2.metadata.DOWNLOAD_STATUS", localInteger2);
    localb.put("androidx.media2.metadata.EXTRAS", Integer.valueOf(5));
  }
  
  public final String toString()
  {
    return a.toString();
  }
  
  public static final class BitmapEntry
    implements e
  {
    public String a;
    public Bitmap b;
    
    public BitmapEntry() {}
    
    public BitmapEntry(Bitmap paramBitmap, String paramString)
    {
      a = paramString;
      b = paramBitmap;
      int i = paramBitmap.getAllocationByteCount();
      if (i > 262144)
      {
        int j = paramBitmap.getWidth();
        int k = paramBitmap.getHeight();
        double d = Math.sqrt(262144.0D / i);
        i = (int)(j * d);
        int m = (int)(k * d);
        paramString = new StringBuilder();
        paramString.append("Scaling large bitmap of ");
        paramString.append(j);
        paramString.append("x");
        paramString.append(k);
        paramString.append(" into ");
        paramString.append(i);
        paramString.append("x");
        paramString.append(m);
        Log.i("MediaMetadata", paramString.toString());
        b = Bitmap.createScaledBitmap(paramBitmap, i, m, true);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.MediaMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
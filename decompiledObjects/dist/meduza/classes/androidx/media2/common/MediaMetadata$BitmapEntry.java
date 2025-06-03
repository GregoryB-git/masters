package androidx.media2.common;

import android.graphics.Bitmap;
import android.util.Log;
import b2.e;

final class MediaMetadata$BitmapEntry
  implements e
{
  public String a;
  public Bitmap b;
  
  public MediaMetadata$BitmapEntry() {}
  
  public MediaMetadata$BitmapEntry(Bitmap paramBitmap, String paramString)
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

/* Location:
 * Qualified Name:     androidx.media2.common.MediaMetadata.BitmapEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
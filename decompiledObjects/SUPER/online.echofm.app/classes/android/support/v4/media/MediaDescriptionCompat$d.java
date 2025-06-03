package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

public final class MediaDescriptionCompat$d
{
  public String a;
  public CharSequence b;
  public CharSequence c;
  public CharSequence d;
  public Bitmap e;
  public Uri f;
  public Bundle g;
  public Uri h;
  
  public MediaDescriptionCompat a()
  {
    return new MediaDescriptionCompat(a, b, c, d, e, f, g, h);
  }
  
  public d b(CharSequence paramCharSequence)
  {
    d = paramCharSequence;
    return this;
  }
  
  public d c(Bundle paramBundle)
  {
    g = paramBundle;
    return this;
  }
  
  public d d(Bitmap paramBitmap)
  {
    e = paramBitmap;
    return this;
  }
  
  public d e(Uri paramUri)
  {
    f = paramUri;
    return this;
  }
  
  public d f(String paramString)
  {
    a = paramString;
    return this;
  }
  
  public d g(Uri paramUri)
  {
    h = paramUri;
    return this;
  }
  
  public d h(CharSequence paramCharSequence)
  {
    c = paramCharSequence;
    return this;
  }
  
  public d i(CharSequence paramCharSequence)
  {
    b = paramCharSequence;
    return this;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
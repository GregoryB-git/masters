package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

final class aen
  extends AsyncTask<Void, Void, Bitmap>
{
  private Exception a = null;
  
  public aen(aeo paramaeo) {}
  
  private final Bitmap a()
  {
    try
    {
      Object localObject = aeo.a(b).src();
      URL localURL = new java/net/URL;
      localURL.<init>((String)localObject);
      localObject = BitmapFactory.decodeStream(localURL.openConnection().getInputStream());
      return (Bitmap)localObject;
    }
    catch (IOException localIOException)
    {
      a = localIOException;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aen
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
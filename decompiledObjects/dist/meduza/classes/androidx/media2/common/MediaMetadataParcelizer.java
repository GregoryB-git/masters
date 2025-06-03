package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.versionedparcelable.ParcelImpl;
import b2.a;
import b2.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class MediaMetadataParcelizer
{
  public static MediaMetadata read(c paramc)
  {
    MediaMetadata localMediaMetadata = new MediaMetadata();
    b = paramc.h(1, b);
    c = ((ParcelImplListSlice)paramc.s(c, 2));
    paramc = b;
    if (paramc == null) {
      paramc = new Bundle();
    }
    a = paramc;
    paramc = c;
    if (paramc != null)
    {
      paramc = a.iterator();
      while (paramc.hasNext())
      {
        MediaMetadata.BitmapEntry localBitmapEntry = (MediaMetadata.BitmapEntry)a.a((ParcelImpl)paramc.next());
        a.putParcelable(a, b);
      }
    }
    return localMediaMetadata;
  }
  
  public static void write(MediaMetadata paramMediaMetadata, c paramc)
  {
    paramc.getClass();
    synchronized (a)
    {
      if (b == null)
      {
        Object localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>(a);
        b = ((Bundle)localObject1);
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        Object localObject2 = a.keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          Object localObject3 = a.get(str);
          if ((localObject3 instanceof Bitmap))
          {
            localObject3 = (Bitmap)localObject3;
            MediaMetadata.BitmapEntry localBitmapEntry = new androidx/media2/common/MediaMetadata$BitmapEntry;
            localBitmapEntry.<init>((Bitmap)localObject3, str);
            ((ArrayList)localObject1).add(MediaParcelUtils.a(localBitmapEntry));
            b.remove(str);
          }
        }
        localObject2 = new androidx/media2/common/ParcelImplListSlice;
        ((ParcelImplListSlice)localObject2).<init>((ArrayList)localObject1);
        c = ((ParcelImplListSlice)localObject2);
      }
    }
    paramc.B(1, b);
    paramc.M(c, 2);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.MediaMetadataParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
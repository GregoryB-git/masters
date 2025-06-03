package androidx.media2.session;

import android.os.Parcelable;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.ParcelImpl;
import b2.c;
import java.util.ArrayList;
import java.util.List;

public final class LibraryResultParcelizer
{
  public static LibraryResult read(c paramc)
  {
    LibraryResult localLibraryResult = new LibraryResult();
    a = paramc.o(a, 1);
    b = paramc.q(2, b);
    d = ((MediaItem)paramc.x(d, 3));
    e = ((MediaLibraryService.LibraryParams)paramc.x(e, 4));
    Object localObject = (ParcelImplListSlice)paramc.s(g, 5);
    g = ((ParcelImplListSlice)localObject);
    c = d;
    paramc = a.a;
    if (localObject == null)
    {
      paramc = null;
    }
    else
    {
      List localList = a;
      paramc = new ArrayList();
      for (int i = 0; i < localList.size(); i++)
      {
        localObject = (ParcelImpl)localList.get(i);
        if (localObject != null) {
          paramc.add((MediaItem)b2.a.a((Parcelable)localObject));
        }
      }
    }
    f = paramc;
    return localLibraryResult;
  }
  
  public static void write(LibraryResult paramLibraryResult, c paramc)
  {
    paramc.getClass();
    Object localObject1 = c;
    if (localObject1 != null) {
      try
      {
        if (d == null) {
          d = a.a(c);
        }
      }
      finally {}
    }
    ArrayList localArrayList = f;
    if (localArrayList != null) {
      try
      {
        if (g == null)
        {
          localObject1 = f;
          Object localObject2 = a.a;
          if (localObject1 == null)
          {
            localObject1 = null;
          }
          else
          {
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            for (int i = 0; i < ((List)localObject1).size(); i++)
            {
              MediaItem localMediaItem = (MediaItem)((List)localObject1).get(i);
              if (localMediaItem != null) {
                ((ArrayList)localObject2).add(MediaParcelUtils.a(localMediaItem));
              }
            }
            localObject1 = new ParcelImplListSlice((ArrayList)localObject2);
          }
          g = ((ParcelImplListSlice)localObject1);
        }
      }
      finally {}
    }
    paramc.I(a, 1);
    paramc.J(2, b);
    paramc.R(d, 3);
    paramc.R(e, 4);
    paramc.M(g, 5);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.LibraryResultParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
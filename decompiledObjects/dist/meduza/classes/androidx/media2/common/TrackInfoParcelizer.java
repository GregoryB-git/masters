package androidx.media2.common;

import android.media.MediaFormat;
import android.os.BaseBundle;
import android.os.Bundle;
import b2.c;

public final class TrackInfoParcelizer
{
  public static SessionPlayer.TrackInfo read(c paramc)
  {
    SessionPlayer.TrackInfo localTrackInfo = new SessionPlayer.TrackInfo();
    int i = a;
    boolean bool = true;
    a = paramc.o(i, 1);
    b = paramc.o(b, 3);
    paramc = paramc.h(4, e);
    e = paramc;
    if ((paramc != null) && (!paramc.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL")))
    {
      paramc = new MediaFormat();
      c = paramc;
      Object localObject = e;
      if (((BaseBundle)localObject).containsKey("language")) {
        paramc.setString("language", ((BaseBundle)localObject).getString("language"));
      }
      localObject = c;
      paramc = e;
      if (paramc.containsKey("mime")) {
        ((MediaFormat)localObject).setString("mime", paramc.getString("mime"));
      }
      paramc = c;
      localObject = e;
      if (((BaseBundle)localObject).containsKey("is-forced-subtitle")) {
        paramc.setInteger("is-forced-subtitle", ((BaseBundle)localObject).getInt("is-forced-subtitle"));
      }
      paramc = c;
      localObject = e;
      if (((BaseBundle)localObject).containsKey("is-autoselect")) {
        paramc.setInteger("is-autoselect", ((BaseBundle)localObject).getInt("is-autoselect"));
      }
      localObject = c;
      paramc = e;
      if (paramc.containsKey("is-default")) {
        ((MediaFormat)localObject).setInteger("is-default", paramc.getInt("is-default"));
      }
    }
    paramc = e;
    if ((paramc != null) && (paramc.containsKey("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE")))
    {
      d = e.getBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE");
    }
    else
    {
      if (b == 1) {
        bool = false;
      }
      d = bool;
    }
    return localTrackInfo;
  }
  
  public static void write(SessionPlayer.TrackInfo paramTrackInfo, c paramc)
  {
    paramc.getClass();
    synchronized (f)
    {
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      e = ((Bundle)localObject2);
      boolean bool;
      if (c == null) {
        bool = true;
      } else {
        bool = false;
      }
      ((BaseBundle)localObject2).putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_FORMAT_NULL", bool);
      localObject3 = c;
      if (localObject3 == null) {
        break label228;
      }
      localObject2 = e;
      if (((MediaFormat)localObject3).containsKey("language")) {
        ((BaseBundle)localObject2).putString("language", ((MediaFormat)localObject3).getString("language"));
      }
    }
    Object localObject3 = c;
    Object localObject2 = e;
    if (((MediaFormat)localObject3).containsKey("mime")) {
      ((BaseBundle)localObject2).putString("mime", ((MediaFormat)localObject3).getString("mime"));
    }
    localObject2 = c;
    localObject3 = e;
    if (((MediaFormat)localObject2).containsKey("is-forced-subtitle")) {
      ((BaseBundle)localObject3).putInt("is-forced-subtitle", ((MediaFormat)localObject2).getInteger("is-forced-subtitle"));
    }
    localObject2 = c;
    localObject3 = e;
    if (((MediaFormat)localObject2).containsKey("is-autoselect")) {
      ((BaseBundle)localObject3).putInt("is-autoselect", ((MediaFormat)localObject2).getInteger("is-autoselect"));
    }
    localObject2 = c;
    localObject3 = e;
    if (((MediaFormat)localObject2).containsKey("is-default")) {
      ((BaseBundle)localObject3).putInt("is-default", ((MediaFormat)localObject2).getInteger("is-default"));
    }
    label228:
    e.putBoolean("androidx.media2.common.SessionPlayer.TrackInfo.KEY_IS_SELECTABLE", d);
    paramc.I(a, 1);
    paramc.I(b, 3);
    paramc.B(4, e);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.TrackInfoParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

public class MediaControllerCompat$a$b
  extends Handler
{
  public boolean a = false;
  
  public MediaControllerCompat$a$b(MediaControllerCompat.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (!a) {
      return;
    }
    switch (what)
    {
    case 10: 
    default: 
      break;
    case 13: 
      b.k();
      break;
    case 12: 
      b.l(((Integer)obj).intValue());
      break;
    case 11: 
      b.b(((Boolean)obj).booleanValue());
      break;
    case 9: 
      b.h(((Integer)obj).intValue());
      break;
    case 8: 
      b.i();
      break;
    case 7: 
      paramMessage = (Bundle)obj;
      MediaSessionCompat.a(paramMessage);
      b.c(paramMessage);
      break;
    case 6: 
      b.g((CharSequence)obj);
      break;
    case 5: 
      b.f((List)obj);
      break;
    case 4: 
      b.a((MediaControllerCompat.d)obj);
      break;
    case 3: 
      b.d((MediaMetadataCompat)obj);
      break;
    case 2: 
      b.e((PlaybackStateCompat)obj);
      break;
    case 1: 
      Bundle localBundle = paramMessage.getData();
      MediaSessionCompat.a(localBundle);
      b.j((String)obj, localBundle);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
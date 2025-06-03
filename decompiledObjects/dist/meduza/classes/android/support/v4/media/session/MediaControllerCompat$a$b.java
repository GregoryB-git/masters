package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

public final class MediaControllerCompat$a$b
  extends Handler
{
  public boolean a = false;
  
  public MediaControllerCompat$a$b(MediaControllerCompat.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (!a) {
      return;
    }
    MediaControllerCompat.a locala;
    switch (what)
    {
    case 10: 
    default: 
      break;
    case 11: 
      locala = b;
      ((Boolean)obj).booleanValue();
      paramMessage = locala;
      break;
    case 9: 
    case 12: 
      locala = b;
      ((Integer)obj).intValue();
      paramMessage = locala;
      break;
    case 7: 
      MediaSessionCompat.a((Bundle)obj);
    case 8: 
    case 13: 
      b.getClass();
      break;
    case 6: 
      locala = b;
      paramMessage = (CharSequence)obj;
      paramMessage = locala;
      break;
    case 5: 
      locala = b;
      paramMessage = (List)obj;
      paramMessage = locala;
      break;
    case 4: 
      locala = b;
      paramMessage = (MediaControllerCompat.c)obj;
      paramMessage = locala;
      break;
    case 3: 
      locala = b;
      paramMessage = (MediaMetadataCompat)obj;
      paramMessage = locala;
      break;
    case 2: 
      locala = b;
      paramMessage = (PlaybackStateCompat)obj;
      paramMessage = locala;
      break;
    case 1: 
      MediaSessionCompat.a(paramMessage.getData());
      locala = b;
      paramMessage = (String)obj;
      paramMessage = locala;
    }
    paramMessage.getClass();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaControllerCompat.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
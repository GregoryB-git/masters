package o4;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

public final class e
  extends MediaCodec.Callback
{
  public final Object a = new Object();
  public final HandlerThread b;
  public Handler c;
  public final i d;
  public final i e;
  public final ArrayDeque<MediaCodec.BufferInfo> f;
  public final ArrayDeque<MediaFormat> g;
  public MediaFormat h;
  public MediaFormat i;
  public MediaCodec.CodecException j;
  public long k;
  public boolean l;
  public IllegalStateException m;
  
  public e(HandlerThread paramHandlerThread)
  {
    b = paramHandlerThread;
    d = new i();
    e = new i();
    f = new ArrayDeque();
    g = new ArrayDeque();
  }
  
  public final void a()
  {
    if (!g.isEmpty()) {
      i = ((MediaFormat)g.getLast());
    }
    i locali = d;
    a = 0;
    b = -1;
    c = 0;
    locali = e;
    a = 0;
    b = -1;
    c = 0;
    f.clear();
    g.clear();
  }
  
  public final void onError(MediaCodec arg1, MediaCodec.CodecException paramCodecException)
  {
    synchronized (a)
    {
      j = paramCodecException;
      return;
    }
  }
  
  public final void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt)
  {
    synchronized (a)
    {
      d.a(paramInt);
      return;
    }
  }
  
  public final void onOutputBufferAvailable(MediaCodec arg1, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    synchronized (a)
    {
      MediaFormat localMediaFormat = i;
      if (localMediaFormat != null)
      {
        e.a(-2);
        g.add(localMediaFormat);
        i = null;
      }
      e.a(paramInt);
      f.add(paramBufferInfo);
      return;
    }
  }
  
  public final void onOutputFormatChanged(MediaCodec arg1, MediaFormat paramMediaFormat)
  {
    synchronized (a)
    {
      e.a(-2);
      g.add(paramMediaFormat);
      i = null;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     o4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
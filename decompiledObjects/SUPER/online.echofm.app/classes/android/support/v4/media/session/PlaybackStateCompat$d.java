package android.support.v4.media.session;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat$d
{
  public final List a;
  public int b;
  public long c;
  public long d;
  public float e;
  public long f;
  public int g;
  public CharSequence h;
  public long i;
  public long j;
  public Bundle k;
  
  public PlaybackStateCompat$d()
  {
    a = new ArrayList();
    j = -1L;
  }
  
  public PlaybackStateCompat$d(PlaybackStateCompat paramPlaybackStateCompat)
  {
    ArrayList localArrayList = new ArrayList();
    a = localArrayList;
    j = -1L;
    b = o;
    c = p;
    e = r;
    i = v;
    d = q;
    f = s;
    g = t;
    h = u;
    List localList = w;
    if (localList != null) {
      localArrayList.addAll(localList);
    }
    j = x;
    k = y;
  }
  
  public d a(PlaybackStateCompat.CustomAction paramCustomAction)
  {
    if (paramCustomAction != null)
    {
      a.add(paramCustomAction);
      return this;
    }
    throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
  }
  
  public PlaybackStateCompat b()
  {
    return new PlaybackStateCompat(b, c, d, e, f, g, h, i, a, j, k);
  }
  
  public d c(long paramLong)
  {
    f = paramLong;
    return this;
  }
  
  public d d(long paramLong)
  {
    j = paramLong;
    return this;
  }
  
  public d e(long paramLong)
  {
    d = paramLong;
    return this;
  }
  
  public d f(int paramInt, CharSequence paramCharSequence)
  {
    g = paramInt;
    h = paramCharSequence;
    return this;
  }
  
  public d g(Bundle paramBundle)
  {
    k = paramBundle;
    return this;
  }
  
  public d h(int paramInt, long paramLong1, float paramFloat, long paramLong2)
  {
    b = paramInt;
    c = paramLong1;
    i = paramLong2;
    e = paramFloat;
    return this;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
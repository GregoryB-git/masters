package android.support.v4.media.session;

import android.os.Bundle;
import android.text.TextUtils;

public final class PlaybackStateCompat$CustomAction$b
{
  public final String a;
  public final CharSequence b;
  public final int c;
  public Bundle d;
  
  public PlaybackStateCompat$CustomAction$b(String paramString, CharSequence paramCharSequence, int paramInt)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (!TextUtils.isEmpty(paramCharSequence))
      {
        if (paramInt != 0)
        {
          a = paramString;
          b = paramCharSequence;
          c = paramInt;
          return;
        }
        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
      }
      throw new IllegalArgumentException("You must specify a name to build a CustomAction");
    }
    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
  }
  
  public PlaybackStateCompat.CustomAction a()
  {
    return new PlaybackStateCompat.CustomAction(a, b, c, d);
  }
  
  public b b(Bundle paramBundle)
  {
    d = paramBundle;
    return this;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.CustomAction.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
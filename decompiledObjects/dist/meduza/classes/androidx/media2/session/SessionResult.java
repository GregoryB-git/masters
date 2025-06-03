package androidx.media2.session;

import android.os.Bundle;
import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class SessionResult
  extends CustomVersionedParcelable
{
  public int a;
  public long b;
  public Bundle c;
  public MediaItem d;
  public MediaItem e;
  
  public SessionResult() {}
  
  public SessionResult(int paramInt, Bundle paramBundle)
  {
    a = paramInt;
    c = paramBundle;
    d = null;
    b = l;
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
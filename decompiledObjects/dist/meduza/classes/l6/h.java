package l6;

import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import m6.j;

public final class h<L>
{
  public volatile Object a;
  
  public h(Looper paramLooper, L paramL, String paramString)
  {
    new zzh(paramLooper);
    if (paramL != null)
    {
      a = paramL;
      j.e(paramString);
      return;
    }
    throw new NullPointerException("Listener must not be null");
  }
  
  public static final class a<L>
  {
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      ((a)paramObject).getClass();
      throw null;
    }
    
    public final int hashCode()
    {
      System.identityHashCode(null);
      throw null;
    }
  }
}

/* Location:
 * Qualified Name:     l6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
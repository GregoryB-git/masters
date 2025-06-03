package androidx.transition;

import android.os.IBinder;

class WindowIdApi14
  implements WindowIdImpl
{
  private final IBinder mToken;
  
  public WindowIdApi14(IBinder paramIBinder)
  {
    mToken = paramIBinder;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof WindowIdApi14)) && (mToken.equals(mToken))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return mToken.hashCode();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.WindowIdApi14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
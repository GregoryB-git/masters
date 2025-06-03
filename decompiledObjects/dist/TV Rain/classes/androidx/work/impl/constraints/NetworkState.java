package androidx.work.impl.constraints;

import androidx.annotation.NonNull;

public class NetworkState
{
  private boolean mIsConnected;
  private boolean mIsMetered;
  private boolean mIsNotRoaming;
  private boolean mIsValidated;
  
  public NetworkState(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    mIsConnected = paramBoolean1;
    mIsValidated = paramBoolean2;
    mIsMetered = paramBoolean3;
    mIsNotRoaming = paramBoolean4;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof NetworkState)) {
      return false;
    }
    paramObject = (NetworkState)paramObject;
    if ((mIsConnected != mIsConnected) || (mIsValidated != mIsValidated) || (mIsMetered != mIsMetered) || (mIsNotRoaming != mIsNotRoaming)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    boolean bool1 = mIsConnected;
    boolean bool2 = bool1;
    if (mIsValidated) {
      j = bool1 + true;
    }
    bool1 = j;
    int i;
    if (mIsMetered) {
      i = j + 256;
    }
    int j = i;
    if (mIsNotRoaming) {
      j = i + 4096;
    }
    return j;
  }
  
  public boolean isConnected()
  {
    return mIsConnected;
  }
  
  public boolean isMetered()
  {
    return mIsMetered;
  }
  
  public boolean isNotRoaming()
  {
    return mIsNotRoaming;
  }
  
  public boolean isValidated()
  {
    return mIsValidated;
  }
  
  @NonNull
  public String toString()
  {
    return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[] { Boolean.valueOf(mIsConnected), Boolean.valueOf(mIsValidated), Boolean.valueOf(mIsMetered), Boolean.valueOf(mIsNotRoaming) });
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.NetworkState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
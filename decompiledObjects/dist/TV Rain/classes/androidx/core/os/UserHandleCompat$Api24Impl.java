package androidx.core.os;

import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class UserHandleCompat$Api24Impl
{
  @NonNull
  public static UserHandle getUserHandleForUid(int paramInt)
  {
    return UserHandle.getUserHandleForUid(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.UserHandleCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.util.Log;

public final class ProfileInstallReceiver$a
  implements c.c
{
  public ProfileInstallReceiver$a(ProfileInstallReceiver paramProfileInstallReceiver) {}
  
  public final void a()
  {
    Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
  }
  
  public final void b(int paramInt, Object paramObject)
  {
    c.b.b(paramInt, paramObject);
    a.setResultCode(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.ProfileInstallReceiver.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
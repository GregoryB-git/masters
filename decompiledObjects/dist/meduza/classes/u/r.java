package u;

import android.app.Notification.Builder;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import f;

public final class r
  extends s
{
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    paramBundle.putInt("android.callType", 0);
    paramBundle.putBoolean("android.callIsVideo", false);
    paramBundle.putCharSequence("android.verificationText", null);
    paramBundle.putParcelable("android.answerIntent", null);
    paramBundle.putParcelable("android.declineIntent", null);
    paramBundle.putParcelable("android.hangUpIntent", null);
  }
  
  public final void b(t paramt)
  {
    if (Build.VERSION.SDK_INT >= 31)
    {
      if (Log.isLoggable("NotifCompat", 3))
      {
        paramt = f.l("Unrecognized call type in CallStyle: ");
        paramt.append(String.valueOf(0));
        Log.d("NotifCompat", paramt.toString());
      }
    }
    else
    {
      Notification.Builder localBuilder = b;
      Object localObject = null;
      localBuilder.setContentTitle(null);
      paramt = a.v;
      if ((paramt != null) && (paramt.containsKey("android.text"))) {
        paramt = a.v.getCharSequence("android.text");
      } else {
        paramt = null;
      }
      if (paramt == null) {
        paramt = (t)localObject;
      }
      localBuilder.setContentText(paramt);
      a.b(localBuilder, "call");
    }
  }
  
  public final String c()
  {
    return "androidx.core.app.NotificationCompat$CallStyle";
  }
  
  public static final class a
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, String paramString)
    {
      return paramBuilder.addPerson(paramString);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, String paramString)
    {
      return paramBuilder.setCategory(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     u.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
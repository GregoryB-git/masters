package G1;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class m$a
{
  public final void a()
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
    localEditor.remove("com.facebook.appevents.SessionInfo.interruptionCount");
    localEditor.remove("com.facebook.appevents.SessionInfo.sessionId");
    localEditor.apply();
    o.c.a();
  }
  
  public final m b()
  {
    Object localObject = PreferenceManager.getDefaultSharedPreferences(B.l());
    long l1 = ((SharedPreferences)localObject).getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
    long l2 = ((SharedPreferences)localObject).getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
    String str = ((SharedPreferences)localObject).getString("com.facebook.appevents.SessionInfo.sessionId", null);
    if ((l1 != 0L) && (l2 != 0L) && (str != null))
    {
      m localm = new m(Long.valueOf(l1), Long.valueOf(l2), null, 4, null);
      m.a(localm, ((SharedPreferences)localObject).getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0));
      localm.l(o.c.b());
      localm.i(Long.valueOf(System.currentTimeMillis()));
      localObject = UUID.fromString(str);
      Intrinsics.checkNotNullExpressionValue(localObject, "fromString(sessionIDStr)");
      localm.j((UUID)localObject);
      return localm;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     G1.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
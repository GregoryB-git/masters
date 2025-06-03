package G1;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class m
{
  public static final a g = new a(null);
  public final Long a;
  public Long b;
  public UUID c;
  public int d;
  public Long e;
  public o f;
  
  public m(Long paramLong1, Long paramLong2, UUID paramUUID)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramUUID;
  }
  
  public final Long b()
  {
    Long localLong1 = e;
    Long localLong2 = localLong1;
    if (localLong1 == null) {
      localLong2 = Long.valueOf(0L);
    }
    return localLong2;
  }
  
  public final int c()
  {
    return d;
  }
  
  public final UUID d()
  {
    return c;
  }
  
  public final Long e()
  {
    return b;
  }
  
  public final long f()
  {
    if (a != null)
    {
      Long localLong = b;
      if (localLong != null)
      {
        if (localLong != null)
        {
          l = localLong.longValue() - a.longValue();
          return l;
        }
        throw new IllegalStateException("Required value was null.".toString());
      }
    }
    long l = 0L;
    return l;
  }
  
  public final o g()
  {
    return f;
  }
  
  public final void h()
  {
    d += 1;
  }
  
  public final void i(Long paramLong)
  {
    e = paramLong;
  }
  
  public final void j(UUID paramUUID)
  {
    Intrinsics.checkNotNullParameter(paramUUID, "<set-?>");
    c = paramUUID;
  }
  
  public final void k(Long paramLong)
  {
    b = paramLong;
  }
  
  public final void l(o paramo)
  {
    f = paramo;
  }
  
  public final void m()
  {
    Object localObject = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
    Long localLong = a;
    long l1 = 0L;
    long l2;
    if (localLong == null) {
      l2 = 0L;
    } else {
      l2 = localLong.longValue();
    }
    ((SharedPreferences.Editor)localObject).putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l2);
    localLong = b;
    if (localLong == null) {
      l2 = l1;
    } else {
      l2 = localLong.longValue();
    }
    ((SharedPreferences.Editor)localObject).putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2);
    ((SharedPreferences.Editor)localObject).putInt("com.facebook.appevents.SessionInfo.interruptionCount", d);
    ((SharedPreferences.Editor)localObject).putString("com.facebook.appevents.SessionInfo.sessionId", c.toString());
    ((SharedPreferences.Editor)localObject).apply();
    localObject = f;
    if ((localObject != null) && (localObject != null)) {
      ((o)localObject).a();
    }
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     G1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
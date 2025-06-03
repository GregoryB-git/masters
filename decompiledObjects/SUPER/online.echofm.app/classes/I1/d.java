package I1;

import O1.P;
import O1.r;
import O1.v;
import W5.m;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class d
{
  public static final d a = new d();
  public static final String b = e.class.getSimpleName();
  
  public static final Bundle a(e.a parama, String paramString, List paramList)
  {
    if (T1.a.d(d.class)) {
      return null;
    }
    Bundle localBundle;
    try
    {
      Intrinsics.checkNotNullParameter(parama, "eventType");
      Intrinsics.checkNotNullParameter(paramString, "applicationId");
      Intrinsics.checkNotNullParameter(paramList, "appEvents");
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("event", parama.toString());
      localBundle.putString("app_id", paramString);
      if (e.a.q == parama)
      {
        parama = a.b(paramList, paramString);
        if (parama.length() == 0) {
          return null;
        }
        localBundle.putString("custom_events", parama.toString());
      }
    }
    finally
    {
      break label97;
    }
    return localBundle;
    label97:
    T1.a.b(parama, d.class);
    return null;
  }
  
  public final JSONArray b(List paramList, String paramString)
  {
    if (T1.a.d(this)) {
      return null;
    }
    JSONArray localJSONArray;
    for (;;)
    {
      try
      {
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        paramList = m.I((Collection)paramList);
        D1.a.d(paramList);
        boolean bool = c(paramString);
        paramString = paramList.iterator();
        if (!paramString.hasNext()) {
          break;
        }
        paramList = (y1.e)paramString.next();
        if (!paramList.g()) {
          break label109;
        }
        if (!(paramList.h() ^ true)) {
          if ((!paramList.h()) || (!bool)) {
            continue;
          }
        }
      }
      finally
      {
        break label131;
      }
      localJSONArray.put(paramList.e());
      continue;
      label109:
      P localP = P.a;
      P.j0(b, Intrinsics.i("Event with invalid checksum: ", paramList));
    }
    return localJSONArray;
    label131:
    T1.a.b(paramList, this);
    return null;
  }
  
  public final boolean c(String paramString)
  {
    boolean bool1 = T1.a.d(this);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      paramString = v.q(paramString, false);
      if (paramString != null) {
        bool2 = paramString.n();
      }
    }
    finally
    {
      break label37;
    }
    return bool2;
    label37:
    T1.a.b(paramString, this);
    return false;
  }
}

/* Location:
 * Qualified Name:     I1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
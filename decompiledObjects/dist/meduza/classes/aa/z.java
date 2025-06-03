package aa;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n6.a;
import r.b;
import r.h;

public final class z
  extends a
{
  public static final Parcelable.Creator<z> CREATOR = new a0();
  public Bundle a;
  public b b;
  public a c;
  
  public z(Bundle paramBundle)
  {
    a = paramBundle;
  }
  
  public final Map<String, String> D()
  {
    if (b == null)
    {
      Bundle localBundle = a;
      b localb = new b();
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject = localBundle.get(str);
        if ((localObject instanceof String))
        {
          localObject = (String)localObject;
          if ((!str.startsWith("google.")) && (!str.startsWith("gcm.")) && (!str.equals("from")) && (!str.equals("message_type")) && (!str.equals("collapse_key"))) {
            localb.put(str, localObject);
          }
        }
      }
      b = localb;
    }
    return b;
  }
  
  public final String E()
  {
    String str1 = a.getString("google.message_id");
    String str2 = str1;
    if (str1 == null) {
      str2 = a.getString("message_id");
    }
    return str2;
  }
  
  public final a F()
  {
    if ((c == null) && (s.l(a))) {
      c = new a(new s(a));
    }
    return c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = b.z.J(20293, paramParcel);
    b.z.v(paramParcel, 2, a, false);
    b.z.L(paramInt, paramParcel);
  }
  
  public static final class a
  {
    public final String a;
    public final String b;
    public final String[] c;
    public final String d;
    public final String e;
    public final String[] f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Uri n;
    public final String o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    
    public a(s params)
    {
      a = params.j("gcm.n.title");
      b = params.g("gcm.n.title");
      Object[] arrayOfObject = params.f("gcm.n.title");
      Object localObject1 = null;
      int i1 = 0;
      int i2;
      if (arrayOfObject == null)
      {
        localObject2 = null;
      }
      else
      {
        localObject3 = new String[arrayOfObject.length];
        for (i2 = 0;; i2++)
        {
          localObject2 = localObject3;
          if (i2 >= arrayOfObject.length) {
            break;
          }
          localObject3[i2] = String.valueOf(arrayOfObject[i2]);
        }
      }
      c = ((String[])localObject2);
      d = params.j("gcm.n.body");
      e = params.g("gcm.n.body");
      Object localObject3 = params.f("gcm.n.body");
      if (localObject3 == null)
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject1 = new String[localObject3.length];
        for (i2 = i1;; i2++)
        {
          localObject2 = localObject1;
          if (i2 >= localObject3.length) {
            break;
          }
          localObject1[i2] = String.valueOf(localObject3[i2]);
        }
      }
      f = ((String[])localObject2);
      g = params.j("gcm.n.icon");
      localObject1 = params.j("gcm.n.sound2");
      Object localObject2 = localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        localObject2 = params.j("gcm.n.sound");
      }
      i = ((String)localObject2);
      j = params.j("gcm.n.tag");
      k = params.j("gcm.n.color");
      l = params.j("gcm.n.click_action");
      m = params.j("gcm.n.android_channel_id");
      n = params.e();
      h = params.j("gcm.n.image");
      o = params.j("gcm.n.ticker");
      p = params.b("gcm.n.notification_priority");
      q = params.b("gcm.n.visibility");
      r = params.b("gcm.n.notification_count");
      params.a("gcm.n.sticky");
      params.a("gcm.n.local_only");
      params.a("gcm.n.default_sound");
      params.a("gcm.n.default_vibrate_timings");
      params.a("gcm.n.default_light_settings");
      params.h();
      params.d();
      params.k();
    }
  }
}

/* Location:
 * Qualified Name:     aa.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
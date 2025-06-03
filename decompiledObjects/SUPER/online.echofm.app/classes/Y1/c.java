package Y1;

import O1.P;
import O1.e;
import O1.e.a;
import O1.f;
import O1.x;
import O1.x.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.D;
import x1.h;
import x1.o;
import x1.q;
import x1.r;

public final class c
  extends F
{
  @NotNull
  public static final Parcelable.Creator<c> CREATOR = new a();
  public static final b y = new b(null);
  public static boolean z;
  public String t;
  public String u;
  public String v;
  public final String w = "custom_tab";
  public final h x = h.u;
  
  public c(u paramu)
  {
    super(paramu);
    u = P.s(20);
    z = false;
    paramu = f.a;
    v = f.c(z());
  }
  
  public c(Parcel paramParcel)
  {
    super(paramParcel);
    u = paramParcel.readString();
    paramParcel = f.a;
    v = f.c(z());
  }
  
  public static final void B(c paramc, u.e parame, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramc, "this$0");
    Intrinsics.checkNotNullParameter(parame, "$request");
    Intrinsics.checkNotNullParameter(paramBundle, "$values");
    try
    {
      paramc.v(parame, paramc.k(parame, paramBundle), null);
    }
    catch (o paramBundle)
    {
      paramc.v(parame, null, paramBundle);
    }
  }
  
  public final void A(String paramString, u.e parame)
  {
    Object localObject;
    Bundle localBundle;
    String str;
    if ((paramString != null) && ((i.s(paramString, "fbconnect://cct.", false, 2, null)) || (i.s(paramString, super.g(), false, 2, null))))
    {
      paramString = Uri.parse(paramString);
      localObject = P.a;
      localBundle = P.o0(paramString.getQuery());
      localBundle.putAll(P.o0(paramString.getFragment()));
      if (!C(localBundle))
      {
        super.v(parame, null, new o("Invalid state parameter"));
        return;
      }
      paramString = localBundle.getString("error");
      localObject = paramString;
      if (paramString == null) {
        localObject = localBundle.getString("error_type");
      }
      str = localBundle.getString("error_msg");
      paramString = str;
      if (str == null) {
        paramString = localBundle.getString("error_message");
      }
      str = paramString;
      if (paramString == null) {
        str = localBundle.getString("error_description");
      }
      paramString = localBundle.getString("error_code");
      if (paramString == null) {}
    }
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException paramString)
    {
      int i;
      for (;;) {}
    }
    i = -1;
    if ((P.c0((String)localObject)) && (P.c0(str)) && (i == -1))
    {
      if (localBundle.containsKey("access_token"))
      {
        super.v(parame, localBundle, null);
        return;
      }
      x1.B.t().execute(new b(this, parame, localBundle));
    }
    else
    {
      if ((localObject != null) && ((Intrinsics.a(localObject, "access_denied")) || (Intrinsics.a(localObject, "OAuthAccessDeniedException")))) {
        paramString = new q();
      }
      for (;;)
      {
        super.v(parame, null, paramString);
        break;
        if (i == 4201) {
          paramString = new q();
        } else {
          paramString = new D(new r(i, (String)localObject, str), str);
        }
      }
    }
  }
  
  public final boolean C(Bundle paramBundle)
  {
    bool1 = false;
    try
    {
      paramBundle = paramBundle.getString("state");
      if (paramBundle == null) {
        return false;
      }
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramBundle);
      bool2 = Intrinsics.a(localJSONObject.getString("7_challenge"), u);
    }
    catch (JSONException paramBundle)
    {
      for (;;)
      {
        boolean bool2 = bool1;
      }
    }
    return bool2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String f()
  {
    return w;
  }
  
  public String g()
  {
    return v;
  }
  
  public boolean j(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getBooleanExtra(CustomTabMainActivity.x, false))) {
      return super.j(paramInt1, paramInt2, paramIntent);
    }
    if (paramInt1 != 1) {
      return super.j(paramInt1, paramInt2, paramIntent);
    }
    u.e locale = d().o();
    if (locale == null) {
      return false;
    }
    String str = null;
    if (paramInt2 == -1)
    {
      if (paramIntent != null) {
        str = paramIntent.getStringExtra(CustomTabMainActivity.u);
      }
      A(str, locale);
      return true;
    }
    super.v(locale, null, new q());
    return false;
  }
  
  public void l(JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "param");
    paramJSONObject.put("7_challenge", u);
  }
  
  public int o(u.e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    u localu = d();
    if (g().length() == 0) {
      return 0;
    }
    Bundle localBundle = p(q(parame), parame);
    if (z) {
      localBundle.putString("cct_over_app_switch", "1");
    }
    if (x1.B.q)
    {
      d.a locala;
      if (parame.r()) {
        locala = d.a;
      }
      for (localObject = x.c.a("oauth", localBundle);; localObject = e.b.a("oauth", localBundle))
      {
        locala.b((Uri)localObject);
        break;
        locala = d.a;
      }
    }
    Object localObject = localu.i();
    if (localObject == null) {
      return 0;
    }
    localObject = new Intent((Context)localObject, CustomTabMainActivity.class);
    ((Intent)localObject).putExtra(CustomTabMainActivity.r, "oauth");
    ((Intent)localObject).putExtra(CustomTabMainActivity.s, localBundle);
    ((Intent)localObject).putExtra(CustomTabMainActivity.t, y());
    ((Intent)localObject).putExtra(CustomTabMainActivity.v, parame.k().toString());
    parame = localu.k();
    if (parame != null) {
      parame.startActivityForResult((Intent)localObject, 1);
    }
    return 1;
  }
  
  public String r()
  {
    return "chrome_custom_tab";
  }
  
  public h t()
  {
    return x;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(u);
  }
  
  public final String y()
  {
    String str = t;
    if (str != null) {
      return str;
    }
    str = f.a();
    t = str;
    return str;
  }
  
  public final String z()
  {
    return super.g();
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public c a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new c(paramParcel);
    }
    
    public c[] b(int paramInt)
    {
      return new c[paramInt];
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     Y1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package Y1;

import M1.b;
import M1.c;
import O1.P;
import O1.Q;
import O1.v;
import W5.C;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F.c;
import x1.K;
import x1.L;
import x1.o;

@Metadata
public class m
  extends androidx.fragment.app.d
{
  public static final a P0 = new a(null);
  public static final String Q0 = "device/login";
  public static final String R0 = "device/login_status";
  public static final int S0 = 1349174;
  public View E0;
  public TextView F0;
  public TextView G0;
  public n H0;
  public final AtomicBoolean I0 = new AtomicBoolean();
  public volatile x1.I J0;
  public volatile ScheduledFuture K0;
  public volatile c L0;
  public boolean M0;
  public boolean N0;
  public u.e O0;
  
  public static final void b2(m paramm, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramm, "this$0");
    Intrinsics.checkNotNullParameter(paramK, "response");
    if (I0.get()) {
      return;
    }
    Object localObject = paramK.b();
    if (localObject != null)
    {
      int i = ((x1.r)localObject).g();
      if ((i == S0) || (i == 1349172))
      {
        paramm.s2();
      }
      else
      {
        if (i == 1349152)
        {
          paramK = L0;
          if (paramK != null)
          {
            localObject = N1.a.a;
            N1.a.a(paramK.d());
          }
          paramK = O0;
          if (paramK != null)
          {
            paramm.v2(paramK);
            break label160;
          }
        }
        while (i == 1349173)
        {
          paramm.k2();
          break;
        }
        paramK = paramK.b();
        if (paramK == null) {
          paramK = null;
        } else {
          paramK = paramK.e();
        }
        localObject = paramK;
        if (paramK == null) {
          localObject = new o();
        }
        paramm.l2((o)localObject);
      }
      label160:
      return;
    }
    try
    {
      localObject = paramK.c();
      paramK = (K)localObject;
      if (localObject == null)
      {
        paramK = new org/json/JSONObject;
        paramK.<init>();
      }
    }
    catch (JSONException paramK)
    {
      break label223;
    }
    localObject = paramK.getString("access_token");
    Intrinsics.checkNotNullExpressionValue(localObject, "resultObject.getString(\"access_token\")");
    paramm.m2((String)localObject, paramK.getLong("expires_in"), Long.valueOf(paramK.optLong("data_access_expiration_time")));
    return;
    label223:
    paramm.l2(new o(paramK));
  }
  
  public static final void i2(m paramm, View paramView)
  {
    Intrinsics.checkNotNullParameter(paramm, "this$0");
    paramm.k2();
  }
  
  public static final void n2(m paramm, String paramString, Date paramDate1, Date paramDate2, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramm, "this$0");
    Intrinsics.checkNotNullParameter(paramString, "$accessToken");
    Intrinsics.checkNotNullParameter(paramK, "response");
    if (I0.get()) {
      return;
    }
    Object localObject1 = paramK.b();
    if (localObject1 != null)
    {
      paramDate1 = ((x1.r)localObject1).e();
      paramString = paramDate1;
      if (paramDate1 == null) {
        paramString = new o();
      }
      paramm.l2(paramString);
      return;
    }
    try
    {
      localObject1 = paramK.c();
      paramK = (K)localObject1;
      if (localObject1 == null)
      {
        paramK = new org/json/JSONObject;
        paramK.<init>();
      }
    }
    catch (JSONException paramString)
    {
      break label271;
    }
    String str1 = paramK.getString("id");
    Intrinsics.checkNotNullExpressionValue(str1, "jsonObject.getString(\"id\")");
    localObject1 = a.a(P0, paramK);
    String str2 = paramK.getString("name");
    Intrinsics.checkNotNullExpressionValue(str2, "jsonObject.getString(\"name\")");
    Object localObject2 = L0;
    if (localObject2 != null)
    {
      paramK = N1.a.a;
      N1.a.a(((c)localObject2).d());
    }
    paramK = v.a;
    localObject2 = v.f(B.m());
    paramK = null;
    if (localObject2 != null)
    {
      localObject2 = ((O1.r)localObject2).l();
      if (localObject2 != null) {
        paramK = Boolean.valueOf(((AbstractCollection)localObject2).contains(O1.I.t));
      }
    }
    if ((Intrinsics.a(paramK, Boolean.TRUE)) && (!N0))
    {
      N0 = true;
      paramm.p2(str1, (b)localObject1, paramString, str2, paramDate1, paramDate2);
      return;
    }
    paramm.d2(str1, (b)localObject1, paramString, paramDate1, paramDate2);
    return;
    label271:
    paramm.l2(new o(paramString));
  }
  
  public static final void q2(m paramm, String paramString1, b paramb, String paramString2, Date paramDate1, Date paramDate2, DialogInterface paramDialogInterface, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramm, "this$0");
    Intrinsics.checkNotNullParameter(paramString1, "$userId");
    Intrinsics.checkNotNullParameter(paramb, "$permissions");
    Intrinsics.checkNotNullParameter(paramString2, "$accessToken");
    paramm.d2(paramString1, paramb, paramString2, paramDate1, paramDate2);
  }
  
  public static final void r2(m paramm, DialogInterface paramDialogInterface, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramm, "this$0");
    paramDialogInterface = paramm.h2(false);
    Dialog localDialog = paramm.L1();
    if (localDialog != null) {
      localDialog.setContentView(paramDialogInterface);
    }
    paramDialogInterface = O0;
    if (paramDialogInterface != null) {
      paramm.v2(paramDialogInterface);
    }
  }
  
  public static final void t2(m paramm)
  {
    Intrinsics.checkNotNullParameter(paramm, "this$0");
    paramm.o2();
  }
  
  public static final void w2(m paramm, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramm, "this$0");
    Intrinsics.checkNotNullParameter(paramK, "response");
    if (M0) {
      return;
    }
    if (paramK.b() != null)
    {
      paramK = paramK.b();
      if (paramK == null) {
        paramK = null;
      } else {
        paramK = paramK.e();
      }
      localObject = paramK;
      if (paramK == null) {
        localObject = new o();
      }
      paramm.l2((o)localObject);
      return;
    }
    Object localObject = paramK.c();
    paramK = (K)localObject;
    if (localObject == null) {
      paramK = new JSONObject();
    }
    localObject = new c();
    try
    {
      ((c)localObject).h(paramK.getString("user_code"));
      ((c)localObject).g(paramK.getString("code"));
      ((c)localObject).e(paramK.getLong("interval"));
      paramm.u2((c)localObject);
      return;
    }
    catch (JSONException paramK)
    {
      paramm.l2(new o(paramK));
    }
  }
  
  public void I0(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "outState");
    super.I0(paramBundle);
    if (L0 != null) {
      paramBundle.putParcelable("request_state", L0);
    }
  }
  
  public Dialog N1(Bundle paramBundle)
  {
    paramBundle = new d(this, o1(), M1.e.b);
    boolean bool;
    if ((N1.a.e()) && (!N0)) {
      bool = true;
    } else {
      bool = false;
    }
    paramBundle.setContentView(h2(bool));
    return paramBundle;
  }
  
  public Map c2()
  {
    return null;
  }
  
  public final void d2(String paramString1, b paramb, String paramString2, Date paramDate1, Date paramDate2)
  {
    n localn = H0;
    if (localn != null) {
      localn.v(paramString2, B.m(), paramString1, (Collection)paramb.c(), (Collection)paramb.a(), (Collection)paramb.b(), x1.h.x, paramDate1, null, paramDate2);
    }
    paramString1 = L1();
    if (paramString1 != null) {
      paramString1.dismiss();
    }
  }
  
  public String e2()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Q.b());
    localStringBuilder.append('|');
    localStringBuilder.append(Q.c());
    return localStringBuilder.toString();
  }
  
  public int f2(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = c.d;
    } else {
      i = c.b;
    }
    return i;
  }
  
  public final x1.F g2()
  {
    Bundle localBundle = new Bundle();
    Object localObject = L0;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((c)localObject).c();
    }
    localBundle.putString("code", (String)localObject);
    localBundle.putString("access_token", e2());
    return x1.F.n.B(null, R0, localBundle, new h(this));
  }
  
  public View h2(boolean paramBoolean)
  {
    Object localObject1 = o1().getLayoutInflater();
    Intrinsics.checkNotNullExpressionValue(localObject1, "requireActivity().layoutInflater");
    localObject1 = ((LayoutInflater)localObject1).inflate(f2(paramBoolean), null);
    Intrinsics.checkNotNullExpressionValue(localObject1, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
    Object localObject2 = ((View)localObject1).findViewById(b.f);
    Intrinsics.checkNotNullExpressionValue(localObject2, "view.findViewById(R.id.progress_bar)");
    E0 = ((View)localObject2);
    localObject2 = ((View)localObject1).findViewById(b.e);
    if (localObject2 != null)
    {
      F0 = ((TextView)localObject2);
      localObject2 = ((View)localObject1).findViewById(b.a);
      if (localObject2 != null)
      {
        ((Button)localObject2).setOnClickListener(new f(this));
        localObject2 = ((View)localObject1).findViewById(b.b);
        if (localObject2 != null)
        {
          localObject2 = (TextView)localObject2;
          G0 = ((TextView)localObject2);
          ((TextView)localObject2).setText(Html.fromHtml(P(M1.d.a)));
          return (View)localObject1;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
      }
      throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
    }
    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
  }
  
  public boolean j2()
  {
    return true;
  }
  
  public void k2()
  {
    if (!I0.compareAndSet(false, true)) {
      return;
    }
    c localc = L0;
    if (localc != null)
    {
      localObject = N1.a.a;
      N1.a.a(localc.d());
    }
    Object localObject = H0;
    if (localObject != null) {
      ((n)localObject).t();
    }
    localObject = L1();
    if (localObject != null) {
      ((Dialog)localObject).dismiss();
    }
  }
  
  public void l2(o paramo)
  {
    Intrinsics.checkNotNullParameter(paramo, "ex");
    if (!I0.compareAndSet(false, true)) {
      return;
    }
    Object localObject = L0;
    if (localObject != null)
    {
      N1.a locala = N1.a.a;
      N1.a.a(((c)localObject).d());
    }
    localObject = H0;
    if (localObject != null) {
      ((n)localObject).u(paramo);
    }
    paramo = L1();
    if (paramo != null) {
      paramo.dismiss();
    }
  }
  
  public final void m2(String paramString, long paramLong, Long paramLong1)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "id,permissions,name");
    Object localObject1 = null;
    Date localDate;
    if (paramLong != 0L) {
      localDate = new Date(new Date().getTime() + paramLong * 1000L);
    } else {
      localDate = null;
    }
    Object localObject2;
    if (paramLong1 != null)
    {
      localObject2 = localObject1;
      if (paramLong1.longValue() == 0L) {}
    }
    else
    {
      localObject2 = localObject1;
      if (paramLong1 != null) {
        localObject2 = new Date(paramLong1.longValue() * 1000L);
      }
    }
    paramLong1 = new x1.a(paramString, B.m(), "0", null, null, null, null, localDate, null, (Date)localObject2, null, 1024, null);
    paramString = x1.F.n.x(paramLong1, "me", new j(this, paramString, localDate, (Date)localObject2));
    paramString.F(L.o);
    paramString.G(localBundle);
    paramString.l();
  }
  
  public final void o2()
  {
    c localc = L0;
    if (localc != null) {
      localc.f(new Date().getTime());
    }
    J0 = g2().l();
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    Intrinsics.checkNotNullParameter(paramDialogInterface, "dialog");
    super.onDismiss(paramDialogInterface);
    if (!M0) {
      k2();
    }
  }
  
  public final void p2(String paramString1, b paramb, String paramString2, String paramString3, Date paramDate1, Date paramDate2)
  {
    String str1 = I().getString(M1.d.g);
    Intrinsics.checkNotNullExpressionValue(str1, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
    String str2 = I().getString(M1.d.f);
    Intrinsics.checkNotNullExpressionValue(str2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
    String str3 = I().getString(M1.d.e);
    Intrinsics.checkNotNullExpressionValue(str3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
    Object localObject = kotlin.jvm.internal.x.a;
    paramString3 = String.format(str2, Arrays.copyOf(new Object[] { paramString3 }, 1));
    Intrinsics.checkNotNullExpressionValue(paramString3, "java.lang.String.format(format, *args)");
    localObject = new AlertDialog.Builder(t());
    ((AlertDialog.Builder)localObject).setMessage(str1).setCancelable(true).setNegativeButton(paramString3, new k(this, paramString1, paramb, paramString2, paramDate1, paramDate2)).setPositiveButton(str3, new l(this));
    ((AlertDialog.Builder)localObject).create().show();
  }
  
  public View q0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramLayoutInflater, "inflater");
    paramViewGroup = super.q0(paramLayoutInflater, paramViewGroup, paramBundle);
    Object localObject = (x)((FacebookActivity)o1()).v();
    paramLayoutInflater = null;
    if (localObject != null)
    {
      localObject = ((x)localObject).O1();
      if (localObject != null) {
        paramLayoutInflater = ((u)localObject).j();
      }
    }
    H0 = ((n)paramLayoutInflater);
    if (paramBundle != null)
    {
      paramLayoutInflater = (c)paramBundle.getParcelable("request_state");
      if (paramLayoutInflater != null) {
        u2(paramLayoutInflater);
      }
    }
    return paramViewGroup;
  }
  
  public final void s2()
  {
    Object localObject = L0;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Long.valueOf(((c)localObject).b());
    }
    if (localObject != null) {
      K0 = n.s.a().schedule(new g(this), ((Long)localObject).longValue(), TimeUnit.SECONDS);
    }
  }
  
  public void t0()
  {
    M0 = true;
    I0.set(true);
    super.t0();
    Object localObject = J0;
    if (localObject != null) {
      ((AsyncTask)localObject).cancel(true);
    }
    localObject = K0;
    if (localObject != null) {
      ((Future)localObject).cancel(true);
    }
  }
  
  public final void u2(c paramc)
  {
    L0 = paramc;
    Object localObject = F0;
    if (localObject != null)
    {
      ((TextView)localObject).setText(paramc.d());
      localObject = N1.a.a;
      localObject = N1.a.c(paramc.a());
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(I(), (Bitmap)localObject);
      localObject = G0;
      if (localObject != null)
      {
        ((TextView)localObject).setCompoundDrawablesWithIntrinsicBounds(null, localBitmapDrawable, null, null);
        localObject = F0;
        if (localObject != null)
        {
          ((View)localObject).setVisibility(0);
          localObject = E0;
          if (localObject != null)
          {
            ((View)localObject).setVisibility(8);
            if ((!N0) && (N1.a.f(paramc.d()))) {
              new y1.F(t()).f("fb_smart_login_service");
            }
            if (paramc.i()) {
              s2();
            } else {
              o2();
            }
            return;
          }
          Intrinsics.n("progressBar");
          throw null;
        }
        Intrinsics.n("confirmationCode");
        throw null;
      }
      Intrinsics.n("instructions");
      throw null;
    }
    Intrinsics.n("confirmationCode");
    throw null;
  }
  
  public void v2(u.e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    O0 = parame;
    Bundle localBundle = new Bundle();
    localBundle.putString("scope", TextUtils.join(",", parame.n()));
    P localP = P.a;
    P.q0(localBundle, "redirect_uri", parame.i());
    P.q0(localBundle, "target_user_id", parame.h());
    localBundle.putString("access_token", e2());
    parame = N1.a.a;
    parame = c2();
    if (parame == null) {
      parame = null;
    } else {
      parame = C.o(parame);
    }
    localBundle.putString("device_info", N1.a.d(parame));
    x1.F.n.B(null, Q0, localBundle, new i(this)).l();
  }
  
  public static final class a
  {
    public final m.b b(JSONObject paramJSONObject)
    {
      paramJSONObject = paramJSONObject.getJSONObject("permissions").getJSONArray("data");
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = new ArrayList();
      int i = paramJSONObject.length();
      if (i > 0)
      {
        int k;
        for (int j = 0;; j = k)
        {
          k = j + 1;
          Object localObject = paramJSONObject.optJSONObject(j);
          String str = ((JSONObject)localObject).optString("permission");
          Intrinsics.checkNotNullExpressionValue(str, "permission");
          if ((str.length() != 0) && (!Intrinsics.a(str, "installed")))
          {
            localObject = ((JSONObject)localObject).optString("status");
            if (localObject != null)
            {
              j = ((String)localObject).hashCode();
              if (j != -1309235419)
              {
                if (j != 280295099)
                {
                  if ((j == 568196142) && (((String)localObject).equals("declined"))) {
                    localArrayList2.add(str);
                  }
                }
                else if (((String)localObject).equals("granted")) {
                  localArrayList1.add(str);
                }
              }
              else if (((String)localObject).equals("expired")) {
                localArrayList3.add(str);
              }
            }
          }
          if (k >= i) {
            break;
          }
        }
      }
      return new m.b(localArrayList1, localArrayList2, localArrayList3);
    }
  }
  
  public static final class b
  {
    public List a;
    public List b;
    public List c;
    
    public b(List paramList1, List paramList2, List paramList3)
    {
      a = paramList1;
      b = paramList2;
      c = paramList3;
    }
    
    public final List a()
    {
      return b;
    }
    
    public final List b()
    {
      return c;
    }
    
    public final List c()
    {
      return a;
    }
  }
  
  public static final class c
    implements Parcelable
  {
    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();
    public static final b t = new b(null);
    public String o;
    public String p;
    public String q;
    public long r;
    public long s;
    
    public c() {}
    
    public c(Parcel paramParcel)
    {
      o = paramParcel.readString();
      p = paramParcel.readString();
      q = paramParcel.readString();
      r = paramParcel.readLong();
      s = paramParcel.readLong();
    }
    
    public final String a()
    {
      return o;
    }
    
    public final long b()
    {
      return r;
    }
    
    public final String c()
    {
      return q;
    }
    
    public final String d()
    {
      return p;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public final void e(long paramLong)
    {
      r = paramLong;
    }
    
    public final void f(long paramLong)
    {
      s = paramLong;
    }
    
    public final void g(String paramString)
    {
      q = paramString;
    }
    
    public final void h(String paramString)
    {
      p = paramString;
      kotlin.jvm.internal.x localx = kotlin.jvm.internal.x.a;
      paramString = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[] { paramString }, 1));
      Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(locale, format, *args)");
      o = paramString;
    }
    
    public final boolean i()
    {
      long l = s;
      boolean bool = false;
      if (l == 0L) {
        return false;
      }
      if (new Date().getTime() - s - r * 1000L < 0L) {
        bool = true;
      }
      return bool;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "dest");
      paramParcel.writeString(o);
      paramParcel.writeString(p);
      paramParcel.writeString(q);
      paramParcel.writeLong(r);
      paramParcel.writeLong(s);
    }
    
    public static final class a
      implements Parcelable.Creator
    {
      public m.c a(Parcel paramParcel)
      {
        Intrinsics.checkNotNullParameter(paramParcel, "parcel");
        return new m.c(paramParcel);
      }
      
      public m.c[] b(int paramInt)
      {
        return new m.c[paramInt];
      }
    }
    
    public static final class b {}
  }
  
  public static final class d
    extends Dialog
  {
    public d(m paramm, androidx.fragment.app.e parame, int paramInt)
    {
      super(paramInt);
    }
    
    public void onBackPressed()
    {
      if (o.j2()) {
        super.onBackPressed();
      }
    }
  }
}

/* Location:
 * Qualified Name:     Y1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
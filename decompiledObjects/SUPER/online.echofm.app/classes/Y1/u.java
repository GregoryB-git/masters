package Y1;

import O1.P;
import O1.Q;
import W5.C;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import x1.a.c;
import x1.i;
import x1.o;

public class u
  implements Parcelable
{
  public static final c A = new c(null);
  @NotNull
  public static final Parcelable.Creator<u> CREATOR = new b();
  public A[] o;
  public int p = -1;
  public Fragment q;
  public d r;
  public a s;
  public boolean t;
  public e u;
  public Map v;
  public Map w;
  public y x;
  public int y;
  public int z;
  
  public u(Parcel paramParcel)
  {
    Object localObject1 = paramParcel.readParcelableArray(A.class.getClassLoader());
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new Parcelable[0];
    }
    ArrayList localArrayList = new ArrayList();
    int i = localObject2.length;
    for (int j = 0;; j++)
    {
      localObject1 = null;
      Object localObject3 = null;
      if (j >= i) {
        break;
      }
      Object localObject4 = localObject2[j];
      localObject1 = localObject3;
      if ((localObject4 instanceof A)) {
        localObject1 = (A)localObject4;
      }
      if (localObject1 != null) {
        ((A)localObject1).m(this);
      }
      if (localObject1 != null) {
        localArrayList.add(localObject1);
      }
    }
    localObject2 = localArrayList.toArray(new A[0]);
    if (localObject2 != null)
    {
      o = ((A[])localObject2);
      p = paramParcel.readInt();
      u = ((e)paramParcel.readParcelable(e.class.getClassLoader()));
      localObject2 = P.r0(paramParcel);
      if (localObject2 == null) {
        localObject2 = null;
      } else {
        localObject2 = C.o((Map)localObject2);
      }
      v = ((Map)localObject2);
      paramParcel = P.r0(paramParcel);
      if (paramParcel == null) {
        paramParcel = (Parcel)localObject1;
      } else {
        paramParcel = C.o(paramParcel);
      }
      w = paramParcel;
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
  }
  
  public u(Fragment paramFragment)
  {
    x(paramFragment);
  }
  
  public final boolean A()
  {
    A localA = j();
    boolean bool = false;
    if (localA == null) {
      return false;
    }
    if ((localA.i()) && (!d()))
    {
      a("no_internet_permission", "1", false);
      return false;
    }
    Object localObject = u;
    if (localObject == null) {
      return false;
    }
    int i = localA.o((e)localObject);
    y = 0;
    y localy = n();
    String str1 = ((e)localObject).b();
    String str2;
    if (i > 0)
    {
      str2 = localA.f();
      if (((e)localObject).q()) {
        localObject = "foa_mobile_login_method_start";
      } else {
        localObject = "fb_mobile_login_method_start";
      }
      localy.d(str1, str2, (String)localObject);
      z = i;
    }
    else
    {
      str2 = localA.f();
      if (((e)localObject).q()) {
        localObject = "foa_mobile_login_method_not_tried";
      } else {
        localObject = "fb_mobile_login_method_not_tried";
      }
      localy.c(str1, str2, (String)localObject);
      a("not_tried", localA.f(), true);
    }
    if (i > 0) {
      bool = true;
    }
    return bool;
  }
  
  public final void B()
  {
    Object localObject = j();
    if (localObject != null) {
      q(((A)localObject).f(), "skipped", null, null, ((A)localObject).e());
    }
    localObject = o;
    while (localObject != null)
    {
      int i = p;
      if (i < localObject.length - 1)
      {
        p = (i + 1);
        if (A()) {
          return;
        }
      }
    }
    if (u != null) {
      h();
    }
  }
  
  public final void C(f paramf)
  {
    Intrinsics.checkNotNullParameter(paramf, "pendingResult");
    if (p != null)
    {
      x1.a locala1 = x1.a.z.e();
      x1.a locala2 = p;
      if (locala1 != null) {
        try
        {
          if (Intrinsics.a(locala1.m(), locala2.m())) {
            paramf = f.w.b(u, p, q);
          }
        }
        catch (Exception paramf)
        {
          break label96;
        }
      }
      paramf = u.f.c.d(f.w, u, "User logged in as different Facebook user.", null, null, 8, null);
      f(paramf);
      break label121;
      label96:
      f(u.f.c.d(f.w, u, "Caught exception", paramf.getMessage(), null, 8, null));
      label121:
      return;
    }
    throw new o("Can't validate without a token");
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject1 = v;
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new HashMap();
    }
    if (v == null) {
      v = ((Map)localObject2);
    }
    localObject1 = paramString2;
    if (((Map)localObject2).containsKey(paramString1))
    {
      localObject1 = paramString2;
      if (paramBoolean)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(((Map)localObject2).get(paramString1));
        ((StringBuilder)localObject1).append(',');
        ((StringBuilder)localObject1).append(paramString2);
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
    ((Map)localObject2).put(paramString1, localObject1);
  }
  
  public final void b(e parame)
  {
    if (parame == null) {
      return;
    }
    if (u == null)
    {
      if ((x1.a.z.g()) && (!d())) {
        return;
      }
      u = parame;
      o = l(parame);
      B();
      return;
    }
    throw new o("Attempted to authorize while a request is pending.");
  }
  
  public final void c()
  {
    A localA = j();
    if (localA != null) {
      localA.b();
    }
  }
  
  public final boolean d()
  {
    if (t) {
      return true;
    }
    if (e("android.permission.INTERNET") != 0)
    {
      androidx.fragment.app.e locale = i();
      String str1 = null;
      String str2;
      if (locale == null) {
        str2 = null;
      } else {
        str2 = locale.getString(M1.d.c);
      }
      if (locale != null) {
        for (;;)
        {
          str1 = locale.getString(M1.d.b);
        }
      }
      f(u.f.c.d(f.w, u, str2, str1, null, 8, null));
      return false;
    }
    t = true;
    return true;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final int e(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "permission");
    androidx.fragment.app.e locale = i();
    int i;
    if (locale == null) {
      i = -1;
    } else {
      i = locale.checkCallingOrSelfPermission(paramString);
    }
    return i;
  }
  
  public final void f(f paramf)
  {
    Intrinsics.checkNotNullParameter(paramf, "outcome");
    Object localObject = j();
    if (localObject != null) {
      p(((A)localObject).f(), paramf, ((A)localObject).e());
    }
    localObject = v;
    if (localObject != null) {
      u = ((Map)localObject);
    }
    localObject = w;
    if (localObject != null) {
      v = ((Map)localObject);
    }
    o = null;
    p = -1;
    u = null;
    v = null;
    y = 0;
    z = 0;
    u(paramf);
  }
  
  public final void g(f paramf)
  {
    Intrinsics.checkNotNullParameter(paramf, "outcome");
    if ((p != null) && (x1.a.z.g())) {
      C(paramf);
    } else {
      f(paramf);
    }
  }
  
  public final void h()
  {
    f(u.f.c.d(f.w, u, "Login attempt failed.", null, null, 8, null));
  }
  
  public final androidx.fragment.app.e i()
  {
    Object localObject = q;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Fragment)localObject).n();
    }
    return (androidx.fragment.app.e)localObject;
  }
  
  public final A j()
  {
    int i = p;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (i >= 0)
    {
      localObject2 = o;
      if (localObject2 == null) {
        localObject2 = localObject1;
      } else {
        localObject2 = localObject2[i];
      }
    }
    return (A)localObject2;
  }
  
  public final Fragment k()
  {
    return q;
  }
  
  public A[] l(e parame)
  {
    Intrinsics.checkNotNullParameter(parame, "request");
    ArrayList localArrayList = new ArrayList();
    t localt = parame.j();
    if (parame.r())
    {
      if ((x1.B.s) || (!localt.l())) {}
    }
    else {
      for (Object localObject = new r(this);; localObject = new s(this))
      {
        localArrayList.add(localObject);
        break;
        if (localt.j()) {
          localArrayList.add(new q(this));
        }
        if ((x1.B.s) || (!localt.m())) {
          break;
        }
      }
    }
    if (localt.e()) {
      localArrayList.add(new c(this));
    }
    if (localt.n()) {
      localArrayList.add(new G(this));
    }
    if ((!parame.r()) && (localt.h())) {
      localArrayList.add(new n(this));
    }
    parame = localArrayList.toArray(new A[0]);
    if (parame != null) {
      return (A[])parame;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
  }
  
  public final boolean m()
  {
    boolean bool;
    if ((u != null) && (p >= 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final y n()
  {
    Object localObject1 = x;
    Object localObject2;
    if (localObject1 != null)
    {
      String str = ((y)localObject1).a();
      localObject2 = u;
      if (localObject2 == null) {
        localObject2 = null;
      } else {
        localObject2 = ((e)localObject2).a();
      }
      if (Intrinsics.a(str, localObject2)) {}
    }
    else
    {
      localObject1 = i();
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = x1.B.l();
      }
      localObject1 = u;
      if (localObject1 == null) {
        localObject1 = x1.B.m();
      } else {
        localObject1 = ((e)localObject1).a();
      }
      localObject1 = new y((Context)localObject2, (String)localObject1);
      x = ((y)localObject1);
    }
    return (y)localObject1;
  }
  
  public final e o()
  {
    return u;
  }
  
  public final void p(String paramString, f paramf, Map paramMap)
  {
    q(paramString, o.e(), r, s, paramMap);
  }
  
  public final void q(String paramString1, String paramString2, String paramString3, String paramString4, Map paramMap)
  {
    e locale = u;
    String str1 = "fb_mobile_login_method_complete";
    if (locale == null)
    {
      n().e("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", paramString1);
    }
    else
    {
      y localy = n();
      String str2 = locale.b();
      if (locale.q()) {
        str1 = "foa_mobile_login_method_complete";
      }
      localy.b(str2, paramString1, paramString2, paramString3, paramString4, paramMap, str1);
    }
  }
  
  public final void r()
  {
    a locala = s;
    if (locala != null) {
      locala.a();
    }
  }
  
  public final void t()
  {
    a locala = s;
    if (locala != null) {
      locala.b();
    }
  }
  
  public final void u(f paramf)
  {
    d locald = r;
    if (locald != null) {
      locald.a(paramf);
    }
  }
  
  public final boolean v(int paramInt1, int paramInt2, Intent paramIntent)
  {
    y += 1;
    if (u != null)
    {
      if ((paramIntent != null) && (paramIntent.getBooleanExtra(CustomTabMainActivity.x, false)))
      {
        B();
        return false;
      }
      A localA = j();
      if ((localA != null) && ((!localA.n()) || (paramIntent != null) || (y >= z))) {
        return localA.j(paramInt1, paramInt2, paramIntent);
      }
    }
    return false;
  }
  
  public final void w(a parama)
  {
    s = parama;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeParcelableArray((Parcelable[])o, paramInt);
    paramParcel.writeInt(p);
    paramParcel.writeParcelable(u, paramInt);
    P localP = P.a;
    P.G0(paramParcel, v);
    P.G0(paramParcel, w);
  }
  
  public final void x(Fragment paramFragment)
  {
    if (q == null)
    {
      q = paramFragment;
      return;
    }
    throw new o("Can't set fragment once it is already set.");
  }
  
  public final void y(d paramd)
  {
    r = paramd;
  }
  
  public final void z(e parame)
  {
    if (!m()) {
      b(parame);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public u a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new u(paramParcel);
    }
    
    public u[] b(int paramInt)
    {
      return new u[paramInt];
    }
  }
  
  public static final class c
  {
    public final String a()
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("init", System.currentTimeMillis());
        String str = localJSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(str, "e2e.toString()");
        return str;
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
    
    public final int b()
    {
      return O1.d.p.e();
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(u.f paramf);
  }
  
  public static final class e
    implements Parcelable
  {
    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new a();
    public static final b G = new b(null);
    public boolean A;
    public boolean B;
    public final String C;
    public final String D;
    public final String E;
    public final a F;
    public final t o;
    public Set p;
    public final e q;
    public final String r;
    public String s;
    public boolean t;
    public String u;
    public String v;
    public String w;
    public String x;
    public boolean y;
    public final B z;
    
    public e(Parcel paramParcel)
    {
      Object localObject = Q.a;
      o = t.valueOf(Q.k(paramParcel.readString(), "loginBehavior"));
      localObject = new ArrayList();
      paramParcel.readStringList((List)localObject);
      p = new HashSet((Collection)localObject);
      localObject = paramParcel.readString();
      if (localObject != null) {
        localObject = e.valueOf((String)localObject);
      } else {
        localObject = e.p;
      }
      q = ((e)localObject);
      r = Q.k(paramParcel.readString(), "applicationId");
      s = Q.k(paramParcel.readString(), "authId");
      int i = paramParcel.readByte();
      boolean bool1 = true;
      boolean bool2;
      if (i != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      t = bool2;
      u = paramParcel.readString();
      v = Q.k(paramParcel.readString(), "authType");
      w = paramParcel.readString();
      x = paramParcel.readString();
      if (paramParcel.readByte() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      y = bool2;
      localObject = paramParcel.readString();
      if (localObject != null) {
        localObject = B.valueOf((String)localObject);
      } else {
        localObject = B.q;
      }
      z = ((B)localObject);
      if (paramParcel.readByte() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      A = bool2;
      if (paramParcel.readByte() != 0) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      B = bool2;
      C = Q.k(paramParcel.readString(), "nonce");
      D = paramParcel.readString();
      E = paramParcel.readString();
      paramParcel = paramParcel.readString();
      if (paramParcel == null) {
        paramParcel = null;
      } else {
        paramParcel = a.valueOf(paramParcel);
      }
      F = paramParcel;
    }
    
    public final String a()
    {
      return r;
    }
    
    public final String b()
    {
      return s;
    }
    
    public final String c()
    {
      return v;
    }
    
    public final String d()
    {
      return E;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public final a e()
    {
      return F;
    }
    
    public final String f()
    {
      return D;
    }
    
    public final e g()
    {
      return q;
    }
    
    public final String h()
    {
      return w;
    }
    
    public final String i()
    {
      return u;
    }
    
    public final t j()
    {
      return o;
    }
    
    public final B k()
    {
      return z;
    }
    
    public final String l()
    {
      return x;
    }
    
    public final String m()
    {
      return C;
    }
    
    public final Set n()
    {
      return p;
    }
    
    public final boolean o()
    {
      return y;
    }
    
    public final boolean p()
    {
      Iterator localIterator = p.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (z.a.c(str)) {
          return true;
        }
      }
      return false;
    }
    
    public final boolean q()
    {
      return A;
    }
    
    public final boolean r()
    {
      boolean bool;
      if (z == B.r) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean t()
    {
      return t;
    }
    
    public final void u(Set paramSet)
    {
      Intrinsics.checkNotNullParameter(paramSet, "<set-?>");
      p = paramSet;
    }
    
    public final boolean v()
    {
      return B;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "dest");
      paramParcel.writeString(o.name());
      paramParcel.writeStringList(new ArrayList(p));
      paramParcel.writeString(q.name());
      paramParcel.writeString(r);
      paramParcel.writeString(s);
      paramParcel.writeByte((byte)t);
      paramParcel.writeString(u);
      paramParcel.writeString(v);
      paramParcel.writeString(w);
      paramParcel.writeString(x);
      paramParcel.writeByte((byte)y);
      paramParcel.writeString(z.name());
      paramParcel.writeByte((byte)A);
      paramParcel.writeByte((byte)B);
      paramParcel.writeString(C);
      paramParcel.writeString(D);
      paramParcel.writeString(E);
      Object localObject = F;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((Enum)localObject).name();
      }
      paramParcel.writeString((String)localObject);
    }
    
    public static final class a
      implements Parcelable.Creator
    {
      public u.e a(Parcel paramParcel)
      {
        Intrinsics.checkNotNullParameter(paramParcel, "source");
        return new u.e(paramParcel, null);
      }
      
      public u.e[] b(int paramInt)
      {
        return new u.e[paramInt];
      }
    }
    
    public static final class b {}
  }
  
  public static final class f
    implements Parcelable
  {
    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new b();
    public static final c w = new c(null);
    public final a o;
    public final x1.a p;
    public final i q;
    public final String r;
    public final String s;
    public final u.e t;
    public Map u;
    public Map v;
    
    public f(u.e parame, a parama, x1.a parama1, String paramString1, String paramString2)
    {
      this(parame, parama, parama1, null, paramString1, paramString2);
    }
    
    public f(u.e parame, a parama, x1.a parama1, i parami, String paramString1, String paramString2)
    {
      t = parame;
      p = parama1;
      q = parami;
      r = paramString1;
      o = parama;
      s = paramString2;
    }
    
    public f(Parcel paramParcel)
    {
      String str1 = paramParcel.readString();
      String str2 = str1;
      if (str1 == null) {
        str2 = "error";
      }
      o = a.valueOf(str2);
      p = ((x1.a)paramParcel.readParcelable(x1.a.class.getClassLoader()));
      q = ((i)paramParcel.readParcelable(i.class.getClassLoader()));
      r = paramParcel.readString();
      s = paramParcel.readString();
      t = ((u.e)paramParcel.readParcelable(u.e.class.getClassLoader()));
      u = P.r0(paramParcel);
      v = P.r0(paramParcel);
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "dest");
      paramParcel.writeString(o.name());
      paramParcel.writeParcelable(p, paramInt);
      paramParcel.writeParcelable(q, paramInt);
      paramParcel.writeString(r);
      paramParcel.writeString(s);
      paramParcel.writeParcelable(t, paramInt);
      P localP = P.a;
      P.G0(paramParcel, u);
      P.G0(paramParcel, v);
    }
    
    public static enum a
    {
      public final String o;
      
      public a(String paramString1)
      {
        o = paramString1;
      }
      
      public final String e()
      {
        return o;
      }
    }
    
    public static final class b
      implements Parcelable.Creator
    {
      public u.f a(Parcel paramParcel)
      {
        Intrinsics.checkNotNullParameter(paramParcel, "source");
        return new u.f(paramParcel, null);
      }
      
      public u.f[] b(int paramInt)
      {
        return new u.f[paramInt];
      }
    }
    
    public static final class c
    {
      public final u.f a(u.e parame, String paramString)
      {
        return new u.f(parame, u.f.a.q, null, paramString, null);
      }
      
      public final u.f b(u.e parame, x1.a parama, i parami)
      {
        return new u.f(parame, u.f.a.p, parama, parami, null, null);
      }
      
      public final u.f c(u.e parame, String paramString1, String paramString2, String paramString3)
      {
        ArrayList localArrayList = new ArrayList();
        if (paramString1 != null) {
          localArrayList.add(paramString1);
        }
        if (paramString2 != null) {
          localArrayList.add(paramString2);
        }
        paramString1 = TextUtils.join(": ", localArrayList);
        return new u.f(parame, u.f.a.r, null, paramString1, paramString3);
      }
      
      public final u.f e(u.e parame, x1.a parama)
      {
        Intrinsics.checkNotNullParameter(parama, "token");
        return new u.f(parame, u.f.a.p, parama, null, null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     Y1.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
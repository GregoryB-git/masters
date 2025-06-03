package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import b8.c1;
import b8.g;
import b8.g0;
import b8.h0;
import b8.k0;
import b8.l0;
import b8.w;
import b8.y;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.d;
import d2.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m6.j;
import u7.f;

public final class m
  extends y
{
  public static final Parcelable.Creator<m> CREATOR = new o();
  public final List<h0> a;
  public final n b;
  public final String c;
  public final c1 d;
  public final i e;
  public final List<l0> f;
  
  public m(ArrayList paramArrayList1, n paramn, String paramString, c1 paramc1, i parami, ArrayList paramArrayList2)
  {
    j.i(paramArrayList1);
    a = paramArrayList1;
    j.i(paramn);
    b = paramn;
    j.e(paramString);
    c = paramString;
    d = paramc1;
    e = parami;
    j.i(paramArrayList2);
    f = paramArrayList2;
  }
  
  public final FirebaseAuth D()
  {
    return FirebaseAuth.getInstance(f.f(c));
  }
  
  public final ArrayList E()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((h0)localIterator.next());
    }
    localIterator = f.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add((l0)localIterator.next());
    }
    return localArrayList;
  }
  
  public final n F()
  {
    return b;
  }
  
  public final Task<g> G(w paramw)
  {
    FirebaseAuth localFirebaseAuth = D();
    Object localObject = b;
    i locali = e;
    localFirebaseAuth.getClass();
    j.i(paramw);
    j.i(localObject);
    com.google.android.gms.internal.firebase-auth-api.zzabq localzzabq;
    f localf;
    if ((paramw instanceof g0))
    {
      localzzabq = e;
      localf = a;
      paramw = (g0)paramw;
      localObject = b;
      j.e((String)localObject);
      paramw = localzzabq.zza(localf, locali, paramw, (String)localObject, new FirebaseAuth.d(localFirebaseAuth));
    }
    else
    {
      if (!(paramw instanceof k0)) {
        break label157;
      }
      localzzabq = e;
      localf = a;
      paramw = (k0)paramw;
      localObject = b;
      j.e((String)localObject);
      paramw = localzzabq.zza(localf, locali, paramw, (String)localObject, k, new FirebaseAuth.d(localFirebaseAuth));
    }
    return paramw.continueWithTask(new q(this, 7));
    label157:
    throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.I(paramParcel, 1, a, false);
    z.E(paramParcel, 2, b, paramInt, false);
    z.F(paramParcel, 3, c, false);
    z.E(paramParcel, 4, d, paramInt, false);
    z.E(paramParcel, 5, e, paramInt, false);
    z.I(paramParcel, 6, f, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c8.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package m1;

import android.adservices.measurement.DeletionRequest.Builder;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest.Builder;
import android.adservices.measurement.WebTriggerRegistrationRequest.Builder;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b.a0;
import nc.l;
import p2.m0;
import rb.h;

public final class d$a
  extends d
{
  public final MeasurementManager a;
  
  public d$a(Context paramContext)
  {
    a = paramContext;
  }
  
  public Object a(ub.e<? super Integer> parame)
  {
    Object localObject = new l(1, m0.P(parame));
    ((l)localObject).t();
    a.getMeasurementApiStatus(new b(0), a0.i((l)localObject));
    localObject = ((l)localObject).s();
    m0.H();
    if (localObject == vb.a.a) {
      x6.b.i0(parame);
    }
    return localObject;
  }
  
  public Object b(Uri paramUri, InputEvent paramInputEvent, ub.e<? super h> parame)
  {
    l locall = new l(1, m0.P(parame));
    locall.t();
    a.registerSource(paramUri, paramInputEvent, new b(1), a0.i(locall));
    paramUri = locall.s();
    m0.H();
    paramInputEvent = vb.a.a;
    if (paramUri == paramInputEvent) {
      x6.b.i0(parame);
    }
    m0.H();
    if (paramUri == paramInputEvent) {
      return paramUri;
    }
    return h.a;
  }
  
  public Object c(Uri paramUri, ub.e<? super h> parame)
  {
    Object localObject = new l(1, m0.P(parame));
    ((l)localObject).t();
    a.registerTrigger(paramUri, new m.a(1), a0.i((l)localObject));
    localObject = ((l)localObject).s();
    m0.H();
    paramUri = vb.a.a;
    if (localObject == paramUri) {
      x6.b.i0(parame);
    }
    m0.H();
    if (localObject == paramUri) {
      return localObject;
    }
    return h.a;
  }
  
  public Object d(a parama, ub.e<? super h> parame)
  {
    new l(1, m0.P(parame)).t();
    new DeletionRequest.Builder();
    throw null;
  }
  
  public Object e(e parame, ub.e<? super h> parame1)
  {
    new l(1, m0.P(parame1)).t();
    parame = new android/adservices/measurement/WebSourceRegistrationRequest$Builder;
    throw null;
  }
  
  public Object f(f paramf, ub.e<? super h> parame)
  {
    new l(1, m0.P(parame)).t();
    paramf = new android/adservices/measurement/WebTriggerRegistrationRequest$Builder;
    throw null;
  }
}

/* Location:
 * Qualified Name:     m1.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
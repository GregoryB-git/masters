package io.meduza.meduza;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import dc.p;
import nc.d0;
import nc.d1;
import nc.r0;
import rb.f;
import rb.h;
import vb.a;
import x6.b;

public final class MainActivity$b
  extends ConnectivityManager.NetworkCallback
{
  public MainActivity$b(MainActivity paramMainActivity) {}
  
  public final void onCapabilitiesChanged(Network paramNetwork, NetworkCapabilities paramNetworkCapabilities)
  {
    ec.i.e(paramNetwork, "network");
    ec.i.e(paramNetworkCapabilities, "networkCapabilities");
    super.onCapabilitiesChanged(paramNetwork, paramNetworkCapabilities);
    paramNetwork = a.p;
    int i = 0;
    if ((paramNetwork != null) && (paramNetwork.hasTransport(1) == paramNetworkCapabilities.hasTransport(1))) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      paramNetwork = a.p;
      if ((paramNetwork != null) && (paramNetwork.hasTransport(0) == paramNetworkCapabilities.hasTransport(0))) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        j = 0;
        break label110;
      }
    }
    int j = 1;
    label110:
    paramNetwork = a.p;
    int k;
    if ((paramNetwork != null) && (paramNetwork.hasTransport(1) == true)) {
      k = 1;
    } else {
      k = 0;
    }
    int m = i;
    if (k != 0)
    {
      m = i;
      if (paramNetworkCapabilities.hasTransport(1) == true)
      {
        paramNetwork = a;
        m = i;
        if (!ec.i.a(MainActivity.a(paramNetwork, p), MainActivity.a(a, paramNetworkCapabilities))) {
          m = 1;
        }
      }
    }
    if ((j != 0) || (m != 0))
    {
      paramNetwork = a;
      p = paramNetworkCapabilities;
      b.g0(d1.a, r0.b, new a(paramNetwork, null), 2);
    }
  }
  
  @wb.e(c="io.meduza.meduza.MainActivity$networkHandler$1$onCapabilitiesChanged$1", f="MainActivity.kt", l={}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<d0, ub.e<? super h>, Object>
  {
    public a(MainActivity paramMainActivity, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<h> create(Object paramObject, ub.e<?> parame)
    {
      return new a(a, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a locala = a.a;
      f.b(paramObject);
      paramObject = a;
      ((MainActivity)paramObject).b(d);
      return h.a;
    }
  }
}

/* Location:
 * Qualified Name:     io.meduza.meduza.MainActivity.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
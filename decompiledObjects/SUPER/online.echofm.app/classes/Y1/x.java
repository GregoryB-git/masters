package Y1;

import M1.b;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class x
  extends Fragment
{
  public static final a t0 = new a(null);
  public String o0;
  public u.e p0;
  public u q0;
  public androidx.activity.result.c r0;
  public View s0;
  
  public static final void S1(x paramx, u.f paramf)
  {
    Intrinsics.checkNotNullParameter(paramx, "this$0");
    Intrinsics.checkNotNullParameter(paramf, "outcome");
    paramx.U1(paramf);
  }
  
  public static final void T1(g6.l paraml, a parama)
  {
    Intrinsics.checkNotNullParameter(paraml, "$tmp0");
    paraml.invoke(parama);
  }
  
  public void C0()
  {
    super.C0();
    View localView = R();
    if (localView == null) {
      localView = null;
    } else {
      localView = localView.findViewById(b.d);
    }
    if (localView != null) {
      localView.setVisibility(8);
    }
  }
  
  public void H0()
  {
    super.H0();
    if (o0 == null)
    {
      Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
      e locale = n();
      if (locale != null) {
        locale.finish();
      }
      return;
    }
    O1().z(p0);
  }
  
  public void I0(Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramBundle, "outState");
    super.I0(paramBundle);
    paramBundle.putParcelable("loginClient", O1());
  }
  
  public u L1()
  {
    return new u(this);
  }
  
  public final androidx.activity.result.c M1()
  {
    androidx.activity.result.c localc = r0;
    if (localc != null) {
      return localc;
    }
    Intrinsics.n("launcher");
    throw null;
  }
  
  public int N1()
  {
    return M1.c.c;
  }
  
  public final u O1()
  {
    u localu = q0;
    if (localu != null) {
      return localu;
    }
    Intrinsics.n("loginClient");
    throw null;
  }
  
  public final g6.l P1(final e parame)
  {
    return new b(this, parame);
  }
  
  public final void Q1()
  {
    View localView = s0;
    if (localView != null)
    {
      localView.setVisibility(8);
      V1();
      return;
    }
    Intrinsics.n("progressBar");
    throw null;
  }
  
  public final void R1(Activity paramActivity)
  {
    paramActivity = paramActivity.getCallingActivity();
    if (paramActivity == null) {
      return;
    }
    o0 = paramActivity.getPackageName();
  }
  
  public final void U1(u.f paramf)
  {
    p0 = null;
    int i;
    if (o == u.f.a.q) {
      i = 0;
    } else {
      i = -1;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putParcelable("com.facebook.LoginFragment:Result", paramf);
    paramf = new Intent();
    paramf.putExtras((Bundle)localObject);
    localObject = n();
    if ((W()) && (localObject != null))
    {
      ((Activity)localObject).setResult(i, paramf);
      ((Activity)localObject).finish();
    }
  }
  
  public void V1() {}
  
  public void W1() {}
  
  public final void X1()
  {
    View localView = s0;
    if (localView != null)
    {
      localView.setVisibility(0);
      W1();
      return;
    }
    Intrinsics.n("progressBar");
    throw null;
  }
  
  public void h0(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.h0(paramInt1, paramInt2, paramIntent);
    O1().v(paramInt1, paramInt2, paramIntent);
  }
  
  public void m0(Bundle paramBundle)
  {
    super.m0(paramBundle);
    if (paramBundle == null) {
      paramBundle = null;
    } else {
      paramBundle = (u)paramBundle.getParcelable("loginClient");
    }
    if (paramBundle != null) {
      paramBundle.x(this);
    } else {
      paramBundle = L1();
    }
    q0 = paramBundle;
    O1().y(new v(this));
    paramBundle = n();
    if (paramBundle == null) {
      return;
    }
    R1(paramBundle);
    Object localObject = paramBundle.getIntent();
    if (localObject != null)
    {
      localObject = ((Intent)localObject).getBundleExtra("com.facebook.LoginFragment:Request");
      if (localObject != null) {
        p0 = ((u.e)((Bundle)localObject).getParcelable("request"));
      }
    }
    paramBundle = m1(new d.c(), new w(P1(paramBundle)));
    Intrinsics.checkNotNullExpressionValue(paramBundle, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
    r0 = paramBundle;
  }
  
  public View q0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Intrinsics.checkNotNullParameter(paramLayoutInflater, "inflater");
    paramLayoutInflater = paramLayoutInflater.inflate(N1(), paramViewGroup, false);
    paramViewGroup = paramLayoutInflater.findViewById(b.d);
    Intrinsics.checkNotNullExpressionValue(paramViewGroup, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
    s0 = paramViewGroup;
    O1().w(new c(this));
    return paramLayoutInflater;
  }
  
  public void r0()
  {
    O1().c();
    super.r0();
  }
  
  public static final class a {}
  
  public static final class b
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public b(x paramx, e parame)
    {
      super();
    }
    
    public final void a(a parama)
    {
      Intrinsics.checkNotNullParameter(parama, "result");
      if (parama.b() == -1) {
        o.O1().v(u.A.b(), parama.b(), parama.a());
      } else {
        parame.finish();
      }
    }
  }
  
  public static final class c
    implements u.a
  {
    public c(x paramx) {}
    
    public void a()
    {
      x.K1(a);
    }
    
    public void b()
    {
      x.J1(a);
    }
  }
}

/* Location:
 * Qualified Name:     Y1.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
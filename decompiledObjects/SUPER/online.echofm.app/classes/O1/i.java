package O1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import x1.B;
import x1.o;

@Metadata
public final class i
  extends d
{
  public static final a F0 = new a(null);
  public Dialog E0;
  
  public static final void X1(i parami, Bundle paramBundle, o paramo)
  {
    Intrinsics.checkNotNullParameter(parami, "this$0");
    parami.Z1(paramBundle, paramo);
  }
  
  public static final void Y1(i parami, Bundle paramBundle, o paramo)
  {
    Intrinsics.checkNotNullParameter(parami, "this$0");
    parami.a2(paramBundle);
  }
  
  public void H0()
  {
    super.H0();
    Dialog localDialog = E0;
    if ((localDialog instanceof V)) {
      if (localDialog != null) {
        ((V)localDialog).x();
      } else {
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
      }
    }
  }
  
  public Dialog N1(Bundle paramBundle)
  {
    Dialog localDialog = E0;
    if (localDialog == null)
    {
      Z1(null, null);
      R1(false);
      paramBundle = super.N1(paramBundle);
      Intrinsics.checkNotNullExpressionValue(paramBundle, "super.onCreateDialog(savedInstanceState)");
      return paramBundle;
    }
    if (localDialog != null) {
      return localDialog;
    }
    throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
  }
  
  public final void W1()
  {
    if (E0 != null) {
      return;
    }
    e locale = n();
    if (locale == null) {
      return;
    }
    Object localObject1 = locale.getIntent();
    Object localObject2 = E.a;
    Intrinsics.checkNotNullExpressionValue(localObject1, "intent");
    Object localObject3 = E.u((Intent)localObject1);
    boolean bool;
    if (localObject3 == null) {
      bool = false;
    } else {
      bool = ((BaseBundle)localObject3).getBoolean("is_fallback", false);
    }
    localObject2 = null;
    localObject1 = null;
    if (!bool)
    {
      if (localObject3 == null) {
        localObject2 = null;
      } else {
        localObject2 = ((BaseBundle)localObject3).getString("action");
      }
      if (localObject3 != null) {
        localObject1 = ((Bundle)localObject3).getBundle("params");
      }
      if (!P.c0((String)localObject2)) {}
    }
    for (localObject2 = "Cannot start a WebDialog with an empty/missing 'actionName'";; localObject2 = "Cannot start a fallback WebDialog with an empty/missing 'url'")
    {
      P.j0("FacebookDialogFragment", (String)localObject2);
      locale.finish();
      return;
      if (localObject2 != null)
      {
        localObject2 = new V.a(locale, (String)localObject2, (Bundle)localObject1).h(new g(this)).a();
        break label256;
      }
      throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
      if (localObject3 != null) {
        localObject2 = ((BaseBundle)localObject3).getString("url");
      }
      if (!P.c0((String)localObject2)) {
        break;
      }
    }
    localObject1 = x.a;
    localObject3 = String.format("fb%s://bridge/", Arrays.copyOf(new Object[] { B.m() }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject3, "java.lang.String.format(format, *args)");
    localObject1 = m.E;
    if (localObject2 != null)
    {
      localObject2 = ((m.a)localObject1).a(locale, (String)localObject2, (String)localObject3);
      ((V)localObject2).B(new h(this));
      label256:
      E0 = ((Dialog)localObject2);
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
  }
  
  public final void Z1(Bundle paramBundle, o paramo)
  {
    e locale = n();
    if (locale == null) {
      return;
    }
    Object localObject = E.a;
    localObject = locale.getIntent();
    Intrinsics.checkNotNullExpressionValue(localObject, "fragmentActivity.intent");
    paramBundle = E.m((Intent)localObject, paramBundle, paramo);
    int i;
    if (paramo == null) {
      i = -1;
    } else {
      i = 0;
    }
    locale.setResult(i, paramBundle);
    locale.finish();
  }
  
  public final void a2(Bundle paramBundle)
  {
    e locale = n();
    if (locale == null) {
      return;
    }
    Intent localIntent = new Intent();
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localIntent.putExtras(localBundle);
    locale.setResult(-1, localIntent);
    locale.finish();
  }
  
  public final void b2(Dialog paramDialog)
  {
    E0 = paramDialog;
  }
  
  public void m0(Bundle paramBundle)
  {
    super.m0(paramBundle);
    W1();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Intrinsics.checkNotNullParameter(paramConfiguration, "newConfig");
    super.onConfigurationChanged(paramConfiguration);
    if (((E0 instanceof V)) && (d0()))
    {
      paramConfiguration = E0;
      if (paramConfiguration != null) {
        ((V)paramConfiguration).x();
      } else {
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
      }
    }
  }
  
  public void t0()
  {
    Dialog localDialog = L1();
    if ((localDialog != null) && (J())) {
      localDialog.setDismissMessage(null);
    }
    super.t0();
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     O1.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
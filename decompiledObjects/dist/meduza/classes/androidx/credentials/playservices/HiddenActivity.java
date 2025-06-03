package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import b7.u;
import com.google.android.gms.internal.auth_api.zbag;
import com.google.android.gms.internal.auth_api.zbaq;
import com.google.android.gms.tasks.Task;
import d6.d0;
import d6.j;
import d6.r;
import ec.i;
import k0.c;
import k0.e;
import k0.g;
import l.l;
import l6.q.a;

public class HiddenActivity
  extends Activity
{
  public ResultReceiver a;
  public boolean b;
  
  public final void a(ResultReceiver paramResultReceiver, String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("FAILURE_RESPONSE", true);
    localBundle.putString("EXCEPTION_TYPE", paramString1);
    localBundle.putString("EXCEPTION_MESSAGE", paramString2);
    paramResultReceiver.send(Integer.MAX_VALUE, localBundle);
    finish();
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("FAILURE_RESPONSE", false);
    localBundle.putInt("ACTIVITY_REQUEST_CODE", paramInt1);
    localBundle.putParcelable("RESULT_DATA", paramIntent);
    paramIntent = a;
    if (paramIntent != null) {
      paramIntent.send(paramInt2, localBundle);
    }
    b = false;
    finish();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    String str = getIntent().getStringExtra("TYPE");
    Object localObject1 = (ResultReceiver)getIntent().getParcelableExtra("RESULT_RECEIVER");
    a = ((ResultReceiver)localObject1);
    if (localObject1 == null) {
      finish();
    }
    if (paramBundle != null) {
      b = paramBundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
    }
    if (b) {
      return;
    }
    if (str != null)
    {
      int i = str.hashCode();
      localObject1 = null;
      Object localObject2 = null;
      Object localObject3 = null;
      paramBundle = null;
      switch (i)
      {
      default: 
        break;
      case 1980564212: 
        if (str.equals("SIGN_IN_INTENT"))
        {
          localObject1 = (d6.f)getIntent().getParcelableExtra("REQUEST_TYPE");
          i = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
          if (localObject1 != null) {
            paramBundle = new zbaq(this, new d0()).getSignInIntent((d6.f)localObject1).addOnSuccessListener(new c(0, new k0.h(this, i))).addOnFailureListener(new k0.d(this, 0));
          }
          if (paramBundle != null) {
            return;
          }
          Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
          finish();
        }
        break;
      case 1246634622: 
        if (str.equals("CREATE_PASSWORD"))
        {
          localObject2 = (d6.h)getIntent().getParcelableExtra("REQUEST_TYPE");
          i = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
          paramBundle = (Bundle)localObject1;
          if (localObject2 != null) {
            paramBundle = new zbag(this, new r()).savePassword((d6.h)localObject2).addOnSuccessListener(new c(1, new k0.f(this, i))).addOnFailureListener(new k0.d(this, 1));
          }
          if (paramBundle != null) {
            return;
          }
          Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
          finish();
        }
        break;
      case 15545322: 
        if (str.equals("CREATE_PUBLIC_KEY_CREDENTIAL"))
        {
          localObject1 = (u)getIntent().getParcelableExtra("REQUEST_TYPE");
          int j = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
          paramBundle = (Bundle)localObject2;
          if (localObject1 != null)
          {
            i = z6.a.a;
            paramBundle = new a7.a(this);
            localObject2 = new q.a();
            a = new l(5, paramBundle, localObject1);
            d = 5407;
            paramBundle = paramBundle.doRead(((q.a)localObject2).a()).addOnSuccessListener(new k0.a(0, new g(this, j))).addOnFailureListener(new k0.b(this, 0));
          }
          if (paramBundle != null) {
            return;
          }
          Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
          finish();
        }
        break;
      case -441061071: 
        if (str.equals("BEGIN_SIGN_IN"))
        {
          localObject1 = (d6.b)getIntent().getParcelableExtra("REQUEST_TYPE");
          i = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
          paramBundle = (Bundle)localObject3;
          if (localObject1 != null) {
            paramBundle = new zbaq(this, new d0()).beginSignIn((d6.b)localObject1).addOnSuccessListener(new k0.a(1, new e(this, i))).addOnFailureListener(new k0.b(this, 1));
          }
          if (paramBundle != null) {
            return;
          }
          Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
          finish();
        }
        break;
      }
    }
    Log.w("HiddenActivity", "Activity handed an unsupported type");
    finish();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    i.e(paramBundle, "outState");
    paramBundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", b);
    super.onSaveInstanceState(paramBundle);
  }
}

/* Location:
 * Qualified Name:     androidx.credentials.playservices.HiddenActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
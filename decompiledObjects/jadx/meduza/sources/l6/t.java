package l6;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.List;
import p.o;

/* loaded from: classes.dex */
public final class t implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9724a = 1;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9725b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9726c;

    public /* synthetic */ t(GenericIdpActivity genericIdpActivity, String str) {
        this.f9725b = genericIdpActivity;
        this.f9726c = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f9724a) {
            case 0:
                ((u) this.f9726c).f9729b.remove((TaskCompletionSource) this.f9725b);
                break;
            default:
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f9725b;
                String str = (String) this.f9726c;
                c8.u0 u0Var = GenericIdpActivity.f3105c;
                boolean z10 = false;
                if (!(genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null)) {
                    Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzadv.zzb(genericIdpActivity, str);
                    break;
                } else {
                    List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        z10 = true;
                    }
                    if (!z10) {
                        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent.putExtra("com.android.browser.application_id", str);
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                        intent.addFlags(1073741824);
                        intent.addFlags(268435456);
                        genericIdpActivity.startActivity(intent);
                        break;
                    } else {
                        p.o a10 = new o.d().a();
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                        a10.f12724a.setData((Uri) task.getResult());
                        v.a.startActivity(genericIdpActivity, a10.f12724a, a10.f12725b);
                        break;
                    }
                }
                break;
        }
    }

    public t(u uVar, TaskCompletionSource taskCompletionSource) {
        this.f9726c = uVar;
        this.f9725b = taskCompletionSource;
    }
}

package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import b7.u;
import com.google.android.gms.internal.p000authapi.zbag;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d6.b;
import d6.c;
import d6.d0;
import d6.h;
import d6.r;
import dc.l;
import ec.i;
import k0.e;
import k0.f;
import k0.g;
import l6.q;
import z6.a;

/* loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f970c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f971a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f972b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i10);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f971a;
        if (resultReceiver != null) {
            resultReceiver.send(i11, bundle);
        }
        this.f972b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i10 = 0;
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f971a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f972b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f972b) {
            return;
        }
        if (stringExtra != null) {
            Task<c> task = null;
            final int i11 = 1;
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        b bVar = (b) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (bVar != null) {
                            Task<c> beginSignIn = new zbaq((Activity) this, new d0()).beginSignIn(bVar);
                            final e eVar = new e(this, intExtra);
                            task = beginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: k0.a
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    switch (i11) {
                                        case 0:
                                            l lVar = eVar;
                                            int i12 = HiddenActivity.f970c;
                                            i.e(lVar, "$tmp0");
                                            lVar.invoke(obj);
                                            break;
                                        default:
                                            l lVar2 = eVar;
                                            int i13 = HiddenActivity.f970c;
                                            i.e(lVar2, "$tmp0");
                                            lVar2.invoke(obj);
                                            break;
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener(this) { // from class: k0.b

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f8821b;

                                {
                                    this.f8821b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    switch (i11) {
                                        case 0:
                                            HiddenActivity hiddenActivity = this.f8821b;
                                            int i12 = HiddenActivity.f970c;
                                            i.e(hiddenActivity, "this$0");
                                            i.e(exc, "e");
                                            String str = ((exc instanceof k6.b) && l0.a.f9521a.contains(Integer.valueOf(((k6.b) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = hiddenActivity.f971a;
                                            i.b(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        default:
                                            HiddenActivity hiddenActivity2 = this.f8821b;
                                            int i13 = HiddenActivity.f970c;
                                            i.e(hiddenActivity2, "this$0");
                                            i.e(exc, "e");
                                            String str2 = ((exc instanceof k6.b) && l0.a.f9521a.contains(Integer.valueOf(((k6.b) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver3 = hiddenActivity2.f971a;
                                            i.b(resultReceiver3);
                                            hiddenActivity2.a(resultReceiver3, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (task == null) {
                            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        u uVar = (u) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (uVar != null) {
                            int i12 = a.f17816a;
                            a7.a aVar = new a7.a(this);
                            q.a aVar2 = new q.a();
                            aVar2.f9714a = new l.l(5, aVar, uVar);
                            aVar2.f9717d = 5407;
                            Task<TResult> doRead = aVar.doRead(aVar2.a());
                            final g gVar = new g(this, intExtra2);
                            task = doRead.addOnSuccessListener(new OnSuccessListener() { // from class: k0.a
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    switch (i10) {
                                        case 0:
                                            l lVar = gVar;
                                            int i122 = HiddenActivity.f970c;
                                            i.e(lVar, "$tmp0");
                                            lVar.invoke(obj);
                                            break;
                                        default:
                                            l lVar2 = gVar;
                                            int i13 = HiddenActivity.f970c;
                                            i.e(lVar2, "$tmp0");
                                            lVar2.invoke(obj);
                                            break;
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener(this) { // from class: k0.b

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f8821b;

                                {
                                    this.f8821b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    switch (i10) {
                                        case 0:
                                            HiddenActivity hiddenActivity = this.f8821b;
                                            int i122 = HiddenActivity.f970c;
                                            i.e(hiddenActivity, "this$0");
                                            i.e(exc, "e");
                                            String str = ((exc instanceof k6.b) && l0.a.f9521a.contains(Integer.valueOf(((k6.b) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver2 = hiddenActivity.f971a;
                                            i.b(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + exc.getMessage());
                                            break;
                                        default:
                                            HiddenActivity hiddenActivity2 = this.f8821b;
                                            int i13 = HiddenActivity.f970c;
                                            i.e(hiddenActivity2, "this$0");
                                            i.e(exc, "e");
                                            String str2 = ((exc instanceof k6.b) && l0.a.f9521a.contains(Integer.valueOf(((k6.b) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver3 = hiddenActivity2.f971a;
                                            i.b(resultReceiver3);
                                            hiddenActivity2.a(resultReceiver3, str2, "During begin sign in, failure response from one tap: " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (task == null) {
                            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        h hVar = (h) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (hVar != null) {
                            Task<d6.i> savePassword = new zbag((Activity) this, new r()).savePassword(hVar);
                            final f fVar = new f(this, intExtra3);
                            task = savePassword.addOnSuccessListener(new OnSuccessListener() { // from class: k0.c
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    switch (i11) {
                                        case 0:
                                            l lVar = fVar;
                                            int i13 = HiddenActivity.f970c;
                                            i.e(lVar, "$tmp0");
                                            lVar.invoke(obj);
                                            break;
                                        default:
                                            l lVar2 = fVar;
                                            int i14 = HiddenActivity.f970c;
                                            i.e(lVar2, "$tmp0");
                                            lVar2.invoke(obj);
                                            break;
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener(this) { // from class: k0.d

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f8825b;

                                {
                                    this.f8825b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    switch (i11) {
                                        case 0:
                                            HiddenActivity hiddenActivity = this.f8825b;
                                            int i13 = HiddenActivity.f970c;
                                            i.e(hiddenActivity, "this$0");
                                            i.e(exc, "e");
                                            String str = ((exc instanceof k6.b) && l0.a.f9521a.contains(Integer.valueOf(((k6.b) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver2 = hiddenActivity.f971a;
                                            i.b(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            HiddenActivity hiddenActivity2 = this.f8825b;
                                            int i14 = HiddenActivity.f970c;
                                            i.e(hiddenActivity2, "this$0");
                                            i.e(exc, "e");
                                            String str2 = ((exc instanceof k6.b) && l0.a.f9521a.contains(Integer.valueOf(((k6.b) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = hiddenActivity2.f971a;
                                            i.b(resultReceiver3);
                                            hiddenActivity2.a(resultReceiver3, str2, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (task == null) {
                            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        d6.f fVar2 = (d6.f) getIntent().getParcelableExtra("REQUEST_TYPE");
                        int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                        if (fVar2 != null) {
                            Task<PendingIntent> signInIntent = new zbaq((Activity) this, new d0()).getSignInIntent(fVar2);
                            final k0.h hVar2 = new k0.h(this, intExtra4);
                            task = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: k0.c
                                @Override // com.google.android.gms.tasks.OnSuccessListener
                                public final void onSuccess(Object obj) {
                                    switch (i10) {
                                        case 0:
                                            l lVar = hVar2;
                                            int i13 = HiddenActivity.f970c;
                                            i.e(lVar, "$tmp0");
                                            lVar.invoke(obj);
                                            break;
                                        default:
                                            l lVar2 = hVar2;
                                            int i14 = HiddenActivity.f970c;
                                            i.e(lVar2, "$tmp0");
                                            lVar2.invoke(obj);
                                            break;
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener(this) { // from class: k0.d

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ HiddenActivity f8825b;

                                {
                                    this.f8825b = this;
                                }

                                @Override // com.google.android.gms.tasks.OnFailureListener
                                public final void onFailure(Exception exc) {
                                    switch (i10) {
                                        case 0:
                                            HiddenActivity hiddenActivity = this.f8825b;
                                            int i13 = HiddenActivity.f970c;
                                            i.e(hiddenActivity, "this$0");
                                            i.e(exc, "e");
                                            String str = ((exc instanceof k6.b) && l0.a.f9521a.contains(Integer.valueOf(((k6.b) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                            ResultReceiver resultReceiver2 = hiddenActivity.f971a;
                                            i.b(resultReceiver2);
                                            hiddenActivity.a(resultReceiver2, str, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
                                            break;
                                        default:
                                            HiddenActivity hiddenActivity2 = this.f8825b;
                                            int i14 = HiddenActivity.f970c;
                                            i.e(hiddenActivity2, "this$0");
                                            i.e(exc, "e");
                                            String str2 = ((exc instanceof k6.b) && l0.a.f9521a.contains(Integer.valueOf(((k6.b) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                            ResultReceiver resultReceiver3 = hiddenActivity2.f971a;
                                            i.b(resultReceiver3);
                                            hiddenActivity2.a(resultReceiver3, str2, "During save password, found password failure response from one tap " + exc.getMessage());
                                            break;
                                    }
                                }
                            });
                        }
                        if (task == null) {
                            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                            finish();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        i.e(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f972b);
        super.onSaveInstanceState(bundle);
    }
}

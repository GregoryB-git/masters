package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import defpackage.g;
import j6.b;
import j6.e;
import l6.d;
import m6.j;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2808b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f2809a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2809a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                d g10 = d.g(this);
                if (i11 == -1) {
                    zau zauVar = g10.f9655v;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                } else if (i11 == 0) {
                    g10.h(new b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f2809a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2809a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2809a = bundle.getInt("resolution");
        }
        if (this.f2809a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else {
                    if (pendingIntent == null) {
                        j.i(num);
                        e.f8488d.d(this, num.intValue(), this);
                        this.f2809a = 1;
                        return;
                    }
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f2809a = 1;
                        return;
                    } catch (ActivityNotFoundException e10) {
                        if (extras.getBoolean("notify_manager", true)) {
                            d.g(this).h(new b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String e11 = g.e("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                e11 = e11.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", e11, e10);
                        }
                        this.f2809a = 1;
                    } catch (IntentSender.SendIntentException e12) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e12);
                    }
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2809a);
        super.onSaveInstanceState(bundle);
    }
}

// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.api;

import android.os.BaseBundle;
import android.content.DialogInterface;
import android.os.Bundle;
import A2.n;
import x2.j;
import android.content.ActivityNotFoundException;
import android.os.Build;
import x2.b;
import z2.e;
import android.content.IntentSender$SendIntentException;
import android.util.Log;
import android.os.Parcelable;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.annotation.KeepName;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface$OnCancelListener
{
    public int o;
    
    public GoogleApiActivity() {
        this.o = 0;
    }
    
    public static Intent a(final Context context, final PendingIntent pendingIntent, final int n, final boolean b) {
        final Intent intent = new Intent(context, (Class)GoogleApiActivity.class);
        intent.putExtra("pending_intent", (Parcelable)pendingIntent);
        intent.putExtra("failing_client_id", n);
        intent.putExtra("notify_manager", b);
        return intent;
    }
    
    public final void b() {
        final Bundle extras = this.getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            this.finish();
            return;
        }
        final PendingIntent pendingIntent = (PendingIntent)((BaseBundle)extras).get("pending_intent");
        final Integer n = (Integer)((BaseBundle)extras).get("error_code");
        if (pendingIntent == null && n == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            this.finish();
            return;
        }
        if (pendingIntent != null) {
            Label_0103: {
                try {
                    this.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent)null, 0, 0, 0);
                    this.o = 1;
                    return;
                }
                catch (IntentSender$SendIntentException ex2) {
                    break Label_0103;
                }
                catch (ActivityNotFoundException ex) {
                    if (((BaseBundle)extras).getBoolean("notify_manager", true)) {
                        e.x((Context)this).F(new b(22, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                    else {
                        final String string = pendingIntent.toString();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Activity not found while launching ");
                        sb.append(string);
                        sb.append(".");
                        String s = sb.toString();
                        if (Build.FINGERPRINT.contains("generic")) {
                            s = s.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", s, (Throwable)ex);
                    }
                    this.o = 1;
                    this.finish();
                    return;
                    final IntentSender$SendIntentException ex2;
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", (Throwable)ex2);
                    this.finish();
                    return;
                }
            }
        }
        j.m().n(this, (int)A2.n.i(n), 2, (DialogInterface$OnCancelListener)this);
        this.o = 1;
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1) {
            final boolean booleanExtra = this.getIntent().getBooleanExtra("notify_manager", true);
            this.o = 0;
            this.setResult(n2, intent);
            if (booleanExtra) {
                final e x = e.x((Context)this);
                if (n2 != -1) {
                    if (n2 == 0) {
                        x.F(new b(13, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                }
                else {
                    x.a();
                }
            }
        }
        else if (n == 2) {
            this.o = 0;
            this.setResult(n2, intent);
        }
        this.finish();
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.setResult(this.o = 0);
        this.finish();
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.o = ((BaseBundle)bundle).getInt("resolution");
        }
        if (this.o != 1) {
            this.b();
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        ((BaseBundle)bundle).putInt("resolution", this.o);
        super.onSaveInstanceState(bundle);
    }
}

/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.os.Build
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.android.gms.common.api;

import A2.n;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import x2.b;
import x2.j;
import z2.e;

@KeepName
public class GoogleApiActivity
extends Activity
implements DialogInterface.OnCancelListener {
    public int o = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int n8, boolean bl) {
        context = new Intent(context, GoogleApiActivity.class);
        context.putExtra("pending_intent", (Parcelable)pendingIntent);
        context.putExtra("failing_client_id", n8);
        context.putExtra("notify_manager", bl);
        return context;
    }

    public final void b() {
        Object object = this.getIntent().getExtras();
        if (object == null) {
            Log.e((String)"GoogleApiActivity", (String)"Activity started without extras");
            this.finish();
            return;
        }
        Object object2 = (PendingIntent)object.get("pending_intent");
        Integer n8 = (Integer)object.get("error_code");
        if (object2 == null && n8 == null) {
            Log.e((String)"GoogleApiActivity", (String)"Activity started without resolution");
            this.finish();
            return;
        }
        if (object2 != null) {
            ActivityNotFoundException activityNotFoundException2;
            block9 : {
                try {
                    this.startIntentSenderForResult(object2.getIntentSender(), 1, null, 0, 0, 0);
                    this.o = 1;
                    return;
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                }
                catch (ActivityNotFoundException activityNotFoundException2) {
                    break block9;
                }
                Log.e((String)"GoogleApiActivity", (String)"Failed to launch pendingIntent", (Throwable)sendIntentException);
                this.finish();
                return;
            }
            if (object.getBoolean("notify_manager", true)) {
                e.x((Context)this).F(new b(22, null), this.getIntent().getIntExtra("failing_client_id", -1));
            } else {
                object = object2.toString();
                object2 = new StringBuilder();
                object2.append("Activity not found while launching ");
                object2.append((String)object);
                object2.append(".");
                object = object2 = object2.toString();
                if (Build.FINGERPRINT.contains((CharSequence)"generic")) {
                    object = object2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e((String)"GoogleApiActivity", (String)object, (Throwable)activityNotFoundException2);
            }
            this.o = 1;
            this.finish();
            return;
        }
        int n9 = (Integer)n.i((Object)n8);
        j.m().n(this, n9, 2, this);
        this.o = 1;
    }

    public final void onActivityResult(int n8, int n9, Intent object) {
        super.onActivityResult(n8, n9, (Intent)object);
        if (n8 == 1) {
            boolean bl = this.getIntent().getBooleanExtra("notify_manager", true);
            this.o = 0;
            this.setResult(n9, (Intent)object);
            if (bl) {
                object = e.x((Context)this);
                if (n9 != -1) {
                    if (n9 == 0) {
                        object.F(new b(13, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    object.a();
                }
            }
        } else if (n8 == 2) {
            this.o = 0;
            this.setResult(n9, (Intent)object);
        }
        this.finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.o = 0;
        this.setResult(0);
        this.finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.o = bundle.getInt("resolution");
        }
        if (this.o != 1) {
            this.b();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.o);
        super.onSaveInstanceState(bundle);
    }
}


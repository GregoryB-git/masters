/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 */
package A2;

import A2.B;
import android.app.Activity;
import android.content.Intent;

public final class z
extends B {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c;

    public z(Intent intent, Activity activity, int n8) {
        this.a = intent;
        this.b = activity;
        this.c = n8;
    }

    @Override
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}


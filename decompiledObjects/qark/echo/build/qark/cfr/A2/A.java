/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package A2;

import A2.B;
import android.content.Intent;
import z2.g;

public final class A
extends B {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ g b;

    public A(Intent intent, g g8, int n8) {
        this.a = intent;
        this.b = g8;
    }

    @Override
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}


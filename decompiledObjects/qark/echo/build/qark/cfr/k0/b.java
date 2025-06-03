/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class b {
    public final Context a;
    public final a b;
    public boolean c;

    public b(Context context, Handler handler, b b8) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, b8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(boolean bl) {
        block4 : {
            block3 : {
                block2 : {
                    if (!bl || this.c) break block2;
                    this.a.registerReceiver((BroadcastReceiver)this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                    bl = true;
                    break block3;
                }
                if (bl || !this.c) break block4;
                this.a.unregisterReceiver((BroadcastReceiver)this.b);
                bl = false;
            }
            this.c = bl;
            return;
        }
    }

    public final class a
    extends BroadcastReceiver
    implements Runnable {
        public final b o;
        public final Handler p;

        public a(Handler handler, b b9) {
            this.p = handler;
            this.o = b9;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals((Object)intent.getAction())) {
                this.p.post((Runnable)this);
            }
        }

        public void run() {
            if (b.this.c) {
                this.o.E();
            }
        }
    }

    public static interface b {
        public void E();
    }

}


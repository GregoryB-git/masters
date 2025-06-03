// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Handler;
import android.content.Context;

public final class b
{
    public final Context a;
    public final a b;
    public boolean c;
    
    public b(final Context context, final Handler handler, final b b) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, b);
    }
    
    public static /* synthetic */ boolean a(final b b) {
        return b.c;
    }
    
    public void b(final boolean b) {
        boolean c;
        if (b && !this.c) {
            this.a.registerReceiver((BroadcastReceiver)this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            c = true;
        }
        else {
            if (b || !this.c) {
                return;
            }
            this.a.unregisterReceiver((BroadcastReceiver)this.b);
            c = false;
        }
        this.c = c;
    }
    
    public final class a extends BroadcastReceiver implements Runnable
    {
        public final b o;
        public final Handler p;
        
        public a(final Handler p3, final b o) {
            this.p = p3;
            this.o = o;
        }
        
        public void onReceive(final Context context, final Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.p.post((Runnable)this);
            }
        }
        
        public void run() {
            if (k0.b.a(k0.b.this)) {
                this.o.E();
            }
        }
    }
    
    public interface b
    {
        void E();
    }
}

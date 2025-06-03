// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F3;

import E3.f;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements b, a
{
    public final e a;
    public final int b;
    public final TimeUnit c;
    public final Object d;
    public CountDownLatch e;
    public boolean f;
    
    public c(final e a, final int b, final TimeUnit c) {
        this.d = new Object();
        this.f = false;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final String str, final Bundle obj) {
        final Object d = this.d;
        // monitorenter(d)
        while (true) {
            try {
                final f f = E3.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Logging event ");
                sb.append(str);
                sb.append(" to Firebase Analytics with params ");
                sb.append(obj);
                f.i(sb.toString());
                this.e = new CountDownLatch(1);
                this.f = false;
                this.a.a(str, obj);
                E3.f.f().i("Awaiting app exception callback from Analytics...");
                while (true) {
                    try {
                        if (this.e.await(this.b, this.c)) {
                            this.f = true;
                            E3.f.f().i("App exception callback received from Analytics listener.");
                        }
                        else {
                            E3.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                        }
                        // monitorexit(d)
                        while (true) {
                            this.e = null;
                            return;
                            E3.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                            continue;
                        }
                    }
                    // monitorexit(d)
                    catch (InterruptedException ex) {}
                    continue;
                }
            }
            finally {}
            continue;
        }
    }
    
    @Override
    public void t(final String anObject, final Bundle bundle) {
        final CountDownLatch e = this.e;
        if (e == null) {
            return;
        }
        if ("_ae".equals(anObject)) {
            e.countDown();
        }
    }
}

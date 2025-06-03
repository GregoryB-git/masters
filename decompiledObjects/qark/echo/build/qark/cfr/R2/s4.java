/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Map
 */
package R2;

import A2.n;
import R2.G2;
import R2.p4;
import R2.q4;
import R2.r4;
import com.google.android.gms.internal.measurement.h0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public final class s4
implements Runnable {
    public final URL o;
    public final byte[] p;
    public final p4 q;
    public final String r;
    public final Map s;
    public final /* synthetic */ q4 t;

    public s4(q4 q42, String string2, URL uRL, byte[] arrby, Map map, p4 p42) {
        this.t = q42;
        n.e(string2);
        n.i((Object)uRL);
        n.i(p42);
        this.o = uRL;
        this.p = null;
        this.q = p42;
        this.r = string2;
        this.s = null;
    }

    public final /* synthetic */ void a(int n8, Exception exception, byte[] arrby, Map map) {
        this.q.a(this.r, n8, (Throwable)exception, arrby, map);
    }

    public final void b(int n8, Exception exception, byte[] arrby, Map map) {
        this.t.e().D(new r4(this, n8, exception, arrby, map));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        int n8;
        URL uRL2;
        Map map;
        URL uRL;
        block14 : {
            URL uRL3;
            block13 : {
                int n9;
                block12 : {
                    byte[] arrby;
                    this.t.l();
                    int n10 = 0;
                    n8 = 0;
                    n9 = 0;
                    int n11 = 0;
                    uRL2 = this.o;
                    uRL2 = h0.a().b(uRL2, "client-measurement");
                    if (!(uRL2 instanceof HttpURLConnection)) break block12;
                    uRL2 = (HttpURLConnection)uRL2;
                    uRL2.setDefaultUseCaches(false);
                    uRL2.setConnectTimeout(60000);
                    uRL2.setReadTimeout(61000);
                    uRL2.setInstanceFollowRedirects(false);
                    uRL2.setDoInput(true);
                    n11 = n8 = uRL2.getResponseCode();
                    n10 = n8;
                    map = uRL2.getHeaderFields();
                    try {
                        arrby = q4.u(this.t, (HttpURLConnection)uRL2);
                    }
                    catch (Throwable throwable) {
                        uRL3 = uRL2;
                        uRL2 = map;
                        map = throwable;
                        break block13;
                    }
                    catch (IOException iOException) {
                        uRL = uRL2;
                        uRL2 = map;
                        map = iOException;
                        break block14;
                    }
                    uRL2.disconnect();
                    this.b(n8, null, arrby, map);
                    return;
                    catch (Throwable throwable) {
                        Object var8_16 = null;
                        n8 = n11;
                        uRL3 = uRL2;
                        uRL2 = var8_16;
                        break block13;
                    }
                    catch (IOException iOException) {
                        Object var8_17 = null;
                        n8 = n10;
                        uRL = uRL2;
                        uRL2 = var8_17;
                        break block14;
                    }
                }
                try {
                    throw new IOException("Failed to obtain HTTP connection");
                }
                catch (Throwable throwable) {
                    uRL2 = uRL3 = null;
                }
                catch (IOException iOException) {
                    uRL2 = uRL = null;
                    n8 = n9;
                    break block14;
                }
            }
            if (uRL3 != null) {
                uRL3.disconnect();
            }
            this.b(n8, null, null, (Map)uRL2);
            throw map;
        }
        if (uRL != null) {
            uRL.disconnect();
        }
        this.b(n8, (Exception)map, null, (Map)uRL2);
    }
}


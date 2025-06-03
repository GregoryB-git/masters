// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.List;
import java.net.URLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import com.google.android.gms.internal.measurement.h0;
import A2.n;
import java.util.Map;
import java.net.URL;

public final class s4 implements Runnable
{
    public final URL o;
    public final byte[] p;
    public final p4 q;
    public final String r;
    public final Map s;
    public final /* synthetic */ q4 t;
    
    public s4(final q4 t, final String r, final URL o, final byte[] array, final Map map, final p4 q) {
        this.t = t;
        n.e(r);
        n.i(o);
        n.i(q);
        this.o = o;
        this.p = null;
        this.q = q;
        this.r = r;
        this.s = null;
    }
    
    public final void b(final int n, final Exception ex, final byte[] array, final Map map) {
        this.t.e().D(new r4(this, n, ex, array, map));
    }
    
    @Override
    public final void run() {
        this.t.l();
        int n = 0;
        final int n2 = 0;
        int responseCode = 0;
        Map map2 = null;
        Map map = null;
        final Exception ex;
        Label_0254: {
            Label_0232: {
                try {
                    final URLConnection b = h0.a().b(this.o, "client-measurement");
                    if (b instanceof HttpURLConnection) {
                        Object o = b;
                        ((URLConnection)o).setDefaultUseCaches(false);
                        ((URLConnection)o).setConnectTimeout(60000);
                        ((URLConnection)o).setReadTimeout(61000);
                        ((HttpURLConnection)o).setInstanceFollowRedirects(false);
                        ((URLConnection)o).setDoInput(true);
                        try {
                            n = (responseCode = ((HttpURLConnection)o).getResponseCode());
                            final Map<String, List<String>> headerFields = ((URLConnection)o).getHeaderFields();
                            try {
                                final byte[] u = q4.u(this.t, (HttpURLConnection)o);
                                ((HttpURLConnection)o).disconnect();
                                this.b(n, null, u, headerFields);
                                return;
                            }
                            catch (IOException ex2) {}
                            finally {
                                o = headerFields;
                            }
                        }
                        catch (IOException ex3) {}
                        finally {
                            n = responseCode;
                        }
                    }
                }
                catch (IOException ex4) {
                    n = n2;
                    break Label_0254;
                }
                finally {
                    map = (map2 = null);
                    break Label_0232;
                }
                throw new IOException("Failed to obtain HTTP connection");
            }
            if (map != null) {
                ((HttpURLConnection)map).disconnect();
            }
            this.b(n, null, null, map2);
            throw ex;
        }
        if (map != null) {
            ((HttpURLConnection)map).disconnect();
        }
        this.b(n, ex, null, map2);
    }
}

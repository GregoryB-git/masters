// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O3;

import java.io.Writer;
import java.io.FileWriter;
import java.io.Closeable;
import java.io.InputStream;
import H3.i;
import java.io.FileInputStream;
import E3.f;
import org.json.JSONObject;
import M3.g;
import java.io.File;

public class a
{
    public final File a;
    
    public a(final g g) {
        this.a = g.e("com.crashlytics.settings.json");
    }
    
    public final File a() {
        return this.a;
    }
    
    public JSONObject b() {
        f.f().b("Checking for cached settings...");
        Closeable closeable = null;
        Label_0109: {
            try {
                final File a = this.a();
                if (a.exists()) {
                    final FileInputStream fileInputStream = new FileInputStream(a);
                    try {
                        try {
                            final JSONObject jsonObject = new JSONObject(i.B(fileInputStream));
                        }
                        finally {}
                    }
                    catch (Exception ex) {}
                }
            }
            catch (Exception ex) {}
            finally {
                closeable = null;
                break Label_0109;
            }
            f.f().i("Settings file does not exist.");
            final Closeable closeable2 = null;
            i.f(closeable, "Error while closing settings cache file.");
            return (JSONObject)closeable2;
            final Exception ex;
            f.f().e("Failed to fetch cached settings", ex);
            i.f(closeable2, "Error while closing settings cache file.");
            return null;
        }
        i.f(closeable, "Error while closing settings cache file.");
    }
    
    public void c(final long n, final JSONObject jsonObject) {
        f.f().i("Writing settings to cache file...");
        if (jsonObject == null) {
            return;
        }
        final Closeable closeable = null;
        Throwable t;
        Object o = t = null;
        Closeable closeable2;
        try {
            try {
                jsonObject.put("expires_at", n);
                t = (Throwable)o;
                o = new FileWriter(this.a());
                try {
                    ((Writer)o).write(jsonObject.toString());
                    ((Writer)o).flush();
                    i.f((Closeable)o, "Failed to close settings writer.");
                    return;
                }
                catch (Exception t) {}
                finally {
                    t = (Throwable)o;
                }
            }
            finally {}
        }
        catch (Exception o) {
            closeable2 = closeable;
        }
        f.f().e("Failed to cache settings", (Throwable)o);
        i.f(closeable2, "Failed to close settings writer.");
        return;
        i.f((Closeable)t, "Failed to close settings writer.");
    }
}

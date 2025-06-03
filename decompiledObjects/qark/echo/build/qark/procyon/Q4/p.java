// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q4;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.firebase.remoteconfig.internal.b;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;

public class p
{
    public static final Map c;
    public final Context a;
    public final String b;
    
    static {
        c = new HashMap();
    }
    
    public p(final Context a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static p c(final Context context, final String s) {
        // monitorenter(p.class)
        while (true) {
            try {
                final Map c = p.c;
                if (!c.containsKey(s)) {
                    c.put(s, new p(context, s));
                }
                // monitorexit(p.class)
                return c.get(s);
                // monitorexit(p.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public Void a() {
        synchronized (this) {
            this.a.deleteFile(this.b);
            return null;
        }
    }
    
    public String b() {
        return this.b;
    }
    
    public b d() {
        // monitorenter(this)
        try {
            final FileInputStream openFileInput = this.a.openFileInput(this.b);
            try {
                final int available = openFileInput.available();
                final byte[] array = new byte[available];
                openFileInput.read(array, 0, available);
                final b b = com.google.firebase.remoteconfig.internal.b.b(new JSONObject(new String(array, "UTF-8")));
                try {
                    openFileInput.close();
                    // monitorexit(this)
                    return b;
                }
                finally {}
            }
            catch (JSONException ex) {}
            catch (FileNotFoundException ex2) {}
        }
        catch (JSONException ex3) {}
        catch (FileNotFoundException ex4) {}
    }
    
    public Void e(final b b) {
        // monitorenter(this)
        Label_0047: {
            FileOutputStream fileOutputStream;
            try {
                final FileOutputStream openFileOutput;
                fileOutputStream = (openFileOutput = this.a.openFileOutput(this.b, 0));
                final b b2 = b;
                final String s = b2.toString();
                final String s2 = "UTF-8";
                final byte[] array = s.getBytes(s2);
                openFileOutput.write(array);
                final FileOutputStream fileOutputStream2 = fileOutputStream;
                fileOutputStream2.close();
                final p p = this;
                // monitorexit(p)
                return null;
            }
            finally {
                break Label_0047;
            }
            try {
                final FileOutputStream openFileOutput = fileOutputStream;
                final b b2 = b;
                final String s = b2.toString();
                final String s2 = "UTF-8";
                final byte[] array = s.getBytes(s2);
                openFileOutput.write(array);
                final FileOutputStream fileOutputStream2 = fileOutputStream;
                fileOutputStream2.close();
                final p p = this;
                // monitorexit(p)
                return null;
            }
            finally {
                fileOutputStream.close();
            }
        }
    }
    // monitorexit(this)
}

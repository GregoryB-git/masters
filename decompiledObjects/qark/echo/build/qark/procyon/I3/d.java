// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I3;

import java.io.Serializable;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import H3.i;
import java.io.FileInputStream;
import java.util.Collections;
import E3.f;
import java.io.File;
import java.util.Iterator;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Map;
import M3.g;
import java.nio.charset.Charset;

public class d
{
    public static final Charset b;
    public final g a;
    
    static {
        b = Charset.forName("UTF-8");
    }
    
    public d(final g a) {
        this.a = a;
    }
    
    public static Map d(final String s) {
        final JSONObject jsonObject = new JSONObject(s);
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final Iterator keys = jsonObject.keys();
        while (keys.hasNext()) {
            final String s2 = keys.next();
            hashMap.put(s2, k(jsonObject, s2));
        }
        return hashMap;
    }
    
    public static String f(final Map map) {
        return new JSONObject(map).toString();
    }
    
    public static void i(final File file) {
        if (file.exists() && file.delete()) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Deleted corrupt file: ");
            sb.append(file.getAbsolutePath());
            f.g(sb.toString());
        }
    }
    
    public static String j(final String s) {
        return new JSONObject() {
            {
                this.put("userId", (Object)a);
            }
        }.toString();
    }
    
    public static String k(final JSONObject jsonObject, final String s) {
        final boolean null = jsonObject.isNull(s);
        String optString = null;
        if (!null) {
            optString = jsonObject.optString(s, (String)null);
        }
        return optString;
    }
    
    public File a(final String s) {
        return this.a.o(s, "internal-keys");
    }
    
    public File b(final String s) {
        return this.a.o(s, "keys");
    }
    
    public File c(final String s) {
        return this.a.o(s, "user-data");
    }
    
    public final String e(final String s) {
        return k(new JSONObject(s), "userId");
    }
    
    public Map g(String s, final boolean b) {
        File file;
        if (b) {
            file = this.a(s);
        }
        else {
            file = this.b(s);
        }
        if (!file.exists() || file.length() == 0L) {
            i(file);
            return Collections.emptyMap();
        }
        final Exception ex = null;
        Object o = null;
        Label_0130: {
            try {
                final FileInputStream fileInputStream = (FileInputStream)(s = (String)new FileInputStream(file));
                try {
                    try {
                        final Map d = d(i.B(fileInputStream));
                        i.f(fileInputStream, "Failed to close user metadata file.");
                        return d;
                    }
                    finally {}
                }
                catch (Exception ex) {}
            }
            catch (Exception ex) {
                o = null;
            }
            finally {
                o = ex;
                break Label_0130;
            }
            f.f().l("Error deserializing user metadata.", ex);
            i(file);
            i.f((Closeable)o, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
        i.f((Closeable)o, "Failed to close user metadata file.");
    }
    
    public String h(final String s) {
        final File c = this.c(s);
        final boolean exists = c.exists();
        Closeable closeable = null;
        if (exists && c.length() != 0L) {
            Closeable closeable2 = null;
            Exception ex = null;
            Label_0204: {
                final Exception ex2;
                try {
                    final FileInputStream fileInputStream = (FileInputStream)(closeable = new FileInputStream(c));
                    try {
                        try {
                            final String e = this.e(i.B(fileInputStream));
                            closeable = fileInputStream;
                            final f f = E3.f.f();
                            closeable = fileInputStream;
                            final StringBuilder sb = new StringBuilder();
                            closeable = fileInputStream;
                            sb.append("Loaded userId ");
                            closeable = fileInputStream;
                            sb.append(e);
                            closeable = fileInputStream;
                            sb.append(" for session ");
                            closeable = fileInputStream;
                            sb.append(s);
                            closeable = fileInputStream;
                            f.b(sb.toString());
                            i.f(fileInputStream, "Failed to close user metadata file.");
                            return e;
                        }
                        finally {}
                    }
                    catch (Exception closeable) {}
                }
                catch (Exception ex2) {
                    closeable2 = null;
                }
                finally {
                    closeable2 = closeable;
                    ex = ex2;
                    break Label_0204;
                }
                f.f().l("Error deserializing user metadata.", ex2);
                i(c);
                i.f(closeable2, "Failed to close user metadata file.");
                return null;
            }
            i.f(closeable2, "Failed to close user metadata file.");
            throw ex;
        }
        final f f2 = f.f();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("No userId set for session ");
        sb2.append(s);
        f2.b(sb2.toString());
        i(c);
        return null;
    }
    
    public void l(final String s, final Map map) {
        this.m(s, map, false);
    }
    
    public void m(String s, Map o, final boolean b) {
        File file;
        if (b) {
            file = this.a(s);
        }
        else {
            file = this.b(s);
        }
        Exception ex = null;
        final String s2 = s = null;
        Closeable closeable;
        try {
            try {
                final String f = f((Map)o);
                s = s2;
                o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), d.b));
                try {
                    ((Writer)o).write(f);
                    ((Writer)o).flush();
                    i.f((Closeable)o, "Failed to close key/value metadata file.");
                    return;
                }
                catch (Exception ex) {}
                finally {
                    s = (String)o;
                }
            }
            finally {}
        }
        catch (Exception ex2) {
            closeable = (Closeable)ex;
            ex = ex2;
        }
        f.f().l("Error serializing key/value metadata.", ex);
        i(file);
        i.f(closeable, "Failed to close key/value metadata file.");
        return;
        i.f((Closeable)s, "Failed to close key/value metadata file.");
    }
    
    public void n(String s, String s2) {
        final File c = this.c(s);
        final Closeable closeable = null;
        final Serializable s3 = s = null;
        Closeable closeable2;
        try {
            try {
                final String j = j(s2);
                s = (String)s3;
                s2 = (String)new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), d.b));
                try {
                    ((Writer)s2).write(j);
                    ((Writer)s2).flush();
                    i.f((Closeable)s2, "Failed to close user metadata file.");
                    return;
                }
                catch (Exception s3) {}
                finally {
                    s = s2;
                }
            }
            finally {}
        }
        catch (Exception s3) {
            closeable2 = closeable;
        }
        f.f().l("Error serializing user metadata.", (Throwable)s3);
        i.f(closeable2, "Failed to close user metadata file.");
        return;
        i.f((Closeable)s, "Failed to close user metadata file.");
    }
}

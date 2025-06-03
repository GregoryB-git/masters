/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.BufferedWriter
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONObject
 */
package I3;

import E3.f;
import H3.i;
import M3.g;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class d {
    public static final Charset b = Charset.forName((String)"UTF-8");
    public final g a;

    public d(g g8) {
        this.a = g8;
    }

    public static Map d(String string2) {
        string2 = new JSONObject(string2);
        HashMap hashMap = new HashMap();
        Iterator iterator = string2.keys();
        while (iterator.hasNext()) {
            String string3 = (String)iterator.next();
            hashMap.put((Object)string3, (Object)d.k((JSONObject)string2, string3));
        }
        return hashMap;
    }

    public static String f(Map map) {
        return new JSONObject(map).toString();
    }

    public static void i(File file) {
        if (file.exists() && file.delete()) {
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Deleted corrupt file: ");
            stringBuilder.append(file.getAbsolutePath());
            f8.g(stringBuilder.toString());
        }
    }

    public static String j(String string2) {
        return new JSONObject(){
            {
                this.put("userId", (Object)String.this);
            }
        }.toString();
    }

    public static String k(JSONObject jSONObject, String string2) {
        boolean bl = jSONObject.isNull(string2);
        String string3 = null;
        if (!bl) {
            string3 = jSONObject.optString(string2, null);
        }
        return string3;
    }

    public File a(String string2) {
        return this.a.o(string2, "internal-keys");
    }

    public File b(String string2) {
        return this.a.o(string2, "keys");
    }

    public File c(String string2) {
        return this.a.o(string2, "user-data");
    }

    public final String e(String string2) {
        return d.k(new JSONObject(string2), "userId");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Map g(String object, boolean bl) {
        Object object2;
        block8 : {
            File file;
            block9 : {
                file = bl ? this.a((String)object) : this.b((String)object);
                if (file.exists() && file.length() != 0L) {
                    FileInputStream fileInputStream = null;
                    object = object2 = new FileInputStream(file);
                    fileInputStream = d.d(i.B((InputStream)object2));
                    i.f((Closeable)object2, "Failed to close user metadata file.");
                    return fileInputStream;
                    catch (Throwable throwable) {
                        object2 = fileInputStream;
                        break block8;
                    }
                    catch (Exception exception) {
                        object2 = null;
                        break block9;
                    }
                }
                d.i(file);
                return Collections.emptyMap();
                catch (Throwable throwable) {
                    object2 = object;
                    object = throwable;
                    break block8;
                }
                catch (Exception exception) {}
            }
            object = object2;
            {
                void var5_9;
                f.f().l("Error deserializing user metadata.", (Throwable)var5_9);
                object = object2;
                d.i(file);
            }
            i.f((Closeable)object2, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
        i.f((Closeable)object2, "Failed to close user metadata file.");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public String h(String object) {
        Object object2;
        block8 : {
            File file;
            FileInputStream fileInputStream;
            block9 : {
                file = this.c((String)object);
                boolean bl = file.exists();
                object2 = null;
                if (bl && file.length() != 0L) {
                    fileInputStream = new FileInputStream(file);
                    object2 = fileInputStream;
                    String string2 = this.e(i.B((InputStream)fileInputStream));
                    object2 = fileInputStream;
                    f f8 = f.f();
                    object2 = fileInputStream;
                    StringBuilder stringBuilder = new StringBuilder();
                    object2 = fileInputStream;
                    stringBuilder.append("Loaded userId ");
                    object2 = fileInputStream;
                    stringBuilder.append(string2);
                    object2 = fileInputStream;
                    stringBuilder.append(" for session ");
                    object2 = fileInputStream;
                    stringBuilder.append((String)object);
                    object2 = fileInputStream;
                    f8.b(stringBuilder.toString());
                    i.f((Closeable)fileInputStream, "Failed to close user metadata file.");
                    return string2;
                    catch (Throwable throwable) {
                        object = object2;
                        object2 = throwable;
                        break block8;
                    }
                    catch (Exception exception) {
                        object = null;
                        break block9;
                    }
                }
                object2 = f.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No userId set for session ");
                stringBuilder.append((String)object);
                object2.b(stringBuilder.toString());
                d.i(file);
                return null;
                catch (Throwable throwable) {
                    object = object2;
                    object2 = throwable;
                    break block8;
                }
                catch (Exception exception) {
                    object = fileInputStream;
                    fileInputStream = exception;
                }
            }
            object2 = object;
            {
                f.f().l("Error deserializing user metadata.", (Throwable)fileInputStream);
                object2 = object;
                d.i(file);
            }
            i.f((Closeable)object, "Failed to close user metadata file.");
            return null;
        }
        i.f((Closeable)object, "Failed to close user metadata file.");
        throw object2;
    }

    public void l(String string2, Map map) {
        this.m(string2, map, false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void m(String string2, Map map, boolean bl) {
        block7 : {
            Exception exception;
            File file;
            block8 : {
                file = bl ? this.a(string2) : this.b(string2);
                exception = null;
                Object var6_10 = null;
                string2 = var6_10;
                String string3 = d.f(map);
                string2 = var6_10;
                map = new BufferedWriter((Writer)new OutputStreamWriter((OutputStream)new FileOutputStream(file), b));
                try {
                    map.write(string3);
                    map.flush();
                }
                catch (Throwable throwable) {
                    string2 = map;
                    map = throwable;
                    break block7;
                }
                catch (Exception exception2) {
                    break block8;
                }
                i.f((Closeable)map, "Failed to close key/value metadata file.");
                return;
                catch (Throwable throwable) {
                    break block7;
                }
                catch (Exception exception3) {
                    map = exception;
                    exception = exception3;
                }
            }
            string2 = map;
            {
                f.f().l("Error serializing key/value metadata.", (Throwable)exception);
                string2 = map;
                d.i(file);
            }
            i.f((Closeable)map, "Failed to close key/value metadata file.");
            return;
        }
        i.f((Closeable)string2, "Failed to close key/value metadata file.");
        throw map;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void n(String string2, String string3) {
        block7 : {
            block8 : {
                File file = this.c(string2);
                Object var4_5 = null;
                Object var3_6 = null;
                string2 = var3_6;
                String string4 = d.j(string3);
                string2 = var3_6;
                string3 = new BufferedWriter((Writer)new OutputStreamWriter((OutputStream)new FileOutputStream(file), b));
                try {
                    string3.write(string4);
                    string3.flush();
                }
                catch (Throwable throwable) {
                    string2 = string3;
                    string3 = throwable;
                    break block7;
                }
                catch (Exception exception) {
                    break block8;
                }
                i.f((Closeable)string3, "Failed to close user metadata file.");
                return;
                catch (Throwable throwable) {
                    break block7;
                }
                catch (Exception exception) {
                    string3 = var4_5;
                }
            }
            string2 = string3;
            {
                void var3_10;
                f.f().l("Error serializing user metadata.", (Throwable)var3_10);
            }
            i.f((Closeable)string3, "Failed to close user metadata file.");
            return;
        }
        i.f((Closeable)string2, "Failed to close user metadata file.");
        throw string3;
    }

}


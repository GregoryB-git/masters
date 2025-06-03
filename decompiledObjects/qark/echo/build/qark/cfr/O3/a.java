/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileWriter
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package O3;

import E3.f;
import H3.i;
import M3.g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;

public class a {
    public final File a;

    public a(g g8) {
        this.a = g8.e("com.crashlytics.settings.json");
    }

    public final File a() {
        return this.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public JSONObject b() {
        void var2_5;
        File file;
        block10 : {
            File file2;
            block11 : {
                block9 : {
                    block8 : {
                        f.f().b("Checking for cached settings...");
                        file = null;
                        file2 = this.a();
                        if (!file2.exists()) break block8;
                        file = file2 = new FileInputStream(file2);
                        JSONObject jSONObject = new JSONObject(i.B((InputStream)file2));
                        file = file2;
                        file2 = jSONObject;
                        break block9;
                    }
                    try {
                        f.f().i("Settings file does not exist.");
                        file2 = null;
                    }
                    catch (Throwable throwable) {
                        file = null;
                        break block10;
                    }
                    catch (Exception exception) {
                        file2 = null;
                        break block11;
                    }
                }
                i.f((Closeable)file, "Error while closing settings cache file.");
                return file2;
                catch (Throwable throwable) {
                    break block10;
                }
                catch (Exception exception) {}
            }
            file = file2;
            {
                void var3_9;
                f.f().e("Failed to fetch cached settings", (Throwable)var3_9);
            }
            i.f((Closeable)file2, "Error while closing settings cache file.");
            return null;
        }
        i.f((Closeable)file, "Error while closing settings cache file.");
        throw var2_5;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void c(long l8, JSONObject jSONObject) {
        JSONObject jSONObject2;
        void var3_5;
        block7 : {
            JSONObject jSONObject3;
            block8 : {
                f.f().i("Writing settings to cache file...");
                if (jSONObject == null) return;
                Object var6_6 = null;
                jSONObject2 = jSONObject3 = null;
                jSONObject.put("expires_at", l8);
                jSONObject2 = jSONObject3;
                jSONObject3 = new FileWriter(this.a());
                try {
                    jSONObject3.write(jSONObject.toString());
                    jSONObject3.flush();
                }
                catch (Throwable throwable) {
                    jSONObject2 = jSONObject3;
                    break block7;
                }
                catch (Exception exception) {
                    jSONObject = jSONObject3;
                    jSONObject3 = exception;
                    break block8;
                }
                i.f((Closeable)jSONObject3, "Failed to close settings writer.");
                return;
                catch (Throwable throwable) {
                    break block7;
                }
                catch (Exception exception) {
                    jSONObject = var6_6;
                }
            }
            jSONObject2 = jSONObject;
            {
                f.f().e("Failed to cache settings", (Throwable)jSONObject3);
            }
            i.f((Closeable)jSONObject, "Failed to close settings writer.");
            return;
        }
        i.f((Closeable)jSONObject2, "Failed to close settings writer.");
        throw var3_5;
    }
}


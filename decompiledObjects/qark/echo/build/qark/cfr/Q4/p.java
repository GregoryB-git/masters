/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.HashMap
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Q4;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class p {
    public static final Map c = new HashMap();
    public final Context a;
    public final String b;

    public p(Context context, String string2) {
        this.a = context;
        this.b = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static p c(Context object, String string2) {
        synchronized (p.class) {
            try {
                Map map = c;
                if (map.containsKey((Object)string2)) return (p)map.get((Object)string2);
                map.put((Object)string2, (Object)new p((Context)object, string2));
                return (p)map.get((Object)string2);
            }
            catch (Throwable throwable) {}
            throw throwable;
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

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public b d() {
        FileInputStream fileInputStream;
        block11 : {
            void var3_8;
            block10 : {
                // MONITORENTER : this
                fileInputStream = this.a.openFileInput(this.b);
                int n8 = fileInputStream.available();
                Object object = new byte[n8];
                fileInputStream.read((byte[])object, 0, n8);
                object = b.b(new JSONObject(new String((byte[])object, "UTF-8")));
                fileInputStream.close();
                // MONITOREXIT : this
                return object;
                catch (Throwable throwable3) {
                    break block10;
                }
                catch (Throwable throwable4) {
                    fileInputStream = null;
                }
            }
            if (fileInputStream == null) throw var3_8;
            fileInputStream.close();
            throw var3_8;
            catch (FileNotFoundException | JSONException jSONException) {}
            fileInputStream = null;
            break block11;
            catch (FileNotFoundException | JSONException jSONException) {}
        }
        if (fileInputStream != null) {
            fileInputStream.close();
            return null;
        }
        // MONITOREXIT : this
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Void e(b b8) {
        synchronized (this) {
            Throwable throwable2;
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = this.a.openFileOutput(this.b, 0);
            }
            catch (Throwable throwable2) {}
            try {
                fileOutputStream.write(b8.toString().getBytes("UTF-8"));
            }
            catch (Throwable throwable3) {
                fileOutputStream.close();
                throw throwable3;
            }
            fileOutputStream.close();
            return null;
            throw throwable2;
        }
    }
}


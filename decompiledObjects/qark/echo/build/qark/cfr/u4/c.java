/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package u4;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import s3.e;
import u4.d;

public class c {
    public File a;
    public final e b;

    public c(e e8) {
        this.b = e8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final File a() {
        if (this.a != null) return this.a;
        synchronized (this) {
            try {
                if (this.a != null) return this.a;
                File file = this.b.m().getFilesDir();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PersistedInstallation.");
                stringBuilder.append(this.b.s());
                stringBuilder.append(".json");
                this.a = new File(file, stringBuilder.toString());
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public d b(d d8) {
        block3 : {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", (Object)d8.d());
            jSONObject.put("Status", d8.g().ordinal());
            jSONObject.put("AuthToken", (Object)d8.b());
            jSONObject.put("RefreshToken", (Object)d8.f());
            jSONObject.put("TokenCreationEpochInSecs", d8.h());
            jSONObject.put("ExpiresInSecs", d8.c());
            jSONObject.put("FisError", (Object)d8.e());
            File file = File.createTempFile((String)"PersistedInstallation", (String)"tmp", (File)this.b.m().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!file.renameTo(this.a())) break block3;
            return d8;
        }
        try {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        catch (IOException | JSONException iOException) {
            return d8;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final JSONObject c() {
        int n8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[16384];
        FileInputStream fileInputStream = new FileInputStream(this.a());
        do {
            n8 = fileInputStream.read(arrby, 0, 16384);
            if (n8 >= 0) break block10;
            byteArrayOutputStream = new JSONObject(byteArrayOutputStream.toString());
            break;
        } while (true);
        catch (Throwable throwable) {}
        {
            block10 : {
                fileInputStream.close();
                return byteArrayOutputStream;
            }
            byteArrayOutputStream.write(arrby, 0, n8);
            continue;
        }
        try {
            fileInputStream.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            try {
                throwable.addSuppressed(throwable);
                throw throwable;
            }
            catch (IOException | JSONException jSONException) {
                return new JSONObject();
            }
        }
    }

    public d d() {
        Object object = this.c();
        String string2 = object.optString("Fid", null);
        int n8 = object.optInt("Status", a.o.ordinal());
        String string3 = object.optString("AuthToken", null);
        String string4 = object.optString("RefreshToken", null);
        long l8 = object.optLong("TokenCreationEpochInSecs", 0L);
        long l9 = object.optLong("ExpiresInSecs", 0L);
        object = object.optString("FisError", null);
        return d.a().d(string2).g(a.values()[n8]).b(string3).f(string4).h(l8).c(l9).e((String)object).a();
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* enum */ a s;
        public static final /* synthetic */ a[] t;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            o = a9 = new a();
            p = a10 = new a();
            q = a12 = new a();
            r = a11 = new a();
            s = a8 = new a();
            t = new a[]{a9, a10, a12, a11, a8};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])t.clone();
        }
    }

}


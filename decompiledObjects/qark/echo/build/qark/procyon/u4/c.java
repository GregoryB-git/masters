// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u4;

import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import java.io.IOException;
import java.io.FileOutputStream;
import org.json.JSONObject;
import s3.e;
import java.io.File;

public class c
{
    public File a;
    public final e b;
    
    public c(final e b) {
        this.b = b;
    }
    
    public final File a() {
        while (true) {
            if (this.a == null) {
                // monitorenter(this)
                while (true) {
                    try {
                        if (this.a == null) {
                            final File filesDir = this.b.m().getFilesDir();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("PersistedInstallation.");
                            sb.append(this.b.s());
                            sb.append(".json");
                            this.a = new File(filesDir, sb.toString());
                        }
                        // monitorexit(this)
                        return this.a;
                    }
                    // monitorexit(this)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public d b(final d d) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("Fid", (Object)d.d());
            jsonObject.put("Status", d.g().ordinal());
            jsonObject.put("AuthToken", (Object)d.b());
            jsonObject.put("RefreshToken", (Object)d.f());
            jsonObject.put("TokenCreationEpochInSecs", d.h());
            jsonObject.put("ExpiresInSecs", d.c());
            jsonObject.put("FisError", (Object)d.e());
            final File tempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.m().getFilesDir());
            final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            fileOutputStream.write(jsonObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (tempFile.renameTo(this.a())) {
                return d;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        catch (JSONException | IOException ex) {
            return d;
        }
    }
    
    public final JSONObject c() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[16384];
        try {
            final FileInputStream fileInputStream = new FileInputStream(this.a());
            while (true) {
                Label_0064: {
                    try {
                        final int read = fileInputStream.read(array, 0, 16384);
                        if (read < 0) {
                            final JSONObject jsonObject = new JSONObject(byteArrayOutputStream.toString());
                            fileInputStream.close();
                            return jsonObject;
                        }
                        break Label_0064;
                    }
                    finally {
                        try {
                            fileInputStream.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable exception;
                            t.addSuppressed(exception);
                        }
                        final int read;
                        byteArrayOutputStream.write(array, 0, read);
                        continue;
                    }
                }
                break;
            }
            return new JSONObject();
        }
        catch (IOException | JSONException ex) {
            return new JSONObject();
        }
    }
    
    public d d() {
        final JSONObject c = this.c();
        return d.a().d(c.optString("Fid", (String)null)).g(u4.c.a.values()[c.optInt("Status", u4.c.a.o.ordinal())]).b(c.optString("AuthToken", (String)null)).f(c.optString("RefreshToken", (String)null)).h(c.optLong("TokenCreationEpochInSecs", 0L)).c(c.optLong("ExpiresInSecs", 0L)).e(c.optString("FisError", (String)null)).a();
    }
    
    public enum a
    {
        o("ATTEMPT_MIGRATION", 0), 
        p("NOT_GENERATED", 1), 
        q("UNREGISTERED", 2), 
        r("REGISTERED", 3), 
        s("REGISTER_ERROR", 4);
        
        public a(final String name, final int ordinal) {
        }
    }
}

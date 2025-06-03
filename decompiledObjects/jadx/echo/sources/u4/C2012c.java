package u4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import s3.C1947e;

/* renamed from: u4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2012c {

    /* renamed from: a, reason: collision with root package name */
    public File f19785a;

    /* renamed from: b, reason: collision with root package name */
    public final C1947e f19786b;

    /* renamed from: u4.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C2012c(C1947e c1947e) {
        this.f19786b = c1947e;
    }

    public final File a() {
        if (this.f19785a == null) {
            synchronized (this) {
                try {
                    if (this.f19785a == null) {
                        this.f19785a = new File(this.f19786b.m().getFilesDir(), "PersistedInstallation." + this.f19786b.s() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f19785a;
    }

    public d b(d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f19786b.m().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(a())) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public final JSONObject c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public d d() {
        JSONObject c7 = c();
        String optString = c7.optString("Fid", null);
        int optInt = c7.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c7.optString("AuthToken", null);
        String optString3 = c7.optString("RefreshToken", null);
        long optLong = c7.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = c7.optLong("ExpiresInSecs", 0L);
        return d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(c7.optString("FisError", null)).a();
    }
}

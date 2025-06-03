package w9;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import q0.g;
import u7.f;
import w9.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public File f16466a;

    /* renamed from: b, reason: collision with root package name */
    public final f f16467b;

    public c(f fVar) {
        this.f16467b = fVar;
    }

    public final File a() {
        if (this.f16466a == null) {
            synchronized (this) {
                if (this.f16466a == null) {
                    f fVar = this.f16467b;
                    fVar.a();
                    this.f16466a = new File(fVar.f15084a.getFilesDir(), "PersistedInstallation." + this.f16467b.g() + ".json");
                }
            }
        }
        return this.f16466a;
    }

    public final void b(a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f16451b);
            jSONObject.put("Status", g.c(aVar.f16452c));
            jSONObject.put("AuthToken", aVar.f16453d);
            jSONObject.put("RefreshToken", aVar.f16454e);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f16455g);
            jSONObject.put("ExpiresInSecs", aVar.f);
            jSONObject.put("FisError", aVar.f16456h);
            f fVar = this.f16467b;
            fVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f15084a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final a c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
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
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = d.f16468a;
        a.C0255a c0255a = new a.C0255a();
        c0255a.f = 0L;
        c0255a.b(1);
        c0255a.f16461e = 0L;
        c0255a.f16457a = optString;
        c0255a.b(g.d(5)[optInt]);
        c0255a.f16459c = optString2;
        c0255a.f16460d = optString3;
        c0255a.f = Long.valueOf(optLong);
        c0255a.f16461e = Long.valueOf(optLong2);
        c0255a.f16462g = optString4;
        return c0255a.a();
    }
}

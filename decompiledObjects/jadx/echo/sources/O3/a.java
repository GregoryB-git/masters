package O3;

import H3.AbstractC0387i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f3972a;

    public a(M3.g gVar) {
        this.f3972a = gVar.e("com.crashlytics.settings.json");
    }

    public final File a() {
        return this.f3972a;
    }

    public JSONObject b() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        E3.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File a7 = a();
                if (a7.exists()) {
                    fileInputStream = new FileInputStream(a7);
                    try {
                        jSONObject = new JSONObject(AbstractC0387i.B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        E3.f.f().e("Failed to fetch cached settings", e);
                        AbstractC0387i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    E3.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC0387i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e8) {
                e = e8;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC0387i.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            AbstractC0387i.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j7, JSONObject jSONObject) {
        E3.f.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j7);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    AbstractC0387i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e7) {
                    e = e7;
                    fileWriter = fileWriter2;
                    E3.f.f().e("Failed to cache settings", e);
                    AbstractC0387i.f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    AbstractC0387i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

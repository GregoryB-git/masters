package Q4;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Map f4467c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4468a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4469b;

    public p(Context context, String str) {
        this.f4468a = context;
        this.f4469b = str;
    }

    public static synchronized p c(Context context, String str) {
        p pVar;
        synchronized (p.class) {
            try {
                Map map = f4467c;
                if (!map.containsKey(str)) {
                    map.put(str, new p(context, str));
                }
                pVar = (p) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public synchronized Void a() {
        this.f4468a.deleteFile(this.f4469b);
        return null;
    }

    public String b() {
        return this.f4469b;
    }

    public synchronized com.google.firebase.remoteconfig.internal.b d() {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f4468a.openFileInput(this.f4469b);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                com.google.firebase.remoteconfig.internal.b b7 = com.google.firebase.remoteconfig.internal.b.b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStream.close();
                return b7;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
        }
    }

    public synchronized Void e(com.google.firebase.remoteconfig.internal.b bVar) {
        FileOutputStream openFileOutput = this.f4468a.openFileOutput(this.f4469b, 0);
        try {
            openFileOutput.write(bVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}

package u4;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import s3.C1947e;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2011b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f19782c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f19783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19784b;

    public C2011b(C1947e c1947e) {
        this.f19783a = c1947e.m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f19784b = b(c1947e);
    }

    public static String b(C1947e c1947e) {
        String f7 = c1947e.r().f();
        if (f7 != null) {
            return f7;
        }
        String c7 = c1947e.r().c();
        if (!c7.startsWith("1:") && !c7.startsWith("2:")) {
            return c7;
        }
        String[] split = c7.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e7) {
            Log.w("ContentValues", "Invalid key stored " + e7);
            return null;
        }
    }

    public String f() {
        synchronized (this.f19783a) {
            try {
                String g7 = g();
                if (g7 != null) {
                    return g7;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String g() {
        String string;
        synchronized (this.f19783a) {
            string = this.f19783a.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f19783a) {
            try {
                String string = this.f19783a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey e7 = e(string);
                if (e7 == null) {
                    return null;
                }
                return c(e7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f19783a) {
            try {
                for (String str : f19782c) {
                    String string = this.f19783a.getString(a(this.f19784b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

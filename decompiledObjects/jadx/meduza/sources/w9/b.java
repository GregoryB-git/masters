package w9;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f16463c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16464a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16465b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r0.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(u7.f r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.f15084a
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            r3.f16464a = r0
            r4.a()
            u7.j r0 = r4.f15086c
            java.lang.String r0 = r0.f15100e
            if (r0 == 0) goto L1b
            goto L4a
        L1b:
            r4.a()
            u7.j r4 = r4.f15086c
            java.lang.String r0 = r4.f15097b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            goto L4a
        L33:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L40
        L3e:
            r0 = r2
            goto L4a
        L40:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4a
            goto L3e
        L4a:
            r3.f16465b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.b.<init>(u7.f):void");
    }

    public final String a() {
        PublicKey publicKey;
        synchronized (this.f16464a) {
            String str = null;
            String string = this.f16464a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}

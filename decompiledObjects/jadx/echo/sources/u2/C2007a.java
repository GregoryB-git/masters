package u2;

import A2.AbstractC0328n;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2007a {

    /* renamed from: c, reason: collision with root package name */
    public static final Lock f19761c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static C2007a f19762d;

    /* renamed from: a, reason: collision with root package name */
    public final Lock f19763a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f19764b;

    public C2007a(Context context) {
        this.f19764b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C2007a a(Context context) {
        AbstractC0328n.i(context);
        Lock lock = f19761c;
        lock.lock();
        try {
            if (f19762d == null) {
                f19762d = new C2007a(context.getApplicationContext());
            }
            C2007a c2007a = f19762d;
            lock.unlock();
            return c2007a;
        } catch (Throwable th) {
            f19761c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String c7;
        String c8 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c8) || (c7 = c(d("googleSignInAccount", c8))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.V(c7);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.f19763a.lock();
        try {
            return this.f19764b.getString(str, null);
        } finally {
            this.f19763a.unlock();
        }
    }
}

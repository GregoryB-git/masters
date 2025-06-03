/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.locks.Lock
 *  java.util.concurrent.locks.ReentrantLock
 *  org.json.JSONException
 */
package u2;

import A2.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a {
    public static final Lock c = new ReentrantLock();
    public static a d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public a(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(Context object) {
        n.i(object);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new a(object.getApplicationContext());
            }
            object = d;
        }
        catch (Throwable throwable) {}
        lock.unlock();
        return object;
        c.unlock();
        throw throwable;
    }

    public static final String d(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(":");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public GoogleSignInAccount b() {
        String string2 = this.c("defaultGoogleSignInAccount");
        boolean bl = TextUtils.isEmpty((CharSequence)string2);
        GoogleSignInAccount googleSignInAccount = null;
        if (bl) {
            return null;
        }
        if ((string2 = this.c(a.d("googleSignInAccount", string2))) == null) return googleSignInAccount;
        try {
            return GoogleSignInAccount.V(string2);
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    public final String c(String string2) {
        this.a.lock();
        try {
            string2 = this.b.getString(string2, null);
            return string2;
        }
        finally {
            this.a.unlock();
        }
    }
}


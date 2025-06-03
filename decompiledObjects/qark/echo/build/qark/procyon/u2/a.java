// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u2;

import org.json.JSONException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import A2.n;
import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;

public class a
{
    public static final Lock c;
    public static a d;
    public final Lock a;
    public final SharedPreferences b;
    
    static {
        c = new ReentrantLock();
    }
    
    public a(final Context context) {
        this.a = new ReentrantLock();
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }
    
    public static a a(final Context context) {
        n.i(context);
        final Lock c = a.c;
        c.lock();
        while (true) {
            try {
                if (a.d == null) {
                    a.d = new a(context.getApplicationContext());
                }
                final a d = a.d;
                c.unlock();
                return d;
                a.c.unlock();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final String d(final String str, final String str2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
    
    public GoogleSignInAccount b() {
        final String c = this.c("defaultGoogleSignInAccount");
        final boolean empty = TextUtils.isEmpty((CharSequence)c);
        GoogleSignInAccount v = null;
        if (empty) {
            return null;
        }
        final String c2 = this.c(d("googleSignInAccount", c));
        if (c2 == null) {
            return v;
        }
        try {
            v = GoogleSignInAccount.V(c2);
            return v;
        }
        catch (JSONException ex) {
            return null;
        }
    }
    
    public final String c(String string) {
        this.a.lock();
        try {
            string = this.b.getString(string, (String)null);
            return string;
        }
        finally {
            this.a.unlock();
        }
    }
}

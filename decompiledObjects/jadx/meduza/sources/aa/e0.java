package aa;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f283a;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f287e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f286d = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    public final String f284b = "topic_operation_queue";

    /* renamed from: c, reason: collision with root package name */
    public final String f285c = ",";

    public e0(SharedPreferences sharedPreferences, Executor executor) {
        this.f283a = sharedPreferences;
        this.f287e = executor;
    }

    public static e0 a(SharedPreferences sharedPreferences, Executor executor) {
        e0 e0Var = new e0(sharedPreferences, executor);
        synchronized (e0Var.f286d) {
            e0Var.f286d.clear();
            String string = e0Var.f283a.getString(e0Var.f284b, "");
            if (!TextUtils.isEmpty(string) && string.contains(e0Var.f285c)) {
                String[] split = string.split(e0Var.f285c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        e0Var.f286d.add(str);
                    }
                }
            }
        }
        return e0Var;
    }
}

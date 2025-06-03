package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;

/* loaded from: classes.dex */
public final class y {
    public static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static void b(Context context, o oVar, boolean z10) {
        Task forException;
        int i10;
        boolean z11 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences a10 = a(context);
            if (a10.contains("proxy_retention") && a10.getBoolean("proxy_retention", false) == z10) {
                z11 = true;
            }
            if (z11) {
                return;
            }
            i6.c cVar = oVar.f344c;
            if (cVar.f7576c.a() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z10);
                i6.z a11 = i6.z.a(cVar.f7575b);
                synchronized (a11) {
                    i10 = a11.f7625d;
                    a11.f7625d = i10 + 1;
                }
                forException = a11.b(new i6.w(i10, 4, bundle));
            } else {
                forException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            forException.addOnSuccessListener(new m.a(7), new w3.t(context, z10));
        }
    }
}

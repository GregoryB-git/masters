package e6;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import k6.a;
import k6.d;

/* loaded from: classes.dex */
public abstract class a extends d<a.d.c> {
    private static final a.g zza;
    private static final a.AbstractC0130a zzb;
    private static final k6.a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        b bVar = new b();
        zzb = bVar;
        zzc = new k6.a("SmsRetriever.API", bVar, gVar);
    }

    public a(Activity activity) {
        super(activity, (k6.a<a.d.c>) zzc, a.d.f9096j, d.a.f9097c);
    }

    public a(Context context) {
        super(context, (k6.a<a.d.c>) zzc, a.d.f9096j, d.a.f9097c);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(String str);
}

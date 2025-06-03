package R2;

import A2.AbstractC0328n;
import android.content.Context;
import android.os.Bundle;

/* renamed from: R2.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633x3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5599a;

    /* renamed from: b, reason: collision with root package name */
    public String f5600b;

    /* renamed from: c, reason: collision with root package name */
    public String f5601c;

    /* renamed from: d, reason: collision with root package name */
    public String f5602d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f5603e;

    /* renamed from: f, reason: collision with root package name */
    public long f5604f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.H0 f5605g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5606h;

    /* renamed from: i, reason: collision with root package name */
    public Long f5607i;

    /* renamed from: j, reason: collision with root package name */
    public String f5608j;

    public C0633x3(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l7) {
        this.f5606h = true;
        AbstractC0328n.i(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC0328n.i(applicationContext);
        this.f5599a = applicationContext;
        this.f5607i = l7;
        if (h02 != null) {
            this.f5605g = h02;
            this.f5600b = h02.f10395t;
            this.f5601c = h02.f10394s;
            this.f5602d = h02.f10393r;
            this.f5606h = h02.f10392q;
            this.f5604f = h02.f10391p;
            this.f5608j = h02.f10397v;
            Bundle bundle = h02.f10396u;
            if (bundle != null) {
                this.f5603e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

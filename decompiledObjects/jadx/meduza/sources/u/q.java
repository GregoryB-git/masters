package u;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import io.meduza.meduza.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q {
    public boolean A;
    public Notification B;

    @Deprecated
    public ArrayList<String> C;

    /* renamed from: a, reason: collision with root package name */
    public Context f14821a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f14825e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f14826g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f14827h;

    /* renamed from: i, reason: collision with root package name */
    public int f14828i;

    /* renamed from: j, reason: collision with root package name */
    public int f14829j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14831l;

    /* renamed from: m, reason: collision with root package name */
    public s f14832m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f14833n;

    /* renamed from: o, reason: collision with root package name */
    public int f14834o;

    /* renamed from: p, reason: collision with root package name */
    public int f14835p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14836q;

    /* renamed from: r, reason: collision with root package name */
    public String f14837r;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14839u;

    /* renamed from: v, reason: collision with root package name */
    public Bundle f14840v;

    /* renamed from: y, reason: collision with root package name */
    public String f14843y;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<n> f14822b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<x> f14823c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<n> f14824d = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public boolean f14830k = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14838s = false;

    /* renamed from: w, reason: collision with root package name */
    public int f14841w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f14842x = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f14844z = 0;

    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
            return builder.setContentType(i10);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
            return builder.setLegacyStreamType(i10);
        }

        public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
            return builder.setUsage(i10);
        }
    }

    public q(Context context, String str) {
        Notification notification = new Notification();
        this.B = notification;
        this.f14821a = context;
        this.f14843y = str;
        notification.when = System.currentTimeMillis();
        this.B.audioStreamType = -1;
        this.f14829j = 0;
        this.C = new ArrayList<>();
        this.A = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        t tVar = new t(this);
        s sVar = tVar.f14848c.f14832m;
        if (sVar != null) {
            sVar.b(tVar);
        }
        if (sVar != null) {
            sVar.e();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && i10 < 24) {
            tVar.f14847b.setExtras(tVar.f14849d);
        }
        Notification build = tVar.f14847b.build();
        tVar.f14848c.getClass();
        if (sVar != null) {
            sVar.d();
        }
        if (sVar != null) {
            tVar.f14848c.f14832m.getClass();
        }
        if (sVar != null && (bundle = build.extras) != null) {
            sVar.a(bundle);
        }
        return build;
    }

    public final void c(CharSequence charSequence) {
        this.f = b(charSequence);
    }

    public final void d(int i10, boolean z10) {
        Notification notification;
        int i11;
        if (z10) {
            notification = this.B;
            i11 = i10 | notification.flags;
        } else {
            notification = this.B;
            i11 = (~i10) & notification.flags;
        }
        notification.flags = i11;
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            Context context = this.f14821a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f941k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f943b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f14827h = iconCompat;
    }

    public final void f(int i10, int i11) {
        this.f14834o = i10;
        this.f14835p = i11;
        this.f14836q = false;
    }

    public final void g(s sVar) {
        if (this.f14832m != sVar) {
            this.f14832m = sVar;
            if (sVar != null) {
                sVar.f(this);
            }
        }
    }
}

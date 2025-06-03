package p2;

import android.content.Context;

/* loaded from: classes.dex */
public final class s extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f12954c;

    public s(Context context, int i10, int i11) {
        super(i10, i11);
        this.f12954c = context;
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        if (this.f13194b >= 10) {
            cVar.f("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f12954c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}

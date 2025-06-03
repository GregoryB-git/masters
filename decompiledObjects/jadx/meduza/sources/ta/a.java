package ta;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f14676a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14677b;

    /* renamed from: c, reason: collision with root package name */
    public String f14678c;

    /* renamed from: d, reason: collision with root package name */
    public String f14679d;

    /* renamed from: e, reason: collision with root package name */
    public String f14680e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public String f14681g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14682h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14683i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14684j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14685k;

    /* renamed from: l, reason: collision with root package name */
    public int f14686l;

    /* renamed from: m, reason: collision with root package name */
    public int f14687m;

    /* renamed from: n, reason: collision with root package name */
    public String f14688n;

    /* renamed from: o, reason: collision with root package name */
    public String f14689o;

    public a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f14676a = sharedPreferences;
        this.f14677b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.f14678c = this.f14676a.getString("androidNotificationChannelId", null);
        this.f14679d = this.f14676a.getString("androidNotificationChannelName", null);
        this.f14680e = this.f14676a.getString("androidNotificationChannelDescription", null);
        this.f = this.f14676a.getInt("notificationColor", -1);
        this.f14681g = this.f14676a.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.f14682h = this.f14676a.getBoolean("androidShowNotificationBadge", false);
        this.f14683i = this.f14676a.getBoolean("androidNotificationClickStartsActivity", true);
        this.f14684j = this.f14676a.getBoolean("androidNotificationOngoing", false);
        this.f14685k = this.f14676a.getBoolean("androidStopForegroundOnPause", true);
        this.f14686l = this.f14676a.getInt("artDownscaleWidth", -1);
        this.f14687m = this.f14676a.getInt("artDownscaleHeight", -1);
        this.f14688n = this.f14676a.getString("activityClassName", null);
        this.f14689o = this.f14676a.getString("androidBrowsableRootExtras", null);
    }

    public final void a() {
        this.f14676a.edit().putBoolean("androidResumeOnClick", this.f14677b).putString("androidNotificationChannelId", this.f14678c).putString("androidNotificationChannelName", this.f14679d).putString("androidNotificationChannelDescription", this.f14680e).putInt("notificationColor", this.f).putString("androidNotificationIcon", this.f14681g).putBoolean("androidShowNotificationBadge", this.f14682h).putBoolean("androidNotificationClickStartsActivity", this.f14683i).putBoolean("androidNotificationOngoing", this.f14684j).putBoolean("androidStopForegroundOnPause", this.f14685k).putInt("artDownscaleWidth", this.f14686l).putInt("artDownscaleHeight", this.f14687m).putString("activityClassName", this.f14688n).putString("androidBrowsableRootExtras", this.f14689o).apply();
    }
}

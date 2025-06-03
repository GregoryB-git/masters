package l5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: l5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1620h {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f17259a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17260b;

    /* renamed from: c, reason: collision with root package name */
    public String f17261c;

    /* renamed from: d, reason: collision with root package name */
    public String f17262d;

    /* renamed from: e, reason: collision with root package name */
    public String f17263e;

    /* renamed from: f, reason: collision with root package name */
    public int f17264f;

    /* renamed from: g, reason: collision with root package name */
    public String f17265g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17266h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17267i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17268j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17269k;

    /* renamed from: l, reason: collision with root package name */
    public int f17270l;

    /* renamed from: m, reason: collision with root package name */
    public int f17271m;

    /* renamed from: n, reason: collision with root package name */
    public String f17272n;

    /* renamed from: o, reason: collision with root package name */
    public String f17273o;

    public C1620h(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f17259a = sharedPreferences;
        this.f17260b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.f17261c = this.f17259a.getString("androidNotificationChannelId", null);
        this.f17262d = this.f17259a.getString("androidNotificationChannelName", null);
        this.f17263e = this.f17259a.getString("androidNotificationChannelDescription", null);
        this.f17264f = this.f17259a.getInt("notificationColor", -1);
        this.f17265g = this.f17259a.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.f17266h = this.f17259a.getBoolean("androidShowNotificationBadge", false);
        this.f17267i = this.f17259a.getBoolean("androidNotificationClickStartsActivity", true);
        this.f17268j = this.f17259a.getBoolean("androidNotificationOngoing", false);
        this.f17269k = this.f17259a.getBoolean("androidStopForegroundOnPause", true);
        this.f17270l = this.f17259a.getInt("artDownscaleWidth", -1);
        this.f17271m = this.f17259a.getInt("artDownscaleHeight", -1);
        this.f17272n = this.f17259a.getString("activityClassName", null);
        this.f17273o = this.f17259a.getString("androidBrowsableRootExtras", null);
    }

    public Bundle a() {
        if (this.f17273o == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f17273o);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    try {
                        try {
                            try {
                                bundle.putInt(next, jSONObject.getInt(next));
                            } catch (Exception unused) {
                                bundle.putDouble(next, jSONObject.getDouble(next));
                            }
                        } catch (Exception unused2) {
                            System.out.println("Unsupported extras value for key " + next);
                        }
                    } catch (Exception unused3) {
                        bundle.putBoolean(next, jSONObject.getBoolean(next));
                    }
                } catch (Exception unused4) {
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
            return bundle;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public void b() {
        this.f17259a.edit().putBoolean("androidResumeOnClick", this.f17260b).putString("androidNotificationChannelId", this.f17261c).putString("androidNotificationChannelName", this.f17262d).putString("androidNotificationChannelDescription", this.f17263e).putInt("notificationColor", this.f17264f).putString("androidNotificationIcon", this.f17265g).putBoolean("androidShowNotificationBadge", this.f17266h).putBoolean("androidNotificationClickStartsActivity", this.f17267i).putBoolean("androidNotificationOngoing", this.f17268j).putBoolean("androidStopForegroundOnPause", this.f17269k).putInt("artDownscaleWidth", this.f17270l).putInt("artDownscaleHeight", this.f17271m).putString("activityClassName", this.f17272n).putString("androidBrowsableRootExtras", this.f17273o).apply();
    }

    public void c(Map map) {
        this.f17273o = map != null ? new JSONObject(map).toString() : null;
    }
}

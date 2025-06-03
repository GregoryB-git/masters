package t3;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import w3.InterfaceC2100a;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1990b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f19578g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final DateFormat f19579h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f19580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19582c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f19583d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19584e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19585f;

    public C1990b(String str, String str2, String str3, Date date, long j7, long j8) {
        this.f19580a = str;
        this.f19581b = str2;
        this.f19582c = str3;
        this.f19583d = date;
        this.f19584e = j7;
        this.f19585f = j8;
    }

    public static C1990b a(InterfaceC2100a.c cVar) {
        String str = cVar.f20381d;
        if (str == null) {
            str = "";
        }
        return new C1990b(cVar.f20379b, String.valueOf(cVar.f20380c), str, new Date(cVar.f20390m), cVar.f20382e, cVar.f20387j);
    }

    public static C1990b b(Map map) {
        g(map);
        try {
            return new C1990b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f19579h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e7) {
            throw new C1989a("Could not process experiment: one of the durations could not be converted into a long.", e7);
        } catch (ParseException e8) {
            throw new C1989a("Could not process experiment: parsing experiment start time failed.", e8);
        }
    }

    public static void g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f19578g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C1989a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public String c() {
        return this.f19580a;
    }

    public long d() {
        return this.f19583d.getTime();
    }

    public String e() {
        return this.f19581b;
    }

    public InterfaceC2100a.c f(String str) {
        InterfaceC2100a.c cVar = new InterfaceC2100a.c();
        cVar.f20378a = str;
        cVar.f20390m = d();
        cVar.f20379b = this.f19580a;
        cVar.f20380c = this.f19581b;
        cVar.f20381d = TextUtils.isEmpty(this.f19582c) ? null : this.f19582c;
        cVar.f20382e = this.f19584e;
        cVar.f20387j = this.f19585f;
        return cVar;
    }
}

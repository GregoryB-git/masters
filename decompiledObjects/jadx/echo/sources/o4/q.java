package o4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f18193a;

    public q(Context context, String str) {
        this.f18193a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j7 = this.f18193a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f18193a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f18193a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f18193a.edit().putStringSet(str, hashSet).putLong("fire-count", j7 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f18193a.edit();
            int i7 = 0;
            for (Map.Entry<String, ?> entry : this.f18193a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d7 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d7)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d7);
                        i7++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i7 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i7);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f18193a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(r.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j7) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j7));
        }
        instant = new Date(j7).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f18193a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized boolean f(long j7, long j8) {
        return d(j7).equals(d(j8));
    }

    public synchronized void g() {
        String d7 = d(System.currentTimeMillis());
        this.f18193a.edit().putString("last-used-date", d7).commit();
        h(d7);
    }

    public final synchronized void h(String str) {
        try {
            String e7 = e(str);
            if (e7 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f18193a.getStringSet(e7, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f18193a.edit().remove(e7) : this.f18193a.edit().putStringSet(e7, hashSet)).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean i(long j7) {
        return j("fire-global", j7);
    }

    public synchronized boolean j(String str, long j7) {
        if (!this.f18193a.contains(str)) {
            this.f18193a.edit().putLong(str, j7).commit();
            return true;
        }
        if (f(this.f18193a.getLong(str, -1L), j7)) {
            return false;
        }
        this.f18193a.edit().putLong(str, j7).commit();
        return true;
    }

    public synchronized void k(long j7, String str) {
        String d7 = d(j7);
        if (this.f18193a.getString("last-used-date", "").equals(d7)) {
            String e7 = e(d7);
            if (e7 == null) {
                return;
            }
            if (e7.equals(str)) {
                return;
            }
            m(str, d7);
            return;
        }
        long j8 = this.f18193a.getLong("fire-count", 0L);
        if (j8 + 1 == 30) {
            a();
            j8 = this.f18193a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f18193a.getStringSet(str, new HashSet()));
        hashSet.add(d7);
        this.f18193a.edit().putStringSet(str, hashSet).putLong("fire-count", j8 + 1).putString("last-used-date", d7).commit();
    }

    public synchronized void l(long j7) {
        this.f18193a.edit().putLong("fire-global", j7).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f18193a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f18193a.edit().putStringSet(str, hashSet).commit();
    }
}

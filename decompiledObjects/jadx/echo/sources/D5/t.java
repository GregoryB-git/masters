package D5;

import E5.a;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1420b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final E5.a f1421a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ConcurrentLinkedQueue f1422a = new ConcurrentLinkedQueue();

        /* renamed from: b, reason: collision with root package name */
        public b f1423b;

        /* renamed from: c, reason: collision with root package name */
        public b f1424c;

        /* renamed from: D5.t$a$a, reason: collision with other inner class name */
        public class C0019a implements a.e {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f1425a;

            public C0019a(b bVar) {
                this.f1425a = bVar;
            }

            @Override // E5.a.e
            public void a(Object obj) {
                a.this.f1422a.remove(this.f1425a);
                if (a.this.f1422a.isEmpty()) {
                    return;
                }
                AbstractC1995b.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f1425a.f1428a));
            }
        }

        public static class b {

            /* renamed from: c, reason: collision with root package name */
            public static int f1427c = Integer.MIN_VALUE;

            /* renamed from: a, reason: collision with root package name */
            public final int f1428a;

            /* renamed from: b, reason: collision with root package name */
            public final DisplayMetrics f1429b;

            public b(DisplayMetrics displayMetrics) {
                int i7 = f1427c;
                f1427c = i7 + 1;
                this.f1428a = i7;
                this.f1429b = displayMetrics;
            }
        }

        public a.e b(b bVar) {
            this.f1422a.add(bVar);
            b bVar2 = this.f1424c;
            this.f1424c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0019a(bVar2);
        }

        public b c(int i7) {
            b bVar;
            StringBuilder sb;
            String valueOf;
            if (this.f1423b == null) {
                this.f1423b = (b) this.f1422a.poll();
            }
            while (true) {
                bVar = this.f1423b;
                if (bVar == null || bVar.f1428a >= i7) {
                    break;
                }
                this.f1423b = (b) this.f1422a.poll();
            }
            if (bVar == null) {
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(i7));
                valueOf = ", after exhausting the queue.";
            } else {
                if (bVar.f1428a == i7) {
                    return bVar;
                }
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(i7));
                sb.append(", the oldest config is now: ");
                valueOf = String.valueOf(this.f1423b.f1428a);
            }
            sb.append(valueOf);
            AbstractC1995b.b("SettingsChannel", sb.toString());
            return null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final E5.a f1430a;

        /* renamed from: b, reason: collision with root package name */
        public Map f1431b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public DisplayMetrics f1432c;

        public b(E5.a aVar) {
            this.f1430a = aVar;
        }

        public void a() {
            AbstractC1995b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f1431b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f1431b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f1431b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f1432c;
            if (!t.c() || displayMetrics == null) {
                this.f1430a.c(this.f1431b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            a.e b7 = t.f1420b.b(bVar);
            this.f1431b.put("configurationId", Integer.valueOf(bVar.f1428a));
            this.f1430a.d(this.f1431b, b7);
        }

        public b b(boolean z7) {
            this.f1431b.put("brieflyShowPassword", Boolean.valueOf(z7));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.f1432c = displayMetrics;
            return this;
        }

        public b d(boolean z7) {
            this.f1431b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z7));
            return this;
        }

        public b e(c cVar) {
            this.f1431b.put("platformBrightness", cVar.f1436o);
            return this;
        }

        public b f(float f7) {
            this.f1431b.put("textScaleFactor", Float.valueOf(f7));
            return this;
        }

        public b g(boolean z7) {
            this.f1431b.put("alwaysUse24HourFormat", Boolean.valueOf(z7));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");


        /* renamed from: o, reason: collision with root package name */
        public String f1436o;

        c(String str) {
            this.f1436o = str;
        }
    }

    public t(C2105a c2105a) {
        this.f1421a = new E5.a(c2105a, "flutter/settings", E5.f.f1668a);
    }

    public static DisplayMetrics b(int i7) {
        a.b c7 = f1420b.c(i7);
        if (c7 == null) {
            return null;
        }
        return c7.f1429b;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.f1421a);
    }
}

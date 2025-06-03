package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class c extends ContextWrapper {
    public static Configuration f;

    /* renamed from: a, reason: collision with root package name */
    public int f8193a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f8194b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f8195c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f8196d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f8197e;

    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super(null);
    }

    public c(Context context, int i10) {
        super(context);
        this.f8193a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f8197e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f8196d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f8196d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f8194b == null) {
            this.f8194b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8194b.setTo(theme);
            }
        }
        this.f8194b.applyStyle(this.f8193a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(j.c.f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f8197e
            if (r0 != 0) goto L36
            android.content.res.Configuration r0 = r3.f8196d
            if (r0 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = j.c.f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            j.c.f = r1
        L1c:
            android.content.res.Configuration r1 = j.c.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L30
        L25:
            android.content.res.Configuration r0 = r3.f8196d
            android.content.Context r0 = j.c.a.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L34
        L30:
            android.content.res.Resources r0 = super.getResources()
        L34:
            r3.f8197e = r0
        L36:
            android.content.res.Resources r0 = r3.f8197e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8195c == null) {
            this.f8195c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8195c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f8194b;
        if (theme != null) {
            return theme;
        }
        if (this.f8193a == 0) {
            this.f8193a = 2131951914;
        }
        b();
        return this.f8194b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f8193a != i10) {
            this.f8193a = i10;
            b();
        }
    }
}

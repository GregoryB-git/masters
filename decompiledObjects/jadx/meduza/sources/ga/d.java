package ga;

import android.util.Log;
import b.a0;
import b.z;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import ec.s;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p2.m0;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ub.h f6108a;

    /* renamed from: b, reason: collision with root package name */
    public final u9.d f6109b;

    /* renamed from: c, reason: collision with root package name */
    public final ea.b f6110c;

    /* renamed from: d, reason: collision with root package name */
    public final ga.a f6111d;

    /* renamed from: e, reason: collision with root package name */
    public final rb.g f6112e;
    public final vc.d f = a0.e();

    @wb.e(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, R.styleable.AppCompatTheme_listDividerAlertDialog, R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "updateSettings")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public Object f6113a;

        /* renamed from: b, reason: collision with root package name */
        public vc.a f6114b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f6115c;

        /* renamed from: e, reason: collision with root package name */
        public int f6117e;

        public a(ub.e<? super a> eVar) {
            super(eVar);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f6115c = obj;
            this.f6117e |= Integer.MIN_VALUE;
            return d.this.d(this);
        }
    }

    @wb.e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMinor, 128, 131, 133, 134, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class b extends wb.i implements p<JSONObject, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public s f6118a;

        /* renamed from: b, reason: collision with root package name */
        public s f6119b;

        /* renamed from: c, reason: collision with root package name */
        public int f6120c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f6121d;

        public b(ub.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            b bVar = d.this.new b(eVar);
            bVar.f6121d = obj;
            return bVar;
        }

        @Override // dc.p
        public final Object invoke(JSONObject jSONObject, ub.e<? super rb.h> eVar) {
            return ((b) create(jSONObject, eVar)).invokeSuspend(rb.h.f13851a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x01d0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
        /* JADX WARN: Type inference failed for: r13v14, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // wb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 486
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ga.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @wb.e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    public static final class c extends wb.i implements p<String, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6123a;

        public c(ub.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            c cVar = new c(eVar);
            cVar.f6123a = obj;
            return cVar;
        }

        @Override // dc.p
        public final Object invoke(String str, ub.e<? super rb.h> eVar) {
            return ((c) create(str, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            rb.f.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f6123a));
            return rb.h.f13851a;
        }
    }

    public d(ub.h hVar, u9.d dVar, ea.b bVar, f fVar, o0.i iVar) {
        this.f6108a = hVar;
        this.f6109b = dVar;
        this.f6110c = bVar;
        this.f6111d = fVar;
        this.f6112e = z.n(new ga.c(iVar));
    }

    public static String f(String str) {
        Pattern compile = Pattern.compile(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        ec.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        ec.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override // ga.j
    public final Boolean a() {
        g gVar = e().f6152b;
        if (gVar != null) {
            return gVar.f6132a;
        }
        ec.i.i("sessionConfigs");
        throw null;
    }

    @Override // ga.j
    public final mc.a b() {
        g gVar = e().f6152b;
        if (gVar == null) {
            ec.i.i("sessionConfigs");
            throw null;
        }
        Integer num = gVar.f6134c;
        if (num == null) {
            return null;
        }
        int i10 = mc.a.f11153d;
        return new mc.a(m0.c0(num.intValue(), mc.c.f11158d));
    }

    @Override // ga.j
    public final Double c() {
        g gVar = e().f6152b;
        if (gVar != null) {
            return gVar.f6133b;
        }
        ec.i.i("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #0 {all -> 0x0151, blocks: (B:26:0x0046, B:27:0x00a3, B:29:0x00af, B:33:0x00bb, B:38:0x007d, B:40:0x0087, B:43:0x0092), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087 A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #0 {all -> 0x0151, blocks: (B:26:0x0046, B:27:0x00a3, B:29:0x00af, B:33:0x00bb, B:38:0x007d, B:40:0x0087, B:43:0x0092), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[Catch: all -> 0x0151, TRY_ENTER, TryCatch #0 {all -> 0x0151, blocks: (B:26:0x0046, B:27:0x00a3, B:29:0x00af, B:33:0x00bb, B:38:0x007d, B:40:0x0087, B:43:0x0092), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // ga.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ub.e<? super rb.h> r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.d.d(ub.e):java.lang.Object");
    }

    public final i e() {
        return (i) this.f6112e.getValue();
    }
}

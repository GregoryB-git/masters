package b1;

import b1.k;

/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    public final d f1722a;

    /* renamed from: b, reason: collision with root package name */
    public final m f1723b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1724a;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1724a = iArr;
        }
    }

    public e(d dVar, m mVar) {
        ec.i.e(dVar, "defaultLifecycleObserver");
        this.f1722a = dVar;
        this.f1723b = mVar;
    }

    @Override // b1.m
    public final void a(o oVar, k.a aVar) {
        switch (a.f1724a[aVar.ordinal()]) {
            case 1:
                this.f1722a.onCreate(oVar);
                break;
            case 2:
                this.f1722a.onStart(oVar);
                break;
            case 3:
                this.f1722a.onResume(oVar);
                break;
            case 4:
                this.f1722a.onPause(oVar);
                break;
            case 5:
                this.f1722a.onStop(oVar);
                break;
            case 6:
                this.f1722a.onDestroy(oVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        m mVar = this.f1723b;
        if (mVar != null) {
            mVar.a(oVar, aVar);
        }
    }
}

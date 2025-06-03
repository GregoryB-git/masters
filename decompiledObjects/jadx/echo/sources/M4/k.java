package M4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: p, reason: collision with root package name */
    public static final k f3553p;

    /* renamed from: q, reason: collision with root package name */
    public static final k f3554q;

    /* renamed from: r, reason: collision with root package name */
    public static final k f3555r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f3556s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f3557t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ k[] f3558u;

    /* renamed from: o, reason: collision with root package name */
    public long f3559o;

    public enum a extends k {
        public a(String str, int i7, long j7) {
            super(str, i7, j7, null);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        f3553p = aVar;
        k kVar = new k("GIGABYTES", 1, 1073741824L) { // from class: M4.k.b
            {
                a aVar2 = null;
            }
        };
        f3554q = kVar;
        k kVar2 = new k("MEGABYTES", 2, 1048576L) { // from class: M4.k.c
            {
                a aVar2 = null;
            }
        };
        f3555r = kVar2;
        k kVar3 = new k("KILOBYTES", 3, 1024L) { // from class: M4.k.d
            {
                a aVar2 = null;
            }
        };
        f3556s = kVar3;
        k kVar4 = new k("BYTES", 4, 1L) { // from class: M4.k.e
            {
                a aVar2 = null;
            }
        };
        f3557t = kVar4;
        f3558u = new k[]{aVar, kVar, kVar2, kVar3, kVar4};
    }

    public k(String str, int i7, long j7) {
        this.f3559o = j7;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f3558u.clone();
    }

    public long c(long j7) {
        return (j7 * this.f3559o) / f3556s.f3559o;
    }

    public /* synthetic */ k(String str, int i7, long j7, a aVar) {
        this(str, i7, j7);
    }
}

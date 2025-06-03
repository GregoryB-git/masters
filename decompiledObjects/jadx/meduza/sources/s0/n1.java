package s0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class n1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f14055c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f14056d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f14057e;
    public static final /* synthetic */ n1[] f;

    /* renamed from: a, reason: collision with root package name */
    public final o1 f14058a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14059b;

    /* JADX INFO: Fake field, exist only in values array */
    n1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    n1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    n1 EF2;

    public enum a extends n1 {
        public a() {
            super("STRING", 8, o1.STRING, 2);
        }
    }

    public enum b extends n1 {
        public b(o1 o1Var) {
            super("GROUP", 9, o1Var, 3);
        }
    }

    public enum c extends n1 {
        public c(o1 o1Var) {
            super("MESSAGE", 10, o1Var, 2);
        }
    }

    static {
        n1 n1Var = new n1("DOUBLE", 0, o1.DOUBLE, 1);
        n1 n1Var2 = new n1("FLOAT", 1, o1.FLOAT, 5);
        o1 o1Var = o1.LONG;
        n1 n1Var3 = new n1("INT64", 2, o1Var, 0);
        n1 n1Var4 = new n1("UINT64", 3, o1Var, 0);
        o1 o1Var2 = o1.INT;
        n1 n1Var5 = new n1("INT32", 4, o1Var2, 0);
        n1 n1Var6 = new n1("FIXED64", 5, o1Var, 1);
        n1 n1Var7 = new n1("FIXED32", 6, o1Var2, 5);
        n1 n1Var8 = new n1("BOOL", 7, o1.BOOLEAN, 0);
        a aVar = new a();
        f14055c = aVar;
        o1 o1Var3 = o1.MESSAGE;
        b bVar = new b(o1Var3);
        f14056d = bVar;
        c cVar = new c(o1Var3);
        f14057e = cVar;
        f = new n1[]{n1Var, n1Var2, n1Var3, n1Var4, n1Var5, n1Var6, n1Var7, n1Var8, aVar, bVar, cVar, new n1(o1.BYTE_STRING) { // from class: s0.n1.d
        }, new n1("UINT32", 12, o1Var2, 0), new n1("ENUM", 13, o1.ENUM, 0), new n1("SFIXED32", 14, o1Var2, 5), new n1("SFIXED64", 15, o1Var, 1), new n1("SINT32", 16, o1Var2, 0), new n1("SINT64", 17, o1Var, 0)};
    }

    public /* synthetic */ n1() {
        throw null;
    }

    public n1(String str, int i10, o1 o1Var, int i11) {
        this.f14058a = o1Var;
        this.f14059b = i11;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) f.clone();
    }
}

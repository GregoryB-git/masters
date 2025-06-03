package ma;

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
public class v1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f11114c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f11115d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f11116e;
    public static final /* synthetic */ v1[] f;

    /* renamed from: a, reason: collision with root package name */
    public final w1 f11117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11118b;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    v1 EF2;

    public enum a extends v1 {
        public a() {
            super("STRING", 8, w1.STRING, 2);
        }
    }

    public enum b extends v1 {
        public b(w1 w1Var) {
            super("GROUP", 9, w1Var, 3);
        }
    }

    public enum c extends v1 {
        public c(w1 w1Var) {
            super("MESSAGE", 10, w1Var, 2);
        }
    }

    static {
        v1 v1Var = new v1("DOUBLE", 0, w1.DOUBLE, 1);
        v1 v1Var2 = new v1("FLOAT", 1, w1.FLOAT, 5);
        w1 w1Var = w1.LONG;
        v1 v1Var3 = new v1("INT64", 2, w1Var, 0);
        v1 v1Var4 = new v1("UINT64", 3, w1Var, 0);
        w1 w1Var2 = w1.INT;
        v1 v1Var5 = new v1("INT32", 4, w1Var2, 0);
        v1 v1Var6 = new v1("FIXED64", 5, w1Var, 1);
        v1 v1Var7 = new v1("FIXED32", 6, w1Var2, 5);
        v1 v1Var8 = new v1("BOOL", 7, w1.BOOLEAN, 0);
        a aVar = new a();
        f11114c = aVar;
        w1 w1Var3 = w1.MESSAGE;
        b bVar = new b(w1Var3);
        f11115d = bVar;
        c cVar = new c(w1Var3);
        f11116e = cVar;
        f = new v1[]{v1Var, v1Var2, v1Var3, v1Var4, v1Var5, v1Var6, v1Var7, v1Var8, aVar, bVar, cVar, new v1(w1.BYTE_STRING) { // from class: ma.v1.d
        }, new v1("UINT32", 12, w1Var2, 0), new v1("ENUM", 13, w1.ENUM, 0), new v1("SFIXED32", 14, w1Var2, 5), new v1("SFIXED64", 15, w1Var, 1), new v1("SINT32", 16, w1Var2, 0), new v1("SINT64", 17, w1Var, 0)};
    }

    public /* synthetic */ v1() {
        throw null;
    }

    public v1(String str, int i10, w1 w1Var, int i11) {
        this.f11117a = w1Var;
        this.f11118b = i11;
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) f.clone();
    }
}

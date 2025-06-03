package eb;

import eb.s0;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import n7.g;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final List<e1> f5069d;

    /* renamed from: e, reason: collision with root package name */
    public static final e1 f5070e;
    public static final e1 f;

    /* renamed from: g, reason: collision with root package name */
    public static final e1 f5071g;

    /* renamed from: h, reason: collision with root package name */
    public static final e1 f5072h;

    /* renamed from: i, reason: collision with root package name */
    public static final e1 f5073i;

    /* renamed from: j, reason: collision with root package name */
    public static final e1 f5074j;

    /* renamed from: k, reason: collision with root package name */
    public static final e1 f5075k;

    /* renamed from: l, reason: collision with root package name */
    public static final e1 f5076l;

    /* renamed from: m, reason: collision with root package name */
    public static final e1 f5077m;

    /* renamed from: n, reason: collision with root package name */
    public static final e1 f5078n;

    /* renamed from: o, reason: collision with root package name */
    public static final s0.f f5079o;

    /* renamed from: p, reason: collision with root package name */
    public static final s0.f f5080p;

    /* renamed from: a, reason: collision with root package name */
    public final a f5081a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5082b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f5083c;

    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: a, reason: collision with root package name */
        public final int f5098a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f5099b;

        a(int i10) {
            this.f5098a = i10;
            this.f5099b = Integer.toString(i10).getBytes(n7.d.f11282a);
        }

        public final e1 f() {
            return e1.f5069d.get(this.f5098a);
        }
    }

    public static final class b implements s0.g<e1> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // eb.s0.g
        public final byte[] a(Serializable serializable) {
            return ((e1) serializable).f5081a.f5099b;
        }

        @Override // eb.s0.g
        public final e1 b(byte[] bArr) {
            int i10;
            byte b10;
            char c10 = 0;
            if (bArr.length == 1 && bArr[0] == 48) {
                return e1.f5070e;
            }
            int length = bArr.length;
            if (length != 1) {
                if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                    i10 = 0 + ((b10 - 48) * 10);
                    c10 = 1;
                }
                e1 e1Var = e1.f5071g;
                StringBuilder l10 = defpackage.f.l("Unknown code ");
                l10.append(new String(bArr, n7.d.f11282a));
                return e1Var.g(l10.toString());
            }
            i10 = 0;
            byte b11 = bArr[c10];
            if (b11 >= 48 && b11 <= 57) {
                int i11 = (b11 - 48) + i10;
                List<e1> list = e1.f5069d;
                if (i11 < list.size()) {
                    return list.get(i11);
                }
            }
            e1 e1Var2 = e1.f5071g;
            StringBuilder l102 = defpackage.f.l("Unknown code ");
            l102.append(new String(bArr, n7.d.f11282a));
            return e1Var2.g(l102.toString());
        }
    }

    public static final class c implements s0.g<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f5100a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        @Override // eb.s0.g
        public final byte[] a(Serializable serializable) {
            byte[] bytes = ((String) serializable).getBytes(n7.d.f11284c);
            int i10 = 0;
            while (i10 < bytes.length) {
                byte b10 = bytes[i10];
                if (b10 < 32 || b10 >= 126 || b10 == 37) {
                    byte[] bArr = new byte[((bytes.length - i10) * 3) + i10];
                    if (i10 != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i10);
                    }
                    int i11 = i10;
                    while (i10 < bytes.length) {
                        byte b11 = bytes[i10];
                        if (b11 < 32 || b11 >= 126 || b11 == 37) {
                            bArr[i11] = 37;
                            byte[] bArr2 = f5100a;
                            bArr[i11 + 1] = bArr2[(b11 >> 4) & 15];
                            bArr[i11 + 2] = bArr2[b11 & 15];
                            i11 += 3;
                        } else {
                            bArr[i11] = b11;
                            i11++;
                        }
                        i10++;
                    }
                    return Arrays.copyOf(bArr, i11);
                }
                i10++;
            }
            return bytes;
        }

        @Override // eb.s0.g
        public final String b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                    ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
                    int i11 = 0;
                    while (i11 < bArr.length) {
                        if (bArr[i11] == 37 && i11 + 2 < bArr.length) {
                            try {
                                allocate.put((byte) Integer.parseInt(new String(bArr, i11 + 1, 2, n7.d.f11282a), 16));
                                i11 += 3;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        allocate.put(bArr[i11]);
                        i11++;
                    }
                    return new String(allocate.array(), 0, allocate.position(), n7.d.f11284c);
                }
            }
            return new String(bArr, 0);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (a aVar : a.values()) {
            e1 e1Var = (e1) treeMap.put(Integer.valueOf(aVar.f5098a), new e1(aVar, null, null));
            if (e1Var != null) {
                StringBuilder l10 = defpackage.f.l("Code value duplication between ");
                l10.append(e1Var.f5081a.name());
                l10.append(" & ");
                l10.append(aVar.name());
                throw new IllegalStateException(l10.toString());
            }
        }
        f5069d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f5070e = a.OK.f();
        f = a.CANCELLED.f();
        f5071g = a.UNKNOWN.f();
        a.INVALID_ARGUMENT.f();
        f5072h = a.DEADLINE_EXCEEDED.f();
        a.NOT_FOUND.f();
        a.ALREADY_EXISTS.f();
        f5073i = a.PERMISSION_DENIED.f();
        f5074j = a.UNAUTHENTICATED.f();
        f5075k = a.RESOURCE_EXHAUSTED.f();
        f5076l = a.FAILED_PRECONDITION.f();
        a.ABORTED.f();
        a.OUT_OF_RANGE.f();
        a.UNIMPLEMENTED.f();
        f5077m = a.INTERNAL.f();
        f5078n = a.UNAVAILABLE.f();
        a.DATA_LOSS.f();
        f5079o = new s0.f("grpc-status", false, new b());
        f5080p = new s0.f("grpc-message", false, new c());
    }

    public e1(a aVar, String str, Throwable th) {
        x6.b.y(aVar, "code");
        this.f5081a = aVar;
        this.f5082b = str;
        this.f5083c = th;
    }

    public static String b(e1 e1Var) {
        if (e1Var.f5082b == null) {
            return e1Var.f5081a.toString();
        }
        return e1Var.f5081a + ": " + e1Var.f5082b;
    }

    public static e1 c(int i10) {
        if (i10 >= 0) {
            List<e1> list = f5069d;
            if (i10 < list.size()) {
                return list.get(i10);
            }
        }
        return f5071g.g("Unknown code " + i10);
    }

    public static e1 d(Throwable th) {
        x6.b.y(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof f1) {
                return ((f1) th2).f5105a;
            }
            if (th2 instanceof g1) {
                return ((g1) th2).f5110a;
            }
        }
        return f5071g.f(th);
    }

    public final e1 a(String str) {
        if (str == null) {
            return this;
        }
        if (this.f5082b == null) {
            return new e1(this.f5081a, str, this.f5083c);
        }
        return new e1(this.f5081a, this.f5082b + "\n" + str, this.f5083c);
    }

    public final boolean e() {
        return a.OK == this.f5081a;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final e1 f(Throwable th) {
        return x6.b.Q(this.f5083c, th) ? this : new e1(this.f5081a, this.f5082b, th);
    }

    public final e1 g(String str) {
        return x6.b.Q(this.f5082b, str) ? this : new e1(this.f5081a, str, this.f5083c);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f5081a.name(), "code");
        b10.a(this.f5082b, "description");
        Throwable th = this.f5083c;
        Object obj = th;
        if (th != null) {
            Object obj2 = n7.u.f11319a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        b10.a(obj, "cause");
        return b10.toString();
    }
}

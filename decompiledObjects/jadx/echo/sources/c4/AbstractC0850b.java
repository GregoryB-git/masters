package c4;

import c4.InterfaceC0852d;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0850b implements InterfaceC0852d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f10134a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0852d.a f10135b;

    /* renamed from: c4.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10136a;

        static {
            int[] iArr = new int[InterfaceC0852d.a.values().length];
            f10136a = iArr;
            try {
                iArr[InterfaceC0852d.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10136a[InterfaceC0852d.a.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10136a[InterfaceC0852d.a.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10136a[InterfaceC0852d.a.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AbstractC0850b(InterfaceC0852d.a aVar, List list) {
        if (list != null) {
            this.f10134a = new HashSet(list);
        } else {
            this.f10134a = null;
        }
        this.f10135b = aVar;
    }

    @Override // c4.InterfaceC0852d
    public void a(InterfaceC0852d.a aVar, String str, String str2, long j7) {
        if (g(aVar, str)) {
            String c7 = c(aVar, str, str2, j7);
            int i7 = a.f10136a[aVar.ordinal()];
            if (i7 == 1) {
                e(str, c7);
                return;
            }
            if (i7 == 2) {
                h(str, c7);
            } else if (i7 == 3) {
                f(str, c7);
            } else {
                if (i7 != 4) {
                    throw new RuntimeException("Should not reach here!");
                }
                d(str, c7);
            }
        }
    }

    @Override // c4.InterfaceC0852d
    public InterfaceC0852d.a b() {
        return this.f10135b;
    }

    public abstract String c(InterfaceC0852d.a aVar, String str, String str2, long j7);

    public abstract void d(String str, String str2);

    public abstract void e(String str, String str2);

    public abstract void f(String str, String str2);

    public boolean g(InterfaceC0852d.a aVar, String str) {
        return aVar.ordinal() >= this.f10135b.ordinal() && (this.f10134a == null || aVar.ordinal() > InterfaceC0852d.a.DEBUG.ordinal() || this.f10134a.contains(str));
    }

    public abstract void h(String str, String str2);
}

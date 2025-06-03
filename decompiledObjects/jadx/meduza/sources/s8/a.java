package s8;

import defpackage.g;
import ib.j;
import java.io.Serializable;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14270b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f14271c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14272d;

    public a(j jVar, int i10, String str) {
        this.f14269a = 1;
        this.f14271c = jVar;
        this.f14270b = i10;
        this.f14272d = str;
    }

    public static a a(String str) {
        String str2;
        j jVar = j.HTTP_1_0;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(g.d("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(g.d("Unexpected status line: ", str));
                }
                jVar = j.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException(g.d("Unexpected status line: ", str));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException(g.d("Unexpected status line: ", str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                str2 = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException(g.d("Unexpected status line: ", str));
                }
                str2 = str.substring(i10 + 4);
            }
            return new a(jVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(g.d("Unexpected status line: ", str));
        }
    }

    @Override // s8.c
    public final StackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f14270b) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (c cVar : (c[]) this.f14271c) {
            if (stackTraceElementArr2.length <= this.f14270b) {
                break;
            }
            stackTraceElementArr2 = cVar.b(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f14270b ? ((b) this.f14272d).b(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public final String toString() {
        switch (this.f14269a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((j) this.f14271c) == j.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb2.append(' ');
                sb2.append(this.f14270b);
                if (((String) this.f14272d) != null) {
                    sb2.append(' ');
                    sb2.append((String) this.f14272d);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(c[] cVarArr) {
        this.f14269a = 0;
        this.f14270b = 1024;
        this.f14271c = cVarArr;
        this.f14272d = new b();
    }
}

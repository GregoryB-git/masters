package j8;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import m8.f0;
import m8.s;

/* loaded from: classes.dex */
public final class t {
    public static final HashMap f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f8640g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8641a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f8642b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8643c;

    /* renamed from: d, reason: collision with root package name */
    public final s8.c f8644d;

    /* renamed from: e, reason: collision with root package name */
    public final r8.h f8645e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        defpackage.g.k(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        f8640g = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.4.0");
    }

    public t(Context context, a0 a0Var, a aVar, s8.a aVar2, r8.f fVar) {
        this.f8641a = context;
        this.f8642b = a0Var;
        this.f8643c = aVar;
        this.f8644d = aVar2;
        this.f8645e = fVar;
    }

    public static m8.p c(z5.j jVar, int i10) {
        String str = (String) jVar.f17810b;
        String str2 = jVar.f17809a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) jVar.f17811c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        z5.j jVar2 = (z5.j) jVar.f17812d;
        if (i10 >= 8) {
            z5.j jVar3 = jVar2;
            while (jVar3 != null) {
                jVar3 = (z5.j) jVar3.f17812d;
                i11++;
            }
        }
        int i12 = i11;
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        List d10 = d(stackTraceElementArr, 4);
        if (d10 == null) {
            throw new NullPointerException("Null frames");
        }
        byte b10 = (byte) (0 | 1);
        m8.p c10 = (jVar2 == null || i12 != 0) ? null : c(jVar2, i10 + 1);
        if (b10 == 1) {
            return new m8.p(str, str2, d10, c10, i12);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            s.a aVar = new s.a();
            aVar.f10681e = i10;
            aVar.f = (byte) (aVar.f | 4);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            aVar.f10677a = max;
            byte b10 = (byte) (aVar.f | 1);
            aVar.f = b10;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            aVar.f10678b = str;
            aVar.f10679c = fileName;
            aVar.f10680d = j10;
            aVar.f = (byte) (b10 | 2);
            arrayList.add(aVar.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List<f0.e.d.a.b.AbstractC0153a> a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f8643c;
        String str = aVar.f8546e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = aVar.f8543b;
        if (b10 == 3) {
            return Collections.singletonList(new m8.o(0L, 0L, str, str2));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m8.u b(int r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.t.b(int):m8.u");
    }
}

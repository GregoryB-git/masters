package c4;

import android.util.Log;
import c4.InterfaceC0852d;
import java.util.List;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0849a extends AbstractC0850b {
    public C0849a(InterfaceC0852d.a aVar, List list) {
        super(aVar, list);
    }

    @Override // c4.AbstractC0850b
    public void d(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // c4.AbstractC0850b
    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // c4.AbstractC0850b
    public void f(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // c4.AbstractC0850b
    public void h(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // c4.AbstractC0850b
    public String c(InterfaceC0852d.a aVar, String str, String str2, long j7) {
        return str2;
    }
}

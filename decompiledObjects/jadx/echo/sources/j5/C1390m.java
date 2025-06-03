package j5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Map;

/* renamed from: j5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1390m {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1381d f15475e = EnumC1381d.RSA_ECB_PKCS1Padding;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1389l f15476f = EnumC1389l.AES_CBC_PKCS7Padding;

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1381d f15477a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1389l f15478b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC1381d f15479c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC1389l f15480d;

    public C1390m(SharedPreferences sharedPreferences, Map map) {
        EnumC1381d enumC1381d = f15475e;
        this.f15477a = EnumC1381d.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", enumC1381d.name()));
        EnumC1389l enumC1389l = f15476f;
        this.f15478b = EnumC1389l.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", enumC1389l.name()));
        EnumC1381d valueOf = EnumC1381d.valueOf(b(map, "keyCipherAlgorithm", enumC1381d.name()));
        int i7 = valueOf.f15464p;
        int i8 = Build.VERSION.SDK_INT;
        this.f15479c = i7 <= i8 ? valueOf : enumC1381d;
        EnumC1389l valueOf2 = EnumC1389l.valueOf(b(map, "storageCipherAlgorithm", enumC1389l.name()));
        this.f15480d = valueOf2.f15474p <= i8 ? valueOf2 : enumC1389l;
    }

    public InterfaceC1386i a(Context context) {
        return this.f15480d.f15473o.a(context, this.f15479c.f15463o.a(context));
    }

    public final String b(Map map, String str, String str2) {
        Object obj = map.get(str);
        return obj != null ? obj.toString() : str2;
    }

    public InterfaceC1386i c(Context context) {
        return this.f15478b.f15473o.a(context, this.f15477a.f15463o.a(context));
    }

    public void d(SharedPreferences.Editor editor) {
        editor.remove("FlutterSecureSAlgorithmKey");
        editor.remove("FlutterSecureSAlgorithmStorage");
    }

    public boolean e() {
        return (this.f15477a == this.f15479c && this.f15478b == this.f15480d) ? false : true;
    }

    public void f(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", this.f15479c.name());
        editor.putString("FlutterSecureSAlgorithmStorage", this.f15480d.name());
    }
}

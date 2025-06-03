package q5;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {
    public int f;

    /* renamed from: h, reason: collision with root package name */
    public int f13289h;

    /* renamed from: o, reason: collision with root package name */
    public float f13296o;

    /* renamed from: a, reason: collision with root package name */
    public String f13283a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f13284b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set<String> f13285c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public String f13286d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f13287e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13288g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13290i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f13291j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f13292k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f13293l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f13294m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f13295n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f13297p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13298q = false;

    public static int a(String str, int i10, int i11, String str2) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}

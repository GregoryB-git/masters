package x0;

import b1.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: b, reason: collision with root package name */
    public int f16617b;

    /* renamed from: c, reason: collision with root package name */
    public int f16618c;

    /* renamed from: d, reason: collision with root package name */
    public int f16619d;

    /* renamed from: e, reason: collision with root package name */
    public int f16620e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16621g;

    /* renamed from: h, reason: collision with root package name */
    public String f16622h;

    /* renamed from: i, reason: collision with root package name */
    public int f16623i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f16624j;

    /* renamed from: k, reason: collision with root package name */
    public int f16625k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f16626l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList<String> f16627m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<String> f16628n;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<a> f16616a = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    public boolean f16629o = false;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f16630a;

        /* renamed from: b, reason: collision with root package name */
        public i f16631b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16632c;

        /* renamed from: d, reason: collision with root package name */
        public int f16633d;

        /* renamed from: e, reason: collision with root package name */
        public int f16634e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f16635g;

        /* renamed from: h, reason: collision with root package name */
        public k.b f16636h;

        /* renamed from: i, reason: collision with root package name */
        public k.b f16637i;

        public a() {
        }

        public a(int i10, i iVar) {
            this.f16630a = i10;
            this.f16631b = iVar;
            this.f16632c = true;
            k.b bVar = k.b.RESUMED;
            this.f16636h = bVar;
            this.f16637i = bVar;
        }

        public a(i iVar, int i10) {
            this.f16630a = i10;
            this.f16631b = iVar;
            this.f16632c = false;
            k.b bVar = k.b.RESUMED;
            this.f16636h = bVar;
            this.f16637i = bVar;
        }
    }

    public final void b(a aVar) {
        this.f16616a.add(aVar);
        aVar.f16633d = this.f16617b;
        aVar.f16634e = this.f16618c;
        aVar.f = this.f16619d;
        aVar.f16635g = this.f16620e;
    }
}

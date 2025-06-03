package e2;

import e2.AbstractC1242a;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244c extends AbstractC1242a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13820a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13821b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13822c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13823d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13824e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13825f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13826g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13827h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13828i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13829j;

    /* renamed from: k, reason: collision with root package name */
    public final String f13830k;

    /* renamed from: l, reason: collision with root package name */
    public final String f13831l;

    /* renamed from: e2.c$b */
    public static final class b extends AbstractC1242a.AbstractC0197a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f13832a;

        /* renamed from: b, reason: collision with root package name */
        public String f13833b;

        /* renamed from: c, reason: collision with root package name */
        public String f13834c;

        /* renamed from: d, reason: collision with root package name */
        public String f13835d;

        /* renamed from: e, reason: collision with root package name */
        public String f13836e;

        /* renamed from: f, reason: collision with root package name */
        public String f13837f;

        /* renamed from: g, reason: collision with root package name */
        public String f13838g;

        /* renamed from: h, reason: collision with root package name */
        public String f13839h;

        /* renamed from: i, reason: collision with root package name */
        public String f13840i;

        /* renamed from: j, reason: collision with root package name */
        public String f13841j;

        /* renamed from: k, reason: collision with root package name */
        public String f13842k;

        /* renamed from: l, reason: collision with root package name */
        public String f13843l;

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a a() {
            return new C1244c(this.f13832a, this.f13833b, this.f13834c, this.f13835d, this.f13836e, this.f13837f, this.f13838g, this.f13839h, this.f13840i, this.f13841j, this.f13842k, this.f13843l);
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a b(String str) {
            this.f13843l = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a c(String str) {
            this.f13841j = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a d(String str) {
            this.f13835d = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a e(String str) {
            this.f13839h = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a f(String str) {
            this.f13834c = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a g(String str) {
            this.f13840i = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a h(String str) {
            this.f13838g = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a i(String str) {
            this.f13842k = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a j(String str) {
            this.f13833b = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a k(String str) {
            this.f13837f = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a l(String str) {
            this.f13836e = str;
            return this;
        }

        @Override // e2.AbstractC1242a.AbstractC0197a
        public AbstractC1242a.AbstractC0197a m(Integer num) {
            this.f13832a = num;
            return this;
        }
    }

    public C1244c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f13820a = num;
        this.f13821b = str;
        this.f13822c = str2;
        this.f13823d = str3;
        this.f13824e = str4;
        this.f13825f = str5;
        this.f13826g = str6;
        this.f13827h = str7;
        this.f13828i = str8;
        this.f13829j = str9;
        this.f13830k = str10;
        this.f13831l = str11;
    }

    @Override // e2.AbstractC1242a
    public String b() {
        return this.f13831l;
    }

    @Override // e2.AbstractC1242a
    public String c() {
        return this.f13829j;
    }

    @Override // e2.AbstractC1242a
    public String d() {
        return this.f13823d;
    }

    @Override // e2.AbstractC1242a
    public String e() {
        return this.f13827h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1242a)) {
            return false;
        }
        AbstractC1242a abstractC1242a = (AbstractC1242a) obj;
        Integer num = this.f13820a;
        if (num != null ? num.equals(abstractC1242a.m()) : abstractC1242a.m() == null) {
            String str = this.f13821b;
            if (str != null ? str.equals(abstractC1242a.j()) : abstractC1242a.j() == null) {
                String str2 = this.f13822c;
                if (str2 != null ? str2.equals(abstractC1242a.f()) : abstractC1242a.f() == null) {
                    String str3 = this.f13823d;
                    if (str3 != null ? str3.equals(abstractC1242a.d()) : abstractC1242a.d() == null) {
                        String str4 = this.f13824e;
                        if (str4 != null ? str4.equals(abstractC1242a.l()) : abstractC1242a.l() == null) {
                            String str5 = this.f13825f;
                            if (str5 != null ? str5.equals(abstractC1242a.k()) : abstractC1242a.k() == null) {
                                String str6 = this.f13826g;
                                if (str6 != null ? str6.equals(abstractC1242a.h()) : abstractC1242a.h() == null) {
                                    String str7 = this.f13827h;
                                    if (str7 != null ? str7.equals(abstractC1242a.e()) : abstractC1242a.e() == null) {
                                        String str8 = this.f13828i;
                                        if (str8 != null ? str8.equals(abstractC1242a.g()) : abstractC1242a.g() == null) {
                                            String str9 = this.f13829j;
                                            if (str9 != null ? str9.equals(abstractC1242a.c()) : abstractC1242a.c() == null) {
                                                String str10 = this.f13830k;
                                                if (str10 != null ? str10.equals(abstractC1242a.i()) : abstractC1242a.i() == null) {
                                                    String str11 = this.f13831l;
                                                    String b7 = abstractC1242a.b();
                                                    if (str11 == null) {
                                                        if (b7 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(b7)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // e2.AbstractC1242a
    public String f() {
        return this.f13822c;
    }

    @Override // e2.AbstractC1242a
    public String g() {
        return this.f13828i;
    }

    @Override // e2.AbstractC1242a
    public String h() {
        return this.f13826g;
    }

    public int hashCode() {
        Integer num = this.f13820a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f13821b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f13822c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13823d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f13824e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f13825f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f13826g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f13827h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f13828i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f13829j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f13830k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f13831l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // e2.AbstractC1242a
    public String i() {
        return this.f13830k;
    }

    @Override // e2.AbstractC1242a
    public String j() {
        return this.f13821b;
    }

    @Override // e2.AbstractC1242a
    public String k() {
        return this.f13825f;
    }

    @Override // e2.AbstractC1242a
    public String l() {
        return this.f13824e;
    }

    @Override // e2.AbstractC1242a
    public Integer m() {
        return this.f13820a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f13820a + ", model=" + this.f13821b + ", hardware=" + this.f13822c + ", device=" + this.f13823d + ", product=" + this.f13824e + ", osBuild=" + this.f13825f + ", manufacturer=" + this.f13826g + ", fingerprint=" + this.f13827h + ", locale=" + this.f13828i + ", country=" + this.f13829j + ", mccMnc=" + this.f13830k + ", applicationBuild=" + this.f13831l + "}";
    }
}

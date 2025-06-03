package d9;

import java.util.List;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3694a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final e f3695b = new e();

    public static class a extends o {

        /* renamed from: c, reason: collision with root package name */
        public final List<Object> f3696c;

        public a(List<Object> list) {
            this.f3696c = list;
        }

        @Override // d9.o
        public final String a() {
            return "FieldValue.arrayRemove";
        }
    }

    public static class b extends o {

        /* renamed from: c, reason: collision with root package name */
        public final List<Object> f3697c;

        public b(List<Object> list) {
            this.f3697c = list;
        }

        @Override // d9.o
        public final String a() {
            return "FieldValue.arrayUnion";
        }
    }

    public static class c extends o {
        @Override // d9.o
        public final String a() {
            return "FieldValue.delete";
        }
    }

    public static class d extends o {

        /* renamed from: c, reason: collision with root package name */
        public final Number f3698c;

        public d(Number number) {
            this.f3698c = number;
        }

        @Override // d9.o
        public final String a() {
            return "FieldValue.increment";
        }
    }

    public static class e extends o {
        @Override // d9.o
        public final String a() {
            return "FieldValue.serverTimestamp";
        }
    }

    public abstract String a();
}

package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f2966a;

    /* renamed from: b, reason: collision with root package name */
    private y f2967b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f2967b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f2966a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f2966a;
        if (str != null && (yVar = this.f2967b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f2966a == null) {
            sb2.append(" token");
        }
        if (this.f2967b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

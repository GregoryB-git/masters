package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class C6 implements InterfaceC1085z6 {

    /* renamed from: a, reason: collision with root package name */
    public static final S2 f10328a;

    /* renamed from: b, reason: collision with root package name */
    public static final S2 f10329b;

    /* renamed from: c, reason: collision with root package name */
    public static final S2 f10330c;

    /* renamed from: d, reason: collision with root package name */
    public static final S2 f10331d;

    static {
        C0859a3 e7 = new C0859a3(P2.a("com.google.android.gms.measurement")).f().e();
        f10328a = e7.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f10329b = e7.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f10330c = e7.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f10331d = e7.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1085z6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1085z6
    public final boolean b() {
        return ((Boolean) f10329b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1085z6
    public final boolean c() {
        return ((Boolean) f10330c.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1085z6
    public final boolean d() {
        return ((Boolean) f10331d.f()).booleanValue();
    }
}

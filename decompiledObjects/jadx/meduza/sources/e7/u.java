package e7;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4684c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f4685d;

    public /* synthetic */ u(a aVar, String str, long j10, int i10) {
        this.f4682a = i10;
        this.f4683b = str;
        this.f4684c = j10;
        this.f4685d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        r.b bVar;
        Object valueOf;
        switch (this.f4682a) {
            case 0:
                a aVar = this.f4685d;
                String str = this.f4683b;
                long j10 = this.f4684c;
                aVar.l();
                m6.j.e(str);
                Integer num = (Integer) aVar.f4055d.getOrDefault(str, null);
                if (num == null) {
                    aVar.zzj().f4060o.c("Call to endAdUnitExposure for unknown ad unit id", str);
                    break;
                } else {
                    q4 v10 = aVar.p().v(false);
                    int intValue = num.intValue() - 1;
                    if (intValue != 0) {
                        aVar.f4055d.put(str, Integer.valueOf(intValue));
                        break;
                    } else {
                        aVar.f4055d.remove(str);
                        Long l10 = (Long) aVar.f4054c.getOrDefault(str, null);
                        if (l10 == null) {
                            aVar.zzj().f4060o.b("First ad unit exposure time was never set");
                        } else {
                            long longValue = j10 - l10.longValue();
                            aVar.f4054c.remove(str);
                            aVar.v(str, longValue, v10);
                        }
                        if (aVar.f4055d.isEmpty()) {
                            long j11 = aVar.f4056e;
                            if (j11 != 0) {
                                aVar.t(j10 - j11, v10);
                                aVar.f4056e = 0L;
                                break;
                            } else {
                                aVar.zzj().f4060o.b("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                a aVar2 = this.f4685d;
                String str2 = this.f4683b;
                long j12 = this.f4684c;
                aVar2.l();
                m6.j.e(str2);
                if (aVar2.f4055d.isEmpty()) {
                    aVar2.f4056e = j12;
                }
                Integer num2 = (Integer) aVar2.f4055d.getOrDefault(str2, null);
                if (num2 != null) {
                    bVar = aVar2.f4055d;
                    valueOf = Integer.valueOf(num2.intValue() + 1);
                } else {
                    r.b bVar2 = aVar2.f4055d;
                    if (bVar2.f13500c >= 100) {
                        aVar2.zzj().f4063r.b("Too many ads visible");
                        break;
                    } else {
                        bVar2.put(str2, 1);
                        bVar = aVar2.f4054c;
                        valueOf = Long.valueOf(j12);
                    }
                }
                bVar.put(str2, valueOf);
                break;
        }
    }
}

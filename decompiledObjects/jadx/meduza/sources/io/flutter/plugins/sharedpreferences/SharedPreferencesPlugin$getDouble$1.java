package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import dc.p;
import ec.s;
import nc.d0;
import r0.d;

@wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1", f = "SharedPreferencesPlugin.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$getDouble$1 extends wb.i implements p<d0, ub.e<? super rb.h>, Object> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ s<Double> $value;
    public Object L$0;
    public int label;
    public final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getDouble$1(String str, SharedPreferencesPlugin sharedPreferencesPlugin, s<Double> sVar, ub.e<? super SharedPreferencesPlugin$getDouble$1> eVar) {
        super(2, eVar);
        this.$key = str;
        this.this$0 = sharedPreferencesPlugin;
        this.$value = sVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new SharedPreferencesPlugin$getDouble$1(this.$key, this.this$0, this.$value, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((SharedPreferencesPlugin$getDouble$1) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        o0.i sharedPreferencesDataStore;
        s<Double> sVar;
        T t;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.label;
        if (i10 == 0) {
            rb.f.b(obj);
            final d.a u02 = x6.b.u0(this.$key);
            context = this.this$0.context;
            if (context == null) {
                ec.i.i("context");
                throw null;
            }
            sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
            final qc.e data = sharedPreferencesDataStore.getData();
            final SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
            qc.e<Double> eVar = new qc.e<Double>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1

                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements qc.f {
                    public final /* synthetic */ d.a $preferencesKey$inlined;
                    public final /* synthetic */ qc.f $this_unsafeFlow;
                    public final /* synthetic */ SharedPreferencesPlugin this$0;

                    @wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends wb.c {
                        public Object L$0;
                        public int label;
                        public /* synthetic */ Object result;

                        public AnonymousClass1(ub.e eVar) {
                            super(eVar);
                        }

                        @Override // wb.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(qc.f fVar, SharedPreferencesPlugin sharedPreferencesPlugin, d.a aVar) {
                        this.$this_unsafeFlow = fVar;
                        this.this$0 = sharedPreferencesPlugin;
                        this.$preferencesKey$inlined = aVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // qc.f
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, ub.e r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            vb.a r1 = vb.a.f16085a
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            rb.f.b(r7)
                            goto L4d
                        L27:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L2f:
                            rb.f.b(r7)
                            qc.f r7 = r5.$this_unsafeFlow
                            r0.d r6 = (r0.d) r6
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r2 = r5.this$0
                            r0.d$a r4 = r5.$preferencesKey$inlined
                            java.lang.Object r6 = r6.b(r4)
                            java.lang.Object r6 = io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.access$transformPref(r2, r6)
                            java.lang.Double r6 = (java.lang.Double) r6
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L4d
                            return r1
                        L4d:
                            rb.h r6 = rb.h.f13851a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, ub.e):java.lang.Object");
                    }
                }

                @Override // qc.e
                public Object collect(qc.f<? super Double> fVar, ub.e eVar2) {
                    Object collect = qc.e.this.collect(new AnonymousClass2(fVar, sharedPreferencesPlugin, u02), eVar2);
                    return collect == vb.a.f16085a ? collect : rb.h.f13851a;
                }
            };
            s<Double> sVar2 = this.$value;
            this.L$0 = sVar2;
            this.label = 1;
            Object V = x6.b.V(eVar, this);
            if (V == aVar) {
                return aVar;
            }
            sVar = sVar2;
            t = V;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = (s) this.L$0;
            rb.f.b(obj);
            t = obj;
        }
        sVar.f5272a = t;
        return rb.h.f13851a;
    }
}

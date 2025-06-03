package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import dc.p;
import nc.d0;
import r0.d;

@wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1", f = "SharedPreferencesPlugin.kt", l = {com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_seekBarStyle}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$setDouble$1 extends wb.i implements p<d0, ub.e<? super rb.h>, Object> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ double $value;
    public int label;
    public final /* synthetic */ SharedPreferencesPlugin this$0;

    @wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends wb.i implements p<r0.a, ub.e<? super rb.h>, Object> {
        public final /* synthetic */ d.a<Double> $doubleKey;
        public final /* synthetic */ double $value;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d.a<Double> aVar, double d10, ub.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$doubleKey = aVar;
            this.$value = d10;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$doubleKey, this.$value, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // dc.p
        public final Object invoke(r0.a aVar, ub.e<? super rb.h> eVar) {
            return ((AnonymousClass1) create(aVar, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rb.f.b(obj);
            ((r0.a) this.L$0).d(this.$doubleKey, new Double(this.$value));
            return rb.h.f13851a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$setDouble$1(String str, SharedPreferencesPlugin sharedPreferencesPlugin, double d10, ub.e<? super SharedPreferencesPlugin$setDouble$1> eVar) {
        super(2, eVar);
        this.$key = str;
        this.this$0 = sharedPreferencesPlugin;
        this.$value = d10;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new SharedPreferencesPlugin$setDouble$1(this.$key, this.this$0, this.$value, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((SharedPreferencesPlugin$setDouble$1) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        o0.i sharedPreferencesDataStore;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.label;
        if (i10 == 0) {
            rb.f.b(obj);
            String str = this.$key;
            ec.i.e(str, "name");
            d.a aVar2 = new d.a(str);
            context = this.this$0.context;
            if (context == null) {
                ec.i.i("context");
                throw null;
            }
            sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar2, this.$value, null);
            this.label = 1;
            if (r0.e.a(sharedPreferencesDataStore, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rb.f.b(obj);
        }
        return rb.h.f13851a;
    }
}

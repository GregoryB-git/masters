package io.flutter.plugins.sharedpreferences;

import dc.p;
import r0.d;

@wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$dataStoreSetString$2 extends wb.i implements p<r0.a, ub.e<? super rb.h>, Object> {
    public final /* synthetic */ d.a<String> $stringKey;
    public final /* synthetic */ String $value;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$dataStoreSetString$2(d.a<String> aVar, String str, ub.e<? super SharedPreferencesPlugin$dataStoreSetString$2> eVar) {
        super(2, eVar);
        this.$stringKey = aVar;
        this.$value = str;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        SharedPreferencesPlugin$dataStoreSetString$2 sharedPreferencesPlugin$dataStoreSetString$2 = new SharedPreferencesPlugin$dataStoreSetString$2(this.$stringKey, this.$value, eVar);
        sharedPreferencesPlugin$dataStoreSetString$2.L$0 = obj;
        return sharedPreferencesPlugin$dataStoreSetString$2;
    }

    @Override // dc.p
    public final Object invoke(r0.a aVar, ub.e<? super rb.h> eVar) {
        return ((SharedPreferencesPlugin$dataStoreSetString$2) create(aVar, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rb.f.b(obj);
        ((r0.a) this.L$0).d(this.$stringKey, this.$value);
        return rb.h.f13851a;
    }
}

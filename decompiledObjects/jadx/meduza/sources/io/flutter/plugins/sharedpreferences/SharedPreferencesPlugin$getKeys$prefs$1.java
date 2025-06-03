package io.flutter.plugins.sharedpreferences;

import dc.p;
import java.util.List;
import java.util.Map;
import nc.d0;

@wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getKeys$prefs$1", f = "SharedPreferencesPlugin.kt", l = {195}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$getKeys$prefs$1 extends wb.i implements p<d0, ub.e<? super Map<String, ? extends Object>>, Object> {
    public final /* synthetic */ List<String> $allowList;
    public int label;
    public final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getKeys$prefs$1(SharedPreferencesPlugin sharedPreferencesPlugin, List<String> list, ub.e<? super SharedPreferencesPlugin$getKeys$prefs$1> eVar) {
        super(2, eVar);
        this.this$0 = sharedPreferencesPlugin;
        this.$allowList = list;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new SharedPreferencesPlugin$getKeys$prefs$1(this.this$0, this.$allowList, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super Map<String, ? extends Object>> eVar) {
        return ((SharedPreferencesPlugin$getKeys$prefs$1) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.label;
        if (i10 == 0) {
            rb.f.b(obj);
            SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
            List<String> list = this.$allowList;
            this.label = 1;
            obj = sharedPreferencesPlugin.getPrefs(list, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rb.f.b(obj);
        }
        return obj;
    }
}

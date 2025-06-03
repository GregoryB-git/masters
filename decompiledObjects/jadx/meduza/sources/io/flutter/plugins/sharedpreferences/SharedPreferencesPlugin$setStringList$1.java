package io.flutter.plugins.sharedpreferences;

import dc.p;
import nc.d0;

@wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setStringList$1", f = "SharedPreferencesPlugin.kt", l = {com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$setStringList$1 extends wb.i implements p<d0, ub.e<? super rb.h>, Object> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $valueString;
    public int label;
    public final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$setStringList$1(SharedPreferencesPlugin sharedPreferencesPlugin, String str, String str2, ub.e<? super SharedPreferencesPlugin$setStringList$1> eVar) {
        super(2, eVar);
        this.this$0 = sharedPreferencesPlugin;
        this.$key = str;
        this.$valueString = str2;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new SharedPreferencesPlugin$setStringList$1(this.this$0, this.$key, this.$valueString, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((SharedPreferencesPlugin$setStringList$1) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object dataStoreSetString;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.label;
        if (i10 == 0) {
            rb.f.b(obj);
            SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
            String str = this.$key;
            String str2 = this.$valueString;
            this.label = 1;
            dataStoreSetString = sharedPreferencesPlugin.dataStoreSetString(str, str2, this);
            if (dataStoreSetString == aVar) {
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

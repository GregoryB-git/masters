package io.flutter.plugins.sharedpreferences;

@wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f = "SharedPreferencesPlugin.kt", l = {203, 205}, m = "getPrefs")
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$getPrefs$1 extends wb.c {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getPrefs$1(SharedPreferencesPlugin sharedPreferencesPlugin, ub.e<? super SharedPreferencesPlugin$getPrefs$1> eVar) {
        super(eVar);
        this.this$0 = sharedPreferencesPlugin;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Object prefs;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        prefs = this.this$0.getPrefs(null, this);
        return prefs;
    }
}

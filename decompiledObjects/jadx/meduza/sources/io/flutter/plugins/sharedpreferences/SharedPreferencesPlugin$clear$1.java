package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import dc.p;
import java.util.Iterator;
import java.util.List;
import nc.d0;
import r0.d;

@wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", f = "SharedPreferencesPlugin.kt", l = {com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarStyle}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SharedPreferencesPlugin$clear$1 extends wb.i implements p<d0, ub.e<? super r0.d>, Object> {
    public final /* synthetic */ List<String> $allowList;
    public int label;
    public final /* synthetic */ SharedPreferencesPlugin this$0;

    @wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends wb.i implements p<r0.a, ub.e<? super rb.h>, Object> {
        public final /* synthetic */ List<String> $allowList;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, ub.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$allowList = list;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, eVar);
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
            r0.a aVar2 = (r0.a) this.L$0;
            List<String> list = this.$allowList;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    d.a j10 = x6.b.j((String) it.next());
                    aVar2.getClass();
                    aVar2.c();
                    aVar2.f13505a.remove(j10);
                }
            } else {
                aVar2.c();
                aVar2.f13505a.clear();
            }
            return rb.h.f13851a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$clear$1(SharedPreferencesPlugin sharedPreferencesPlugin, List<String> list, ub.e<? super SharedPreferencesPlugin$clear$1> eVar) {
        super(2, eVar);
        this.this$0 = sharedPreferencesPlugin;
        this.$allowList = list;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new SharedPreferencesPlugin$clear$1(this.this$0, this.$allowList, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super r0.d> eVar) {
        return ((SharedPreferencesPlugin$clear$1) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        o0.i sharedPreferencesDataStore;
        vb.a aVar = vb.a.f16085a;
        int i10 = this.label;
        if (i10 == 0) {
            rb.f.b(obj);
            context = this.this$0.context;
            if (context == null) {
                ec.i.i("context");
                throw null;
            }
            sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, null);
            this.label = 1;
            obj = r0.e.a(sharedPreferencesDataStore, anonymousClass1, this);
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

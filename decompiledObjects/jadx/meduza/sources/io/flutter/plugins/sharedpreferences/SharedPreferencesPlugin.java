package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import ec.s;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r0.d;
import sb.q;

/* loaded from: classes.dex */
public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {
    private Context context;
    private SharedPreferencesListEncoder listEncoder;

    public static final class ListEncoder implements SharedPreferencesListEncoder {
        @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
        public List<String> decode(String str) {
            ec.i.e(str, "listString");
            try {
                Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                ec.i.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) readObject) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            } catch (RuntimeException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder
        public String encode(List<String> list) {
            ec.i.e(list, "list");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                ec.i.d(encodeToString, "encodeToString(...)");
                return encodeToString;
            } catch (RuntimeException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public SharedPreferencesPlugin() {
        this.listEncoder = new ListEncoder();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin(SharedPreferencesListEncoder sharedPreferencesListEncoder) {
        this();
        ec.i.e(sharedPreferencesListEncoder, "listEncoder");
        this.listEncoder = sharedPreferencesListEncoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dataStoreSetString(String str, String str2, ub.e<? super rb.h> eVar) {
        o0.i sharedPreferencesDataStore;
        d.a u02 = x6.b.u0(str);
        Context context = this.context;
        if (context == null) {
            ec.i.i("context");
            throw null;
        }
        sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
        Object a10 = r0.e.a(sharedPreferencesDataStore, new SharedPreferencesPlugin$dataStoreSetString$2(u02, str2, null), eVar);
        return a10 == vb.a.f16085a ? a10 : rb.h.f13851a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009f -> B:11:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getPrefs(java.util.List<java.lang.String> r9, ub.e<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1
            if (r0 == 0) goto L13
            r0 = r10
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            vb.a r1 = vb.a.f16085a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L56
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r9 = r0.L$4
            r0.d$a r9 = (r0.d.a) r9
            java.lang.Object r2 = r0.L$3
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$1
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.L$0
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r6 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin) r6
            rb.f.b(r10)
            goto La2
        L3e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L46:
            java.lang.Object r9 = r0.L$2
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.L$1
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.L$0
            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r4 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin) r4
            rb.f.b(r10)
            goto L77
        L56:
            rb.f.b(r10)
            if (r9 == 0) goto L60
            java.util.Set r9 = sb.q.x(r9)
            goto L61
        L60:
            r9 = 0
        L61:
            r2 = r9
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r10 = r8.readAllKeys(r0)
            if (r10 != r1) goto L76
            return r1
        L76:
            r4 = r8
        L77:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto Lb7
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L83:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lb6
            java.lang.Object r9 = r2.next()
            r0.d$a r9 = (r0.d.a) r9
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r2
            r0.L$4 = r9
            r0.label = r3
            java.lang.Object r10 = r6.getValueByKey(r9, r0)
            if (r10 != r1) goto La2
            return r1
        La2:
            java.lang.String r7 = r9.f13513a
            boolean r7 = r6.preferencesFilter(r7, r10, r5)
            if (r7 == 0) goto L83
            java.lang.Object r10 = r6.transformPref(r10)
            if (r10 == 0) goto L83
            java.lang.String r9 = r9.f13513a
            r4.put(r9, r10)
            goto L83
        Lb6:
            r9 = r4
        Lb7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getPrefs(java.util.List, ub.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getValueByKey(final d.a<?> aVar, ub.e<Object> eVar) {
        o0.i sharedPreferencesDataStore;
        Context context = this.context;
        if (context == null) {
            ec.i.i("context");
            throw null;
        }
        sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
        final qc.e data = sharedPreferencesDataStore.getData();
        return x6.b.V(new qc.e<Object>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1

            /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements qc.f {
                public final /* synthetic */ d.a $key$inlined;
                public final /* synthetic */ qc.f $this_unsafeFlow;

                @wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(qc.f fVar, d.a aVar) {
                    this.$this_unsafeFlow = fVar;
                    this.$key$inlined = aVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // qc.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, ub.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        vb.a r1 = vb.a.f16085a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        rb.f.b(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        rb.f.b(r6)
                        qc.f r6 = r4.$this_unsafeFlow
                        r0.d r5 = (r0.d) r5
                        r0.d$a r2 = r4.$key$inlined
                        java.lang.Object r5 = r5.b(r2)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        rb.h r5 = rb.h.f13851a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, ub.e):java.lang.Object");
                }
            }

            @Override // qc.e
            public Object collect(qc.f<? super Object> fVar, ub.e eVar2) {
                Object collect = qc.e.this.collect(new AnonymousClass2(fVar, aVar), eVar2);
                return collect == vb.a.f16085a ? collect : rb.h.f13851a;
            }
        }, eVar);
    }

    private final boolean preferencesFilter(String str, Object obj, Set<String> set) {
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readAllKeys(ub.e<? super Set<? extends d.a<?>>> eVar) {
        o0.i sharedPreferencesDataStore;
        Context context = this.context;
        if (context == null) {
            ec.i.i("context");
            throw null;
        }
        sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
        final qc.e data = sharedPreferencesDataStore.getData();
        return x6.b.V(new qc.e<Set<? extends d.a<?>>>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1

            /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements qc.f {
                public final /* synthetic */ qc.f $this_unsafeFlow;

                @wb.e(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(qc.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // qc.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, ub.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        vb.a r1 = vb.a.f16085a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        rb.f.b(r6)
                        goto L47
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        rb.f.b(r6)
                        qc.f r6 = r4.$this_unsafeFlow
                        r0.d r5 = (r0.d) r5
                        java.util.Map r5 = r5.a()
                        java.util.Set r5 = r5.keySet()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        rb.h r5 = rb.h.f13851a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, ub.e):java.lang.Object");
                }
            }

            @Override // qc.e
            public Object collect(qc.f<? super Set<? extends d.a<?>>> fVar, ub.e eVar2) {
                Object collect = qc.e.this.collect(new AnonymousClass2(fVar), eVar2);
                return collect == vb.a.f16085a ? collect : rb.h.f13851a;
            }
        }, eVar);
    }

    private final void setUp(BinaryMessenger binaryMessenger, Context context) {
        this.context = context;
        try {
            SharedPreferencesAsyncApi.Companion.setUp(binaryMessenger, this);
        } catch (Exception e10) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesPlugin", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformPref(Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!lc.h.n0(str, SharedPreferencesPluginKt.LIST_PREFIX)) {
            return obj;
        }
        SharedPreferencesListEncoder sharedPreferencesListEncoder = this.listEncoder;
        String substring = str.substring(40);
        ec.i.d(substring, "substring(...)");
        return sharedPreferencesListEncoder.decode(substring);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        x6.b.p0(new SharedPreferencesPlugin$clear$1(this, list, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        return (Map) x6.b.p0(new SharedPreferencesPlugin$getAll$1(this, list, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Boolean getBool(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        s sVar = new s();
        x6.b.p0(new SharedPreferencesPlugin$getBool$1(str, this, sVar, null));
        return (Boolean) sVar.f5272a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Double getDouble(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        s sVar = new s();
        x6.b.p0(new SharedPreferencesPlugin$getDouble$1(str, this, sVar, null));
        return (Double) sVar.f5272a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Long getInt(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        s sVar = new s();
        x6.b.p0(new SharedPreferencesPlugin$getInt$1(str, this, sVar, null));
        return (Long) sVar.f5272a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        return q.u(((Map) x6.b.p0(new SharedPreferencesPlugin$getKeys$prefs$1(this, list, null))).keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public String getString(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        s sVar = new s();
        x6.b.p0(new SharedPreferencesPlugin$getString$1(str, this, sVar, null));
        return (String) sVar.f5272a;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getStringList(String str, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        List list = (List) transformPref(getString(str, sharedPreferencesPigeonOptions));
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ec.i.e(flutterPluginBinding, "binding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        ec.i.d(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        ec.i.d(applicationContext, "getApplicationContext(...)");
        setUp(binaryMessenger, applicationContext);
        new LegacySharedPreferencesPlugin().onAttachedToEngine(flutterPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ec.i.e(flutterPluginBinding, "binding");
        SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.Companion;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        ec.i.d(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(String str, boolean z10, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        x6.b.p0(new SharedPreferencesPlugin$setBool$1(str, this, z10, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(String str, double d10, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        x6.b.p0(new SharedPreferencesPlugin$setDouble$1(str, this, d10, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(String str, long j10, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        x6.b.p0(new SharedPreferencesPlugin$setInt$1(str, this, j10, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(String str, String str2, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(str2, "value");
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        x6.b.p0(new SharedPreferencesPlugin$setString$1(this, str, str2, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setStringList(String str, List<String> list, SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        ec.i.e(str, Constants.KEY);
        ec.i.e(list, "value");
        ec.i.e(sharedPreferencesPigeonOptions, "options");
        x6.b.p0(new SharedPreferencesPlugin$setStringList$1(this, str, SharedPreferencesPluginKt.LIST_PREFIX + this.listEncoder.encode(list), null));
    }
}

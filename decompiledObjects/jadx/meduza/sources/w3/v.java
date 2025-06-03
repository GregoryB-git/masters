package w3;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.JsonReader;
import ca.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import g9.m0;
import java.nio.charset.Charset;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import m8.f0;
import m8.w;
import n8.a;
import o4.p;
import r3.t;
import r5.f;
import u4.g;
import v3.b1;
import v3.g;
import v3.i1;
import v3.k0;
import v3.o0;
import v3.o1;
import v3.q1;
import v3.r1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements l.a, o.a, h3.j, t.a, g.a, p.f, g.a, e.a, a.InterfaceC0173a, h3.g, Continuation, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16227a;

    public /* synthetic */ v(int i10) {
        this.f16227a = i10;
    }

    @Override // h3.j
    public void a(Exception exc) {
    }

    @Override // o.a
    public Object apply(Object obj) {
        switch (this.f16227a) {
            case 2:
                h3.c cVar = r3.t.f;
                throw new s3.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 3:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                q8.a.f13345b.getClass();
                return n8.a.f11321a.a((f0) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // o4.p.f
    public int b(Object obj) {
        Pattern pattern = o4.p.f11853a;
        return ((o4.l) obj).f11804a.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // n8.a.InterfaceC0173a
    public Object c(JsonReader jsonReader) {
        String str = null;
        switch (this.f16227a) {
            case 15:
                a9.d dVar = n8.a.f11321a;
                w.a aVar = new w.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    nextName.hashCode();
                    switch (nextName) {
                        case "parameterKey":
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null parameterKey");
                            }
                            aVar.f10708b = nextString;
                            break;
                        case "templateVersion":
                            aVar.f10710d = jsonReader.nextLong();
                            aVar.f10711e = (byte) (aVar.f10711e | 1);
                            break;
                        case "rolloutVariant":
                            jsonReader.beginObject();
                            String str2 = null;
                            String str3 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.getClass();
                                if (nextName2.equals("variantId")) {
                                    str3 = jsonReader.nextString();
                                    if (str3 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                } else if (nextName2.equals("rolloutId")) {
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        throw new NullPointerException("Null rolloutId");
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (str2 != null && str3 != null) {
                                aVar.f10707a = new m8.x(str2, str3);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                if (str2 == null) {
                                    sb2.append(" rolloutId");
                                }
                                if (str3 == null) {
                                    sb2.append(" variantId");
                                }
                                throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
                            }
                            break;
                        case "parameterValue":
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                throw new NullPointerException("Null parameterValue");
                            }
                            aVar.f10709c = nextString2;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return aVar.a();
            case 16:
                a9.d dVar2 = n8.a.f11321a;
                jsonReader.beginObject();
                String str4 = null;
                String str5 = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    nextName3.hashCode();
                    switch (nextName3) {
                        case "libraryName":
                            str4 = jsonReader.nextString();
                            if (str4 == null) {
                                throw new NullPointerException("Null libraryName");
                            }
                            break;
                        case "arch":
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null arch");
                            }
                            break;
                        case "buildId":
                            str5 = jsonReader.nextString();
                            if (str5 == null) {
                                throw new NullPointerException("Null buildId");
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str != null && str4 != null && str5 != null) {
                    return new m8.d(str, str4, str5);
                }
                StringBuilder sb3 = new StringBuilder();
                if (str == null) {
                    sb3.append(" arch");
                }
                if (str4 == null) {
                    sb3.append(" libraryName");
                }
                if (str5 == null) {
                    sb3.append(" buildId");
                }
                throw new IllegalStateException(a0.j.l("Missing required properties:", sb3));
            default:
                return n8.a.a(jsonReader);
        }
    }

    @Override // u4.g.a
    public boolean d(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // ca.e.a
    public String e(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.b(installerPackageName) : "";
    }

    @Override // v3.g.a
    public v3.g f(Bundle bundle) {
        v3.g f;
        e0.d dVar;
        switch (this.f16227a) {
            case 4:
                o0.b.a aVar = new o0.b.a();
                String str = o0.b.f15550o;
                o0.c cVar = o0.b.f;
                long j10 = bundle.getLong(str, cVar.f15555a);
                x6.b.q(j10 >= 0);
                aVar.f15560a = j10;
                long j11 = bundle.getLong(o0.b.f15551p, cVar.f15556b);
                if (j11 != Long.MIN_VALUE && j11 < 0) {
                    r6 = false;
                }
                x6.b.q(r6);
                aVar.f15561b = j11;
                aVar.f15562c = bundle.getBoolean(o0.b.f15552q, cVar.f15557c);
                aVar.f15563d = bundle.getBoolean(o0.b.f15553r, cVar.f15558d);
                aVar.f15564e = bundle.getBoolean(o0.b.f15554s, cVar.f15559e);
                return new o0.c(aVar);
            case 6:
                int i10 = bundle.getInt(i1.f15487a, -1);
                if (i10 != 0) {
                    if (i10 == 1) {
                        dVar = b1.f15249e;
                    } else if (i10 == 2) {
                        f = o1.f15622o.f(bundle);
                    } else {
                        if (i10 != 3) {
                            throw new IllegalArgumentException(defpackage.f.h("Unknown RatingType: ", i10));
                        }
                        dVar = q1.f15714o;
                    }
                    f = dVar.f(bundle);
                } else {
                    f = k0.f15508o.f(bundle);
                }
                return (i1) f;
            case 7:
                int i11 = bundle.getInt(r1.b.f15744p, 0);
                long j12 = bundle.getLong(r1.b.f15745q, -9223372036854775807L);
                long j13 = bundle.getLong(r1.b.f15746r, 0L);
                boolean z10 = bundle.getBoolean(r1.b.f15747s, false);
                Bundle bundle2 = bundle.getBundle(r1.b.t);
                a5.a aVar2 = bundle2 != null ? (a5.a) a5.a.f213u.f(bundle2) : a5.a.f208o;
                r1.b bVar = new r1.b();
                bVar.h(null, null, i11, j12, j13, aVar2, z10);
                return bVar;
            case 12:
                int i12 = bundle.getInt(f.e.f13676d, -1);
                int[] intArray = bundle.getIntArray(f.e.f13677e);
                int i13 = bundle.getInt(f.e.f, -1);
                x6.b.q(i12 >= 0 && i13 >= 0);
                intArray.getClass();
                return new f.e(i12, i13, intArray);
            default:
                return new w5.o(bundle.getFloat(w5.o.f16428p, 1.0f), bundle.getInt(w5.o.f16426e, 0), bundle.getInt(w5.o.f, 0), bundle.getInt(w5.o.f16427o, 0));
        }
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f16227a) {
            case 0:
                ((b) obj).L();
                break;
            default:
                ((b) obj).X();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((eb.e) obj).b();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f16227a) {
            case 19:
                ThreadPoolExecutor threadPoolExecutor = m0.f6025g;
                return task.isSuccessful() ? Tasks.forResult(null) : Tasks.forException(task.getException());
            default:
                Object obj = aa.j.f310c;
                return -1;
        }
    }
}

package ga;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import ec.s;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import nc.d0;
import org.json.JSONObject;

@wb.e(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {R.styleable.AppCompatTheme_editTextBackground, R.styleable.AppCompatTheme_editTextStyle, R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends wb.i implements p<d0, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f6124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f6126c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p<JSONObject, ub.e<? super rb.h>, Object> f6127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p<String, ub.e<? super rb.h>, Object> f6128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(f fVar, Map<String, String> map, p<? super JSONObject, ? super ub.e<? super rb.h>, ? extends Object> pVar, p<? super String, ? super ub.e<? super rb.h>, ? extends Object> pVar2, ub.e<? super e> eVar) {
        super(2, eVar);
        this.f6125b = fVar;
        this.f6126c = map;
        this.f6127d = pVar;
        this.f6128e = pVar2;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new e(this.f6125b, this.f6126c, this.f6127d, this.f6128e, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((e) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f6124a;
        try {
            if (i10 == 0) {
                rb.f.b(obj);
                URLConnection openConnection = f.b(this.f6125b).openConnection();
                ec.i.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry<String, String> entry : this.f6126c.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    s sVar = new s();
                    while (true) {
                        ?? readLine = bufferedReader.readLine();
                        sVar.f5272a = readLine;
                        if (readLine == 0) {
                            break;
                        }
                        sb2.append((String) readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    p<JSONObject, ub.e<? super rb.h>, Object> pVar = this.f6127d;
                    this.f6124a = 1;
                    if (pVar.invoke(jSONObject, this) == aVar) {
                        return aVar;
                    }
                } else {
                    p<String, ub.e<? super rb.h>, Object> pVar2 = this.f6128e;
                    String str = "Bad response code: " + responseCode;
                    this.f6124a = 2;
                    if (pVar2.invoke(str, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                rb.f.b(obj);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rb.f.b(obj);
            }
        } catch (Exception e10) {
            p<String, ub.e<? super rb.h>, Object> pVar3 = this.f6128e;
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            this.f6124a = 3;
            if (pVar3.invoke(message, this) == aVar) {
                return aVar;
            }
        }
        return rb.h.f13851a;
    }
}

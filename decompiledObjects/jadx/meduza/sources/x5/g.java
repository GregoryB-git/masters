package x5;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.FloatBuffer;
import v5.j;
import x5.e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f17140i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f17141j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f17142k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f17143a;

    /* renamed from: b, reason: collision with root package name */
    public a f17144b;

    /* renamed from: c, reason: collision with root package name */
    public v5.i f17145c;

    /* renamed from: d, reason: collision with root package name */
    public int f17146d;

    /* renamed from: e, reason: collision with root package name */
    public int f17147e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f17148g;

    /* renamed from: h, reason: collision with root package name */
    public int f17149h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17150a;

        /* renamed from: b, reason: collision with root package name */
        public final FloatBuffer f17151b;

        /* renamed from: c, reason: collision with root package name */
        public final FloatBuffer f17152c;

        /* renamed from: d, reason: collision with root package name */
        public final int f17153d;

        public a(e.b bVar) {
            float[] fArr = bVar.f17138c;
            this.f17150a = fArr.length / 3;
            this.f17151b = v5.j.c(fArr);
            this.f17152c = v5.j.c(bVar.f17139d);
            int i10 = bVar.f17137b;
            this.f17153d = i10 != 1 ? i10 != 2 ? 4 : 6 : 5;
        }
    }

    public static boolean b(e eVar) {
        e.a aVar = eVar.f17131a;
        e.a aVar2 = eVar.f17132b;
        e.b[] bVarArr = aVar.f17135a;
        if (bVarArr.length != 1 || bVarArr[0].f17136a != 0) {
            return false;
        }
        e.b[] bVarArr2 = aVar2.f17135a;
        return bVarArr2.length == 1 && bVarArr2[0].f17136a == 0;
    }

    public final void a() {
        try {
            v5.i iVar = new v5.i();
            this.f17145c = iVar;
            this.f17146d = GLES20.glGetUniformLocation(iVar.f15908a, "uMvpMatrix");
            this.f17147e = GLES20.glGetUniformLocation(this.f17145c.f15908a, "uTexMatrix");
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f17145c.f15908a, "aPosition");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            v5.j.a();
            this.f = glGetAttribLocation;
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f17145c.f15908a, "aTexCoords");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            v5.j.a();
            this.f17148g = glGetAttribLocation2;
            this.f17149h = GLES20.glGetUniformLocation(this.f17145c.f15908a, "uTexture");
        } catch (j.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}

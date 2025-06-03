package v5;

import android.opengl.GLES20;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f15908a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f15909b;

    /* renamed from: c, reason: collision with root package name */
    public final b[] f15910c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15911d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f15912e;

    public static final class a {
        public a(String str) {
        }
    }

    public static final class b {
        public b(String str) {
        }
    }

    public i() {
        byte[] bArr;
        byte[] bArr2;
        int glCreateProgram = GLES20.glCreateProgram();
        this.f15908a = glCreateProgram;
        j.a();
        a(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        a(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(glCreateProgram);
        int i10 = 1;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        boolean z10 = iArr[0] == 1;
        StringBuilder l10 = defpackage.f.l("Unable to link shader program: \n");
        l10.append(GLES20.glGetProgramInfoLog(glCreateProgram));
        j.b(l10.toString(), z10);
        GLES20.glUseProgram(glCreateProgram);
        this.f15911d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f15909b = new a[iArr2[0]];
        int i11 = 0;
        while (i11 < iArr2[0]) {
            int i12 = this.f15908a;
            int[] iArr3 = new int[i10];
            GLES20.glGetProgramiv(i12, 35722, iArr3, 0);
            int i13 = iArr3[0];
            byte[] bArr3 = new byte[i13];
            GLES20.glGetActiveAttrib(i12, i11, i13, new int[i10], 0, new int[i10], 0, new int[i10], 0, bArr3, 0);
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    bArr2 = bArr3;
                    i14 = i13;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i14] == 0) {
                        break;
                    }
                    i14++;
                    bArr3 = bArr2;
                }
            }
            String str = new String(bArr2, 0, i14);
            GLES20.glGetAttribLocation(i12, str);
            a aVar = new a(str);
            this.f15909b[i11] = aVar;
            this.f15911d.put(str, aVar);
            i11++;
            i10 = 1;
        }
        this.f15912e = new HashMap();
        int i15 = 1;
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f15908a, 35718, iArr4, 0);
        this.f15910c = new b[iArr4[0]];
        int i16 = 0;
        while (i16 < iArr4[0]) {
            int i17 = this.f15908a;
            int[] iArr5 = new int[i15];
            GLES20.glGetProgramiv(i17, 35719, iArr5, 0);
            int i18 = iArr5[0];
            byte[] bArr4 = new byte[i18];
            GLES20.glGetActiveUniform(i17, i16, i18, new int[i15], 0, new int[i15], 0, new int[i15], 0, bArr4, 0);
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    bArr = bArr4;
                    i19 = i18;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i19] == 0) {
                        break;
                    }
                    i19++;
                    bArr4 = bArr;
                }
            }
            String str2 = new String(bArr, 0, i19);
            GLES20.glGetUniformLocation(i17, str2);
            b bVar = new b(str2);
            this.f15910c[i16] = bVar;
            this.f15912e.put(str2, bVar);
            i16++;
            i15 = 1;
        }
        j.a();
    }

    public static void a(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        j.b(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, iArr[0] == 1);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        j.a();
    }
}

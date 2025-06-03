package v5;

import android.opengl.GLES20;
import f;
import java.util.HashMap;

public final class i
{
  public final int a;
  public final a[] b;
  public final b[] c;
  public final HashMap d;
  public final HashMap e;
  
  public i()
  {
    int i = GLES20.glCreateProgram();
    a = i;
    j.a();
    a(i, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
    a(i, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
    GLES20.glLinkProgram(i);
    Object localObject1 = new int[1];
    localObject1[0] = 0;
    GLES20.glGetProgramiv(i, 35714, (int[])localObject1, 0);
    boolean bool;
    if (localObject1[0] == 1) {
      bool = true;
    } else {
      bool = false;
    }
    localObject1 = f.l("Unable to link shader program: \n");
    ((StringBuilder)localObject1).append(GLES20.glGetProgramInfoLog(i));
    j.b(((StringBuilder)localObject1).toString(), bool);
    GLES20.glUseProgram(i);
    d = new HashMap();
    int[] arrayOfInt1 = new int[1];
    GLES20.glGetProgramiv(i, 35721, arrayOfInt1, 0);
    b = new a[arrayOfInt1[0]];
    int k;
    int m;
    Object localObject2;
    int[] arrayOfInt2;
    int[] arrayOfInt3;
    for (int j = 0; j < arrayOfInt1[0]; j++)
    {
      k = a;
      localObject1 = new int[1];
      GLES20.glGetProgramiv(k, 35722, (int[])localObject1, 0);
      m = localObject1[0];
      localObject1 = new byte[m];
      localObject2 = new int[1];
      arrayOfInt2 = new int[1];
      arrayOfInt3 = new int[1];
      GLES20.glGetActiveAttrib(k, j, m, (int[])localObject2, 0, arrayOfInt2, 0, arrayOfInt3, 0, (byte[])localObject1, 0);
      i = 0;
      while (i < m)
      {
        localObject2 = localObject1;
        if (localObject2[i] == 0) {
          break label238;
        }
        i++;
        localObject1 = localObject2;
      }
      i = m;
      label238:
      localObject2 = new String((byte[])localObject1, 0, i);
      GLES20.glGetAttribLocation(k, (String)localObject2);
      localObject1 = new a((String)localObject2);
      b[j] = localObject1;
      d.put(localObject2, localObject1);
    }
    e = new HashMap();
    arrayOfInt1 = new int[1];
    GLES20.glGetProgramiv(a, 35718, arrayOfInt1, 0);
    c = new b[arrayOfInt1[0]];
    for (j = 0; j < arrayOfInt1[0]; j++)
    {
      k = a;
      localObject1 = new int[1];
      GLES20.glGetProgramiv(k, 35719, (int[])localObject1, 0);
      localObject2 = new int[1];
      m = localObject1[0];
      localObject1 = new byte[m];
      arrayOfInt3 = new int[1];
      arrayOfInt2 = new int[1];
      GLES20.glGetActiveUniform(k, j, m, arrayOfInt3, 0, arrayOfInt2, 0, (int[])localObject2, 0, (byte[])localObject1, 0);
      i = 0;
      while (i < m)
      {
        localObject2 = localObject1;
        if (localObject2[i] == 0) {
          break label441;
        }
        i++;
        localObject1 = localObject2;
      }
      i = m;
      label441:
      localObject1 = new String((byte[])localObject1, 0, i);
      GLES20.glGetUniformLocation(k, (String)localObject1);
      localObject2 = new b((String)localObject1);
      c[j] = localObject2;
      e.put(localObject1, localObject2);
    }
    j.a();
  }
  
  public static void a(int paramInt1, int paramInt2, String paramString)
  {
    paramInt2 = GLES20.glCreateShader(paramInt2);
    GLES20.glShaderSource(paramInt2, paramString);
    GLES20.glCompileShader(paramInt2);
    boolean bool = true;
    Object localObject = new int[1];
    localObject[0] = 0;
    GLES20.glGetShaderiv(paramInt2, 35713, (int[])localObject, 0);
    if (localObject[0] != 1) {
      bool = false;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(GLES20.glGetShaderInfoLog(paramInt2));
    ((StringBuilder)localObject).append(", source: ");
    ((StringBuilder)localObject).append(paramString);
    j.b(((StringBuilder)localObject).toString(), bool);
    GLES20.glAttachShader(paramInt1, paramInt2);
    GLES20.glDeleteShader(paramInt2);
    j.a();
  }
  
  public static final class a
  {
    public a(String paramString) {}
  }
  
  public static final class b
  {
    public b(String paramString) {}
  }
}

/* Location:
 * Qualified Name:     v5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
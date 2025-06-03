.class public final Lw5/h$a;
.super Landroid/os/HandlerThread;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lv5/g;

.field public b:Landroid/os/Handler;

.field public c:Ljava/lang/Error;

.field public d:Ljava/lang/RuntimeException;

.field public e:Lw5/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ExoPlayer:PlaceholderSurface"

    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 14

    .line 1
    iget-object v0, p0, Lw5/h$a;->a:Lv5/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw5/h$a;->a:Lv5/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v10, 0x1

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    move v3, v10

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v1

    .line 22
    :goto_0
    const-string v4, "eglGetDisplay failed"

    .line 23
    .line 24
    invoke-static {v4, v3}, Lv5/j;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const/4 v11, 0x2

    .line 28
    new-array v3, v11, [I

    .line 29
    .line 30
    invoke-static {v2, v3, v1, v3, v10}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const-string v4, "eglInitialize failed"

    .line 35
    .line 36
    invoke-static {v4, v3}, Lv5/j;->b(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    iput-object v2, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 40
    .line 41
    new-array v12, v10, [Landroid/opengl/EGLConfig;

    .line 42
    .line 43
    new-array v13, v10, [I

    .line 44
    .line 45
    sget-object v3, Lv5/g;->o:[I

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x1

    .line 50
    const/4 v9, 0x0

    .line 51
    move-object v5, v12

    .line 52
    move-object v8, v13

    .line 53
    invoke-static/range {v2 .. v9}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    aget v3, v13, v1

    .line 60
    .line 61
    if-lez v3, :cond_1

    .line 62
    .line 63
    aget-object v3, v12, v1

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    move v3, v10

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move v3, v1

    .line 70
    :goto_1
    const/4 v4, 0x3

    .line 71
    new-array v5, v4, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    aput-object v2, v5, v1

    .line 78
    .line 79
    aget v2, v13, v1

    .line 80
    .line 81
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    aput-object v2, v5, v10

    .line 86
    .line 87
    aget-object v2, v12, v1

    .line 88
    .line 89
    aput-object v2, v5, v11

    .line 90
    .line 91
    const-string v2, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"

    .line 92
    .line 93
    invoke-static {v2, v5}, Lv5/e0;->m(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v2, v3}, Lv5/j;->b(Ljava/lang/String;Z)V

    .line 98
    .line 99
    .line 100
    aget-object v2, v12, v1

    .line 101
    .line 102
    iget-object v3, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 103
    .line 104
    const/4 v5, 0x5

    .line 105
    if-nez p1, :cond_2

    .line 106
    .line 107
    new-array v4, v4, [I

    .line 108
    .line 109
    fill-array-data v4, :array_0

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    new-array v4, v5, [I

    .line 114
    .line 115
    fill-array-data v4, :array_1

    .line 116
    .line 117
    .line 118
    :goto_2
    sget-object v6, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 119
    .line 120
    invoke-static {v3, v2, v6, v4, v1}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    move v4, v10

    .line 127
    goto :goto_3

    .line 128
    :cond_3
    move v4, v1

    .line 129
    :goto_3
    const-string v6, "eglCreateContext failed"

    .line 130
    .line 131
    invoke-static {v6, v4}, Lv5/j;->b(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    iput-object v3, v0, Lv5/g;->d:Landroid/opengl/EGLContext;

    .line 135
    .line 136
    iget-object v4, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 137
    .line 138
    if-ne p1, v10, :cond_4

    .line 139
    .line 140
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_4
    if-ne p1, v11, :cond_5

    .line 144
    .line 145
    const/4 v5, 0x7

    .line 146
    new-array v5, v5, [I

    .line 147
    .line 148
    fill-array-data v5, :array_2

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_5
    new-array v5, v5, [I

    .line 153
    .line 154
    fill-array-data v5, :array_3

    .line 155
    .line 156
    .line 157
    :goto_4
    invoke-static {v4, v2, v5, v1}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-eqz v2, :cond_6

    .line 162
    .line 163
    move v5, v10

    .line 164
    goto :goto_5

    .line 165
    :cond_6
    move v5, v1

    .line 166
    :goto_5
    const-string v6, "eglCreatePbufferSurface failed"

    .line 167
    .line 168
    invoke-static {v6, v5}, Lv5/j;->b(Ljava/lang/String;Z)V

    .line 169
    .line 170
    .line 171
    :goto_6
    invoke-static {v4, v2, v2, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    const-string v4, "eglMakeCurrent failed"

    .line 176
    .line 177
    invoke-static {v4, v3}, Lv5/j;->b(Ljava/lang/String;Z)V

    .line 178
    .line 179
    .line 180
    iput-object v2, v0, Lv5/g;->e:Landroid/opengl/EGLSurface;

    .line 181
    .line 182
    iget-object v2, v0, Lv5/g;->b:[I

    .line 183
    .line 184
    invoke-static {v10, v2, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Lv5/j;->a()V

    .line 188
    .line 189
    .line 190
    new-instance v2, Landroid/graphics/SurfaceTexture;

    .line 191
    .line 192
    iget-object v3, v0, Lv5/g;->b:[I

    .line 193
    .line 194
    aget v3, v3, v1

    .line 195
    .line 196
    invoke-direct {v2, v3}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    .line 197
    .line 198
    .line 199
    iput-object v2, v0, Lv5/g;->f:Landroid/graphics/SurfaceTexture;

    .line 200
    .line 201
    invoke-virtual {v2, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 202
    .line 203
    .line 204
    new-instance v0, Lw5/h;

    .line 205
    .line 206
    iget-object v2, p0, Lw5/h$a;->a:Lv5/g;

    .line 207
    .line 208
    iget-object v2, v2, Lv5/g;->f:Landroid/graphics/SurfaceTexture;

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    if-eqz p1, :cond_7

    .line 214
    .line 215
    move v1, v10

    .line 216
    :cond_7
    invoke-direct {v0, p0, v2, v1}, Lw5/h;-><init>(Lw5/h$a;Landroid/graphics/SurfaceTexture;Z)V

    .line 217
    .line 218
    .line 219
    iput-object v0, p0, Lw5/h$a;->e:Lw5/h;

    .line 220
    .line 221
    return-void

    .line 222
    nop

    .line 223
    :array_0
    .array-data 4
        0x3098
        0x2
        0x3038
    .end array-data

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    :array_1
    .array-data 4
        0x3098
        0x2
        0x32c0
        0x1
        0x3038
    .end array-data

    :array_2
    .array-data 4
        0x3057
        0x1
        0x3056
        0x1
        0x32c0
        0x1
        0x3038
    .end array-data

    :array_3
    .array-data 4
        0x3057
        0x1
        0x3056
        0x1
        0x3038
    .end array-data
.end method

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, Lw5/h$a;->a:Lv5/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw5/h$a;->a:Lv5/g;

    .line 7
    .line 8
    iget-object v1, v0, Lv5/g;->a:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x13

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :try_start_0
    iget-object v3, v0, Lv5/g;->f:Landroid/graphics/SurfaceTexture;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3}, Landroid/graphics/SurfaceTexture;->release()V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    iget-object v4, v0, Lv5/g;->b:[I

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-static {v3, v4, v5}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v3, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    iget-object v3, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 43
    .line 44
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 45
    .line 46
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 47
    .line 48
    invoke-static {v3, v4, v4, v5}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v3, v0, Lv5/g;->e:Landroid/opengl/EGLSurface;

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    iget-object v3, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 64
    .line 65
    iget-object v4, v0, Lv5/g;->e:Landroid/opengl/EGLSurface;

    .line 66
    .line 67
    invoke-static {v3, v4}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object v3, v0, Lv5/g;->d:Landroid/opengl/EGLContext;

    .line 71
    .line 72
    if-eqz v3, :cond_3

    .line 73
    .line 74
    iget-object v4, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 75
    .line 76
    invoke-static {v4, v3}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 77
    .line 78
    .line 79
    :cond_3
    sget v3, Lv5/e0;->a:I

    .line 80
    .line 81
    if-lt v3, v1, :cond_4

    .line 82
    .line 83
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 84
    .line 85
    .line 86
    :cond_4
    iget-object v1, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 87
    .line 88
    if-eqz v1, :cond_5

    .line 89
    .line 90
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 91
    .line 92
    invoke-virtual {v1, v3}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_5

    .line 97
    .line 98
    iget-object v1, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 99
    .line 100
    invoke-static {v1}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 101
    .line 102
    .line 103
    :cond_5
    iput-object v2, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 104
    .line 105
    iput-object v2, v0, Lv5/g;->d:Landroid/opengl/EGLContext;

    .line 106
    .line 107
    iput-object v2, v0, Lv5/g;->e:Landroid/opengl/EGLSurface;

    .line 108
    .line 109
    iput-object v2, v0, Lv5/g;->f:Landroid/graphics/SurfaceTexture;

    .line 110
    .line 111
    return-void

    .line 112
    :catchall_0
    move-exception v3

    .line 113
    iget-object v4, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 114
    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-nez v4, :cond_6

    .line 124
    .line 125
    iget-object v4, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 126
    .line 127
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 128
    .line 129
    sget-object v6, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 130
    .line 131
    invoke-static {v4, v5, v5, v6}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 132
    .line 133
    .line 134
    :cond_6
    iget-object v4, v0, Lv5/g;->e:Landroid/opengl/EGLSurface;

    .line 135
    .line 136
    if-eqz v4, :cond_7

    .line 137
    .line 138
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 139
    .line 140
    invoke-virtual {v4, v5}, Landroid/opengl/EGLSurface;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-nez v4, :cond_7

    .line 145
    .line 146
    iget-object v4, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 147
    .line 148
    iget-object v5, v0, Lv5/g;->e:Landroid/opengl/EGLSurface;

    .line 149
    .line 150
    invoke-static {v4, v5}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 151
    .line 152
    .line 153
    :cond_7
    iget-object v4, v0, Lv5/g;->d:Landroid/opengl/EGLContext;

    .line 154
    .line 155
    if-eqz v4, :cond_8

    .line 156
    .line 157
    iget-object v5, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 158
    .line 159
    invoke-static {v5, v4}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 160
    .line 161
    .line 162
    :cond_8
    sget v4, Lv5/e0;->a:I

    .line 163
    .line 164
    if-lt v4, v1, :cond_9

    .line 165
    .line 166
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 167
    .line 168
    .line 169
    :cond_9
    iget-object v1, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 170
    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 174
    .line 175
    invoke-virtual {v1, v4}, Landroid/opengl/EGLDisplay;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-nez v1, :cond_a

    .line 180
    .line 181
    iget-object v1, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 182
    .line 183
    invoke-static {v1}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 184
    .line 185
    .line 186
    :cond_a
    iput-object v2, v0, Lv5/g;->c:Landroid/opengl/EGLDisplay;

    .line 187
    .line 188
    iput-object v2, v0, Lv5/g;->d:Landroid/opengl/EGLContext;

    .line 189
    .line 190
    iput-object v2, v0, Lv5/g;->e:Landroid/opengl/EGLSurface;

    .line 191
    .line 192
    iput-object v2, v0, Lv5/g;->f:Landroid/graphics/SurfaceTexture;

    .line 193
    .line 194
    throw v3
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x2

    if-eq v0, p1, :cond_0

    return v1

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lw5/h$a;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    const-string v0, "PlaceholderSurface"

    const-string v2, "Failed to release placeholder surface"

    invoke-static {v0, v2, p1}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :goto_1
    return v1

    :catchall_1
    move-exception p1

    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    throw p1

    :cond_1
    :try_start_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, p1}, Lw5/h$a;->a(I)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lv5/j$a; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    monitor-enter p0

    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    monitor-exit p0

    goto :goto_2

    :catchall_2
    move-exception p1

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1

    :catchall_3
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    :try_start_4
    const-string v0, "PlaceholderSurface"

    const-string v2, "Failed to initialize placeholder surface"

    invoke-static {v0, v2, p1}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Lw5/h$a;->c:Ljava/lang/Error;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    monitor-enter p0

    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    monitor-exit p0

    goto :goto_2

    :catchall_4
    move-exception p1

    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw p1

    :catch_1
    move-exception p1

    :try_start_6
    const-string v0, "PlaceholderSurface"

    const-string v2, "Failed to initialize placeholder surface"

    invoke-static {v0, v2, p1}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lw5/h$a;->d:Ljava/lang/RuntimeException;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    monitor-enter p0

    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    monitor-exit p0

    goto :goto_2

    :catchall_5
    move-exception p1

    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw p1

    :catch_2
    move-exception p1

    :try_start_8
    const-string v0, "PlaceholderSurface"

    const-string v2, "Failed to initialize placeholder surface"

    invoke-static {v0, v2, p1}, Lv5/m;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Lw5/h$a;->d:Ljava/lang/RuntimeException;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    monitor-enter p0

    :try_start_9
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    monitor-exit p0

    :goto_2
    return v1

    :catchall_6
    move-exception p1

    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    throw p1

    :goto_3
    monitor-enter p0

    :try_start_a
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    throw p1

    :catchall_7
    move-exception p1

    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    throw p1
.end method

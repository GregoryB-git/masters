.class public final Lx5/j;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/j$a;,
        Lx5/j$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lx5/j$b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/hardware/SensorManager;

.field public final c:Landroid/hardware/Sensor;

.field public final d:Lx5/d;

.field public final e:Landroid/os/Handler;

.field public final f:Lx5/i;

.field public o:Landroid/graphics/SurfaceTexture;

.field public p:Landroid/view/Surface;

.field public q:Z

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lx5/j;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    new-instance v1, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lx5/j;->e:Landroid/os/Handler;

    .line 22
    .line 23
    const-string v1, "sensor"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast v1, Landroid/hardware/SensorManager;

    .line 33
    .line 34
    iput-object v1, p0, Lx5/j;->b:Landroid/hardware/SensorManager;

    .line 35
    .line 36
    sget v2, Lv5/e0;->a:I

    .line 37
    .line 38
    const/16 v3, 0x12

    .line 39
    .line 40
    if-lt v2, v3, :cond_0

    .line 41
    .line 42
    const/16 v0, 0xf

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_0
    if-nez v0, :cond_1

    .line 49
    .line 50
    const/16 v0, 0xb

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_1
    iput-object v0, p0, Lx5/j;->c:Landroid/hardware/Sensor;

    .line 57
    .line 58
    new-instance v0, Lx5/i;

    .line 59
    .line 60
    invoke-direct {v0}, Lx5/i;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lx5/j;->f:Lx5/i;

    .line 64
    .line 65
    new-instance v1, Lx5/j$a;

    .line 66
    .line 67
    invoke-direct {v1, p0, v0}, Lx5/j$a;-><init>(Lx5/j;Lx5/i;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lx5/k;

    .line 71
    .line 72
    invoke-direct {v0, p1, v1}, Lx5/k;-><init>(Landroid/content/Context;Lx5/j$a;)V

    .line 73
    .line 74
    .line 75
    const-string v2, "window"

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Landroid/view/WindowManager;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v2, Lx5/d;

    .line 91
    .line 92
    const/4 v3, 0x2

    .line 93
    new-array v4, v3, [Lx5/d$a;

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    aput-object v0, v4, v5

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    aput-object v1, v4, v5

    .line 100
    .line 101
    invoke-direct {v2, p1, v4}, Lx5/d;-><init>(Landroid/view/Display;[Lx5/d$a;)V

    .line 102
    .line 103
    .line 104
    iput-object v2, p0, Lx5/j;->d:Lx5/d;

    .line 105
    .line 106
    iput-boolean v5, p0, Lx5/j;->q:Z

    .line 107
    .line 108
    invoke-virtual {p0, v3}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 115
    .line 116
    .line 117
    return-void
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
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
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-boolean v0, p0, Lx5/j;->q:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lx5/j;->r:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lx5/j;->c:Landroid/hardware/Sensor;

    if-eqz v2, :cond_3

    iget-boolean v3, p0, Lx5/j;->s:Z

    if-ne v0, v3, :cond_1

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    iget-object v3, p0, Lx5/j;->b:Landroid/hardware/SensorManager;

    iget-object v4, p0, Lx5/j;->d:Lx5/d;

    invoke-virtual {v3, v4, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lx5/j;->b:Landroid/hardware/SensorManager;

    iget-object v2, p0, Lx5/j;->d:Lx5/d;

    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    :goto_1
    iput-boolean v0, p0, Lx5/j;->s:Z

    :cond_3
    :goto_2
    return-void
.end method

.method public getCameraMotionListener()Lx5/a;
    .locals 1

    iget-object v0, p0, Lx5/j;->f:Lx5/i;

    return-object v0
.end method

.method public getVideoFrameMetadataListener()Lw5/i;
    .locals 1

    iget-object v0, p0, Lx5/j;->f:Lx5/i;

    return-object v0
.end method

.method public getVideoSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lx5/j;->p:Landroid/view/Surface;

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    iget-object v0, p0, Lx5/j;->e:Landroid/os/Handler;

    new-instance v1, Lb/d;

    const/16 v2, 0xc

    invoke-direct {v1, p0, v2}, Lb/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onPause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx5/j;->r:Z

    invoke-virtual {p0}, Lx5/j;->a()V

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx5/j;->r:Z

    invoke-virtual {p0}, Lx5/j;->a()V

    return-void
.end method

.method public setDefaultStereoMode(I)V
    .locals 1

    iget-object v0, p0, Lx5/j;->f:Lx5/i;

    iput p1, v0, Lx5/i;->s:I

    return-void
.end method

.method public setUseSensorRotation(Z)V
    .locals 0

    iput-boolean p1, p0, Lx5/j;->q:Z

    invoke-virtual {p0}, Lx5/j;->a()V

    return-void
.end method

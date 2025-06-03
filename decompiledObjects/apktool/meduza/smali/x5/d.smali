.class public final Lx5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/d$a;
    }
.end annotation


# instance fields
.field public final a:[F

.field public final b:[F

.field public final c:[F

.field public final d:[F

.field public final e:Landroid/view/Display;

.field public final f:[Lx5/d$a;

.field public g:Z


# direct methods
.method public varargs constructor <init>(Landroid/view/Display;[Lx5/d$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, Lx5/d;->a:[F

    new-array v1, v0, [F

    iput-object v1, p0, Lx5/d;->b:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lx5/d;->c:[F

    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Lx5/d;->d:[F

    iput-object p1, p0, Lx5/d;->e:Landroid/view/Display;

    iput-object p2, p0, Lx5/d;->f:[Lx5/d$a;

    return-void
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx5/d;->a:[F

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    iget-object v2, v2, Landroid/hardware/SensorEvent;->values:[F

    .line 8
    .line 9
    invoke-static {v1, v2}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lx5/d;->a:[F

    .line 13
    .line 14
    iget-object v2, v0, Lx5/d;->e:Landroid/view/Display;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x2

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    const/16 v6, 0x82

    .line 26
    .line 27
    const/16 v7, 0x81

    .line 28
    .line 29
    if-eq v2, v5, :cond_2

    .line 30
    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    const/4 v7, 0x3

    .line 34
    if-ne v2, v7, :cond_0

    .line 35
    .line 36
    move v7, v5

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :cond_1
    move/from16 v18, v7

    .line 45
    .line 46
    move v7, v6

    .line 47
    move/from16 v6, v18

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v6, v3

    .line 51
    :goto_0
    iget-object v2, v0, Lx5/d;->b:[F

    .line 52
    .line 53
    array-length v8, v2

    .line 54
    invoke-static {v1, v4, v2, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v0, Lx5/d;->b:[F

    .line 58
    .line 59
    invoke-static {v2, v6, v7, v1}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    .line 60
    .line 61
    .line 62
    :cond_3
    iget-object v1, v0, Lx5/d;->a:[F

    .line 63
    .line 64
    iget-object v2, v0, Lx5/d;->b:[F

    .line 65
    .line 66
    const/16 v6, 0x83

    .line 67
    .line 68
    invoke-static {v1, v5, v6, v2}, Landroid/hardware/SensorManager;->remapCoordinateSystem([FII[F)Z

    .line 69
    .line 70
    .line 71
    iget-object v1, v0, Lx5/d;->b:[F

    .line 72
    .line 73
    iget-object v2, v0, Lx5/d;->d:[F

    .line 74
    .line 75
    invoke-static {v1, v2}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 76
    .line 77
    .line 78
    iget-object v1, v0, Lx5/d;->d:[F

    .line 79
    .line 80
    aget v1, v1, v3

    .line 81
    .line 82
    iget-object v6, v0, Lx5/d;->a:[F

    .line 83
    .line 84
    const/4 v7, 0x0

    .line 85
    const/high16 v8, 0x42b40000    # 90.0f

    .line 86
    .line 87
    const/high16 v9, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v11, 0x0

    .line 91
    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 92
    .line 93
    .line 94
    iget-object v12, v0, Lx5/d;->a:[F

    .line 95
    .line 96
    iget-boolean v2, v0, Lx5/d;->g:Z

    .line 97
    .line 98
    if-nez v2, :cond_4

    .line 99
    .line 100
    iget-object v2, v0, Lx5/d;->c:[F

    .line 101
    .line 102
    invoke-static {v2, v12}, Lx5/c;->a([F[F)V

    .line 103
    .line 104
    .line 105
    iput-boolean v5, v0, Lx5/d;->g:Z

    .line 106
    .line 107
    :cond_4
    iget-object v2, v0, Lx5/d;->b:[F

    .line 108
    .line 109
    array-length v3, v2

    .line 110
    invoke-static {v12, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    .line 112
    .line 113
    const/4 v13, 0x0

    .line 114
    iget-object v14, v0, Lx5/d;->b:[F

    .line 115
    .line 116
    const/4 v15, 0x0

    .line 117
    iget-object v2, v0, Lx5/d;->c:[F

    .line 118
    .line 119
    const/16 v17, 0x0

    .line 120
    .line 121
    move-object/from16 v16, v2

    .line 122
    .line 123
    invoke-static/range {v12 .. v17}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 124
    .line 125
    .line 126
    iget-object v2, v0, Lx5/d;->a:[F

    .line 127
    .line 128
    iget-object v3, v0, Lx5/d;->f:[Lx5/d$a;

    .line 129
    .line 130
    array-length v5, v3

    .line 131
    :goto_1
    if-ge v4, v5, :cond_5

    .line 132
    .line 133
    aget-object v6, v3, v4

    .line 134
    .line 135
    invoke-interface {v6, v2, v1}, Lx5/d$a;->a([FF)V

    .line 136
    .line 137
    .line 138
    add-int/lit8 v4, v4, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_5
    return-void
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

.class public final Lv3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lv5/z;

.field public c:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Lv3/m1;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Lz4/t$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Lr5/o;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Lv3/n0;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Lt5/e;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ln7/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/e<",
            "Lv5/c;",
            "Lw3/a;",
            ">;"
        }
    .end annotation
.end field

.field public i:Landroid/os/Looper;

.field public j:Lx3/d;

.field public k:I

.field public l:Z

.field public m:Lv3/n1;

.field public n:J

.field public o:J

.field public p:Lv3/m0;

.field public q:J

.field public r:J

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Ld;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, v1, v3}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    new-instance v4, Lv3/p;

    .line 12
    .line 13
    invoke-direct {v4, v1}, Lv3/p;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    new-instance v5, Le;

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    invoke-direct {v5, v1, v6}, Le;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    new-instance v7, Le0/d;

    .line 23
    .line 24
    invoke-direct {v7, v3}, Le0/d;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Ld;

    .line 28
    .line 29
    invoke-direct {v3, v1, v6}, Ld;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    new-instance v8, Lv3/q;

    .line 33
    .line 34
    invoke-direct {v8}, Lv3/q;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iput-object v1, v0, Lv3/r;->a:Landroid/content/Context;

    .line 44
    .line 45
    iput-object v2, v0, Lv3/r;->c:Ln7/q;

    .line 46
    .line 47
    iput-object v4, v0, Lv3/r;->d:Ln7/q;

    .line 48
    .line 49
    iput-object v5, v0, Lv3/r;->e:Ln7/q;

    .line 50
    .line 51
    iput-object v7, v0, Lv3/r;->f:Ln7/q;

    .line 52
    .line 53
    iput-object v3, v0, Lv3/r;->g:Ln7/q;

    .line 54
    .line 55
    iput-object v8, v0, Lv3/r;->h:Ln7/e;

    .line 56
    .line 57
    sget v1, Lv5/e0;->a:I

    .line 58
    .line 59
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :goto_0
    iput-object v1, v0, Lv3/r;->i:Landroid/os/Looper;

    .line 71
    .line 72
    sget-object v1, Lx3/d;->o:Lx3/d;

    .line 73
    .line 74
    iput-object v1, v0, Lv3/r;->j:Lx3/d;

    .line 75
    .line 76
    iput v6, v0, Lv3/r;->k:I

    .line 77
    .line 78
    iput-boolean v6, v0, Lv3/r;->l:Z

    .line 79
    .line 80
    sget-object v1, Lv3/n1;->c:Lv3/n1;

    .line 81
    .line 82
    iput-object v1, v0, Lv3/r;->m:Lv3/n1;

    .line 83
    .line 84
    const-wide/16 v1, 0x1388

    .line 85
    .line 86
    iput-wide v1, v0, Lv3/r;->n:J

    .line 87
    .line 88
    const-wide/16 v1, 0x3a98

    .line 89
    .line 90
    iput-wide v1, v0, Lv3/r;->o:J

    .line 91
    .line 92
    const v8, 0x3f7851ec    # 0.97f

    .line 93
    .line 94
    .line 95
    const v9, 0x3f83d70a    # 1.03f

    .line 96
    .line 97
    .line 98
    const-wide/16 v10, 0x3e8

    .line 99
    .line 100
    const v12, 0x33d6bf95    # 1.0E-7f

    .line 101
    .line 102
    .line 103
    const-wide/16 v1, 0x14

    .line 104
    .line 105
    invoke-static {v1, v2}, Lv5/e0;->I(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v13

    .line 109
    const-wide/16 v1, 0x1f4

    .line 110
    .line 111
    invoke-static {v1, v2}, Lv5/e0;->I(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v15

    .line 115
    const v17, 0x3f7fbe77    # 0.999f

    .line 116
    .line 117
    .line 118
    new-instance v3, Lv3/i;

    .line 119
    .line 120
    move-object v7, v3

    .line 121
    invoke-direct/range {v7 .. v17}, Lv3/i;-><init>(FFJFJJF)V

    .line 122
    .line 123
    .line 124
    iput-object v3, v0, Lv3/r;->p:Lv3/m0;

    .line 125
    .line 126
    sget-object v3, Lv5/c;->a:Lv5/z;

    .line 127
    .line 128
    iput-object v3, v0, Lv3/r;->b:Lv5/z;

    .line 129
    .line 130
    iput-wide v1, v0, Lv3/r;->q:J

    .line 131
    .line 132
    const-wide/16 v1, 0x7d0

    .line 133
    .line 134
    iput-wide v1, v0, Lv3/r;->r:J

    .line 135
    .line 136
    iput-boolean v6, v0, Lv3/r;->s:Z

    .line 137
    .line 138
    return-void
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

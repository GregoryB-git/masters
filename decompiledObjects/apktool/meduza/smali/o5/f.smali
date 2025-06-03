.class public final Lo5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Z

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:F

.field public l:Ljava/lang/String;

.field public m:I

.field public n:I

.field public o:Landroid/text/Layout$Alignment;

.field public p:Landroid/text/Layout$Alignment;

.field public q:I

.field public r:Lo5/b;

.field public s:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lo5/f;->f:I

    iput v0, p0, Lo5/f;->g:I

    iput v0, p0, Lo5/f;->h:I

    iput v0, p0, Lo5/f;->i:I

    iput v0, p0, Lo5/f;->j:I

    iput v0, p0, Lo5/f;->m:I

    iput v0, p0, Lo5/f;->n:I

    iput v0, p0, Lo5/f;->q:I

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo5/f;->s:F

    return-void
.end method


# virtual methods
.method public final a(Lo5/f;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    iget-boolean v0, p0, Lo5/f;->c:Z

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p1, Lo5/f;->c:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v0, p1, Lo5/f;->b:I

    .line 13
    .line 14
    iput v0, p0, Lo5/f;->b:I

    .line 15
    .line 16
    iput-boolean v1, p0, Lo5/f;->c:Z

    .line 17
    .line 18
    :cond_0
    iget v0, p0, Lo5/f;->h:I

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    iget v0, p1, Lo5/f;->h:I

    .line 24
    .line 25
    iput v0, p0, Lo5/f;->h:I

    .line 26
    .line 27
    :cond_1
    iget v0, p0, Lo5/f;->i:I

    .line 28
    .line 29
    if-ne v0, v2, :cond_2

    .line 30
    .line 31
    iget v0, p1, Lo5/f;->i:I

    .line 32
    .line 33
    iput v0, p0, Lo5/f;->i:I

    .line 34
    .line 35
    :cond_2
    iget-object v0, p0, Lo5/f;->a:Ljava/lang/String;

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    iget-object v0, p1, Lo5/f;->a:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iput-object v0, p0, Lo5/f;->a:Ljava/lang/String;

    .line 44
    .line 45
    :cond_3
    iget v0, p0, Lo5/f;->f:I

    .line 46
    .line 47
    if-ne v0, v2, :cond_4

    .line 48
    .line 49
    iget v0, p1, Lo5/f;->f:I

    .line 50
    .line 51
    iput v0, p0, Lo5/f;->f:I

    .line 52
    .line 53
    :cond_4
    iget v0, p0, Lo5/f;->g:I

    .line 54
    .line 55
    if-ne v0, v2, :cond_5

    .line 56
    .line 57
    iget v0, p1, Lo5/f;->g:I

    .line 58
    .line 59
    iput v0, p0, Lo5/f;->g:I

    .line 60
    .line 61
    :cond_5
    iget v0, p0, Lo5/f;->n:I

    .line 62
    .line 63
    if-ne v0, v2, :cond_6

    .line 64
    .line 65
    iget v0, p1, Lo5/f;->n:I

    .line 66
    .line 67
    iput v0, p0, Lo5/f;->n:I

    .line 68
    .line 69
    :cond_6
    iget-object v0, p0, Lo5/f;->o:Landroid/text/Layout$Alignment;

    .line 70
    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    iget-object v0, p1, Lo5/f;->o:Landroid/text/Layout$Alignment;

    .line 74
    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    iput-object v0, p0, Lo5/f;->o:Landroid/text/Layout$Alignment;

    .line 78
    .line 79
    :cond_7
    iget-object v0, p0, Lo5/f;->p:Landroid/text/Layout$Alignment;

    .line 80
    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    iget-object v0, p1, Lo5/f;->p:Landroid/text/Layout$Alignment;

    .line 84
    .line 85
    if-eqz v0, :cond_8

    .line 86
    .line 87
    iput-object v0, p0, Lo5/f;->p:Landroid/text/Layout$Alignment;

    .line 88
    .line 89
    :cond_8
    iget v0, p0, Lo5/f;->q:I

    .line 90
    .line 91
    if-ne v0, v2, :cond_9

    .line 92
    .line 93
    iget v0, p1, Lo5/f;->q:I

    .line 94
    .line 95
    iput v0, p0, Lo5/f;->q:I

    .line 96
    .line 97
    :cond_9
    iget v0, p0, Lo5/f;->j:I

    .line 98
    .line 99
    if-ne v0, v2, :cond_a

    .line 100
    .line 101
    iget v0, p1, Lo5/f;->j:I

    .line 102
    .line 103
    iput v0, p0, Lo5/f;->j:I

    .line 104
    .line 105
    iget v0, p1, Lo5/f;->k:F

    .line 106
    .line 107
    iput v0, p0, Lo5/f;->k:F

    .line 108
    .line 109
    :cond_a
    iget-object v0, p0, Lo5/f;->r:Lo5/b;

    .line 110
    .line 111
    if-nez v0, :cond_b

    .line 112
    .line 113
    iget-object v0, p1, Lo5/f;->r:Lo5/b;

    .line 114
    .line 115
    iput-object v0, p0, Lo5/f;->r:Lo5/b;

    .line 116
    .line 117
    :cond_b
    iget v0, p0, Lo5/f;->s:F

    .line 118
    .line 119
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 120
    .line 121
    .line 122
    cmpl-float v0, v0, v3

    .line 123
    .line 124
    if-nez v0, :cond_c

    .line 125
    .line 126
    iget v0, p1, Lo5/f;->s:F

    .line 127
    .line 128
    iput v0, p0, Lo5/f;->s:F

    .line 129
    .line 130
    :cond_c
    iget-boolean v0, p0, Lo5/f;->e:Z

    .line 131
    .line 132
    if-nez v0, :cond_d

    .line 133
    .line 134
    iget-boolean v0, p1, Lo5/f;->e:Z

    .line 135
    .line 136
    if-eqz v0, :cond_d

    .line 137
    .line 138
    iget v0, p1, Lo5/f;->d:I

    .line 139
    .line 140
    iput v0, p0, Lo5/f;->d:I

    .line 141
    .line 142
    iput-boolean v1, p0, Lo5/f;->e:Z

    .line 143
    .line 144
    :cond_d
    iget v0, p0, Lo5/f;->m:I

    .line 145
    .line 146
    if-ne v0, v2, :cond_e

    .line 147
    .line 148
    iget p1, p1, Lo5/f;->m:I

    .line 149
    .line 150
    if-eq p1, v2, :cond_e

    .line 151
    .line 152
    iput p1, p0, Lo5/f;->m:I

    .line 153
    .line 154
    :cond_e
    return-void
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

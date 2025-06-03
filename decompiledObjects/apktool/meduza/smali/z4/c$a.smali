.class public final Lz4/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Lz4/c0;

.field public b:Z

.field public final synthetic c:Lz4/c;


# direct methods
.method public constructor <init>(Lz4/c;Lz4/c0;)V
    .locals 0

    iput-object p1, p0, Lz4/c$a;->c:Lz4/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz4/c$a;->a:Lz4/c0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lz4/c$a;->a:Lz4/c0;

    invoke-interface {v0}, Lz4/c0;->a()V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lz4/c$a;->c:Lz4/c;

    invoke-virtual {v0}, Lz4/c;->f()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz4/c$a;->a:Lz4/c0;

    invoke-interface {v0}, Lz4/c0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final m(J)I
    .locals 1

    iget-object v0, p0, Lz4/c$a;->c:Lz4/c;

    invoke-virtual {v0}, Lz4/c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x3

    return p1

    :cond_0
    iget-object v0, p0, Lz4/c$a;->a:Lz4/c0;

    invoke-interface {v0, p1, p2}, Lz4/c0;->m(J)I

    move-result p1

    return p1
.end method

.method public final r(Ll3/l;Lz3/g;I)I
    .locals 10

    .line 1
    iget-object v0, p0, Lz4/c$a;->c:Lz4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz4/c;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x3

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-boolean v0, p0, Lz4/c$a;->b:Z

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v3, -0x4

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iput v2, p2, Lz3/a;->a:I

    .line 18
    .line 19
    return v3

    .line 20
    :cond_1
    iget-object v0, p0, Lz4/c$a;->a:Lz4/c0;

    .line 21
    .line 22
    invoke-interface {v0, p1, p2, p3}, Lz4/c0;->r(Ll3/l;Lz3/g;I)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    const/4 v0, -0x5

    .line 27
    const-wide/high16 v4, -0x8000000000000000L

    .line 28
    .line 29
    if-ne p3, v0, :cond_6

    .line 30
    .line 31
    iget-object p2, p1, Ll3/l;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p2, Lv3/i0;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget p3, p2, Lv3/i0;->J:I

    .line 39
    .line 40
    if-nez p3, :cond_2

    .line 41
    .line 42
    iget v1, p2, Lv3/i0;->K:I

    .line 43
    .line 44
    if-eqz v1, :cond_5

    .line 45
    .line 46
    :cond_2
    iget-object v1, p0, Lz4/c$a;->c:Lz4/c;

    .line 47
    .line 48
    iget-wide v2, v1, Lz4/c;->e:J

    .line 49
    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    cmp-long v2, v2, v6

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    move p3, v3

    .line 58
    :cond_3
    iget-wide v1, v1, Lz4/c;->f:J

    .line 59
    .line 60
    cmp-long v1, v1, v4

    .line 61
    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    iget v3, p2, Lv3/i0;->K:I

    .line 66
    .line 67
    :goto_0
    invoke-virtual {p2}, Lv3/i0;->a()Lv3/i0$a;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iput p3, p2, Lv3/i0$a;->A:I

    .line 72
    .line 73
    iput v3, p2, Lv3/i0$a;->B:I

    .line 74
    .line 75
    invoke-virtual {p2}, Lv3/i0$a;->a()Lv3/i0;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iput-object p2, p1, Ll3/l;->b:Ljava/lang/Object;

    .line 80
    .line 81
    :cond_5
    return v0

    .line 82
    :cond_6
    iget-object p1, p0, Lz4/c$a;->c:Lz4/c;

    .line 83
    .line 84
    iget-wide v6, p1, Lz4/c;->f:J

    .line 85
    .line 86
    cmp-long v0, v6, v4

    .line 87
    .line 88
    if-eqz v0, :cond_9

    .line 89
    .line 90
    if-ne p3, v3, :cond_7

    .line 91
    .line 92
    iget-wide v8, p2, Lz3/g;->e:J

    .line 93
    .line 94
    cmp-long v0, v8, v6

    .line 95
    .line 96
    if-gez v0, :cond_8

    .line 97
    .line 98
    :cond_7
    if-ne p3, v1, :cond_9

    .line 99
    .line 100
    invoke-virtual {p1}, Lz4/c;->g()J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    cmp-long p1, v0, v4

    .line 105
    .line 106
    if-nez p1, :cond_9

    .line 107
    .line 108
    iget-boolean p1, p2, Lz3/g;->d:Z

    .line 109
    .line 110
    if-nez p1, :cond_9

    .line 111
    .line 112
    :cond_8
    invoke-virtual {p2}, Lz3/g;->o()V

    .line 113
    .line 114
    .line 115
    iput v2, p2, Lz3/a;->a:I

    .line 116
    .line 117
    const/4 p1, 0x1

    .line 118
    iput-boolean p1, p0, Lz4/c$a;->b:Z

    .line 119
    .line 120
    return v3

    .line 121
    :cond_9
    return p3
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
.end method

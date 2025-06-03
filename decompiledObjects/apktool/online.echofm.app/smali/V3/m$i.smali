.class public LV3/m$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->l0(Ljava/util/List;LV3/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/k;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LV3/m;

.field public final synthetic d:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;LV3/k;Ljava/util/List;LV3/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$i;->d:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$i;->a:LV3/k;

    .line 4
    .line 5
    iput-object p3, p0, LV3/m$i;->b:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, LV3/m$i;->c:LV3/m;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {p1, p2}, LV3/m;->y(Ljava/lang/String;Ljava/lang/String;)LQ3/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, LV3/m$i;->d:LV3/m;

    .line 6
    .line 7
    const-string v0, "Transaction"

    .line 8
    .line 9
    iget-object v1, p0, LV3/m$i;->a:LV3/k;

    .line 10
    .line 11
    invoke-static {p2, v0, v1, p1}, LV3/m;->z(LV3/m;Ljava/lang/String;LV3/k;LQ3/c;)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, LV3/m$i;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, LV3/m$z;

    .line 43
    .line 44
    sget-object v2, LV3/m$A;->r:LV3/m$A;

    .line 45
    .line 46
    invoke-static {v1, v2}, LV3/m$z;->o(LV3/m$z;LV3/m$A;)LV3/m$A;

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, LV3/m$i;->d:LV3/m;

    .line 50
    .line 51
    invoke-static {v2}, LV3/m;->B(LV3/m;)LV3/x;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v1}, LV3/m$z;->p(LV3/m$z;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    iget-object v2, p0, LV3/m$i;->d:LV3/m;

    .line 60
    .line 61
    invoke-static {v2}, LV3/m;->p(LV3/m;)LY3/f;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v7, 0x0

    .line 67
    invoke-virtual/range {v3 .. v8}, LV3/x;->s(JZZLY3/a;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {p2, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, LV3/m$z;->l(LV3/m$z;)Ld4/n;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object v3, p0, LV3/m$i;->c:LV3/m;

    .line 79
    .line 80
    invoke-static {v1}, LV3/m$z;->w(LV3/m$z;)LV3/k;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {v3, v4}, LQ3/k;->c(LV3/m;LV3/k;)LQ3/e;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-static {v2}, Ld4/i;->d(Ld4/n;)Ld4/i;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {v3, v2}, LQ3/k;->a(LQ3/e;Ld4/i;)LQ3/b;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v3, LV3/m$i$a;

    .line 97
    .line 98
    invoke-direct {v3, p0, v1, v2}, LV3/m$i$a;-><init>(LV3/m$i;LV3/m$z;LQ3/b;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, LV3/m$i;->d:LV3/m;

    .line 105
    .line 106
    new-instance v3, LV3/D;

    .line 107
    .line 108
    invoke-static {v1}, LV3/m$z;->z(LV3/m$z;)LQ3/s;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v1}, LV3/m$z;->w(LV3/m$z;)LV3/k;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1}, La4/i;->a(LV3/k;)La4/i;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-direct {v3, v2, v4, v1}, LV3/D;-><init>(LV3/m;LQ3/s;La4/i;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v3}, LV3/m;->b0(LV3/h;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_0
    iget-object v0, p0, LV3/m$i;->d:LV3/m;

    .line 128
    .line 129
    invoke-static {v0}, LV3/m;->q(LV3/m;)LY3/k;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v2, p0, LV3/m$i;->a:LV3/k;

    .line 134
    .line 135
    invoke-virtual {v1, v2}, LY3/k;->k(LV3/k;)LY3/k;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v0, v1}, LV3/m;->r(LV3/m;LY3/k;)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, LV3/m$i;->d:LV3/m;

    .line 143
    .line 144
    invoke-static {v0}, LV3/m;->s(LV3/m;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, LV3/m$i;->c:LV3/m;

    .line 148
    .line 149
    invoke-static {v0, p2}, LV3/m;->x(LV3/m;Ljava/util/List;)V

    .line 150
    .line 151
    .line 152
    const/4 p2, 0x0

    .line 153
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-ge p2, v0, :cond_5

    .line 158
    .line 159
    iget-object v0, p0, LV3/m$i;->d:LV3/m;

    .line 160
    .line 161
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, Ljava/lang/Runnable;

    .line 166
    .line 167
    invoke-virtual {v0, v1}, LV3/m;->X(Ljava/lang/Runnable;)V

    .line 168
    .line 169
    .line 170
    add-int/lit8 p2, p2, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_1
    invoke-virtual {p1}, LQ3/c;->f()I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    const/4 v0, -0x1

    .line 178
    if-ne p2, v0, :cond_3

    .line 179
    .line 180
    iget-object p1, p0, LV3/m$i;->b:Ljava/util/List;

    .line 181
    .line 182
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    if-eqz p2, :cond_4

    .line 191
    .line 192
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    check-cast p2, LV3/m$z;

    .line 197
    .line 198
    invoke-static {p2}, LV3/m$z;->n(LV3/m$z;)LV3/m$A;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    sget-object v1, LV3/m$A;->s:LV3/m$A;

    .line 203
    .line 204
    if-ne v0, v1, :cond_2

    .line 205
    .line 206
    sget-object v0, LV3/m$A;->t:LV3/m$A;

    .line 207
    .line 208
    :goto_3
    invoke-static {p2, v0}, LV3/m$z;->o(LV3/m$z;LV3/m$A;)LV3/m$A;

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_2
    sget-object v0, LV3/m$A;->p:LV3/m$A;

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_3
    iget-object p2, p0, LV3/m$i;->b:Ljava/util/List;

    .line 216
    .line 217
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_4

    .line 226
    .line 227
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, LV3/m$z;

    .line 232
    .line 233
    sget-object v1, LV3/m$A;->t:LV3/m$A;

    .line 234
    .line 235
    invoke-static {v0, v1}, LV3/m$z;->o(LV3/m$z;LV3/m$A;)LV3/m$A;

    .line 236
    .line 237
    .line 238
    invoke-static {v0, p1}, LV3/m$z;->D(LV3/m$z;LQ3/c;)LQ3/c;

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_4
    iget-object p1, p0, LV3/m$i;->d:LV3/m;

    .line 243
    .line 244
    iget-object p2, p0, LV3/m$i;->a:LV3/k;

    .line 245
    .line 246
    invoke-static {p1, p2}, LV3/m;->m(LV3/m;LV3/k;)LV3/k;

    .line 247
    .line 248
    .line 249
    :cond_5
    return-void
.end method

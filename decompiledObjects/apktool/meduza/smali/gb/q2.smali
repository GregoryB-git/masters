.class public final Lgb/q2;
.super Leb/k0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/q2$b;,
        Lgb/q2$d;,
        Lgb/q2$c;
    }
.end annotation


# instance fields
.field public final f:Leb/k0$e;

.field public g:Leb/k0$i;

.field public h:Leb/n;


# direct methods
.method public constructor <init>(Leb/k0$e;)V
    .locals 1

    invoke-direct {p0}, Leb/k0;-><init>()V

    sget-object v0, Leb/n;->d:Leb/n;

    iput-object v0, p0, Lgb/q2;->h:Leb/n;

    const-string v0, "helper"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lgb/q2;->f:Leb/k0$e;

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$h;)Leb/e1;
    .locals 4

    .line 1
    iget-object v0, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Leb/e1;->n:Leb/e1;

    .line 10
    .line 11
    const-string v1, "NameResolver returned no usable address. addrs="

    .line 12
    .line 13
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, ", attrs="

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object p1, p1, Leb/k0$h;->b:Leb/a;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Lgb/q2;->c(Leb/e1;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    iget-object p1, p1, Leb/k0$h;->c:Ljava/lang/Object;

    .line 45
    .line 46
    instance-of v1, p1, Lgb/q2$b;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    check-cast p1, Lgb/q2$b;

    .line 51
    .line 52
    iget-object v1, p1, Lgb/q2$b;->a:Ljava/lang/Boolean;

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    new-instance v1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p1, Lgb/q2$b;->b:Ljava/lang/Long;

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    new-instance v0, Ljava/util/Random;

    .line 72
    .line 73
    iget-object p1, p1, Lgb/q2$b;->b:Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    invoke-direct {v0, v2, v3}, Ljava/util/Random;-><init>(J)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    new-instance v0, Ljava/util/Random;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-static {v1, v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;Ljava/util/Random;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v1

    .line 92
    :cond_2
    iget-object p1, p0, Lgb/q2;->g:Leb/k0$i;

    .line 93
    .line 94
    if-nez p1, :cond_3

    .line 95
    .line 96
    iget-object p1, p0, Lgb/q2;->f:Leb/k0$e;

    .line 97
    .line 98
    new-instance v1, Leb/k0$b$a;

    .line 99
    .line 100
    invoke-direct {v1}, Leb/k0$b$a;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v0}, Leb/k0$b$a;->b(Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    new-instance v0, Leb/k0$b;

    .line 107
    .line 108
    iget-object v2, v1, Leb/k0$b$a;->a:Ljava/util/List;

    .line 109
    .line 110
    iget-object v3, v1, Leb/k0$b$a;->b:Leb/a;

    .line 111
    .line 112
    iget-object v1, v1, Leb/k0$b$a;->c:[[Ljava/lang/Object;

    .line 113
    .line 114
    invoke-direct {v0, v2, v3, v1}, Leb/k0$b;-><init>(Ljava/util/List;Leb/a;[[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Leb/k0$e;->a(Leb/k0$b;)Leb/k0$i;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v0, Lgb/q2$a;

    .line 122
    .line 123
    invoke-direct {v0, p0, p1}, Lgb/q2$a;-><init>(Lgb/q2;Leb/k0$i;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v0}, Leb/k0$i;->h(Leb/k0$k;)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lgb/q2;->g:Leb/k0$i;

    .line 130
    .line 131
    sget-object v0, Leb/n;->a:Leb/n;

    .line 132
    .line 133
    new-instance v1, Lgb/q2$c;

    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-static {p1, v2}, Leb/k0$f;->b(Leb/k0$i;Lnb/i$g$a;)Leb/k0$f;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-direct {v1, v2}, Lgb/q2$c;-><init>(Leb/k0$f;)V

    .line 141
    .line 142
    .line 143
    iput-object v0, p0, Lgb/q2;->h:Leb/n;

    .line 144
    .line 145
    iget-object v2, p0, Lgb/q2;->f:Leb/k0$e;

    .line 146
    .line 147
    invoke-virtual {v2, v0, v1}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Leb/k0$i;->f()V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    invoke-virtual {p1, v0}, Leb/k0$i;->i(Ljava/util/List;)V

    .line 155
    .line 156
    .line 157
    :goto_1
    sget-object p1, Leb/e1;->e:Leb/e1;

    .line 158
    .line 159
    return-object p1
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

.method public final c(Leb/e1;)V
    .locals 2

    iget-object v0, p0, Lgb/q2;->g:Leb/k0$i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Leb/k0$i;->g()V

    const/4 v0, 0x0

    iput-object v0, p0, Lgb/q2;->g:Leb/k0$i;

    :cond_0
    sget-object v0, Leb/n;->c:Leb/n;

    new-instance v1, Lgb/q2$c;

    invoke-static {p1}, Leb/k0$f;->a(Leb/e1;)Leb/k0$f;

    move-result-object p1

    invoke-direct {v1, p1}, Lgb/q2$c;-><init>(Leb/k0$f;)V

    iput-object v0, p0, Lgb/q2;->h:Leb/n;

    iget-object p1, p0, Lgb/q2;->f:Leb/k0$e;

    invoke-virtual {p1, v0, v1}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lgb/q2;->g:Leb/k0$i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Leb/k0$i;->f()V

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lgb/q2;->g:Leb/k0$i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Leb/k0$i;->g()V

    :cond_0
    return-void
.end method

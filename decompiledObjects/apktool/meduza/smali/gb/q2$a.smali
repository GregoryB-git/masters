.class public final Lgb/q2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/k0$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/q2;->a(Leb/k0$h;)Leb/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Leb/k0$i;

.field public final synthetic b:Lgb/q2;


# direct methods
.method public constructor <init>(Lgb/q2;Leb/k0$i;)V
    .locals 0

    iput-object p1, p0, Lgb/q2$a;->b:Lgb/q2;

    iput-object p2, p0, Lgb/q2$a;->a:Leb/k0$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/o;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lgb/q2$a;->b:Lgb/q2;

    .line 2
    .line 3
    iget-object v1, p0, Lgb/q2$a;->a:Leb/k0$i;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v2, Leb/n;->d:Leb/n;

    .line 9
    .line 10
    iget-object v3, p1, Leb/o;->a:Leb/n;

    .line 11
    .line 12
    sget-object v4, Leb/n;->e:Leb/n;

    .line 13
    .line 14
    if-ne v3, v4, :cond_0

    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    sget-object v4, Leb/n;->c:Leb/n;

    .line 19
    .line 20
    if-eq v3, v4, :cond_1

    .line 21
    .line 22
    if-ne v3, v2, :cond_2

    .line 23
    .line 24
    :cond_1
    iget-object v5, v0, Lgb/q2;->f:Leb/k0$e;

    .line 25
    .line 26
    invoke-virtual {v5}, Leb/k0$e;->e()V

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object v5, v0, Lgb/q2;->h:Leb/n;

    .line 30
    .line 31
    if-ne v5, v4, :cond_4

    .line 32
    .line 33
    sget-object v4, Leb/n;->a:Leb/n;

    .line 34
    .line 35
    if-ne v3, v4, :cond_3

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    if-ne v3, v2, :cond_4

    .line 39
    .line 40
    invoke-virtual {v0}, Lgb/q2;->e()V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_8

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    if-eq v2, v4, :cond_7

    .line 52
    .line 53
    const/4 v4, 0x2

    .line 54
    if-eq v2, v4, :cond_6

    .line 55
    .line 56
    const/4 p1, 0x3

    .line 57
    if-ne v2, p1, :cond_5

    .line 58
    .line 59
    new-instance p1, Lgb/q2$d;

    .line 60
    .line 61
    invoke-direct {p1, v0, v1}, Lgb/q2$d;-><init>(Lgb/q2;Leb/k0$i;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v1, "Unsupported state:"

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_6
    new-instance v1, Lgb/q2$c;

    .line 89
    .line 90
    iget-object p1, p1, Leb/o;->b:Leb/e1;

    .line 91
    .line 92
    invoke-static {p1}, Leb/k0$f;->a(Leb/e1;)Leb/k0$f;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {v1, p1}, Lgb/q2$c;-><init>(Leb/k0$f;)V

    .line 97
    .line 98
    .line 99
    move-object p1, v1

    .line 100
    goto :goto_0

    .line 101
    :cond_7
    new-instance p1, Lgb/q2$c;

    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    invoke-static {v1, v2}, Leb/k0$f;->b(Leb/k0$i;Lnb/i$g$a;)Leb/k0$f;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {p1, v1}, Lgb/q2$c;-><init>(Leb/k0$f;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_8
    new-instance p1, Lgb/q2$c;

    .line 113
    .line 114
    sget-object v1, Leb/k0$f;->e:Leb/k0$f;

    .line 115
    .line 116
    invoke-direct {p1, v1}, Lgb/q2$c;-><init>(Leb/k0$f;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    iput-object v3, v0, Lgb/q2;->h:Leb/n;

    .line 120
    .line 121
    iget-object v0, v0, Lgb/q2;->f:Leb/k0$e;

    .line 122
    .line 123
    invoke-virtual {v0, v3, p1}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    return-void
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

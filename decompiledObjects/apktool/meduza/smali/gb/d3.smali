.class public final Lgb/d3;
.super Leb/u0$f;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:Lgb/i;


# direct methods
.method public constructor <init>(ZIILgb/i;)V
    .locals 0

    invoke-direct {p0}, Leb/u0$f;-><init>()V

    iput-boolean p1, p0, Lgb/d3;->a:Z

    iput p2, p0, Lgb/d3;->b:I

    iput p3, p0, Lgb/d3;->c:I

    iput-object p4, p0, Lgb/d3;->d:Lgb/i;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Leb/u0$b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Leb/u0$b;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lgb/d3;->d:Lgb/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    :try_start_1
    invoke-static {p1}, Lgb/g3;->b(Ljava/util/Map;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, Lgb/g3;->d(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move-object v2, v1

    .line 21
    :goto_0
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Lgb/i;->a:Leb/m0;

    .line 30
    .line 31
    invoke-static {v2, v0}, Lgb/g3;->c(Ljava/util/List;Leb/m0;)Leb/u0$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 35
    goto :goto_2

    .line 36
    :goto_1
    :try_start_2
    sget-object v2, Leb/e1;->g:Leb/e1;

    .line 37
    .line 38
    const-string v3, "can\'t parse load balancer configuration"

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2, v0}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v2, Leb/u0$b;

    .line 49
    .line 50
    invoke-direct {v2, v0}, Leb/u0$b;-><init>(Leb/e1;)V

    .line 51
    .line 52
    .line 53
    move-object v0, v2

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    move-object v0, v1

    .line 56
    :goto_2
    if-nez v0, :cond_2

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    iget-object v1, v0, Leb/u0$b;->a:Leb/e1;

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    new-instance p1, Leb/u0$b;

    .line 64
    .line 65
    invoke-direct {p1, v1}, Leb/u0$b;-><init>(Leb/e1;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_3
    iget-object v1, v0, Leb/u0$b;->b:Ljava/lang/Object;

    .line 70
    .line 71
    :goto_3
    iget-boolean v0, p0, Lgb/d3;->a:Z

    .line 72
    .line 73
    iget v2, p0, Lgb/d3;->b:I

    .line 74
    .line 75
    iget v3, p0, Lgb/d3;->c:I

    .line 76
    .line 77
    invoke-static {p1, v0, v2, v3, v1}, Lgb/g2;->a(Ljava/util/Map;ZIILjava/lang/Object;)Lgb/g2;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance v0, Leb/u0$b;

    .line 82
    .line 83
    invoke-direct {v0, p1}, Leb/u0$b;-><init>(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :catch_1
    move-exception p1

    .line 88
    sget-object v0, Leb/e1;->g:Leb/e1;

    .line 89
    .line 90
    const-string v1, "failed to parse service config"

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0, p1}, Leb/e1;->f(Ljava/lang/Throwable;)Leb/e1;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance v0, Leb/u0$b;

    .line 101
    .line 102
    invoke-direct {v0, p1}, Leb/u0$b;-><init>(Leb/e1;)V

    .line 103
    .line 104
    .line 105
    return-object v0
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
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

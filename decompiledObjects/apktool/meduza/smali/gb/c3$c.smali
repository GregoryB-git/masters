.class public final Lgb/c3$c;
.super Leb/u0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Leb/u0$d;

.field public final synthetic b:Lgb/c3;


# direct methods
.method public constructor <init>(Lgb/c3;Leb/u0$d;)V
    .locals 0

    iput-object p1, p0, Lgb/c3$c;->b:Lgb/c3;

    invoke-direct {p0}, Leb/u0$d;-><init>()V

    iput-object p2, p0, Lgb/c3$c;->a:Leb/u0$d;

    return-void
.end method


# virtual methods
.method public final a(Leb/e1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/c3$c;->a:Leb/u0$d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Leb/u0$d;->a(Leb/e1;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lgb/c3$c;->b:Lgb/c3;

    .line 7
    .line 8
    iget-object p1, p1, Lgb/c3;->c:Leb/h1;

    .line 9
    .line 10
    new-instance v0, Lu/a;

    .line 11
    .line 12
    const/16 v1, 0x14

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lu/a;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final b(Leb/u0$e;)V
    .locals 7

    .line 1
    iget-object v0, p1, Leb/u0$e;->b:Leb/a;

    .line 2
    .line 3
    sget-object v1, Lgb/c3;->d:Leb/a$b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Leb/a;->a(Leb/a$b;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lgb/c3$c;->a:Leb/u0$d;

    .line 12
    .line 13
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    sget-object v2, Leb/a;->b:Leb/a;

    .line 17
    .line 18
    iget-object v2, p1, Leb/u0$e;->a:Ljava/util/List;

    .line 19
    .line 20
    iget-object v3, p1, Leb/u0$e;->b:Leb/a;

    .line 21
    .line 22
    iget-object p1, p1, Leb/u0$e;->c:Leb/u0$b;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v4, Lgb/c3$b;

    .line 28
    .line 29
    iget-object v5, p0, Lgb/c3$c;->b:Lgb/c3;

    .line 30
    .line 31
    invoke-direct {v4, v5}, Lgb/c3$b;-><init>(Lgb/c3;)V

    .line 32
    .line 33
    .line 34
    new-instance v5, Ljava/util/IdentityHashMap;

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    invoke-direct {v5, v6}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v1, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    iget-object v1, v3, Leb/a;->a:Ljava/util/IdentityHashMap;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v5, v4}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_0

    .line 74
    .line 75
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Leb/a$b;

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v5, v4, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    new-instance v1, Leb/a;

    .line 90
    .line 91
    invoke-direct {v1, v5}, Leb/a;-><init>(Ljava/util/IdentityHashMap;)V

    .line 92
    .line 93
    .line 94
    new-instance v3, Leb/u0$e;

    .line 95
    .line 96
    invoke-direct {v3, v2, v1, p1}, Leb/u0$e;-><init>(Ljava/util/List;Leb/a;Leb/u0$b;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v3}, Leb/u0$d;->b(Leb/u0$e;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    const-string v0, "RetryingNameResolver can only be used once to wrap a NameResolver"

    .line 106
    .line 107
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1
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

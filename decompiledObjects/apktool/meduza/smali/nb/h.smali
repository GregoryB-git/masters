.class public abstract Lnb/h;
.super Leb/k0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/h$a;,
        Lnb/h$c;,
        Lnb/h$b;
    }
.end annotation


# static fields
.field public static final k:Ljava/util/logging/Logger;


# instance fields
.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Leb/k0$e;

.field public h:Z

.field public final i:Lgb/r2;

.field public j:Leb/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lnb/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lnb/h;->k:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Leb/k0$e;)V
    .locals 2

    invoke-direct {p0}, Leb/k0;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    new-instance v0, Lgb/r2;

    invoke-direct {v0}, Lgb/r2;-><init>()V

    iput-object v0, p0, Lnb/h;->i:Lgb/r2;

    const-string v0, "helper"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lnb/h;->g:Leb/k0$e;

    sget-object p1, Lnb/h;->k:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v1, "Created"

    invoke-virtual {p1, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$h;)Leb/e1;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lnb/h;->h:Z

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnb/h;->g(Leb/k0$h;)Lnb/h$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p1, Lnb/h$a;->a:Leb/e1;

    .line 10
    .line 11
    invoke-virtual {v0}, Leb/e1;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lnb/h$a;->a:Leb/e1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    iput-boolean v1, p0, Lnb/h;->h:Z

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lnb/h;->i()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p1, Lnb/h$a;->b:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lnb/h$b;

    .line 42
    .line 43
    iget-object v3, v2, Lnb/h$b;->c:Lnb/e;

    .line 44
    .line 45
    invoke-virtual {v3}, Lnb/e;->f()V

    .line 46
    .line 47
    .line 48
    sget-object v3, Leb/n;->e:Leb/n;

    .line 49
    .line 50
    iput-object v3, v2, Lnb/h$b;->e:Leb/n;

    .line 51
    .line 52
    sget-object v3, Lnb/h;->k:Ljava/util/logging/Logger;

    .line 53
    .line 54
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 55
    .line 56
    iget-object v2, v2, Lnb/h$b;->a:Ljava/lang/Object;

    .line 57
    .line 58
    const-string v5, "Child balancer {0} deleted"

    .line 59
    .line 60
    invoke-virtual {v3, v4, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-object p1, p1, Lnb/h$a;->a:Leb/e1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    iput-boolean v1, p0, Lnb/h;->h:Z

    .line 67
    .line 68
    return-object p1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    iput-boolean v1, p0, Lnb/h;->h:Z

    .line 71
    .line 72
    throw p1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final c(Leb/e1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnb/h;->j:Leb/n;

    .line 2
    .line 3
    sget-object v1, Leb/n;->b:Leb/n;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lnb/h;->g:Leb/k0$e;

    .line 8
    .line 9
    sget-object v1, Leb/n;->c:Leb/n;

    .line 10
    .line 11
    new-instance v2, Leb/k0$d;

    .line 12
    .line 13
    invoke-static {p1}, Leb/k0$f;->a(Leb/e1;)Leb/k0$f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v2, p1}, Leb/k0$d;-><init>(Leb/k0$f;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
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

.method public final f()V
    .locals 5

    .line 1
    sget-object v0, Lnb/h;->k:Ljava/util/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 4
    .line 5
    const-string v2, "Shutdown"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lnb/h$b;

    .line 31
    .line 32
    iget-object v2, v1, Lnb/h$b;->c:Lnb/e;

    .line 33
    .line 34
    invoke-virtual {v2}, Lnb/e;->f()V

    .line 35
    .line 36
    .line 37
    sget-object v2, Leb/n;->e:Leb/n;

    .line 38
    .line 39
    iput-object v2, v1, Lnb/h$b;->e:Leb/n;

    .line 40
    .line 41
    sget-object v2, Lnb/h;->k:Ljava/util/logging/Logger;

    .line 42
    .line 43
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 44
    .line 45
    iget-object v1, v1, Lnb/h$b;->a:Ljava/lang/Object;

    .line 46
    .line 47
    const-string v4, "Child balancer {0} deleted"

    .line 48
    .line 49
    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v0, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 56
    .line 57
    .line 58
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final g(Leb/k0$h;)Lnb/h$a;
    .locals 12

    .line 1
    sget-object v0, Lnb/h;->k:Ljava/util/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 4
    .line 5
    const-string v2, "Received resolution result: {0}"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Leb/u;

    .line 32
    .line 33
    new-instance v3, Lnb/h$c;

    .line 34
    .line 35
    invoke-direct {v3, v2}, Lnb/h$c;-><init>(Leb/u;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lnb/h$b;

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance v2, Leb/k0$d;

    .line 50
    .line 51
    sget-object v4, Leb/k0$f;->e:Leb/k0$f;

    .line 52
    .line 53
    invoke-direct {v2, v4}, Leb/k0$d;-><init>(Leb/k0$f;)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Lnb/h$b;

    .line 57
    .line 58
    iget-object v5, p0, Lnb/h;->i:Lgb/r2;

    .line 59
    .line 60
    invoke-direct {v4, p0, v3, v5, v2}, Lnb/h$b;-><init>(Lnb/h;Lnb/h$c;Lgb/r2;Leb/k0$d;)V

    .line 61
    .line 62
    .line 63
    move-object v2, v4

    .line 64
    :goto_1
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v2, 0x0

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    sget-object v0, Leb/e1;->n:Leb/e1;

    .line 76
    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v3, "NameResolver returned no usable address. "

    .line 83
    .line 84
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, p1}, Leb/e1;->g(Ljava/lang/String;)Leb/e1;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0, p1}, Lnb/h;->c(Leb/e1;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Lnb/h$a;

    .line 102
    .line 103
    invoke-direct {v0, p1, v2}, Lnb/h$a;-><init>(Leb/e1;Ljava/util/ArrayList;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v5, 0x1

    .line 121
    if-eqz v3, :cond_b

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, Ljava/util/Map$Entry;

    .line 128
    .line 129
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    check-cast v7, Lnb/h$b;

    .line 138
    .line 139
    iget-object v7, v7, Lnb/h$b;->d:Leb/l0;

    .line 140
    .line 141
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    check-cast v7, Lnb/h$b;

    .line 146
    .line 147
    iget-object v7, v7, Lnb/h$b;->b:Ljava/lang/Object;

    .line 148
    .line 149
    iget-object v8, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 150
    .line 151
    invoke-interface {v8, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-nez v8, :cond_4

    .line 156
    .line 157
    iget-object v4, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Lnb/h$b;

    .line 164
    .line 165
    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_4
    iget-object v3, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 170
    .line 171
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, Lnb/h$b;

    .line 176
    .line 177
    iget-boolean v8, v3, Lnb/h$b;->g:Z

    .line 178
    .line 179
    if-eqz v8, :cond_5

    .line 180
    .line 181
    iput-boolean v4, v3, Lnb/h$b;->g:Z

    .line 182
    .line 183
    :cond_5
    :goto_3
    iget-object v3, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 184
    .line 185
    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Lnb/h$b;

    .line 190
    .line 191
    instance-of v4, v6, Leb/u;

    .line 192
    .line 193
    if-eqz v4, :cond_6

    .line 194
    .line 195
    new-instance v4, Lnb/h$c;

    .line 196
    .line 197
    move-object v8, v6

    .line 198
    check-cast v8, Leb/u;

    .line 199
    .line 200
    invoke-direct {v4, v8}, Lnb/h$c;-><init>(Leb/u;)V

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_6
    instance-of v4, v6, Lnb/h$c;

    .line 205
    .line 206
    const-string v8, "key is wrong type"

    .line 207
    .line 208
    invoke-static {v8, v4}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 209
    .line 210
    .line 211
    move-object v4, v6

    .line 212
    check-cast v4, Lnb/h$c;

    .line 213
    .line 214
    :goto_4
    iget-object v8, p1, Leb/k0$h;->a:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    :cond_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    if-eqz v9, :cond_8

    .line 225
    .line 226
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    check-cast v9, Leb/u;

    .line 231
    .line 232
    new-instance v10, Lnb/h$c;

    .line 233
    .line 234
    invoke-direct {v10, v9}, Lnb/h$c;-><init>(Leb/u;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v10}, Lnb/h$c;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-eqz v10, :cond_7

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_8
    move-object v9, v2

    .line 245
    :goto_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v8, " no longer present in load balancer children"

    .line 254
    .line 255
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-static {v9, v4}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    sget-object v4, Leb/a;->b:Leb/a;

    .line 266
    .line 267
    invoke-static {v9}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    sget-object v8, Leb/a;->b:Leb/a;

    .line 272
    .line 273
    sget-object v9, Leb/k0;->e:Leb/a$b;

    .line 274
    .line 275
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 276
    .line 277
    new-instance v11, Ljava/util/IdentityHashMap;

    .line 278
    .line 279
    invoke-direct {v11, v5}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v11, v9, v10}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    iget-object v5, v8, Leb/a;->a:Ljava/util/IdentityHashMap;

    .line 286
    .line 287
    invoke-virtual {v5}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    :cond_9
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    if-eqz v8, :cond_a

    .line 300
    .line 301
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    check-cast v8, Ljava/util/Map$Entry;

    .line 306
    .line 307
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    invoke-virtual {v11, v9}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    if-nez v9, :cond_9

    .line 316
    .line 317
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    check-cast v9, Leb/a$b;

    .line 322
    .line 323
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    invoke-virtual {v11, v9, v8}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_a
    new-instance v5, Leb/a;

    .line 332
    .line 333
    invoke-direct {v5, v11}, Leb/a;-><init>(Ljava/util/IdentityHashMap;)V

    .line 334
    .line 335
    .line 336
    new-instance v8, Leb/k0$h;

    .line 337
    .line 338
    invoke-direct {v8, v4, v5, v7}, Leb/k0$h;-><init>(Ljava/util/List;Leb/a;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    iget-object v4, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 342
    .line 343
    invoke-virtual {v4, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    check-cast v4, Lnb/h$b;

    .line 348
    .line 349
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-boolean v4, v3, Lnb/h$b;->g:Z

    .line 353
    .line 354
    if-nez v4, :cond_3

    .line 355
    .line 356
    iget-object v3, v3, Lnb/h$b;->c:Lnb/e;

    .line 357
    .line 358
    invoke-virtual {v3, v8}, Lnb/b;->d(Leb/k0$h;)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_2

    .line 362
    .line 363
    :cond_b
    new-instance p1, Ljava/util/ArrayList;

    .line 364
    .line 365
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 366
    .line 367
    .line 368
    iget-object v1, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-static {v1}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {v1, v4}, Lo7/t;->r(I)Lo7/t$b;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    :cond_c
    :goto_7
    invoke-virtual {v1}, Lo7/a;->hasNext()Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_e

    .line 387
    .line 388
    invoke-virtual {v1}, Lo7/a;->next()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-nez v3, :cond_c

    .line 397
    .line 398
    iget-object v3, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 399
    .line 400
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    check-cast v2, Lnb/h$b;

    .line 405
    .line 406
    iget-boolean v3, v2, Lnb/h$b;->g:Z

    .line 407
    .line 408
    if-eqz v3, :cond_d

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_d
    iget-object v3, v2, Lnb/h$b;->h:Lnb/h;

    .line 412
    .line 413
    iget-object v3, v3, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 414
    .line 415
    iget-object v4, v2, Lnb/h$b;->a:Ljava/lang/Object;

    .line 416
    .line 417
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    iput-boolean v5, v2, Lnb/h$b;->g:Z

    .line 421
    .line 422
    sget-object v3, Lnb/h;->k:Ljava/util/logging/Logger;

    .line 423
    .line 424
    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 425
    .line 426
    iget-object v6, v2, Lnb/h$b;->a:Ljava/lang/Object;

    .line 427
    .line 428
    const-string v7, "Child balancer {0} deactivated"

    .line 429
    .line 430
    invoke-virtual {v3, v4, v7, v6}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    :goto_8
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_e
    new-instance v0, Lnb/h$a;

    .line 438
    .line 439
    sget-object v1, Leb/e1;->e:Leb/e1;

    .line 440
    .line 441
    invoke-direct {v0, v1, p1}, Lnb/h$a;-><init>(Leb/e1;Ljava/util/ArrayList;)V

    .line 442
    .line 443
    .line 444
    return-object v0
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method

.method public abstract h()Leb/k0$j;
.end method

.method public i()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnb/h;->f:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_6

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lnb/h$b;

    .line 28
    .line 29
    iget-boolean v4, v3, Lnb/h$b;->g:Z

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v4, v3, Lnb/h$b;->a:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v5, v3, Lnb/h$b;->f:Leb/k0$j;

    .line 37
    .line 38
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v3, v3, Lnb/h$b;->e:Leb/n;

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    move-object v2, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object v4, Leb/n;->b:Leb/n;

    .line 48
    .line 49
    if-eq v2, v4, :cond_5

    .line 50
    .line 51
    if-ne v3, v4, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    sget-object v4, Leb/n;->a:Leb/n;

    .line 55
    .line 56
    if-eq v2, v4, :cond_5

    .line 57
    .line 58
    if-ne v3, v4, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    sget-object v4, Leb/n;->d:Leb/n;

    .line 62
    .line 63
    if-eq v2, v4, :cond_5

    .line 64
    .line 65
    if-ne v3, v4, :cond_0

    .line 66
    .line 67
    :cond_5
    :goto_1
    move-object v2, v4

    .line 68
    goto :goto_0

    .line 69
    :cond_6
    if-eqz v2, :cond_7

    .line 70
    .line 71
    iget-object v0, p0, Lnb/h;->g:Leb/k0$e;

    .line 72
    .line 73
    invoke-virtual {p0}, Lnb/h;->h()Leb/k0$j;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v2, v1}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    .line 78
    .line 79
    .line 80
    iput-object v2, p0, Lnb/h;->j:Leb/n;

    .line 81
    .line 82
    :cond_7
    return-void
    .line 83
.end method

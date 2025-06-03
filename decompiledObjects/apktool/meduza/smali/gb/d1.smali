.class public final Lgb/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/e0;
.implements Lgb/q3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/d1$f;,
        Lgb/d1$d;,
        Lgb/d1$b;,
        Lgb/d1$c;,
        Lgb/d1$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Leb/e0<",
        "Ljava/lang/Object;",
        ">;",
        "Lgb/q3;"
    }
.end annotation


# instance fields
.field public final a:Leb/f0;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lgb/j$a;

.field public final e:Lgb/d1$c;

.field public final f:Lgb/v;

.field public final g:Ljava/util/concurrent/ScheduledExecutorService;

.field public final h:Leb/c0;

.field public final i:Lgb/m;

.field public final j:Leb/d;

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Leb/i;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Leb/h1;

.field public final m:Lgb/d1$d;

.field public volatile n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Leb/u;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lgb/j;

.field public final p:Ln7/p;

.field public q:Leb/h1$c;

.field public r:Leb/h1$c;

.field public s:Lgb/h2;

.field public final t:Ljava/util/ArrayList;

.field public final u:Lgb/d1$a;

.field public v:Lgb/x;

.field public volatile w:Lgb/h2;

.field public volatile x:Leb/o;

.field public y:Leb/e1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lgb/j$a;Lgb/l;Ljava/util/concurrent/ScheduledExecutorService;Ln7/q;Leb/h1;Lgb/r1$o$a;Leb/c0;Lgb/m;Lgb/p;Leb/f0;Lgb/n;Ljava/util/ArrayList;)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lgb/d1;->t:Ljava/util/ArrayList;

    new-instance v4, Lgb/d1$a;

    invoke-direct {v4, p0}, Lgb/d1$a;-><init>(Lgb/d1;)V

    iput-object v4, v0, Lgb/d1;->u:Lgb/d1$a;

    sget-object v4, Leb/n;->d:Leb/n;

    invoke-static {v4}, Leb/o;->a(Leb/n;)Leb/o;

    move-result-object v4

    iput-object v4, v0, Lgb/d1;->x:Leb/o;

    const-string v4, "addressGroups"

    invoke-static {p1, v4}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    const-string v5, "addressGroups is empty"

    invoke-static {v5, v4}, Lx6/b;->s(Ljava/lang/String;Z)V

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "addressGroups contains null entry"

    invoke-static {v5, v6}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 2
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lgb/d1;->n:Ljava/util/List;

    new-instance v4, Lgb/d1$d;

    invoke-direct {v4, v1}, Lgb/d1$d;-><init>(Ljava/util/List;)V

    iput-object v4, v0, Lgb/d1;->m:Lgb/d1$d;

    move-object v1, p2

    iput-object v1, v0, Lgb/d1;->b:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, v0, Lgb/d1;->c:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lgb/d1;->d:Lgb/j$a;

    move-object v1, p4

    iput-object v1, v0, Lgb/d1;->f:Lgb/v;

    move-object v1, p5

    iput-object v1, v0, Lgb/d1;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p6}, Ln7/q;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/p;

    iput-object v1, v0, Lgb/d1;->p:Ln7/p;

    move-object v1, p7

    iput-object v1, v0, Lgb/d1;->l:Leb/h1;

    move-object v1, p8

    iput-object v1, v0, Lgb/d1;->e:Lgb/d1$c;

    move-object/from16 v1, p9

    iput-object v1, v0, Lgb/d1;->h:Leb/c0;

    move-object/from16 v1, p10

    iput-object v1, v0, Lgb/d1;->i:Lgb/m;

    const-string v1, "channelTracer"

    move-object/from16 v4, p11

    invoke-static {v4, v1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "logId"

    invoke-static {v2, v1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v0, Lgb/d1;->a:Leb/f0;

    const-string v1, "channelLogger"

    invoke-static {v3, v1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v3, v0, Lgb/d1;->j:Leb/d;

    move-object/from16 v1, p14

    iput-object v1, v0, Lgb/d1;->k:Ljava/util/List;

    return-void
.end method

.method public static b(Lgb/d1;Leb/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgb/d1;->l:Leb/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Leb/o;->a(Leb/n;)Leb/o;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lgb/d1;->j(Leb/o;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
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
.end method

.method public static i(Lgb/d1;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lgb/d1;->l:Leb/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgb/d1;->q:Leb/h1$c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v1

    .line 15
    :goto_0
    const-string v3, "Should have no reconnectTask scheduled"

    .line 16
    .line 17
    invoke-static {v0, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lgb/d1;->m:Lgb/d1$d;

    .line 21
    .line 22
    iget v3, v0, Lgb/d1$d;->b:I

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    iget v0, v0, Lgb/d1$d;->c:I

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    move v0, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v1

    .line 33
    :goto_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lgb/d1;->p:Ln7/p;

    .line 36
    .line 37
    iput-boolean v1, v0, Ln7/p;->b:Z

    .line 38
    .line 39
    invoke-virtual {v0}, Ln7/p;->b()V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v0, p0, Lgb/d1;->m:Lgb/d1$d;

    .line 43
    .line 44
    iget-object v3, v0, Lgb/d1$d;->a:Ljava/util/List;

    .line 45
    .line 46
    iget v4, v0, Lgb/d1$d;->b:I

    .line 47
    .line 48
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Leb/u;

    .line 53
    .line 54
    iget-object v3, v3, Leb/u;->a:Ljava/util/List;

    .line 55
    .line 56
    iget v0, v0, Lgb/d1$d;->c:I

    .line 57
    .line 58
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/net/SocketAddress;

    .line 63
    .line 64
    instance-of v3, v0, Leb/a0;

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    move-object v4, v0

    .line 70
    check-cast v4, Leb/a0;

    .line 71
    .line 72
    iget-object v0, v4, Leb/a0;->b:Ljava/net/InetSocketAddress;

    .line 73
    .line 74
    :cond_3
    iget-object v3, p0, Lgb/d1;->m:Lgb/d1$d;

    .line 75
    .line 76
    iget-object v5, v3, Lgb/d1$d;->a:Ljava/util/List;

    .line 77
    .line 78
    iget v3, v3, Lgb/d1$d;->b:I

    .line 79
    .line 80
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Leb/u;

    .line 85
    .line 86
    iget-object v3, v3, Leb/u;->b:Leb/a;

    .line 87
    .line 88
    sget-object v5, Leb/u;->d:Leb/a$b;

    .line 89
    .line 90
    invoke-virtual {v3, v5}, Leb/a;->a(Leb/a$b;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/lang/String;

    .line 95
    .line 96
    new-instance v6, Lgb/v$a;

    .line 97
    .line 98
    invoke-direct {v6}, Lgb/v$a;-><init>()V

    .line 99
    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    iget-object v5, p0, Lgb/d1;->b:Ljava/lang/String;

    .line 105
    .line 106
    :goto_2
    const-string v7, "authority"

    .line 107
    .line 108
    invoke-static {v5, v7}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iput-object v5, v6, Lgb/v$a;->a:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v3, v6, Lgb/v$a;->b:Leb/a;

    .line 114
    .line 115
    iget-object v3, p0, Lgb/d1;->c:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v3, v6, Lgb/v$a;->c:Ljava/lang/String;

    .line 118
    .line 119
    iput-object v4, v6, Lgb/v$a;->d:Leb/a0;

    .line 120
    .line 121
    new-instance v3, Lgb/d1$f;

    .line 122
    .line 123
    invoke-direct {v3}, Lgb/d1$f;-><init>()V

    .line 124
    .line 125
    .line 126
    iget-object v4, p0, Lgb/d1;->a:Leb/f0;

    .line 127
    .line 128
    iput-object v4, v3, Lgb/d1$f;->a:Leb/f0;

    .line 129
    .line 130
    new-instance v4, Lgb/d1$b;

    .line 131
    .line 132
    iget-object v5, p0, Lgb/d1;->f:Lgb/v;

    .line 133
    .line 134
    invoke-interface {v5, v0, v6, v3}, Lgb/v;->W(Ljava/net/SocketAddress;Lgb/v$a;Lgb/d1$f;)Lgb/x;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-object v5, p0, Lgb/d1;->i:Lgb/m;

    .line 139
    .line 140
    invoke-direct {v4, v0, v5}, Lgb/d1$b;-><init>(Lgb/x;Lgb/m;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Lgb/p0;->f()Leb/f0;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, v3, Lgb/d1$f;->a:Leb/f0;

    .line 148
    .line 149
    iget-object v0, p0, Lgb/d1;->h:Leb/c0;

    .line 150
    .line 151
    iget-object v0, v0, Leb/c0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 152
    .line 153
    invoke-static {v0, v4}, Leb/c0;->a(Ljava/util/AbstractMap;Leb/e0;)V

    .line 154
    .line 155
    .line 156
    iput-object v4, p0, Lgb/d1;->v:Lgb/x;

    .line 157
    .line 158
    iget-object v0, p0, Lgb/d1;->t:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    new-instance v0, Lgb/d1$e;

    .line 164
    .line 165
    invoke-direct {v0, p0, v4}, Lgb/d1$e;-><init>(Lgb/d1;Lgb/d1$b;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v0}, Lgb/p0;->g(Lgb/h2$a;)Ljava/lang/Runnable;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-eqz v0, :cond_5

    .line 173
    .line 174
    iget-object v4, p0, Lgb/d1;->l:Leb/h1;

    .line 175
    .line 176
    invoke-virtual {v4, v0}, Leb/h1;->b(Ljava/lang/Runnable;)V

    .line 177
    .line 178
    .line 179
    :cond_5
    iget-object p0, p0, Lgb/d1;->j:Leb/d;

    .line 180
    .line 181
    sget-object v0, Leb/d$a;->b:Leb/d$a;

    .line 182
    .line 183
    new-array v2, v2, [Ljava/lang/Object;

    .line 184
    .line 185
    iget-object v3, v3, Lgb/d1$f;->a:Leb/f0;

    .line 186
    .line 187
    aput-object v3, v2, v1

    .line 188
    .line 189
    const-string v1, "Started transport {0}"

    .line 190
    .line 191
    invoke-virtual {p0, v0, v1, v2}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-void
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

.method public static k(Leb/e1;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Leb/e1;->a:Leb/e1$a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Leb/e1;->b:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "("

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Leb/e1;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ")"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v1, p0, Leb/e1;->c:Ljava/lang/Throwable;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const-string v1, "["

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Leb/e1;->c:Ljava/lang/Throwable;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, "]"

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
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


# virtual methods
.method public final a()Lgb/h2;
    .locals 2

    iget-object v0, p0, Lgb/d1;->w:Lgb/h2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lgb/d1;->l:Leb/h1;

    new-instance v1, Lgb/f1;

    invoke-direct {v1, p0}, Lgb/f1;-><init>(Lgb/d1;)V

    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Leb/f0;
    .locals 1

    iget-object v0, p0, Lgb/d1;->a:Leb/f0;

    return-object v0
.end method

.method public final j(Leb/o;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lgb/d1;->l:Leb/h1;

    .line 2
    .line 3
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgb/d1;->x:Leb/o;

    .line 7
    .line 8
    iget-object v0, v0, Leb/o;->a:Leb/n;

    .line 9
    .line 10
    iget-object v1, p1, Leb/o;->a:Leb/n;

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lgb/d1;->x:Leb/o;

    .line 15
    .line 16
    iget-object v0, v0, Leb/o;->a:Leb/n;

    .line 17
    .line 18
    sget-object v1, Leb/n;->e:Leb/n;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v3

    .line 27
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v4, "Cannot transition out of SHUTDOWN to "

    .line 33
    .line 34
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lgb/d1;->x:Leb/o;

    .line 48
    .line 49
    iget-object v0, p0, Lgb/d1;->e:Lgb/d1$c;

    .line 50
    .line 51
    check-cast v0, Lgb/r1$o$a;

    .line 52
    .line 53
    iget-object v1, v0, Lgb/r1$o$a;->a:Leb/k0$k;

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v2, v3

    .line 59
    :goto_1
    const-string v1, "listener is null"

    .line 60
    .line 61
    invoke-static {v2, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, Lgb/r1$o$a;->a:Leb/k0$k;

    .line 65
    .line 66
    invoke-interface {v0, p1}, Leb/k0$k;->a(Leb/o;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lgb/d1;->a:Leb/f0;

    .line 6
    .line 7
    iget-wide v1, v1, Leb/f0;->c:J

    .line 8
    .line 9
    const-string v3, "logId"

    .line 10
    .line 11
    invoke-virtual {v0, v3, v1, v2}, Ln7/g$a;->b(Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lgb/d1;->n:Ljava/util/List;

    .line 15
    .line 16
    const-string v2, "addressGroups"

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

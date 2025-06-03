.class public final LP/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP/m$b;,
        LP/m$c;,
        LP/m$a;
    }
.end annotation


# static fields
.field public static final k:LP/m$a;

.field public static final l:Ljava/util/Set;

.field public static final m:Ljava/lang/Object;


# instance fields
.field public final a:Lg6/a;

.field public final b:LP/k;

.field public final c:LP/b;

.field public final d:Lp6/I;

.field public final e:Ls6/b;

.field public final f:Ljava/lang/String;

.field public final g:LV5/h;

.field public final h:Ls6/j;

.field public i:Ljava/util/List;

.field public final j:LP/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP/m$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LP/m$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LP/m;->k:LP/m$a;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LP/m;->l:Ljava/util/Set;

    .line 15
    .line 16
    new-instance v0, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, LP/m;->m:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lg6/a;LP/k;Ljava/util/List;LP/b;Lp6/I;)V
    .locals 1

    .line 1
    const-string v0, "produceFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serializer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "initTasksList"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "corruptionHandler"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "scope"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LP/m;->a:Lg6/a;

    .line 30
    .line 31
    iput-object p2, p0, LP/m;->b:LP/k;

    .line 32
    .line 33
    iput-object p4, p0, LP/m;->c:LP/b;

    .line 34
    .line 35
    iput-object p5, p0, LP/m;->d:Lp6/I;

    .line 36
    .line 37
    new-instance p1, LP/m$g;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-direct {p1, p0, p2}, LP/m$g;-><init>(LP/m;LX5/d;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Ls6/d;->e(Lg6/p;)Ls6/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, LP/m;->e:Ls6/b;

    .line 48
    .line 49
    const-string p1, ".tmp"

    .line 50
    .line 51
    iput-object p1, p0, LP/m;->f:Ljava/lang/String;

    .line 52
    .line 53
    new-instance p1, LP/m$h;

    .line 54
    .line 55
    invoke-direct {p1, p0}, LP/m$h;-><init>(LP/m;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, LV5/i;->a(Lg6/a;)LV5/h;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, LP/m;->g:LV5/h;

    .line 63
    .line 64
    sget-object p1, LP/o;->a:LP/o;

    .line 65
    .line 66
    invoke-static {p1}, Ls6/m;->a(Ljava/lang/Object;)Ls6/j;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, LP/m;->h:Ls6/j;

    .line 71
    .line 72
    check-cast p3, Ljava/lang/Iterable;

    .line 73
    .line 74
    invoke-static {p3}, LW5/m;->G(Ljava/lang/Iterable;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, LP/m;->i:Ljava/util/List;

    .line 79
    .line 80
    new-instance p1, LP/l;

    .line 81
    .line 82
    new-instance p3, LP/m$d;

    .line 83
    .line 84
    invoke-direct {p3, p0}, LP/m$d;-><init>(LP/m;)V

    .line 85
    .line 86
    .line 87
    sget-object p4, LP/m$e;->o:LP/m$e;

    .line 88
    .line 89
    new-instance v0, LP/m$f;

    .line 90
    .line 91
    invoke-direct {v0, p0, p2}, LP/m$f;-><init>(LP/m;LX5/d;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, p5, p3, p4, v0}, LP/l;-><init>(Lp6/I;Lg6/l;Lg6/p;Lg6/p;)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, LP/m;->j:LP/l;

    .line 98
    .line 99
    return-void
.end method

.method public static final synthetic c()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, LP/m;->l:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LP/m;->m:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e(LP/m;)LP/l;
    .locals 0

    .line 1
    iget-object p0, p0, LP/m;->j:LP/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(LP/m;)Ls6/j;
    .locals 0

    .line 1
    iget-object p0, p0, LP/m;->h:Ls6/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(LP/m;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-virtual {p0}, LP/m;->r()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(LP/m;)Lg6/a;
    .locals 0

    .line 1
    iget-object p0, p0, LP/m;->a:Lg6/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(LP/m;LP/m$b$a;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP/m;->s(LP/m$b$a;LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(LP/m;LP/m$b$b;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP/m;->t(LP/m$b$b;LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(LP/m;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP/m;->u(LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic l(LP/m;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP/m;->v(LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(LP/m;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP/m;->w(LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(LP/m;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP/m;->x(LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(LP/m;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LP/m;->y(LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic p(LP/m;Lg6/p;LX5/g;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, LP/m;->z(Lg6/p;LX5/g;LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, LP/m$r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LP/m$r;

    .line 7
    .line 8
    iget v1, v0, LP/m$r;->v:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP/m$r;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP/m$r;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LP/m$r;-><init>(LP/m;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LP/m$r;->t:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LP/m$r;->v:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, LP/m$r;->s:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/io/FileOutputStream;

    .line 41
    .line 42
    iget-object v1, v0, LP/m$r;->r:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ljava/lang/Throwable;

    .line 45
    .line 46
    iget-object v2, v0, LP/m$r;->q:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/io/Closeable;

    .line 49
    .line 50
    iget-object v3, v0, LP/m$r;->p:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Ljava/io/File;

    .line 53
    .line 54
    iget-object v0, v0, LP/m$r;->o:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LP/m;

    .line 57
    .line 58
    :try_start_0
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_2
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, LP/m;->r()Ljava/io/File;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p0, p2}, LP/m;->q(Ljava/io/File;)V

    .line 81
    .line 82
    .line 83
    new-instance p2, Ljava/io/File;

    .line 84
    .line 85
    invoke-virtual {p0}, LP/m;->r()Ljava/io/File;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-object v4, p0, LP/m;->f:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-direct {p2, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    .line 103
    .line 104
    invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    .line 106
    .line 107
    :try_start_2
    iget-object v4, p0, LP/m;->b:LP/k;

    .line 108
    .line 109
    new-instance v5, LP/m$c;

    .line 110
    .line 111
    invoke-direct {v5, v2}, LP/m$c;-><init>(Ljava/io/FileOutputStream;)V

    .line 112
    .line 113
    .line 114
    iput-object p0, v0, LP/m$r;->o:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object p2, v0, LP/m$r;->p:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v2, v0, LP/m$r;->q:Ljava/lang/Object;

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    iput-object v6, v0, LP/m$r;->r:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v2, v0, LP/m$r;->s:Ljava/lang/Object;

    .line 124
    .line 125
    iput v3, v0, LP/m$r;->v:I

    .line 126
    .line 127
    invoke-interface {v4, p1, v5, v0}, LP/k;->c(Ljava/lang/Object;Ljava/io/OutputStream;LX5/d;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    if-ne p1, v1, :cond_3

    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_3
    move-object v0, p0

    .line 135
    move-object v3, p2

    .line 136
    move-object p1, v2

    .line 137
    move-object v1, v6

    .line 138
    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V

    .line 143
    .line 144
    .line 145
    sget-object p1, LV5/t;->a:LV5/t;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 146
    .line 147
    :try_start_4
    invoke-static {v2, v1}, Le6/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, LP/m;->r()Ljava/io/File;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v3, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 155
    .line 156
    .line 157
    move-result p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 158
    if-eqz p1, :cond_4

    .line 159
    .line 160
    sget-object p1, LV5/t;->a:LV5/t;

    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_4
    :try_start_5
    new-instance p1, Ljava/io/IOException;

    .line 164
    .line 165
    new-instance p2, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    const-string v0, "Unable to rename "

    .line 171
    .line 172
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v0, ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."

    .line 179
    .line 180
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 191
    :catch_0
    move-exception p1

    .line 192
    move-object p2, v3

    .line 193
    goto :goto_3

    .line 194
    :catchall_1
    move-exception p1

    .line 195
    move-object v3, p2

    .line 196
    :goto_2
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 197
    :catchall_2
    move-exception p2

    .line 198
    :try_start_7
    invoke-static {v2, p1}, Le6/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    throw p2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 202
    :catch_1
    move-exception p1

    .line 203
    :goto_3
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_5

    .line 208
    .line 209
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 210
    .line 211
    .line 212
    :cond_5
    throw p1
.end method

.method public a(Lg6/p;LX5/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {v0, v1, v0}, Lp6/w;->b(Lp6/q0;ILjava/lang/Object;)Lp6/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LP/m;->h:Ls6/j;

    .line 8
    .line 9
    invoke-interface {v1}, Ls6/j;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LP/n;

    .line 14
    .line 15
    new-instance v2, LP/m$b$b;

    .line 16
    .line 17
    invoke-interface {p2}, LX5/d;->getContext()LX5/g;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {v2, p1, v0, v1, v3}, LP/m$b$b;-><init>(Lg6/p;Lp6/u;LP/n;LX5/g;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LP/m;->j:LP/l;

    .line 25
    .line 26
    invoke-virtual {p1, v2}, LP/l;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p2}, Lp6/P;->m(LX5/d;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public b()Ls6/b;
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->e:Ls6/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q(Ljava/io/File;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 23
    .line 24
    const-string v1, "Unable to create parent directories of "

    .line 25
    .line 26
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final r()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, LP/m;->g:LV5/h;

    .line 2
    .line 3
    invoke-interface {v0}, LV5/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    return-object v0
.end method

.method public final s(LP/m$b$a;LX5/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LP/m;->h:Ls6/j;

    .line 2
    .line 3
    invoke-interface {v0}, Ls6/j;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LP/n;

    .line 8
    .line 9
    instance-of v1, v0, LP/c;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    instance-of v1, v0, LP/j;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1}, LP/m$b$a;->a()LP/n;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-ne v0, p1, :cond_5

    .line 23
    .line 24
    invoke-virtual {p0, p2}, LP/m;->w(LX5/d;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-ne p1, p2, :cond_1

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    sget-object p1, LV5/t;->a:LV5/t;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_2
    sget-object p1, LP/o;->a:LP/o;

    .line 39
    .line 40
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0, p2}, LP/m;->w(LX5/d;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    if-ne p1, p2, :cond_3

    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_3
    sget-object p1, LV5/t;->a:LV5/t;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_4
    instance-of p1, v0, LP/h;

    .line 61
    .line 62
    if-nez p1, :cond_6

    .line 63
    .line 64
    :cond_5
    :goto_0
    sget-object p1, LV5/t;->a:LV5/t;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string p2, "Can\'t read in final state."

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
.end method

.method public final t(LP/m$b$b;LX5/d;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, LP/m$i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LP/m$i;

    .line 7
    .line 8
    iget v1, v0, LP/m$i;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP/m$i;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP/m$i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LP/m$i;-><init>(LP/m;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LP/m$i;->r:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LP/m$i;->t:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object p1, v0, LP/m$i;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lp6/u;

    .line 47
    .line 48
    :goto_1
    :try_start_0
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :catchall_0
    move-exception p2

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    iget-object p1, v0, LP/m$i;->q:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lp6/u;

    .line 67
    .line 68
    iget-object v2, v0, LP/m$i;->p:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, LP/m;

    .line 71
    .line 72
    iget-object v4, v0, LP/m$i;->o:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, LP/m$b$b;

    .line 75
    .line 76
    :try_start_1
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    move-object p2, p1

    .line 80
    move-object p1, v4

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    iget-object p1, v0, LP/m$i;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Lp6/u;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, LP/m$b$b;->a()Lp6/u;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    :try_start_2
    sget-object v2, LV5/n;->o:LV5/n$a;

    .line 95
    .line 96
    iget-object v2, p0, LP/m;->h:Ls6/j;

    .line 97
    .line 98
    invoke-interface {v2}, Ls6/j;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, LP/n;

    .line 103
    .line 104
    instance-of v6, v2, LP/c;

    .line 105
    .line 106
    if-eqz v6, :cond_6

    .line 107
    .line 108
    invoke-virtual {p1}, LP/m$b$b;->d()Lg6/p;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {p1}, LP/m$b$b;->b()LX5/g;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p2, v0, LP/m$i;->o:Ljava/lang/Object;

    .line 117
    .line 118
    iput v5, v0, LP/m$i;->t:I

    .line 119
    .line 120
    invoke-virtual {p0, v2, p1, v0}, LP/m;->z(Lg6/p;LX5/g;LX5/d;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v1, :cond_5

    .line 125
    .line 126
    return-object v1

    .line 127
    :cond_5
    move-object v7, p2

    .line 128
    move-object p2, p1

    .line 129
    move-object p1, v7

    .line 130
    goto :goto_4

    .line 131
    :catchall_1
    move-exception p1

    .line 132
    move-object v7, p2

    .line 133
    move-object p2, p1

    .line 134
    move-object p1, v7

    .line 135
    goto :goto_5

    .line 136
    :cond_6
    instance-of v5, v2, LP/j;

    .line 137
    .line 138
    if-eqz v5, :cond_7

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_7
    instance-of v5, v2, LP/o;

    .line 142
    .line 143
    if-eqz v5, :cond_a

    .line 144
    .line 145
    :goto_2
    invoke-virtual {p1}, LP/m$b$b;->c()LP/n;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    if-ne v2, v5, :cond_9

    .line 150
    .line 151
    iput-object p1, v0, LP/m$i;->o:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object p0, v0, LP/m$i;->p:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object p2, v0, LP/m$i;->q:Ljava/lang/Object;

    .line 156
    .line 157
    iput v4, v0, LP/m$i;->t:I

    .line 158
    .line 159
    invoke-virtual {p0, v0}, LP/m;->v(LX5/d;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-ne v2, v1, :cond_8

    .line 164
    .line 165
    return-object v1

    .line 166
    :cond_8
    move-object v2, p0

    .line 167
    :goto_3
    invoke-virtual {p1}, LP/m$b$b;->d()Lg6/p;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {p1}, LP/m$b$b;->b()LX5/g;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iput-object p2, v0, LP/m$i;->o:Ljava/lang/Object;

    .line 176
    .line 177
    const/4 v5, 0x0

    .line 178
    iput-object v5, v0, LP/m$i;->p:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v5, v0, LP/m$i;->q:Ljava/lang/Object;

    .line 181
    .line 182
    iput v3, v0, LP/m$i;->t:I

    .line 183
    .line 184
    invoke-virtual {v2, v4, p1, v0}, LP/m;->z(Lg6/p;LX5/g;LX5/d;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 188
    if-ne p1, v1, :cond_5

    .line 189
    .line 190
    return-object v1

    .line 191
    :goto_4
    :try_start_3
    invoke-static {p2}, LV5/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 195
    goto :goto_6

    .line 196
    :cond_9
    :try_start_4
    check-cast v2, LP/j;

    .line 197
    .line 198
    invoke-virtual {v2}, LP/j;->a()Ljava/lang/Throwable;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    throw p1

    .line 203
    :cond_a
    instance-of p1, v2, LP/h;

    .line 204
    .line 205
    if-eqz p1, :cond_b

    .line 206
    .line 207
    check-cast v2, LP/h;

    .line 208
    .line 209
    invoke-virtual {v2}, LP/h;->a()Ljava/lang/Throwable;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    throw p1

    .line 214
    :cond_b
    new-instance p1, LV5/l;

    .line 215
    .line 216
    invoke-direct {p1}, LV5/l;-><init>()V

    .line 217
    .line 218
    .line 219
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 220
    :goto_5
    sget-object v0, LV5/n;->o:LV5/n$a;

    .line 221
    .line 222
    invoke-static {p2}, LV5/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    invoke-static {p2}, LV5/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    :goto_6
    invoke-static {p1, p2}, Lp6/w;->c(Lp6/u;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    sget-object p1, LV5/t;->a:LV5/t;

    .line 234
    .line 235
    return-object p1
.end method

.method public final u(LX5/d;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, LP/m$j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LP/m$j;

    iget v1, v0, LP/m$j;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LP/m$j;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, LP/m$j;

    invoke-direct {v0, p0, p1}, LP/m$j;-><init>(LP/m;LX5/d;)V

    :goto_0
    iget-object p1, v0, LP/m$j;->u:Ljava/lang/Object;

    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LP/m$j;->w:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, LP/m$j;->r:Ljava/lang/Object;

    check-cast v1, Ly6/a;

    iget-object v2, v0, LP/m$j;->q:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/s;

    iget-object v3, v0, LP/m$j;->p:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/u;

    iget-object v0, v0, LP/m$j;->o:Ljava/lang/Object;

    check-cast v0, LP/m;

    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LP/m$j;->t:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v8, v0, LP/m$j;->s:Ljava/lang/Object;

    check-cast v8, LP/m$k;

    iget-object v9, v0, LP/m$j;->r:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/s;

    iget-object v10, v0, LP/m$j;->q:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/u;

    iget-object v11, v0, LP/m$j;->p:Ljava/lang/Object;

    check-cast v11, Ly6/a;

    iget-object v12, v0, LP/m$j;->o:Ljava/lang/Object;

    check-cast v12, LP/m;

    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v2, v0, LP/m$j;->r:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/u;

    iget-object v8, v0, LP/m$j;->q:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/u;

    iget-object v9, v0, LP/m$j;->p:Ljava/lang/Object;

    check-cast v9, Ly6/a;

    iget-object v10, v0, LP/m$j;->o:Ljava/lang/Object;

    check-cast v10, LP/m;

    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LP/m;->h:Ls6/j;

    invoke-interface {p1}, Ls6/j;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v2, LP/o;->a:LP/o;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, LP/m;->h:Ls6/j;

    invoke-interface {p1}, Ls6/j;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, LP/j;

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    move p1, v5

    goto :goto_2

    :cond_6
    :goto_1
    move p1, v6

    :goto_2
    if-eqz p1, :cond_d

    invoke-static {v5, v6, v7}, Ly6/c;->b(ZILjava/lang/Object;)Ly6/a;

    move-result-object v9

    new-instance v2, Lkotlin/jvm/internal/u;

    invoke-direct {v2}, Lkotlin/jvm/internal/u;-><init>()V

    iput-object p0, v0, LP/m$j;->o:Ljava/lang/Object;

    iput-object v9, v0, LP/m$j;->p:Ljava/lang/Object;

    iput-object v2, v0, LP/m$j;->q:Ljava/lang/Object;

    iput-object v2, v0, LP/m$j;->r:Ljava/lang/Object;

    iput v6, v0, LP/m$j;->w:I

    invoke-virtual {p0, v0}, LP/m;->y(LX5/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object v10, p0

    move-object v8, v2

    :goto_3
    iput-object p1, v2, Lkotlin/jvm/internal/u;->o:Ljava/lang/Object;

    new-instance p1, Lkotlin/jvm/internal/s;

    invoke-direct {p1}, Lkotlin/jvm/internal/s;-><init>()V

    new-instance v2, LP/m$k;

    invoke-direct {v2, v9, p1, v8, v10}, LP/m$k;-><init>(Ly6/a;Lkotlin/jvm/internal/s;Lkotlin/jvm/internal/u;LP/m;)V

    iget-object v11, v10, LP/m;->i:Ljava/util/List;

    if-nez v11, :cond_8

    move-object v2, p1

    move-object p1, v0

    move-object v0, v10

    goto :goto_5

    :cond_8
    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v12, v10

    move-object v10, v8

    move-object v8, v2

    move-object v2, v11

    move-object v11, v9

    move-object v9, p1

    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/p;

    iput-object v12, v0, LP/m$j;->o:Ljava/lang/Object;

    iput-object v11, v0, LP/m$j;->p:Ljava/lang/Object;

    iput-object v10, v0, LP/m$j;->q:Ljava/lang/Object;

    iput-object v9, v0, LP/m$j;->r:Ljava/lang/Object;

    iput-object v8, v0, LP/m$j;->s:Ljava/lang/Object;

    iput-object v2, v0, LP/m$j;->t:Ljava/lang/Object;

    iput v4, v0, LP/m$j;->w:I

    invoke-interface {p1, v8, v0}, Lg6/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_a
    move-object p1, v0

    move-object v2, v9

    move-object v8, v10

    move-object v9, v11

    move-object v0, v12

    :goto_5
    iput-object v7, v0, LP/m;->i:Ljava/util/List;

    iput-object v0, p1, LP/m$j;->o:Ljava/lang/Object;

    iput-object v8, p1, LP/m$j;->p:Ljava/lang/Object;

    iput-object v2, p1, LP/m$j;->q:Ljava/lang/Object;

    iput-object v9, p1, LP/m$j;->r:Ljava/lang/Object;

    iput-object v7, p1, LP/m$j;->s:Ljava/lang/Object;

    iput-object v7, p1, LP/m$j;->t:Ljava/lang/Object;

    iput v3, p1, LP/m$j;->w:I

    invoke-interface {v9, v7, p1}, Ly6/a;->a(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    return-object v1

    :cond_b
    move-object v3, v8

    move-object v1, v9

    :goto_6
    :try_start_0
    iput-boolean v6, v2, Lkotlin/jvm/internal/s;->o:Z

    sget-object p1, LV5/t;->a:LV5/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v7}, Ly6/a;->b(Ljava/lang/Object;)V

    iget-object p1, v0, LP/m;->h:Ls6/j;

    new-instance v0, LP/c;

    iget-object v1, v3, Lkotlin/jvm/internal/u;->o:Ljava/lang/Object;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v5

    :cond_c
    invoke-direct {v0, v1, v5}, LP/c;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Ls6/j;->setValue(Ljava/lang/Object;)V

    sget-object p1, LV5/t;->a:LV5/t;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v7}, Ly6/a;->b(Ljava/lang/Object;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(LX5/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, LP/m$l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LP/m$l;

    .line 7
    .line 8
    iget v1, v0, LP/m$l;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP/m$l;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP/m$l;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LP/m$l;-><init>(LP/m;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LP/m$l;->p:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LP/m$l;->r:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, LP/m$l;->o:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LP/m;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    iput-object p0, v0, LP/m$l;->o:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, v0, LP/m$l;->r:I

    .line 62
    .line 63
    invoke-virtual {p0, v0}, LP/m;->u(LX5/d;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    sget-object p1, LV5/t;->a:LV5/t;

    .line 71
    .line 72
    return-object p1

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    move-object v0, p0

    .line 75
    :goto_2
    iget-object v0, v0, LP/m;->h:Ls6/j;

    .line 76
    .line 77
    new-instance v1, LP/j;

    .line 78
    .line 79
    invoke-direct {v1, p1}, LP/j;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v1}, Ls6/j;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    throw p1
.end method

.method public final w(LX5/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, LP/m$m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LP/m$m;

    .line 7
    .line 8
    iget v1, v0, LP/m$m;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP/m$m;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP/m$m;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LP/m$m;-><init>(LP/m;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LP/m$m;->p:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LP/m$m;->r:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, v0, LP/m$m;->o:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LP/m;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    iput-object p0, v0, LP/m$m;->o:Ljava/lang/Object;

    .line 60
    .line 61
    iput v3, v0, LP/m$m;->r:I

    .line 62
    .line 63
    invoke-virtual {p0, v0}, LP/m;->u(LX5/d;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :catchall_1
    move-exception p1

    .line 71
    move-object v0, p0

    .line 72
    :goto_1
    iget-object v0, v0, LP/m;->h:Ls6/j;

    .line 73
    .line 74
    new-instance v1, LP/j;

    .line 75
    .line 76
    invoke-direct {v1, p1}, LP/j;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v1}, Ls6/j;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    :goto_2
    sget-object p1, LV5/t;->a:LV5/t;

    .line 83
    .line 84
    return-object p1
.end method

.method public final x(LX5/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, LP/m$n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LP/m$n;

    .line 7
    .line 8
    iget v1, v0, LP/m$n;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP/m$n;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP/m$n;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LP/m$n;-><init>(LP/m;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LP/m$n;->r:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LP/m$n;->t:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object v1, v0, LP/m$n;->q:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Throwable;

    .line 41
    .line 42
    iget-object v2, v0, LP/m$n;->p:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/io/Closeable;

    .line 45
    .line 46
    iget-object v0, v0, LP/m$n;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LP/m;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :try_start_1
    new-instance v2, Ljava/io/FileInputStream;

    .line 68
    .line 69
    invoke-virtual {p0}, LP/m;->r()Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    .line 75
    .line 76
    :try_start_2
    iget-object p1, p0, LP/m;->b:LP/k;

    .line 77
    .line 78
    iput-object p0, v0, LP/m$n;->o:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v2, v0, LP/m$n;->p:Ljava/lang/Object;

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    iput-object v4, v0, LP/m$n;->q:Ljava/lang/Object;

    .line 84
    .line 85
    iput v3, v0, LP/m$n;->t:I

    .line 86
    .line 87
    invoke-interface {p1, v2, v0}, LP/k;->b(Ljava/io/InputStream;LX5/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    if-ne p1, v1, :cond_3

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_3
    move-object v0, p0

    .line 95
    move-object v1, v4

    .line 96
    :goto_1
    :try_start_3
    invoke-static {v2, v1}, Le6/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 97
    .line 98
    .line 99
    return-object p1

    .line 100
    :catch_0
    move-exception p1

    .line 101
    goto :goto_3

    .line 102
    :catchall_1
    move-exception p1

    .line 103
    move-object v0, p0

    .line 104
    :goto_2
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 105
    :catchall_2
    move-exception v1

    .line 106
    :try_start_5
    invoke-static {v2, p1}, Le6/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw v1
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    .line 110
    :catch_1
    move-exception p1

    .line 111
    move-object v0, p0

    .line 112
    :goto_3
    invoke-virtual {v0}, LP/m;->r()Ljava/io/File;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_4

    .line 121
    .line 122
    iget-object p1, v0, LP/m;->b:LP/k;

    .line 123
    .line 124
    invoke-interface {p1}, LP/k;->a()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    :cond_4
    throw p1
.end method

.method public final y(LX5/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, LP/m$o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LP/m$o;

    .line 7
    .line 8
    iget v1, v0, LP/m$o;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP/m$o;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP/m$o;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, LP/m$o;-><init>(LP/m;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LP/m$o;->q:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LP/m$o;->s:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object v1, v0, LP/m$o;->p:Ljava/lang/Object;

    .line 45
    .line 46
    iget-object v0, v0, LP/m$o;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LP/a;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto :goto_5

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    iget-object v2, v0, LP/m$o;->p:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, LP/a;

    .line 67
    .line 68
    iget-object v4, v0, LP/m$o;->o:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, LP/m;

    .line 71
    .line 72
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    iget-object v2, v0, LP/m$o;->o:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, LP/m;

    .line 79
    .line 80
    :try_start_1
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch LP/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catch_1
    move-exception p1

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :try_start_2
    iput-object p0, v0, LP/m$o;->o:Ljava/lang/Object;

    .line 90
    .line 91
    iput v5, v0, LP/m$o;->s:I

    .line 92
    .line 93
    invoke-virtual {p0, v0}, LP/m;->x(LX5/d;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_2
    .catch LP/a; {:try_start_2 .. :try_end_2} :catch_2

    .line 97
    if-ne p1, v1, :cond_5

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_5
    :goto_1
    return-object p1

    .line 101
    :catch_2
    move-exception p1

    .line 102
    move-object v2, p0

    .line 103
    :goto_2
    iget-object v5, v2, LP/m;->c:LP/b;

    .line 104
    .line 105
    iput-object v2, v0, LP/m$o;->o:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object p1, v0, LP/m$o;->p:Ljava/lang/Object;

    .line 108
    .line 109
    iput v4, v0, LP/m$o;->s:I

    .line 110
    .line 111
    invoke-interface {v5, p1, v0}, LP/b;->a(LP/a;LX5/d;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-ne v4, v1, :cond_6

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_6
    move-object v6, v2

    .line 119
    move-object v2, p1

    .line 120
    move-object p1, v4

    .line 121
    move-object v4, v6

    .line 122
    :goto_3
    :try_start_3
    iput-object v2, v0, LP/m$o;->o:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p1, v0, LP/m$o;->p:Ljava/lang/Object;

    .line 125
    .line 126
    iput v3, v0, LP/m$o;->s:I

    .line 127
    .line 128
    invoke-virtual {v4, p1, v0}, LP/m;->A(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 132
    if-ne v0, v1, :cond_7

    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_7
    move-object v1, p1

    .line 136
    :goto_4
    return-object v1

    .line 137
    :catch_3
    move-exception p1

    .line 138
    move-object v0, v2

    .line 139
    :goto_5
    invoke-static {v0, p1}, LV5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw v0
.end method

.method public final z(Lg6/p;LX5/g;LX5/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, LP/m$p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LP/m$p;

    .line 7
    .line 8
    iget v1, v0, LP/m$p;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP/m$p;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP/m$p;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LP/m$p;-><init>(LP/m;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LP/m$p;->r:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LP/m$p;->t:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, LP/m$p;->p:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object p2, v0, LP/m$p;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, LP/m;

    .line 47
    .line 48
    invoke-static {p3}, LV5/o;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, v0, LP/m$p;->q:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p2, v0, LP/m$p;->p:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, LP/c;

    .line 65
    .line 66
    iget-object v2, v0, LP/m$p;->o:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, LP/m;

    .line 69
    .line 70
    invoke-static {p3}, LV5/o;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-static {p3}, LV5/o;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p3, p0, LP/m;->h:Ls6/j;

    .line 78
    .line 79
    invoke-interface {p3}, Ls6/j;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    check-cast p3, LP/c;

    .line 84
    .line 85
    invoke-virtual {p3}, LP/c;->a()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, LP/c;->b()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    new-instance v6, LP/m$q;

    .line 93
    .line 94
    invoke-direct {v6, p1, v2, v3}, LP/m$q;-><init>(Lg6/p;Ljava/lang/Object;LX5/d;)V

    .line 95
    .line 96
    .line 97
    iput-object p0, v0, LP/m$p;->o:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object p3, v0, LP/m$p;->p:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v2, v0, LP/m$p;->q:Ljava/lang/Object;

    .line 102
    .line 103
    iput v5, v0, LP/m$p;->t:I

    .line 104
    .line 105
    invoke-static {p2, v6, v0}, Lp6/g;->g(LX5/g;Lg6/p;LX5/d;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-ne p1, v1, :cond_4

    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_4
    move-object p2, p3

    .line 113
    move-object p3, p1

    .line 114
    move-object p1, v2

    .line 115
    move-object v2, p0

    .line 116
    :goto_1
    invoke-virtual {p2}, LP/c;->a()V

    .line 117
    .line 118
    .line 119
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-eqz p2, :cond_5

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    iput-object v2, v0, LP/m$p;->o:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object p3, v0, LP/m$p;->p:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v3, v0, LP/m$p;->q:Ljava/lang/Object;

    .line 131
    .line 132
    iput v4, v0, LP/m$p;->t:I

    .line 133
    .line 134
    invoke-virtual {v2, p3, v0}, LP/m;->A(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v1, :cond_6

    .line 139
    .line 140
    return-object v1

    .line 141
    :cond_6
    move-object p1, p3

    .line 142
    move-object p2, v2

    .line 143
    :goto_2
    iget-object p2, p2, LP/m;->h:Ls6/j;

    .line 144
    .line 145
    new-instance p3, LP/c;

    .line 146
    .line 147
    if-eqz p1, :cond_7

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    goto :goto_3

    .line 154
    :cond_7
    const/4 v0, 0x0

    .line 155
    :goto_3
    invoke-direct {p3, p1, v0}, LP/c;-><init>(Ljava/lang/Object;I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p2, p3}, Ls6/j;->setValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :goto_4
    return-object p1
.end method

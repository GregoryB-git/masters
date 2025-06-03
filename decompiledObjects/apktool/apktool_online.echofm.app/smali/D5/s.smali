.class public LD5/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:[B

.field public c:LE5/k;

.field public d:LE5/k$d;

.field public e:Z

.field public f:Z

.field public final g:LE5/k$c;


# direct methods
.method public constructor <init>(LE5/k;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LD5/s;->e:Z

    iput-boolean v0, p0, LD5/s;->f:Z

    new-instance v0, LD5/s$b;

    invoke-direct {v0, p0}, LD5/s$b;-><init>(LD5/s;)V

    iput-object v0, p0, LD5/s;->g:LE5/k$c;

    iput-object p1, p0, LD5/s;->c:LE5/k;

    iput-boolean p2, p0, LD5/s;->a:Z

    invoke-virtual {p1, v0}, LE5/k;->e(LE5/k$c;)V

    return-void
.end method

.method public constructor <init>(Lw5/a;Z)V
    .locals 3

    .line 2
    new-instance v0, LE5/k;

    const-string v1, "flutter/restoration"

    sget-object v2, LE5/q;->b:LE5/q;

    invoke-direct {v0, p1, v1, v2}, LE5/k;-><init>(LE5/c;Ljava/lang/String;LE5/l;)V

    invoke-direct {p0, v0, p2}, LD5/s;-><init>(LE5/k;Z)V

    return-void
.end method

.method public static synthetic a(LD5/s;)[B
    .locals 0

    .line 1
    iget-object p0, p0, LD5/s;->b:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(LD5/s;[B)[B
    .locals 0

    .line 1
    iput-object p1, p0, LD5/s;->b:[B

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic c(LD5/s;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LD5/s;->f:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(LD5/s;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LD5/s;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(LD5/s;[B)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD5/s;->i([B)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(LD5/s;LE5/k$d;)LE5/k$d;
    .locals 0

    .line 1
    iput-object p1, p0, LD5/s;->d:LE5/k$d;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LD5/s;->b:[B

    .line 3
    .line 4
    return-void
.end method

.method public h()[B
    .locals 1

    .line 1
    iget-object v0, p0, LD5/s;->b:[B

    .line 2
    .line 3
    return-object v0
.end method

.method public final i([B)Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    const-string v2, "enabled"

    .line 9
    .line 10
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string v1, "data"

    .line 14
    .line 15
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public j([B)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LD5/s;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, LD5/s;->d:LE5/k$d;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LD5/s;->i([B)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, LD5/s;->d:LE5/k$d;

    .line 17
    .line 18
    :cond_0
    iput-object p1, p0, LD5/s;->b:[B

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-boolean v0, p0, LD5/s;->f:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LD5/s;->c:LE5/k;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, LD5/s;->i([B)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, LD5/s$a;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1}, LD5/s$a;-><init>(LD5/s;[B)V

    .line 34
    .line 35
    .line 36
    const-string p1, "push"

    .line 37
    .line 38
    invoke-virtual {v0, p1, v1, v2}, LE5/k;->d(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void
.end method

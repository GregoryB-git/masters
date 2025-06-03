.class public abstract Lc1/j;
.super Lj0/k;
.source "SourceFile"

# interfaces
.implements Lc1/l;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Lc1/p;

    .line 3
    .line 4
    new-array v0, v0, [Lc1/q;

    .line 5
    .line 6
    invoke-direct {p0, v1, v0}, Lj0/k;-><init>([Lj0/i;[Lj0/j;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lc1/j;->o:Ljava/lang/String;

    .line 10
    .line 11
    const/16 p1, 0x400

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lj0/k;->w(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic x(Lc1/j;Lj0/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lj0/k;->t(Lj0/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Throwable;)Lc1/m;
    .locals 2

    .line 1
    new-instance v0, Lc1/m;

    .line 2
    .line 3
    const-string v1, "Unexpected decode error"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lc1/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public abstract B([BIZ)Lc1/k;
.end method

.method public final C(Lc1/p;Lc1/q;Z)Lc1/m;
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p1, Lj0/i;->r:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p0, v1, v0, p3}, Lc1/j;->B([BIZ)Lc1/k;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-wide v3, p1, Lj0/i;->t:J

    .line 22
    .line 23
    iget-wide v6, p1, Lc1/p;->x:J

    .line 24
    .line 25
    move-object v2, p2

    .line 26
    invoke-virtual/range {v2 .. v7}, Lc1/q;->z(JLc1/k;J)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, p2, Lj0/j;->r:Z
    :try_end_0
    .catch Lc1/m; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    return-object p1

    .line 34
    :catch_0
    move-exception p1

    .line 35
    return-object p1
.end method

.method public d(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic i()Lj0/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc1/j;->y()Lc1/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic j()Lj0/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc1/j;->z()Lc1/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic k(Ljava/lang/Throwable;)Lj0/h;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc1/j;->A(Ljava/lang/Throwable;)Lc1/m;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic l(Lj0/i;Lj0/j;Z)Lj0/h;
    .locals 0

    .line 1
    check-cast p1, Lc1/p;

    .line 2
    .line 3
    check-cast p2, Lc1/q;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lc1/j;->C(Lc1/p;Lc1/q;Z)Lc1/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final y()Lc1/p;
    .locals 1

    .line 1
    new-instance v0, Lc1/p;

    .line 2
    .line 3
    invoke-direct {v0}, Lc1/p;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final z()Lc1/q;
    .locals 1

    .line 1
    new-instance v0, Lc1/j$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lc1/j$a;-><init>(Lc1/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

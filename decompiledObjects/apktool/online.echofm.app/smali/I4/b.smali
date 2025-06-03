.class public final LI4/b;
.super Ljava/io/OutputStream;
.source "SourceFile"


# instance fields
.field public final o:Ljava/io/OutputStream;

.field public final p:LM4/l;

.field public q:LG4/j;

.field public r:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;LG4/j;LM4/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, LI4/b;->r:J

    .line 7
    .line 8
    iput-object p1, p0, LI4/b;->o:Ljava/io/OutputStream;

    .line 9
    .line 10
    iput-object p2, p0, LI4/b;->q:LG4/j;

    .line 11
    .line 12
    iput-object p3, p0, LI4/b;->p:LM4/l;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public close()V
    .locals 4

    .line 1
    iget-wide v0, p0, LI4/b;->r:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, LI4/b;->q:LG4/j;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v1}, LG4/j;->v(J)LG4/j;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LI4/b;->q:LG4/j;

    .line 15
    .line 16
    iget-object v1, p0, LI4/b;->p:LM4/l;

    .line 17
    .line 18
    invoke-virtual {v1}, LM4/l;->c()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-virtual {v0, v1, v2}, LG4/j;->z(J)LG4/j;

    .line 23
    .line 24
    .line 25
    :try_start_0
    iget-object v0, p0, LI4/b;->o:Ljava/io/OutputStream;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception v0

    .line 32
    iget-object v1, p0, LI4/b;->q:LG4/j;

    .line 33
    .line 34
    iget-object v2, p0, LI4/b;->p:LM4/l;

    .line 35
    .line 36
    invoke-virtual {v2}, LM4/l;->c()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, LI4/b;->q:LG4/j;

    .line 44
    .line 45
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public flush()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LI4/b;->o:Ljava/io/OutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception v0

    .line 8
    iget-object v1, p0, LI4/b;->q:LG4/j;

    .line 9
    .line 10
    iget-object v2, p0, LI4/b;->p:LM4/l;

    .line 11
    .line 12
    invoke-virtual {v2}, LM4/l;->c()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LI4/b;->q:LG4/j;

    .line 20
    .line 21
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public write(I)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LI4/b;->o:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    iget-wide v0, p0, LI4/b;->r:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, LI4/b;->r:J

    iget-object p1, p0, LI4/b;->q:LG4/j;

    invoke-virtual {p1, v0, v1}, LG4/j;->v(J)LG4/j;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, LI4/b;->q:LG4/j;

    iget-object v1, p0, LI4/b;->p:LM4/l;

    invoke-virtual {v1}, LM4/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LG4/j;->A(J)LG4/j;

    iget-object v0, p0, LI4/b;->q:LG4/j;

    invoke-static {v0}, LI4/j;->d(LG4/j;)V

    throw p1
.end method

.method public write([B)V
    .locals 4

    .line 2
    :try_start_0
    iget-object v0, p0, LI4/b;->o:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    iget-wide v0, p0, LI4/b;->r:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, LI4/b;->r:J

    iget-object p1, p0, LI4/b;->q:LG4/j;

    invoke-virtual {p1, v0, v1}, LG4/j;->v(J)LG4/j;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v0, p0, LI4/b;->q:LG4/j;

    iget-object v1, p0, LI4/b;->p:LM4/l;

    invoke-virtual {v1}, LM4/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LG4/j;->A(J)LG4/j;

    iget-object v0, p0, LI4/b;->q:LG4/j;

    invoke-static {v0}, LI4/j;->d(LG4/j;)V

    throw p1
.end method

.method public write([BII)V
    .locals 2

    .line 3
    :try_start_0
    iget-object v0, p0, LI4/b;->o:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    iget-wide p1, p0, LI4/b;->r:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, LI4/b;->r:J

    iget-object p3, p0, LI4/b;->q:LG4/j;

    invoke-virtual {p3, p1, p2}, LG4/j;->v(J)LG4/j;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, LI4/b;->q:LG4/j;

    iget-object p3, p0, LI4/b;->p:LM4/l;

    invoke-virtual {p3}, LM4/l;->c()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, LG4/j;->A(J)LG4/j;

    iget-object p2, p0, LI4/b;->q:LG4/j;

    invoke-static {p2}, LI4/j;->d(LG4/j;)V

    throw p1
.end method

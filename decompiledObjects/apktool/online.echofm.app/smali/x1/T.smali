.class public final Lx1/T;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"

# interfaces
.implements Lx1/U;


# instance fields
.field public final o:Lx1/J;

.field public final p:Ljava/util/Map;

.field public final q:J

.field public final r:J

.field public s:J

.field public t:J

.field public u:Lx1/V;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lx1/J;Ljava/util/Map;J)V
    .locals 1

    .line 1
    const-string v0, "out"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "requests"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "progressMap"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lx1/T;->o:Lx1/J;

    .line 20
    .line 21
    iput-object p3, p0, Lx1/T;->p:Ljava/util/Map;

    .line 22
    .line 23
    iput-wide p4, p0, Lx1/T;->q:J

    .line 24
    .line 25
    invoke-static {}, Lx1/B;->A()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    iput-wide p1, p0, Lx1/T;->r:J

    .line 30
    .line 31
    return-void
.end method

.method private final b(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/T;->u:Lx1/V;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p1, p2}, Lx1/V;->a(J)V

    .line 7
    .line 8
    .line 9
    :goto_0
    iget-wide v0, p0, Lx1/T;->s:J

    .line 10
    .line 11
    add-long/2addr v0, p1

    .line 12
    iput-wide v0, p0, Lx1/T;->s:J

    .line 13
    .line 14
    iget-wide p1, p0, Lx1/T;->t:J

    .line 15
    .line 16
    iget-wide v2, p0, Lx1/T;->r:J

    .line 17
    .line 18
    add-long/2addr p1, v2

    .line 19
    cmp-long p1, v0, p1

    .line 20
    .line 21
    if-gez p1, :cond_1

    .line 22
    .line 23
    iget-wide p1, p0, Lx1/T;->q:J

    .line 24
    .line 25
    cmp-long p1, v0, p1

    .line 26
    .line 27
    if-ltz p1, :cond_2

    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lx1/T;->c()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method


# virtual methods
.method public a(Lx1/F;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lx1/T;->p:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lx1/V;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    iput-object p1, p0, Lx1/T;->u:Lx1/V;

    .line 14
    .line 15
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lx1/T;->s:J

    .line 2
    .line 3
    iget-wide v2, p0, Lx1/T;->t:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lx1/T;->o:Lx1/J;

    .line 10
    .line 11
    invoke-virtual {v0}, Lx1/J;->T()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lx1/J$a;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-wide v0, p0, Lx1/T;->s:J

    .line 33
    .line 34
    iput-wide v0, p0, Lx1/T;->t:J

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public close()V
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx1/T;->p:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lx1/V;

    .line 25
    .line 26
    invoke-virtual {v1}, Lx1/V;->c()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lx1/T;->c()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public write(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    const-wide/16 v0, 0x1

    invoke-direct {p0, v0, v1}, Lx1/T;->b(J)V

    return-void
.end method

.method public write([B)V
    .locals 2

    .line 2
    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    array-length p1, p1

    int-to-long v0, p1

    invoke-direct {p0, v0, v1}, Lx1/T;->b(J)V

    return-void
.end method

.method public write([BII)V
    .locals 1

    .line 3
    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    int-to-long p1, p3

    invoke-direct {p0, p1, p2}, Lx1/T;->b(J)V

    return-void
.end method

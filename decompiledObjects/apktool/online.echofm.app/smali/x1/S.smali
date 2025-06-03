.class public final Lx1/S;
.super Ljava/io/OutputStream;
.source "SourceFile"

# interfaces
.implements Lx1/U;


# instance fields
.field public final o:Landroid/os/Handler;

.field public final p:Ljava/util/Map;

.field public q:Lx1/F;

.field public r:Lx1/V;

.field public s:I


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/S;->o:Landroid/os/Handler;

    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lx1/S;->p:Ljava/util/Map;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(Lx1/F;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lx1/S;->q:Lx1/F;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx1/S;->p:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lx1/V;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iput-object p1, p0, Lx1/S;->r:Lx1/V;

    .line 16
    .line 17
    return-void
.end method

.method public final b(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/S;->q:Lx1/F;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lx1/S;->r:Lx1/V;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    new-instance v1, Lx1/V;

    .line 11
    .line 12
    iget-object v2, p0, Lx1/S;->o:Landroid/os/Handler;

    .line 13
    .line 14
    invoke-direct {v1, v2, v0}, Lx1/V;-><init>(Landroid/os/Handler;Lx1/F;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lx1/S;->r:Lx1/V;

    .line 18
    .line 19
    iget-object v2, p0, Lx1/S;->p:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lx1/S;->r:Lx1/V;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    invoke-virtual {v0, p1, p2}, Lx1/V;->b(J)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget v0, p0, Lx1/S;->s:I

    .line 33
    .line 34
    long-to-int p1, p1

    .line 35
    add-int/2addr v0, p1

    .line 36
    iput v0, p0, Lx1/S;->s:I

    .line 37
    .line 38
    return-void
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lx1/S;->s:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/S;->p:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public write(I)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lx1/S;->b(J)V

    return-void
.end method

.method public write([B)V
    .locals 2

    .line 2
    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lx1/S;->b(J)V

    return-void
.end method

.method public write([BII)V
    .locals 0

    .line 3
    const-string p2, "buffer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long p1, p3

    invoke-virtual {p0, p1, p2}, Lx1/S;->b(J)V

    return-void
.end method

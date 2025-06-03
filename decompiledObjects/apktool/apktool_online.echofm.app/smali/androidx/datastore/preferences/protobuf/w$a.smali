.class public abstract Landroidx/datastore/preferences/protobuf/w$a;
.super Landroidx/datastore/preferences/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field public final o:Landroidx/datastore/preferences/protobuf/w;

.field public p:Landroidx/datastore/preferences/protobuf/w;

.field public q:Z


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/w;)V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/a$a;-><init>()V

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/w$a;->o:Landroidx/datastore/preferences/protobuf/w;

    sget-object v0, Landroidx/datastore/preferences/protobuf/w$d;->r:Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {p1, v0}, Landroidx/datastore/preferences/protobuf/w;->q(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/datastore/preferences/protobuf/w;

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/datastore/preferences/protobuf/w$a;->q:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Landroidx/datastore/preferences/protobuf/O;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->w()Landroidx/datastore/preferences/protobuf/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Landroidx/datastore/preferences/protobuf/O;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->t()Landroidx/datastore/preferences/protobuf/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->u()Landroidx/datastore/preferences/protobuf/w$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n(Landroidx/datastore/preferences/protobuf/a;)Landroidx/datastore/preferences/protobuf/a$a;
    .locals 0

    .line 1
    check-cast p1, Landroidx/datastore/preferences/protobuf/w;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/w$a;->x(Landroidx/datastore/preferences/protobuf/w;)Landroidx/datastore/preferences/protobuf/w$a;

    move-result-object p1

    return-object p1
.end method

.method public final s()Landroidx/datastore/preferences/protobuf/w;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->t()Landroidx/datastore/preferences/protobuf/w;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->x()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/a$a;->p(Landroidx/datastore/preferences/protobuf/O;)Landroidx/datastore/preferences/protobuf/k0;

    move-result-object v0

    throw v0
.end method

.method public t()Landroidx/datastore/preferences/protobuf/w;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->z()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->q:Z

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    return-object v0
.end method

.method public u()Landroidx/datastore/preferences/protobuf/w$a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->w()Landroidx/datastore/preferences/protobuf/w;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->B()Landroidx/datastore/preferences/protobuf/w$a;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->t()Landroidx/datastore/preferences/protobuf/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/w$a;->y(Landroidx/datastore/preferences/protobuf/w;)Landroidx/datastore/preferences/protobuf/w$a;

    return-object v0
.end method

.method public v()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    sget-object v1, Landroidx/datastore/preferences/protobuf/w$d;->r:Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/protobuf/w;->q(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    invoke-virtual {p0, v0, v1}, Landroidx/datastore/preferences/protobuf/w$a;->z(Landroidx/datastore/preferences/protobuf/w;Landroidx/datastore/preferences/protobuf/w;)V

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->q:Z

    :cond_0
    return-void
.end method

.method public w()Landroidx/datastore/preferences/protobuf/w;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->o:Landroidx/datastore/preferences/protobuf/w;

    return-object v0
.end method

.method public x(Landroidx/datastore/preferences/protobuf/w;)Landroidx/datastore/preferences/protobuf/w$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/w$a;->y(Landroidx/datastore/preferences/protobuf/w;)Landroidx/datastore/preferences/protobuf/w$a;

    move-result-object p1

    return-object p1
.end method

.method public y(Landroidx/datastore/preferences/protobuf/w;)Landroidx/datastore/preferences/protobuf/w$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w$a;->v()V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/w$a;->p:Landroidx/datastore/preferences/protobuf/w;

    invoke-virtual {p0, v0, p1}, Landroidx/datastore/preferences/protobuf/w$a;->z(Landroidx/datastore/preferences/protobuf/w;Landroidx/datastore/preferences/protobuf/w;)V

    return-object p0
.end method

.method public final z(Landroidx/datastore/preferences/protobuf/w;Landroidx/datastore/preferences/protobuf/w;)V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/a0;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/a0;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/e0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

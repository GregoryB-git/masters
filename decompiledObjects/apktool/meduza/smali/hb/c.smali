.class public abstract Lhb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/c;


# instance fields
.field public final a:Ljb/c;


# direct methods
.method public constructor <init>(Ljb/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lhb/c;->a:Ljb/c;

    return-void
.end method


# virtual methods
.method public final A(ZILjava/util/List;)V
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0, p1, p2, p3}, Ljb/c;->A(ZILjava/util/List;)V

    return-void
.end method

.method public final a0(Lc4/x;)V
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0, p1}, Ljb/c;->a0(Lc4/x;)V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final d(IJ)V
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0, p1, p2, p3}, Ljb/c;->d(IJ)V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0}, Ljb/c;->flush()V

    return-void
.end method

.method public final o0(Ljb/a;[B)V
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0, p1, p2}, Ljb/c;->o0(Ljb/a;[B)V

    return-void
.end method

.method public final t0()I
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0}, Ljb/c;->t0()I

    move-result v0

    return v0
.end method

.method public final u(ZILxc/f;I)V
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0, p1, p2, p3, p4}, Ljb/c;->u(ZILxc/f;I)V

    return-void
.end method

.method public final w()V
    .locals 1

    iget-object v0, p0, Lhb/c;->a:Ljb/c;

    invoke-interface {v0}, Ljb/c;->w()V

    return-void
.end method

.class public abstract Lx3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx3/f;


# instance fields
.field public b:Lx3/f$a;

.field public c:Lx3/f$a;

.field public d:Lx3/f$a;

.field public e:Lx3/f$a;

.field public f:Ljava/nio/ByteBuffer;

.field public g:Ljava/nio/ByteBuffer;

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lx3/f;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lx3/q;->f:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lx3/q;->g:Ljava/nio/ByteBuffer;

    sget-object v0, Lx3/f$a;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->d:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->b:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->c:Lx3/f$a;

    return-void
.end method


# virtual methods
.method public a()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lx3/q;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lx3/f;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lx3/q;->g:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx3/q;->h:Z

    invoke-virtual {p0}, Lx3/q;->h()V

    return-void
.end method

.method public d()Z
    .locals 2

    iget-boolean v0, p0, Lx3/q;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx3/q;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lx3/f;->a:Ljava/nio/ByteBuffer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e(Lx3/f$a;)Lx3/f$a;
    .locals 0

    iput-object p1, p0, Lx3/q;->d:Lx3/f$a;

    invoke-virtual {p0, p1}, Lx3/q;->f(Lx3/f$a;)Lx3/f$a;

    move-result-object p1

    iput-object p1, p0, Lx3/q;->e:Lx3/f$a;

    invoke-virtual {p0}, Lx3/q;->isActive()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lx3/q;->e:Lx3/f$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lx3/f$a;->e:Lx3/f$a;

    :goto_0
    return-object p1
.end method

.method public abstract f(Lx3/f$a;)Lx3/f$a;
.end method

.method public final flush()V
    .locals 1

    sget-object v0, Lx3/f;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lx3/q;->g:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx3/q;->h:Z

    iget-object v0, p0, Lx3/q;->d:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->b:Lx3/f$a;

    iget-object v0, p0, Lx3/q;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->c:Lx3/f$a;

    invoke-virtual {p0}, Lx3/q;->g()V

    return-void
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()V
    .locals 0

    return-void
.end method

.method public isActive()Z
    .locals 2

    iget-object v0, p0, Lx3/q;->e:Lx3/f$a;

    sget-object v1, Lx3/f$a;->e:Lx3/f$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j(I)Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lx3/q;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-ge v0, p1, :cond_0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lx3/q;->f:Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lx3/q;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_0
    iget-object p1, p0, Lx3/q;->f:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lx3/q;->g:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public final reset()V
    .locals 1

    invoke-virtual {p0}, Lx3/q;->flush()V

    sget-object v0, Lx3/f;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lx3/q;->f:Ljava/nio/ByteBuffer;

    sget-object v0, Lx3/f$a;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->d:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->e:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->b:Lx3/f$a;

    iput-object v0, p0, Lx3/q;->c:Lx3/f$a;

    invoke-virtual {p0}, Lx3/q;->i()V

    return-void
.end method

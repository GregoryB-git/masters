.class public abstract Lcom/google/crypto/tink/shaded/protobuf/x$a;
.super Lcom/google/crypto/tink/shaded/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field public final o:Lcom/google/crypto/tink/shaded/protobuf/x;

.field public p:Lcom/google/crypto/tink/shaded/protobuf/x;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/a$a;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->o:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->D()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->x()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static w(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/a0;->a()Lcom/google/crypto/tink/shaded/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/a0;->d(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/e0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private x()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->o:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->J()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final n()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->o()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->B()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/a$a;->l(Lcom/google/crypto/tink/shaded/protobuf/O;)Lcom/google/crypto/tink/shaded/protobuf/j0;

    move-result-object v0

    throw v0
.end method

.method public o()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->E()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0
.end method

.method public p()Lcom/google/crypto/tink/shaded/protobuf/x$a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->u()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->H()Lcom/google/crypto/tink/shaded/protobuf/x$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->o()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    iput-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0
.end method

.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/x;->D()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->t()V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->x()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->w(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-void
.end method

.method public u()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->o:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0
.end method

.method public v(Lcom/google/crypto/tink/shaded/protobuf/x;)Lcom/google/crypto/tink/shaded/protobuf/x$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->u()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->s()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    invoke-static {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->w(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

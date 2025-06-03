.class public abstract Lcom/google/protobuf/r$a;
.super Lcom/google/protobuf/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field public final o:Lcom/google/protobuf/r;

.field public p:Lcom/google/protobuf/r;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/r;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a$a;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/r$a;->o:Lcom/google/protobuf/r;

    invoke-virtual {p1}, Lcom/google/protobuf/r;->I()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/protobuf/r$a;->C()Lcom/google/protobuf/r;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static B(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/W;->a()Lcom/google/protobuf/W;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/W;->d(Ljava/lang/Object;)Lcom/google/protobuf/Z;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Z;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private C()Lcom/google/protobuf/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->o:Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->P()Lcom/google/protobuf/r;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A()Lcom/google/protobuf/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->o:Lcom/google/protobuf/r;

    return-object v0
.end method

.method public bridge synthetic c()Lcom/google/protobuf/K;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->w()Lcom/google/protobuf/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->x()Lcom/google/protobuf/r$a;

    move-result-object v0

    return-object v0
.end method

.method public final v()Lcom/google/protobuf/r;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->w()Lcom/google/protobuf/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/r;->G()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/a$a;->u(Lcom/google/protobuf/K;)Lcom/google/protobuf/f0;

    move-result-object v0

    throw v0
.end method

.method public w()Lcom/google/protobuf/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->I()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->J()V

    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    return-object v0
.end method

.method public x()Lcom/google/protobuf/r$a;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->A()Lcom/google/protobuf/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/r;->N()Lcom/google/protobuf/r$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->w()Lcom/google/protobuf/r;

    move-result-object v1

    iput-object v1, v0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    return-object v0
.end method

.method public final y()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    invoke-virtual {v0}, Lcom/google/protobuf/r;->I()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->z()V

    :cond_0
    return-void
.end method

.method public z()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/r$a;->C()Lcom/google/protobuf/r;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    invoke-static {v0, v1}, Lcom/google/protobuf/r$a;->B(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    return-void
.end method

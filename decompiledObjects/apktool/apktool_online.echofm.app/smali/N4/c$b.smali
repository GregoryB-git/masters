.class public final LN4/c$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, LN4/c;->T()LN4/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LN4/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LN4/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 2
    .line 3
    check-cast v0, LN4/c;

    .line 4
    .line 5
    invoke-virtual {v0}, LN4/c;->d0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public E(Ljava/util/Map;)LN4/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/c;

    .line 7
    .line 8
    invoke-static {v0}, LN4/c;->W(LN4/c;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public F(LN4/a$b;)LN4/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LN4/a;

    .line 13
    .line 14
    invoke-static {v0, p1}, LN4/c;->Y(LN4/c;LN4/a;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public G(Ljava/lang/String;)LN4/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/c;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/c;->X(LN4/c;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public H(LN4/d;)LN4/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/c;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/c;->V(LN4/c;LN4/d;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public I(Ljava/lang/String;)LN4/c$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/c;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/c;->U(LN4/c;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

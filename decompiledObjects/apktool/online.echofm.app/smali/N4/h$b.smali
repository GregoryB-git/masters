.class public final LN4/h$b;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, LN4/h;->T()LN4/h;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LN4/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LN4/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Iterable;)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/h;->e0(LN4/h;Ljava/lang/Iterable;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public E()LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0}, LN4/h;->d0(LN4/h;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public F()LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0}, LN4/h;->Y(LN4/h;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public G()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 2
    .line 3
    check-cast v0, LN4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, LN4/h;->w0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public H()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 2
    .line 3
    check-cast v0, LN4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, LN4/h;->x0()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public I()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 2
    .line 3
    check-cast v0, LN4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, LN4/h;->y0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 2
    .line 3
    check-cast v0, LN4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, LN4/h;->A0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public K()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 2
    .line 3
    check-cast v0, LN4/h;

    .line 4
    .line 5
    invoke-virtual {v0}, LN4/h;->E0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public L(Ljava/util/Map;)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0}, LN4/h;->d0(LN4/h;)Ljava/util/Map;

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

.method public M(J)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, LN4/h;->Z(LN4/h;J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public N(LN4/h$d;)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/h;->f0(LN4/h;LN4/h$d;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public O(I)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/h;->W(LN4/h;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public P(LN4/h$e;)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/h;->V(LN4/h;LN4/h$e;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public Q(J)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, LN4/h;->g0(LN4/h;J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public R(Ljava/lang/String;)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/h;->X(LN4/h;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public S(J)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, LN4/h;->h0(LN4/h;J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public T(J)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, LN4/h;->a0(LN4/h;J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public U(J)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, LN4/h;->c0(LN4/h;J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public V(J)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1, p2}, LN4/h;->b0(LN4/h;J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public W(Ljava/lang/String;)LN4/h$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/h;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/h;->U(LN4/h;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

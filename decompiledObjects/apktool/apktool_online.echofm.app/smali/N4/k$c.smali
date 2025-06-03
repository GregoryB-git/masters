.class public final LN4/k$c;
.super Lcom/google/protobuf/r$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, LN4/k;->T()LN4/k;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/r$a;-><init>(Lcom/google/protobuf/r;)V

    return-void
.end method

.method public synthetic constructor <init>(LN4/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LN4/k$c;-><init>()V

    return-void
.end method


# virtual methods
.method public D(LN4/l;)LN4/k$c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/k;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/k;->V(LN4/k;LN4/l;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public E(Ljava/lang/String;)LN4/k$c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/r$a;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/r$a;->p:Lcom/google/protobuf/r;

    .line 5
    .line 6
    check-cast v0, LN4/k;

    .line 7
    .line 8
    invoke-static {v0, p1}, LN4/k;->U(LN4/k;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

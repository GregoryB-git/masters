.class public final Lp3/C$b;
.super Lcom/google/crypto/tink/shaded/protobuf/x$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/P;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp3/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lp3/C;->U()Lp3/C;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public synthetic constructor <init>(Lp3/C$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp3/C$b;-><init>()V

    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 2
    .line 3
    check-cast v0, Lp3/C;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp3/C;->a0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public B()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 2
    .line 3
    check-cast v0, Lp3/C;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp3/C;->b0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public C(I)Lp3/C$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 5
    .line 6
    check-cast v0, Lp3/C;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lp3/C;->V(Lp3/C;I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public bridge synthetic b()Lcom/google/crypto/tink/shaded/protobuf/O;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->u()Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic c()Lcom/google/crypto/tink/shaded/protobuf/O;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->o()Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p()Lcom/google/crypto/tink/shaded/protobuf/x$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public y(Lp3/C$c;)Lp3/C$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x$a;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 5
    .line 6
    check-cast v0, Lp3/C;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lp3/C;->W(Lp3/C;Lp3/C$c;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public z(I)Lp3/C$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x$a;->p:Lcom/google/crypto/tink/shaded/protobuf/x;

    .line 2
    .line 3
    check-cast v0, Lp3/C;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lp3/C;->Z(I)Lp3/C$c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

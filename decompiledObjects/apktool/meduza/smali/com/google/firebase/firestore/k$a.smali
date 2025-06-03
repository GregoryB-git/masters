.class public final Lcom/google/firebase/firestore/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lcom/google/firebase/firestore/j;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lj9/g;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lcom/google/firebase/firestore/k;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/k;Lt8/e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/firestore/k$a;->b:Lcom/google/firebase/firestore/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/firebase/firestore/k$a;->a:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/k$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/firebase/firestore/k$a;->b:Lcom/google/firebase/firestore/k;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/firestore/k$a;->a:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    move-object v5, v1

    .line 10
    check-cast v5, Lj9/g;

    .line 11
    .line 12
    iget-object v3, v0, Lcom/google/firebase/firestore/k;->c:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/google/firebase/firestore/k;->b:Lg9/s0;

    .line 15
    .line 16
    iget-boolean v6, v0, Lg9/s0;->e:Z

    .line 17
    .line 18
    iget-object v0, v0, Lg9/s0;->f:Lt8/e;

    .line 19
    .line 20
    invoke-interface {v5}, Lj9/g;->getKey()Lj9/i;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lt8/e;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    new-instance v0, Lcom/google/firebase/firestore/j;

    .line 29
    .line 30
    invoke-interface {v5}, Lj9/g;->getKey()Lj9/i;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    move-object v2, v0

    .line 35
    invoke-direct/range {v2 .. v7}, Lcom/google/firebase/firestore/j;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lj9/i;Lj9/g;ZZ)V

    .line 36
    .line 37
    .line 38
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "QuerySnapshot does not support remove()."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

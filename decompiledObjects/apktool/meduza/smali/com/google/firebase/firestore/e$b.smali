.class public final Lcom/google/firebase/firestore/e$b;
.super Lcom/google/firebase/firestore/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ld9/n;

.field public final b:Lg9/l$a;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld9/n;Lg9/l$a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/e;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/e$b;->a:Ld9/n;

    iput-object p2, p0, Lcom/google/firebase/firestore/e$b;->b:Lg9/l$a;

    iput-object p3, p0, Lcom/google/firebase/firestore/e$b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lcom/google/firebase/firestore/e$b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/e$b;

    iget-object v2, p0, Lcom/google/firebase/firestore/e$b;->b:Lg9/l$a;

    iget-object v3, p1, Lcom/google/firebase/firestore/e$b;->b:Lg9/l$a;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/google/firebase/firestore/e$b;->a:Ld9/n;

    iget-object v3, p1, Lcom/google/firebase/firestore/e$b;->a:Ld9/n;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/firebase/firestore/e$b;->c:Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/firebase/firestore/e$b;->c:Ljava/lang/Object;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/firestore/e$b;->a:Ld9/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld9/n;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/firebase/firestore/e$b;->b:Lg9/l$a;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/firebase/firestore/e$b;->c:Ljava/lang/Object;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

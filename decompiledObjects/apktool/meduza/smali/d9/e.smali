.class public final Ld9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld9/e$a;
    }
.end annotation


# instance fields
.field public final a:Ld9/e$a;

.field public final b:Lcom/google/firebase/firestore/j;

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/j;Ld9/e$a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld9/e;->a:Ld9/e$a;

    iput-object p1, p0, Ld9/e;->b:Lcom/google/firebase/firestore/j;

    iput p3, p0, Ld9/e;->c:I

    iput p4, p0, Ld9/e;->d:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ld9/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ld9/e;

    iget-object v0, p0, Ld9/e;->a:Ld9/e$a;

    iget-object v2, p1, Ld9/e;->a:Ld9/e$a;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld9/e;->b:Lcom/google/firebase/firestore/j;

    iget-object v2, p1, Ld9/e;->b:Lcom/google/firebase/firestore/j;

    invoke-virtual {v0, v2}, Lcom/google/firebase/firestore/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ld9/e;->c:I

    iget v2, p1, Ld9/e;->c:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Ld9/e;->d:I

    iget p1, p1, Ld9/e;->d:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ld9/e;->a:Ld9/e$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ld9/e;->b:Lcom/google/firebase/firestore/j;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/d;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ld9/e;->c:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ld9/e;->d:I

    add-int/2addr v1, v0

    return v1
.end method

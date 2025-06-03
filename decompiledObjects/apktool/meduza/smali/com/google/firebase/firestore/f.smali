.class public final Lcom/google/firebase/firestore/f;
.super Lu7/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/f$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/firebase/firestore/f$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;)V
    .locals 2

    invoke-direct {p0, p1}, Lu7/h;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    sget-object p1, Lcom/google/firebase/firestore/f$a;->b:Lcom/google/firebase/firestore/f$a;

    const/4 v0, 0x0

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "A FirebaseFirestoreException should never be thrown for OK"

    invoke-static {v1, p1, v0}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/firebase/firestore/f;->a:Lcom/google/firebase/firestore/f$a;

    return-void

    .line 1
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Provided message must not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/firestore/f$a;Ljava/lang/Exception;)V
    .locals 1

    invoke-direct {p0, p1, p3}, Lu7/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p1, :cond_2

    sget-object p1, Lcom/google/firebase/firestore/f$a;->b:Lcom/google/firebase/firestore/f$a;

    const/4 p3, 0x0

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    new-array p3, p3, [Ljava/lang/Object;

    const-string v0, "A FirebaseFirestoreException should never be thrown for OK"

    invoke-static {v0, p1, p3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    if-eqz p2, :cond_1

    iput-object p2, p0, Lcom/google/firebase/firestore/f;->a:Lcom/google/firebase/firestore/f$a;

    return-void

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Provided code must not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Provided message must not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

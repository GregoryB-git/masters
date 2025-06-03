.class public final Lcom/google/firebase/firestore/j;
.super Lcom/google/firebase/firestore/d;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lj9/i;Lj9/g;ZZ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/firebase/firestore/d;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lj9/i;Lj9/g;ZZ)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/firestore/d$a;)Ljava/util/HashMap;
    .locals 3

    if-eqz p1, :cond_1

    invoke-super {p0, p1}, Lcom/google/firebase/firestore/d;->a(Lcom/google/firebase/firestore/d$a;)Ljava/util/HashMap;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Data in a QueryDocumentSnapshot should be non-null"

    invoke-static {v2, v1, v0}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Provided serverTimestampBehavior value must not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/google/firebase/firestore/d;->b()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Data in a QueryDocumentSnapshot should be non-null"

    invoke-static {v3, v2, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    return-object v0
.end method

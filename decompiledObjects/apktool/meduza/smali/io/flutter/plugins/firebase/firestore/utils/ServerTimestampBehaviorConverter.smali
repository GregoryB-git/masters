.class public Lio/flutter/plugins/firebase/firestore/utils/ServerTimestampBehaviorConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static toServerTimestampBehavior(Ljava/lang/String;)Lcom/google/firebase/firestore/d$a;
    .locals 5

    sget-object v0, Lcom/google/firebase/firestore/d$a;->a:Lcom/google/firebase/firestore/d$a;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x74cfdad8

    const/4 v4, 0x1

    if-eq v2, v3, :cond_3

    const v3, -0x4bec4509

    if-eq v2, v3, :cond_2

    const v3, 0x33af38

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "none"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 v1, 0x2

    goto :goto_0

    :cond_2
    const-string v2, "previous"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    move v1, v4

    goto :goto_0

    :cond_3
    const-string v2, "estimate"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 v1, 0x0

    :cond_4
    :goto_0
    if-eqz v1, :cond_6

    if-eq v1, v4, :cond_5

    return-object v0

    :cond_5
    sget-object p0, Lcom/google/firebase/firestore/d$a;->c:Lcom/google/firebase/firestore/d$a;

    return-object p0

    :cond_6
    sget-object p0, Lcom/google/firebase/firestore/d$a;->b:Lcom/google/firebase/firestore/d$a;

    return-object p0
.end method

.class public final Lub/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lub/h;Lub/h;)Lub/h;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lub/i;->a:Lub/i;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lub/g;

    invoke-direct {v0}, Lub/g;-><init>()V

    invoke-interface {p1, p0, v0}, Lub/h;->fold(Ljava/lang/Object;Ldc/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lub/h;

    :goto_0
    return-object p0
.end method

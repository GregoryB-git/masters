.class public final Lub/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/h$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lub/h$b;Lub/h$c;)Lub/h$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lub/h$b;",
            ">(",
            "Lub/h$b;",
            "Lub/h$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lub/h$b;->getKey()Lub/h$c;

    move-result-object v0

    invoke-static {v0, p1}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static b(Lub/h$b;Lub/h$c;)Lub/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h$b;",
            "Lub/h$c<",
            "*>;)",
            "Lub/h;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lub/h$b;->getKey()Lub/h$c;

    move-result-object v0

    invoke-static {v0, p1}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, Lub/i;->a:Lub/i;

    :cond_0
    return-object p0
.end method

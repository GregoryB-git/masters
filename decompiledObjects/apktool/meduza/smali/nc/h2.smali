.class public final Lnc/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/h$b;
.implements Lub/h$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lub/h$b;",
        "Lub/h$c<",
        "Lnc/h2;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lnc/h2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnc/h2;

    invoke-direct {v0}, Lnc/h2;-><init>()V

    sput-object v0, Lnc/h2;->a:Lnc/h2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Ldc/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Ldc/p<",
            "-TR;-",
            "Lub/h$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, p0}, Ldc/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lub/h$c;)Lub/h$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lub/h$b;",
            ">(",
            "Lub/h$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lub/h$b$a;->a(Lub/h$b;Lub/h$c;)Lub/h$b;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lub/h$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lub/h$c<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public final minusKey(Lub/h$c;)Lub/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h$c<",
            "*>;)",
            "Lub/h;"
        }
    .end annotation

    invoke-static {p0, p1}, Lub/h$b$a;->b(Lub/h$b;Lub/h$c;)Lub/h;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lub/h;)Lub/h;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lub/h$a;->a(Lub/h;Lub/h;)Lub/h;

    move-result-object p1

    return-object p1
.end method

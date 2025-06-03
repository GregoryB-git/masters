.class public final Lka/u$a;
.super Lma/w$a;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w$a<",
        "Lka/u;",
        "Lka/u$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lka/u;->F()Lka/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lma/w$a;-><init>(Lma/w;)V

    return-void
.end method


# virtual methods
.method public final p(Lka/d0;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lma/w$a;->m()V

    iget-object v0, p0, Lma/w$a;->b:Lma/w;

    check-cast v0, Lka/u;

    invoke-static {v0}, Lka/u;->G(Lka/u;)Lma/m0;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lma/m0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

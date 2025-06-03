.class public final Lka/b$a;
.super Lma/w$a;
.source "SourceFile"

# interfaces
.implements Lka/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w$a<",
        "Lka/b;",
        "Lka/b$a;",
        ">;",
        "Lka/c;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lka/b;->F()Lka/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lma/w$a;-><init>(Lma/w;)V

    return-void
.end method


# virtual methods
.method public final h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lka/d0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lma/w$a;->b:Lma/w;

    check-cast v0, Lka/b;

    invoke-virtual {v0}, Lka/b;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

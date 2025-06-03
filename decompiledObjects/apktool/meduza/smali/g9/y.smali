.class public final Lg9/y;
.super Lg9/l;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lj9/l;Lka/d0;)V
    .locals 1

    sget-object v0, Lg9/l$a;->s:Lg9/l$a;

    invoke-direct {p0, p1, v0, p2}, Lg9/l;-><init>(Lj9/l;Lg9/l$a;Lka/d0;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg9/y;->d:Ljava/util/ArrayList;

    invoke-static {v0, p2}, Lg9/x;->h(Lg9/l$a;Lka/d0;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public final d(Lj9/g;)Z
    .locals 1

    iget-object v0, p0, Lg9/y;->d:Ljava/util/ArrayList;

    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

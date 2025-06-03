.class public final Lnb/l;
.super Leb/l0;
.source "SourceFile"


# static fields
.field public static final synthetic b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/l0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$e;)Leb/k0;
    .locals 1

    new-instance v0, Lnb/k;

    invoke-direct {v0, p1}, Lnb/k;-><init>(Leb/k0$e;)V

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "round_robin"

    return-object v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e(Ljava/util/Map;)Leb/u0$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Leb/u0$b;"
        }
    .end annotation

    new-instance p1, Leb/u0$b;

    const-string v0, "no service config"

    invoke-direct {p1, v0}, Leb/u0$b;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.class public final Lgb/i$b;
.super Leb/k0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Leb/k0$j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$g;)Leb/k0$f;
    .locals 0

    sget-object p1, Leb/k0$f;->e:Leb/k0$f;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-class v0, Lgb/i$b;

    invoke-static {v0}, Ln7/g;->a(Ljava/lang/Class;)Ln7/g$a;

    move-result-object v0

    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

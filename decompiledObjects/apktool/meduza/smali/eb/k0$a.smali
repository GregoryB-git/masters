.class public final Leb/k0$a;
.super Leb/k0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
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

    const-string v0, "EMPTY_PICKER"

    return-object v0
.end method

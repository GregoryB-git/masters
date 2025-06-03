.class public final La2/f$a;
.super La2/f$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La2/f$e;-><init>()V

    return-void
.end method

.method public constructor <init>(La2/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, La2/f$e;-><init>(La2/f$e;)V

    return-void
.end method
